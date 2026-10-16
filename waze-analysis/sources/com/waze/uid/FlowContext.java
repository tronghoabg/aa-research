package com.waze.uid;

import com.waze.uid.stats.UidStatsSender$OnboardingContext;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class FlowContext {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ FlowContext[] $VALUES;
    private final UidStatsSender$OnboardingContext onboardingContext;
    public static final FlowContext OTHER = new FlowContext("OTHER", 0, null);
    public static final FlowContext SETTINGS = new FlowContext("SETTINGS", 1, UidStatsSender$OnboardingContext.SETTINGS);
    public static final FlowContext WAZE_ONBOARDING = new FlowContext("WAZE_ONBOARDING", 2, UidStatsSender$OnboardingContext.WAZE_ONBOARDING);
    public static final FlowContext LOGIN = new FlowContext("LOGIN", 3, UidStatsSender$OnboardingContext.LOGIN_CONTEXT);

    private static final /* synthetic */ FlowContext[] $values() {
        return new FlowContext[]{OTHER, SETTINGS, WAZE_ONBOARDING, LOGIN};
    }

    static {
        FlowContext[] flowContextArr$values = $values();
        $VALUES = flowContextArr$values;
        $ENTRIES = h.d.b.a(flowContextArr$values);
    }

    private FlowContext(String str, int i2, UidStatsSender$OnboardingContext uidStatsSender$OnboardingContext) {
        this.onboardingContext = uidStatsSender$OnboardingContext;
    }

    public static h.d.a<FlowContext> getEntries() {
        return $ENTRIES;
    }

    public static FlowContext valueOf(String str) {
        return (FlowContext) Enum.valueOf(FlowContext.class, str);
    }

    public static FlowContext[] values() {
        return (FlowContext[]) $VALUES.clone();
    }

    public final UidStatsSender$OnboardingContext getOnboardingContext() {
        return this.onboardingContext;
    }
}
