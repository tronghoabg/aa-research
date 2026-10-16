package g2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* renamed from: g2.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2679I implements InterfaceC2684e {

    /* renamed from: a, reason: collision with root package name */
    public final S1.C f35552a = new S1.C(S3.f.l(8000));

    /* renamed from: b, reason: collision with root package name */
    public C2679I f35553b;

    @Override // g2.InterfaceC2684e
    public final boolean A() {
        return true;
    }

    @Override // g2.InterfaceC2684e
    public final C2678H B() {
        return null;
    }

    @Override // S1.h
    public final void C(S1.A a5) {
        this.f35552a.C(a5);
    }

    @Override // S1.h
    public final void close() throws IOException {
        this.f35552a.close();
        C2679I c2679i = this.f35553b;
        if (c2679i != null) {
            c2679i.close();
        }
    }

    @Override // S1.h
    public final Map d() {
        return Collections.EMPTY_MAP;
    }

    @Override // S1.h
    public final Uri k() {
        return this.f35552a.f10838h;
    }

    @Override // g2.InterfaceC2684e
    public final String n() {
        int iP = p();
        Q1.k.g(iP != -1);
        int i5 = Q1.x.f9724a;
        Locale locale = Locale.US;
        return R8.v.e(iP, 1 + iP, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // g2.InterfaceC2684e
    public final int p() {
        DatagramSocket datagramSocket = this.f35552a.f10839i;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws S1.B {
        try {
            return this.f35552a.read(bArr, i5, i10);
        } catch (S1.B e7) {
            if (e7.f10863a == 2002) {
                return -1;
            }
            throw e7;
        }
    }

    @Override // S1.h
    public final long y(S1.k kVar) {
        this.f35552a.y(kVar);
        return -1L;
    }
}
