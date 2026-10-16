package gd;

import android.app.Activity;
import android.util.Log;
import b7.k;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;

/* renamed from: gd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2751f implements InterfaceC3885b, InterfaceC3964a {

    /* renamed from: a, reason: collision with root package name */
    public k f35875a;

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b interfaceC3965b) {
        k kVar = this.f35875a;
        if (kVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            kVar.f19398d = (Activity) ((s1) interfaceC3965b).f43896a;
        }
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        k kVar = new k(c3884a.f44186a, 26);
        this.f35875a = kVar;
        com.google.android.gms.internal.consent_sdk.a.E(c3884a.f44188c, kVar);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        k kVar = this.f35875a;
        if (kVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            kVar.f19398d = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        if (this.f35875a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            com.google.android.gms.internal.consent_sdk.a.E(c3884a.f44188c, null);
            this.f35875a = null;
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b interfaceC3965b) {
        onAttachedToActivity(interfaceC3965b);
    }
}
