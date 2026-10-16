package h2;

import N1.D;
import Q1.k;
import Q1.o;
import Q1.x;
import R1.n;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import g2.C2688i;
import g2.C2691l;
import java.util.Locale;
import java.util.TreeMap;
import s2.C;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36001a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36002b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36003c;

    /* renamed from: d, reason: collision with root package name */
    public Object f36004d;

    /* renamed from: e, reason: collision with root package name */
    public Object f36005e;

    /* renamed from: f, reason: collision with root package name */
    public int f36006f;

    /* renamed from: g, reason: collision with root package name */
    public long f36007g;

    /* renamed from: h, reason: collision with root package name */
    public int f36008h;

    /* renamed from: i, reason: collision with root package name */
    public int f36009i;

    /* renamed from: j, reason: collision with root package name */
    public long f36010j;

    public e(String str, String str2, long j8, int i5, int i10, int i11, int[] iArr, TreeMap treeMap) {
        this.f36001a = 2;
        this.f36002b = str;
        this.f36003c = str2;
        this.f36007g = j8;
        this.f36010j = 0L;
        this.f36006f = i5;
        this.f36008h = i10;
        this.f36009i = i11;
        this.f36004d = iArr;
        this.f36005e = treeMap;
    }

    @Override // h2.i
    public void a(long j8, long j10) {
        switch (this.f36001a) {
            case 0:
                this.f36007g = j8;
                this.f36009i = 0;
                this.f36010j = j10;
                break;
            default:
                this.f36007g = j8;
                this.f36009i = 0;
                this.f36010j = j10;
                break;
        }
    }

    @Override // h2.i
    public void b(o oVar, long j8, int i5, boolean z2) throws D {
        Object obj = this.f36002b;
        int i10 = 1;
        switch (this.f36001a) {
            case 0:
                try {
                    int i11 = oVar.f9702a[0] & 31;
                    k.h((C) this.f36005e);
                    if (i11 > 0 && i11 < 24) {
                        int iA = oVar.a();
                        this.f36009i = g() + this.f36009i;
                        ((C) this.f36005e).e(iA, oVar);
                        this.f36009i += iA;
                        this.f36006f = (oVar.f9702a[0] & 31) == 5 ? 1 : 0;
                    } else if (i11 == 24) {
                        oVar.u();
                        while (oVar.a() > 4) {
                            int iA2 = oVar.A();
                            this.f36009i = g() + this.f36009i;
                            ((C) this.f36005e).e(iA2, oVar);
                            this.f36009i += iA2;
                        }
                        this.f36006f = 0;
                    } else {
                        if (i11 != 28) {
                            throw D.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                        }
                        byte[] bArr = oVar.f9702a;
                        byte b5 = bArr[0];
                        byte b10 = bArr[1];
                        int i12 = (b5 & 224) | (b10 & 31);
                        boolean z10 = (b10 & 128) > 0;
                        boolean z11 = (b10 & 64) > 0;
                        o oVar2 = (o) obj;
                        if (z10) {
                            this.f36009i = g() + this.f36009i;
                            byte[] bArr2 = oVar.f9702a;
                            bArr2[1] = (byte) i12;
                            oVar2.getClass();
                            oVar2.E(bArr2.length, bArr2);
                            oVar2.G(1);
                        } else {
                            int iA3 = C2688i.a(this.f36008h);
                            if (i5 != iA3) {
                                int i13 = x.f9724a;
                                Locale locale = Locale.US;
                                k.w("RtpH264Reader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", iA3, "; received: ", i5, ". Dropping packet."));
                            } else {
                                byte[] bArr3 = oVar.f9702a;
                                oVar2.getClass();
                                oVar2.E(bArr3.length, bArr3);
                                oVar2.G(2);
                            }
                        }
                        int iA4 = oVar2.a();
                        ((C) this.f36005e).e(iA4, oVar2);
                        this.f36009i += iA4;
                        if (z11) {
                            this.f36006f = (i12 & 31) == 5 ? 1 : 0;
                        }
                    }
                    if (z2) {
                        if (this.f36007g == -9223372036854775807L) {
                            this.f36007g = j8;
                        }
                        ((C) this.f36005e).a(S3.f.N(this.f36010j, j8, 90000, this.f36007g), this.f36006f, this.f36009i, 0, null);
                        this.f36009i = 0;
                    }
                    this.f36008h = i5;
                    return;
                } catch (IndexOutOfBoundsException e7) {
                    throw D.b(null, e7);
                }
            default:
                byte[] bArr4 = oVar.f9702a;
                if (bArr4.length == 0) {
                    throw D.b("Empty RTP data packet.", null);
                }
                int i14 = (bArr4[0] >> 1) & 63;
                k.h((C) this.f36005e);
                o oVar3 = (o) this.f36003c;
                if (i14 >= 0 && i14 < 48) {
                    int iA5 = oVar.a();
                    int i15 = this.f36009i;
                    oVar3.G(0);
                    int iA6 = oVar3.a();
                    C c10 = (C) this.f36005e;
                    c10.getClass();
                    c10.e(iA6, oVar3);
                    this.f36009i = iA6 + i15;
                    ((C) this.f36005e).e(iA5, oVar);
                    this.f36009i += iA5;
                    int i16 = (oVar.f9702a[0] >> 1) & 63;
                    if (i16 != 19 && i16 != 20) {
                        i10 = 0;
                    }
                    this.f36006f = i10;
                } else {
                    if (i14 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i14 != 49) {
                        throw D.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i14)), null);
                    }
                    byte[] bArr5 = oVar.f9702a;
                    if (bArr5.length < 3) {
                        throw D.b("Malformed FU header.", null);
                    }
                    int i17 = bArr5[1] & 7;
                    byte b11 = bArr5[2];
                    int i18 = b11 & Utf8.REPLACEMENT_BYTE;
                    boolean z12 = (b11 & 128) > 0;
                    boolean z13 = (b11 & 64) > 0;
                    o oVar4 = (o) obj;
                    if (z12) {
                        int i19 = this.f36009i;
                        oVar3.G(0);
                        int iA7 = oVar3.a();
                        C c11 = (C) this.f36005e;
                        c11.getClass();
                        c11.e(iA7, oVar3);
                        this.f36009i = iA7 + i19;
                        byte[] bArr6 = oVar.f9702a;
                        bArr6[1] = (byte) ((i18 << 1) & 127);
                        bArr6[2] = (byte) i17;
                        oVar4.getClass();
                        oVar4.E(bArr6.length, bArr6);
                        oVar4.G(1);
                    } else {
                        int i20 = (this.f36008h + 1) % Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        if (i5 != i20) {
                            int i21 = x.f9724a;
                            Locale locale2 = Locale.US;
                            k.w("RtpH265Reader", N0.a.e("Received RTP packet with unexpected sequence number. Expected: ", i20, "; received: ", i5, ". Dropping packet."));
                        } else {
                            oVar4.getClass();
                            oVar4.E(bArr5.length, bArr5);
                            oVar4.G(3);
                        }
                    }
                    int iA8 = oVar4.a();
                    ((C) this.f36005e).e(iA8, oVar4);
                    this.f36009i += iA8;
                    if (z13) {
                        this.f36006f = (i18 == 19 || i18 == 20) ? 1 : 0;
                    }
                }
                if (z2) {
                    if (this.f36007g == -9223372036854775807L) {
                        this.f36007g = j8;
                    }
                    ((C) this.f36005e).a(S3.f.N(this.f36010j, j8, 90000, this.f36007g), this.f36006f, this.f36009i, 0, null);
                    this.f36009i = 0;
                }
                this.f36008h = i5;
                return;
        }
    }

    @Override // h2.i
    public void c(s2.o oVar, int i5) {
        switch (this.f36001a) {
            case 0:
                C cMo0m = oVar.mo0m(i5, 2);
                this.f36005e = cMo0m;
                int i10 = x.f9724a;
                cMo0m.c(((C2691l) this.f36004d).f35621c);
                break;
            default:
                C cMo0m2 = oVar.mo0m(i5, 2);
                this.f36005e = cMo0m2;
                cMo0m2.c(((C2691l) this.f36004d).f35621c);
                break;
        }
    }

    @Override // h2.i
    public void d(long j8) {
        int i5 = this.f36001a;
    }

    public int g() {
        o oVar = (o) this.f36003c;
        oVar.G(0);
        int iA = oVar.a();
        C c10 = (C) this.f36005e;
        c10.getClass();
        c10.e(iA, oVar);
        return iA;
    }

    public e(C2691l c2691l, int i5) {
        this.f36001a = i5;
        switch (i5) {
            case 1:
                this.f36002b = new o();
                this.f36003c = new o(n.f10151a);
                this.f36004d = c2691l;
                this.f36007g = -9223372036854775807L;
                this.f36008h = -1;
                break;
            default:
                this.f36003c = new o(n.f10151a);
                this.f36004d = c2691l;
                this.f36002b = new o();
                this.f36007g = -9223372036854775807L;
                this.f36008h = -1;
                break;
        }
    }

    private final void e(long j8) {
    }

    private final void f(long j8) {
    }
}
