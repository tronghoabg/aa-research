package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.waze.NativeManager;
import java.util.concurrent.CountDownLatch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements com.google.android.gms.o.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4774a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4775b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f4775b = i2;
        this.f4774a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    @Override // com.google.android.gms.o.k
    public final void a(com.google.android.gms.o.t tVar) {
        int i2 = this.f4775b;
        if (i2 == 0) {
            this.f4774a.run();
            return;
        }
        if (i2 == 1) {
            ((CountDownLatch) this.f4774a).countDown();
            return;
        }
        if (i2 == 2) {
            this.f4774a.run();
            return;
        }
        if (i2 == 3) {
            int i3 = FirebaseInstanceId.f9919c;
            ((CountDownLatch) this.f4774a).countDown();
            return;
        }
        if (i2 == 4) {
            this.f4774a.cancel(false);
            return;
        }
        h.g.b.x.f(tVar, "task");
        if (tVar.k()) {
            String str = (String) tVar.g();
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            com.waze.push.o.c((Context) this.f4774a, str);
            NativeManager.handlePushToken();
        }
    }
}
