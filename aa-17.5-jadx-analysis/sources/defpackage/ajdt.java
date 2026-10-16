package defpackage;

/* loaded from: classes3.dex */
public final class ajdt {
    public final Object a;
    public final afeh b;
    public Object c;
    public int d = -1;
    private final afeh e;
    private final Object f;

    public ajdt(Object obj, afeh afehVar, afeh afehVar2, Object obj2) {
        this.a = obj;
        this.b = afehVar;
        this.e = afehVar2;
        this.f = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afeg, java.lang.Object] */
    public final Object a(Object obj, afck afckVar) {
        return this.f.invoke(obj, afckVar);
    }

    public final Object b(Object obj) {
        return this.e.invoke(this.a, null, obj);
    }

    public final void c() {
        Object obj = this.c;
        if (obj instanceof ajbv) {
            ((ajbv) obj).k(this.d);
            return;
        }
        aiuo aiuoVar = obj instanceof aiuo ? (aiuo) obj : null;
        if (aiuoVar != null) {
            aiuoVar.hy();
        }
    }
}
