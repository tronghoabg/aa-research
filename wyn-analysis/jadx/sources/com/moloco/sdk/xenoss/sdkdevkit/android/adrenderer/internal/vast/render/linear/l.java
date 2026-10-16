package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import A7.R0;
import E5.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.M0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f32057a;

    /* renamed from: b, reason: collision with root package name */
    public Object f32058b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32059c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32060d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f32061e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f32062f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f32063g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f32064h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f32065i;

    /* renamed from: j, reason: collision with root package name */
    public final s f32066j;
    public final L0 k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f32067l;

    /* renamed from: m, reason: collision with root package name */
    public int f32068m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f32069n;

    /* renamed from: o, reason: collision with root package name */
    public int f32070o;

    public l(com.moloco.sdk.internal.services.events.c customUserEventBuilderService, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15) {
        s sVar = new s();
        L0 vastTracker = M0.a();
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(vastTracker, "vastTracker");
        this.f32057a = customUserEventBuilderService;
        this.f32058b = list;
        this.f32059c = list8;
        this.f32060d = list9;
        this.f32061e = list10;
        this.f32062f = list11;
        this.f32063g = list12;
        this.f32064h = list13;
        this.f32065i = list14;
        this.f32066j = sVar;
        this.k = vastTracker;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(p.a0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new a((String) it.next(), 0L));
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList(p.a0(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new a((String) it2.next(), 0L));
        }
        arrayList.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList(p.a0(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(new m((String) it3.next(), 25));
        }
        arrayList2.addAll(arrayList5);
        ArrayList arrayList6 = new ArrayList(p.a0(list5, 10));
        Iterator it4 = list5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(new m((String) it4.next(), 50));
        }
        arrayList2.addAll(arrayList6);
        ArrayList arrayList7 = new ArrayList(p.a0(list6, 10));
        Iterator it5 = list6.iterator();
        while (it5.hasNext()) {
            arrayList7.add(new m((String) it5.next(), 75));
        }
        arrayList2.addAll(arrayList7);
        ArrayList arrayList8 = new ArrayList(p.a0(list7, 10));
        Iterator it6 = list7.iterator();
        while (it6.hasNext()) {
            arrayList8.add(new m((String) it6.next(), 100));
        }
        arrayList2.addAll(arrayList8);
        Iterator it7 = list15.iterator();
        while (it7.hasNext()) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) it7.next();
            y yVar = jVar.f31996b;
            boolean z2 = yVar instanceof x;
            String str = jVar.f31995a;
            if (z2) {
                arrayList.add(new a(str, ((x) yVar).f31527a));
            } else {
                if (!(yVar instanceof w)) {
                    throw new Q((byte) 0, 9);
                }
                arrayList2.add(new m(str, ((w) yVar).f31526a));
            }
        }
        if (arrayList.size() > 1) {
            ff.s.d0(arrayList, new R0(12));
        }
        this.f32067l = arrayList;
        if (arrayList2.size() > 1) {
            ff.s.d0(arrayList2, new R0(13));
        }
        this.f32069n = arrayList2;
    }
}
