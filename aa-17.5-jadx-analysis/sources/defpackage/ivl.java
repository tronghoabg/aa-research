package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ivl {
    public static final ivl a;
    public static final ivl b;
    public static final ivl c;
    public static final ivl d;
    private static final /* synthetic */ ivl[] e;

    static {
        ivl ivlVar = new ivl("GAIN", 0);
        a = ivlVar;
        ivl ivlVar2 = new ivl("LOSS", 1);
        b = ivlVar2;
        ivl ivlVar3 = new ivl("LOSS_TRANSIENT", 2);
        c = ivlVar3;
        ivl ivlVar4 = new ivl("DISCONNECT", 3);
        d = ivlVar4;
        e = new ivl[]{ivlVar, ivlVar2, ivlVar3, ivlVar4};
    }

    public static ivl valueOf(String str) {
        return (ivl) Enum.valueOf(ivl.class, str);
    }

    public static ivl[] values() {
        return (ivl[]) e.clone();
    }
}
