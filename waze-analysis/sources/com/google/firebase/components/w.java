package com.google.firebase.components;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w<T> implements com.google.firebase.g.c<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8976a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f8977b = f8976a;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.google.firebase.g.c f8978c;

    public w(com.google.firebase.g.c cVar) {
        this.f8978c = cVar;
    }

    @Override // com.google.firebase.g.c
    public final Object a() {
        Object objA;
        Object obj = this.f8977b;
        Object obj2 = f8976a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objA = this.f8977b;
            if (objA == obj2) {
                objA = this.f8978c.a();
                this.f8977b = objA;
                this.f8978c = null;
            }
        }
        return objA;
    }
}
