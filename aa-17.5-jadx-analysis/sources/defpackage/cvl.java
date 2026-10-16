package defpackage;

/* loaded from: classes.dex */
public final class cvl {
    public static final zh a;
    public static final cvj[] b;

    static {
        zh zhVar = new zh(8);
        int i = cvj.a;
        zhVar.g(1, cvi.f);
        zhVar.g(2, cvi.e);
        zhVar.g(4, cvi.a);
        zhVar.g(8, cvi.c);
        zhVar.g(16, cvi.g);
        zhVar.g(32, cvi.d);
        zhVar.g(64, cvi.h);
        zhVar.g(128, cvi.b);
        a = zhVar;
        b = new cvj[]{cvi.f, cvi.e, cvi.a, cvi.h, cvi.g, cvi.d, cvi.c, cvi.i, cvi.b};
    }

    public static final void a(cxi cxiVar, cuq cuqVar, long j, int i, int i2) {
        if (j == -1) {
            return;
        }
        cxiVar.o(cuqVar.c(), (int) (j >>> 48));
        cxiVar.o(cuqVar.b(), (int) ((j >>> 32) & 65535));
        cxiVar.o(cuqVar.d(), i - ((int) ((j >>> 16) & 65535)));
        cxiVar.o(cuqVar.a(), i2 - ((int) (j & 65535)));
    }
}
