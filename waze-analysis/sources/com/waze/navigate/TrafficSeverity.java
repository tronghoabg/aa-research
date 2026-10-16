package com.waze.navigate;

import com.waze.jni.protos.navigate.TrafficJamSection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TrafficSeverity {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ TrafficSeverity[] $VALUES;
    private final int level;
    public static final TrafficSeverity Light = new TrafficSeverity("Light", 0, TrafficJamSection.Severity.SeverityLight.getNumber());
    public static final TrafficSeverity Moderate = new TrafficSeverity("Moderate", 1, TrafficJamSection.Severity.SeverityModerate.getNumber());
    public static final TrafficSeverity Heavy = new TrafficSeverity("Heavy", 2, TrafficJamSection.Severity.SeverityHeavy.getNumber());
    public static final TrafficSeverity StandStill = new TrafficSeverity("StandStill", 3, TrafficJamSection.Severity.SeverityStandStill.getNumber());
    public static final TrafficSeverity ClosedRoad = new TrafficSeverity("ClosedRoad", 4, TrafficJamSection.Severity.SeverityClosedRoad.getNumber());

    private static final /* synthetic */ TrafficSeverity[] $values() {
        return new TrafficSeverity[]{Light, Moderate, Heavy, StandStill, ClosedRoad};
    }

    static {
        TrafficSeverity[] trafficSeverityArr$values = $values();
        $VALUES = trafficSeverityArr$values;
        $ENTRIES = h.d.b.a(trafficSeverityArr$values);
    }

    private TrafficSeverity(String str, int i2, int i3) {
        this.level = i3;
    }

    public static h.d.a<TrafficSeverity> getEntries() {
        return $ENTRIES;
    }

    public static TrafficSeverity valueOf(String str) {
        return (TrafficSeverity) Enum.valueOf(TrafficSeverity.class, str);
    }

    public static TrafficSeverity[] values() {
        return (TrafficSeverity[]) $VALUES.clone();
    }

    public final int getLevel() {
        return this.level;
    }
}
