package defpackage;

import android.text.TextUtils;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.calendar.model.CalendarEvent;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kgq {
    public static final void a(List list, boolean z, yzz yzzVar) {
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            CalendarEvent calendarEvent = (CalendarEvent) it.next();
            i++;
            calendarEvent.f();
            boolean zIsEmpty = calendarEvent.f().isEmpty();
            boolean zIsEmpty2 = TextUtils.isEmpty(calendarEvent.g());
            boolean zJ = calendarEvent.j();
            if (!zIsEmpty) {
                i2++;
            }
            if (!zIsEmpty2) {
                i3++;
            }
            if (zIsEmpty && zIsEmpty2) {
                i4++;
            }
            if (zJ) {
                i5++;
                if (!zIsEmpty) {
                    i6++;
                }
                if (!zIsEmpty2) {
                    i7++;
                }
                if (zIsEmpty && zIsEmpty2) {
                    i8++;
                }
            }
            if (yzzVar == yzz.CALENDAR_AGENDA_VIEW && calendarEvent.i()) {
                i9++;
                if (zJ) {
                    i10++;
                }
            }
        }
        rqm rqmVar = new rqm();
        rqmVar.b = yxy.GEARHEAD;
        rqmVar.a = yxc.CALENDAR_EVENT_LIST_SNAPSHOT;
        rqmVar.c = yzzVar;
        rqmVar.d = i;
        rqmVar.e = i2;
        rqmVar.f = i3;
        rqmVar.g = i4;
        rqmVar.o = (byte) 15;
        rqmVar.j = xxh.h(Integer.valueOf(i5));
        rqmVar.k = xxh.h(Integer.valueOf(i6));
        rqmVar.l = xxh.h(Integer.valueOf(i7));
        rqmVar.m = xxh.h(Integer.valueOf(i8));
        if (yzzVar == yzz.CALENDAR_AGENDA_VIEW) {
            rqmVar.h = xxh.h(Integer.valueOf(i9));
            rqmVar.n = xxh.h(Integer.valueOf(i10));
            rqmVar.i = xxh.h(Boolean.valueOf(z));
        }
        ebf.j().F(rqmVar.l());
    }

    public static void b() {
    }

    @ResultIgnorabilityUnspecified
    public static Object c(kix kixVar, String str, yzz yzzVar, yzy yzyVar, boolean z, String str2, Object... objArr) {
        try {
            return kixVar.a();
        } catch (qrz e) {
            if (!(e instanceof rku)) {
                tss.r(str, e, str2, objArr);
                throw new IllegalStateException("This should be unreachable, the method should always have returned or thrown an exception.");
            }
            rku rkuVar = (rku) e;
            ((ype) ((ype) ((ype) new yph(yqn.d(str)).g()).p(rkuVar)).ai(3167)).Y(str2, objArr);
            throw new kir(String.format(str2, objArr), rkuVar, yzzVar, yzyVar, z);
        } catch (qsa e2) {
            tss.r(str, e2, str2, objArr);
            throw new IllegalStateException("This should be unreachable, the method should always have returned or thrown an exception.");
        }
    }

    public static void d(kiy kiyVar, String str, yzz yzzVar, yzy yzyVar, String str2, Object... objArr) {
        c(new kiz(kiyVar, 1), str, yzzVar, yzyVar, true, str2, objArr);
    }

    public static final ktf e(long j, long j2, long j3, long j4, long j5, long j6, long j7, bux buxVar, int i) {
        long j8;
        long j9;
        if ((i & 2) != 0) {
            kso ksoVar = ksp.a;
            buxVar.v(1366992543);
            j8 = j;
            long jA = ksp.a(kfn.i(buxVar), j8);
            if (jA == 16) {
                jA = ((cjv) buxVar.f(bnm.a)).a;
            }
            buxVar.o();
            j9 = jA;
        } else {
            j8 = j;
            j9 = j2;
        }
        return new ktf(j8, j9, (i & 4) != 0 ? j9 : j3, (i & 8) != 0 ? j8 : j4, (i & 16) != 0 ? j9 : j5, (i & 32) != 0 ? j9 : 0L, (i & 64) != 0 ? ((ktu) ((mko) ktf.d.a()).d).a(buxVar) : j6, (i & 128) != 0 ? ((ktu) ((mko) ktf.d.a()).b).a(buxVar) : j7);
    }

    public static final ktf f(long j, long j2, long j3, long j4, bux buxVar, int i) {
        long jA = (i & 1) != 0 ? ktw.a((krr) s().a, buxVar) : j;
        long jA2 = (i & 2) != 0 ? ktw.a((krr) s().c, buxVar) : 0L;
        return new ktf(jA, jA2, (i & 4) != 0 ? jA2 : j2, (i & 8) != 0 ? jA : j3, (i & 16) != 0 ? jA2 : j4, jA2, ((ktu) s().d).a(buxVar), ((ktu) s().b).a(buxVar));
    }

    public static final ktf g(long j, long j2, long j3, long j4, bux buxVar, int i) {
        long j5;
        long jA = 0;
        if ((i & 1) != 0) {
            long j6 = ((kta) ktf.a.a()).a;
            buxVar.v(1551263020);
            ((bvv) buxVar).Y(false);
            j5 = 0;
        } else {
            j5 = j;
        }
        long jA2 = (i & 2) != 0 ? ktw.a(((kta) ktf.a.a()).b, buxVar) : j2;
        long j7 = (i & 4) != 0 ? jA2 : j3;
        if ((i & 8) != 0) {
            ktt kttVar = ((kta) ktf.a.a()).c;
            jA = ktt.a(buxVar);
        }
        long j8 = jA;
        if ((i & 16) != 0) {
            long j9 = ((kta) ktf.a.a()).d;
            buxVar.v(1551263020);
            ((bvv) buxVar).Y(false);
        }
        long jA3 = (i & 32) != 0 ? ktw.a(((kta) ktf.a.a()).e, buxVar) : j4;
        aezr aezrVar = ktf.a;
        long j10 = ((kta) aezrVar.a()).f;
        buxVar.v(1551263020);
        ((bvv) buxVar).Y(false);
        return new ktf(j5, jA2, j7, j8, 0L, jA3, 0L, ((kta) aezrVar.a()).g.a(buxVar));
    }

    public static final ktf h(bux buxVar) {
        aezr aezrVar = ktf.b;
        long j = ((ktb) aezrVar.a()).a;
        buxVar.v(1551263020);
        bvv bvvVar = (bvv) buxVar;
        bvvVar.Y(false);
        long jA = ktw.a(((ktb) aezrVar.a()).b, buxVar);
        long jA2 = ktw.a(((ktb) aezrVar.a()).c, buxVar);
        ktt kttVar = ((ktb) aezrVar.a()).d;
        long jA3 = ktt.a(buxVar);
        long j2 = ((ktb) aezrVar.a()).e;
        buxVar.v(1551263020);
        bvvVar.Y(false);
        long jA4 = ktw.a(((ktb) aezrVar.a()).f, buxVar);
        long j3 = ((ktb) aezrVar.a()).g;
        buxVar.v(1551263020);
        bvvVar.Y(false);
        return new ktf(0L, jA, jA2, jA3, 0L, jA4, 0L, ((ktb) aezrVar.a()).h.a(buxVar));
    }

    public static final ktf i(bux buxVar) {
        aezr aezrVar = ktf.f;
        long jA = ktw.a(((kte) aezrVar.a()).a, buxVar);
        float fD = cjv.d(jA);
        float fC = cjv.c(jA);
        float fB = cjv.b(jA);
        float[] fArr = clj.a;
        long j = cjn.j(fD, fC, fB, 0.5f, clj.y[(int) (jA & 63)]);
        long jA2 = ktw.a(((kte) aezrVar.a()).b, buxVar);
        ktt kttVar = ((kte) aezrVar.a()).c;
        long jA3 = ktt.a(buxVar);
        long j2 = ((kte) aezrVar.a()).d;
        buxVar.v(1551263020);
        buxVar.o();
        long jA4 = ktw.a(((kte) aezrVar.a()).e, buxVar);
        long j3 = ((kte) aezrVar.a()).f;
        buxVar.v(1551263020);
        buxVar.o();
        return new ktf(j, jA2, jA2, jA3, 0L, jA4, 0L, ((kte) aezrVar.a()).g.a(buxVar));
    }

    public static final ktf j(long j, long j2, long j3, long j4, bux buxVar, int i) {
        long jA;
        long jA2 = (i & 1) != 0 ? ktw.a(r().a, buxVar) : j;
        long jA3 = (i & 2) != 0 ? ktw.a(r().b, buxVar) : j2;
        long j5 = (i & 4) != 0 ? jA3 : j3;
        if ((i & 8) != 0) {
            ktt kttVar = r().c;
            jA = ktt.a(buxVar);
        } else {
            jA = j4;
        }
        long j6 = r().d;
        ktv.a(buxVar);
        return new ktf(jA2, jA3, j5, jA, j6, ktw.a(r().e, buxVar), r().f.a(buxVar), r().g.a(buxVar));
    }

    public static final long k(float f, bux buxVar) {
        return ((dlg) buxVar.f(dbc.d)).eI(f);
    }

    public static final nmj l() {
        return new nmj(new GhIcon(8), null, null, null, false, new mkj(20));
    }

    public static final void m(cfy cfyVar, final nmj nmjVar, final boolean z, boolean z2, bux buxVar, final int i, final int i2) {
        cfy cfyVar2;
        int i3;
        boolean z3;
        final cfy cfyVar3;
        final boolean z4;
        bux buxVarC = buxVar.c(-1869301495);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            cfyVar2 = cfyVar;
        } else if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i3 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(nmjVar) : buxVarC.E(nmjVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= true != buxVarC.D(z3) ? 128 : 256;
        } else {
            z3 = z;
        }
        int i5 = i2 & 8;
        boolean z5 = i5 == 0;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            cfy cfyVar4 = i4 != 0 ? cfy.e : cfyVar2;
            final boolean z6 = z2 | (!z5);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            final bym bymVarB = ady.b(true != ((Boolean) bwqVar.a()).booleanValue() ? 1.0f : 0.95f, null, "iconScale", null, buxVarC, 3072, 22);
            int i6 = i3 & 112;
            final ckv ckvVar = lfr.c;
            boolean z7 = i6 == 32 || ((i3 & 64) != 0 && buxVarC.C(nmjVar));
            boolean z8 = (i3 & 7168) == 2048;
            Object objS2 = bvvVar.S();
            int i7 = 3;
            if ((z7 | z8) || objS2 == obj) {
                objS2 = new nmm(new bck(z6, nmjVar, 2), null, new bck(z6, bwqVar, i7), new ngz(bwqVar, 9));
                bvvVar.ad(objS2);
            }
            final git gitVarA = ((nmm) objS2).a(nmjVar, null, buxVarC, 2);
            final boolean z9 = z3;
            cfy cfyVar5 = cfyVar4;
            kfl.m(bxc.i(-1392609272, true, new cuz(nmjVar, 15), buxVarC), cfyVar5, BitmapDescriptorFactory.HUE_RED, 0L, 0L, null, 0L, bxc.i(603342049, true, new afeg() { // from class: nmh
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ktf ktfVarJ;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i8 = iIntValue & 3;
                    if (buxVar2.I(i8 != 2, iIntValue & 1)) {
                        final boolean z10 = z9;
                        if (z10) {
                            buxVar2.v(-275072856);
                            aezr aezrVar = ktf.a;
                            ktfVarJ = kgq.j(0L, 0L, 0L, 0L, buxVar2, 255);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-275010267);
                            aezr aezrVar2 = ktf.e;
                            long jA = ktw.a(((ktd) aezrVar2.a()).a, buxVar2);
                            long j = ((ktd) aezrVar2.a()).b;
                            buxVar2.v(1551263020);
                            buxVar2.o();
                            ktt kttVar = ((ktd) aezrVar2.a()).c;
                            long jA2 = ktt.a(buxVar2);
                            long j2 = ((ktd) aezrVar2.a()).d;
                            buxVar2.v(1551263020);
                            buxVar2.o();
                            long j3 = ((ktd) aezrVar2.a()).e;
                            buxVar2.v(1551263020);
                            buxVar2.o();
                            long j4 = ((ktd) aezrVar2.a()).f;
                            buxVar2.v(1551263020);
                            buxVar2.o();
                            long j5 = ((ktd) aezrVar2.a()).g;
                            buxVar2.v(1551263020);
                            buxVar2.o();
                            ktf ktfVar = new ktf(jA, 0L, 0L, jA2, 0L, 0L, 0L, 0L);
                            buxVar2.o();
                            ktfVarJ = ktfVar;
                        }
                        ksy ksyVar = z10 ? ksy.c : ksy.e;
                        git gitVar = gitVarA;
                        Object objG = buxVar2.g();
                        if (objG == buw.a) {
                            objG = new mkj(19);
                            buxVar2.x(objG);
                        }
                        asf asfVar = gitVar.e;
                        final bym bymVar = bymVarB;
                        final nmj nmjVar2 = nmjVar;
                        final ckv ckvVar2 = ckvVar;
                        final boolean z11 = z6;
                        khc.j((afdr) objG, null, ksyVar, z11, false, ckvVar2, null, ktfVarJ, null, null, null, asfVar, false, bxc.i(476916729, true, new afeh() { // from class: nmg
                            @Override // defpackage.afeh
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                bux buxVar3 = (bux) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((avx) obj4).getClass();
                                int i9 = iIntValue2 & 17;
                                if (buxVar3.I(i9 != 16, iIntValue2 & 1)) {
                                    Object objG2 = buxVar3.g();
                                    Object obj7 = buw.a;
                                    if (objG2 == obj7) {
                                        ksc kscVar = nlw.a;
                                        objG2 = new dlj(4.0f);
                                        buxVar3.x(objG2);
                                    }
                                    boolean z12 = z10;
                                    float f = ((dlj) objG2).a;
                                    Object objG3 = buxVar3.g();
                                    if (objG3 == obj7) {
                                        dlj dljVar = new dlj(z12 ? (ksy.c.h - ((f + f) + BitmapDescriptorFactory.HUE_RED)) + BitmapDescriptorFactory.HUE_RED : ksy.e.i);
                                        buxVar3.x(dljVar);
                                        objG3 = dljVar;
                                    }
                                    bym bymVar2 = bymVar;
                                    ckv ckvVar3 = ckvVar2;
                                    float f2 = ((dlj) objG3).a;
                                    buxVar3.v(-1244509121);
                                    cfy cfyVarA = new awc(f2, f2, f2, f2, true).a(new ate(true));
                                    float fFloatValue = ((Number) bymVar2.a()).floatValue();
                                    cfy cfyVarN = bxc.n(cfyVarA, fFloatValue, fFloatValue);
                                    if (z12) {
                                        long jZ = kfn.i(buxVar3).z();
                                        float fD = cjv.d(jZ);
                                        float fC = cjv.c(jZ);
                                        float fB = cjv.b(jZ);
                                        float[] fArr = clj.a;
                                        long j6 = cjn.j(fD, fC, fB, 0.5f, clj.y[(int) (jZ & 63)]);
                                        cfyVarN.getClass();
                                        ckvVar3.getClass();
                                        cfyVarN = afp.D(ebj.m(cfyVarN, f), f, j6, ckvVar3).a(new avl(f, f, f, f));
                                    }
                                    nmj nmjVar3 = nmjVar2;
                                    boolean z13 = z11;
                                    buxVar3.o();
                                    cfy cfyVarG = cjn.g(cfyVarN, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar3, true, 0, 1042431);
                                    cjx cjxVar = (!z13 || nmjVar3.e) ? new cjx(new float[]{0.213f, 0.715f, 0.072f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.213f, 0.715f, 0.072f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.213f, 0.715f, 0.072f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED}) : null;
                                    gjo gjoVar = nmjVar3.d;
                                    if (gjoVar != null) {
                                        buxVar3.v(75382397);
                                        Object objG4 = buxVar3.g();
                                        if (objG4 == obj7) {
                                            objG4 = new nle(2);
                                            buxVar3.x(objG4);
                                        }
                                        lnm.L(gjoVar, cfyVarG, null, null, BitmapDescriptorFactory.HUE_RED, cjxVar, null, null, null, (afec) objG4, buxVar3, 0, 6, 956);
                                        buxVar3.o();
                                    } else {
                                        buxVar3.v(75559903);
                                        ca.bb(lgi.f(nmjVar3.a, BitmapDescriptorFactory.HUE_RED, buxVar3, 3), null, cfyVarG, null, null, BitmapDescriptorFactory.HUE_RED, cjxVar, buxVar3, 56, 56);
                                        buxVar3.o();
                                    }
                                } else {
                                    buxVar3.s();
                                }
                                return afak.a;
                            }
                        }, buxVar2), buxVar2, 6, 24576, 14162);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, ((i3 << 3) & 112) | 12607494, 108);
            buxVarC = buxVarC;
            z4 = z6;
            cfyVar3 = cfyVar5;
        } else {
            buxVarC.s();
            cfyVar3 = cfyVar2;
            z4 = z2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nmi
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    ((Integer) obj3).intValue();
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    kgq.m(cfyVar3, nmjVar, z, z4, buxVar2, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10), i2);
                    return afak.a;
                }
            };
        }
    }

    public static final void n(cfy cfyVar, final nmj nmjVar, boolean z, boolean z2, final afdr afdrVar, boolean z3, final boolean z4, String str, boolean z5, bux buxVar, final int i, final int i2) {
        cfy cfyVar2;
        int i3;
        String str2;
        nmj nmjVar2;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        final cfy cfyVar3;
        final String str3;
        final boolean z9;
        boolean z10;
        boolean z11;
        final String str4;
        boolean z12;
        afdrVar.getClass();
        int i4 = i2 & 1;
        bux buxVarC = buxVar.c(1846014216);
        if (i4 != 0) {
            i3 = i | 6;
            cfyVar2 = cfyVar;
        } else if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i3 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(nmjVar) : buxVarC.E(nmjVar)) ? 16 : 32;
        }
        int i5 = i2 & 4;
        boolean z13 = i5 == 0;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != buxVarC.D(z) ? 128 : 256;
        }
        int i6 = i2 & 8;
        boolean z14 = i6 == 0;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(afdrVar) ? 8192 : 16384;
        }
        int i7 = i2 & 32;
        boolean z15 = i7 == 0;
        if (i7 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= true != buxVarC.D(z3) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.D(z4) ? 524288 : 1048576;
        }
        int i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 12582912) == 0) {
                i3 |= true != buxVarC.C(str2) ? 4194304 : 8388608;
            }
        }
        int i9 = i2 & 256;
        boolean z16 = i9 == 0;
        if (i9 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= true != buxVarC.D(z5) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i3) != 38347922, i3 & 1)) {
            final cfy cfyVar4 = i4 != 0 ? cfy.e : cfyVar2;
            final boolean z17 = z13 & z;
            boolean z18 = z14 & z2;
            boolean z19 = z15 & z3;
            if (i8 != 0) {
                z10 = z19;
                z11 = z18;
                str4 = "hotseat";
            } else {
                z10 = z19;
                z11 = z18;
                str4 = str2;
            }
            final boolean z20 = (!z16) | z5;
            if (nmjVar == null) {
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new nzt(cfyVar4, z17, z11, afdrVar, z10, z4, str4, z20, i, i2, 1);
                    return;
                }
                return;
            }
            final boolean z21 = z10;
            boolean z22 = z11;
            if (nmjVar.a.b == 8 && nmjVar.d == null && !z22) {
                bxf bxfVarJ2 = buxVarC.J();
                if (bxfVarJ2 != null) {
                    bxfVarJ2.c = new afeg() { // from class: nmb
                        @Override // defpackage.afeg
                        public final Object invoke(Object obj, Object obj2) {
                            bux buxVar2 = (bux) obj;
                            ((Integer) obj2).intValue();
                            cfy cfyVar5 = cfyVar4;
                            nmj nmjVar3 = nmjVar;
                            boolean z23 = z17;
                            afdr afdrVar2 = afdrVar;
                            int i10 = i | 1;
                            int i11 = 306783378 & i10;
                            int i12 = 613566756 & i10;
                            kgq.n(cfyVar5, nmjVar3, z23, false, afdrVar2, z21, z4, str4, z20, buxVar2, (i10 & (-920350135)) | i11 | (i12 >> 1) | ((i11 + i11) & i12), i2);
                            return afak.a;
                        }
                    };
                    return;
                }
                return;
            }
            final String str5 = str4;
            nmjVar2 = nmjVar;
            agg aggVarP = afp.p(nmjVar2, "HotseatAnimation", buxVarC, ((i3 >> 3) & 14) | 56, 0);
            Object objE = aggVarP.e();
            Object objG = aggVarP.g();
            boolean zC = ((57344 & i3) == 16384) | buxVarC.C(aggVarP);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new nmf(aggVarP, afdrVar, null);
                bvvVar.ad(objS);
            }
            bvq.f(objE, objG, (afeg) objS, buxVarC);
            int i10 = 3670016 & i3;
            Object objS2 = bvvVar.S();
            if (i10 == 1048576 || objS2 == buw.a) {
                objS2 = new nmc(z4, 0);
                bvvVar.ad(objS2);
            }
            afec afecVar = (afec) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == buw.a) {
                z12 = true;
                objS3 = new nna(z12 ? 1 : 0);
                bvvVar.ad(objS3);
            } else {
                z12 = true;
            }
            final cfy cfyVar5 = cfyVar4;
            cfyVar3 = cfyVar5;
            ca.U(aggVarP, null, afecVar, null, (afec) objS3, bxc.i(-260011610, z12, new afei() { // from class: nmd
                @Override // defpackage.afei
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    nmj nmjVar3 = (nmj) obj2;
                    bux buxVar2 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((abg) obj).getClass();
                    nmjVar3.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != ((iIntValue & 64) == 0 ? buxVar2.C(nmjVar3) : buxVar2.E(nmjVar3)) ? 16 : 32;
                    }
                    if (buxVar2.I((iIntValue & 145) != 144, iIntValue & 1)) {
                        boolean z23 = z21;
                        cfy cfyVarA = cfyVar5.a(new dca(str5));
                        if (z23) {
                            float f = gjk.a.k;
                            cfyVarA = cfyVarA.a(new avl(f, f, f, f));
                        }
                        kgq.m(cfyVarA, nmjVar3, z17, z20, buxVar2, (iIntValue & 112) | 64, 0);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 221184, 5);
            str3 = str5;
            z9 = z17;
            z7 = z20;
            z8 = z21;
            z6 = z22;
        } else {
            nmjVar2 = nmjVar;
            buxVarC.s();
            z6 = z2;
            z7 = z5;
            z8 = z3;
            cfyVar3 = cfyVar2;
            str3 = str2;
            z9 = z;
        }
        bxf bxfVarJ3 = buxVarC.J();
        if (bxfVarJ3 != null) {
            final nmj nmjVar3 = nmjVar2;
            bxfVarJ3.c = new afeg() { // from class: nme
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cfy cfyVar6 = cfyVar3;
                    nmj nmjVar4 = nmjVar3;
                    boolean z23 = z9;
                    boolean z24 = z6;
                    afdr afdrVar2 = afdrVar;
                    int i11 = i;
                    int i12 = i11 | 1;
                    int i13 = 306783378 & i12;
                    int i14 = i13 + i13;
                    int i15 = 613566756 & i12;
                    kgq.n(cfyVar6, nmjVar4, z23, z24, afdrVar2, z8, z4, str3, z7, (bux) obj, i13 | (i15 >> 1) | (i12 & (-920350135)) | (i14 & i15), i2);
                    return afak.a;
                }
            };
        }
    }

    public static final ktf o(boolean z, bux buxVar, int i) {
        long jB;
        aezr aezrVar = ktf.a;
        if (((z ? 1 : 0) & (i ^ 1)) != 0) {
            buxVar.v(-615695437);
            krr krrVar = krr.q;
            kso ksoVar = ksp.a;
            jB = ksp.b(kfn.i(buxVar), krrVar);
            ((bvv) buxVar).Y(false);
        } else {
            buxVar.v(-615644194);
            ((bvv) buxVar).Y(false);
            jB = 0;
        }
        return g(jB, 0L, 0L, 0L, buxVar, 254);
    }

    public static final kts p(boolean z, bux buxVar, int i) {
        long jI;
        long jK;
        aezr aezrVar = kts.a;
        if (((z ? 1 : 0) & (i ^ 1)) != 0) {
            buxVar.v(-328534590);
            jI = ksp.j(krr.q, buxVar);
            ((bvv) buxVar).Y(false);
        } else {
            buxVar.v(-328483347);
            ((bvv) buxVar).Y(false);
            jI = cjn.i(0);
        }
        long j = jI;
        long j2 = ksp.j(krr.s, buxVar);
        long j3 = ksp.j(krr.u, buxVar);
        if (leh.a.a().b()) {
            buxVar.v(-328241857);
            jK = ksp.j(krr.o, buxVar);
            ((bvv) buxVar).Y(false);
        } else {
            buxVar.v(-328187452);
            jK = ksp.k(krs.a, buxVar);
            ((bvv) buxVar).Y(false);
        }
        return jyw.k(j, j2, j3, jK, buxVar, 29950);
    }

    public static final brx q() {
        return new brx(bcr.b(8.0f), bcr.b(8.0f), bcr.b(8.0f));
    }

    private static final ktc r() {
        return (ktc) ktf.c.a();
    }

    private static final mko s() {
        return (mko) ktf.d.a();
    }
}
