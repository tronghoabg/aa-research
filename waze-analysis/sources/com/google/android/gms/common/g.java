package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g extends com.waze.native_managers.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f4943a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        Objects.requireNonNull(hVar);
        this.f4943a = hVar;
        this.f4944b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        h hVar = this.f4943a;
        Context context = this.f4944b;
        int iM = hVar.m(context, 17895000);
        boolean z = ag.f4671a;
        if (iM == 1 || iM == 2 || iM == 3 || iM == 9) {
            hVar.k(context, new d(iM, hVar.p(context, iM, "n")));
        }
    }
}
