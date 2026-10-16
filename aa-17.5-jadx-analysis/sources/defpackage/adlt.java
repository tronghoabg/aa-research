package defpackage;

import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class adlt extends adlx {
    private final adlu e;

    public adlt(String str, adlu adluVar) {
        super(str, false, adluVar);
        woy.W(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        adluVar.getClass();
        this.e = adluVar;
    }

    @Override // defpackage.adlx
    public final Object a(byte[] bArr) {
        return this.e.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.adlx
    public final byte[] b(Object obj) {
        return this.e.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
