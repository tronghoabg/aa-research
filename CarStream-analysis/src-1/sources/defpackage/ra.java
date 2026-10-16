package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.car.app.model.Alert;
import com.carstream.tech.core.gofa.GofaTap;
import java.util.Arrays;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ra {
    public final int[] a;
    public final int[] b;
    public final double c;
    public final GofaTap d;
    public byte[][] f;
    public boolean[] g;
    public boolean[] h;
    public int[] i;
    public int[] j;
    public int[] k;
    public Bitmap l;
    public Canvas m;
    public Rect n;
    public int[] o;
    public int[] p;
    public int e = -1;
    public final Paint q = new Paint(3);

    public ra(GofaTap gofaTap, double d, int[] iArr, int[] iArr2) {
        this.d = gofaTap;
        this.c = d;
        this.a = iArr;
        this.b = iArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.graphics.Bitmap r23, android.graphics.Rect r24, java.lang.StringBuilder r25) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra.a(android.graphics.Bitmap, android.graphics.Rect, java.lang.StringBuilder):int");
    }

    public final int b(byte[] bArr, int i, int i2) {
        byte[][] bArr2 = this.f;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        for (byte[] bArr3 : bArr2) {
            int iE = e(i, i2, bArr, bArr3);
            if (iE < i3) {
                i3 = iE;
            }
        }
        return i3;
    }

    public final byte[] c(Bitmap bitmap, Rect rect, float f, float f2) {
        this.m.drawColor(-1);
        this.m.save();
        this.m.translate(f, f2);
        this.m.drawBitmap(bitmap, rect, this.n, this.q);
        this.m.restore();
        return d(this.l);
    }

    public final byte[] d(Bitmap bitmap) {
        int[] iArr;
        int[] iArr2 = this.o;
        int i = this.e;
        bitmap.getPixels(iArr2, 0, i, 0, 0, i, i);
        int i2 = 255;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            iArr = this.o;
            if (i3 >= iArr.length) {
                break;
            }
            int i5 = iArr[i3];
            int i6 = (((i5 & 255) * 114) + ((((i5 >> 8) & 255) * 587) + (((i5 >> 16) & 255) * 299))) / 1000;
            this.p[i3] = i6;
            if (this.g[i3]) {
                if (i6 < i2) {
                    i2 = i6;
                }
                if (i6 > i4) {
                    i4 = i6;
                }
            }
            i3++;
        }
        int length = iArr.length;
        byte[] bArr = new byte[length];
        int i7 = i4 - i2;
        if (i7 < 40) {
            Arrays.fill(bArr, (byte) 0);
            return bArr;
        }
        double d = i2;
        double d2 = i7;
        int i8 = (int) ((0.35d * d2) + d);
        int i9 = (int) ((d2 * 0.65d) + d);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.p[i10];
            bArr[i10] = i11 < i8 ? (byte) 1 : i11 > i9 ? (byte) 0 : (byte) 2;
        }
        return bArr;
    }

    public final int e(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i4 >= iArr.length) {
                break;
            }
            int i7 = this.j[i4] + i;
            int i8 = this.k[i4] + i2;
            if (i7 >= 0 && i7 < (i3 = this.e) && i8 >= 0 && i8 < i3) {
                byte b = bArr[(i8 * i3) + i7];
                byte b2 = bArr2[iArr[i4]];
                if (b != 2 && b2 != 2) {
                    i5++;
                    if (b != b2) {
                        i6++;
                    }
                }
            }
            i4++;
        }
        if (i5 < 200) {
            return 1000;
        }
        return (int) ((i6 * 1000) / i5);
    }
}
