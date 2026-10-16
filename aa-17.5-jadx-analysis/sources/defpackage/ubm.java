package defpackage;

import android.content.res.Resources;
import android.graphics.RectF;
import com.google.android.libraries.geo.mapcore.renderer.LabelRenderer;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class ubm {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/label/GLLabelGroup");
    public static final abal b = abal.a;
    public static final abfc c = abfc.a;
    public static final ufg d = new ufb(BitmapDescriptorFactory.HUE_RED);
    private static final uwk k = new uwk(new ArrayList());
    public final ArrayList e;
    public boolean f;
    public final ufa h;
    public final int i;
    public int j;
    private final int m;
    private ArrayList n;
    private final float o;
    private final float p;
    private final float q;
    private boolean l = true;
    public final AtomicReference g = new AtomicReference(new ubk());

    public ubm(ArrayList arrayList, qsb qsbVar, int i, int i2, int i3) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        this.e = arrayList;
        this.j = i;
        this.i = i3;
        if (arrayList.isEmpty()) {
            f = BitmapDescriptorFactory.HUE_RED;
            f2 = BitmapDescriptorFactory.HUE_RED;
            f3 = BitmapDescriptorFactory.HUE_RED;
            f4 = BitmapDescriptorFactory.HUE_RED;
            f5 = BitmapDescriptorFactory.HUE_RED;
        } else {
            int size = arrayList.size();
            float fMax = BitmapDescriptorFactory.HUE_RED;
            float f9 = BitmapDescriptorFactory.HUE_RED;
            for (int i4 = 0; i4 < size; i4++) {
                List list = (List) arrayList.get(i4);
                int size2 = list.size();
                float f10 = BitmapDescriptorFactory.HUE_RED;
                float fMax2 = BitmapDescriptorFactory.HUE_RED;
                for (int i5 = 0; i5 < size2; i5++) {
                    ufg ufgVar = ((ubj) list.get(i5)).a;
                    f10 += ufgVar.h;
                    fMax2 = Math.max(fMax2, ufgVar.d());
                }
                fMax = Math.max(fMax, f10);
                f9 += fMax2;
            }
            List list2 = (List) arrayList.get(0);
            if (list2.isEmpty()) {
                f6 = BitmapDescriptorFactory.HUE_RED;
                f7 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f7 = (i2 == 2 || i2 == 4) ? ((ubj) list2.get(0)).a.h : BitmapDescriptorFactory.HUE_RED;
                f6 = (i2 == 3 || i2 == 4) ? ((ubj) yrm.an(list2)).a.h : BitmapDescriptorFactory.HUE_RED;
            }
            List list3 = (List) arrayList.get(0);
            List list4 = (List) yrm.an(arrayList);
            int size3 = list3.size();
            int i6 = 0;
            float fMax3 = BitmapDescriptorFactory.HUE_RED;
            float fMax4 = BitmapDescriptorFactory.HUE_RED;
            while (true) {
                f8 = 2.0f;
                if (i6 >= size3) {
                    break;
                }
                ufg ufgVar2 = ((ubj) list3.get(i6)).a;
                float fD = ufgVar2.d() / 2.0f;
                fMax4 = Math.max(fMax4, fD);
                fMax3 = Math.max(fMax3, fD + ufgVar2.c());
                i6++;
            }
            float f11 = fMax3 > fMax4 ? fMax3 - fMax4 : BitmapDescriptorFactory.HUE_RED;
            int size4 = list4.size();
            int i7 = 0;
            float fMax5 = BitmapDescriptorFactory.HUE_RED;
            float fMax6 = BitmapDescriptorFactory.HUE_RED;
            while (i7 < size4) {
                ufg ufgVar3 = ((ubj) list4.get(i7)).a;
                float f12 = f8;
                float fD2 = ufgVar3.d() / f12;
                fMax6 = Math.max(fMax6, fD2);
                fMax5 = Math.max(fMax5, fD2 + ufgVar3.i());
                i7++;
                f8 = f12;
            }
            f5 = f6;
            f3 = (fMax5 > fMax6 ? fMax5 - fMax6 : BitmapDescriptorFactory.HUE_RED) + f9 + f11;
            f4 = f7;
            f2 = fMax;
            f = f11;
        }
        this.o = f2;
        this.p = f3;
        this.q = f;
        if (qsbVar != null) {
            this.h = new ufc(new uer(f2, f3, f4, f5, (abaf) qsbVar.b, (ujf) qsbVar.c, ((Resources) qsbVar.d).getDisplayMetrics().density), (ues) qsbVar.a, (Resources) qsbVar.d);
        } else {
            this.h = null;
        }
        int size5 = arrayList.size();
        this.n = yrm.S(size5);
        int size6 = 0;
        for (int i8 = 0; i8 < size5; i8++) {
            List list5 = (List) arrayList.get(i8);
            this.n.add(Collections.nCopies(list5.size(), ubl.a));
            size6 += list5.size();
        }
        this.m = size6;
        this.f = false;
    }

    public static void f(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((uwk) list.get(i)).c();
        }
    }

    static boolean k(String str, ujf ujfVar) {
        ukn uknVar;
        return (str == null || str.length() == 0 || (uknVar = ujfVar.r) == null || uknVar.d <= 0 || (uknVar.b & (-16777216)) == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ubm n(defpackage.abco r26, defpackage.udx r27, int r28, defpackage.yfq r29, android.content.res.Resources r30, defpackage.ues r31, defpackage.ufw r32, defpackage.ufe r33, defpackage.upw r34, defpackage.ueu r35) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubm.n(abco, udx, int, yfq, android.content.res.Resources, ues, ufw, ufe, upw, ueu):ubm");
    }

    public final float a() {
        ufa ufaVar = this.h;
        return ufaVar != null ? ufaVar.i : this.p;
    }

    final float b() {
        return ((ubk) this.g.get()).e.c;
    }

    public final float c() {
        ufa ufaVar = this.h;
        return ufaVar != null ? ufaVar.h : this.o;
    }

    public final ubk d() {
        return (ubk) this.g.get();
    }

    public final void e() {
        ((ubk) this.g.getAndSet(new ubk())).a();
        this.e.clear();
    }

    public final void g(float f, float f2) {
        ((ubk) this.g.get()).e.n(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(umk umkVar) {
        ubk ubkVar = (ubk) this.g.get();
        if (ubkVar.b()) {
            float f = ubkVar.g;
            yfq yfqVar = ubkVar.d;
            int size = yfqVar.size();
            for (int i = 0; i < size; i++) {
                tpf tpfVar = (tpf) yfqVar.get(i);
                uwk uwkVar = (uwk) ubkVar.a.get(i);
                tpf tpfVar2 = ubkVar.e;
                float f2 = tpfVar2.b + (tpfVar.b * f);
                float f3 = tpfVar2.c + (tpfVar.c * f);
                double d2 = ubkVar.f;
                float f4 = uwkVar.a * f;
                float f5 = uwkVar.b * f;
                uew uewVar = umkVar.h;
                uewVar.h(f2, f3, d2, f4 / 2.0f, f5 / 2.0f);
                if (uewVar.e(umkVar.b.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    final boolean i() {
        ArrayList arrayList;
        if (!this.l) {
            return true;
        }
        ArrayList arrayList2 = this.e;
        int i = 0;
        if (arrayList2.isEmpty()) {
            this.l = false;
            return true;
        }
        ArrayList arrayListS = yrm.S(arrayList2.size());
        ArrayList arrayListS2 = yrm.S(arrayList2.size());
        int i2 = this.m;
        ArrayList arrayListS3 = yrm.S(i2);
        ArrayList arrayListS4 = yrm.S(i2);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            List list = (List) arrayList2.get(i3);
            List list2 = (List) this.n.get(i3);
            int size = list.size();
            int i4 = i;
            while (i4 < size) {
                ubj ubjVar = (ubj) list.get(i4);
                ubl ublVar = (ubl) list2.get(i4);
                boolean z = i;
                if (ubjVar.d != 3) {
                    uwk uwkVarA = ubjVar.a.a();
                    if (uwkVarA == null) {
                        f(arrayListS);
                        f(arrayListS2);
                        this.l = true;
                        return z;
                    }
                    arrayListS.add(uwkVarA);
                    arrayListS3.add(ubjVar);
                    arrayListS4.add(ublVar);
                    uwk uwkVarA2 = ublVar.c.a();
                    if (uwkVarA2 == null) {
                        uwkVarA2 = k;
                    }
                    arrayListS2.add(uwkVarA2);
                }
                i4++;
                i = z ? 1 : 0;
            }
        }
        boolean z2 = i;
        ArrayList arrayListS5 = yrm.S(arrayList2.size());
        float f = this.p;
        float f2 = f - this.q;
        for (int i5 = z2 ? 1 : 0; i5 < arrayList2.size(); i5++) {
            List list3 = (List) arrayList2.get(i5);
            int size2 = list3.size();
            float fMax = BitmapDescriptorFactory.HUE_RED;
            float f3 = BitmapDescriptorFactory.HUE_RED;
            for (int i6 = z2 ? 1 : 0; i6 < size2; i6++) {
                ufg ufgVar = ((ubj) list3.get(i6)).a;
                fMax = Math.max(fMax, ufgVar.d());
                f3 += ufgVar.h;
            }
            int i7 = this.j;
            float f4 = i7 == 1 ? (this.o - f3) / 2.0f : i7 == 3 ? this.o - f3 : BitmapDescriptorFactory.HUE_RED;
            int size3 = list3.size();
            int i8 = z2 ? 1 : 0;
            while (i8 < size3) {
                ufg ufgVar2 = ((ubj) list3.get(i8)).a;
                ArrayList arrayList3 = arrayList2;
                if (ufgVar2 instanceof ufb) {
                    f4 += ufgVar2.h;
                    arrayList = arrayListS;
                } else {
                    float f5 = ufgVar2.h;
                    float f6 = ufgVar2.i;
                    float fD = (f2 - ((fMax - ufgVar2.d()) / 2.0f)) + ufgVar2.c();
                    float f7 = f4 - (this.o * 0.5f);
                    float f8 = fD - (f * 0.5f);
                    arrayList = arrayListS;
                    arrayListS5.add(new tpf((f7 + f7 + f5) * 0.5f, (-((f8 - f6) + f8)) * 0.5f));
                    f4 += f5;
                }
                i8++;
                arrayList2 = arrayList3;
                arrayListS = arrayList;
            }
            f2 -= fMax;
        }
        ((ubk) this.g.getAndSet(new ubk(this, arrayListS, arrayListS3, arrayListS4, arrayListS2, arrayListS5))).a();
        this.l = z2;
        return true;
    }

    public final boolean j() {
        return this.e.isEmpty();
    }

    final void l(int i) {
        int i2 = this.j;
        if (i == 0) {
            throw null;
        }
        if (i != i2) {
            this.j = i;
            this.l = true;
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    public final void m(udc udcVar, LabelRenderer labelRenderer, double d2, float f, tpf tpfVar, float f2, utf utfVar) {
        tpf tpfVar2;
        yfq yfqVar;
        ubk ubkVar;
        int i;
        ufa ufaVar;
        uwi uwiVarB;
        float f3 = f;
        tpf tpfVar3 = tpfVar;
        ubk ubkVar2 = (ubk) this.g.get();
        tpf tpfVar4 = ubkVar2.e;
        float f4 = tpfVar4.b;
        float f5 = tpfVar4.c;
        ubkVar2.f = d2;
        ubkVar2.g = f3;
        uwk uwkVar = ubkVar2.c;
        tpf tpfVar5 = udcVar.b;
        if (uwkVar == null || (ufaVar = this.h) == null || (uwiVarB = uwkVar.b(0)) == null) {
            tpfVar2 = tpfVar5;
        } else {
            float f6 = tpfVar3.b;
            float f7 = tpfVar3.c;
            float fB = uwiVarB.b() * f3;
            float fA = uwiVarB.a() * f3;
            int i2 = uwiVarB.e;
            int i3 = uwiVarB.d;
            int i4 = uwiVarB.c;
            tpfVar2 = tpfVar5;
            labelRenderer.a(uwiVarB, utfVar, f4, f5, f6, f7, fB, fA, uwiVarB.b, i4, i3, i2, f2);
            RectF rectF = ((ufc) ufaVar).a.i;
            tpfVar2.n(((rectF.left - rectF.right) / 2.0f) * f3, ((rectF.top - rectF.bottom) / 2.0f) * f3);
            tpf.e(tpfVar2, tpfVar3, tpfVar2);
            f4 += tpfVar2.b;
            f5 += tpfVar2.c;
        }
        yfq yfqVar2 = ubkVar2.d;
        int size = yfqVar2.size();
        int i5 = 0;
        while (i5 < size) {
            tpf.e((tpf) yfqVar2.get(i5), tpfVar3, tpfVar2);
            uwk uwkVar2 = (uwk) ubkVar2.a.get(i5);
            int i6 = 0;
            while (i6 < uwkVar2.a()) {
                uwi uwiVarB2 = uwkVar2.b(i6);
                if (uwiVarB2 != null) {
                    float f8 = f4 + (tpfVar2.b * f3);
                    float f9 = f5 + (tpfVar2.c * f3);
                    float f10 = tpfVar3.b;
                    float f11 = tpfVar3.c;
                    float fB2 = uwiVarB2.b() * f3;
                    float fA2 = uwiVarB2.a() * f3;
                    yfqVar = yfqVar2;
                    ubkVar = ubkVar2;
                    float f12 = uwiVarB2.e;
                    i = i6;
                    labelRenderer.a(uwiVarB2, utfVar, f8, f9, f10, f11, fB2, fA2, uwiVarB2.b, uwiVarB2.c, uwiVarB2.d, f12, f2);
                } else {
                    yfqVar = yfqVar2;
                    ubkVar = ubkVar2;
                    i = i6;
                }
                i6 = i + 1;
                yfqVar2 = yfqVar;
                f3 = f;
                tpfVar3 = tpfVar;
                ubkVar2 = ubkVar;
            }
            i5++;
            f3 = f;
            tpfVar3 = tpfVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [aels, java.lang.Object] */
    public final void o(ubm ubmVar, rjg rjgVar) {
        int size;
        List list;
        int i;
        ArrayList arrayList;
        abfc abfcVar;
        ufg ufgVar;
        ArrayList arrayList2;
        ArrayList arrayList3 = ubmVar.e;
        int size2 = arrayList3.size();
        ArrayList arrayList4 = this.e;
        int size3 = arrayList4.size();
        this.n = yrm.S(size3);
        int i2 = 0;
        this.f = false;
        int i3 = 0;
        while (i3 < size3) {
            if (i3 < size2) {
                list = (List) arrayList3.get(i3);
                size = list.size();
            } else {
                size = i2;
                list = null;
            }
            List list2 = (List) arrayList4.get(i3);
            int size4 = list2.size();
            ArrayList arrayListS = yrm.S(size4);
            int i4 = i2;
            while (i4 < size4) {
                int i5 = 3;
                if (list == null || i4 >= size) {
                    i = size2;
                    arrayList = arrayList4;
                    abfcVar = null;
                    ufgVar = null;
                } else {
                    ubj ubjVar = (ubj) list.get(i4);
                    if (rjgVar != null) {
                        int i6 = ubjVar.c;
                        int i7 = ((ubj) list2.get(i4)).c;
                        i = size2;
                        arrayList = arrayList4;
                        long j = i6;
                        ?? r6 = rjgVar.b;
                        long j2 = (j << 32) | i7;
                        if (r6.d(j2)) {
                            abfcVar = (abfc) ((yfq) rjgVar.a).get(r6.s(j2));
                        }
                        ufg ufgVar2 = ubjVar.a;
                        i5 = ubjVar.d;
                        ufgVar = ufgVar2;
                    } else {
                        i = size2;
                        arrayList = arrayList4;
                    }
                    abfcVar = null;
                    ufg ufgVar22 = ubjVar.a;
                    i5 = ubjVar.d;
                    ufgVar = ufgVar22;
                }
                if (abfcVar != null) {
                    boolean z = this.l;
                    int i8 = abfcVar.b;
                    arrayList2 = arrayList3;
                    this.l = z | (((i8 & 1) == 0 && (i8 & 2) == 0) ? false : true);
                    boolean z2 = ufgVar instanceof ufd;
                    ufg ufdVar = ufgVar;
                    if (z2) {
                        ufd ufdVar2 = (ufd) ufgVar;
                        boolean z3 = ufdVar2.g;
                        ufdVar = ufdVar2;
                        if (!z3) {
                            ufdVar = new ufd(ufdVar2.h, ufdVar2.i, ufdVar2.d, ufdVar2.a, ufdVar2.b, ufdVar2.c, ufdVar2.f, ufdVar2.e, true);
                        }
                    }
                    ubl ublVarA = ubl.a(abfcVar, ufdVar, i5);
                    arrayListS.add(ublVarA);
                    boolean z4 = this.f;
                    int i9 = ublVarA.d;
                    this.f = (i9 != 1 ? !(i9 != 2 || (ublVarA.b.b & 2) == 0) : (ublVarA.b.b & 1) != 0) | z4;
                } else {
                    arrayList2 = arrayList3;
                    arrayListS.add(ubl.a);
                }
                i4++;
                size2 = i;
                arrayList4 = arrayList;
                arrayList3 = arrayList2;
            }
            this.n.add(arrayListS);
            i3++;
            arrayList3 = arrayList3;
            i2 = 0;
        }
    }
}
