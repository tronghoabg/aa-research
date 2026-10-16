package L5;

import A7.AbstractC0279p0;
import E5.S;
import E5.T;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Arrays;
import k8.AbstractC3198g;
import l8.AbstractC3403E;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import l8.e0;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f6972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6973b;

    public f(int i5, e0 e0Var) {
        this.f6973b = i5;
        this.f6972a = e0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i5, Y4.b bVar) {
        a gVar;
        String str;
        int i10;
        int i11 = 4;
        AbstractC3437s.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = bVar.f16681c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (bVar.a() > 8) {
            int iF = bVar.f();
            int iF2 = bVar.f16680b + bVar.f();
            bVar.z(iF2);
            if (iF != 1414744396) {
                d dVar = null;
                switch (iF) {
                    case 1718776947:
                        if (i14 == 2) {
                            bVar.B(i11);
                            int iF3 = bVar.f();
                            int iF4 = bVar.f();
                            bVar.B(i11);
                            int iF5 = bVar.f();
                            switch (iF5) {
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
                                S s10 = new S();
                                s10.f3209p = iF3;
                                s10.f3210q = iF4;
                                s10.k = str;
                                gVar = new g(new T(s10));
                                break;
                            } else {
                                AbstractC0279p0.u(iF5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int iJ = bVar.j();
                                String str2 = iJ != 1 ? iJ != 85 ? iJ != 255 ? iJ != 8192 ? iJ != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iJ2 = bVar.j();
                                    int iF6 = bVar.f();
                                    bVar.B(6);
                                    int iO = v.o(bVar.v());
                                    int iJ3 = bVar.j();
                                    byte[] bArr = new byte[iJ3];
                                    bVar.c(i13, iJ3, bArr);
                                    S s11 = new S();
                                    s11.k = str2;
                                    s11.f3217x = iJ2;
                                    s11.f3218y = iF6;
                                    if ("audio/raw".equals(str2) && iO != 0) {
                                        s11.f3219z = iO;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iJ3 > 0) {
                                        s11.f3206m = AbstractC3409K.n(bArr);
                                    }
                                    gVar = new g(new T(s11));
                                    break;
                                } else {
                                    AbstractC0279p0.u(iJ, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                AbstractC4256a.E("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + v.t(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int iF7 = bVar.f();
                        bVar.B(8);
                        int iF8 = bVar.f();
                        int iF9 = bVar.f();
                        bVar.B(i11);
                        bVar.f();
                        bVar.B(12);
                        gVar = new c(iF7, iF8, iF9);
                        break;
                    case 1752331379:
                        int iF10 = bVar.f();
                        bVar.B(12);
                        bVar.f();
                        int iF11 = bVar.f();
                        int iF12 = bVar.f();
                        bVar.B(i11);
                        int iF13 = bVar.f();
                        int iF14 = bVar.f();
                        bVar.B(8);
                        dVar = new d(iF10, iF11, iF12, iF13, iF14);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(bVar.o(bVar.a(), AbstractC3198g.f39301c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(bVar.f(), bVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i16 = ((d) gVar).f6956a;
                    if (i16 == 1935960438) {
                        i14 = 2;
                    } else if (i16 != 1935963489) {
                        if (i16 != 1937012852) {
                            AbstractC4256a.E("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
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
                int iF15 = AbstractC3403E.f(objArrCopyOf.length, i17);
                if (iF15 > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF15);
                }
                objArrCopyOf[i15] = gVar;
                i15 = i17;
            }
            bVar.A(iF2);
            bVar.z(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i5, AbstractC3409K.h(i15, objArrCopyOf));
    }

    public final a a(Class cls) {
        C3407I c3407iListIterator = this.f6972a.listIterator(0);
        while (c3407iListIterator.hasNext()) {
            a aVar = (a) c3407iListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // L5.a
    public final int getType() {
        return this.f6973b;
    }
}
