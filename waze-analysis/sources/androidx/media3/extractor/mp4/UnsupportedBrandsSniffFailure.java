package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SniffFailure;
import com.google.d.l.b;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final b compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i2, int[] iArr) {
        this.majorBrand = i2;
        this.compatibleBrands = iArr != null ? b.d(iArr) : b.e();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(this.compatibleBrands.b());
        for (int i2 = 0; i2 < this.compatibleBrands.b(); i2++) {
            arrayList.add(Util.toFourccString(this.compatibleBrands.a(i2)));
        }
        return "UnsupportedBrands{major=" + Util.toFourccString(this.majorBrand) + ", compatible=" + arrayList.toString() + "}";
    }
}
