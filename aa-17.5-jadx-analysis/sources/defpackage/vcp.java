package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class vcp {
    public float b;
    public float c;
    public float d;
    public boolean e = true;
    protected float f;
    protected float g;

    public vcp(float f) {
        this.f = f;
        this.g = (float) (Math.sqrt(f) * 1.7999999523162842d);
    }

    protected float a() {
        return this.b - this.c;
    }

    public void b(float f) {
        if (f != this.b) {
            this.b = f;
            this.e = false;
        }
    }

    protected void c(float f, float f2) {
        float f3 = this.d + (f * f2);
        this.d = f3;
        this.c += f3 * f2;
    }

    public final void d(float f) {
        this.c = f;
        this.b = f;
        this.d = BitmapDescriptorFactory.HUE_RED;
        this.e = true;
    }

    public final void e(long j) {
        if (this.e) {
            return;
        }
        c((this.f * a()) - (this.g * this.d), Math.min(j, 50L) / 1000.0f);
        float fAbs = Math.abs(a());
        float fAbs2 = Math.abs(this.d);
        boolean z = false;
        if (fAbs < 0.001f && fAbs2 < 0.001f) {
            z = true;
        }
        this.e = z;
        if (z) {
            this.c = this.b;
            this.d = BitmapDescriptorFactory.HUE_RED;
        }
    }
}
