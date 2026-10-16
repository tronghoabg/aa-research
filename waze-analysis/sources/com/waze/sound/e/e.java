package com.waze.sound.e;

import androidx.compose.runtime.Composer;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39846a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f39847b;

    public /* synthetic */ e(int i2, int i3) {
        this.f39847b = i3;
        this.f39846a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f39847b;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            return h.f(this.f39846a, (Composer) obj);
        }
        if (i2 != 1) {
            ((Integer) obj2).intValue();
            return h.g(this.f39846a, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        return h.e(this.f39846a, (Composer) obj);
    }
}
