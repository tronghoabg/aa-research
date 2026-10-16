package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wbz extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ defpackage.abny a;

    public wbz(defpackage.abny abnyVar) {
        this.a = abnyVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        defpackage.abnx abnxVar = (defpackage.abnx) this.a;
        int i3 = abnxVar.c;
        int i4 = abnxVar.d;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int iMin = java.lang.Math.min(i2, i5);
            java.lang.System.arraycopy(abnxVar.b, abnxVar.d, bArr, i, iMin);
            abnxVar.d += iMin;
            return iMin;
        }
        int iMin2 = java.lang.Math.min(i2, (abnxVar.f - abnxVar.e) - i4);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i6 = abnxVar.a.read(bArr, i, iMin2);
            if (i6 == -1) {
                return i6;
            }
            abnxVar.e += i6;
            return i6;
        } catch (defpackage.abpp e) {
            e.a();
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        if (j <= 0) {
            return 0L;
        }
        int i = j > 2147483647L ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : (int) j;
        this.a.B(i);
        return i;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }
}
