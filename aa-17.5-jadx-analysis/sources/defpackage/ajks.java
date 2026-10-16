package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ajks {
    public final ajmy a;
    public boolean c;
    public int f;
    public int g;
    public int h;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    public int d = 4096;
    public ajkq[] e = new ajkq[8];

    public ajks(ajmy ajmyVar) {
        this.a = ajmyVar;
        this.f = r1.length - 1;
    }

    public final void a() {
        ajkq[] ajkqVarArr = this.e;
        woy.cE(ajkqVarArr, null, 0, ajkqVarArr.length);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    public final void b(ajkq ajkqVar) {
        int i = ajkqVar.i;
        int i2 = this.d;
        if (i > i2) {
            a();
            return;
        }
        e((this.h + i) - i2);
        int i3 = this.g + 1;
        ajkq[] ajkqVarArr = this.e;
        int length = ajkqVarArr.length;
        if (i3 > length) {
            ajkq[] ajkqVarArr2 = new ajkq[length + length];
            System.arraycopy(ajkqVarArr, 0, ajkqVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = ajkqVarArr2;
            ajkqVarArr = ajkqVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        ajkqVarArr[i4] = ajkqVar;
        this.g++;
        this.h += i;
    }

    public final void c(ajnb ajnbVar) throws IOException {
        long j;
        int[] iArr = ajlm.a;
        int iC = ajnbVar.c();
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            byte bA = ajnbVar.a(i2);
            int i3 = ajiq.a;
            j2 += ajlm.b[bA & 255];
        }
        if (((int) ((j2 + 7) >> 3)) >= ajnbVar.c()) {
            d(ajnbVar.c(), 127, 0);
            this.a.K(ajnbVar);
            return;
        }
        ajmy ajmyVar = new ajmy();
        int iC2 = ajnbVar.c();
        long j3 = 0;
        int i4 = 0;
        while (i < iC2) {
            byte bA2 = ajnbVar.a(i);
            int i5 = ajiq.a;
            int i6 = bA2 & 255;
            int i7 = ajlm.a[i6];
            byte b = ajlm.b[i6];
            long j4 = j3 << b;
            long j5 = i7;
            i4 += b;
            while (true) {
                j = j4 | j5;
                if (i4 >= 8) {
                    i4 -= 8;
                    ajmyVar.N((int) (j >> i4));
                }
            }
            i++;
            j3 = j;
        }
        if (i4 > 0) {
            ajmyVar.N((int) ((255 >>> i4) | (j3 << (8 - i4))));
        }
        ajnb ajnbVarR = ajmyVar.r();
        d(ajnbVarR.c(), 127, 128);
        this.a.K(ajnbVarR);
    }

    public final void d(int i, int i2, int i3) {
        ajmy ajmyVar = this.a;
        if (i < i2) {
            ajmyVar.N(i | i3);
            return;
        }
        ajmyVar.N(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            ajmyVar.N(128 | (i4 & 127));
            i4 >>>= 7;
        }
        ajmyVar.N(i4);
    }

    public final void e(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                ajkq ajkqVar = this.e[length];
                ajkqVar.getClass();
                int i4 = this.h;
                ajkqVar.getClass();
                int i5 = ajkqVar.i;
                this.h = i4 - i5;
                this.g--;
                i3++;
                i -= i5;
                length--;
            }
            ajkq[] ajkqVarArr = this.e;
            int i6 = i2 + 1;
            System.arraycopy(ajkqVarArr, i6, ajkqVarArr, i6 + i3, this.g);
            ajkq[] ajkqVarArr2 = this.e;
            int i7 = this.f + 1;
            Arrays.fill(ajkqVarArr2, i7, i7 + i3, (Object) null);
            this.f += i3;
        }
    }
}
