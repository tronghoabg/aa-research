package com.waze.sound;

import android.telephony.PhoneStateListener;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fk extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fl f40017a;

    fk(fl flVar) {
        this.f40017a = flVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i2, String str) {
        Object objD;
        super.onCallStateChanged(i2, str);
        kotlinx.coroutines.b.bn bnVar = this.f40017a.f40022e;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, ff.d((ff) objD, false, false, i2 != 0, 3)));
    }
}
