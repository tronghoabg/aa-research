package hb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: hb.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2810m extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final C2803f f36341c = new C2803f(2);

    /* renamed from: a, reason: collision with root package name */
    public final r f36342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36343b;

    public C2810m(r rVar, int i5) {
        this.f36343b = i5;
        this.f36342a = rVar;
    }

    public final Collection a() {
        switch (this.f36343b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        switch (this.f36343b) {
            case 0:
                Collection collectionA = a();
                wVar.a();
                while (wVar.o()) {
                    ((ArrayList) collectionA).add(this.f36342a.fromJson(wVar));
                }
                wVar.d();
                return collectionA;
            default:
                Collection collectionA2 = a();
                wVar.a();
                while (wVar.o()) {
                    collectionA2.add(this.f36342a.fromJson(wVar));
                }
                wVar.d();
                return collectionA2;
        }
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        switch (this.f36343b) {
            case 0:
                abstractC2797C.a();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    this.f36342a.toJson(abstractC2797C, it.next());
                }
                abstractC2797C.h();
                break;
            default:
                abstractC2797C.a();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    this.f36342a.toJson(abstractC2797C, it2.next());
                }
                abstractC2797C.h();
                break;
        }
    }

    public final String toString() {
        return this.f36342a + ".collection()";
    }
}
