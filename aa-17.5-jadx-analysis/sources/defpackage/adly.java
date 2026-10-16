package defpackage;

import java.io.ByteArrayInputStream;

/* loaded from: classes3.dex */
public final class adly extends adlx {
    private final adlw e;

    public adly(String str, adlw adlwVar) {
        super(str, false, adlwVar);
        woy.W(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        woy.O(str.length() > 4, "empty key name");
        this.e = adlwVar;
    }

    @Override // defpackage.adlx
    public final Object a(byte[] bArr) {
        return this.e.b(new ByteArrayInputStream(bArr));
    }

    @Override // defpackage.adlx
    public final byte[] b(Object obj) {
        return admc.i(this.e.a(obj));
    }

    @Override // defpackage.adlx
    public final boolean c() {
        return true;
    }
}
