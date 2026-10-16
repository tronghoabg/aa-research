package hb;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: hb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2798a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2801d f36302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f36303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2801d f36304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f36305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Type f36306e;

    public C2798a(AbstractC2801d abstractC2801d, r rVar, K k, AbstractC2801d abstractC2801d2, Set set, Type type) {
        this.f36302a = abstractC2801d;
        this.f36303b = rVar;
        this.f36304c = abstractC2801d2;
        this.f36305d = set;
        this.f36306e = type;
    }

    @Override // hb.r
    public final Object fromJson(w wVar) throws IOException {
        AbstractC2801d abstractC2801d = this.f36304c;
        if (abstractC2801d == null) {
            return this.f36303b.fromJson(wVar);
        }
        if (!abstractC2801d.f36319g && wVar.P() == v.f36356i) {
            wVar.D();
            return null;
        }
        try {
            return abstractC2801d.b(wVar);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new E5.Q(cause + " at " + wVar.i(), cause, 11);
        }
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) throws IOException {
        AbstractC2801d abstractC2801d = this.f36302a;
        if (abstractC2801d == null) {
            this.f36303b.toJson(abstractC2797C, obj);
            return;
        }
        if (!abstractC2801d.f36319g && obj == null) {
            abstractC2797C.y();
            return;
        }
        try {
            abstractC2801d.d(abstractC2797C, obj);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new E5.Q(cause + " at " + abstractC2797C.o(), cause, 11);
        }
    }

    public final String toString() {
        return "JsonAdapter" + this.f36305d + "(" + this.f36306e + ")";
    }
}
