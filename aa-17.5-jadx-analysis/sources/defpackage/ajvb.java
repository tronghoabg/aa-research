package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes2.dex */
public final class ajvb extends ajuv implements Cloneable {
    protected final byte[] d;

    public ajvb(String str, ajuz ajuzVar) throws UnsupportedCharsetException {
        ahgm.e(str, "Source string");
        Charset charset = ajuzVar.t;
        this.d = str.getBytes(charset == null ? akaz.a : charset);
        j(ajuzVar.toString());
    }

    @Override // defpackage.ajpb
    public final long a() {
        return this.d.length;
    }

    @Override // defpackage.ajpb
    public final InputStream b() throws IOException {
        return new ByteArrayInputStream(this.d);
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // defpackage.ajpb
    public final void f(OutputStream outputStream) throws IOException {
        outputStream.write(this.d);
        outputStream.flush();
    }

    @Override // defpackage.ajpb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ajpb
    public final boolean i() {
        return false;
    }
}
