package com.airbnb.lottie.b;

import android.graphics.ColorFilter;
import com.waze.aq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final List f1957a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1958b;

    /* renamed from: c, reason: collision with root package name */
    private final List f1959c;

    /* renamed from: d, reason: collision with root package name */
    private final List f1960d;

    /* renamed from: e, reason: collision with root package name */
    private final List f1961e;

    /* renamed from: f, reason: collision with root package name */
    private final List f1962f;

    /* renamed from: g, reason: collision with root package name */
    private final List f1963g;

    /* renamed from: h, reason: collision with root package name */
    private final List f1964h;

    /* renamed from: i, reason: collision with root package name */
    private final List f1965i;

    /* renamed from: j, reason: collision with root package name */
    private final List f1966j;

    public ae(List list) {
        h.g.b.x.f(list, "properties");
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((aq) it.next()).d();
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((aq) it2.next()).d();
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            ((aq) it3.next()).d();
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            ((aq) it4.next()).d();
        }
        ArrayList arrayList8 = arrayList7;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj : list2) {
            if (((aq) obj).d() instanceof ColorFilter) {
                arrayList9.add(obj);
            }
        }
        ArrayList arrayList10 = arrayList9;
        ArrayList arrayList11 = new ArrayList();
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            ((aq) it5.next()).d();
        }
        ArrayList arrayList12 = arrayList11;
        ArrayList arrayList13 = new ArrayList();
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            ((aq) it6.next()).d();
        }
        ArrayList arrayList14 = arrayList13;
        ArrayList arrayList15 = new ArrayList();
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            ((aq) it7.next()).d();
        }
        ArrayList arrayList16 = arrayList15;
        ArrayList arrayList17 = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            ((aq) it8.next()).d();
        }
        ArrayList arrayList18 = arrayList17;
        ArrayList arrayList19 = new ArrayList();
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            ((aq) it9.next()).d();
        }
        ArrayList arrayList20 = arrayList19;
        h.g.b.x.f(arrayList2, "intProperties");
        h.g.b.x.f(arrayList4, "pointFProperties");
        h.g.b.x.f(arrayList6, "floatProperties");
        h.g.b.x.f(arrayList8, "scaleProperties");
        h.g.b.x.f(arrayList10, "colorFilterProperties");
        h.g.b.x.f(arrayList12, "intArrayProperties");
        h.g.b.x.f(arrayList14, "typefaceProperties");
        h.g.b.x.f(arrayList16, "bitmapProperties");
        h.g.b.x.f(arrayList18, "charSequenceProperties");
        h.g.b.x.f(arrayList20, "pathProperties");
        this.f1957a = arrayList2;
        this.f1958b = arrayList4;
        this.f1959c = arrayList6;
        this.f1960d = arrayList8;
        this.f1961e = arrayList10;
        this.f1962f = arrayList12;
        this.f1963g = arrayList14;
        this.f1964h = arrayList16;
        this.f1965i = arrayList18;
        this.f1966j = arrayList20;
    }

    public final void a(com.airbnb.lottie.s sVar) {
        h.g.b.x.f(sVar, "drawable");
        for (aq aqVar : this.f1957a) {
            sVar.p(aqVar.c(), aqVar.d(), new af(aqVar.e()));
        }
        for (aq aqVar2 : this.f1958b) {
            sVar.p(aqVar2.c(), aqVar2.d(), new af(aqVar2.e()));
        }
        for (aq aqVar3 : this.f1959c) {
            sVar.p(aqVar3.c(), aqVar3.d(), new af(aqVar3.e()));
        }
        for (aq aqVar4 : this.f1960d) {
            sVar.p(aqVar4.c(), aqVar4.d(), new af(aqVar4.e()));
        }
        for (aq aqVar5 : this.f1961e) {
            sVar.p(aqVar5.c(), aqVar5.d(), new af(aqVar5.e()));
        }
        for (aq aqVar6 : this.f1962f) {
            sVar.p(aqVar6.c(), aqVar6.d(), new af(aqVar6.e()));
        }
        for (aq aqVar7 : this.f1963g) {
            sVar.p(aqVar7.c(), aqVar7.d(), new af(aqVar7.e()));
        }
        for (aq aqVar8 : this.f1964h) {
            sVar.p(aqVar8.c(), aqVar8.d(), new af(aqVar8.e()));
        }
        for (aq aqVar9 : this.f1965i) {
            sVar.p(aqVar9.c(), aqVar9.d(), new af(aqVar9.e()));
        }
        for (aq aqVar10 : this.f1966j) {
            sVar.p(aqVar10.c(), aqVar10.d(), new af(aqVar10.e()));
        }
    }

    public final void b(com.airbnb.lottie.s sVar) {
        h.g.b.x.f(sVar, "drawable");
        for (aq aqVar : this.f1957a) {
            sVar.p(aqVar.c(), aqVar.d(), null);
        }
        for (aq aqVar2 : this.f1958b) {
            sVar.p(aqVar2.c(), aqVar2.d(), null);
        }
        for (aq aqVar3 : this.f1959c) {
            sVar.p(aqVar3.c(), aqVar3.d(), null);
        }
        for (aq aqVar4 : this.f1960d) {
            sVar.p(aqVar4.c(), aqVar4.d(), null);
        }
        for (aq aqVar5 : this.f1961e) {
            sVar.p(aqVar5.c(), aqVar5.d(), null);
        }
        for (aq aqVar6 : this.f1962f) {
            sVar.p(aqVar6.c(), aqVar6.d(), null);
        }
        for (aq aqVar7 : this.f1963g) {
            sVar.p(aqVar7.c(), aqVar7.d(), null);
        }
        for (aq aqVar8 : this.f1964h) {
            sVar.p(aqVar8.c(), aqVar8.d(), null);
        }
        for (aq aqVar9 : this.f1965i) {
            sVar.p(aqVar9.c(), aqVar9.d(), null);
        }
        for (aq aqVar10 : this.f1966j) {
            sVar.p(aqVar10.c(), aqVar10.d(), null);
        }
    }
}
