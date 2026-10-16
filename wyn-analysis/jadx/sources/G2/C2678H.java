package g2;

import S1.AbstractC0827c;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: g2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2678H extends AbstractC0827c implements InterfaceC2684e {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f35548e;

    /* renamed from: f, reason: collision with root package name */
    public final long f35549f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f35550g;

    /* renamed from: h, reason: collision with root package name */
    public int f35551h;

    public C2678H() {
        super(true);
        this.f35549f = 8000L;
        this.f35548e = new LinkedBlockingQueue();
        this.f35550g = new byte[0];
        this.f35551h = -1;
    }

    @Override // g2.InterfaceC2684e
    public final boolean A() {
        return false;
    }

    @Override // S1.h
    public final Uri k() {
        return null;
    }

    @Override // g2.InterfaceC2684e
    public final String n() {
        Q1.k.g(this.f35551h != -1);
        int i5 = this.f35551h;
        int i10 = this.f35551h + 1;
        int i11 = Q1.x.f9724a;
        Locale locale = Locale.US;
        return R8.v.e(i5, i10, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // g2.InterfaceC2684e
    public final int p() {
        return this.f35551h;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int iMin = Math.min(i10, this.f35550g.length);
        System.arraycopy(this.f35550g, 0, bArr, i5, iMin);
        byte[] bArr2 = this.f35550g;
        this.f35550g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i10) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f35548e.poll(this.f35549f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i10 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i5 + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f35550g = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // S1.h
    public final long y(S1.k kVar) {
        this.f35551h = kVar.f10870a.getPort();
        return -1L;
    }

    @Override // g2.InterfaceC2684e
    public final C2678H B() {
        return this;
    }

    @Override // S1.h
    public final void close() {
    }
}
