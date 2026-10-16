package com.bumptech.glide;

import D9.j;
import E5.C0441b;
import android.content.Context;
import android.util.Log;
import androidx.datastore.preferences.protobuf.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import x.C4412e;

/* loaded from: classes.dex */
public final class g extends U4.a {

    /* renamed from: q, reason: collision with root package name */
    public final Context f24240q;

    /* renamed from: r, reason: collision with root package name */
    public final h f24241r;

    /* renamed from: s, reason: collision with root package name */
    public final Class f24242s;

    /* renamed from: t, reason: collision with root package name */
    public final c f24243t;

    /* renamed from: u, reason: collision with root package name */
    public a f24244u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24245v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f24246w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24247x;

    static {
    }

    public g(b bVar, h hVar, Class cls, Context context) {
        U4.c cVar;
        this.f24241r = hVar;
        this.f24242s = cls;
        this.f24240q = context;
        C4412e c4412e = hVar.f24249a.f24212c.f24223e;
        a aVar = (a) c4412e.get(cls);
        if (aVar == null) {
            Iterator it = ((i0) c4412e.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f24244u = aVar == null ? c.f24218i : aVar;
        this.f24243t = bVar.f24212c;
        Iterator it2 = hVar.f24258j.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            if (jVar != null) {
                if (this.f24246w == null) {
                    this.f24246w = new ArrayList();
                }
                this.f24246w.add(jVar);
            }
        }
        synchronized (hVar) {
            cVar = hVar.k;
        }
        a(cVar);
    }

    @Override // U4.a
    /* renamed from: b */
    public final U4.a clone() {
        g gVar = (g) super.clone();
        gVar.f24244u = gVar.f24244u.clone();
        return gVar;
    }

    @Override // U4.a
    public final Object clone() {
        g gVar = (g) super.clone();
        gVar.f24244u = gVar.f24244u.clone();
        return gVar;
    }

    @Override // U4.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final g a(U4.a aVar) {
        gc.b.j(aVar);
        return (g) super.a(aVar);
    }

    public final void r(V4.a aVar) {
        Y4.g gVar = Y4.h.f16691a;
        gc.b.j(aVar);
        if (!this.f24247x) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        a aVar2 = this.f24244u;
        d dVar = this.f12271c;
        int i5 = this.f12275g;
        int i10 = this.f12274f;
        Object obj2 = this.f24245v;
        ArrayList arrayList = this.f24246w;
        c cVar = this.f24243t;
        U4.d dVar2 = new U4.d(this.f24240q, cVar, obj, obj2, this.f24242s, this, i5, i10, dVar, aVar, arrayList, cVar.f24224f, aVar2.f24207a, gVar);
        U4.d dVar3 = aVar.f13017c;
        if (dVar2.f(dVar3) && (this.f12273e || !dVar3.e())) {
            gc.b.k(dVar3, "Argument must not be null");
            if (dVar3.g()) {
                return;
            }
            dVar3.a();
            return;
        }
        this.f24241r.c(aVar);
        aVar.f13017c = dVar2;
        h hVar = this.f24241r;
        synchronized (hVar) {
            hVar.f24254f.f10255a.add(aVar);
            C0441b c0441b = hVar.f24252d;
            ((Set) c0441b.f3291c).add(dVar2);
            if (c0441b.f3290b) {
                dVar2.c();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((ArrayList) c0441b.f3292d).add(dVar2);
            } else {
                dVar2.a();
            }
        }
    }
}
