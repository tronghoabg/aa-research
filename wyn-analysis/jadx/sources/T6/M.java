package t6;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class M extends AbstractC4138f {

    /* renamed from: e, reason: collision with root package name */
    public final int f45844e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f45845f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f45846g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f45847h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f45848i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f45849j;
    public InetAddress k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f45850l;

    /* renamed from: m, reason: collision with root package name */
    public int f45851m;

    public M() {
        super(true);
        this.f45844e = 8000;
        byte[] bArr = new byte[2000];
        this.f45845f = bArr;
        this.f45846g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // t6.InterfaceC4144l
    public final void close() throws IOException {
        this.f45847h = null;
        MulticastSocket multicastSocket = this.f45849j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f45849j = null;
        }
        DatagramSocket datagramSocket = this.f45848i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f45848i = null;
        }
        this.k = null;
        this.f45851m = 0;
        if (this.f45850l) {
            this.f45850l = false;
            l();
        }
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return this.f45847h;
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f45851m;
        DatagramPacket datagramPacket = this.f45846g;
        if (i11 == 0) {
            try {
                DatagramSocket datagramSocket = this.f45848i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f45851m = length;
                b(length);
            } catch (SocketTimeoutException e7) {
                throw new L(e7, 2002);
            } catch (IOException e10) {
                throw new L(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i12 = this.f45851m;
        int iMin = Math.min(i12, i10);
        System.arraycopy(this.f45845f, length2 - i12, bArr, i5, iMin);
        this.f45851m -= iMin;
        return iMin;
    }

    @Override // t6.InterfaceC4144l
    public final long t(n nVar) throws IOException {
        Uri uri = nVar.f45879a;
        this.f45847h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f45847h.getPort();
        m();
        try {
            this.k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f45849j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.f45848i = this.f45849j;
            } else {
                this.f45848i = new DatagramSocket(inetSocketAddress);
            }
            this.f45848i.setSoTimeout(this.f45844e);
            this.f45850l = true;
            n(nVar);
            return -1L;
        } catch (IOException e7) {
            throw new L(e7, 2001);
        } catch (SecurityException e10) {
            throw new L(e10, 2006);
        }
    }
}
