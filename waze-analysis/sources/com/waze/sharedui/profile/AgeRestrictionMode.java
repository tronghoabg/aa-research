package com.waze.sharedui.profile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class AgeRestrictionMode {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ AgeRestrictionMode[] $VALUES;
    public static final AgeRestrictionMode INVALID = new AgeRestrictionMode("INVALID", 0);
    public static final AgeRestrictionMode CHECK = new AgeRestrictionMode("CHECK", 1);
    public static final AgeRestrictionMode RESTRICTED = new AgeRestrictionMode("RESTRICTED", 2);
    public static final AgeRestrictionMode UNRESTRICTED = new AgeRestrictionMode("UNRESTRICTED", 3);

    private static final /* synthetic */ AgeRestrictionMode[] $values() {
        return new AgeRestrictionMode[]{INVALID, CHECK, RESTRICTED, UNRESTRICTED};
    }

    static {
        AgeRestrictionMode[] ageRestrictionModeArr$values = $values();
        $VALUES = ageRestrictionModeArr$values;
        $ENTRIES = h.d.b.a(ageRestrictionModeArr$values);
    }

    private AgeRestrictionMode(String str, int i2) {
    }

    public static h.d.a<AgeRestrictionMode> getEntries() {
        return $ENTRIES;
    }

    public static AgeRestrictionMode valueOf(String str) {
        return (AgeRestrictionMode) Enum.valueOf(AgeRestrictionMode.class, str);
    }

    public static AgeRestrictionMode[] values() {
        return (AgeRestrictionMode[]) $VALUES.clone();
    }
}
