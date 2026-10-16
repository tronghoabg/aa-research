package com.waze.ui.j;

import androidx.compose.runtime.Composer;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f42408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42410c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42411d;

    public /* synthetic */ e(Object obj, boolean z, int i2, int i3) {
        this.f42411d = i3;
        this.f42410c = obj;
        this.f42408a = z;
        this.f42409b = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.foundation.layout.RowScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.foundation.layout.BoxScope, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42411d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f42409b;
            boolean z = this.f42408a;
            return h.h(this.f42410c, z, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f42409b;
        boolean z2 = this.f42408a;
        return h.e(this.f42410c, z2, i3, (Composer) obj);
    }
}
