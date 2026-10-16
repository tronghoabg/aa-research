package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ailq {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ailq[] $VALUES;
    public static final ailq FOR_SUBTYPING = new ailq("FOR_SUBTYPING", 0);
    public static final ailq FOR_INCORPORATION = new ailq("FOR_INCORPORATION", 1);
    public static final ailq FROM_EXPRESSION = new ailq("FROM_EXPRESSION", 2);

    private static final /* synthetic */ ailq[] $values() {
        return new ailq[]{FOR_SUBTYPING, FOR_INCORPORATION, FROM_EXPRESSION};
    }

    static {
        ailq[] ailqVarArr$values = $values();
        $VALUES = ailqVarArr$values;
        $ENTRIES = affa.p(ailqVarArr$values);
    }

    private ailq(String str, int i) {
    }

    public static ailq valueOf(String str) {
        return (ailq) Enum.valueOf(ailq.class, str);
    }

    public static ailq[] values() {
        return (ailq[]) $VALUES.clone();
    }
}
