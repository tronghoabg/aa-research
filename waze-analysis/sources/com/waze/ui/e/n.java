package com.waze.ui.e;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements h.g.a.q {

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42234d;

    /* renamed from: c, reason: collision with root package name */
    public static final n f42233c = new n(2);

    /* renamed from: b, reason: collision with root package name */
    public static final n f42232b = new n(1);

    /* renamed from: a, reason: collision with root package name */
    public static final n f42231a = new n(0);

    public n(int i2) {
        this.f42234d = i2;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = this.f42234d;
        if (i2 == 0) {
            return w.k((Composer) obj2, ((Number) obj3).intValue());
        }
        if (i2 != 1) {
            return w.k((Composer) obj2, ((Number) obj3).intValue());
        }
        return w.k((Composer) obj2, ((Number) obj3).intValue());
    }
}
