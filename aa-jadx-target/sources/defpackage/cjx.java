package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjx extends defpackage.cke {
    public final int a;
    private final long c;

    public cjx(long j, int i) {
        android.graphics.ColorFilter porterDuffColorFilter;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            float[] fArr = defpackage.clr.a;
            porterDuffColorFilter = new android.graphics.BlendModeColorFilter((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32), defpackage.bzo.w(i));
        } else {
            float[] fArr2 = defpackage.clr.a;
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter((int) (defpackage.ckd.e(j, defpackage.clr.e) >>> 32), defpackage.bzo.x(i));
        }
        super(porterDuffColorFilter);
        this.c = j;
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cjx)) {
            return false;
        }
        defpackage.cjx cjxVar = (defpackage.cjx) obj;
        return this.c == cjxVar.c && this.a == cjxVar.a;
    }

    public final int hashCode() {
        long j = this.c;
        return (((int) (j ^ (j >>> 32))) * 31) + this.a;
    }

    public final java.lang.String toString() {
        return "BlendModeColorFilter(color=" + defpackage.ckd.g(this.c) + ", blendMode=" + defpackage.cjw.a(this.a) + ")";
    }
}
