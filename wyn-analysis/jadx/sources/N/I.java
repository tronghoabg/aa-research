package N;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public int f7705a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7706b;

    public I(int i5) {
        switch (i5) {
            case 1:
                this.f7706b = new int[10];
                break;
            default:
                this.f7706b = new int[10];
                break;
        }
    }

    public boolean a(int i5) {
        return ((1 << i5) & this.f7705a) != 0;
    }

    public int b() {
        int[] iArr = this.f7706b;
        int i5 = this.f7705a - 1;
        this.f7705a = i5;
        return iArr[i5];
    }

    public void c(int i5) {
        int i10 = this.f7705a;
        int[] iArr = this.f7706b;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f7706b = iArrCopyOf;
        }
        int[] iArr2 = this.f7706b;
        int i11 = this.f7705a;
        this.f7705a = i11 + 1;
        iArr2[i11] = i5;
    }

    public void d(int i5, int i10) {
        int[] iArr = this.f7706b;
        if (i5 >= iArr.length) {
            return;
        }
        this.f7705a = (1 << i5) | this.f7705a;
        iArr[i5] = i10;
    }
}
