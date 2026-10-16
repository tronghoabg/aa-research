package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.a.af;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z extends com.bumptech.glide.e.a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3575a;

    /* renamed from: b, reason: collision with root package name */
    private final ac f3576b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f3577c;

    /* renamed from: d, reason: collision with root package name */
    private final m f3578d;

    /* renamed from: e, reason: collision with root package name */
    private ad f3579e;

    /* renamed from: f, reason: collision with root package name */
    private Object f3580f;

    /* renamed from: g, reason: collision with root package name */
    private List f3581g;

    /* renamed from: h, reason: collision with root package name */
    private z f3582h;

    /* renamed from: i, reason: collision with root package name */
    private z f3583i;

    /* renamed from: j, reason: collision with root package name */
    private Float f3584j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3585k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3586l;
    private boolean m;

    static {
    }

    protected z(c cVar, ac acVar, Class cls, Context context) {
        this.f3576b = acVar;
        this.f3577c = cls;
        this.f3575a = context;
        this.f3579e = acVar.f2742a.c().d(cls);
        this.f3578d = cVar.c();
        Iterator it = acVar.e().iterator();
        while (it.hasNext()) {
            a((com.bumptech.glide.e.h) it.next());
        }
        i(acVar.d());
    }

    private final z af(Object obj) {
        if (O()) {
            return clone().af(obj);
        }
        this.f3580f = obj;
        this.f3586l = true;
        ac();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.bumptech.glide.e.d ag(Object obj, com.bumptech.glide.e.a.g gVar, com.bumptech.glide.e.h hVar, com.bumptech.glide.e.f fVar, ad adVar, p pVar, int i2, int i3, com.bumptech.glide.e.a aVar, Executor executor) {
        com.bumptech.glide.e.f fVar2;
        com.bumptech.glide.e.f bVar;
        com.bumptech.glide.e.d dVarAh;
        p pVarQ;
        z zVar = this;
        if (zVar.f3583i != null) {
            bVar = new com.bumptech.glide.e.b(obj, fVar);
            fVar2 = bVar;
        } else {
            fVar2 = null;
            bVar = fVar;
        }
        z zVar2 = zVar.f3582h;
        if (zVar2 == null) {
            dVarAh = zVar.ah(obj, gVar, hVar, aVar, bVar, adVar, pVar, i2, i3, executor);
        } else {
            if (zVar.m) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            ad adVar2 = true == zVar2.f3585k ? adVar : zVar2.f3579e;
            if (zVar2.S()) {
                pVarQ = zVar2.q();
            } else {
                int i4 = y.f3574b[pVar.ordinal()];
                if (i4 == 1) {
                    pVarQ = p.f3557c;
                } else if (i4 == 2) {
                    pVarQ = p.f3556b;
                } else {
                    if (i4 != 3 && i4 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(zVar.q()))));
                    }
                    pVarQ = p.f3555a;
                }
            }
            p pVar2 = pVarQ;
            int iP = zVar.f3582h.p();
            int iO = zVar.f3582h.o();
            if (com.bumptech.glide.g.r.o(i2, i3) && !zVar.f3582h.Y()) {
                iP = aVar.p();
                iO = aVar.o();
            }
            com.bumptech.glide.e.l lVar = new com.bumptech.glide.e.l(obj, bVar);
            com.bumptech.glide.e.d dVarAh2 = zVar.ah(obj, gVar, hVar, aVar, lVar, adVar, pVar, i2, i3, executor);
            zVar.m = true;
            z zVar3 = zVar.f3582h;
            com.bumptech.glide.e.d dVarAg = zVar3.ag(obj, gVar, hVar, lVar, adVar2, pVar2, iP, iO, zVar3, executor);
            com.bumptech.glide.e.l lVar2 = lVar;
            zVar.m = false;
            lVar2.g(dVarAh2, dVarAg);
            zVar = zVar;
            dVarAh = lVar2;
        }
        com.bumptech.glide.e.d dVar = dVarAh;
        if (fVar2 == null) {
            return dVar;
        }
        int iP2 = zVar.f3583i.p();
        int iO2 = zVar.f3583i.o();
        if (com.bumptech.glide.g.r.o(i2, i3) && !zVar.f3583i.Y()) {
            iP2 = aVar.p();
            iO2 = aVar.o();
        }
        z zVar4 = zVar.f3583i;
        com.bumptech.glide.e.b bVar2 = fVar2;
        bVar2.g(dVar, zVar4.ag(obj, gVar, hVar, bVar2, zVar4.f3579e, zVar4.q(), iP2, iO2, zVar.f3583i, executor));
        return bVar2;
    }

    private final com.bumptech.glide.e.d ah(Object obj, com.bumptech.glide.e.a.g gVar, com.bumptech.glide.e.h hVar, com.bumptech.glide.e.a aVar, com.bumptech.glide.e.f fVar, ad adVar, p pVar, int i2, int i3, Executor executor) {
        m mVar = this.f3578d;
        Object obj2 = this.f3580f;
        List list = this.f3581g;
        af afVarE = mVar.e();
        adVar.b();
        return com.bumptech.glide.e.k.h(mVar, obj, obj2, this.f3577c, aVar, i2, i3, pVar, gVar, hVar, list, fVar, afVarE, executor);
    }

    private final void ai(com.bumptech.glide.e.a.g gVar, com.bumptech.glide.e.h hVar, com.bumptech.glide.e.a aVar, Executor executor) {
        com.bumptech.glide.g.p.f(gVar);
        if (!this.f3586l) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.e.d dVarAg = ag(new Object(), gVar, hVar, null, this.f3579e, aVar.q(), aVar.p(), aVar.o(), aVar, executor);
        com.bumptech.glide.e.d dVarBm = gVar.bm();
        if (!dVarAg.n(dVarBm) || (!aVar.R() && dVarBm.m())) {
            ac acVar = this.f3576b;
            acVar.f(gVar);
            gVar.f(dVarAg);
            acVar.m(gVar, dVarAg);
            return;
        }
        com.bumptech.glide.g.p.f(dVarBm);
        if (dVarBm.o()) {
            return;
        }
        dVarBm.b();
    }

    public final z a(com.bumptech.glide.e.h hVar) {
        if (O()) {
            return clone().a(hVar);
        }
        if (hVar != null) {
            if (this.f3581g == null) {
                this.f3581g = new ArrayList();
            }
            this.f3581g.add(hVar);
        }
        ac();
        return this;
    }

    @Override // com.bumptech.glide.e.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z i(com.bumptech.glide.e.a aVar) {
        com.bumptech.glide.g.p.f(aVar);
        return (z) super.i(aVar);
    }

    @Override // com.bumptech.glide.e.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final z j() {
        z zVar = (z) super.j();
        zVar.f3579e = zVar.f3579e.clone();
        List list = zVar.f3581g;
        if (list != null) {
            zVar.f3581g = new ArrayList(list);
        }
        z zVar2 = zVar.f3582h;
        if (zVar2 != null) {
            zVar.f3582h = zVar2.clone();
        }
        z zVar3 = zVar.f3583i;
        if (zVar3 != null) {
            zVar.f3583i = zVar3.clone();
        }
        return zVar;
    }

    public final z d(File file) {
        return af(file);
    }

    public final z e(Integer num) {
        z zVarAf = af(num);
        Context context = this.f3575a;
        return (z) ((z) zVarAf.G(context.getTheme())).F(com.bumptech.glide.f.a.b(context));
    }

    @Override // com.bumptech.glide.e.a
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (super.equals(zVar) && Objects.equals(this.f3577c, zVar.f3577c) && this.f3579e.equals(zVar.f3579e) && Objects.equals(this.f3580f, zVar.f3580f) && Objects.equals(this.f3581g, zVar.f3581g) && Objects.equals(this.f3582h, zVar.f3582h) && Objects.equals(this.f3583i, zVar.f3583i)) {
                Float f2 = zVar.f3584j;
                if (Objects.equals(null, null) && this.f3585k == zVar.f3585k && this.f3586l == zVar.f3586l) {
                    return true;
                }
            }
        }
        return false;
    }

    public final z f(Object obj) {
        return af(obj);
    }

    public final z g(String str) {
        return af(str);
    }

    public final z h(byte[] bArr) {
        z zVarAf = af(bArr);
        if (!zVarAf.P()) {
            zVarAf = zVarAf.i(com.bumptech.glide.e.i.c(com.bumptech.glide.load.a.y.f3179b));
        }
        return !zVarAf.U() ? zVarAf.i(com.bumptech.glide.e.i.d()) : zVarAf;
    }

    @Override // com.bumptech.glide.e.a
    public final int hashCode() {
        return com.bumptech.glide.g.r.d(this.f3586l ? 1 : 0, com.bumptech.glide.g.r.d(this.f3585k ? 1 : 0, com.bumptech.glide.g.r.e(null, com.bumptech.glide.g.r.e(this.f3583i, com.bumptech.glide.g.r.e(this.f3582h, com.bumptech.glide.g.r.e(this.f3581g, com.bumptech.glide.g.r.e(this.f3580f, com.bumptech.glide.g.r.e(this.f3579e, com.bumptech.glide.g.r.e(this.f3577c, super.hashCode())))))))));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bumptech.glide.e.a.j k(android.widget.ImageView r4) {
        /*
            r3 = this;
            com.bumptech.glide.g.r.h()
            com.bumptech.glide.g.p.f(r4)
            boolean r0 = r3.X()
            if (r0 != 0) goto L4c
            boolean r0 = r3.V()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.y.f3573a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            com.bumptech.glide.z r0 = r3.clone()
            com.bumptech.glide.e.a r0 = r0.y()
            goto L4d
        L31:
            com.bumptech.glide.z r0 = r3.clone()
            com.bumptech.glide.e.a r0 = r0.z()
            goto L4d
        L3a:
            com.bumptech.glide.z r0 = r3.clone()
            com.bumptech.glide.e.a r0 = r0.y()
            goto L4d
        L43:
            com.bumptech.glide.z r0 = r3.clone()
            com.bumptech.glide.e.a r0 = r0.x()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            java.lang.Class r1 = r3.f3577c
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            com.bumptech.glide.e.a.b r1 = new com.bumptech.glide.e.a.b
            r1.<init>(r4)
            goto L6a
        L5d:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 == 0) goto L75
            com.bumptech.glide.e.a.d r1 = new com.bumptech.glide.e.a.d
            r1.<init>(r4)
        L6a:
            r4 = 0
            java.util.concurrent.Executor r2 = com.bumptech.glide.g.h.b()
            r3.ai(r1, r4, r0, r2)
            com.bumptech.glide.e.a.j r1 = (com.bumptech.glide.e.a.j) r1
            return r1
        L75:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r1.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.z.k(android.widget.ImageView):com.bumptech.glide.e.a.j");
    }

    public final com.bumptech.glide.e.g l(int i2, int i3) {
        com.bumptech.glide.e.g gVar = new com.bumptech.glide.e.g(i2, i3);
        ai(gVar, gVar, this, com.bumptech.glide.g.h.a());
        return gVar;
    }

    public final void m(com.bumptech.glide.e.a.g gVar) {
        ai(gVar, null, this, com.bumptech.glide.g.h.b());
    }
}
