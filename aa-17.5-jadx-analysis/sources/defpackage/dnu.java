package defpackage;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class dnu {
    public final int a;
    public final boolean b;
    public final int c;
    public final float d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final IBinder i;
    private final float j;

    public /* synthetic */ dnu(boolean z, boolean z2, int i, int i2) {
        int i3 = 1 != ((z ? 1 : 0) & ((i2 & 1) ^ 1)) ? 262152 : 262144;
        i3 = (z2 || (((i2 & 32) == 0) ^ true)) ? i3 : i3 | sk.AUDIO_CONTENT_BUFFER_SIZE;
        i = (i2 & 128) != 0 ? 1002 : i;
        this.a = i3;
        this.b = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = false;
        this.c = i;
        this.i = null;
        this.d = Float.NaN;
        this.j = Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnu)) {
            return false;
        }
        dnu dnuVar = (dnu) obj;
        if (this.a != dnuVar.a) {
            return false;
        }
        boolean z = dnuVar.b;
        boolean z2 = dnuVar.e;
        boolean z3 = dnuVar.f;
        boolean z4 = dnuVar.g;
        boolean z5 = dnuVar.h;
        if (this.c != dnuVar.c) {
            return false;
        }
        IBinder iBinder = dnuVar.i;
        if (!affa.f(null, null)) {
            return false;
        }
        float f = dnuVar.d;
        if (!dlj.c(Float.NaN, Float.NaN)) {
            return false;
        }
        float f2 = dnuVar.j;
        return Float.isNaN(Float.NaN) && Float.isNaN(Float.NaN);
    }

    public final int hashCode() {
        return (((((((((((((((this.a * 31) + a.f(true)) * 31) + a.f(true)) * 31) + a.f(true)) * 31) + a.f(true)) * 31) + a.f(false)) * 31) + this.c) * 961) + Float.floatToIntBits(Float.NaN)) * 31) + Float.floatToIntBits(Float.NaN);
    }

    public dnu() {
        throw null;
    }
}
