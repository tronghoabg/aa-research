package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class arh implements arr {
    final /* synthetic */ axr a;
    final /* synthetic */ art b;

    public arh(axr axrVar, art artVar) {
        this.a = axrVar;
        this.b = artVar;
    }

    private final axj c() {
        return this.a.l();
    }

    @Override // defpackage.arr
    public final float a(float f, float f2) {
        float fAbs = Math.abs(f2);
        List list = c().j;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            int size2 = list.size();
            int i2 = 0;
            while (i < size2) {
                i2 += ((axk) list.get(i)).i;
                i++;
            }
            i = i2 / size;
        }
        float f3 = fAbs - i;
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            f3 = 0.0f;
        }
        return f3 * Math.signum(f2);
    }

    @Override // defpackage.arr
    public final float b(float f) {
        List list = c().j;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            axk axkVar = (axk) list.get(i);
            axk axkVar2 = true != (axkVar instanceof axk) ? null : axkVar;
            if (axkVar2 == null || !axkVar2.o) {
                art artVar = this.b;
                int iAx = ca.ax(c());
                int iA = c().a();
                int i2 = c().o;
                int i3 = axkVar.i;
                float fA = axkVar.h - artVar.a(iAx, i3, iA, i2, axkVar.a, c().m);
                if (fA <= BitmapDescriptorFactory.HUE_RED && fA > f2) {
                    f2 = fA;
                }
                if (fA >= BitmapDescriptorFactory.HUE_RED && fA < f3) {
                    f3 = fA;
                }
            }
        }
        int iAw = ca.aw(this.a.d(), f);
        if (iAw != 0 ? iAw != 1 : Math.abs(f3) > Math.abs(f2)) {
            f3 = f2;
        }
        return (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) ? BitmapDescriptorFactory.HUE_RED : f3;
    }
}
