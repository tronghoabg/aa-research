package defpackage;

import android.graphics.Rect;
import android.util.Size;
import com.google.android.gms.car.display.CarDisplayBlendedUiConfig;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class iuw {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final float l;
    public final Size m;
    public final Rect n;
    public final Rect o;
    public final List p;
    public final CarDisplayUiFeatures q;
    public final CarDisplayBlendedUiConfig r;

    public /* synthetic */ iuw(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, float f2, Size size, Rect rect, Rect rect2, List list, CarDisplayUiFeatures carDisplayUiFeatures, CarDisplayBlendedUiConfig carDisplayBlendedUiConfig, int i11) {
        Size size2 = (i11 & 4096) != 0 ? new Size(0, 0) : size;
        Rect rect3 = (i11 & 8192) != 0 ? new Rect() : rect;
        Rect rect4 = (i11 & 16384) != 0 ? new Rect() : rect2;
        List list2 = (32768 & i11) != 0 ? afbe.a : list;
        CarDisplayUiFeatures carDisplayUiFeatures2 = (65536 & i11) != 0 ? new CarDisplayUiFeatures(0, 0) : carDisplayUiFeatures;
        int i12 = i11 & 2048;
        int i13 = i11 & 1024;
        int i14 = i11 & sk.AUDIO_CONTENT_BUFFER_SIZE;
        int i15 = i11 & 256;
        int i16 = i11 & 128;
        int i17 = i11 & 64;
        int i18 = i11 & 32;
        int i19 = i11 & 16;
        int i20 = i11 & 8;
        int i21 = i11 & 4;
        int i22 = i11 & 2;
        int i23 = i11 & 1;
        float f3 = i12 != 0 ? 0.0f : f2;
        int i24 = i13 != 0 ? 0 : i10;
        float f4 = i14 != 0 ? 0.0f : f;
        int i25 = i15 != 0 ? 0 : i9;
        int i26 = i16 != 0 ? 0 : i8;
        int i27 = i17 != 0 ? 0 : i7;
        int i28 = i18 != 0 ? 0 : i6;
        int i29 = i19 != 0 ? 0 : i5;
        int i30 = i20 != 0 ? 0 : i4;
        CarDisplayUiFeatures carDisplayUiFeatures3 = carDisplayUiFeatures2;
        int i31 = i21 != 0 ? 0 : i3;
        List list3 = list2;
        int i32 = i22 != 0 ? 0 : i2;
        Rect rect5 = rect4;
        int i33 = 1 == i23 ? 0 : i;
        CarDisplayBlendedUiConfig carDisplayBlendedUiConfig2 = (i11 & 131072) != 0 ? null : carDisplayBlendedUiConfig;
        size2.getClass();
        rect3.getClass();
        rect5.getClass();
        list3.getClass();
        carDisplayUiFeatures3.getClass();
        this.a = i33;
        this.b = i32;
        this.c = i31;
        this.d = i30;
        this.e = i29;
        this.f = i28;
        this.g = i27;
        this.h = i26;
        this.i = i25;
        this.j = f4;
        this.k = i24;
        this.l = f3;
        this.m = size2;
        this.n = rect3;
        this.o = rect5;
        this.p = list3;
        this.q = carDisplayUiFeatures3;
        this.r = carDisplayBlendedUiConfig2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuw)) {
            return false;
        }
        iuw iuwVar = (iuw) obj;
        return this.a == iuwVar.a && this.b == iuwVar.b && this.c == iuwVar.c && this.d == iuwVar.d && this.e == iuwVar.e && this.f == iuwVar.f && this.g == iuwVar.g && this.h == iuwVar.h && this.i == iuwVar.i && Float.compare(this.j, iuwVar.j) == 0 && this.k == iuwVar.k && Float.compare(this.l, iuwVar.l) == 0 && affa.f(this.m, iuwVar.m) && affa.f(this.n, iuwVar.n) && affa.f(this.o, iuwVar.o) && affa.f(this.p, iuwVar.p) && affa.f(this.q, iuwVar.q) && affa.f(this.r, iuwVar.r);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((((((((((((((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + Float.floatToIntBits(this.j)) * 31) + this.k) * 31) + Float.floatToIntBits(this.l)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
        CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = this.r;
        return (iFloatToIntBits * 31) + (carDisplayBlendedUiConfig == null ? 0 : carDisplayBlendedUiConfig.hashCode());
    }

    public final String toString() {
        return "DisplayParams(selectedIndex=" + this.a + ", codecWidth=" + this.b + ", codecHeight=" + this.c + ", fps=" + this.d + ", dispWidth=" + this.e + ", dispHeight=" + this.f + ", dispLeft=" + this.g + ", dispTop=" + this.h + ", dpi=" + this.i + ", pixelAspectRatio=" + this.j + ", decoderAdditionalDepth=" + this.k + ", scaledPixelAspectRatio=" + this.l + ", scaledDimensions=" + this.m + ", stableInsets=" + this.n + ", contentInsets=" + this.o + ", cutouts=" + this.p + ", carDisplayUiFeatures=" + this.q + ", blendedUiConfig=" + this.r + ")";
    }

    public iuw() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, 262143);
    }
}
