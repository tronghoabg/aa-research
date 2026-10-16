package com.waze.parking;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class m implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32979c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f32980d;

    public /* synthetic */ m(Object obj, Object obj2, int i2, int i3) {
        this.f32980d = i3;
        this.f32978b = obj;
        this.f32979c = obj2;
        this.f32977a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f32980d == 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f32977a;
            ?? r0 = this.f32979c;
            return q.c((String) this.f32978b, r0, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f32977a;
        Object obj3 = this.f32979c;
        return q.h((r) this.f32978b, (com.waze.sound.e.j) obj3, i3, (Composer) obj);
    }
}
