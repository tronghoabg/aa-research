package com.google.android.libraries.geo.mapcore.internal.label.jni;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.gmm.jni.util.NativeHelper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import defpackage.abgx;
import defpackage.abhl;
import defpackage.abhz;
import defpackage.abia;
import defpackage.abih;
import defpackage.abil;
import defpackage.abim;
import defpackage.abin;
import defpackage.abiq;
import defpackage.abir;
import defpackage.abis;
import defpackage.abit;
import defpackage.abiu;
import defpackage.abiv;
import defpackage.abiw;
import defpackage.abje;
import defpackage.abjg;
import defpackage.abjr;
import defpackage.abjs;
import defpackage.abju;
import defpackage.abnj;
import defpackage.abnp;
import defpackage.abnv;
import defpackage.abog;
import defpackage.aboh;
import defpackage.abon;
import defpackage.aeke;
import defpackage.aepw;
import defpackage.aepy;
import defpackage.aepz;
import defpackage.aeqa;
import defpackage.fdi;
import defpackage.rjs;
import defpackage.sk;
import defpackage.tra;
import defpackage.trn;
import defpackage.uaj;
import defpackage.ubf;
import defpackage.ubq;
import defpackage.ucm;
import defpackage.ucq;
import defpackage.ucy;
import defpackage.uds;
import defpackage.uee;
import defpackage.uef;
import defpackage.ueg;
import defpackage.uej;
import defpackage.uel;
import defpackage.uem;
import defpackage.ueu;
import defpackage.ufs;
import defpackage.uiw;
import defpackage.ujk;
import defpackage.uqm;
import defpackage.uqw;
import defpackage.vaa;
import defpackage.vaq;
import defpackage.xvy;
import defpackage.xxh;
import defpackage.yfq;
import defpackage.ygr;
import defpackage.yls;
import defpackage.yly;
import defpackage.ynz;
import defpackage.yob;
import defpackage.yrm;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class SharedLabelerJni {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/jni/SharedLabelerJni");
    public long b;
    private final abil c;
    private final uel d;

    static {
        NativeHelper.ensureLibraryLoaded();
        nativeInitClass();
    }

    public SharedLabelerJni(uel uelVar, tra traVar, uaj uajVar) {
        boolean z = uajVar != null && uajVar.e();
        boolean z2 = uajVar != null && ((Boolean) uajVar.f.gu()).booleanValue();
        boolean z3 = uajVar != null && ((Boolean) uajVar.g.gu()).booleanValue();
        boolean z4 = uajVar != null && ((Boolean) uajVar.i.gu()).booleanValue();
        boolean z5 = uajVar != null && ((Boolean) uajVar.j.gu()).booleanValue();
        abnp abnpVarN = abil.a.n();
        abnpVarN.t();
        abil abilVar = (abil) abnpVarN.b;
        abilVar.b |= 1024;
        abilVar.k = false;
        abnpVarN.t();
        abil abilVar2 = (abil) abnpVarN.b;
        abilVar2.b |= 2097152;
        abilVar2.n = 3;
        abnpVarN.t();
        abil abilVar3 = (abil) abnpVarN.b;
        abilVar3.b |= 33554432;
        abilVar3.o = true;
        abnpVarN.t();
        abil abilVar4 = (abil) abnpVarN.b;
        abilVar4.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        abilVar4.j = true;
        abnpVarN.t();
        abil abilVar5 = (abil) abnpVarN.b;
        abilVar5.b |= 16384;
        abilVar5.m = z2;
        abnpVarN.t();
        abil abilVar6 = (abil) abnpVarN.b;
        abilVar6.c |= 64;
        abilVar6.v = z3;
        int i = traVar.d;
        abnpVarN.t();
        abil abilVar7 = (abil) abnpVarN.b;
        abilVar7.b |= 134217728;
        abilVar7.q = i;
        abnpVarN.t();
        abil abilVar8 = (abil) abnpVarN.b;
        abilVar8.b |= 256;
        abilVar8.i = true;
        abnpVarN.t();
        abil abilVar9 = (abil) abnpVarN.b;
        abilVar9.b |= 1073741824;
        abilVar9.r = true;
        abnpVarN.t();
        abil abilVar10 = (abil) abnpVarN.b;
        abilVar10.c |= 4;
        abilVar10.t = true;
        abnpVarN.t();
        abil abilVar11 = (abil) abnpVarN.b;
        abilVar11.c |= 16;
        abilVar11.u = true;
        abnpVarN.t();
        abil abilVar12 = (abil) abnpVarN.b;
        abilVar12.c |= 4096;
        abilVar12.A = true;
        abnpVarN.t();
        abil abilVar13 = (abil) abnpVarN.b;
        abilVar13.b |= 2;
        abilVar13.e = 4;
        abnpVarN.t();
        abil abilVar14 = (abil) abnpVarN.b;
        abilVar14.b |= 8;
        abilVar14.g = true;
        abnpVarN.t();
        abil abilVar15 = (abil) abnpVarN.b;
        abilVar15.c |= 536870912;
        abilVar15.D = z5;
        abnpVarN.t();
        abil abilVar16 = (abil) abnpVarN.b;
        abilVar16.c |= 2;
        abilVar16.s = z4;
        abnpVarN.t();
        abil abilVar17 = (abil) abnpVarN.b;
        abilVar17.c |= 128;
        abilVar17.w = true;
        abnpVarN.t();
        abil abilVar18 = (abil) abnpVarN.b;
        abilVar18.d = 0;
        abilVar18.b |= 1;
        abnpVarN.t();
        abil abilVar19 = (abil) abnpVarN.b;
        abilVar19.c |= 256;
        abilVar19.x = true;
        abnpVarN.t();
        abil abilVar20 = (abil) abnpVarN.b;
        abilVar20.c |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        abilVar20.y = 0;
        abnpVarN.t();
        abil abilVar21 = (abil) abnpVarN.b;
        abilVar21.c |= 1024;
        abilVar21.z = 300;
        abnpVarN.t();
        abil abilVar22 = (abil) abnpVarN.b;
        abilVar22.b |= 4;
        abilVar22.f = z;
        abnpVarN.t();
        abil abilVar23 = (abil) abnpVarN.b;
        abilVar23.b |= 67108864;
        abilVar23.p = z;
        boolean z6 = uajVar != null && ((Boolean) uajVar.h.gu()).booleanValue();
        abnpVarN.t();
        abil abilVar24 = (abil) abnpVarN.b;
        abilVar24.c |= 131072;
        abilVar24.B = z6;
        boolean z7 = traVar.g;
        abnpVarN.t();
        abil abilVar25 = (abil) abnpVarN.b;
        abilVar25.c |= 2097152;
        abilVar25.C = z7;
        boolean z8 = uajVar != null && ((Boolean) uajVar.k.gu()).booleanValue();
        abnpVarN.t();
        abil abilVar26 = (abil) abnpVarN.b;
        abilVar26.b |= 128;
        abilVar26.h = z8;
        boolean z9 = uajVar != null && ((Boolean) uajVar.l.gu()).booleanValue();
        abnpVarN.t();
        abil abilVar27 = (abil) abnpVarN.b;
        abilVar27.b |= 4096;
        abilVar27.l = z9;
        abil abilVar28 = (abil) abnpVarN.q();
        this.c = abilVar28;
        long jNativeCreateLabeler = nativeCreateLabeler(abilVar28.h());
        this.b = jNativeCreateLabeler;
        if (jNativeCreateLabeler == 0) {
            throw new IllegalStateException("Failed to create native labeler");
        }
        this.d = uelVar;
    }

    private native long nativeAddCalloutCandidate(long j, byte[] bArr);

    private native long nativeAddLabelCandidates(long j, byte[] bArr, byte[] bArr2);

    private native long nativeCreateLabeler(byte[] bArr);

    private native void nativeDeleteLabeler(long j);

    private void nativeGetEpochResources(byte[] bArr) {
        try {
            uel uelVar = this.d;
            abhz abhzVar = (abhz) abnv.B(abhz.a, bArr, abnj.a());
            ((ynz) ((ynz) uel.a.e()).ai((char) 9272)).u("[Labeler thread] handle EpochResourcesRequest");
            if (uelVar.m()) {
                return;
            }
            ueg uegVar = uelVar.p;
            uegVar.getClass();
            for (abhl abhlVar : abhzVar.b) {
                uiw uiwVar = uegVar.c;
                int i = abhlVar.c;
                ujk ujkVar = uegVar.m;
                uel uelVar2 = uegVar.d;
                if (!uiwVar.k(i, ujkVar, uelVar2.z, new uee(uegVar, i))) {
                    abnp abnpVarN = abia.a.n();
                    abnpVarN.ac(ueg.e(abhlVar.c, null));
                    uelVar2.f((abia) abnpVarN.q());
                }
            }
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9321)).u("Unable to parse EpochResourcesRequest");
        }
    }

    private void nativeGetStyleTable(byte[] bArr) {
        try {
            uel uelVar = this.d;
            abjr abjrVar = (abjr) abnv.B(abjr.a, bArr, abnj.a());
            ((ynz) ((ynz) uel.a.e()).ai((char) 9273)).u("[Labeler thread] handle StyleTableRequest");
            if (uelVar.m()) {
                return;
            }
            ueg uegVar = uelVar.p;
            uegVar.getClass();
            uel uelVar2 = uegVar.d;
            ujk ujkVar = (ujk) uelVar2.l.get(Integer.valueOf(abjrVar.b));
            abgx abgxVar = ujkVar != null ? ujkVar.L : null;
            if (abgxVar == null) {
                ((ynz) ((ynz) ueg.a.g()).ai(9268)).w("Invalid config set id %s", abjrVar.b);
                uelVar2.g(abjrVar.d, ueg.b);
                return;
            }
            ujk ujkVarA = ujk.a(abgxVar);
            uiw uiwVar = uegVar.c;
            abhl abhlVar = abjrVar.c;
            if (abhlVar == null) {
                abhlVar = abhl.a;
            }
            if (uiwVar.k(abhlVar.c, ujkVarA, uelVar2.z, new uef(uegVar, abjrVar))) {
                return;
            }
            uelVar2.g(abjrVar.d, ueg.b);
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9322)).u("Unable to parse StyleTableRequest");
        }
    }

    @ResultIgnorabilityUnspecified
    private static native boolean nativeInitClass();

    private void nativeMeasureIconLayer(byte[] bArr) {
        try {
            uel uelVar = this.d;
            abiq abiqVar = (abiq) abnv.B(abiq.a, bArr, abnj.a());
            ((ynz) ((ynz) uel.a.e()).ai(9279)).x("[Labeler thread] handle MeasureIconLayerRequest: id %s", abiqVar.c);
            if (uelVar.m()) {
                return;
            }
            ueg uegVar = uelVar.p;
            uegVar.getClass();
            uegVar.c(abiqVar);
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9323)).u("Unable to parse measureIconLayerRequestBytes");
        }
    }

    private void nativeMeasureIconLayers(byte[] bArr) {
        try {
            uel uelVar = this.d;
            abir abirVar = (abir) abnv.B(abir.a, bArr, abnj.a());
            if (uelVar.m()) {
                return;
            }
            for (abiq abiqVar : abirVar.b) {
                ueg uegVar = uelVar.p;
                uegVar.getClass();
                uegVar.c(abiqVar);
            }
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9324)).u("Unable to parse measureIconLayerRequestsBytes");
        }
    }

    private void nativeMeasureText(long j, String str, float f, int i, int i2, int i3, boolean z) {
        ((ynz) ((ynz) uel.a.e()).ai(9280)).x("[Labeler thread] handle MeasureTextRequest: id %s", j);
        uel uelVar = this.d;
        if (uelVar.m()) {
            return;
        }
        ueg uegVar = uelVar.p;
        uegVar.getClass();
        uegVar.d(j, str, f, i, i2, z, (ueu) uelVar.o.get());
    }

    private void nativeMeasureTexts(byte[] bArr) {
        abju abjuVar;
        try {
            uel uelVar = this.d;
            abiu abiuVar = (abiu) abnv.B(abiu.a, bArr, abnj.a());
            if (uelVar.m()) {
                return;
            }
            for (abit abitVar : abiuVar.b) {
                ueg uegVar = uelVar.p;
                uegVar.getClass();
                long j = abitVar.b;
                abju abjuVar2 = abitVar.c;
                if (abjuVar2 == null) {
                    abjuVar2 = abju.a;
                }
                String str = abjuVar2.b;
                abju abjuVar3 = abitVar.c;
                float f = (abjuVar3 == null ? abju.a : abjuVar3).c;
                int iAy = a.ay((abjuVar3 == null ? abju.a : abjuVar3).d);
                if (iAy == 0) {
                    iAy = 1;
                }
                if (abjuVar3 == null) {
                    abjuVar3 = abju.a;
                    abjuVar = null;
                } else {
                    abjuVar = abjuVar3;
                }
                int i = abjuVar3.e;
                int i2 = (abjuVar == null ? abju.a : abjuVar).f;
                if (abjuVar == null) {
                    abjuVar = abju.a;
                }
                uegVar.d(j, str, f, iAy - 1, i, abjuVar.g, (ueu) uelVar.o.get());
            }
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9325)).u("Unable to parse measureTextRequestsBytes");
        }
    }

    private native void nativeRemoveCalloutCandidate(long j, long j2);

    private native void nativeRemoveLabelCandidates(long j, long j2);

    private native void nativeReportIconLayerSize(long j, byte[] bArr);

    private native void nativeSetLabelerDebugFprint(long j, long j2);

    private void nativeUpdateMeasuredCallouts(byte[] bArr) {
        try {
            uel uelVar = this.d;
            abiw abiwVar = (abiw) abnv.B(abiw.a, bArr, abnj.a());
            yob yobVar = uel.a;
            ((ynz) ((ynz) yobVar.e()).ai((char) 9308)).u("[Labeler thread] handle MeasuredCalloutUpdate");
            vaq.d();
            if (abiwVar.b.isEmpty() && abiwVar.c.isEmpty() && uelVar.A == null) {
                return;
            }
            ArrayList<trn> arrayListS = yrm.S(abiwVar.c.size());
            for (Long l : abiwVar.c) {
                l.longValue();
                trn trnVar = (trn) uelVar.n.get(l);
                if (trnVar != null) {
                    arrayListS.add(trnVar);
                }
            }
            ArrayList<uem> arrayListS2 = yrm.S(abiwVar.b.size());
            for (abiv abivVar : abiwVar.b) {
                if ((abivVar.b & 2) != 0) {
                    trn trnVar2 = (trn) uelVar.n.get(Long.valueOf(abivVar.c));
                    if (trnVar2 == null) {
                        ((ynz) ((ynz) yobVar.g()).ai(9309)).x("Unable to find client id for labeler updated callout id %s", abivVar.c);
                    } else {
                        arrayListS2.add(new uem(trnVar2, abivVar));
                    }
                } else {
                    ((ynz) ((ynz) yobVar.g()).ai(9310)).u("Callout candidate id is not set for a measured callout.");
                }
            }
            uqm uqmVar = uelVar.A;
            uqmVar.getClass();
            for (trn trnVar3 : arrayListS) {
                uqw uqwVar = (uqw) uqmVar.b.get(trnVar3);
                if (uqwVar == null) {
                    ((ynz) ((ynz) uqm.a.h()).ai((char) 9603)).y("Failed to hide callout %s because it is not found in live callouts", trnVar3);
                } else {
                    uqwVar.a();
                }
            }
            for (uem uemVar : arrayListS2) {
                ConcurrentHashMap concurrentHashMap = uqmVar.b;
                trn trnVar4 = uemVar.a;
                uqw uqwVar2 = (uqw) concurrentHashMap.get(trnVar4);
                if (uqwVar2 == null) {
                    ((ynz) ((ynz) uqm.a.h()).ai(9602)).y("Failed to update callout %s's measurements because it is not found in live callouts", trnVar4);
                } else {
                    uqwVar2.b();
                }
            }
            synchronized (uqmVar) {
            }
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9326)).u("Unable to parse MeasuredCalloutUpdate");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.lang.Runnable] */
    private void nativeUpdatePlacedLabels(byte[] bArr) {
        int i;
        yfq yfqVarO;
        try {
            uel uelVar = this.d;
            abjg abjgVar = (abjg) abnv.B(abjg.a, bArr, abnj.a());
            vaq.d();
            ((ynz) ((ynz) uel.a.e()).ai(9311)).u("[Labeler thread] handle PlacedLabelUpdate");
            if (uelVar.m()) {
                return;
            }
            ueg uegVar = uelVar.p;
            uegVar.getClass();
            ueu ueuVar = (ueu) uelVar.o.get();
            vaa vaaVar = uelVar.x;
            aboh abohVar = abjgVar.b;
            abog abogVar = abjgVar.d;
            ygr ygrVarN = !abjgVar.i.isEmpty() ? ygr.n(abjgVar.i) : yly.a;
            boolean zIsEmpty = abogVar.isEmpty();
            int size = abohVar.size() - 1;
            aeke aekeVar = new aeke(16);
            ucy ucyVar = uegVar.g;
            ucyVar.e();
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (true) {
                boolean z2 = zIsEmpty;
                if (i2 >= abohVar.size()) {
                    break;
                }
                boolean z3 = !ygrVarN.isEmpty() && z2 && i2 == size;
                abje abjeVar = (abje) abohVar.get(i2);
                int i4 = i2;
                long j = abjeVar.e;
                Map map = uegVar.l;
                Long lValueOf = Long.valueOf(j);
                uds udsVar = (uds) map.get(lValueOf);
                aeke aekeVar2 = aekeVar;
                ucm ucmVar = uegVar.h;
                int iAC = a.aC(abjgVar.j);
                if (iAC == 0) {
                    iAC = 1;
                }
                int i5 = i3;
                aboh abohVar2 = abohVar;
                int i6 = size;
                abjg abjgVar2 = abjgVar;
                ucy ucyVar2 = ucyVar;
                vaa vaaVar2 = vaaVar;
                ubq ubqVarA = ucmVar.a(abjeVar, ueuVar, iAC, abjgVar.f, abjgVar.g, udsVar);
                if (ubqVarA == null) {
                    map.remove(lValueOf);
                    ubf ubfVar = (ubf) uegVar.j.remove(lValueOf);
                    if (ubfVar != null) {
                        if (ubfVar.o()) {
                            uegVar.f.c(ubfVar);
                        }
                        ucyVar2.i(ubfVar.t());
                        if (z3) {
                            uegVar.e.f(ubfVar, ygrVarN);
                            z = true;
                        } else {
                            uegVar.e.f(ubfVar, yly.a);
                        }
                        uegVar.n.j(ubfVar.u());
                    }
                    i3 = i5;
                } else {
                    i3 = i5 + 1;
                    uds udsVarF = ubqVarA.F();
                    if (udsVarF != null) {
                        map.put(lValueOf, udsVarF);
                    }
                    ubf ubfVar2 = (ubf) uegVar.j.put(lValueOf, ubqVarA);
                    aekeVar2.c(ubqVarA.t());
                    int iAv = a.av(abjeVar.m);
                    if (iAv == 0) {
                        iAv = 1;
                    }
                    boolean z4 = iAv == 2 || iAv == 3;
                    if (z4) {
                        ucyVar2.f(ubqVarA, false);
                    }
                    if (ubqVarA.o()) {
                        uegVar.f.a(ubqVarA);
                    }
                    if (ubfVar2 != null) {
                        if (ubfVar2.o()) {
                            uegVar.f.c(ubfVar2);
                        }
                        if (!z4 && ucyVar2.l(ubfVar2.t())) {
                            ucyVar2.i(ubfVar2.t());
                        }
                        if (z3) {
                            uegVar.e.h(ubfVar2, ubqVarA, ygrVarN);
                            z = true;
                        } else {
                            uegVar.e.h(ubfVar2, ubqVarA, yly.a);
                        }
                        uegVar.n.j(ubfVar2.u());
                    } else if (z3) {
                        uegVar.e.b(ubqVarA, ygrVarN);
                        z = true;
                    } else {
                        uegVar.e.b(ubqVarA, yly.a);
                    }
                    int iAv2 = a.av(abjeVar.m);
                    if (iAv2 == 0) {
                        iAv2 = 1;
                    }
                    int i7 = iAv2 - 1;
                    xxh xxhVarH = i7 != 1 ? i7 != 2 ? i7 != 3 ? xvy.a : xxh.h(ucq.e) : xxh.h(ucq.d) : xxh.h(ucq.a);
                    if (xxhVarH.f()) {
                        uegVar.n.i(ubqVarA.u(), (ucq) xxhVarH.b());
                    }
                }
                i2 = i4 + 1;
                zIsEmpty = z2;
                aekeVar = aekeVar2;
                ucyVar = ucyVar2;
                abjgVar = abjgVar2;
                vaaVar = vaaVar2;
                abohVar = abohVar2;
                size = i6;
            }
            abjg abjgVar3 = abjgVar;
            vaa vaaVar3 = vaaVar;
            aeke aekeVar3 = aekeVar;
            ucy ucyVar3 = ucyVar;
            fdi.a("numLabelsCreated", i3);
            int size2 = abogVar.size() - 1;
            int i8 = 0;
            while (i8 < abogVar.size()) {
                boolean z5 = i8 == size2 && !ygrVarN.isEmpty();
                Long l = (Long) abogVar.get(i8);
                l.longValue();
                uegVar.l.remove(l);
                ubf ubfVar3 = (ubf) uegVar.j.remove(l);
                if (ubfVar3 != null) {
                    if (ubfVar3.o()) {
                        uegVar.f.c(ubfVar3);
                    }
                    ucyVar3.i(ubfVar3.t());
                    if (z5) {
                        uegVar.e.f(ubfVar3, ygrVarN);
                        z = true;
                    } else {
                        uegVar.e.f(ubfVar3, yly.a);
                    }
                    uegVar.n.j(ubfVar3.u());
                }
                i8++;
            }
            if (!z && !ygrVarN.isEmpty()) {
                uegVar.e.c(ygrVarN);
            }
            vaaVar3.b(uegVar.n.h());
            Map map2 = uegVar.j;
            fdi.a("numLabelsPlaced", map2.size());
            for (ubf ubfVar4 : map2.values()) {
                if (!aekeVar3.e(ubfVar4.t())) {
                    if (ucyVar3.m((ubq) ubfVar4)) {
                        ucyVar3.f(ubfVar4, true);
                    } else if (ucyVar3.l(ubfVar4.t())) {
                        ucyVar3.i(ubfVar4.t());
                    }
                }
            }
            int iAC2 = a.aC(abjgVar3.j);
            int i9 = iAC2 == 0 ? 1 : iAC2;
            aboh<abje> abohVar3 = abjgVar3.c;
            abog<Long> abogVar2 = abjgVar3.e;
            aeke aekeVar4 = new aeke(16);
            for (abje abjeVar2 : abohVar3) {
                ucm ucmVar2 = uegVar.h;
                int i10 = yfq.d;
                yfq yfqVar = yls.a;
                ubq ubqVarA2 = ucmVar2.a(abjeVar2, ueuVar, i9, yfqVar, yfqVar, null);
                if (ubqVarA2 == null) {
                    ubf ubfVar5 = (ubf) uegVar.k.remove(Long.valueOf(abjeVar2.e));
                    if (ubfVar5 != null) {
                        uegVar.e.e(ubfVar5);
                        ucyVar3.j(ubfVar5.t());
                    }
                } else {
                    aekeVar4.c(ubqVarA2.t());
                    ucyVar3.g(ubqVarA2);
                    ubf ubfVar6 = (ubf) uegVar.k.put(Long.valueOf(abjeVar2.e), ubqVarA2);
                    if (ubfVar6 != null) {
                        uegVar.e.g(ubfVar6, ubqVarA2);
                    } else {
                        uegVar.e.a(ubqVarA2);
                    }
                }
            }
            for (Long l2 : abogVar2) {
                l2.longValue();
                ubf ubfVar7 = (ubf) uegVar.k.remove(l2);
                if (ubfVar7 != null) {
                    ucyVar3.j(ubfVar7.t());
                    uegVar.e.e(ubfVar7);
                }
            }
            for (ubf ubfVar8 : uegVar.k.values()) {
                if (!aekeVar4.e(ubfVar8.t())) {
                    ucyVar3.g(ubfVar8);
                }
            }
            uegVar.e.i();
            synchronized (uelVar) {
                i = uelVar.u;
            }
            uelVar.y.b(Boolean.valueOf(i <= 0));
            abim abimVar = abjgVar3.h;
            if (abimVar == null) {
                abimVar = abim.a;
            }
            uej uejVar = new uej();
            uejVar.b(abimVar.b);
            uejVar.c(abimVar.c);
            uejVar.d(abimVar.d);
            abin abinVar = abimVar.f;
            if (abinVar == null) {
                abinVar = abin.a;
            }
            uejVar.f(abinVar.b);
            uejVar.e(SystemClock.elapsedRealtime());
            uelVar.w = uejVar.a();
            ArrayList arrayList = new ArrayList();
            synchronized (uelVar) {
                arrayList.addAll(uelVar.s);
                List list = uelVar.s;
                uelVar.s = uelVar.t;
                uelVar.t = list;
                uelVar.t.clear();
            }
            int size3 = arrayList.size();
            for (int i11 = 0; i11 < size3; i11++) {
                rjs rjsVar = (rjs) arrayList.get(i11);
                Object obj = rjsVar.a;
                rjsVar.b.run();
            }
            if (Log.isLoggable("LabelingMetrics", 2)) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                abin abinVar2 = abimVar.f;
                if (abinVar2 == null) {
                    abinVar2 = abin.a;
                }
                Log.v("LabelingMetrics", "Labeling HawkeyeMetrics::timeSpentInSharedLabeler: " + (abinVar2.b / 1000000));
            }
            aepw aepwVar = new aepw(abimVar.e.size());
            for (int i12 = 0; i12 < abimVar.e.size(); i12++) {
                aepwVar.c(abimVar.e.a(i12));
            }
            aepy aepyVar = aeqa.a;
            aepz aepzVar = new aepz(aepwVar);
            Set set = uelVar.r;
            synchronized (set) {
                yfqVarO = yfq.o(set);
            }
            int size4 = yfqVarO.size();
            for (int i13 = 0; i13 < size4; i13++) {
                ((ufs) yfqVarO.get(i13)).A(aepzVar);
            }
        } catch (abon e) {
            ((ynz) ((ynz) ((ynz) a.h()).p(e)).ai((char) 9327)).u("Unable to parse PlacedLabelUpdate");
        }
    }

    private native void nativeUpdateSelectedLabel(long j, byte[] bArr);

    private native void nativeUpdateStyle(long j, byte[] bArr);

    @ResultIgnorabilityUnspecified
    public final long a(abih abihVar, byte[] bArr) {
        return nativeAddLabelCandidates(this.b, abihVar.h(), bArr);
    }

    public final void b() {
        long j = this.b;
        if (j != 0) {
            nativeDeleteLabeler(j);
            this.b = 0L;
        }
    }

    public final void c(long j) {
        nativeRemoveLabelCandidates(this.b, j);
    }

    public final void d(abis abisVar) {
        nativeReportIconLayerSize(this.b, abisVar.h());
    }

    public final void e(abjs abjsVar) {
        nativeUpdateStyle(this.b, abjsVar.h());
    }

    public final void finalize() {
        b();
    }

    public native void nativeAddLabelTags(long j, int[] iArr);

    public native long nativeAddLabelingHint(long j, byte[] bArr);

    public native void nativeRemoveLabelingHint(long j, long j2);

    public native void nativeReportEpochResources(long j, byte[] bArr);

    public native void nativeReportMajorLabelingInputChangeEvent(long j);

    public native void nativeReportStyleTable(long j, long j2, byte[] bArr);

    public native void nativeReportTextSize(long j, long j2, float f, float f2, float f3, float f4, float f5);

    public native byte[] nativeRunTasks(long j, boolean z);

    public native void nativeUpdateAnnotationExperimentIds(long j, int[] iArr);

    public native void nativeUpdateEpoch(long j, byte[] bArr);

    public native void nativeUpdateRestrictions(long j, byte[] bArr);

    public native void nativeUpdateViewport(long j, byte[] bArr);
}
