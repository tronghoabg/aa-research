package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class top {
    public float[] a;
    public int b;
    public int c;
    public float d;
    private int[] e;
    private boolean f;
    private final int g;
    private final int h;
    private final int i;

    public top(int i, int i2, int i3, int i4) {
        this.f = false;
        this.d = BitmapDescriptorFactory.HUE_RED;
        wub.H(i > 0);
        this.e = new int[i + i];
        this.b = 0;
        this.a = new float[i];
        this.c = 0;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public final toq a() {
        int[] iArr;
        float[] fArr;
        float[] fArr2 = toq.b;
        int i = this.c;
        if (i > 0 && i != this.b) {
            ((ynz) ((ynz) toq.a.g()).ai(9094)).B("Altitude count %d != vertex count %d", this.c, this.b);
            this.c = 0;
            i = 0;
        }
        int i2 = this.b;
        if (i2 != 1) {
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3];
            float[] fArr3 = new float[i];
            System.arraycopy(this.e, 0, iArr2, 0, i3);
            System.arraycopy(this.a, 0, fArr3, 0, this.c);
            iArr = iArr2;
            fArr = fArr3;
        } else if (this.f) {
            int[] iArr3 = new int[4];
            System.arraycopy(this.e, 0, iArr3, 0, 2);
            System.arraycopy(this.e, 0, iArr3, 2, 2);
            if (this.c > 0) {
                float[] fArr4 = this.a;
                fArr2 = new float[]{fArr4[0], fArr4[0]};
            }
            fArr = fArr2;
            iArr = iArr3;
        } else {
            i2 = 1;
            int i32 = i2 + i2;
            int[] iArr22 = new int[i32];
            float[] fArr32 = new float[i];
            System.arraycopy(this.e, 0, iArr22, 0, i32);
            System.arraycopy(this.a, 0, fArr32, 0, this.c);
            iArr = iArr22;
            fArr = fArr32;
        }
        return new toq(iArr, fArr, this.g, this.h, this.i, this.d);
    }

    public final void b() {
        this.b = 0;
        this.c = 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(too tooVar) {
        int i = tooVar.a;
        int i2 = tooVar.b;
        int i3 = this.b;
        int i4 = i3 + i3;
        int[] iArr = this.e;
        int length = iArr.length;
        if (i4 == length) {
            int[] iArr2 = new int[length + length];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.e = iArr2;
            iArr = iArr2;
        }
        int i5 = this.b;
        int i6 = i5 + i5;
        if (i5 > 0 && i == iArr[i6 - 2] && i2 == iArr[i6 - 1]) {
            this.f = true;
            return false;
        }
        iArr[i6] = i;
        iArr[i6 + 1] = i2;
        this.b = i5 + 1;
        return true;
    }

    public top() {
        throw null;
    }
}
