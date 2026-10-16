package M2;

import J5.y;
import N1.C;
import N1.C0757f;
import N1.C0761j;
import N1.C0764m;
import N1.C0765n;
import Q1.x;
import Va.X7;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3406H;
import s2.AbstractC3991a;
import s2.C3993c;
import y3.C4552j;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7315a;

    static {
        int i5 = x.f9724a;
        f7315a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static b a(int i5, Q1.o oVar) {
        oVar.G(i5 + 12);
        oVar.H(1);
        b(oVar);
        oVar.H(2);
        int iU = oVar.u();
        if ((iU & 128) != 0) {
            oVar.H(2);
        }
        if ((iU & 64) != 0) {
            oVar.H(oVar.u());
        }
        if ((iU & 32) != 0) {
            oVar.H(2);
        }
        oVar.H(1);
        b(oVar);
        String strE = C.e(oVar.u());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new b(strE, null, -1L, -1L);
        }
        oVar.H(4);
        long jW = oVar.w();
        long jW2 = oVar.w();
        oVar.H(1);
        int iB = b(oVar);
        long j8 = jW2;
        byte[] bArr = new byte[iB];
        oVar.f(0, iB, bArr);
        if (j8 <= 0) {
            j8 = -1;
        }
        return new b(strE, bArr, j8, jW > 0 ? jW : -1L);
    }

    public static int b(Q1.o oVar) {
        int iU = oVar.u();
        int i5 = iU & 127;
        while ((iU & 128) == 128) {
            iU = oVar.u();
            i5 = (i5 << 7) | (iU & 127);
        }
        return i5;
    }

    public static int c(int i5) {
        return (i5 >> 24) & 255;
    }

    public static R1.e d(Q1.o oVar) {
        long jO;
        long jO2;
        oVar.G(8);
        if (c(oVar.h()) == 0) {
            jO = oVar.w();
            jO2 = oVar.w();
        } else {
            jO = oVar.o();
            jO2 = oVar.o();
        }
        return new R1.e(jO, jO2, oVar.w());
    }

    public static Pair e(Q1.o oVar, int i5, int i10) {
        Integer num;
        t tVar;
        Pair pairCreate;
        int i11;
        int i12;
        Integer num2;
        boolean z2;
        int i13 = oVar.f9703b;
        while (i13 - i5 < i10) {
            oVar.G(i13);
            int iH = oVar.h();
            AbstractC3991a.e("childAtomSize must be positive", iH > 0);
            if (oVar.h() == 1936289382) {
                int i14 = i13 + 8;
                int i15 = 0;
                int i16 = -1;
                Integer numValueOf = null;
                String strS = null;
                while (i14 - i13 < iH) {
                    oVar.G(i14);
                    int iH2 = oVar.h();
                    int iH3 = oVar.h();
                    if (iH3 == 1718775137) {
                        numValueOf = Integer.valueOf(oVar.h());
                    } else if (iH3 == 1935894637) {
                        oVar.H(4);
                        strS = oVar.s(4, StandardCharsets.UTF_8);
                    } else if (iH3 == 1935894633) {
                        i16 = i14;
                        i15 = iH2;
                    }
                    i14 += iH2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    AbstractC3991a.e("frma atom is mandatory", numValueOf != null);
                    AbstractC3991a.e("schi atom is mandatory", i16 != -1);
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            num = numValueOf;
                            tVar = null;
                            break;
                        }
                        oVar.G(i17);
                        int iH4 = oVar.h();
                        if (oVar.h() == 1952804451) {
                            int iC = c(oVar.h());
                            oVar.H(1);
                            if (iC == 0) {
                                oVar.H(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int iU = oVar.u();
                                i11 = iU & 15;
                                i12 = (iU & 240) >> 4;
                            }
                            if (oVar.u() == 1) {
                                num2 = numValueOf;
                                z2 = true;
                            } else {
                                num2 = numValueOf;
                                z2 = false;
                            }
                            int iU2 = oVar.u();
                            byte[] bArr2 = new byte[16];
                            oVar.f(0, 16, bArr2);
                            if (z2 && iU2 == 0) {
                                int iU3 = oVar.u();
                                byte[] bArr3 = new byte[iU3];
                                oVar.f(0, iU3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            tVar = new t(z2, strS, iU2, bArr2, i12, i11, bArr);
                        } else {
                            i17 += iH4;
                        }
                    }
                    AbstractC3991a.e("tenc atom is mandatory", tVar != null);
                    int i18 = x.f9724a;
                    pairCreate = Pair.create(num, tVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i13 += iH;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x02d3 A[PHI: r58
  0x02d3: PHI (r58v8 int) = (r58v7 int), (r58v11 int) binds: [B:167:0x02ce, B:162:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0a63 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M2.d f(Q1.o r62, int r63, int r64, java.lang.String r65, N1.C0761j r66, boolean r67) throws N1.D {
        /*
            Method dump skipped, instructions count: 3672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.g.f(Q1.o, int, int, java.lang.String, N1.j, boolean):M2.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        r22 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b7, code lost:
    
        r25 = r24;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05f6 A[ADDED_TO_REGION, LOOP:14: B:241:0x05f6->B:245:0x0602, LOOP_START, PHI: r19
  0x05f6: PHI (r19v6 int) = (r19v4 int), (r19v7 int) binds: [B:240:0x05f4, B:245:0x0602] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x093e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x05e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList g(R1.b r69, s2.s r70, long r71, N1.C0761j r73, boolean r74, boolean r75, k8.InterfaceC3199h r76) throws N1.D {
        /*
            Method dump skipped, instructions count: 2376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.g.g(R1.b, s2.s, long, N1.j, boolean, boolean, k8.h):java.util.ArrayList");
    }

    public static void h(Q1.o oVar, int i5, int i10, int i11, int i12, int i13, C0761j c0761j, d dVar, int i14) {
        int i15;
        int i16;
        C0761j c0761j2;
        String str;
        int i17;
        int i18;
        byte b5;
        String str2;
        int i19;
        List listN;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int iF;
        int i26;
        int iG;
        C0757f c0757f;
        C0757f c0757f2;
        int iG2;
        int i27;
        int i28;
        C0761j c0761j3;
        String str3;
        int i29;
        C4552j c4552j;
        int i30;
        int i31 = i10;
        int i32 = i11;
        C0761j c0761jC = c0761j;
        d dVar2 = dVar;
        int i33 = 7;
        oVar.G(i31 + 16);
        oVar.H(16);
        int iA = oVar.A();
        int iA2 = oVar.A();
        int i34 = 5;
        oVar.H(50);
        int i35 = oVar.f9703b;
        int i36 = 6;
        byte b10 = 3;
        int iIntValue = i5;
        int i37 = 12;
        if (iIntValue == 1701733238) {
            Pair pairE = e(oVar, i31, i32);
            if (pairE != null) {
                iIntValue = ((Integer) pairE.first).intValue();
                if (c0761jC == null) {
                    c0761jC = null;
                    i15 = 8;
                } else {
                    i15 = 8;
                    c0761jC = c0761jC.c(((t) pairE.second).f7432b);
                }
                ((t[]) dVar2.f7303d)[i14] = (t) pairE.second;
            } else {
                i15 = 8;
            }
            oVar.G(i35);
        } else {
            i15 = 8;
        }
        String str4 = "video/3gpp";
        String str5 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        int i38 = i15;
        int i39 = i38;
        float fY = 1.0f;
        X7 x72 = null;
        ByteBuffer byteBufferOrder = null;
        List listN2 = null;
        String str6 = null;
        byte[] bArrCopyOfRange = null;
        int i40 = -1;
        int i41 = -1;
        int iF2 = -1;
        int i42 = -1;
        int i43 = -1;
        b bVar = null;
        boolean z2 = false;
        while (i35 - i31 < i32) {
            oVar.G(i35);
            int i44 = oVar.f9703b;
            int iH = oVar.h();
            if (iH == 0 && oVar.f9703b - i31 == i32) {
                break;
            }
            String str7 = "childAtomSize must be positive";
            AbstractC3991a.e("childAtomSize must be positive", iH > 0);
            int iH2 = oVar.h();
            if (iH2 == 1635148611) {
                AbstractC3991a.e(null, str5 == null);
                oVar.G(i44 + 8);
                C3993c c3993cA = C3993c.a(oVar);
                dVar2.f7301b = c3993cA.f44862b;
                if (!z2) {
                    fY = c3993cA.k;
                }
                ArrayList arrayList = c3993cA.f44861a;
                String str8 = c3993cA.f44871l;
                int i45 = c3993cA.f44870j;
                int i46 = c3993cA.f44867g;
                int i47 = c3993cA.f44868h;
                int i48 = c3993cA.f44869i;
                int i49 = c3993cA.f44865e;
                i39 = c3993cA.f44866f;
                i38 = i49;
                c0761j2 = c0761jC;
                i16 = i35;
                str = str4;
                b5 = b10;
                iF2 = i46;
                i42 = i47;
                i17 = i40;
                i19 = i48;
                listN2 = arrayList;
                str5 = MimeTypes.VIDEO_H264;
                i18 = iIntValue;
                str6 = str8;
                i41 = i45;
            } else {
                if (iH2 == 1752589123) {
                    AbstractC3991a.e(null, str5 == null);
                    oVar.G(i44 + 8);
                    s2.t tVarA = s2.t.a(oVar, false, null);
                    dVar2.f7301b = tVarA.f44922b;
                    if (!z2) {
                        fY = tVarA.f44929i;
                    }
                    int i50 = tVarA.f44928h;
                    if (i50 != -1) {
                        i40 = i50;
                    }
                    List list = tVarA.f44921a;
                    int i51 = tVarA.f44930j;
                    String str9 = tVarA.k;
                    int i52 = tVarA.f44925e;
                    int i53 = tVarA.f44926f;
                    listN2 = list;
                    int i54 = tVarA.f44927g;
                    int i55 = tVarA.f44923c;
                    i39 = tVarA.f44924d;
                    c0761j2 = c0761jC;
                    i16 = i35;
                    iF2 = i52;
                    i42 = i53;
                    str = str4;
                    b5 = b10;
                    i17 = i40;
                    i38 = i55;
                    i41 = i51;
                    x72 = tVarA.f44931l;
                    i18 = iIntValue;
                    str5 = MimeTypes.VIDEO_H265;
                    i19 = i54;
                    str6 = str9;
                } else if (iH2 == 1818785347) {
                    AbstractC3991a.e("lhvC must follow hvcC atom", MimeTypes.VIDEO_H265.equals(str5));
                    AbstractC3991a.e("must have at least two layers", x72 != null && ((AbstractC3409K) x72.f13841a).size() >= 2);
                    oVar.G(i44 + 8);
                    x72.getClass();
                    s2.t tVarA2 = s2.t.a(oVar, true, x72);
                    AbstractC3991a.e("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", dVar2.f7301b == tVarA2.f44922b);
                    int i56 = tVarA2.f44925e;
                    int i57 = iF2;
                    if (i56 != -1) {
                        AbstractC3991a.e("colorSpace must be the same for both views", i57 == i56);
                    }
                    int i58 = tVarA2.f44926f;
                    int i59 = i42;
                    if (i58 != -1) {
                        AbstractC3991a.e("colorRange must be the same for both views", i59 == i58);
                    }
                    int i60 = tVarA2.f44927g;
                    if (i60 != -1) {
                        i30 = i43;
                        AbstractC3991a.e("colorTransfer must be the same for both views", i30 == i60);
                    } else {
                        i30 = i43;
                    }
                    int i61 = i38;
                    int i62 = i30;
                    AbstractC3991a.e("bitdepthLuma must be the same for both views", i61 == tVarA2.f44923c);
                    int i63 = i39;
                    AbstractC3991a.e("bitdepthChroma must be the same for both views", i63 == tVarA2.f44924d);
                    List list2 = listN2;
                    if (list2 != null) {
                        C3406H c3406hI = AbstractC3409K.i();
                        c3406hI.d(list2);
                        c3406hI.d(tVarA2.f44921a);
                        listN2 = c3406hI.g();
                        i16 = i35;
                    } else {
                        i16 = i35;
                        AbstractC3991a.e("initializationData must be already set from hvcC atom", false);
                        listN2 = list2;
                    }
                    str6 = tVarA2.k;
                    i19 = i62;
                    str5 = "video/mv-hevc";
                    c0761j2 = c0761jC;
                    i42 = i59;
                    i38 = i61;
                    str = str4;
                    b5 = b10;
                    i17 = i40;
                    i39 = i63;
                    iF2 = i57;
                    i18 = iIntValue;
                } else {
                    String str10 = str5;
                    i16 = i35;
                    List list3 = listN2;
                    int iF3 = iF2;
                    int iG3 = i43;
                    int i64 = i38;
                    int i65 = i39;
                    if (iH2 == 1986361461) {
                        oVar.G(i44 + 8);
                        int i66 = oVar.f9703b;
                        str = str4;
                        C4552j c4552j2 = null;
                        while (i66 - i44 < iH) {
                            oVar.G(i66);
                            int iH3 = oVar.h();
                            int i67 = i66;
                            AbstractC3991a.e(str7, iH3 > 0);
                            if (oVar.h() == 1702454643) {
                                oVar.G(i67 + 8);
                                int i68 = oVar.f9703b;
                                while (true) {
                                    if (i68 - i67 >= iH3) {
                                        c0761j3 = c0761jC;
                                        str3 = str7;
                                        i29 = iH3;
                                        c4552j = null;
                                        break;
                                    }
                                    oVar.G(i68);
                                    int iH4 = oVar.h();
                                    AbstractC3991a.e(str7, iH4 > 0);
                                    int i69 = i68;
                                    if (oVar.h() == 1937011305) {
                                        oVar.H(4);
                                        int iU = oVar.u();
                                        str3 = str7;
                                        i29 = iH3;
                                        c0761j3 = c0761jC;
                                        c4552j = new C4552j(new E4.j((iU & 1) == 1, (iU & 2) == 2, (iU & 8) == i15), 17);
                                    } else {
                                        i68 = i69 + iH4;
                                        i15 = 8;
                                    }
                                }
                                c4552j2 = c4552j;
                            } else {
                                c0761j3 = c0761jC;
                                str3 = str7;
                                i29 = iH3;
                            }
                            i66 = i67 + i29;
                            str7 = str3;
                            c0761jC = c0761j3;
                            i15 = 8;
                        }
                        c0761j2 = c0761jC;
                        S3.l lVar = c4552j2 == null ? null : new S3.l(c4552j2);
                        if (lVar != null) {
                            E4.j jVar = (E4.j) ((C4552j) lVar.f10967a).f48001b;
                            if (x72 == null || ((AbstractC3409K) x72.f13841a).size() < 2) {
                                i27 = i40;
                                if (i27 == -1) {
                                    i28 = jVar.f2898c ? i34 : 4;
                                } else {
                                    i28 = i27;
                                }
                                b5 = b10;
                                i38 = i64;
                                i17 = i28;
                                i39 = i65;
                                i15 = 8;
                                listN2 = list3;
                                iF2 = iF3;
                                i19 = iG3;
                                i18 = iIntValue;
                            } else {
                                AbstractC3991a.e("both eye views must be marked as available", jVar.f2896a && jVar.f2897b);
                                AbstractC3991a.e("for MV-HEVC, eye_views_reversed must be set to false", !jVar.f2898c);
                                i27 = i40;
                                i28 = i27;
                                b5 = b10;
                                i38 = i64;
                                i17 = i28;
                                i39 = i65;
                                i15 = 8;
                                listN2 = list3;
                                iF2 = iF3;
                                i19 = iG3;
                                i18 = iIntValue;
                            }
                        } else {
                            i27 = i40;
                            i28 = i27;
                            b5 = b10;
                            i38 = i64;
                            i17 = i28;
                            i39 = i65;
                            i15 = 8;
                            listN2 = list3;
                            iF2 = iF3;
                            i19 = iG3;
                            i18 = iIntValue;
                        }
                    } else {
                        c0761j2 = c0761jC;
                        str = str4;
                        int i70 = i40;
                        if (iH2 == 1685480259 || iH2 == 1685485123) {
                            i17 = i70;
                            i18 = iIntValue;
                            X7 x73 = x72;
                            b5 = b10;
                            i15 = 8;
                            D8.a aVarA = D8.a.a(oVar);
                            if (aVarA != null) {
                                str2 = "video/dolby-vision";
                                str6 = aVarA.f2562b;
                            } else {
                                str2 = str10;
                            }
                            x72 = x73;
                            i38 = i64;
                            listN2 = list3;
                            i39 = i65;
                            iF2 = iF3;
                            i19 = iG3;
                            str5 = str2;
                        } else {
                            if (iH2 == 1987076931) {
                                AbstractC3991a.e(null, str10 == null);
                                String str11 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                oVar.G(i44 + 12);
                                byte bU = (byte) oVar.u();
                                byte bU2 = (byte) oVar.u();
                                int iU2 = oVar.u();
                                int i71 = iU2 >> 4;
                                byte b11 = (byte) ((iU2 >> 1) & 7);
                                if (str11.equals("video/x-vnd.on2.vp9")) {
                                    byte[] bArr = Q1.a.f9659a;
                                    byte[] bArr2 = new byte[i37];
                                    bArr2[0] = 1;
                                    bArr2[1] = 1;
                                    bArr2[2] = bU;
                                    bArr2[b10] = 2;
                                    bArr2[4] = 1;
                                    bArr2[i34] = bU2;
                                    bArr2[i36] = b10;
                                    bArr2[i33] = 1;
                                    bArr2[8] = (byte) i71;
                                    bArr2[9] = 4;
                                    bArr2[10] = 1;
                                    bArr2[11] = b11;
                                    listN2 = AbstractC3409K.n(bArr2);
                                } else {
                                    listN2 = list3;
                                }
                                boolean z10 = (iU2 & 1) != 0;
                                int iU3 = oVar.u();
                                int iU4 = oVar.u();
                                iF2 = C0757f.f(iU3);
                                i42 = z10 ? 1 : 2;
                                iG2 = C0757f.g(iU4);
                                str5 = str11;
                                i17 = i70;
                                i18 = iIntValue;
                                i38 = i71;
                                i39 = i38;
                                b5 = b10;
                                i37 = 12;
                                i15 = 8;
                            } else if (iH2 == 1635135811) {
                                int i72 = iH - 8;
                                byte[] bArr3 = new byte[i72];
                                oVar.f(0, i72, bArr3);
                                listN2 = AbstractC3409K.n(bArr3);
                                oVar.G(i44 + 8);
                                byte[] bArr4 = oVar.f9702a;
                                y yVar = new y(bArr4, bArr4.length, 1, (byte) 0);
                                yVar.q(oVar.f9703b * 8);
                                yVar.u(1);
                                int i73 = yVar.i(b10);
                                yVar.t(i36);
                                boolean zH = yVar.h();
                                boolean zH2 = yVar.h();
                                int i74 = -1;
                                if (i73 == 2 && zH) {
                                    i20 = zH2 ? 12 : 10;
                                    i21 = zH2 ? 12 : 10;
                                } else if (i73 <= 2) {
                                    int i75 = zH ? 10 : 8;
                                    i21 = zH ? 10 : 8;
                                    i20 = i75;
                                } else {
                                    i20 = -1;
                                    i21 = -1;
                                }
                                yVar.t(13);
                                yVar.s();
                                int i76 = yVar.i(4);
                                if (i76 != 1) {
                                    Q1.k.o("BoxParsers", "Unsupported obu_type: " + i76);
                                    c0757f2 = new C0757f(-1, -1, -1, i20, i21, null);
                                } else if (yVar.h()) {
                                    Q1.k.o("BoxParsers", "Unsupported obu_extension_flag");
                                    c0757f2 = new C0757f(-1, -1, -1, i20, i21, null);
                                } else {
                                    boolean zH3 = yVar.h();
                                    yVar.s();
                                    if (!zH3 || yVar.i(8) <= 127) {
                                        int i77 = yVar.i(3);
                                        yVar.s();
                                        if (yVar.h()) {
                                            Q1.k.o("BoxParsers", "Unsupported reduced_still_picture_header");
                                            c0757f2 = new C0757f(-1, -1, -1, i20, i21, null);
                                        } else if (yVar.h()) {
                                            Q1.k.o("BoxParsers", "Unsupported timing_info_present_flag");
                                            c0757f2 = new C0757f(-1, -1, -1, i20, i21, null);
                                        } else if (yVar.h()) {
                                            Q1.k.o("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                            c0757f2 = new C0757f(-1, -1, -1, i20, i21, null);
                                        } else {
                                            int i78 = i34;
                                            int i79 = yVar.i(i78);
                                            int i80 = 0;
                                            while (i80 <= i79) {
                                                yVar.t(12);
                                                if (yVar.i(i78) > i33) {
                                                    yVar.s();
                                                }
                                                i80++;
                                                i33 = 7;
                                            }
                                            i22 = 12;
                                            int i81 = yVar.i(4);
                                            int i82 = yVar.i(4);
                                            yVar.t(i81 + 1);
                                            yVar.t(i82 + 1);
                                            if (yVar.h()) {
                                                yVar.t(7);
                                            }
                                            yVar.t(7);
                                            boolean zH4 = yVar.h();
                                            if (zH4) {
                                                yVar.t(2);
                                            }
                                            if (yVar.h()) {
                                                i23 = 1;
                                                i24 = 2;
                                            } else {
                                                i23 = 1;
                                                i24 = yVar.i(1);
                                            }
                                            if (i24 > 0 && !yVar.h()) {
                                                yVar.t(i23);
                                            }
                                            if (zH4) {
                                                i25 = 3;
                                                yVar.t(3);
                                            } else {
                                                i25 = 3;
                                            }
                                            yVar.t(i25);
                                            boolean zH5 = yVar.h();
                                            if (i77 == 2 && zH5) {
                                                yVar.s();
                                            }
                                            boolean z11 = i77 != 1 && yVar.h();
                                            if (yVar.h()) {
                                                int i83 = yVar.i(8);
                                                int i84 = yVar.i(8);
                                                int i85 = (!z11 && i83 == 1 && i84 == 13 && yVar.i(8) == 0) ? 1 : yVar.i(1);
                                                iF = C0757f.f(i83);
                                                i26 = i21;
                                                i74 = i85 == 1 ? 1 : 2;
                                                iG = C0757f.g(i84);
                                            } else {
                                                iF = -1;
                                                i26 = i21;
                                                iG = -1;
                                            }
                                            c0757f = new C0757f(iF, i74, iG, i20, i26, null);
                                            int i86 = c0757f.f8154e;
                                            int i87 = c0757f.f8155f;
                                            int i88 = c0757f.f8150a;
                                            int i89 = c0757f.f8151b;
                                            iG2 = c0757f.f8152c;
                                            i38 = i86;
                                            i17 = i70;
                                            i39 = i87;
                                            iF2 = i88;
                                            i18 = iIntValue;
                                            i42 = i89;
                                            i37 = i22;
                                            b5 = 3;
                                            i15 = 8;
                                            str5 = MimeTypes.VIDEO_AV1;
                                        }
                                    } else {
                                        Q1.k.o("BoxParsers", "Excessive obu_size");
                                        c0757f2 = new C0757f(-1, -1, -1, i20, i21, null);
                                    }
                                }
                                c0757f = c0757f2;
                                i22 = 12;
                                int i862 = c0757f.f8154e;
                                int i872 = c0757f.f8155f;
                                int i882 = c0757f.f8150a;
                                int i892 = c0757f.f8151b;
                                iG2 = c0757f.f8152c;
                                i38 = i862;
                                i17 = i70;
                                i39 = i872;
                                iF2 = i882;
                                i18 = iIntValue;
                                i42 = i892;
                                i37 = i22;
                                b5 = 3;
                                i15 = 8;
                                str5 = MimeTypes.VIDEO_AV1;
                            } else {
                                i37 = 12;
                                if (iH2 == 1668050025) {
                                    if (byteBufferOrder == null) {
                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer = byteBufferOrder;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(oVar.r());
                                    byteBuffer.putShort(oVar.r());
                                    byteBufferOrder = byteBuffer;
                                    i17 = i70;
                                    i18 = iIntValue;
                                    i38 = i64;
                                    i39 = i65;
                                    b5 = 3;
                                    i15 = 8;
                                    listN2 = list3;
                                    iF2 = iF3;
                                    i19 = iG3;
                                } else {
                                    if (iH2 == 1835295606) {
                                        if (byteBufferOrder == null) {
                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer2 = byteBufferOrder;
                                        short sR = oVar.r();
                                        short sR2 = oVar.r();
                                        short sR3 = oVar.r();
                                        short sR4 = oVar.r();
                                        short sR5 = oVar.r();
                                        i18 = iIntValue;
                                        short sR6 = oVar.r();
                                        X7 x74 = x72;
                                        short sR7 = oVar.r();
                                        listN = list3;
                                        short sR8 = oVar.r();
                                        long jW = oVar.w();
                                        long jW2 = oVar.w();
                                        i17 = i70;
                                        byteBuffer2.position(1);
                                        byteBuffer2.putShort(sR5);
                                        byteBuffer2.putShort(sR6);
                                        byteBuffer2.putShort(sR);
                                        byteBuffer2.putShort(sR2);
                                        byteBuffer2.putShort(sR3);
                                        byteBuffer2.putShort(sR4);
                                        byteBuffer2.putShort(sR7);
                                        byteBuffer2.putShort(sR8);
                                        byteBuffer2.putShort((short) (jW / 10000));
                                        byteBuffer2.putShort((short) (jW2 / 10000));
                                        byteBufferOrder = byteBuffer2;
                                        x72 = x74;
                                        b5 = 3;
                                        i15 = 8;
                                    } else {
                                        listN = list3;
                                        i17 = i70;
                                        i18 = iIntValue;
                                        X7 x75 = x72;
                                        if (iH2 == 1681012275) {
                                            AbstractC3991a.e(null, str10 == null);
                                            x72 = x75;
                                            b5 = 3;
                                            i15 = 8;
                                            i38 = i64;
                                            listN2 = listN;
                                            i39 = i65;
                                            iF2 = iF3;
                                            i19 = iG3;
                                            str5 = str;
                                        } else if (iH2 == 1702061171) {
                                            AbstractC3991a.e(null, str10 == null);
                                            b bVarA = a(i44, oVar);
                                            byte[] bArr5 = bVarA.f7297b;
                                            if (bArr5 != null) {
                                                listN = AbstractC3409K.n(bArr5);
                                            }
                                            bVar = bVarA;
                                            x72 = x75;
                                            i15 = 8;
                                            i38 = i64;
                                            listN2 = listN;
                                            i39 = i65;
                                            iF2 = iF3;
                                            i19 = iG3;
                                            str5 = bVarA.f7296a;
                                            b5 = 3;
                                        } else if (iH2 == 1885434736) {
                                            i15 = 8;
                                            oVar.G(i44 + 8);
                                            fY = oVar.y() / oVar.y();
                                            x72 = x75;
                                            b5 = 3;
                                            z2 = true;
                                        } else {
                                            i15 = 8;
                                            if (iH2 == 1937126244) {
                                                int i90 = i44 + 8;
                                                while (true) {
                                                    if (i90 - i44 >= iH) {
                                                        bArrCopyOfRange = null;
                                                        break;
                                                    }
                                                    oVar.G(i90);
                                                    int iH5 = oVar.h();
                                                    if (oVar.h() == 1886547818) {
                                                        bArrCopyOfRange = Arrays.copyOfRange(oVar.f9702a, i90, iH5 + i90);
                                                        break;
                                                    }
                                                    i90 += iH5;
                                                }
                                                x72 = x75;
                                                b5 = 3;
                                            } else if (iH2 == 1936995172) {
                                                int iU5 = oVar.u();
                                                b5 = 3;
                                                oVar.H(3);
                                                if (iU5 == 0) {
                                                    int iU6 = oVar.u();
                                                    if (iU6 == 0) {
                                                        i17 = 0;
                                                    } else if (iU6 == 1) {
                                                        i17 = 1;
                                                    } else if (iU6 == 2) {
                                                        i17 = 2;
                                                    } else if (iU6 == 3) {
                                                        i17 = 3;
                                                    }
                                                }
                                                x72 = x75;
                                            } else {
                                                b5 = 3;
                                                if (iH2 == 1668246642 && iF3 == -1 && iG3 == -1) {
                                                    int iH6 = oVar.h();
                                                    if (iH6 == 1852009592 || iH6 == 1852009571) {
                                                        int iA3 = oVar.A();
                                                        int iA4 = oVar.A();
                                                        oVar.H(2);
                                                        boolean z12 = iH == 19 && (oVar.u() & 128) != 0;
                                                        iF3 = C0757f.f(iA3);
                                                        i42 = z12 ? 1 : 2;
                                                        iG3 = C0757f.g(iA4);
                                                        x72 = x75;
                                                    } else {
                                                        Q1.k.w("BoxParsers", "Unsupported color type: " + H5.a.f(iH6));
                                                        x72 = x75;
                                                    }
                                                } else {
                                                    x72 = x75;
                                                }
                                            }
                                        }
                                    }
                                    i38 = i64;
                                    listN2 = listN;
                                    i39 = i65;
                                    iF2 = iF3;
                                    i19 = iG3;
                                    str5 = str10;
                                }
                            }
                            i19 = iG2;
                        }
                    }
                    str5 = str10;
                }
                i31 = i10;
                b10 = b5;
                i35 = i16 + iH;
                iIntValue = i18;
                str4 = str;
                c0761jC = c0761j2;
                i40 = i17;
                i33 = 7;
                i34 = 5;
                i36 = 6;
                dVar2 = dVar;
                i43 = i19;
                i32 = i11;
            }
            i31 = i10;
            b10 = b5;
            i35 = i16 + iH;
            iIntValue = i18;
            str4 = str;
            c0761jC = c0761j2;
            i40 = i17;
            i33 = 7;
            i34 = 5;
            i36 = 6;
            dVar2 = dVar;
            i43 = i19;
            i32 = i11;
        }
        C0761j c0761j4 = c0761jC;
        String str12 = str5;
        int i91 = i40;
        int i92 = iF2;
        int i93 = i43;
        int i94 = i39;
        List list4 = listN2;
        int i95 = i38;
        if (str12 == null) {
            return;
        }
        C0764m c0764m = new C0764m();
        c0764m.f8183a = Integer.toString(i12);
        c0764m.f8194m = C.m(str12);
        c0764m.f8192j = str6;
        c0764m.f8201t = iA;
        c0764m.f8202u = iA2;
        c0764m.f8205x = fY;
        c0764m.f8204w = i13;
        c0764m.f8206y = bArrCopyOfRange;
        c0764m.f8207z = i91;
        c0764m.f8197p = list4;
        c0764m.f8196o = i41;
        c0764m.f8198q = c0761j4;
        c0764m.f8172A = new C0757f(i92, i42, i93, i95, i94, byteBufferOrder != null ? byteBufferOrder.array() : null);
        b bVar2 = bVar;
        if (bVar2 != null) {
            c0764m.f8190h = S3.f.F(bVar2.f7298c);
            c0764m.f8191i = S3.f.F(bVar2.f7299d);
        }
        dVar.f7304e = new C0765n(c0764m);
    }
}
