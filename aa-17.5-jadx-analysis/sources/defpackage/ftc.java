package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* loaded from: classes2.dex */
public final class ftc {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final ftn d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final ajhv i;
    public final fth j;
    public final fte k;
    public final fsr l;
    public final fsr m;
    public final fsr n;
    public final int o;

    public ftc(Context context, Bitmap.Config config, ftn ftnVar, int i, boolean z, ajhv ajhvVar, fth fthVar, fte fteVar, fsr fsrVar, fsr fsrVar2, fsr fsrVar3) {
        config.getClass();
        if (i == 0) {
            throw null;
        }
        ajhvVar.getClass();
        this.a = context;
        this.b = config;
        this.c = null;
        this.d = ftnVar;
        this.o = i;
        this.e = z;
        this.f = false;
        this.g = true;
        this.h = null;
        this.i = ajhvVar;
        this.j = fthVar;
        this.k = fteVar;
        this.l = fsrVar;
        this.m = fsrVar2;
        this.n = fsrVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftc)) {
            return false;
        }
        ftc ftcVar = (ftc) obj;
        if (!affa.f(this.a, ftcVar.a) || this.b != ftcVar.b) {
            return false;
        }
        ColorSpace colorSpace = ftcVar.c;
        if (!affa.f(null, null) || !affa.f(this.d, ftcVar.d) || this.o != ftcVar.o || this.e != ftcVar.e) {
            return false;
        }
        boolean z = ftcVar.f;
        boolean z2 = ftcVar.g;
        String str = ftcVar.h;
        return affa.f(null, null) && affa.f(this.i, ftcVar.i) && affa.f(this.j, ftcVar.j) && affa.f(this.k, ftcVar.k) && this.l == ftcVar.l && this.m == ftcVar.m && this.n == ftcVar.n;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode()) * 31) + this.o) * 31) + a.f(this.e)) * 31) + a.f(false)) * 31) + a.f(true)) * 961) + ahdw.a(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }
}
