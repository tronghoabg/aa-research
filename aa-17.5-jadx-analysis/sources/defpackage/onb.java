package defpackage;

import android.telecom.CallAudioState;

/* loaded from: classes2.dex */
final class onb extends ebf {
    final /* synthetic */ onc a;

    public onb(onc oncVar) {
        this.a = oncVar;
    }

    @Override // defpackage.ebf
    public final void m(CallAudioState callAudioState) {
        ((ype) ((ype) onc.a.f()).ai((char) 6040)).u("onAudioStateChanged");
        wer.c();
        onc oncVar = this.a;
        oncVar.c();
        oncVar.g();
    }
}
