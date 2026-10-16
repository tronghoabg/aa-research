package defpackage;

import android.graphics.Color;
import android.util.Pair;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.DataFormatException;

/* loaded from: classes3.dex */
public final class ukx implements uko {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/model/VectorTile");
    public static final abnj b;
    public final ukq c;
    public final yfq d;
    public final yfq e;
    public final List g;
    public final abct h;
    public final byte[] i;
    public final abfg j;
    public final yfq k;
    public final yfq l;
    public final abbm[] m;
    public final abgl n;
    public toz o;
    public final int r;
    public final byte[] s;
    public final yfy t;
    private pka v;
    public volatile Boolean u = null;
    public final int f = -1;
    public final byte[] p = null;
    public final boolean q = false;

    static {
        abnj abnjVar = new abnj();
        abnjVar.c(abbf.a);
        abnjVar.c(abbf.b);
        abnjVar.c(abbf.c);
        abnjVar.c(abbf.d);
        abnjVar.c(abbf.e);
        abnjVar.c(abbf.f);
        abnjVar.c(abbf.g);
        abnjVar.c(abbf.h);
        abnjVar.c(abbf.i);
        abnjVar.c(abbf.j);
        abnjVar.c(abbf.k);
        abnjVar.c(abbf.l);
        abnjVar.c(abbf.m);
        abnjVar.c(abbf.n);
        abnjVar.c(abbf.o);
        abnjVar.c(abbf.p);
        abnjVar.c(abbf.q);
        abnjVar.c(abbf.r);
        abnjVar.c(abbf.s);
        abnjVar.c(abbf.t);
        abnjVar.c(abbf.u);
        abnjVar.c(abbf.v);
        abnjVar.c(abbf.w);
        abnjVar.c(abbf.x);
        abnjVar.c(abbf.y);
        abnjVar.c(abbf.z);
        abnjVar.c(abbf.A);
        abnjVar.c(abbf.B);
        abnjVar.c(abbf.C);
        abnjVar.c(abbf.D);
        abnjVar.c(abbf.E);
        abnjVar.c(abbf.F);
        abnjVar.c(abbf.G);
        abnjVar.c(abbf.H);
        abnjVar.c(abbf.I);
        abnjVar.c(abbf.J);
        abnjVar.c(abbf.K);
        abnjVar.c(abbf.L);
        abnjVar.c(abbf.M);
        abnjVar.c(abbf.N);
        abnjVar.c(abbf.O);
        abnjVar.c(abbf.P);
        abnjVar.c(abbf.Q);
        abnjVar.c(abbf.R);
        abnjVar.c(abbf.S);
        abnjVar.c(abbf.T);
        abnjVar.c(abbf.U);
        abnjVar.c(abbf.V);
        abnjVar.c(abbf.W);
        abnjVar.c(abbf.X);
        abnjVar.c(abbf.Y);
        abnjVar.c(abbf.Z);
        abnjVar.c(abbf.aa);
        abnjVar.c(abbf.ab);
        abnjVar.c(abbf.ac);
        abnjVar.c(abbf.ad);
        abnjVar.c(abbf.ae);
        abnjVar.c(abbf.af);
        abnjVar.c(abbf.ag);
        abnjVar.c(abbf.ah);
        abnjVar.c(abbf.ai);
        abnjVar.c(abbf.aj);
        abnjVar.c(abbf.ak);
        abnjVar.c(abbf.al);
        abnjVar.c(abbf.am);
        abnjVar.c(abbf.an);
        abnjVar.c(abbf.ao);
        abnjVar.c(abbf.ap);
        abnjVar.c(abbf.aq);
        abnjVar.c(abbf.ar);
        abnjVar.c(abbf.as);
        abnjVar.c(abbf.at);
        abnjVar.c(abbf.au);
        abnjVar.c(abcz.a);
        abnjVar.c(abcz.b);
        abnjVar.c(abcz.c);
        abnjVar.c(abcz.d);
        abnjVar.c(abcz.e);
        abnjVar.c(abcz.f);
        abnjVar.c(abcz.g);
        abnjVar.c(abcz.h);
        abnjVar.c(abcz.i);
        abnjVar.c(abcz.j);
        abnjVar.c(abcz.k);
        abnjVar.c(abcz.l);
        abnjVar.c(abcz.m);
        abnjVar.c(abcz.n);
        abnjVar.c(aazn.a);
        abnjVar.c(abbh.a);
        abnjVar.c(abdj.b);
        abnjVar.c(abcm.b);
        abnjVar.c(abdn.b);
        abnjVar.c(abdn.c);
        abnjVar.c(abdn.d);
        abnjVar.c(abdn.e);
        abnjVar.c(abdn.f);
        abnjVar.c(abdn.g);
        abnjVar.c(abdn.h);
        abnjVar.c(abdn.i);
        abnjVar.c(abdn.j);
        abnjVar.c(abdn.k);
        abnjVar.c(abdn.l);
        abnjVar.c(abdn.m);
        abnjVar.c(abdn.n);
        abnjVar.c(abdn.o);
        abnjVar.c(abdn.p);
        abnjVar.c(abdn.q);
        abnjVar.c(abdn.r);
        abnjVar.c(abdn.s);
        abnjVar.c(abdn.t);
        abnjVar.c(abdn.u);
        abnjVar.c(abdn.v);
        abnjVar.c(abdn.w);
        abnjVar.c(abdn.x);
        abnjVar.c(abdn.y);
        abnjVar.c(abdn.z);
        abnjVar.c(abdn.A);
        abnjVar.c(abdn.B);
        abnjVar.c(abdn.C);
        abnjVar.c(abdn.D);
        abnjVar.c(abdn.E);
        abnjVar.c(abdn.F);
        abnjVar.c(abdn.G);
        abnjVar.c(abdn.H);
        abnjVar.c(abdn.I);
        abnjVar.c(abdn.J);
        abnjVar.c(abdn.K);
        abnjVar.c(abdn.L);
        abnjVar.c(abdn.M);
        abnjVar.c(abdn.N);
        abnjVar.c(abdn.O);
        abnjVar.c(abdn.P);
        abnjVar.c(abdn.Q);
        abnjVar.c(abdn.R);
        abnjVar.c(abdn.S);
        abnjVar.c(abdn.T);
        abnjVar.c(abdn.U);
        abnjVar.c(abdn.V);
        abnjVar.c(abdn.W);
        abnjVar.c(abdn.X);
        abnjVar.c(abdn.Y);
        abnjVar.c(abdn.Z);
        abnjVar.c(abdn.aa);
        abnjVar.c(abdn.ab);
        abnjVar.c(abdn.ac);
        abnjVar.c(abdn.ad);
        abnjVar.c(abdn.ae);
        abnjVar.c(abdn.af);
        abnjVar.c(abdn.ag);
        abnjVar.c(abdn.ah);
        b = abnjVar;
    }

