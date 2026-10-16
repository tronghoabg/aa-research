package com.bumptech.glide;

import A.d0;
import B4.j;
import C4.i;
import E4.l;
import Hf.Z;
import Hf.k0;
import Hf.x0;
import I4.p;
import I4.q;
import K3.r;
import N.C0719d0;
import S3.s;
import ac.C1346a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.F;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.I;
import j$.util.DesugarCollections;
import j1.C3075c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import m9.S;
import org.json.JSONObject;
import t5.C4113h;
import t5.C4117l;
import wa.C4398a;
import y3.C4552j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Object f24230a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24231b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24232c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24233d;

    /* renamed from: e, reason: collision with root package name */
    public Object f24234e;

    /* renamed from: f, reason: collision with root package name */
    public Object f24235f;

    /* renamed from: g, reason: collision with root package name */
    public Object f24236g;

    /* renamed from: h, reason: collision with root package name */
    public Object f24237h = new s((byte) 0, 23);

    /* renamed from: i, reason: collision with root package name */
    public Object f24238i = new T4.b();

    /* renamed from: j, reason: collision with root package name */
    public Object f24239j;

    public f() {
        Dd.c cVar = new Dd.c(new C3075c(20), new S(29), new C4398a(29), 17);
        this.f24239j = cVar;
        this.f24230a = new I4.s(cVar);
        this.f24231b = new C4552j(23);
        S3.c cVar2 = new S3.c(23);
        this.f24232c = cVar2;
        this.f24233d = new C0719d0(2);
        this.f24234e = new i();
        this.f24235f = new C0719d0(1);
        this.f24236g = new d0(1);
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (cVar2) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) cVar2.f10936b);
                ((ArrayList) cVar2.f10936b).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ArrayList) cVar2.f10936b).add((String) it.next());
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) cVar2.f10936b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f24235f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public void b(Class cls, B4.b bVar) {
        C4552j c4552j = (C4552j) this.f24231b;
        synchronized (c4552j) {
            ((ArrayList) c4552j.f48001b).add(new T4.a(cls, bVar));
        }
    }

    public void c(Class cls, j jVar) {
        C0719d0 c0719d0 = (C0719d0) this.f24233d;
        synchronized (c0719d0) {
            c0719d0.f7761a.add(new T4.d(cls, jVar));
        }
    }

    public void d(Class cls, Class cls2, q qVar) {
        I4.s sVar = (I4.s) this.f24230a;
        synchronized (sVar) {
            sVar.f5357a.a(cls, cls2, qVar);
            sVar.f5358b.f40276a.clear();
        }
    }

    public void e(String str, Class cls, Class cls2, B4.i iVar) {
        S3.c cVar = (S3.c) this.f24232c;
        synchronized (cVar) {
            cVar.m(str).add(new T4.c(cls, cls2, iVar));
        }
    }

    public C4113h f() {
        String strF = ((String) this.f24230a) == null ? " transportName" : "";
        if (((C4117l) this.f24232c) == null) {
            strF = strF.concat(" encodedPayload");
        }
        if (((Long) this.f24233d) == null) {
            strF = N0.a.f(strF, " eventMillis");
        }
        if (((Long) this.f24234e) == null) {
            strF = N0.a.f(strF, " uptimeMillis");
        }
        if (((HashMap) this.f24235f) == null) {
            strF = N0.a.f(strF, " autoMetadata");
        }
        if (strF.isEmpty()) {
            return new C4113h((String) this.f24230a, (Integer) this.f24231b, (C4117l) this.f24232c, ((Long) this.f24233d).longValue(), ((Long) this.f24234e).longValue(), (HashMap) this.f24235f, (Integer) this.f24236g, (String) this.f24237h, (byte[]) this.f24238i, (byte[]) this.f24239j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strF));
    }

    public void g() {
        int i5 = 0;
        this.f24236g = G.f30350b;
        C1346a c1346a = (C1346a) this.f24234e;
        c1346a.getClass();
        c1346a.J("mraidbridge.setSupports(false,false,false,false,true)");
        G state = (G) this.f24236g;
        AbstractC3340k.e(state, "state");
        c1346a.J("mraidbridge.setState(" + JSONObject.quote(state.f30353a) + ')');
        F f10 = F.f30346b;
        c1346a.J("mraidbridge.setPlacementType(" + JSONObject.quote("interstitial") + ')');
        r rVar = (r) this.f24237h;
        c1346a.H(((I) ((x0) rVar.f6519i).getValue()).f30356a);
        Z z2 = new Z((x0) rVar.f6516f, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b(this, null), i5);
        Kd.a aVar = (Kd.a) this.f24233d;
        k0.u(z2, aVar);
        k0.u(new Z((x0) rVar.f6519i, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c(this, null), i5), aVar);
    }

    public ArrayList h(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((S3.c) this.f24232c).n(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = ((C0719d0) this.f24235f).d(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                S3.c cVar = (S3.c) this.f24232c;
                synchronized (cVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) cVar.f10936b).iterator();
                    while (it3.hasNext()) {
                        List<T4.c> list = (List) ((HashMap) cVar.f10937c).get((String) it3.next());
                        if (list != null) {
                            for (T4.c cVar2 : list) {
                                if (cVar2.f11462a.isAssignableFrom(cls) && cls4.isAssignableFrom(cVar2.f11463b)) {
                                    arrayList.add(cVar2.f11464c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new l(cls, cls4, cls5, arrayList, ((C0719d0) this.f24235f).c(cls4, cls5), (Dd.c) this.f24239j));
            }
        }
        return arrayList2;
    }

    public ArrayList i() {
        ArrayList arrayList;
        d0 d0Var = (d0) this.f24236g;
        synchronized (d0Var) {
            arrayList = d0Var.f140a;
        }
        if (arrayList.isEmpty()) {
            throw new e("Failed to find image header parser.");
        }
        return arrayList;
    }

    public List j(Object obj) {
        List listUnmodifiableList;
        I4.s sVar = (I4.s) this.f24230a;
        sVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (sVar) {
            I4.r rVar = (I4.r) sVar.f5358b.f40276a.get(cls);
            listUnmodifiableList = rVar == null ? null : rVar.f5356a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = DesugarCollections.unmodifiableList(sVar.f5357a.c(cls));
                if (((I4.r) sVar.f5358b.f40276a.put(cls, new I4.r(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new e("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z2 = true;
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = (p) listUnmodifiableList.get(i5);
            if (pVar.a(obj)) {
                if (z2) {
                    arrayList = new ArrayList(size - i5);
                    z2 = false;
                }
                arrayList.add(pVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new e("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public void k(B4.c cVar) {
        d0 d0Var = (d0) this.f24236g;
        synchronized (d0Var) {
            d0Var.f140a.add(cVar);
        }
    }

    public void l(C4.f fVar) {
        i iVar = (i) this.f24234e;
        synchronized (iVar) {
            ((HashMap) iVar.f1793b).put(fVar.b(), fVar);
        }
    }

    public void m(Class cls, Class cls2, Q4.a aVar) {
        C0719d0 c0719d0 = (C0719d0) this.f24235f;
        synchronized (c0719d0) {
            c0719d0.f7761a.add(new Q4.b(cls, cls2, aVar));
        }
    }
}
