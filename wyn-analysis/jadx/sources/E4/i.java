package E4;

import androidx.datastore.preferences.protobuf.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2879a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2880b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.c f2881c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2882d;

    /* renamed from: e, reason: collision with root package name */
    public int f2883e;

    /* renamed from: f, reason: collision with root package name */
    public int f2884f;

    /* renamed from: g, reason: collision with root package name */
    public Class f2885g;

    /* renamed from: h, reason: collision with root package name */
    public d7.j f2886h;

    /* renamed from: i, reason: collision with root package name */
    public B4.g f2887i;

    /* renamed from: j, reason: collision with root package name */
    public Y4.d f2888j;
    public Class k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2889l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2890m;

    /* renamed from: n, reason: collision with root package name */
    public B4.d f2891n;

    /* renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.d f2892o;

    /* renamed from: p, reason: collision with root package name */
    public m f2893p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2894q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2895r;

    public final ArrayList a() {
        boolean z2 = this.f2890m;
        ArrayList arrayList = this.f2880b;
        if (!z2) {
            this.f2890m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i5 = 0; i5 < size; i5++) {
                I4.o oVar = (I4.o) arrayListB.get(i5);
                if (!arrayList.contains(oVar.f5353a)) {
                    arrayList.add(oVar.f5353a);
                }
                int i10 = 0;
                while (true) {
                    List list = oVar.f5354b;
                    if (i10 < list.size()) {
                        if (!arrayList.contains(list.get(i10))) {
                            arrayList.add(list.get(i10));
                        }
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z2 = this.f2889l;
        ArrayList arrayList = this.f2879a;
        if (!z2) {
            this.f2889l = true;
            arrayList.clear();
            List listJ = this.f2881c.f24220b.j(this.f2882d);
            int size = listJ.size();
            for (int i5 = 0; i5 < size; i5++) {
                I4.o oVarB = ((I4.p) listJ.get(i5)).b(this.f2882d, this.f2883e, this.f2884f, this.f2887i);
                if (oVarB != null) {
                    arrayList.add(oVarB);
                }
            }
        }
        return arrayList;
    }

    public final z c(Class cls) {
        z zVar;
        Class cls2;
        com.bumptech.glide.f fVar = this.f2881c.f24220b;
        Class cls3 = this.f2885g;
        Class cls4 = this.k;
        T4.b bVar = (T4.b) fVar.f24238i;
        Y4.k kVar = (Y4.k) bVar.f11461b.getAndSet(null);
        if (kVar == null) {
            kVar = new Y4.k();
        }
        kVar.f16696a = cls;
        kVar.f16697b = cls3;
        kVar.f16698c = cls4;
        synchronized (bVar.f11460a) {
            zVar = (z) bVar.f11460a.get(kVar);
        }
        bVar.f11461b.set(kVar);
        ((T4.b) fVar.f24238i).getClass();
        if (T4.b.f11459c.equals(zVar)) {
            return null;
        }
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = null;
        ArrayList arrayListH = fVar.h(cls, cls3, cls4);
        if (arrayListH.isEmpty()) {
            cls2 = cls;
        } else {
            cls2 = cls;
            zVar2 = new z(cls2, cls3, cls4, arrayListH, (Dd.c) fVar.f24239j);
        }
        z zVar3 = zVar2;
        ((T4.b) fVar.f24238i).a(cls2, cls3, cls4, zVar3);
        return zVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r1 = r3.f11458b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B4.b d(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.c r0 = r5.f2881c
            com.bumptech.glide.f r0 = r0.f24220b
            java.lang.Object r0 = r0.f24231b
            y3.j r0 = (y3.C4552j) r0
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.lang.Object r2 = r0.f48001b     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2d
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2d
            T4.a r3 = (T4.a) r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r4 = r3.f11457a     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L15
            B4.b r1 = r3.f11458b     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            goto L31
        L2d:
            r6 = move-exception
            goto L44
        L2f:
            monitor-exit(r0)
            r1 = 0
        L31:
            if (r1 == 0) goto L34
            return r1
        L34:
            com.bumptech.glide.e r0 = new com.bumptech.glide.e
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = "Failed to find source encoder for data class: "
            java.lang.String r6 = Va.M6.n(r6, r1)
            r0.<init>(r6)
            throw r0
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.i.d(java.lang.Object):B4.b");
    }

    public final B4.k e(Class cls) {
        B4.k kVar = (B4.k) this.f2888j.get(cls);
        if (kVar == null) {
            Iterator it = ((i0) this.f2888j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    kVar = (B4.k) entry.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f2888j.isEmpty() || !this.f2894q) {
            return K4.a.f6538b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
