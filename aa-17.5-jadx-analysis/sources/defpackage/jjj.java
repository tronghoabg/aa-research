package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class jjj {
    public static final jjj a;
    public static final jjj b;
    public static final jjj c;
    public static final jjj d;
    public static final /* synthetic */ afdf e;
    private static final /* synthetic */ jjj[] i;
    public final String f;
    public final boolean g;
    public final boolean h;

    static {
        jjj jjjVar = new jjj("TOP_LEFT", 0, "TL", true, true);
        a = jjjVar;
        jjj jjjVar2 = new jjj("TOP_RIGHT", 1, "TR", false, true);
        b = jjjVar2;
        jjj jjjVar3 = new jjj("BOTTOM_LEFT", 2, "BL", true, false);
        c = jjjVar3;
        jjj jjjVar4 = new jjj("BOTTOM_RIGHT", 3, "BR", false, false);
        d = jjjVar4;
        jjj[] jjjVarArr = {jjjVar, jjjVar2, jjjVar3, jjjVar4};
        i = jjjVarArr;
        e = affa.p(jjjVarArr);
    }

    private jjj(String str, int i2, String str2, boolean z, boolean z2) {
        this.f = str2;
        this.g = z;
        this.h = z2;
    }

    public static jjj valueOf(String str) {
        return (jjj) Enum.valueOf(jjj.class, str);
    }

    public static jjj[] values() {
        return (jjj[]) i.clone();
    }
}
