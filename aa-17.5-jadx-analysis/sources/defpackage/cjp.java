package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class cjp extends cjw {
    public final int a;
    private final long c;

    public cjp(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            float[] fArr = clj.a;
            porterDuffColorFilter = new BlendModeColorFilter((int) (cjv.e(j, clj.e) >>> 32), byx.y(i));
        } else {
            float[] fArr2 = clj.a;
            porterDuffColorFilter = new PorterDuffColorFilter((int) (cjv.e(j, clj.e) >>> 32), byx.z(i));
        }
        super(porterDuffColorFilter);
        this.c = j;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjp)) {
            return false;
        }
        cjp cjpVar = (cjp) obj;
        return this.c == cjpVar.c && this.a == cjpVar.a;
    }

    public final int hashCode() {
        long j = this.c;
        return (((int) (j ^ (j >>> 32))) * 31) + this.a;
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + cjv.g(this.c) + ", blendMode=" + cjo.a(this.a) + ")";
    }
}
