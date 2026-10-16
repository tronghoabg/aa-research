package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f9818a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final Context f9819b;

    public d(Context context) {
        this.f9819b = context;
    }

    static /* bridge */ /* synthetic */ void a(Context context) {
        AtomicReference atomicReference = f9818a;
        if (atomicReference.get() == null) {
            d dVar = new d(context);
            if (a.a.g(atomicReference, dVar)) {
                context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (e.f9873b) {
            Iterator it = e.f9872a.values().iterator();
            while (it.hasNext()) {
                ((e) it.next()).r();
            }
        }
        this.f9819b.unregisterReceiver(this);
    }
}
