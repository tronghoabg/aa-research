package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.k;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements com.google.android.gms.common.api.internal.j {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f10613a = new AtomicReference();

    static /* bridge */ /* synthetic */ void b(Context context) {
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference = f10613a;
        if (atomicReference.get() == null) {
            h hVar = new h();
            if (a.a.g(atomicReference, hVar)) {
                k.c(application);
                k.a().b(hVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void a(boolean z) {
        i.h(z);
    }
}
