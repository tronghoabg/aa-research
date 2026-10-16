package defpackage;

import android.graphics.Bitmap;
import android.util.Pair;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import com.google.android.libraries.maps.model.StampStyle;
import com.google.android.libraries.maps.model.StrokeStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aacr extends tqp implements zxk {
    public final zxl a;
    public final aacl b;
    boolean c;
    final List d;
    final List e;
    public final List f;
    public final twq g;
    private final float h;
    private final aaay i;
    private final aaay j;
    private final Executor k;
    private final int l;
    private final aaas m;
    private final List n;
    private final List o;
    private boolean p;
    private final List q;
    private final twj r;
    private final twj s;
    private final twj t;
    private final abnr u;
    private final ncp v;
    private final roa w;

    public aacr(float f, twq twqVar, zxl zxlVar, ncp ncpVar, int i) {
        Executor executorB = zrz.b();
        aaas aaasVarH = aaas.h();
        aacl aaclVar = aacl.b;
        this.d = new ArrayList();
        this.p = false;
        this.h = f;
        zkt.n(twqVar, "phoenixGoogleMap");
        this.g = twqVar;
        this.a = zxlVar;
        this.k = executorB;
        this.l = i;
        zkt.n(aaasVarH, "capProviderPhoenix");
        this.m = aaasVarH;
        zkt.n(aaclVar, "multiZoomStyleFactoryPhoenix");
        this.b = aaclVar;
        zkt.n(ncpVar, "clientRenderOpFactory");
        this.v = ncpVar;
        roa roaVarD = twqVar.d();
        this.w = roaVarD;
        this.o = new ArrayList();
        this.r = roaVarD.j();
        this.s = roaVarD.j();
        this.t = roaVarD.j();
        this.c = false;
        this.u = (abnr) abdd.a.n();
        this.n = new ArrayList();
        this.q = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.i = new aaay(i, 1, this, twqVar, ncpVar);
        this.j = new aaay(i, 2, this, twqVar, ncpVar);
    }

    private final void f() {
        if (this.c) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f;
            if (i >= list.size()) {
                m();
                e(new zww(this, arrayList, 5, null));
                return;
            } else {
                arrayList.add(i, Integer.valueOf(((tqo) list.get(i)).a()));
                i++;
            }
        }
    }

    private final void g() {
        boolean zG = this.a.g();
        for (tvz tvzVar : this.d) {
            if (zG) {
                tvzVar.g(this);
            } else {
                tvzVar.e();
            }
        }
        this.i.d(zG);
        this.j.d(zG);
    }

    private final void h() {
        boolean zE = this.a.i().e();
        this.i.f(zE);
        this.j.f(zE);
    }

    private final void i() {
        this.j.i(this.a.k());
    }

    private final void j() {
        int iB = this.a.b();
        if (iB == 0) {
            abnr abnrVar = this.u;
            abnrVar.t();
            abdd abddVar = (abdd) abnrVar.b;
            abdd abddVar2 = abdd.a;
            abddVar.i = 1;
            abddVar.b |= 32;
            return;
        }
        if (iB == 1) {
            abnr abnrVar2 = this.u;
            abnrVar2.t();
            abdd abddVar3 = (abdd) abnrVar2.b;
            abdd abddVar4 = abdd.a;
            abddVar3.i = 0;
            abddVar3.b |= 32;
            return;
        }
        abnr abnrVar3 = this.u;
        if (iB != 2) {
            abnrVar3.t();
            abdd abddVar5 = (abdd) abnrVar3.b;
            abdd abddVar6 = abdd.a;
            abddVar5.i = 1;
            abddVar5.b |= 32;
            return;
        }
        abnrVar3.t();
        abdd abddVar7 = (abdd) abnrVar3.b;
        abdd abddVar8 = abdd.a;
        abddVar7.i = 2;
        abddVar7.b |= 32;
    }

    private final void k() {
        aacq aacqVar;
        zxl zxlVar = this.a;
        List list = this.n;
        zxlVar.d(list, this.q);
        aacq aacqVar2 = null;
        if (list.size() < 2) {
            aacqVar = null;
        } else {
            int i = 0;
            LatLng latLng = null;
            while (i < list.size()) {
                LatLng latLng2 = (LatLng) list.get(i);
                if (latLng != null && latLng2 != null && !a.C(latLng, latLng2)) {
                    aacqVar = new aacq(latLng, latLng2);
                    break;
                } else {
                    i++;
                    if (latLng == null) {
                        latLng = latLng2;
                    }
                }
            }
            aacqVar = null;
        }
        if (list.size() >= 2) {
            int size = list.size() - 1;
            LatLng latLng3 = null;
            while (true) {
                if (size < 0) {
                    break;
                }
                LatLng latLng4 = (LatLng) list.get(size);
                if (latLng3 != null && latLng4 != null && !a.C(latLng3, latLng4)) {
                    aacqVar2 = new aacq(latLng4, latLng3);
                    break;
                } else {
                    size--;
                    if (latLng3 == null) {
                        latLng3 = latLng4;
                    }
                }
            }
        }
        if (aacqVar == null || list.size() < 2 || ((LatLng) list.get(0)).equals(yrm.an(list))) {
            this.i.b();
            this.j.b();
            return;
        }
        aaay aaayVar = this.i;
        Object obj = aacqVar.b;
        LatLng latLng5 = (LatLng) aacqVar.a;
        aaayVar.e(latLng5, ysi.J((LatLng) obj, latLng5));
        aaay aaayVar2 = this.j;
        LatLng latLng6 = (LatLng) aacqVar2.b;
        aaayVar2.e(latLng6, ysi.J((LatLng) aacqVar2.a, latLng6));
    }

    private final void l() {
        this.i.i(this.a.l());
    }

    private final void m() {
        Bitmap bitmapE;
        tqo tqoVarB;
        List list = this.e;
        list.clear();
        zxl zxlVar = this.a;
        list.addAll(zxlVar.c());
        List list2 = this.f;
        list2.clear();
        int i = 0;
        int i2 = 0;
        while (i2 < list.size()) {
            aacq aacqVar = (aacq) list.get(i2);
            abnp abnpVarN = abes.a.n();
            float fA = aacqVar.a();
            float f = this.h;
            int iRound = Math.round((fA / f) * 8.0f);
            abnpVarN.t();
            abes abesVar = (abes) abnpVarN.b;
            abesVar.b |= 8;
            abesVar.e = iRound;
            Pair<Integer, Integer> colors = ((StrokeStyle.Builder) aacqVar.a).getColors();
            int iIntValue = ((Integer) colors.first).intValue();
            abnpVarN.t();
            abes abesVar2 = (abes) abnpVarN.b;
            abesVar2.b |= 1;
            abesVar2.c = iIntValue;
            if (!((Integer) colors.first).equals(colors.second)) {
                int iIntValue2 = ((Integer) colors.second).intValue();
                abnpVarN.t();
                abes abesVar3 = (abes) abnpVarN.b;
                abesVar3.b |= 4;
                abesVar3.d = iIntValue2;
            }
            if (((aacq) list.get(i2)).e()) {
                if (i2 == 0) {
                    bitmapE = this.m.e(zxlVar.l().b());
                    i2 = i;
                } else {
                    bitmapE = null;
                }
                Bitmap bitmapE2 = i2 == list.size() + (-1) ? this.m.e(zxlVar.k().b()) : null;
                Object obj = ((aacq) list.get(i2)).b;
                Object obj2 = ((aacq) list.get(i2)).b;
                Object obj3 = obj2 == null ? null : ((zyh) obj2).d;
                if (obj != null && ((StampStyle) ((zyh) obj).a).asSprite() && obj3 != null) {
                    twq twqVar = this.g;
                    float fA2 = zxlVar.a();
                    abes abesVar4 = (abes) abnpVarN.q();
                    ArrayList arrayList = new ArrayList();
                    abnp abnpVarK = abesVar4.K();
                    abnpVarK.t();
                    abes abesVar5 = (abes) abnpVarK.b;
                    abesVar5.b |= 1;
                    abesVar5.c = -1;
                    abnpVarK.t();
                    abes abesVar6 = (abes) abnpVarK.b;
                    abesVar6.b |= 4;
                    abesVar6.d = -1;
                    arrayList.add(new tpq((abes) abnpVarK.q(), (Bitmap) obj3, bitmapE, bitmapE2));
                    int iE = aaaw.e(fA2);
                    typ typVar = (typ) twqVar.b;
                    List listN = typVar.n(arrayList);
                    ygp ygpVar = new ygp();
                    tyh tyhVar = typVar.g;
                    int andIncrement = tyhVar.c.getAndIncrement();
                    uke[] ukeVarArr = new uke[listN.size()];
                    for (int i3 = 0; i3 < listN.size(); i3++) {
                        tvn tvnVar = (tvn) listN.get(i3);
                        uke ukeVarA = uke.a(tvnVar.a, null);
                        usf usfVar = tvnVar.b;
                        if (usfVar != null) {
                            ukeVarA.i = usfVar;
                            ygpVar.c(usfVar);
                        }
                        usf usfVar2 = tvnVar.c;
                        if (usfVar2 != null) {
                            ukeVarA.j = usfVar2;
                            ygpVar.c(usfVar2);
                        }
                        usf usfVar3 = tvnVar.d;
                        if (usfVar3 != null) {
                            ukeVarA.k = usfVar3;
                            ygpVar.c(usfVar3);
                        }
                        ukeVarArr[i3] = ukeVarA;
                    }
                    ujf ujfVar = ujf.c;
                    uje ujeVar = new uje();
                    ujeVar.k = ukeVarArr;
                    ujeVar.v = iE;
                    ujeVar.y = 1;
                    txk txkVarE = tyhVar.e(new ujf(ujeVar), andIncrement, ygpVar.g());
                    txkVarE.h(true);
                    tqoVarB = txkVarE;
                } else if (zxlVar.h() == null || !zxlVar.isVisible()) {
                    twq twqVar2 = this.g;
                    float fA3 = zxlVar.a();
                    abes abesVar7 = (abes) abnpVarN.q();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new tpq(abesVar7, null, bitmapE, bitmapE2));
                    if (obj3 != null) {
                        abnp abnpVarK2 = abesVar7.K();
                        abnpVarK2.t();
                        abes abesVar8 = (abes) abnpVarK2.b;
                        abesVar8.b |= 1;
                        abesVar8.c = -1;
                        abnpVarK2.t();
                        abes abesVar9 = (abes) abnpVarK2.b;
                        abesVar9.b |= 4;
                        abesVar9.d = -1;
                        arrayList2.add(new tpq((abes) abnpVarK2.q(), (Bitmap) obj3, bitmapE, bitmapE2));
                    }
                    tqoVarB = twqVar2.b.b(aaaw.e(fA3), arrayList2);
                } else {
                    twq twqVar3 = this.g;
                    PatternItem[] patternItemArrH = zxlVar.h();
                    float fA4 = zxlVar.i().a();
                    float fA5 = zxlVar.a();
                    trh trhVar = new trh(fA4, f);
                    zkt.n(patternItemArrH, "patternItems");
                    abes abesVar10 = (abes) abnpVarN.q();
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new tpq((abes) abnpVarN.q(), aacl.a(patternItemArrH, trhVar), bitmapE, bitmapE2));
                    if (obj3 != null) {
                        abnp abnpVarK3 = abesVar10.K();
                        abnpVarK3.t();
                        abes abesVar11 = (abes) abnpVarK3.b;
                        abesVar11.b |= 1;
                        abesVar11.c = -1;
                        abnpVarK3.t();
                        abes abesVar12 = (abes) abnpVarK3.b;
                        abesVar12.b |= 4;
                        abesVar12.d = -1;
                        arrayList3.add(new tpq((abes) abnpVarK3.q(), (Bitmap) obj3, bitmapE, bitmapE2));
                    }
                    tqoVarB = twqVar3.b.b(aaaw.e(fA5), arrayList3);
                }
                list2.add(tqoVarB);
            } else {
                twq twqVar4 = this.g;
                float fA6 = zxlVar.a();
                abnpVarN.t();
                abes abesVar13 = (abes) abnpVarN.b;
                abesVar13.b |= 1;
                abesVar13.c = i;
                list2.add(twqVar4.b.b(aaaw.e(fA6), yfq.q(new tpq((abes) abnpVarN.q(), aacl.a, null, null))));
            }
            i2++;
            i = 0;
        }
    }

    private final void n() {
        float fA = this.a.i().a();
        this.i.g(fA);
        this.j.g(fA);
    }

    private final void o() {
        zxl zxlVar = this.a;
        this.i.h(zxlVar.a());
        this.j.h(zxlVar.a());
    }

    @Override // defpackage.zxk
    public final void a(int i) {
        if (this.c) {
            return;
        }
        if (i == 0) {
            k();
            if (this.a.getSpans().isEmpty()) {
                e(null);
                return;
            } else {
                f();
                return;
            }
        }
        if (i == 3) {
            n();
            f();
            return;
        }
        if (i != 4) {
            switch (i) {
                case 6:
                    break;
                case 7:
                    o();
                    f();
                    return;
                case 8:
                    l();
                    f();
                    return;
                case 9:
                    i();
                    f();
                    return;
                case 10:
                    j();
                    e(null);
                    return;
                case 11:
                    f();
                    return;
                case 12:
                    g();
                    return;
                case 13:
                    k();
                    f();
                    return;
                default:
                    throw new IllegalArgumentException(a.bn(i, "Invalid notifyPropertyUpdated(", ")"));
            }
        }
        h();
        f();
    }

    @Override // defpackage.tqq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.k.execute(new aabr(this, 5));
    }

    @Override // defpackage.zxk
    public final void c() {
        if (this.c) {
            return;
        }
        this.i.c();
        this.j.c();
        this.r.a(null);
        this.d.clear();
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((twj) it.next()).a(null);
        }
        this.s.a(null);
        this.t.a(null);
        this.w.i(new aabr(this, 6));
        this.c = true;
    }

    public final void d() {
        synchronized (this) {
            if (this.p) {
                return;
            }
            this.p = true;
            abnr abnrVar = this.u;
            abnrVar.t();
            abdd abddVar = (abdd) abnrVar.b;
            abdd abddVar2 = abdd.a;
            abddVar.g = 4;
            abddVar.b |= 8;
            abnrVar.t();
            abdd abddVar3 = (abdd) abnrVar.b;
            abddVar3.h = 4;
            abddVar3.b |= 16;
            int i = this.l;
            abnrVar.t();
            abdd abddVar4 = (abdd) abnrVar.b;
            abddVar4.b |= 2048;
            abddVar4.o = i;
            k();
            j();
            h();
            n();
            o();
            m();
            l();
            i();
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    public final void e(Runnable runnable) {
        ?? r27;
        List<abdd> arrayList;
        int i;
        float fSqrt;
        int i2;
        if (this.c) {
            return;
        }
        List list = this.d;
        list.clear();
        d();
        List list2 = this.n;
        int size = list2.size();
        int i3 = size + size;
        double[] dArr = new double[i3];
        for (int i4 = 0; i4 < list2.size(); i4++) {
            int i5 = i4 + i4;
            dArr[i5] = ((LatLng) list2.get(i4)).latitude;
            dArr[i5 + 1] = ((LatLng) list2.get(i4)).longitude;
        }
        List list3 = this.q;
        if (list3.isEmpty()) {
            tqo tqoVar = (tqo) yrm.ao(this.f);
            abdd abddVar = (abdd) this.u.b;
            int i6 = abddVar.o;
            int i7 = abddVar.p;
            int iAv = a.av(abddVar.g);
            if (iAv == 0) {
                iAv = 2;
            }
            int iAv2 = a.av(abddVar.h);
            if (iAv2 == 0) {
                iAv2 = 2;
            }
            int iAp = a.ap(abddVar.i);
            abnr abnrVarU = ncp.u(dArr, i6, i7, iAv, iAv2, iAp == 0 ? 1 : iAp);
            abcy abcyVarB = tqoVar.b();
            if (abcyVarB != null) {
                abnrVarU.bc(abcz.f, abcyVarB);
            } else if (tqoVar.a() != -1) {
                int iA = tqoVar.a();
                abnrVarU.t();
                abdd abddVar2 = (abdd) abnrVarU.b;
                abddVar2.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                abddVar2.m = iA;
            }
            arrayList = yfq.q((abdd) abnrVarU.q());
            r27 = 1;
        } else {
            int size2 = list3.size();
            int[] iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = ((Integer) list3.get(i8)).intValue();
            }
            List list4 = this.f;
            abdd abddVar3 = (abdd) this.u.b;
            int i9 = abddVar3.o;
            int i10 = abddVar3.p;
            int iAv3 = a.av(abddVar3.g);
            int i11 = iAv3 == 0 ? 2 : iAv3;
            int iAv4 = a.av(abddVar3.h);
            int i12 = iAv4 == 0 ? 2 : iAv4;
            int iAp2 = a.ap(abddVar3.i);
            int i13 = iAp2 == 0 ? 1 : iAp2;
            ArrayList arrayList2 = new ArrayList();
            r27 = 1;
            woy.aa(!list4.isEmpty(), "At least one style must be provided.");
            woy.aa(size2 == list4.size() + (-1), "The number of linebreaks must equal numberOfStyles-1");
            if (!arrayList2.isEmpty()) {
                woy.aa(arrayList2.size() == list4.size(), "The number of consumed styles must equal number of segment styles");
            }
            ArrayList arrayList3 = new ArrayList(list4);
            ArrayList arrayList4 = new ArrayList(arrayList2);
            ArrayList arrayList5 = new ArrayList();
            HashSet hashSet = new HashSet();
            tyz tyzVar = (tyz) arrayList3.get(0);
            hashSet.add(tyzVar);
            int i14 = 1;
            while (i14 < arrayList3.size()) {
                tyz tyzVar2 = (tyz) arrayList3.get(i14);
                ArrayList arrayList6 = arrayList2;
                if (tyzVar.l(tyzVar2, false)) {
                    if (hashSet.contains(tyzVar2)) {
                        i2 = i9;
                    } else {
                        i2 = i9;
                        if (hashSet.size() == 8) {
                        }
                    }
                    hashSet.add(tyzVar2);
                    i14++;
                    i9 = i2;
                    arrayList2 = arrayList6;
                } else {
                    i2 = i9;
                }
                arrayList5.add(Integer.valueOf(i14));
                hashSet.clear();
                tyzVar = tyzVar2;
                hashSet.add(tyzVar2);
                i14++;
                i9 = i2;
                arrayList2 = arrayList6;
            }
            ArrayList arrayList7 = arrayList2;
            int i15 = i9;
            arrayList = new ArrayList();
            Iterator it = arrayList5.iterator();
            int i16 = 0;
            int i17 = 0;
            float f = BitmapDescriptorFactory.HUE_RED;
            double[] dArr2 = null;
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                int i18 = iIntValue - 1;
                int i19 = iArr[i18];
                int i20 = i19 + i19;
                int i21 = i16 / 2;
                Iterator it2 = it;
                int i22 = i20 + 2;
                double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i16, i22);
                Collection collectionSubList = !arrayList7.isEmpty() ? arrayList4.subList(i17, iIntValue) : arrayList4;
                int[] iArrQ = ncp.q(Arrays.copyOfRange(iArr, i17, i18), -i21);
                List listSubList = arrayList3.subList(i17, iIntValue);
                double[] dArr3 = {dArr[i22], dArr[i20 + 3]};
                int i23 = i10;
                ArrayList arrayList8 = arrayList4;
                arrayList.add(ncp.t(dArrCopyOfRange, iArrQ, listSubList, collectionSubList, i15, i23, i11, i12, i13, f, dArr2, dArr3));
                int length = dArrCopyOfRange.length;
                if (length < 4 || (length & 1) != 0) {
                    i = iIntValue;
                    fSqrt = BitmapDescriptorFactory.HUE_RED;
                } else {
                    int i24 = iIntValue;
                    int[] iArrX = too.x(dArrCopyOfRange[0], dArrCopyOfRange[1]);
                    int i25 = 1;
                    fSqrt = BitmapDescriptorFactory.HUE_RED;
                    while (i25 < (dArrCopyOfRange.length >> 1)) {
                        int i26 = i25 + i25;
                        int[] iArr2 = iArrX;
                        int i27 = i25;
                        iArrX = too.x(dArrCopyOfRange[i26], dArrCopyOfRange[i26 + 1]);
                        int i28 = iArr2[0] - iArrX[0];
                        int i29 = iArr2[1] - iArrX[1];
                        double d = fSqrt;
                        float f2 = i29;
                        float f3 = i28;
                        fSqrt = (float) (d + Math.sqrt((f3 * f3) + (f2 * f2)));
                        i25 = i27 + 1;
                        i24 = i24;
                    }
                    i = i24;
                }
                f += fSqrt;
                int length2 = dArrCopyOfRange.length;
                arrayList4 = arrayList8;
                dArr2 = new double[]{dArrCopyOfRange[length2 - 4], dArrCopyOfRange[length2 - 3]};
                i17 = i;
                i10 = i23;
                i16 = i20;
                it = it2;
            }
            ArrayList arrayList9 = arrayList4;
            arrayList.add(ncp.t(Arrays.copyOfRange(dArr, i16, i3), ncp.q(Arrays.copyOfRange(iArr, i17, size2), -(i16 / 2)), arrayList3.subList(i17, list4.size()), !arrayList7.isEmpty() ? arrayList9.subList(i17, list4.size()) : arrayList9, i15, i10, i11, i12, i13, f, dArr2, null));
        }
        for (abdd abddVar4 : arrayList) {
            ncp ncpVar = this.v;
            boolean zC = addm.a.gu().c();
            abnr abnrVar = (abnr) abddVar4.K();
            abnrVar.bc(ujr.g, Boolean.valueOf((boolean) r27));
            list.add(((txj) ncpVar.c).a((abdd) abnrVar.q(), abfi.WORLD_ENCODING_LAT_LNG_DOUBLE, ((typ) ncpVar.b).g, uuo.a, aekj.a, zC));
        }
        g();
        int size3 = list.size();
        List list5 = this.o;
        int size4 = list5.size();
        while (size4 < size3) {
            list5.add(this.w.j());
            size4++;
        }
        while (size4 > size3) {
            size4--;
            twj twjVar = (twj) list5.remove(list5.size() - 1);
            Object obj = twjVar.d;
            synchronized (obj) {
                ((roa) obj).h(twjVar);
            }
            tpz[] tpzVarArr = new tpz[3];
            tpzVarArr[0] = twjVar.a;
            tpzVarArr[r27] = twjVar.b;
            tpzVarArr[2] = twjVar.c;
            for (tpz tpzVar : yrm.q(tpzVarArr)) {
                if (tpzVar != null) {
                    tpzVar.f();
                }
            }
            twjVar.c = null;
            twjVar.b = null;
            twjVar.a = null;
        }
        for (int i30 = 0; i30 < size3; i30++) {
            ((twj) list5.get(i30)).a((tvz) list.get(i30));
        }
        this.s.a(this.i.a());
        this.t.a(this.j.a());
        this.w.i(runnable);
    }
}
