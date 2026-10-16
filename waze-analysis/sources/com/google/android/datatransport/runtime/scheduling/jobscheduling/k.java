package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements com.google.android.datatransport.runtime.b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4336c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f4337d;

    public /* synthetic */ k(com.google.android.datatransport.runtime.scheduling.a aVar, x xVar, com.google.android.datatransport.runtime.n nVar, int i2) {
        this.f4337d = i2;
        this.f4335b = aVar;
        this.f4334a = xVar;
        this.f4336c = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // com.google.android.datatransport.runtime.b.b
    public final Object a() {
        int i2 = this.f4337d;
        Object obj = this.f4336c;
        if (i2 != 0) {
            com.google.android.datatransport.runtime.scheduling.a.c((com.google.android.datatransport.runtime.scheduling.a) this.f4335b, (x) this.f4334a, (com.google.android.datatransport.runtime.n) obj);
            return null;
        }
        com.waze.map.g.g.i((com.waze.map.g.g) this.f4334a, this.f4335b, (x) obj);
        return null;
    }

    public /* synthetic */ k(com.waze.map.g.g gVar, List list, x xVar, int i2) {
        this.f4337d = i2;
        this.f4334a = gVar;
        this.f4335b = list;
        this.f4336c = xVar;
    }
}
