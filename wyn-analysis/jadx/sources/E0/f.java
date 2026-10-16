package E0;

import A.W;
import B.F;
import Ef.H;
import Ef.I0;
import Va.C1038ka;
import c8.C1581e;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f2784a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2785b;

    /* renamed from: c, reason: collision with root package name */
    public final S3.c f2786c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2787d;

    /* renamed from: e, reason: collision with root package name */
    public final xa.d f2788e;

    /* renamed from: f, reason: collision with root package name */
    public final F f2789f;

    public f(a aVar, b bVar) {
        S3.c typefaceRequestCache = g.f2790a;
        C1038ka asyncTypefaceCache = g.f2791b;
        C3109i c3109i = C3109i.f38759a;
        AbstractC3340k.e(asyncTypefaceCache, "asyncTypefaceCache");
        i iVar = new i();
        H.c(i.f2793a.plus(c3109i).plus(new I0(null)));
        xa.d dVar = new xa.d(6);
        AbstractC3340k.e(typefaceRequestCache, "typefaceRequestCache");
        this.f2784a = aVar;
        this.f2785b = bVar;
        this.f2786c = typefaceRequestCache;
        this.f2787d = iVar;
        this.f2788e = dVar;
        this.f2789f = new F(this, 1);
    }

    public final q a(p pVar) {
        S3.c cVar = this.f2786c;
        W w2 = new W(6, this, pVar);
        cVar.getClass();
        synchronized (((C1581e) cVar.f10936b)) {
            q qVar = (q) ((D0.b) cVar.f10937c).b(pVar);
            if (qVar != null) {
                if (qVar.f2810b) {
                    return qVar;
                }
            }
            try {
                q qVar2 = (q) w2.invoke(new W(7, cVar, pVar));
                synchronized (((C1581e) cVar.f10936b)) {
                    if (((D0.b) cVar.f10937c).b(pVar) == null && qVar2.f2810b) {
                        ((D0.b) cVar.f10937c).d(pVar, qVar2);
                    }
                }
                return qVar2;
            } catch (Exception e7) {
                throw new IllegalStateException("Could not load font", e7);
            }
        }
    }

    public final q b(o oVar, l fontWeight, int i5, int i10) {
        AbstractC3340k.e(fontWeight, "fontWeight");
        b bVar = this.f2785b;
        bVar.getClass();
        AbstractC3340k.e(fontWeight, "fontWeight");
        int i11 = bVar.f2783a;
        l lVar = (i11 == 0 || i11 == Integer.MAX_VALUE) ? fontWeight : new l(android.support.v4.media.session.b.S(fontWeight.f2802a + i11, 1, 1000));
        this.f2784a.getClass();
        return a(new p(oVar, lVar, i5, i10, null));
    }
}
