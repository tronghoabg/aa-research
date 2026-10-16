package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajux extends ajva {
    private final byte[] a;

    public ajux(ajpb ajpbVar) throws IOException {
        byte[] byteArray;
        super(ajpbVar);
        if (!ajpbVar.h() || ajpbVar.a() < 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ajpbVar.f(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArray = null;
        }
        this.a = byteArray;
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final long a() {
        return this.a != null ? r0.length : super.a();
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final InputStream b() throws IOException {
        byte[] bArr = this.a;
        return bArr != null ? new ByteArrayInputStream(bArr) : super.b();
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final void f(OutputStream outputStream) throws IOException {
        byte[] bArr = this.a;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.f(outputStream);
        }
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final boolean g() {
        return this.a == null && super.g();
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ajva, defpackage.ajpb
    public final boolean i() {
        return this.a == null && super.i();
    }
}
