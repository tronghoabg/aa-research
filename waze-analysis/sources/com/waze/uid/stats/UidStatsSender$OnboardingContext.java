package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class UidStatsSender$OnboardingContext {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ UidStatsSender$OnboardingContext[] $VALUES;
    public static final UidStatsSender$OnboardingContext WAZE_ONBOARDING = new UidStatsSender$OnboardingContext("WAZE_ONBOARDING", 0);
    public static final UidStatsSender$OnboardingContext LOGIN_CONTEXT = new UidStatsSender$OnboardingContext("LOGIN_CONTEXT", 1);
    public static final UidStatsSender$OnboardingContext PRIMARY = new UidStatsSender$OnboardingContext("PRIMARY", 2);
    public static final UidStatsSender$OnboardingContext SETTINGS = new UidStatsSender$OnboardingContext("SETTINGS", 3);

    private static final /* synthetic */ UidStatsSender$OnboardingContext[] $values() {
        return new UidStatsSender$OnboardingContext[]{WAZE_ONBOARDING, LOGIN_CONTEXT, PRIMARY, SETTINGS};
    }

    static {
        UidStatsSender$OnboardingContext[] uidStatsSender$OnboardingContextArr$values = $values();
        $VALUES = uidStatsSender$OnboardingContextArr$values;
        $ENTRIES = h.d.b.a(uidStatsSender$OnboardingContextArr$values);
    }

    private UidStatsSender$OnboardingContext(String str, int i2) {
    }

    public static h.d.a<UidStatsSender$OnboardingContext> getEntries() {
        return $ENTRIES;
    }

    public static UidStatsSender$OnboardingContext valueOf(String str) {
        return (UidStatsSender$OnboardingContext) Enum.valueOf(UidStatsSender$OnboardingContext.class, str);
    }

    public static UidStatsSender$OnboardingContext[] values() {
        return (UidStatsSender$OnboardingContext[]) $VALUES.clone();
    }
}
