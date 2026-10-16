package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class akfw extends defpackage.akfv {
    protected final int d;

    protected akfw(defpackage.akdh akdhVar, int i, boolean z, int i2) {
        super(akdhVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.akgn
    public final int b() {
        return this.b;
    }

    @Override // defpackage.akgn
    public final void d(java.lang.Appendable appendable, long j, defpackage.akdd akddVar, int i, defpackage.akdl akdlVar, java.util.Locale locale) throws java.io.IOException {
        try {
            defpackage.akgj.b(appendable, this.a.a(akddVar).a(j), this.d);
        } catch (java.lang.RuntimeException unused) {
            defpackage.akge.b(appendable, this.d);
        }
    }
}
