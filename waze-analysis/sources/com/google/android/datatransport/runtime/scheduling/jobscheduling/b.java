package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.datatransport.runtime.c.a f4308a;

    /* renamed from: b, reason: collision with root package name */
    private Map f4309b = new HashMap();

    public final f a() {
        if (this.f4308a == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (this.f4309b.keySet().size() < com.google.android.datatransport.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        Map map = this.f4309b;
        this.f4309b = new HashMap();
        return new f(this.f4308a, map);
    }

    public final void b(com.google.android.datatransport.c cVar, d dVar) {
        this.f4309b.put(cVar, dVar);
    }

    public final void c(com.google.android.datatransport.runtime.c.a aVar) {
        this.f4308a = aVar;
    }
}
