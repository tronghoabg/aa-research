package hb;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* renamed from: hb.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2809l extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final C2803f f36337d = new C2803f(1);

    /* renamed from: a, reason: collision with root package name */
    public final P f36338a;

    /* renamed from: b, reason: collision with root package name */
    public final C2808k[] f36339b;

    /* renamed from: c, reason: collision with root package name */
    public final u f36340c;

    public C2809l(P p10, TreeMap treeMap) {
        this.f36338a = p10;
        this.f36339b = (C2808k[]) treeMap.values().toArray(new C2808k[treeMap.size()]);
        this.f36340c = u.a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // hb.r
    public final Object fromJson(w wVar) throws IllegalAccessException, IllegalArgumentException {
        try {
            Object objE = this.f36338a.e();
            try {
                wVar.b();
                while (wVar.o()) {
                    int iW = wVar.W(this.f36340c);
                    if (iW == -1) {
                        wVar.Y();
                        wVar.Z();
                    } else {
                        C2808k c2808k = this.f36339b[iW];
                        c2808k.f36335b.set(objE, c2808k.f36336c.fromJson(wVar));
                    }
                }
                wVar.h();
                return objE;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            ib.f.i(e10);
            throw null;
        }
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) throws IllegalAccessException, IllegalArgumentException {
        try {
            abstractC2797C.b();
            for (C2808k c2808k : this.f36339b) {
                abstractC2797C.w(c2808k.f36334a);
                c2808k.f36336c.toJson(abstractC2797C, c2808k.f36335b.get(obj));
            }
            abstractC2797C.i();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f36338a + ")";
    }
}
