package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class clb extends defpackage.cka {
    private long a = 9205357640488583168L;
    private defpackage.us b;

    @Override // defpackage.cka
    public final void a(long j, defpackage.cjs cjsVar, float f) {
        defpackage.us usVar = this.b;
        if (usVar == null || this.a != j) {
            if (defpackage.cjl.d(j)) {
                this.b = null;
                this.a = 9205357640488583168L;
                usVar = null;
            } else {
                usVar = this.b;
                if (usVar == null) {
                    usVar = new defpackage.us();
                    this.b = usVar;
                }
                usVar.a = b(j);
                this.b = usVar;
                this.a = j;
            }
        }
        if (cjsVar.g() != -72057594037927936L) {
            cjsVar.j(-72057594037927936L);
        }
        if (!defpackage.afga.f(cjsVar.c, usVar != null ? usVar.a : null)) {
            cjsVar.m((android.graphics.Shader) (usVar != null ? usVar.a : null));
        }
        if (cjsVar.a() == f) {
            return;
        }
        cjsVar.h(f);
    }

    public abstract android.graphics.Shader b(long j);
}
