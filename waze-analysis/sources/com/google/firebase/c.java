package com.google.firebase;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements com.google.android.gms.common.api.internal.j {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f8909a = new AtomicReference();

    static /* bridge */ /* synthetic */ void b(Context context) {
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference = f8909a;
            if (atomicReference.get() == null) {
                c cVar = new c();
                if (a.a.g(atomicReference, cVar)) {
                    k.c(application);
                    k.a().b(cVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(boolean z) {
        synchronized (e.f9873b) {
            Iterator it = new ArrayList(e.f9872a.values()).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.f9878g.get()) {
                    e.l(eVar, z);
                }
            }
        }
    }
}
