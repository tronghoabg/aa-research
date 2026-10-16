package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wig {
    public static final wig a;
    public static final wig b;
    public static final wig c;
    public static final wig d;
    private static final /* synthetic */ wig[] e;

    static {
        wig wigVar = new wig("LEFT", 0);
        a = wigVar;
        wig wigVar2 = new wig("RIGHT", 1);
        b = wigVar2;
        wig wigVar3 = new wig("TOP", 2);
        c = wigVar3;
        wig wigVar4 = new wig("BOTTOM", 3);
        d = wigVar4;
        wig[] wigVarArr = {wigVar, wigVar2, wigVar3, wigVar4};
        e = wigVarArr;
        affa.p(wigVarArr);
    }

    public static wig valueOf(String str) {
        return (wig) Enum.valueOf(wig.class, str);
    }

    public static wig[] values() {
        return (wig[]) e.clone();
    }
}
