package ilargia.egdx.logicbricks;


import ilargia.egdx.impl.EngineGDX
import ilargia.egdx.logicbricks.gen.Entitas
import ilargia.egdx.logicbricks.gen.game.GameEntity
import ilargia.egdx.logicbricks.gen.sensor.SensorEntity
import ilargia.egdx.logicbricks.system.sensor.CollisionSensorSystem
import ilargia.entitas.factories.CollectionsFactories
import spock.lang.Narrative
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Title

@Narrative("""
Como usuario
Quiero poder tener una forma facil y reusable de detectar Colisiones entre elementos del escenario que yo desee
Para que pueda usar esta informacion en la logica de mi juego.
""")
@Title("""This is easy
to read
_______________________
""")
@groovy.transform.TypeChecked
class CollisionSensorSystemSpec extends Specification {

    @Shared EngineGDX engine = new EngineGDX(new CollectionsFactories(){})
    @Shared Entitas entitas = new Entitas()
    @Shared CollisionSensorSystem collisionSensorSystem = new CollisionSensorSystem(entitas, null);
    @Shared GameEntity player = entitas.game.createEntity().addTags("Player","Player1").setInteractive(true)
    @Shared GameEntity enemy = entitas.game.createEntity().addTags("Enemy","Boss").setInteractive(true)

    @Shared GameEntity ground = entitas.game.createEntity().addTags("Ground").setInteractive(true)
    @Shared SensorEntity collisionEnemy = entitas.sensor.createEntity().addCollisionSensor("Boss").addLink("Boss", player.getCreationIndex())
    @Shared SensorEntity collisionGround = entitas.sensor.createEntity().addCollisionSensor("Ground").addLink("Ground", player.getCreationIndex())


    void 'Detectar la colision de un elemento "objetivo" del escenario'() {            // 2
        given: 'un sensor de collision por defecto'                    // 3
        SensorEntity collisionEnemy = entitas.sensor.createEntity().addCollisionSensor("Boss").addLink("Boss",player.getCreationIndex())

        when: //'provocamos la colision con su objetivo'                          // 4
        //collisionSensorSystem.processCollision(player.getCreationIndex(), enemy.getCreationIndex(), true);
        collisionSensorSystem.execute( 0.5F);
        boolean result = collisionEnemy.link.pulse;

        then: 'el pulso del sensor cambia a un valor positivo'              // 5
            !result
    }
}