package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class vcl {
    public static final float[] b = {-4.0f, -1.0f, 3.5f, -4.5f};
    public static final vcl c = new vbu();
    private final String a;

    static {
        int i = vcd.a;
        int i2 = vce.a;
        int i3 = vcf.a;
        int i4 = vcg.a;
        int i5 = vch.a;
        int i6 = vci.a;
        int i7 = vcj.a;
        int i8 = vck.a;
        int i9 = vbk.a;
        int i10 = vbl.a;
        int i11 = vbm.a;
        int i12 = vbn.a;
        int i13 = vbo.a;
        int i14 = vbp.a;
        int i15 = vbq.a;
        int i16 = vbr.a;
        int i17 = vbs.a;
        int i18 = vbt.a;
        int i19 = vbv.a;
        int i20 = vbw.a;
        int i21 = vbx.a;
        int i22 = vby.a;
        int i23 = vbz.a;
        new vca();
        int i24 = vcb.a;
        new vcc();
    }

    public vcl(String str) {
        this.a = str;
    }

    public static void d(vcr vcrVar) {
        float[] fArr = {12.0f, 6.0f, 7.0f, 3.0f};
        float[] fArr2 = {-8.0f, 4.0f, 5.0f, BitmapDescriptorFactory.HUE_RED};
        float[] fArr3 = {3.0f, 1.0f, 3.0f, 9.5f};
        float[] fArr4 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.5707964f, BitmapDescriptorFactory.HUE_RED};
        boolean[] zArr = {false, false, true, true};
        Iterator<vcq> it = vcrVar.iterator();
        while (it.hasNext()) {
            vcq next = it.next();
            int iA = vcrVar.a(next);
            boolean z = zArr[iA];
            vco vcoVar = next.a;
            vcoVar.a = z;
            vcoVar.b(fArr4[iA]);
            next.g.b(fArr3[iA] * 1.0416666f);
            next.i.b(fArr2[iA] * 1.0416666f);
            next.c(b[iA] * 1.0416666f);
            next.h.b(fArr[iA] * 1.0416666f);
        }
    }

    public static float e(long j, long j2) {
        return (j2 - j) / 300.0f;
    }

    public abstract void a(vcr vcrVar);

    public abstract void b(vcr vcrVar);

    @ResultIgnorabilityUnspecified
    public abstract boolean c(long j, long j2, vcr vcrVar);

    public final String toString() {
        return this.a;
    }
}
