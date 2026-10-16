package e.a.g.a;

import com.google.d.b.an;
import com.google.v.ae;
import com.google.v.fi;
import com.google.v.fo;
import e.a.ah;
import e.a.bf;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends InputStream implements InputStreamRetargetInterface, ah, bf {

    /* renamed from: a, reason: collision with root package name */
    private fi f47751a;

    /* renamed from: b, reason: collision with root package name */
    private final fo f47752b;

    /* renamed from: c, reason: collision with root package name */
    private ByteArrayInputStream f47753c;

    a(fi fiVar, fo foVar) {
        this.f47751a = fiVar;
        this.f47752b = foVar;
    }

    @Override // e.a.ah
    public final int a(OutputStream outputStream) throws IOException {
        fi fiVar = this.f47751a;
        if (fiVar != null) {
            int serializedSize = fiVar.getSerializedSize();
            this.f47751a.writeTo(outputStream);
            this.f47751a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f47753c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int i2 = c.f47758b;
        an.C(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int i3 = byteArrayInputStream.read(bArr);
            if (i3 == -1) {
                int i4 = (int) j2;
                this.f47753c = null;
                return i4;
            }
            outputStream.write(bArr, 0, i3);
            j2 += i3;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        fi fiVar = this.f47751a;
        if (fiVar != null) {
            return fiVar.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f47753c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    final fi b() {
        fi fiVar = this.f47751a;
        if (fiVar != null) {
            return fiVar;
        }
        throw new IllegalStateException("message not available");
    }

    final fo c() {
        return this.f47752b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        fi fiVar = this.f47751a;
        if (fiVar != null) {
            int serializedSize = fiVar.getSerializedSize();
            if (serializedSize == 0) {
                this.f47751a = null;
                this.f47753c = null;
                return -1;
            }
            if (i3 >= serializedSize) {
                ae aeVarAc = ae.ac(bArr, i2, serializedSize);
                this.f47751a.writeTo(aeVarAc);
                aeVarAc.ad();
                this.f47751a = null;
                this.f47753c = null;
                return serializedSize;
            }
            this.f47753c = new ByteArrayInputStream(this.f47751a.toByteArray());
            this.f47751a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f47753c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i2, i3);
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        fi fiVar = this.f47751a;
        if (fiVar != null) {
            this.f47753c = new ByteArrayInputStream(fiVar.toByteArray());
            this.f47751a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f47753c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
