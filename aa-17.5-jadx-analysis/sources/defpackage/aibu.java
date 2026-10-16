package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aibu {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aibu[] $VALUES;
    public static final aibu STABLE = new aibu("STABLE", 0);
    public static final aibu UNSTABLE = new aibu("UNSTABLE", 1);

    private static final /* synthetic */ aibu[] $values() {
        return new aibu[]{STABLE, UNSTABLE};
    }

    static {
        aibu[] aibuVarArr$values = $values();
        $VALUES = aibuVarArr$values;
        $ENTRIES = affa.p(aibuVarArr$values);
    }

    private aibu(String str, int i) {
    }

    public static aibu valueOf(String str) {
        return (aibu) Enum.valueOf(aibu.class, str);
    }

    public static aibu[] values() {
        return (aibu[]) $VALUES.clone();
    }
}
