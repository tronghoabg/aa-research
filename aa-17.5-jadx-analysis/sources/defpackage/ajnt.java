package defpackage;

import android.content.ComponentName;
import androidx.car.app.model.Alert;
import com.google.android.gms.car.CarAudioConfiguration;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ajnt {
    public int a;
    public Object b;

    public ajnt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new long[16];
        this.a = 0;
    }

    private final void t(int i, int i2) {
        int[] iArr = (int[]) this.b;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = iArr[i4];
        int i6 = i2 + 1;
        iArr[i4] = iArr[i6];
        iArr[i6] = i5;
        int i7 = i + 2;
        int i8 = iArr[i7];
        int i9 = i2 + 2;
        iArr[i7] = iArr[i9];
        iArr[i9] = i8;
    }

    private final int[] u(int[] iArr) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length);
        iArrCopyOf.getClass();
        this.b = iArrCopyOf;
        return iArrCopyOf;
    }

    public final ajmv a() {
        return ((ajmv[]) this.b)[1];
    }

    public final void b(int i, ajmv ajmvVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            ajmv[] ajmvVarArr = (ajmv[]) this.b;
            ajmv ajmvVar2 = ajmvVarArr[i2];
            ajmvVar2.getClass();
            if (affa.c(0L, ajmvVar.j - ajmvVar2.j) <= 0) {
                break;
            }
            ajmvVar2.i = i;
            ajmvVarArr[i] = ajmvVar2;
            i = i2;
        }
        ((ajmv[]) this.b)[i] = ajmvVar;
        ajmvVar.i = i;
    }

    public final void c(ajmv ajmvVar) {
        ajmv ajmvVar2;
        int i = ajmvVar.i;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.a;
        ajmv[] ajmvVarArr = (ajmv[]) this.b;
        ajmv ajmvVar3 = ajmvVarArr[i2];
        ajmvVar3.getClass();
        ajmvVar.i = -1;
        ajmvVarArr[i2] = null;
        this.a = i2 - 1;
        if (ajmvVar == ajmvVar3) {
            return;
        }
        int iC = affa.c(0L, ajmvVar3.j - ajmvVar.j);
        if (iC == 0) {
            ajmvVarArr[i] = ajmvVar3;
            ajmvVar3.i = i;
            return;
        }
        if (iC >= 0) {
            b(i, ajmvVar3);
            return;
        }
        while (true) {
            int i3 = i + i;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                ajmvVar2 = ((ajmv[]) this.b)[i3];
                ajmvVar2.getClass();
            } else {
                ajmv[] ajmvVarArr2 = (ajmv[]) this.b;
                ajmvVar2 = ajmvVarArr2[i3];
                ajmvVar2.getClass();
                ajmv ajmvVar4 = ajmvVarArr2[i4];
                ajmvVar4.getClass();
                if (affa.c(0L, ajmvVar4.j - ajmvVar2.j) >= 0) {
                    ajmvVar2 = ajmvVar4;
                }
            }
            if (affa.c(0L, ajmvVar2.j - ajmvVar3.j) <= 0) {
                break;
            }
            int i6 = ajmvVar2.i;
            ajmvVar2.i = i;
            ((ajmv[]) this.b)[i] = ajmvVar2;
            i = i6;
        }
        ((ajmv[]) this.b)[i] = ajmvVar3;
        ajmvVar3.i = i;
    }

    public final void d(long j) {
        int i = this.a;
        int i2 = i + 1;
        long[] jArr = (long[]) this.b;
        int length = jArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Alert.DURATION_SHOW_INDEFINITELY;
            }
            this.b = Arrays.copyOf(jArr, i3);
        }
        Object obj = this.b;
        int i4 = this.a;
        ((long[]) obj)[i4] = j;
        this.a = i4 + 1;
    }

    public final void e(int i) {
        this.b = xxh.h(Integer.valueOf(i));
    }

    public final void f() {
        this.b = null;
        this.a = 0;
    }

    public final void g(uda udaVar, int i) {
        this.b = udaVar;
        this.a = i;
    }

    public final Ctry h() {
        if (this.b == null || this.a == 0) {
            throw new IllegalStateException();
        }
        return new Ctry((abfi) this.b, this.a);
    }

    public final void i() {
        this.b = null;
        this.a = 0;
    }

    public final lzi j() {
        int i;
        Object obj = this.b;
        if (obj != null && (i = this.a) != 0) {
            return new lzi((ComponentName) obj, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" componentName");
        }
        if (this.a == 0) {
            sb.append(" state");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(ComponentName componentName) {
        if (componentName == null) {
            throw new NullPointerException("Null componentName");
        }
        this.b = componentName;
    }

    public final int l(int i) {
        return ((int[]) this.b)[i];
    }

    public final int m() {
        Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void n(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        Object objU = this.b;
        int[] iArr = (int[]) objU;
        if (i5 >= iArr.length) {
            objU = u(iArr);
        }
        int[] iArr2 = (int[]) objU;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.a = i5;
    }

    public final void o(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        Object objU = this.b;
        int[] iArr = (int[]) objU;
        if (i6 >= iArr.length) {
            objU = u(iArr);
        }
        int[] iArr2 = (int[]) objU;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.a = i6;
    }

    public final void p(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    t(i3, i4);
                }
            }
            t(i3 + 3, i2);
            p(i, i3);
            p(i3 + 6, i2);
        }
    }

    public final boolean q(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void r(long j) {
        if (q(j)) {
            return;
        }
        int i = this.a;
        Object objCopyOf = this.b;
        long[] jArr = (long[]) objCopyOf;
        int length = jArr.length;
        if (i >= length) {
            objCopyOf = Arrays.copyOf(jArr, Math.max(i + 1, length + length));
            objCopyOf.getClass();
            this.b = objCopyOf;
        }
        ((long[]) objCopyOf)[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public final void s(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    long[] jArr = (long[]) this.b;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public ajnt(int i, CarAudioConfiguration[] carAudioConfigurationArr) {
        this.a = i;
        this.b = carAudioConfigurationArr;
    }

    public ajnt(byte[] bArr) {
        this.b = xvy.a;
        this.a = 0;
    }

    public ajnt() {
        this.b = new ajmv[8];
    }

    public ajnt(char[] cArr) {
    }

    public ajnt(char[] cArr, char[] cArr2) {
        this.b = new long[2];
    }

    public ajnt(int i) {
        this.a = 0;
        this.b = new long[i];
    }

    public ajnt(int i, byte[] bArr) {
        this.b = new int[i];
    }
}
