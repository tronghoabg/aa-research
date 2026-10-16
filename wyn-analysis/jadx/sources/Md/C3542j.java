package md;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k8.AbstractC3198g;
import od.C3715p1;
import od.X0;

/* renamed from: md.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3542j implements InterfaceC3543k, a0, i0, X {

    /* renamed from: b, reason: collision with root package name */
    public static final C3542j f40651b = new C3542j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f40652c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40653a;

    public /* synthetic */ C3542j(int i5) {
        this.f40653a = i5;
    }

    @Override // md.X
    public String a(Object obj) {
        return (String) obj;
    }

    @Override // md.InterfaceC3543k
    public InputStream b(C3715p1 c3715p1) {
        switch (this.f40653a) {
            case 0:
                return c3715p1;
            default:
                return new GZIPInputStream(c3715p1);
        }
    }

    @Override // md.i0
    public boolean c(Object obj) {
        switch (this.f40653a) {
            case 6:
                ((P) obj).getClass();
                break;
            case 7:
                ((T) obj).getClass();
                break;
            default:
                ((f0) obj).getClass();
                break;
        }
        return true;
    }

    @Override // md.i0
    public int d(Object obj) throws ClassNotFoundException {
        switch (this.f40653a) {
            case 6:
                ((P) obj).getClass();
                break;
            case 7:
                ((pd.i) ((T) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, pd.i.class.getClassLoader());
                    break;
                }
            default:
                ((f0) obj).getClass();
                break;
        }
        return 5;
    }

    @Override // md.InterfaceC3543k
    public String e() {
        switch (this.f40653a) {
            case 0:
                return "identity";
            default:
                return "gzip";
        }
    }

    @Override // md.a0
    public Object g(byte[] bArr) {
        int i5;
        byte b5;
        switch (this.f40653a) {
            case 1:
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i11 = 0;
                        while (i11 < bArr.length) {
                            if (bArr[i11] == 37 && i11 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i11 + 1, 2, AbstractC3198g.f39299a), 16));
                                    i11 += 3;
                                } catch (NumberFormatException unused) {
                                }
                            }
                            byteBufferAllocate.put(bArr[i11]);
                            i11++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), AbstractC3198g.f39301c);
                    }
                }
                return new String(bArr, 0);
            default:
                char c10 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return k0.f40674e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b5 = bArr[0]) >= 48 && b5 <= 57) {
                        i5 = (b5 - 48) * 10;
                        c10 = 1;
                    }
                    return k0.f40676g.h("Unknown code ".concat(new String(bArr, AbstractC3198g.f39299a)));
                }
                i5 = 0;
                byte b11 = bArr[c10];
                if (b11 >= 48 && b11 <= 57) {
                    int i12 = (b11 - 48) + i5;
                    List list = k0.f40673d;
                    if (i12 < list.size()) {
                        return (k0) list.get(i12);
                    }
                }
                return k0.f40676g.h("Unknown code ".concat(new String(bArr, AbstractC3198g.f39299a)));
        }
    }

    @Override // md.InterfaceC3543k
    public OutputStream h(X0 x02) {
        switch (this.f40653a) {
            case 0:
                return x02;
            default:
                return new GZIPOutputStream(x02);
        }
    }

    public String toString() {
        switch (this.f40653a) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public C3542j(SSLSession sSLSession) throws SSLPeerUnverifiedException {
        this.f40653a = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e7) {
            C3531C.f40566d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e7);
        }
    }

    @Override // md.a0
    /* renamed from: a, reason: collision with other method in class */
    public byte[] mo429a(Object obj) {
        switch (this.f40653a) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(AbstractC3198g.f39301c);
                int i5 = 0;
                while (i5 < bytes.length) {
                    byte b5 = bytes[i5];
                    if (b5 < 32 || b5 >= 126 || b5 == 37) {
                        byte[] bArr = new byte[((bytes.length - i5) * 3) + i5];
                        if (i5 != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i5);
                        }
                        int i10 = i5;
                        while (i5 < bytes.length) {
                            byte b10 = bytes[i5];
                            if (b10 < 32 || b10 >= 126 || b10 == 37) {
                                bArr[i10] = 37;
                                byte[] bArr2 = f40652c;
                                bArr[i10 + 1] = bArr2[(b10 >> 4) & 15];
                                bArr[i10 + 2] = bArr2[b10 & 15];
                                i10 += 3;
                            } else {
                                bArr[i10] = b10;
                                i10++;
                            }
                            i5++;
                        }
                        return Arrays.copyOf(bArr, i10);
                    }
                    i5++;
                }
                return bytes;
            default:
                return ((k0) obj).f40685a.f40672b;
        }
    }

    @Override // md.X
    public Object f(String str) {
        return str;
    }
}
