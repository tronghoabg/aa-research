package S1;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class C extends AbstractC0827c {

    /* renamed from: e, reason: collision with root package name */
    public final int f10835e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f10836f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f10837g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f10838h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f10839i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f10840j;
    public InetAddress k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10841l;

    /* renamed from: m, reason: collision with root package name */
    public int f10842m;

    public C(int i5) {
        super(true);
        this.f10835e = i5;
        byte[] bArr = new byte[2000];
        this.f10836f = bArr;
        this.f10837g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // S1.h
    public final void close() throws IOException {
        this.f10838h = null;
        MulticastSocket multicastSocket = this.f10840j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f10840j = null;
        }
        DatagramSocket datagramSocket = this.f10839i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f10839i = null;
        }
        this.k = null;
        this.f10842m = 0;
        if (this.f10841l) {
            this.f10841l = false;
            l();
        }
    }

    @Override // S1.h
    public final Uri k() {
        return this.f10838h;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f10842m;
        DatagramPacket datagramPacket = this.f10837g;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f10839i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f10842m = length;
                b(length);
            } catch (SocketTimeoutException e7) {
                throw new B(e7, 2002);
            } catch (IOException e10) {
                throw new B(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f10842m;
        int iMin = Math.min(i12, i10);
        System.arraycopy(this.f10836f, length2 - i12, bArr, i5, iMin);
        this.f10842m -= iMin;
        return iMin;
    }

    @Override // S1.h
    public final long y(k kVar) {
        Uri uri = kVar.f10870a;
        this.f10838h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f10838h.getPort();
        m();
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f10840j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.f10839i = this.f10840j;
            } else {
                this.f10839i = new DatagramSocket(inetSocketAddress);
            }
            this.f10839i.setSoTimeout(this.f10835e);
            this.f10841l = true;
            o(kVar);
            return -1L;
        } catch (IOException e7) {
            throw new B(e7, 2001);
        } catch (SecurityException e10) {
            throw new B(e10, 2006);
        }
    }
}
