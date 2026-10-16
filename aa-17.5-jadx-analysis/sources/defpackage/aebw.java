package defpackage;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
final class aebw extends aeca {
    private final int d;
    private final zre e;
    private final zre f;
    private final zre g;
    private final zre h;

    public aebw(zre zreVar, zre zreVar2, zre zreVar3, zre zreVar4, Provider provider, int i) {
        super(provider);
        this.e = zreVar;
        this.f = zreVar2;
        this.g = zreVar3;
        this.h = zreVar4;
        this.d = i;
    }

    @Override // defpackage.aeca
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        zre zreVar = this.g;
        if (zreVar.e(sSLSocket) && (bArr = (byte[]) zreVar.d(sSLSocket, new Object[0])) != null) {
            return new String(bArr, aecd.b);
        }
        return null;
    }

    @Override // defpackage.aeca
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.e.f(sSLSocket, true);
            this.f.f(sSLSocket, str);
        }
        zre zreVar = this.h;
        if (zreVar.e(sSLSocket)) {
            zreVar.d(sSLSocket, e(list));
        }
    }

    @Override // defpackage.aeca
    public final int c() {
        return this.d;
    }
}
