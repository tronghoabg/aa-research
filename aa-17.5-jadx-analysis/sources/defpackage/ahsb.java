package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahsb {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahsb[] $VALUES;
    public static final ahsb RENDER_OVERRIDE = new ahsb("RENDER_OVERRIDE", 0);
    public static final ahsb RENDER_OPEN = new ahsb("RENDER_OPEN", 1);
    public static final ahsb RENDER_OPEN_OVERRIDE = new ahsb("RENDER_OPEN_OVERRIDE", 2);

    private static final /* synthetic */ ahsb[] $values() {
        return new ahsb[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        ahsb[] ahsbVarArr$values = $values();
        $VALUES = ahsbVarArr$values;
        $ENTRIES = affa.p(ahsbVarArr$values);
    }

    private ahsb(String str, int i) {
    }

    public static ahsb valueOf(String str) {
        return (ahsb) Enum.valueOf(ahsb.class, str);
    }

    public static ahsb[] values() {
        return (ahsb[]) $VALUES.clone();
    }
}
