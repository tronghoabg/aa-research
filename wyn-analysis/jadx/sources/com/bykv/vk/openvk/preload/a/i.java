package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* loaded from: classes.dex */
final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    protected e f24280a;

    /* renamed from: b, reason: collision with root package name */
    private int f24281b;

    /* renamed from: c, reason: collision with root package name */
    private List<h> f24282c;

    /* renamed from: d, reason: collision with root package name */
    private d f24283d;

    public static final class a extends Exception {
        public a(Throwable th) {
            super(th);
        }
    }

    public i(List<h> list, int i5, e eVar, d dVar) {
        this.f24282c = list;
        this.f24281b = i5;
        this.f24280a = eVar;
        this.f24283d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f24283d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f24262a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Object obj) throws Exception {
        d dVar = this.f24283d;
        if (dVar != null) {
            dVar.f24264c = obj;
            dVar.e();
        }
        if (this.f24281b >= this.f24282c.size()) {
            return obj;
        }
        h hVar = this.f24282c.get(this.f24281b);
        Class<? extends d> cls = hVar.f24274a;
        d dVar2 = (d) this.f24280a.a(cls);
        if (dVar2 == null) {
            throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
        }
        com.bykv.vk.openvk.preload.a.b.a aVarA = hVar.a();
        i iVar = new i(this.f24282c, this.f24281b + 1, this.f24280a, dVar2);
        dVar2.a(iVar, this.f24283d, obj, aVarA, hVar.b());
        dVar2.c();
        try {
            Object objA = dVar2.a(iVar, obj);
            dVar2.d();
            return objA;
        } catch (a e7) {
            dVar2.c(e7.getCause());
            throw e7;
        } catch (Throwable th) {
            dVar2.b(th);
            throw new a(th);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object b(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f24264c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(Class cls) {
        d dVarC = c(cls);
        if (dVarC != null) {
            return dVarC.f24263b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}
