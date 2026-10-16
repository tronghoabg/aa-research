package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
final class aecs extends InputStream implements InputStreamRetargetInterface, adju, adku {
    public abow a;
    public final abpc b;
    private ByteArrayInputStream c;

    public aecs(abow abowVar, abpc abpcVar) {
        this.a = abowVar;
        this.b = abpcVar;
    }

    @Override // defpackage.adju
    public final int a(OutputStream outputStream) throws IOException {
        abow abowVar = this.a;
        if (abowVar != null) {
            int iM = abowVar.m();
            this.a.g(outputStream);
            this.a = null;
            return iM;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        abnj abnjVar = aecu.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        abow abowVar = this.a;
        if (abowVar != null) {
            return abowVar.m();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        abow abowVar = this.a;
        if (abowVar != null) {
            int iM = abowVar.m();
            if (iM == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= iM) {
                abmy abmyVar = new abmy(bArr, i, iM, null);
                this.a.R(abmyVar);
                abmyVar.c();
                abmyVar.I();
                this.a = null;
                this.c = null;
                return iM;
            }
            this.c = new ByteArrayInputStream(this.a.h());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        abow abowVar = this.a;
        if (abowVar != null) {
            this.c = new ByteArrayInputStream(abowVar.h());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
