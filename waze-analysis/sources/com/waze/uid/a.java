package com.waze.uid;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44031a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44032b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f44032b = i2;
        this.f44031a = obj;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f44032b;
        if (i2 == 0) {
            return d.e((d) this.f44031a);
        }
        if (i2 == 1) {
            return d.d((d) this.f44031a);
        }
        if (i2 == 2) {
            return Boolean.valueOf(o.c((o) this.f44031a));
        }
        Object obj = this.f44031a;
        return i2 != 3 ? Boolean.valueOf(o.g((o) obj)) : Boolean.valueOf(o.b((o) obj));
    }
}
