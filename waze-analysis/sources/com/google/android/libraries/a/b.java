package com.google.android.libraries.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.d.m.a.af;
import com.google.d.m.a.bd;
import com.google.d.m.a.bv;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f5787a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f5788b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bv f5789c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ af f5790d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Executor f5791e;

    b(AtomicBoolean atomicBoolean, Context context, bv bvVar, af afVar, Executor executor) {
        this.f5787a = atomicBoolean;
        this.f5788b = context;
        this.f5789c = bvVar;
        this.f5790d = afVar;
        this.f5791e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f5787a.compareAndSet(false, true)) {
            c.g(this.f5788b, this);
            this.f5789c.e(bd.l(this.f5790d, this.f5791e));
        }
    }
}
