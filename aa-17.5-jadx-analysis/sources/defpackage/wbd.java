package defpackage;

import androidx.car.app.model.Alert;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class wbd extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ abmw a;

    public wbd(abmw abmwVar) {
        this.a = abmwVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        abmv abmvVar = (abmv) this.a;
        int i3 = abmvVar.c;
        int i4 = abmvVar.d;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = Math.min(i2, i5);
            System.arraycopy(abmvVar.b, abmvVar.d, bArr, i, iMin);
            abmvVar.d += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i2, (abmvVar.f - abmvVar.e) - i4);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i6 = abmvVar.a.read(bArr, i, iMin2);
            if (i6 == -1) {
                return i6;
            }
            abmvVar.e += i6;
            return i6;
        } catch (abon e) {
            e.a();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        int i = j > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : (int) j;
        this.a.E(i);
        return i;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }
}
