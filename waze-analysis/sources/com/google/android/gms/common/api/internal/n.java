package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f4840a;

    /* renamed from: b, reason: collision with root package name */
    private final m f4841b;

    n(o oVar, m mVar) {
        Objects.requireNonNull(oVar);
        this.f4840a = oVar;
        this.f4841b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f4840a;
        if (oVar.f4842a) {
            m mVar = this.f4841b;
            com.google.android.gms.common.d dVarB = mVar.b();
            int iA = dVarB.a();
            com.google.android.gms.common.h hVar = oVar.f4844c;
            if (!hVar.d(iA)) {
                Log.w("BaseLifecycleHelper", "Not showing dialog since ConnectionResult is not user-facing: ".concat(String.valueOf(String.valueOf(dVarB))));
                oVar.i(dVarB, mVar.a());
                return;
            }
            if (dVarB.f()) {
                Activity activityN = oVar.n();
                PendingIntent pendingIntentB = dVarB.b();
                av.m(pendingIntentB);
                oVar.f4752d.startActivityForResult(GoogleApiActivity.a(activityN, pendingIntentB, mVar.a(), false), 1);
                return;
            }
            if (hVar.n(oVar.n(), dVarB.a(), null) != null) {
                hVar.j(oVar.n(), oVar.f4752d, dVarB.a(), oVar);
                hVar.c(oVar.n().getApplicationContext(), dVarB, true);
                return;
            }
            if (dVarB.a() != 18) {
                oVar.i(dVarB, mVar.a());
                return;
            }
            hVar.g(oVar.n().getApplicationContext(), new aj(this, hVar.a(oVar.n(), oVar)));
            hVar.c(oVar.n().getApplicationContext(), dVarB, true);
        }
    }
}
