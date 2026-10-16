package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.a.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements com.google.android.datatransport.runtime.b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4326a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4327b;

    public /* synthetic */ h(Object obj, int i2) {
        this.f4327b = i2;
        this.f4326a = obj;
    }

    @Override // com.google.android.datatransport.runtime.b.b
    public final Object a() {
        int i2 = this.f4327b;
        if (i2 == 0) {
            return Integer.valueOf(((r) this.f4326a).a());
        }
        if (i2 == 1) {
            return ((r) this.f4326a).e();
        }
        Object obj = this.f4326a;
        if (i2 != 2) {
            m.c((m) obj);
            return null;
        }
        ((r) ((com.waze.map.g.g) obj).f29056d).r();
        return null;
    }
}
