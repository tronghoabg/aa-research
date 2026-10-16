package defpackage;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class nez extends CameraManager.TorchCallback {
    final /* synthetic */ nfa a;

    public nez(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override // android.hardware.camera2.CameraManager.TorchCallback
    public final void onTorchModeChanged(String str, boolean z) {
        str.getClass();
        nfa nfaVar = this.a;
        if (z) {
            nfaVar.a.add(str);
        } else {
            nfaVar.a.remove(str);
        }
        this.a.m(Boolean.valueOf(!r1.a.isEmpty()));
    }
}
