package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class ari implements arr {
    final /* synthetic */ bbt a;
    final /* synthetic */ afeh b;

    public ari(bbt bbtVar, afeh afehVar) {
        this.a = bbtVar;
        this.b = afehVar;
    }

    @Override // defpackage.arr
    public final float a(float f, float f2) {
        bbt bbtVar = this.a;
        int iK = bbtVar.k() + bbtVar.m();
        if (iK != 0) {
            int i = f < BitmapDescriptorFactory.HUE_RED ? bbtVar.f + 1 : bbtVar.f;
            int iG = afpt.g(((int) (f2 / iK)) + i, 0, bbtVar.b());
            bbtVar.k();
            bbtVar.m();
            long j = i;
            long j2 = (-1) + j;
            if (j2 < 0) {
                j2 = 0;
            }
            long j3 = j + 1;
            if (j3 > 2147483647L) {
                j3 = 2147483647L;
            }
            int iAbs = Math.abs((afpt.g(afpt.g(iG, (int) j2, (int) j3), 0, bbtVar.b()) - i) * iK) - iK;
            int i2 = iAbs >= 0 ? iAbs : 0;
            if (i2 != 0) {
                return i2 * Math.signum(f);
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.arr
    public final float b(float f) {
        bbt bbtVar = this.a;
        art artVar = bbtVar.x().n;
        List list = c().a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            bav bavVar = (bav) list.get(i);
            afp.V(c());
            c().a();
            int i2 = c().d;
            int i3 = c().b;
            int i4 = bavVar.h;
            int i5 = bavVar.a;
            bbtVar.b();
            float f4 = i4 + BitmapDescriptorFactory.HUE_RED;
            if (f4 <= BitmapDescriptorFactory.HUE_RED && f4 > f3) {
                f3 = f4;
            }
            if (f4 >= BitmapDescriptorFactory.HUE_RED && f4 < f2) {
                f2 = f4;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!bbtVar.h()) {
            if (asl.p(bbtVar, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!bbtVar.g()) {
            if (asl.p(bbtVar, f)) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
                f2 = 0.0f;
            }
        }
        aezu aezuVar = new aezu(Float.valueOf(f3), Float.valueOf(f2));
        float fFloatValue = ((Number) aezuVar.a).floatValue();
        float fFloatValue2 = ((Number) aezuVar.b).floatValue();
        float fFloatValue3 = ((Number) this.b.invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != BitmapDescriptorFactory.HUE_RED) {
            asl.d("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        return (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) ? BitmapDescriptorFactory.HUE_RED : fFloatValue3;
    }

    public final bbj c() {
        return this.a.x();
    }
}