    public ukx(ukq ukqVar, pka pkaVar, abgl abglVar, yfq yfqVar, yfq yfqVar2, List list, abct abctVar, byte[] bArr, abfg abfgVar, yfq yfqVar3, yfq yfqVar4, abbm[] abbmVarArr, byte[] bArr2, int i, toz tozVar, yfy yfyVar) {
        this.c = ukqVar;
        this.v = pkaVar;
        this.n = abglVar;
        this.d = yfqVar;
        this.e = yfqVar2;
        this.g = list;
        this.h = abctVar;
        this.i = bArr;
        this.j = abfgVar;
        this.k = yfqVar3;
        this.l = yfqVar4;
        this.s = bArr2;
        this.r = i;
        this.o = tozVar;
        this.m = abbmVarArr;
        this.t = yfyVar;
    }

    static void h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 95);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [erb] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r45v0, types: [abnv, pka] */
    /* JADX WARN: Type inference failed for: r45v1, types: [uxe] */
    /* JADX WARN: Type inference failed for: r45v12, types: [uxe] */
    /* JADX WARN: Type inference failed for: r45v13 */
    /* JADX WARN: Type inference failed for: r45v14 */
    /* JADX WARN: Type inference failed for: r45v15 */
    /* JADX WARN: Type inference failed for: r45v16 */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r45v24 */
    /* JADX WARN: Type inference failed for: r45v25 */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r45v4, types: [uxe] */
    /* JADX WARN: Type inference failed for: r45v5 */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r45v7 */
    /* JADX WARN: Type inference failed for: r45v8 */
    /* JADX WARN: Type inference failed for: r45v9 */
    @ResultIgnorabilityUnspecified
    public static uku k(pka pkaVar, abgl abglVar, ukp ukpVar, byte[] bArr, boolean z, erb erbVar, toz tozVar, Iterable iterable, boolean z2) {
        uku ukuVarA;
        int iA;
        byte[] bArrE;
        uxe uxeVar;
        yfq yfqVarG;
        int i;
        int i2;
        byte[] bArr2;
        InputStream sequenceInputStream;
        abbe abbeVar;
        byte[] bArr3;
        int i3;
        uxe uxeVar2;
        uku ukuVar;
        ukq ukqVar;
        byte[] bArr4;
        ukq ukqVar2;
        yfq yfqVar;
        byte[] bArr5;
        abbm[] abbmVarArr;
        byte[] bArr6;
        int i4;
        yfq yfqVarG2;
        yfq yfqVar2;
        ukq ukqVar3;
        yfq yfqVar3;
        byte[] bArr7;
        Iterator it;
        abbm[] abbmVarArr2;
        byte[] bArr8;
        int i5;
        abfg abfgVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        yfy yfyVarD;
        ?? r1 = erbVar;
        byte[] bArr9 = z ? (byte[]) bArr.clone() : bArr;
        xuv xuvVarD = xuw.d("VectorTile.unpack ", abglVar);
        try {
            try {
                uxe uxeVarA = uxg.a();
                try {
                    h(bArr9);
                    int length = bArr9.length;
                    if (z) {
                        uxi.c(bArr9, length, uxeVarA);
                        bArrE = uxeVarA.e();
                        iA = uxeVarA.a();
                    } else {
                        iA = length;
                        bArrE = bArr9;
                    }
                    int i6 = 4;
                    try {
                        if (z2) {
                            try {
                                xuh xuhVarR = uqw.r(bArrE, 0, iA);
                                if (xuhVarR == null) {
                                    int i7 = yfq.d;
                                    yfqVarG = yls.a;
                                } else {
                                    yfl yflVar = new yfl(4);
                                    while (xuhVarR != null) {
                                        yflVar.i(xuhVarR);
                                        int i8 = xuhVarR.a + xuhVarR.b;
                                        xuhVarR = uqw.r(bArrE, i8, iA - i8);
                                    }
                                    yfqVarG = yflVar.g();
                                }
                                int i9 = ((yls) yfqVarG).c;
                                int i10 = 0;
                                for (int i11 = 0; i11 < i9; i11++) {
                                    i10 += ((xuh) yfqVarG.get(i11)).b;
                                }
                                byte[] bArr10 = new byte[i10];
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < i9) {
                                    int i14 = i6;
                                    xuh xuhVar = (xuh) yfqVarG.get(i12);
                                    int i15 = xuhVar.a;
                                    int i16 = xuhVar.b;
                                    System.arraycopy(bArrE, i15, bArr10, i13, i16);
                                    i13 += i16;
                                    i12++;
                                    i6 = i14;
                                }
                                i = i6;
                                i2 = -1;
                                abbe abbeVar2 = abbe.a;
                                abpc abpcVarL = abnv.L(abbe.class);
                                if (yfqVarG.isEmpty()) {
                                    sequenceInputStream = new ByteArrayInputStream(bArrE, 0, iA);
                                    uxeVar = uxeVarA;
                                    bArr2 = bArr10;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    ynp ynpVarListIterator = yfqVarG.listIterator(0);
                                    int i17 = 0;
                                    while (ynpVarListIterator.hasNext()) {
                                        xuh xuhVar2 = (xuh) ynpVarListIterator.next();
                                        uxe uxeVar3 = uxeVarA;
                                        arrayList3.add(new ByteArrayInputStream(bArrE, i17, xuhVar2.c - i17));
                                        i17 = xuhVar2.a + xuhVar2.b;
                                        uxeVarA = uxeVar3;
                                        bArr10 = bArr10;
                                    }
                                    uxeVar = uxeVarA;
                                    bArr2 = bArr10;
                                    xuh xuhVar3 = (xuh) yfqVarG.get(i9 - 1);
                                    if (xuhVar3.a + xuhVar3.b < iA) {
                                        arrayList3.add(new ByteArrayInputStream(bArrE, i17, iA - i17));
                                    }
                                    sequenceInputStream = new SequenceInputStream(Collections.enumeration(arrayList3));
                                }
                                abbeVar = (abbe) abpcVarL.i(sequenceInputStream, b);
                                bArr3 = bArr2;
                            } catch (abon e) {
                                e = e;
                                uxeVar = uxeVarA;
                                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                                uku ukuVar2 = new uku(ukt.a, xvy.a);
                                uxg.b(pkaVar);
                                ukuVarA = ukuVar2;
                                xuvVarD.close();
                                return ukuVarA;
                            } catch (IndexOutOfBoundsException e2) {
                                e = e2;
                                uxeVar = uxeVarA;
                                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                                uku ukuVar22 = new uku(ukt.a, xvy.a);
                                uxg.b(pkaVar);
                                ukuVarA = ukuVar22;
                                xuvVarD.close();
                                return ukuVarA;
                            } catch (DataFormatException e3) {
                                e = e3;
                                uxeVar = uxeVarA;
                                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                                uku ukuVar222 = new uku(ukt.a, xvy.a);
                                uxg.b(pkaVar);
                                ukuVarA = ukuVar222;
                                xuvVarD.close();
                                return ukuVarA;
                            } catch (Throwable th) {
                                th = th;
                                uxeVar = uxeVarA;
                                pkaVar = uxeVar;
                                uxg.b(pkaVar);
                                throw th;
                            }
                        } else {
                            uxeVar = uxeVarA;
                            i = 4;
                            i2 = -1;
                            abbe abbeVar3 = abbe.a;
                            abbeVar = (abbe) abnv.L(abbe.class).k(bArrE, 0, iA, b);
                            bArr3 = null;
                        }
                        String str = "psm";
                        if (abglVar != abgl.GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS) {
                            str = "m";
                        }
                        Iterator it2 = abbeVar.o.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                abcx abcxVar = (abcx) it2.next();
                                if (str.equals(abcxVar.b)) {
                                    i3 = abcxVar.c;
                                    break;
                                }
                            } else {
                                i3 = abbeVar.o.size() > 0 ? ((abcx) abbeVar.o.get(0)).c : i2;
                            }
                        }
                        if (i3 == i2) {
                            i3 = (pkaVar.b & 8) != 0 ? pkaVar.f : -1;
                        }
                        abnp abnpVarK = pkaVar.K();
                        byte b2 = (byte) abbeVar.n;
                        abnpVarK.t();
                        pka pkaVar2 = (pka) abnpVarK.b;
                        pkaVar2.b |= 128;
                        pkaVar2.j = b2;
                        if (i3 != -1) {
                            abnpVarK.t();
                            pka pkaVar3 = (pka) abnpVarK.b;
                            pkaVar3.b |= 8;
                            pkaVar3.f = i3;
                        }
                        if ((pkaVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                            abnh abnhVar = aazn.a;
                            abbeVar.j(abnhVar);
                            abnl abnlVar = abbeVar.w;
                            abnu abnuVar = abnhVar.d;
                            if (abnlVar.m(abnuVar)) {
                                abbeVar.j(abnhVar);
                                Object objJ = abbeVar.w.j(abnuVar);
                                String str2 = (String) (objJ == null ? abnhVar.b : abnhVar.c(objJ));
                                abnpVarK.t();
                                pka pkaVar4 = (pka) abnpVarK.b;
                                str2.getClass();
                                pkaVar4.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                                pkaVar4.l = str2;
                            }
                        }
                        if ((pkaVar.b & 256) == 0 && (abbeVar.b & 4) != 0) {
                            int i18 = abbeVar.e;
                            abnpVarK.t();
                            pka pkaVar5 = (pka) abnpVarK.b;
                            pkaVar5.b |= 256;
                            pkaVar5.k = i18;
                        }
                        try {
                            pka pkaVar6 = (pka) abnpVarK.q();
                            int length2 = bArr9.length;
                            int iL = l(pkaVar6, abbeVar);
                            try {
                                uis uisVarK = ukh.k(abbeVar.d, z2);
                                abez abezVar = abbeVar.c;
                                if (abezVar == null) {
                                    abezVar = abez.a;
                                }
                                int iAy = a.ay(abezVar.b);
                                int i19 = iAy == 0 ? 1 : iAy;
                                abez abezVar2 = abbeVar.c;
                                if (abezVar2 == null) {
                                    abezVar2 = abez.a;
                                }
                                int iAq = wox.aq(abezVar2.c);
                                ukqVar = new ukq(ukpVar, uisVarK, iL, i19, iAq == 0 ? 1 : iAq);
                                try {
                                    vaq.c(abglVar);
                                } catch (IOException e4) {
                                    e = e4;
                                    pkaVar = uxeVar;
                                }
                            } catch (IOException e5) {
                                uxeVar2 = uxeVar;
                                ((ynz) ((ynz) ((ynz) a.h()).p(e5)).ai((char) 9402)).u("Error unpacking style table entries in tile");
                                ukuVar = new uku(ukt.b, xvy.a);
                            }
                            try {
                                int iL2 = l(pkaVar6, abbeVar);
                                abbm[] abbmVarArr3 = (abbm[]) abbeVar.p.toArray(new abbm[0]);
                                byte[] bArrD = ukh.e;
                                if ((pkaVar6.b & 2048) != 0) {
                                    bArrD = pkaVar6.n.D();
                                }
                                try {
                                    byte[] bArr11 = bArrD;
                                    int i20 = yfq.d;
                                    yfq yfqVar4 = yls.a;
                                    abct abctVar = abct.a;
                                    abbeVar.getClass();
                                    vaq.d();
                                    try {
                                        if ((abbeVar.b & 262144) != 0) {
                                            try {
                                                int i21 = i;
                                                yfl yflVar2 = new yfl(i21);
                                                yfl yflVar3 = new yfl(i21);
                                                abec abecVar = abbeVar.m;
                                                if (abecVar == null) {
                                                    abecVar = abec.a;
                                                }
                                                Iterator it3 = abecVar.b.iterator();
                                                while (it3.hasNext()) {
                                                    abeb abebVar = (abeb) it3.next();
                                                    bArr4 = bArr9;
                                                    try {
                                                        if ((abebVar.b & 2) != 0) {
                                                            yfqVar3 = yfqVar4;
                                                            bArr7 = bArr3;
                                                            toq toqVarG = ukqVar.d.g(abebVar.d, 2);
                                                            it = it3;
                                                            abbmVarArr2 = abbmVarArr3;
                                                            bArr8 = bArr11;
                                                            i5 = length2;
                                                            ukqVar3 = ukqVar;
                                                            yflVar2.i(new roa(abebVar.c, new tot(too.l(toqVarG.h(0).a(), toqVarG.h(0).b()), too.l(toqVarG.h(1).a(), toqVarG.h(1).b()))));
                                                        } else {
                                                            ukqVar3 = ukqVar;
                                                            yfqVar3 = yfqVar4;
                                                            bArr7 = bArr3;
                                                            it = it3;
                                                            abbmVarArr2 = abbmVarArr3;
                                                            bArr8 = bArr11;
                                                            i5 = length2;
                                                            yflVar3.i(abebVar.c);
                                                        }
                                                        length2 = i5;
                                                        bArr9 = bArr4;
                                                        yfqVar4 = yfqVar3;
                                                        bArr3 = bArr7;
                                                        abbmVarArr3 = abbmVarArr2;
                                                        it3 = it;
                                                        ukqVar = ukqVar3;
                                                        bArr11 = bArr8;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                }
                                                ukqVar2 = ukqVar;
                                                bArr4 = bArr9;
                                                yfqVar = yfqVar4;
                                                bArr5 = bArr3;
                                                abbmVarArr = abbmVarArr3;
                                                bArr6 = bArr11;
                                                i4 = length2;
                                                yfq yfqVarG3 = yflVar2.g();
                                                yfqVarG2 = yflVar3.g();
                                                yfqVar2 = yfqVarG3;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                bArr4 = bArr9;
                                            }
                                        } else {
                                            ukqVar2 = ukqVar;
                                            bArr4 = bArr9;
                                            yfqVar = yfqVar4;
                                            bArr5 = bArr3;
                                            abbmVarArr = abbmVarArr3;
                                            bArr6 = bArr11;
                                            i4 = length2;
                                            yfqVarG2 = yfqVar;
                                            yfqVar2 = yfqVarG2;
                                        }
                                        try {
                                            ArrayList arrayList4 = new ArrayList();
                                            vaq.d();
                                            try {
                                                int i22 = Integer.MIN_VALUE;
                                                if ((abbeVar.b & 2048) != 0) {
                                                    abee abeeVar = abbeVar.k;
                                                    if (abeeVar == null) {
                                                        abeeVar = abee.a;
                                                    }
                                                    for (abed abedVar : abeeVar.b) {
                                                        ukq ukqVar4 = ukqVar2;
                                                        int i23 = ukqVar4.a.a;
                                                        ujt ujtVar = new ujt();
                                                        int i24 = abedVar.b;
                                                        ujtVar.b((i24 & 4) != 0, abedVar.e, (i24 & 2) != 0, abedVar.d, abcy.a);
                                                        uju ujuVarA = ujtVar.a();
                                                        int i25 = abedVar.g ^ Integer.MIN_VALUE;
                                                        int i26 = abedVar.f;
                                                        byte[] bArrD2 = abedVar.c.D();
                                                        abdl abdlVar = abedVar.h;
                                                        if (abdlVar == null) {
                                                            abdlVar = abdl.a;
                                                        }
                                                        arrayList4.add(new ukc(i26, i25, bArrD2, ujuVarA, i23, abdlVar));
                                                        ukqVar2 = ukqVar4;
                                                    }
                                                }
                                                ukq ukqVar5 = ukqVar2;
                                                vaq.d();
                                                try {
                                                    if ((abbeVar.b & 128) != 0) {
                                                        abay abayVar = abbeVar.h;
                                                        if (abayVar == null) {
                                                            abayVar = abay.a;
                                                        }
                                                        Iterator it4 = abayVar.b.iterator();
                                                        while (it4.hasNext()) {
                                                            arrayList4.add(uip.d((abax) it4.next(), ukqVar5.d, null, ukqVar5, false));
                                                        }
                                                    }
                                                    vaq.d();
                                                    try {
                                                        if ((abbeVar.b & 64) != 0) {
                                                            abde abdeVar = abbeVar.g;
                                                            if (abdeVar == null) {
                                                                abdeVar = abde.a;
                                                            }
                                                            Iterator it5 = abdeVar.b.iterator();
                                                            while (it5.hasNext()) {
                                                                ujl.d((abdd) it5.next(), ukqVar5.d, null, ukqVar5, false, arrayList4, aekj.a);
                                                            }
                                                        }
                                                        vaq.d();
                                                        try {
                                                            if ((abbeVar.b & 32) != 0) {
                                                                int[] iArr = new int[2];
                                                                abdv abdvVar = abbeVar.f;
                                                                if (abdvVar == null) {
                                                                    abdvVar = abdv.a;
                                                                }
                                                                Iterator it6 = abdvVar.b.iterator();
                                                                while (it6.hasNext()) {
                                                                    abdu abduVar = (abdu) it6.next();
                                                                    abah abahVar = abduVar.c;
                                                                    if (abahVar == null) {
                                                                        abahVar = abah.a;
                                                                    }
                                                                    ukqVar5.d.k(abahVar.c, 0, iArr);
                                                                    ukp ukpVar2 = ukqVar5.a;
                                                                    int i27 = abduVar.d;
                                                                    int i28 = ukpVar2.a;
                                                                    float fW = uqw.w(i28, i27);
                                                                    float fU = uqw.u(i28, abduVar.e);
                                                                    ujt ujtVar2 = new ujt();
                                                                    int i29 = abduVar.b;
                                                                    boolean z3 = (i29 & 16) != 0;
                                                                    int i30 = i4;
                                                                    long j = abduVar.g;
                                                                    boolean z4 = (i29 & 8) != 0;
                                                                    int i31 = abduVar.f;
                                                                    int i32 = i22;
                                                                    abnh abnhVar2 = abcz.a;
                                                                    abduVar.j(abnhVar2);
                                                                    yfq yfqVar5 = yfqVarG2;
                                                                    Iterator it7 = it6;
                                                                    Object objJ2 = abduVar.w.j(abnhVar2.d);
                                                                    ujtVar2.b(z3, j, z4, i31, (abcy) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2)));
                                                                    uju ujuVarA2 = ujtVar2.a();
                                                                    abnh abnhVar3 = abbf.o;
                                                                    abduVar.j(abnhVar3);
                                                                    abnl abnlVar2 = abduVar.w;
                                                                    abnu abnuVar2 = abnhVar3.d;
                                                                    if (abnlVar2.m(abnuVar2)) {
                                                                        abduVar.j(abnhVar3);
                                                                        Object objJ3 = abduVar.w.j(abnuVar2);
                                                                        abst abstVar = (abst) (objJ3 == null ? abnhVar3.b : abnhVar3.c(objJ3));
                                                                        yfu yfuVarH = yfy.h(abstVar.b.size());
                                                                        for (abss abssVar : abstVar.b) {
                                                                            yfuVarH.e(abssVar.c, abssVar.d);
                                                                        }
                                                                        yfyVarD = yfuVarH.d(false);
                                                                    } else {
                                                                        yfyVarD = null;
                                                                    }
                                                                    arrayList4.add(new ujy(iArr[0], iArr[1], fW, fU, abduVar.h, abduVar.i ^ i32, ujuVarA2, i28, yfyVarD, yfyVarD != null));
                                                                    i4 = i30;
                                                                    i22 = i32;
                                                                    yfqVarG2 = yfqVar5;
                                                                    it6 = it7;
                                                                }
                                                            }
                                                            yfq yfqVar6 = yfqVarG2;
                                                            int i33 = i4;
                                                            vaq.d();
                                                            try {
                                                                if ((abbeVar.b & 256) != 0) {
                                                                    abfg abfgVar2 = abbeVar.i;
                                                                    if (abfgVar2 == null) {
                                                                        abfgVar2 = abfg.a;
                                                                    }
                                                                    abfgVar = abfgVar2;
                                                                } else {
                                                                    abfgVar = null;
                                                                }
                                                                vaq.d();
                                                                try {
                                                                    abct abctVar2 = abbeVar.j;
                                                                    if (abctVar2 == null) {
                                                                        abctVar2 = abct.a;
                                                                    }
                                                                    abct abctVar3 = abctVar2;
                                                                    yfl yflVar4 = new yfl(4);
                                                                    abei abeiVar = abbeVar.l;
                                                                    if (abeiVar == null) {
                                                                        abeiVar = abei.a;
                                                                    }
                                                                    for (abeg abegVar : abeiVar.b) {
                                                                        int i34 = 0;
                                                                        while (true) {
                                                                            abch abchVar = abegVar.d;
                                                                            if (abchVar == null) {
                                                                                abchVar = abch.a;
                                                                            }
                                                                            abci abciVar = abchVar.d;
                                                                            if (abciVar == null) {
                                                                                abciVar = abci.a;
                                                                            }
                                                                            if (i34 >= abciVar.b.size()) {
                                                                                arrayList = arrayList4;
                                                                                yflVar4.i(abegVar);
                                                                                break;
                                                                            }
                                                                            abch abchVar2 = abegVar.d;
                                                                            if (abchVar2 == null) {
                                                                                abchVar2 = abch.a;
                                                                            }
                                                                            abci abciVar2 = abchVar2.d;
                                                                            if (abciVar2 == null) {
                                                                                abciVar2 = abci.a;
                                                                            }
                                                                            if ((((abcn) abciVar2.b.get(i34)).b & 4) != 0) {
                                                                                abch abchVar3 = abegVar.d;
                                                                                if (abchVar3 == null) {
                                                                                    abchVar3 = abch.a;
                                                                                }
                                                                                abci abciVar3 = abchVar3.d;
                                                                                if (abciVar3 == null) {
                                                                                    abciVar3 = abci.a;
                                                                                }
                                                                                abnp abnpVarK2 = abciVar3.K();
                                                                                int i35 = 0;
                                                                                while (i35 < ((abci) abnpVarK2.b).b.size()) {
                                                                                    if ((abnpVarK2.X(i35).b & 4) != 0) {
                                                                                        abnr abnrVar = (abnr) abnpVarK2.X(i35).K();
                                                                                        abnrVar.t();
                                                                                        abcn abcnVar = (abcn) abnrVar.b;
                                                                                        arrayList2 = arrayList4;
                                                                                        abcnVar.b |= 8;
                                                                                        abcnVar.f = iL2;
                                                                                        abnpVarK2.t();
                                                                                        abci abciVar4 = (abci) abnpVarK2.b;
                                                                                        abcn abcnVar2 = (abcn) abnrVar.q();
                                                                                        abcnVar2.getClass();
                                                                                        aboh abohVar = abciVar4.b;
                                                                                        if (!abohVar.c()) {
                                                                                            abciVar4.b = abnv.I(abohVar);
                                                                                        }
                                                                                        abciVar4.b.set(i35, abcnVar2);
                                                                                    } else {
                                                                                        arrayList2 = arrayList4;
                                                                                    }
                                                                                    i35++;
                                                                                    arrayList4 = arrayList2;
                                                                                }
                                                                                arrayList = arrayList4;
                                                                                abnr abnrVar2 = (abnr) abegVar.K();
                                                                                abch abchVar4 = abegVar.d;
                                                                                if (abchVar4 == null) {
                                                                                    abchVar4 = abch.a;
                                                                                }
                                                                                abnp abnpVarK3 = abchVar4.K();
                                                                                abnpVarK3.t();
                                                                                abch abchVar5 = (abch) abnpVarK3.b;
                                                                                abci abciVar5 = (abci) abnpVarK2.q();
                                                                                abciVar5.getClass();
                                                                                abchVar5.d = abciVar5;
                                                                                abchVar5.b |= 2;
                                                                                abnrVar2.t();
                                                                                abeg abegVar2 = (abeg) abnrVar2.b;
                                                                                abch abchVar6 = (abch) abnpVarK3.q();
                                                                                abchVar6.getClass();
                                                                                abegVar2.d = abchVar6;
                                                                                abegVar2.b |= 2;
                                                                                yflVar4.i((abeg) abnrVar2.q());
                                                                            } else {
                                                                                i34++;
                                                                            }
                                                                        }
                                                                        arrayList4 = arrayList;
                                                                    }
                                                                    ArrayList arrayList5 = arrayList4;
                                                                    yfq yfqVarG4 = yflVar4.g();
                                                                    yfu yfuVar = new yfu(4);
                                                                    Iterator it8 = iterable.iterator();
                                                                    while (it8.hasNext()) {
                                                                        abnh abnhVar4 = (abnh) it8.next();
                                                                        abbeVar.j(abnhVar4);
                                                                        abnl abnlVar3 = abbeVar.w;
                                                                        abnu abnuVar3 = abnhVar4.d;
                                                                        if (abnlVar3.m(abnuVar3)) {
                                                                            abbeVar.j(abnhVar4);
                                                                            Object objJ4 = abbeVar.w.j(abnuVar3);
                                                                            yfuVar.e(abnhVar4, objJ4 == null ? abnhVar4.b : abnhVar4.c(objJ4));
                                                                        }
                                                                    }
                                                                    pkaVar = uxeVar;
                                                                    ukuVarA = uku.a(uqw.l(ukqVar5, pkaVar6, yfqVar6, yfqVar, arrayList5, abctVar3, bArr5, abfgVar, yfqVarG4, abglVar, yfqVar2, abbmVarArr, bArr6, i33, tozVar, yfuVar.d(false)), ukt.h);
                                                                    ukt uktVar = ukuVarA.a;
                                                                    ukt uktVar2 = ukt.d;
                                                                    uxg.b(pkaVar);
                                                                } finally {
                                                                }
                                                            } finally {
                                                            }
                                                        } finally {
                                                        }
                                                    } finally {
                                                    }
                                                } finally {
                                                }
                                            } finally {
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            pkaVar = uxeVar;
                                            try {
                                                throw th;
                                            } catch (IOException e6) {
                                                e = e6;
                                                ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9403)).u("Error unpacking vector tile with styles");
                                                ukuVar = new uku(ukt.d, xvy.a);
                                                uxeVar2 = pkaVar;
                                                ukuVarA = ukuVar;
                                                pkaVar = uxeVar2;
                                                ukt uktVar3 = ukuVarA.a;
                                                ukt uktVar22 = ukt.d;
                                                uxg.b(pkaVar);
                                                xuvVarD.close();
                                                return ukuVarA;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (abon e7) {
                            e = e7;
                            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                            uku ukuVar2222 = new uku(ukt.a, xvy.a);
                            uxg.b(pkaVar);
                            ukuVarA = ukuVar2222;
                            xuvVarD.close();
                            return ukuVarA;
                        } catch (IndexOutOfBoundsException e8) {
                            e = e8;
                            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                            uku ukuVar22222 = new uku(ukt.a, xvy.a);
                            uxg.b(pkaVar);
                            ukuVarA = ukuVar22222;
                            xuvVarD.close();
                            return ukuVarA;
                        } catch (DataFormatException e9) {
                            e = e9;
                            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                            uku ukuVar222222 = new uku(ukt.a, xvy.a);
                            uxg.b(pkaVar);
                            ukuVarA = ukuVar222222;
                            xuvVarD.close();
                            return ukuVarA;
                        }
                    } catch (abon e10) {
                        e = e10;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                    } catch (DataFormatException e12) {
                        e = e12;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (abon e13) {
                    e = e13;
                    r1 = bArr9;
                    pkaVar = uxeVarA;
                    ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                    uku ukuVar2222222 = new uku(ukt.a, xvy.a);
                    uxg.b(pkaVar);
                    ukuVarA = ukuVar2222222;
                    xuvVarD.close();
                    return ukuVarA;
                } catch (IndexOutOfBoundsException e14) {
                    e = e14;
                    r1 = bArr9;
                    pkaVar = uxeVarA;
                    ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                    uku ukuVar22222222 = new uku(ukt.a, xvy.a);
                    uxg.b(pkaVar);
                    ukuVarA = ukuVar22222222;
                    xuvVarD.close();
                    return ukuVarA;
                } catch (DataFormatException e15) {
                    e = e15;
                    r1 = bArr9;
                    pkaVar = uxeVarA;
                    ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9401)).R("Error parsing proto for tile %s %s %s exception=", ukpVar, "type=" + abglVar.name(), "data.length=" + r1.length);
                    uku ukuVar222222222 = new uku(ukt.a, xvy.a);
                    uxg.b(pkaVar);
                    ukuVarA = ukuVar222222222;
                    xuvVarD.close();
                    return ukuVarA;
                } catch (Throwable th9) {
                    th = th9;
                    pkaVar = uxeVarA;
                }
                xuvVarD.close();
                return ukuVarA;
            } catch (Throwable th10) {
                th = th10;
            }
        } finally {
        }
    }

    private static int l(pka pkaVar, abbe abbeVar) {
        int i = pkaVar.k;
        return i != 0 ? i : abbeVar.e;
    }

    @Override // defpackage.uko
    public final int a() {
        return this.r;
    }

    @Override // defpackage.uko
    public final synchronized pka b() {
        return this.v;
    }

    @Override // defpackage.uko
    public final synchronized toz c() {
        return this.o;
    }

    @Override // defpackage.uko
    public final abgl d() {
        return this.n;
    }

    @Override // defpackage.uko
    public final synchronized void e(pka pkaVar) {
        this.v = pkaVar;
    }

    @Override // defpackage.uko
    public final synchronized void f(toz tozVar) {
        this.o = tozVar;
    }

    public final ukp g() {
        return this.c.a;
    }

    public final ukw i() {
        return new ukw(this.g);
    }

    public final int j(wnq wnqVar, uir uirVar, uju ujuVar, uis uisVar, HashMap map) {
        Pair pair = new Pair(ujuVar, uirVar);
        if (map.containsKey(pair)) {
            return ((Integer) map.get(pair)).intValue();
        }
        ukf ukfVarE = (!ujuVar.b() || wnqVar == null) ? ujuVar.e(this.c.b, null, null) : ujuVar.e((ukh) wnqVar.c, null, null);
        ujf[] ujfVarArr = ukfVarE.c;
        ujf[] ujfVarArr2 = new ujf[ujfVarArr.length];
        for (int i = 0; i < ujfVarArr.length; i++) {
            uje ujeVarF = ujfVarArr[i].f();
            xxh xxhVar = uirVar.a;
            if (xxhVar.f()) {
                int iIntValue = ((Integer) xxhVar.b()).intValue();
                if (Color.alpha(iIntValue) == 0) {
                    ujeVarF.a = true;
                } else {
                    ujeVarF.g = ((Integer) xxhVar.b()).intValue();
                    ujeVarF.a = false;
                }
                ujeVarF.i = iIntValue;
            }
            uke[] ukeVarArr = ujfVarArr[i].n;
            int length = ukeVarArr.length;
            int iIntValue2 = length > 0 ? ukeVarArr[length - 1].b : 0;
            float fFloatValue = length > 0 ? ukeVarArr[length - 1].d : 0.0f;
            xxh xxhVar2 = uirVar.b;
            if (xxhVar2.f() || uirVar.c.f()) {
                uke[] ukeVarArr2 = new uke[1];
                if (xxhVar2.f()) {
                    iIntValue2 = ((Integer) xxhVar2.b()).intValue();
                }
                xxh xxhVar3 = uirVar.c;
                if (xxhVar3.f()) {
                    fFloatValue = ((Float) xxhVar3.b()).floatValue();
                }
                ukeVarArr2[0] = new uke(iIntValue2, fFloatValue, new int[0], BitmapDescriptorFactory.HUE_RED);
                ujeVarF.j = ukeVarArr2;
                ujeVarF.b = false;
            }
            uke[] ukeVarArr3 = ujfVarArr[i].o;
            int length2 = ukeVarArr3.length;
            int iIntValue3 = length2 > 0 ? ukeVarArr3[length2 - 1].b : 0;
            float fFloatValue2 = length2 > 0 ? ukeVarArr3[length2 - 1].d : 0.0f;
            float f = length2 > 0 ? ukeVarArr3[0].h : 0.0f;
            if (xxhVar2.f() || uirVar.c.f()) {
                uke[] ukeVarArr4 = new uke[1];
                if (xxhVar2.f()) {
                    iIntValue3 = ((Integer) xxhVar2.b()).intValue();
                }
                xxh xxhVar4 = uirVar.c;
                if (xxhVar4.f()) {
                    fFloatValue2 = ((Float) xxhVar4.b()).floatValue();
                }
                ukeVarArr4[0] = new uke(iIntValue3, fFloatValue2, new int[0], f);
                ujeVarF.k = ukeVarArr4;
            }
            uke ukeVar = ujfVarArr[i].q;
            int iIntValue4 = ukeVar != null ? ukeVar.b : 0;
            float fFloatValue3 = ukeVar != null ? ukeVar.d : BitmapDescriptorFactory.HUE_RED;
            if (xxhVar2.f() || uirVar.c.f()) {
                if (xxhVar2.f()) {
                    iIntValue4 = ((Integer) xxhVar2.b()).intValue();
                }
                xxh xxhVar5 = uirVar.c;
                if (xxhVar5.f()) {
                    fFloatValue3 = ((Float) xxhVar5.b()).floatValue();
                }
                ujeVarF.m = new uke(iIntValue4, fFloatValue3, new int[0], BitmapDescriptorFactory.HUE_RED);
            }
            float fFloatValue4 = ujfVarArr[i].l;
            xxh xxhVar6 = uirVar.d;
            if (xxhVar6.f()) {
                fFloatValue4 = ((Float) xxhVar6.b()).floatValue();
            }
            ujeVarF.Q = fFloatValue4;
            ujfVarArr2[i] = new ujf(ujeVarF);
        }
        int iA = uisVar.a(new ukf(-1L, ujfVarArr2, ukfVarE.d, null, true));
        map.put(pair, Integer.valueOf(iA));
        return iA;
    }
}
