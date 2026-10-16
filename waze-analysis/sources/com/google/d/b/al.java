package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al<T> implements aj<T> {

    /* renamed from: a, reason: collision with root package name */
    private volatile aj f7216a;

    /* renamed from: b, reason: collision with root package name */
    private Object f7217b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.v f7218c = new com.waze.car_lib.b.v((char[]) null);

    al(aj ajVar) {
        an.B(ajVar);
        this.f7216a = ajVar;
    }

    @Override // com.google.d.b.aj
    public final T get() {
        if (this.f7216a != null) {
            synchronized (this.f7218c) {
                if (this.f7216a != null) {
                    T t = (T) this.f7216a.get();
                    this.f7217b = t;
                    this.f7216a = null;
                    return t;
                }
            }
        }
        return (T) this.f7217b;
    }

    public final String toString() {
        Object obj = this.f7216a;
        if (obj == null) {
            obj = "<supplier that returned " + String.valueOf(this.f7217b) + ">";
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
