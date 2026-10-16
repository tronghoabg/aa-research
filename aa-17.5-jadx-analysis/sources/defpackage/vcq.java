package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class vcq {
    public final vco a;
    public final vcp b;
    public final vcp c;
    public final vcp d;
    public final vcp e;
    public final int f;
    public final vcp g;
    public final vcp h;
    public final vcp i;
    public final vcp j;

    public vcq(vcp vcpVar, vco vcoVar, vcp vcpVar2, vcp vcpVar3, vcp vcpVar4, vcp vcpVar5, vcp vcpVar6, vcp vcpVar7, vcp vcpVar8, int i) {
        this.g = vcpVar;
        this.a = vcoVar;
        this.h = vcpVar2;
        this.i = vcpVar3;
        this.j = vcpVar4;
        this.b = vcpVar5;
        this.c = vcpVar6;
        this.d = vcpVar7;
        this.e = vcpVar8;
        this.f = i;
    }

    public final float a() {
        return this.h.c;
    }

    public final float b() {
        return this.c.c;
    }

    public final void c(float f) {
        this.j.b(f);
    }

    public final void d(float f, float f2, float f3) {
        this.g.d(f);
        this.a.d(f2);
        this.c.d(f3);
        this.h.d(4.0f);
        this.i.d(BitmapDescriptorFactory.HUE_RED);
        this.j.d(BitmapDescriptorFactory.HUE_RED);
        this.d.d(BitmapDescriptorFactory.HUE_RED);
        this.b.d(BitmapDescriptorFactory.HUE_RED);
    }
}
