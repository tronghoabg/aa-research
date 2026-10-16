package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bfb {
    public static final cdt b = byx.t(new abp(7), new bes(6));
    public long a;
    private cjb c;
    private final bwq d;
    private final byb e;
    private final byb f;
    private final byd g;

    public bfb(api apiVar, float f) {
        this.e = new ParcelableSnapshotMutableFloatState(f);
        this.f = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
        this.g = new ParcelableSnapshotMutableIntState(0);
        this.c = cjb.a;
        this.a = dfv.a;
        this.d = new ParcelableSnapshotMutableState(apiVar, bxp.c);
    }

    public final float a() {
        return this.f.e();
    }

    public final float b() {
        return this.e.e();
    }

    public final api c() {
        return (api) this.d.a();
    }

    public final void d(float f) {
        this.e.h(f);
    }

    public final void e(api apiVar, cjb cjbVar, int i, int i2) {
        float f = i2 - i;
        this.f.h(f);
        cjb cjbVar2 = this.c;
        float f2 = cjbVar2.b;
        float f3 = cjbVar.b;
        if (f3 != f2 || cjbVar.c != cjbVar2.c) {
            boolean z = apiVar == api.a;
            if (z) {
                f3 = cjbVar.c;
            }
            float f4 = z ? cjbVar.e : cjbVar.d;
            float fB = b();
            float f5 = i;
            float f6 = fB + f5;
            d(b() + ((f4 <= f6 && (f3 >= fB || f4 - f3 <= f5)) ? (f3 >= fB || f4 - f3 > f5) ? 0.0f : f3 - fB : f4 - f6));
            this.c = cjbVar;
        }
        d(afpt.d(b(), BitmapDescriptorFactory.HUE_RED, f));
        this.g.h(i);
    }

    public bfb() {
        this(api.a, BitmapDescriptorFactory.HUE_RED);
    }
}
