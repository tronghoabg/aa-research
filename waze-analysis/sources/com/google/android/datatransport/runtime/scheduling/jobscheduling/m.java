package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.support.v4.app.ae;
import com.google.android.datatransport.runtime.scheduling.a.r;
import com.google.android.datatransport.runtime.x;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4345a;

    /* renamed from: b, reason: collision with root package name */
    private final r f4346b;

    /* renamed from: c, reason: collision with root package name */
    private final a f4347c;

    /* renamed from: d, reason: collision with root package name */
    private final r f4348d;

    m(Executor executor, r rVar, a aVar, r rVar2) {
        this.f4345a = executor;
        this.f4346b = rVar;
        this.f4347c = aVar;
        this.f4348d = rVar2;
    }

    public static /* synthetic */ void c(m mVar) {
        Iterator it = mVar.f4346b.g().iterator();
        while (it.hasNext()) {
            mVar.f4347c.a((x) it.next(), 1);
        }
    }

    public final void b() {
        this.f4345a.execute(new ae(this, 10));
    }
}
