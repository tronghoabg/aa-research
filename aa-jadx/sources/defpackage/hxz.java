package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hxz implements defpackage.hxx {
    int a;
    public android.graphics.Bitmap.Config b;
    private final defpackage.hya c;

    public hxz(defpackage.hya hyaVar) {
        this.c = hyaVar;
    }

    @Override // defpackage.hxx
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.hxz) {
            defpackage.hxz hxzVar = (defpackage.hxz) obj;
            if (this.a == hxzVar.a) {
                android.graphics.Bitmap.Config config = this.b;
                android.graphics.Bitmap.Config config2 = hxzVar.b;
                char[] cArr = defpackage.igg.a;
                if (defpackage.a.an(config, config2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        android.graphics.Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return defpackage.hyb.c(this.a, this.b);
    }
}
