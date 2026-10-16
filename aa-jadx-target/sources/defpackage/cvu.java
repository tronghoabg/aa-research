package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvu {
    public static final defpackage.zo a;
    public static final defpackage.cvs[] b;

    static {
        defpackage.zo zoVar = new defpackage.zo(8);
        int i = defpackage.cvs.a;
        zoVar.g(1, defpackage.cvr.f);
        zoVar.g(2, defpackage.cvr.e);
        zoVar.g(4, defpackage.cvr.a);
        zoVar.g(8, defpackage.cvr.c);
        zoVar.g(16, defpackage.cvr.g);
        zoVar.g(32, defpackage.cvr.d);
        zoVar.g(64, defpackage.cvr.h);
        zoVar.g(128, defpackage.cvr.b);
        a = zoVar;
        b = new defpackage.cvs[]{defpackage.cvr.f, defpackage.cvr.e, defpackage.cvr.a, defpackage.cvr.h, defpackage.cvr.g, defpackage.cvr.d, defpackage.cvr.c, defpackage.cvr.i, defpackage.cvr.b};
    }

    public static final void a(defpackage.cxs cxsVar, defpackage.cuz cuzVar, long j, int i, int i2) {
        if (j == -1) {
            return;
        }
        cxsVar.o(cuzVar.c(), (int) (j >>> 48));
        cxsVar.o(cuzVar.b(), (int) ((j >>> 32) & 65535));
        cxsVar.o(cuzVar.d(), i - ((int) ((j >>> 16) & 65535)));
        cxsVar.o(cuzVar.a(), i2 - ((int) (j & 65535)));
    }
}
