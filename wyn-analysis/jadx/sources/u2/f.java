package u2;

import N1.C;
import N1.C0764m;
import N1.C0765n;
import Q1.k;
import Q1.o;
import Q1.x;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import l8.AbstractC3403E;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class f implements InterfaceC4238a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f46559a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46560b;

    public f(int i5, e0 e0Var) {
        this.f46560b = i5;
        this.f46559a = e0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i5, o oVar) {
        InterfaceC4238a gVar;
        String str;
        int i10;
        int i11 = 4;
        AbstractC3437s.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = oVar.f9704c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (oVar.a() > 8) {
            int iJ = oVar.j();
            int iJ2 = oVar.f9703b + oVar.j();
            oVar.F(iJ2);
            if (iJ != 1414744396) {
                d dVar = null;
                switch (iJ) {
                    case 1718776947:
                        if (i14 == 2) {
                            oVar.H(i11);
                            int iJ3 = oVar.j();
                            int iJ4 = oVar.j();
                            oVar.H(i11);
                            int iJ5 = oVar.j();
                            switch (iJ5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                C0764m c0764m = new C0764m();
                                c0764m.f8201t = iJ3;
                                c0764m.f8202u = iJ4;
                                c0764m.f8194m = C.m(str);
                                gVar = new g(new C0765n(c0764m));
                                break;
                            } else {
                                N0.a.o(iJ5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int iN = oVar.n();
                                String str2 = iN != 1 ? iN != 85 ? iN != 255 ? iN != 8192 ? iN != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iN2 = oVar.n();
                                    int iJ6 = oVar.j();
                                    oVar.H(6);
                                    int iY = x.y(oVar.n());
                                    int iN3 = oVar.a() > 0 ? oVar.n() : i13;
                                    byte[] bArr = new byte[iN3];
                                    oVar.f(i13, iN3, bArr);
                                    C0764m c0764m2 = new C0764m();
                                    c0764m2.f8194m = C.m(str2);
                                    c0764m2.f8173B = iN2;
                                    c0764m2.f8174C = iJ6;
                                    if ("audio/raw".equals(str2) && iY != 0) {
                                        c0764m2.f8175D = iY;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iN3 > 0) {
                                        c0764m2.f8197p = AbstractC3409K.n(bArr);
                                    }
                                    gVar = new g(new C0765n(c0764m2));
                                    break;
                                } else {
                                    N0.a.o(iN, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                k.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + x.C(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int iJ7 = oVar.j();
                        oVar.H(8);
                        int iJ8 = oVar.j();
                        int iJ9 = oVar.j();
                        oVar.H(i11);
                        oVar.j();
                        oVar.H(12);
                        gVar = new c(iJ7, iJ8, iJ9);
                        break;
                    case 1752331379:
                        int iJ10 = oVar.j();
                        oVar.H(12);
                        oVar.j();
                        int iJ11 = oVar.j();
                        int iJ12 = oVar.j();
                        oVar.H(i11);
                        int iJ13 = oVar.j();
                        int iJ14 = oVar.j();
                        oVar.H(8);
                        dVar = new d(iJ10, iJ11, iJ12, iJ13, iJ14);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(oVar.s(oVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(oVar.j(), oVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i16 = ((d) gVar).f46542a;
                    if (i16 == 1935960438) {
                        i14 = 2;
                    } else if (i16 != 1935963489) {
                        if (i16 != 1937012852) {
                            k.w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
                            i10 = -1;
                        } else {
                            i10 = 3;
                        }
                        i14 = i10;
                    } else {
                        i14 = 1;
                    }
                }
                int i17 = i15 + 1;
                int iF = AbstractC3403E.f(objArrCopyOf.length, i17);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i15] = gVar;
                i15 = i17;
            }
            oVar.G(iJ2);
            oVar.F(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i5, AbstractC3409K.h(i15, objArrCopyOf));
    }

    public final InterfaceC4238a a(Class cls) {
        C3407I c3407iListIterator = this.f46559a.listIterator(0);
        while (c3407iListIterator.hasNext()) {
            InterfaceC4238a interfaceC4238a = (InterfaceC4238a) c3407iListIterator.next();
            if (interfaceC4238a.getClass() == cls) {
                return interfaceC4238a;
            }
        }
        return null;
    }

    @Override // u2.InterfaceC4238a
    public final int getType() {
        return this.f46560b;
    }
}
