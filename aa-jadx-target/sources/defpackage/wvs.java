package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wvs {

    @java.lang.Deprecated
    public float a;

    @java.lang.Deprecated
    public float b;

    @java.lang.Deprecated
    public float c;

    @java.lang.Deprecated
    public float d;

    @java.lang.Deprecated
    public float e;
    public boolean g;
    public final java.util.List f = new java.util.ArrayList();
    private final java.util.List h = new java.util.ArrayList();

    public wvs() {
        e(0.0f, 270.0f, 0.0f);
    }

    private final void f(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 <= 180.0f) {
            float f4 = this.b;
            float f5 = this.c;
            defpackage.wvo wvoVar = new defpackage.wvo(f4, f5, f4, f5);
            wvoVar.e = this.d;
            wvoVar.f = f3;
            this.h.add(new defpackage.wvm(wvoVar));
            this.d = f;
        }
    }

    final defpackage.wvr a(android.graphics.Matrix matrix) {
        f(this.e);
        return new defpackage.wvl(new java.util.ArrayList(this.h), new android.graphics.Matrix(matrix));
    }

    public final void b(defpackage.wvr wvrVar, float f, float f2) {
        f(f);
        this.h.add(wvrVar);
        this.d = f2;
    }

    public final void c(android.graphics.Matrix matrix, android.graphics.Path path) {
        java.util.List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.wvq) list.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        defpackage.wvp wvpVar = new defpackage.wvp();
        wvpVar.a = f;
        wvpVar.b = f2;
        this.f.add(wvpVar);
        defpackage.wvn wvnVar = new defpackage.wvn(wvpVar, this.b, this.c);
        b(wvnVar, wvnVar.b() + 270.0f, wvnVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.h.clear();
        this.g = false;
    }
}
