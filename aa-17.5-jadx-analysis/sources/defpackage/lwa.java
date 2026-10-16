package defpackage;

/* loaded from: classes.dex */
public final class lwa {
    public static final yph a = yph.c("GH.CarExtenderParser");
    public final String b;
    public final yib c;
    private final boolean d;

    public lwa(yib yibVar, String str, boolean z) {
        this.c = yibVar;
        this.b = str;
        this.d = z;
    }

    public final int a() {
        return this.c.a;
    }

    public final void b(yyw yywVar, String str) {
        if (this.d) {
            ebf.j().z(yyv.SI_CREATION_FAILED, str, yywVar);
            lxr.e();
            lxr.i(yzz.MESSAGING_PARSING, yzy.no, str);
        }
    }

    public final boolean c() {
        return this.c.a != 0;
    }
}
