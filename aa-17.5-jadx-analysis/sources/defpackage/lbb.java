package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class lbb {
    public final float a;
    public float[] b = new float[0];
    public int c = 0;

    public lbb(float f) {
        this.a = f;
    }

    public final void a() {
        Arrays.fill(this.b, BitmapDescriptorFactory.HUE_RED);
        this.c = 0;
    }

    public final void b(float f, int i) {
        float[] fArr = this.b;
        int length = fArr.length;
        if (length <= i) {
            float[] fArr2 = new float[i + 1];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            this.b = fArr2;
            fArr = fArr2;
        }
        fArr[i] = f;
        this.c |= 1 << i;
    }

    public final boolean c(int i) {
        return (this.c & (1 << i)) != 0;
    }
}
