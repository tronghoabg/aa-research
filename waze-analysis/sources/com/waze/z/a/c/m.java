package com.waze.z.a.c;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class m implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45870b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f45871c;

    public /* synthetic */ m(Object obj, int i2, int i3) {
        this.f45871c = i3;
        this.f45870b = obj;
        this.f45869a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f45871c != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f45869a;
            return q.h((e) this.f45870b, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f45869a;
        return q.i((h) this.f45870b, i3, (Composer) obj);
    }
}
