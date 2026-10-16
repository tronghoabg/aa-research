package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class uen implements plg {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/StyledOffCache");
    private final aejz b;
    private final pkx c;

    public uen(pkx pkxVar) {
        aejz aejzVar = new aejz(3000);
        this.c = pkxVar;
        this.b = aejzVar;
        vky vkyVar = new vky("Label Styled-off Cache");
        if (pkxVar != null) {
            pkxVar.c(this, vkyVar);
        }
    }

    @Override // defpackage.plg
    public final synchronized String a() {
        return "size: " + this.b.j;
    }

    public final synchronized void b() {
        f(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.plg
    @ResultIgnorabilityUnspecified
    public final synchronized void f(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            ((ynz) a.a(uys.a).ai(9317)).y("fraction %f outside of bounds [0, 1]", Float.valueOf(f));
            f = 0.5f;
        }
        aejz aejzVar = this.b;
        float f2 = aejzVar.j;
        float f3 = 1.0f - f;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            aejzVar.clear();
        } else {
            for (int i = 0; i < ((int) (f2 * f3)) && !aejzVar.isEmpty(); i++) {
                int i2 = aejzVar.j;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                int i3 = aejzVar.d;
                if (i2 == 1) {
                    aejzVar.e = -1;
                    aejzVar.d = -1;
                } else {
                    long[] jArr = aejzVar.f;
                    int i4 = (int) jArr[i3];
                    aejzVar.d = i4;
                    if (i4 >= 0) {
                        jArr[i4] = jArr[i4] | (-4294967296L);
                    }
                }
                int[] iArr = aejzVar.a;
                int i5 = iArr[i3];
                aejzVar.j = i2 - 1;
                if (i5 == 0) {
                    aejzVar.c = false;
                    iArr[aejzVar.g] = 0;
                } else {
                    aejzVar.C(i3);
                }
                int i6 = aejzVar.g;
                if (i6 > aejzVar.i && aejzVar.j < aejzVar.h / 4 && i6 > 16) {
                    aejzVar.B(i6 >> 1);
                }
            }
        }
        aejzVar.D(aejzVar.j);
    }
}
