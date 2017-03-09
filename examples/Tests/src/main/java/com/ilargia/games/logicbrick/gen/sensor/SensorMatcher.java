package com.ilargia.games.logicbrick.gen.sensor;

import com.ilargia.games.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class SensorMatcher {

	private static Matcher _matcherAlwaysSensor;
	private static Matcher _matcherCollisionSensor;
	private static Matcher _matcherDelaySensor;
	private static Matcher _matcherFrequency;
	private static Matcher _matcherMode;
	private static Matcher _matcherSignal;

	public static Matcher AlwaysSensor() {
		if (_matcherAlwaysSensor == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SensorComponentsLookup.AlwaysSensor);
			matcher.componentNames = SensorComponentsLookup.componentNames();
			_matcherAlwaysSensor = matcher;
		}
		return _matcherAlwaysSensor;
	}

	public static Matcher CollisionSensor() {
		if (_matcherCollisionSensor == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SensorComponentsLookup.CollisionSensor);
			matcher.componentNames = SensorComponentsLookup.componentNames();
			_matcherCollisionSensor = matcher;
		}
		return _matcherCollisionSensor;
	}

	public static Matcher DelaySensor() {
		if (_matcherDelaySensor == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SensorComponentsLookup.DelaySensor);
			matcher.componentNames = SensorComponentsLookup.componentNames();
			_matcherDelaySensor = matcher;
		}
		return _matcherDelaySensor;
	}

	public static Matcher Frequency() {
		if (_matcherFrequency == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SensorComponentsLookup.Frequency);
			matcher.componentNames = SensorComponentsLookup.componentNames();
			_matcherFrequency = matcher;
		}
		return _matcherFrequency;
	}

	public static Matcher Mode() {
		if (_matcherMode == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SensorComponentsLookup.Mode);
			matcher.componentNames = SensorComponentsLookup.componentNames();
			_matcherMode = matcher;
		}
		return _matcherMode;
	}

	public static Matcher Signal() {
		if (_matcherSignal == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SensorComponentsLookup.Signal);
			matcher.componentNames = SensorComponentsLookup.componentNames();
			_matcherSignal = matcher;
		}
		return _matcherSignal;
	}
}