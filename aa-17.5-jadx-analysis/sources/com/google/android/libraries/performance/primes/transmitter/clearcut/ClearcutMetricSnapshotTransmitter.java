package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import defpackage.a;
import defpackage.abmc;
import defpackage.abnh;
import defpackage.abnp;
import defpackage.abnr;
import defpackage.abnv;
import defpackage.abog;
import defpackage.aboh;
import defpackage.abor;
import defpackage.abpf;
import defpackage.ajel;
import defpackage.ajem;
import defpackage.ajfg;
import defpackage.ajfh;
import defpackage.ajfj;
import defpackage.ajfk;
import defpackage.ajfl;
import defpackage.ajgh;
import defpackage.ajgn;
import defpackage.ajgo;
import defpackage.ajgu;
import defpackage.rgf;
import defpackage.shv;
import defpackage.sk;
import defpackage.spu;
import defpackage.swo;
import defpackage.sws;
import defpackage.txa;
import defpackage.txv;
import defpackage.vys;
import defpackage.vyt;
import defpackage.vyy;
import defpackage.vza;
import defpackage.vzj;
import defpackage.woy;
import defpackage.wub;
import defpackage.xts;
import defpackage.xuq;
import defpackage.xur;
import defpackage.xyc;
import defpackage.ysu;
import defpackage.ysv;
import defpackage.ysy;
import defpackage.ytk;
import defpackage.zby;
import defpackage.zbz;
import defpackage.zca;
import defpackage.zcb;
import defpackage.zfb;
import defpackage.zfk;
import defpackage.zfq;
import defpackage.zgj;
import defpackage.zgl;
import defpackage.zgp;
import defpackage.zyr;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class ClearcutMetricSnapshotTransmitter implements vyt {
    public static final xyc a = wub.L(new txv(13));
    public volatile shv b;
    public volatile shv c;
    private volatile vyy d;
    private volatile vzj e;
    private final xyc f = wub.L(new txv(12));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vyt
    public final zgp a(final Context context, vys vysVar) {
        boolean z;
        ysu ysuVarA;
        Integer numValueOf;
        int i;
        long jG;
        zgp zgpVarU;
        abnh abnhVar = vza.j;
        vysVar.j(abnhVar);
        woy.O(vysVar.w.m(abnhVar.d), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        ajgu ajguVar = vysVar.c;
        if (ajguVar == null) {
            ajguVar = ajgu.a;
        }
        String str = ajguVar.e.isEmpty() ? ajguVar.d : ajguVar.e;
        char c = 128;
        if (str.isEmpty()) {
            numValueOf = null;
            z = true;
        } else {
            int i2 = ysy.a;
            ysv ysvVar = ytk.a;
            int i3 = ajguVar.b;
            String strBJ = a.bJ(str, (8388608 & i3) != 0 ? "PRIMES_STATS" : (i3 & 32) != 0 ? "NETWORK_USAGE" : (i3 & 16) != 0 ? "TIMER" : (i3 & 8) != 0 ? "MEMORY_USAGE" : (i3 & 256) != 0 ? "BATTERY_USAGE" : (i3 & 64) != 0 ? "CRASH" : (524288 & i3) != 0 ? "CUI" : (i3 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? "JANK" : (i3 & 128) != 0 ? "PACKAGE" : (i3 & 1024) != 0 ? "TRACE" : "UNKNOWN", "_");
            Charset charset = StandardCharsets.UTF_8;
            if (charset.equals(StandardCharsets.UTF_8)) {
                int length = strBJ.length();
                int i4 = 0;
                int iRotateLeft = 0;
                int i5 = 0;
                while (true) {
                    int i6 = i4 + 4;
                    if (i6 > length) {
                        i = -430675100;
                        z = true;
                        break;
                    }
                    i = -430675100;
                    char cCharAt = strBJ.charAt(i4);
                    z = true;
                    char cCharAt2 = strBJ.charAt(i4 + 1);
                    char cCharAt3 = strBJ.charAt(i4 + 2);
                    char cCharAt4 = strBJ.charAt(i4 + 3);
                    if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                        break;
                    }
                    iRotateLeft = (Integer.rotateLeft((Integer.rotateLeft((((cCharAt3 << 16) | ((cCharAt2 << '\b') | cCharAt)) | (cCharAt4 << 24)) * (-862048943), 15) * 461845907) ^ iRotateLeft, 13) * 5) - 430675100;
                    i5 += 4;
                    i4 = i6;
                }
                long j = 0;
                int i7 = 0;
                while (true) {
                    if (i4 >= length) {
                        ysuVarA = ytk.j((Integer.rotateLeft(((int) j) * (-862048943), 15) * 461845907) ^ iRotateLeft, i5);
                        break;
                    }
                    char cCharAt5 = strBJ.charAt(i4);
                    if (cCharAt5 < c) {
                        jG = (cCharAt5 << i7) | j;
                        i5++;
                        i7 += 8;
                    } else if (cCharAt5 < 2048) {
                        jG = (ytk.h(cCharAt5) << i7) | j;
                        i5 += 2;
                        i7 += 16;
                    } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                        jG = (ytk.g(cCharAt5) << i7) | j;
                        i5 += 3;
                        i7 += 24;
                    } else {
                        int iCodePointAt = Character.codePointAt(strBJ, i4);
                        if (iCodePointAt == cCharAt5) {
                            ysuVarA = ((ytk) ysvVar).a(strBJ.toString().getBytes(charset));
                            break;
                        }
                        jG = (ytk.i(iCodePointAt) << i7) | j;
                        i5 += 4;
                        i7 += 32;
                        i4++;
                    }
                    if (i7 >= 32) {
                        int iRotateLeft2 = Integer.rotateLeft(iRotateLeft ^ (Integer.rotateLeft(((int) jG) * (-862048943), 15) * 461845907), 13) * 5;
                        jG >>>= 32;
                        iRotateLeft = iRotateLeft2 + i;
                        i7 -= 32;
                    }
                    i4++;
                    j = jG;
                    c = 128;
                }
            } else {
                z = true;
                ysuVarA = ((ytk) ysvVar).a(strBJ.toString().getBytes(charset));
            }
            numValueOf = Integer.valueOf(ysuVarA.a());
        }
        final Integer num = numValueOf;
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new vzj();
                }
            }
        }
        ajgu ajguVar2 = vysVar.c;
        if (ajguVar2 == null) {
            ajguVar2 = ajgu.a;
        }
        abnp abnpVarK = ajguVar2.K();
        vzj.b(vzj.a, abnpVarK);
        ajem ajemVar = ((ajgu) abnpVarK.b).k;
        if (ajemVar == null) {
            ajemVar = ajem.a;
        }
        if ((ajemVar.b & 1) != 0) {
            ajem ajemVar2 = ((ajgu) abnpVarK.b).k;
            if (ajemVar2 == null) {
                ajemVar2 = ajem.a;
            }
            ajel ajelVar = ajemVar2.c;
            if (ajelVar == null) {
                ajelVar = ajel.a;
            }
            abnp abnpVarK2 = ajelVar.K();
            vzj.b(vzj.b, abnpVarK2);
            ajem ajemVar3 = ((ajgu) abnpVarK.b).k;
            if (ajemVar3 == null) {
                ajemVar3 = ajem.a;
            }
            abnp abnpVarK3 = ajemVar3.K();
            abnpVarK3.t();
            ajem ajemVar4 = (ajem) abnpVarK3.b;
            ajel ajelVar2 = (ajel) abnpVarK2.q();
            ajelVar2.getClass();
            ajemVar4.c = ajelVar2;
            ajemVar4.b |= 1;
            abnpVarK.t();
            ajgu ajguVar3 = (ajgu) abnpVarK.b;
            ajem ajemVar5 = (ajem) abnpVarK3.q();
            ajemVar5.getClass();
            ajguVar3.k = ajemVar5;
            ajguVar3.b |= 256;
        }
        ajgh ajghVar = ((ajgu) abnpVarK.b).i;
        if (ajghVar == null) {
            ajghVar = ajgh.a;
        }
        if ((ajghVar.b & 256) != 0) {
            ajgh ajghVar2 = ((ajgu) abnpVarK.b).i;
            if (ajghVar2 == null) {
                ajghVar2 = ajgh.a;
            }
            zcb zcbVar = ajghVar2.i;
            if (zcbVar == null) {
                zcbVar = zcb.a;
            }
            abnp abnpVarK4 = zcbVar.K();
            zby zbyVar = ((zcb) abnpVarK4.b).e;
            if (zbyVar == null) {
                zbyVar = zby.a;
            }
            zby zbyVarC = vzj.c(zbyVar);
            abnpVarK4.t();
            zcb zcbVar2 = (zcb) abnpVarK4.b;
            zbyVarC.getClass();
            zcbVar2.e = zbyVarC;
            zcbVar2.b |= 1;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(zcbVar2.f);
            abnpVarK4.t();
            ((zcb) abnpVarK4.b).f = abpf.b;
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                zby zbyVarC2 = vzj.c((zby) it.next());
                abnpVarK4.t();
                zcb zcbVar3 = (zcb) abnpVarK4.b;
                zbyVarC2.getClass();
                zcbVar3.b();
                zcbVar3.f.add(zbyVarC2);
            }
            zcb zcbVar4 = (zcb) abnpVarK4.b;
            aboh<zca> abohVar = (zcbVar4.c == 4 ? (zbz) zcbVar4.d : zbz.a).b;
            abnp abnpVarN = zbz.a.n();
            for (zca zcaVar : abohVar) {
                zby zbyVar2 = zcaVar.c;
                if (zbyVar2 == null) {
                    zbyVar2 = zby.a;
                }
                if ((zbyVar2.b & 2) != 0) {
                    abnp abnpVarK5 = zcaVar.K();
                    zby zbyVarC3 = vzj.c(zbyVar2);
                    abnpVarK5.t();
                    zca zcaVar2 = (zca) abnpVarK5.b;
                    zbyVarC3.getClass();
                    zcaVar2.c = zbyVarC3;
                    zcaVar2.b |= 1;
                    zcaVar = (zca) abnpVarK5.q();
                }
                abnpVarN.t();
                zbz zbzVar = (zbz) abnpVarN.b;
                zcaVar.getClass();
                zbzVar.b();
                zbzVar.b.add(zcaVar);
            }
            zbz zbzVar2 = (zbz) abnpVarN.q();
            abnpVarK4.t();
            zcb zcbVar5 = (zcb) abnpVarK4.b;
            zbzVar2.getClass();
            zcbVar5.d = zbzVar2;
            zcbVar5.c = 4;
            ajgh ajghVar3 = ((ajgu) abnpVarK.b).i;
            if (ajghVar3 == null) {
                ajghVar3 = ajgh.a;
            }
            abnp abnpVarK6 = ajghVar3.K();
            zcb zcbVar6 = (zcb) abnpVarK4.q();
            abnpVarK6.t();
            ajgh ajghVar4 = (ajgh) abnpVarK6.b;
            zcbVar6.getClass();
            ajghVar4.i = zcbVar6;
            ajghVar4.b |= 256;
            ajgh ajghVar5 = (ajgh) abnpVarK6.q();
            abnpVarK.t();
            ajgu ajguVar4 = (ajgu) abnpVarK.b;
            ajghVar5.getClass();
            ajguVar4.i = ajghVar5;
            ajguVar4.b |= 64;
        }
        ajgo ajgoVar = ((ajgu) abnpVarK.b).j;
        if (ajgoVar == null) {
            ajgoVar = ajgo.a;
        }
        if (ajgoVar.k.size() != 0) {
            ajgo ajgoVar2 = ((ajgu) abnpVarK.b).j;
            if (ajgoVar2 == null) {
                ajgoVar2 = ajgo.a;
            }
            abnp abnpVarK7 = ajgoVar2.K();
            for (int i8 = 0; i8 < ((ajgo) abnpVarK7.b).k.size(); i8++) {
                abnp abnpVarK8 = ((ajgn) ((ajgo) abnpVarK7.b).k.get(i8)).K();
                if (!((ajgn) abnpVarK8.b).c.isEmpty()) {
                    abnpVarK8.t();
                    ((ajgn) abnpVarK8.b).d = abor.a;
                    List listA = vzj.a(((ajgn) abnpVarK8.b).c);
                    abnpVarK8.t();
                    ajgn ajgnVar = (ajgn) abnpVarK8.b;
                    abog abogVar = ajgnVar.d;
                    if (!abogVar.c()) {
                        ajgnVar.d = abnv.H(abogVar);
                    }
                    abmc.i(listA, ajgnVar.d);
                }
                abnpVarK8.t();
                ajgn ajgnVar2 = (ajgn) abnpVarK8.b;
                ajgnVar2.b &= -2;
                ajgnVar2.c = ajgn.a.c;
                abnpVarK7.t();
                ajgo ajgoVar3 = (ajgo) abnpVarK7.b;
                ajgn ajgnVar3 = (ajgn) abnpVarK8.q();
                ajgnVar3.getClass();
                aboh abohVar2 = ajgoVar3.k;
                if (!abohVar2.c()) {
                    ajgoVar3.k = abnv.I(abohVar2);
                }
                ajgoVar3.k.set(i8, ajgnVar3);
            }
            abnpVarK.t();
            ajgu ajguVar5 = (ajgu) abnpVarK.b;
            ajgo ajgoVar4 = (ajgo) abnpVarK7.q();
            ajgoVar4.getClass();
            ajguVar5.j = ajgoVar4;
            ajguVar5.b |= 128;
        }
        ajfh ajfhVar = ((ajgu) abnpVarK.b).h;
        if (ajfhVar == null) {
            ajfhVar = ajfh.a;
        }
        if (ajfhVar.b.size() != 0) {
            ajfh ajfhVar2 = ((ajgu) abnpVarK.b).h;
            if (ajfhVar2 == null) {
                ajfhVar2 = ajfh.a;
            }
            abnp abnpVarK9 = ajfhVar2.K();
            for (int i9 = 0; i9 < ((ajfh) abnpVarK9.b).b.size(); i9++) {
                abnp abnpVarK10 = ((ajfg) ((ajfh) abnpVarK9.b).b.get(i9)).K();
                if (!((ajfg) abnpVarK10.b).w.isEmpty()) {
                    abnpVarK10.t();
                    ((ajfg) abnpVarK10.b).x = abor.a;
                    List listA2 = vzj.a(((ajfg) abnpVarK10.b).w);
                    abnpVarK10.t();
                    ajfg ajfgVar = (ajfg) abnpVarK10.b;
                    abog abogVar2 = ajfgVar.x;
                    if (!abogVar2.c()) {
                        ajfgVar.x = abnv.H(abogVar2);
                    }
                    abmc.i(listA2, ajfgVar.x);
                }
                abnpVarK10.t();
                ajfg ajfgVar2 = (ajfg) abnpVarK10.b;
                ajfgVar2.b &= -524289;
                ajfgVar2.w = ajfg.a.w;
                abnpVarK9.t();
                ajfh ajfhVar3 = (ajfh) abnpVarK9.b;
                ajfg ajfgVar3 = (ajfg) abnpVarK10.q();
                ajfgVar3.getClass();
                ajfhVar3.b();
                ajfhVar3.b.set(i9, ajfgVar3);
            }
            for (int i10 = 0; i10 < ((ajfh) abnpVarK9.b).c.size(); i10++) {
                abnp abnpVarK11 = ((ajfj) ((ajfh) abnpVarK9.b).c.get(i10)).K();
                if (!((ajfj) abnpVarK11.b).c.isEmpty()) {
                    abnpVarK11.t();
                    ((ajfj) abnpVarK11.b).d = abor.a;
                    List listA3 = vzj.a(((ajfj) abnpVarK11.b).c);
                    abnpVarK11.t();
                    ajfj ajfjVar = (ajfj) abnpVarK11.b;
                    abog abogVar3 = ajfjVar.d;
                    if (!abogVar3.c()) {
                        ajfjVar.d = abnv.H(abogVar3);
                    }
                    abmc.i(listA3, ajfjVar.d);
                }
                abnpVarK11.t();
                ajfj ajfjVar2 = (ajfj) abnpVarK11.b;
                ajfjVar2.b &= -2;
                ajfjVar2.c = ajfj.a.c;
                abnpVarK9.t();
                ajfh ajfhVar4 = (ajfh) abnpVarK9.b;
                ajfj ajfjVar3 = (ajfj) abnpVarK11.q();
                ajfjVar3.getClass();
                aboh abohVar3 = ajfhVar4.c;
                if (!abohVar3.c()) {
                    ajfhVar4.c = abnv.I(abohVar3);
                }
                ajfhVar4.c.set(i10, ajfjVar3);
            }
            abnpVarK.t();
            ajgu ajguVar6 = (ajgu) abnpVarK.b;
            ajfh ajfhVar5 = (ajfh) abnpVarK9.q();
            ajfhVar5.getClass();
            ajguVar6.h = ajfhVar5;
            ajguVar6.b |= 32;
        }
        ajfk ajfkVar = ((ajgu) abnpVarK.b).m;
        if (ajfkVar == null) {
            ajfkVar = ajfk.a;
        }
        if (ajfkVar.d.size() != 0) {
            ajfk ajfkVar2 = ((ajgu) abnpVarK.b).m;
            if (ajfkVar2 == null) {
                ajfkVar2 = ajfk.a;
            }
            abnp abnpVarK12 = ajfkVar2.K();
            for (int i11 = 0; i11 < ((ajfk) abnpVarK12.b).d.size(); i11++) {
                abnr abnrVar = (abnr) ((ajfl) ((ajfk) abnpVarK12.b).d.get(i11)).K();
                vzj.b(vzj.c, abnrVar);
                abnpVarK12.t();
                ajfk ajfkVar3 = (ajfk) abnpVarK12.b;
                ajfl ajflVar = (ajfl) abnrVar.q();
                ajflVar.getClass();
                aboh abohVar4 = ajfkVar3.d;
                if (!abohVar4.c()) {
                    ajfkVar3.d = abnv.I(abohVar4);
                }
                ajfkVar3.d.set(i11, ajflVar);
            }
            abnpVarK.t();
            ajgu ajguVar7 = (ajgu) abnpVarK.b;
            ajfk ajfkVar4 = (ajfk) abnpVarK12.q();
            ajfkVar4.getClass();
            ajguVar7.m = ajfkVar4;
            ajguVar7.b |= 1024;
        }
        final ajgu ajguVar8 = (ajgu) abnpVarK.q();
        if (((Boolean) this.f.gu()).booleanValue()) {
            return zgl.a;
        }
        abnh abnhVar2 = vza.j;
        vysVar.j(abnhVar2);
        Object objJ = vysVar.w.j(abnhVar2.d);
        final vza vzaVar = (vza) (objJ == null ? abnhVar2.b : abnhVar2.c(objJ));
        boolean z2 = vzaVar.h;
        boolean z3 = (ajguVar8.b & 64) != 0 ? z : false;
        vyy vyyVar = this.d;
        if (vyyVar == null) {
            synchronized (this) {
                vyyVar = this.d;
                if (vyyVar == null) {
                    vyyVar = new vyy();
                    this.d = vyyVar;
                }
            }
        }
        if (z2) {
            Boolean bool = (Boolean) vyyVar.a.get();
            if (bool != null) {
                zgpVarU = wub.Y(bool);
            } else {
                swo swoVarA = vyyVar.c;
                if (swoVarA == null) {
                    synchronized (vyyVar) {
                        swoVarA = vyyVar.c;
                        if (swoVarA == null) {
                            swoVarA = sws.a(context);
                            vyyVar.c = swoVarA;
                        }
                    }
                }
                if (!z3) {
                    boolean z4 = z;
                    if (!vyyVar.b.getAndSet(z4)) {
                        swoVarA.b(new zyr(vyyVar, z4 ? 1 : 0));
                    }
                }
                zgj zgjVarV = zgj.v(spu.aK(swoVarA.a()));
                rgf rgfVar = new rgf(vyyVar, 9);
                int i12 = xur.a;
                xuq xuqVar = new xuq(xts.e(), rgfVar);
                zfq zfqVar = zfq.a;
                zgpVarU = zgjVarV.w(xuqVar, zfqVar).u(Throwable.class, new txa(16), zfqVar);
            }
        } else {
            zgpVarU = wub.Y(Boolean.valueOf(z));
        }
        return zfb.g(zgpVarU, new zfk() { // from class: vze
            @Override // defpackage.zfk
            public final zgp a(Object obj) {
                shv shvVar;
                if (!((Boolean) obj).booleanValue()) {
                    return zgl.a;
                }
                vza vzaVar2 = vzaVar;
                Context context2 = context;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.a;
                String str2 = vzaVar2.c;
                if (vzaVar2.d) {
                    shvVar = clearcutMetricSnapshotTransmitter.c;
                    if (shvVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            shvVar = clearcutMetricSnapshotTransmitter.c;
                            if (shvVar == null) {
                                List list = shv.n;
                                shp shpVar = new shp(context2, str2);
                                shpVar.b(siv.b);
                                shv shvVarA = shpVar.a();
                                clearcutMetricSnapshotTransmitter.c = shvVarA;
                                shvVar = shvVarA;
                            }
                        }
                    }
                } else {
                    shvVar = clearcutMetricSnapshotTransmitter.b;
                    if (shvVar == null) {
                        synchronized (clearcutMetricSnapshotTransmitter) {
                            shvVar = clearcutMetricSnapshotTransmitter.b;
                            if (shvVar == null) {
                                List list2 = shv.n;
                                shv shvVarA2 = new shp(context2, str2).a();
                                clearcutMetricSnapshotTransmitter.b = shvVarA2;
                                shvVar = shvVarA2;
                            }
                        }
                    }
                }
                Integer num2 = num;
                shr shrVarF = shvVar.f(ajguVar8);
                if (num2 != null) {
                    shrVarF.g(num2.intValue());
                }
                if (adfs.a.gu().a(context2)) {
                    shrVarF.c(tmu.a(context2, (tmj) ClearcutMetricSnapshotTransmitter.a.gu()));
                }
                if (!vzaVar2.d) {
                    String str3 = vzaVar2.e;
                    if (!woy.am(str3)) {
                        if (shrVarF.a.c()) {
                            throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                        }
                        abnr abnrVar2 = shrVarF.p;
                        abnrVar2.t();
                        acam acamVar = (acam) abnrVar2.b;
                        acam acamVar2 = acam.a;
                        str3.getClass();
                        acamVar.b |= 16777216;
                        acamVar.i = str3;
                    }
                    Iterator<E> it2 = vzaVar2.i.iterator();
                    while (it2.hasNext()) {
                        shrVarF.f((String) it2.next());
                    }
                    if ((vzaVar2.b & 8) != 0) {
                        String str4 = vzaVar2.f;
                        if (!shrVarF.a.j.a(siw.ACCOUNT_NAME)) {
                            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
                        }
                        shrVarF.h = str4;
                    }
                    abod abodVar = vzaVar2.g;
                    if (!abodVar.isEmpty()) {
                        shrVarF.e(wub.ay(abodVar));
                    }
                }
                return spu.aK(shrVarF.b());
            }
        }, zfq.a);
    }
}
