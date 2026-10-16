package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class fss {
    public final aitu a;
    public final aitu b;
    public final aitu c;
    public final aitu d;
    public final ftr e;
    public final Bitmap.Config f;
    public final fsr g;
    public final fsr h;
    public final fsr i;
    public final int j;
    private final boolean k;
    private final boolean l;
    private final Drawable m;
    private final Drawable n;
    private final Drawable o;

    public /* synthetic */ fss(byte[] bArr) {
        aitu aituVar = aium.a;
        aivr aivrVarI = ajct.a.i();
        ajdk ajdkVar = ajdk.a;
        ftr ftrVar = ftr.a;
        Bitmap.Config config = ftw.b;
        fsr fsrVar = fsr.a;
        aivrVarI.getClass();
        config.getClass();
        this.a = aivrVarI;
        this.b = ajdkVar;
        this.c = ajdkVar;
        this.d = ajdkVar;
        this.e = ftrVar;
        this.j = 3;
        this.f = config;
        this.k = true;
        this.l = false;
        this.m = null;
        this.n = null;
        this.o = null;
        this.g = fsrVar;
        this.h = fsrVar;
        this.i = fsrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fss)) {
            return false;
        }
        fss fssVar = (fss) obj;
        if (!affa.f(this.a, fssVar.a) || !affa.f(this.b, fssVar.b) || !affa.f(this.c, fssVar.c) || !affa.f(this.d, fssVar.d) || !affa.f(this.e, fssVar.e)) {
            return false;
        }
        int i = fssVar.j;
        if (this.f != fssVar.f) {
            return false;
        }
        boolean z = fssVar.k;
        boolean z2 = fssVar.l;
        Drawable drawable = fssVar.m;
        if (!affa.f(null, null)) {
            return false;
        }
        Drawable drawable2 = fssVar.n;
        if (!affa.f(null, null)) {
            return false;
        }
        Drawable drawable3 = fssVar.o;
        return affa.f(null, null) && this.g == fssVar.g && this.h == fssVar.h && this.i == fssVar.i;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 3) * 31) + this.f.hashCode()) * 31) + a.f(true)) * 31) + a.f(false)) * 923521) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public fss() {
        this(null);
    }
}
