package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import c.b.e;
import com.google.android.datatransport.runtime.p;
import com.google.android.datatransport.runtime.scheduling.a.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final e f4303a;

    /* renamed from: b, reason: collision with root package name */
    private final e f4304b;

    private d(e eVar, e eVar2) {
        this.f4303a = eVar;
        this.f4304b = eVar2;
    }

    public static d b(e eVar, e eVar2) {
        return new d(eVar, eVar2);
    }

    @Override // g.a.a, f.a.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.a get() {
        Context context = (Context) this.f4303a.get();
        r rVar = (r) this.f4304b.get();
        f fVarA = p.a();
        p.d();
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, rVar, fVarA);
    }
}
