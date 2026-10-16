package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class vpo {
    int a;
    public volatile int b;
    private final int c;
    private final AtomicReferenceArray d;
    private final int e;

    public vpo(int i) {
        this.c = i;
        this.d = new AtomicReferenceArray(i);
        this.e = i > 0 ? (Alert.DURATION_SHOW_INDEFINITELY % i) + i + 1 : 0;
    }

    public final void a(vpl vplVar) {
        int i = this.c;
        if (i <= 0) {
            return;
        }
        int i2 = this.a;
        this.d.set(i2 % i, vplVar);
        int i3 = i2 == Integer.MAX_VALUE ? this.e : i2 + 1;
        this.a = i3;
        this.b = i3;
    }

    public final vpl[] b(int i, int i2) {
        if (i2 > 0) {
            int i3 = this.c;
            int iMax = Math.max(i - Math.min(i2, i3 - 1), 0);
            int i4 = i - iMax;
            if (i4 > 0) {
                vpl[] vplVarArr = new vpl[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    vplVarArr[i5] = (vpl) this.d.get((i5 + iMax) % i3);
                }
                int i6 = this.b;
                int i7 = ((i6 >= i ? i6 - i : ((i6 - this.e) + 1) + (Alert.DURATION_SHOW_INDEFINITELY - i)) - (i3 - i4)) + 1;
                if (i7 < i4) {
                    if (i7 <= 0) {
                        return vplVarArr;
                    }
                    int i8 = i4 - i7;
                    vpl[] vplVarArr2 = new vpl[i8];
                    System.arraycopy(vplVarArr, i7, vplVarArr2, 0, i8);
                    return vplVarArr2;
                }
            }
        }
        return new vpl[0];
    }
}
