package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bbj implements ctq {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final api e;
    public final int f;
    public final int g;
    public final int h;
    public final bav i;
    public final bav j;
    public final float k;
    public final int l;
    public final boolean m;
    public final art n;
    public final List o;
    public final List p;
    public final aitx q;
    public final dlg r;
    public final long s;
    private final ctq t;
    private final boolean u;

    public bbj(List list, int i, int i2, int i3, api apiVar, int i4, int i5, int i6, bav bavVar, bav bavVar2, float f, int i7, boolean z, art artVar, ctq ctqVar, boolean z2, List list2, List list3, aitx aitxVar, dlg dlgVar, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = apiVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = bavVar;
        this.j = bavVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = artVar;
        this.t = ctqVar;
        this.u = z2;
        this.o = list2;
        this.p = list3;
        this.q = aitxVar;
        this.r = dlgVar;
        this.s = j;
    }

    public final int a() {
        return -this.f;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.t.b();
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.t.c();
    }

    public final long d() {
        return (c() << 32) | (b() & 4294967295L);
    }

    public final bbj e(int i) {
        bav bavVar;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.u) {
            List list = this.a;
            if (!list.isEmpty() && (bavVar = this.i) != null && (i2 = this.l - i) >= 0 && i2 < (i5 = (i4 = this.b) + (i3 = this.c))) {
                float f = i;
                float f2 = this.k;
                bav bavVar2 = this.j;
                if (bavVar2 != null) {
                    float f3 = f2 - (f / i5);
                    if (f3 < 0.5f && f3 > -0.5f) {
                        bav bavVar3 = (bav) woy.bF(list);
                        bav bavVar4 = (bav) woy.bK(list);
                        if (i < 0) {
                            if (Math.min((bavVar3.h + i5) - this.f, (bavVar4.h + i5) - this.g) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(this.f - bavVar3.h, this.g - bavVar4.h) <= i) {
                            return null;
                        }
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((bav) list.get(i6)).a(i);
                        }
                        List list2 = this.o;
                        int size2 = list2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            ((bav) list2.get(i7)).a(i);
                        }
                        List list3 = this.p;
                        int size3 = list3.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            ((bav) list3.get(i8)).a(i);
                        }
                        return new bbj(list, i4, i3, this.d, this.e, this.f, this.g, this.h, bavVar, bavVar2, f3, i2, this.m || i > 0, this.n, this.t, false, list2, list3, this.q, this.r, this.s);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.t.f();
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.t.g();
    }

    @Override // defpackage.ctq
    public final void h() {
        this.t.h();
    }

    @Override // defpackage.ctq
    public final void i() {
        this.t.i();
    }

    @Override // defpackage.ctq
    public final void j() {
        this.t.j();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bbj(List list, int i, int i2, int i3, api apiVar, int i4, int i5, int i6, art artVar, ctq ctqVar, aitx aitxVar, dlg dlgVar, long j) {
        afbe afbeVar = afbe.a;
        this(list, i, i2, i3, apiVar, i4, i5, i6, null, null, BitmapDescriptorFactory.HUE_RED, 0, false, artVar, ctqVar, false, afbeVar, afbeVar, aitxVar, dlgVar, j);
    }
}
