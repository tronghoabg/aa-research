package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.database.SQLException;
import com.google.android.datatransport.runtime.scheduling.a.r;
import com.google.android.datatransport.runtime.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements com.google.android.datatransport.runtime.b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4332b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f4333c;

    public /* synthetic */ j(com.waze.map.g.g gVar, x xVar, int i2) {
        this.f4333c = i2;
        this.f4331a = gVar;
        this.f4332b = xVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List, java.util.Map] */
    @Override // com.google.android.datatransport.runtime.b.b
    public final Object a() throws SQLException {
        int i2 = this.f4333c;
        if (i2 == 0) {
            return ((r) ((com.waze.map.g.g) this.f4331a).f29060h).h((x) this.f4332b);
        }
        if (i2 == 1) {
            return Boolean.valueOf(((r) ((com.waze.map.g.g) this.f4331a).f29060h).s((x) this.f4332b));
        }
        ?? r1 = this.f4331a;
        if (i2 != 2) {
            com.waze.map.g.g.l((com.waze.map.g.g) this.f4332b, r1);
            return null;
        }
        ((r) ((com.waze.map.g.g) this.f4332b).f29060h).q(r1);
        return null;
    }

    public /* synthetic */ j(com.waze.map.g.g gVar, Object obj, int i2) {
        this.f4333c = i2;
        this.f4332b = gVar;
        this.f4331a = obj;
    }
}
