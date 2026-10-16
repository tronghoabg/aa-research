package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class hyn implements huv {
    private final String a;
    private Object b;

    public hyn(String str) {
        this.a = str;
    }

    @Override // defpackage.huv
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.huv
    public final void c() throws IOException {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.huv
    public final void d(hsh hshVar, huu huuVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            this.b = byteArrayInputStream;
            huuVar.f(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            huuVar.g(e);
        }
    }

    @Override // defpackage.huv
    public final int e() {
        return 1;
    }

    @Override // defpackage.huv
    public final void b() {
    }
}
