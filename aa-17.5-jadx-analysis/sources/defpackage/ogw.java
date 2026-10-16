package defpackage;

import android.content.Context;
import android.telecom.Call;
import android.telecom.CallAudioState;
import android.telecom.InCallService;

/* loaded from: classes2.dex */
final class ogw extends InCallService {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ogy a;

    public ogw(ogy ogyVar) {
        this.a = ogyVar;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.telecom.InCallService
    public final void onCallAdded(Call call) {
        ((ype) ((ype) ogy.a.f()).ai((char) 5904)).u("onCallAdded");
        this.a.c(new ogv(call, 2));
    }

    @Override // android.telecom.InCallService
    public final void onCallAudioStateChanged(CallAudioState callAudioState) {
        ((ype) ((ype) ogy.a.f()).ai((char) 5905)).u("onCallAudioStateChanged");
        this.a.c(new ogv(callAudioState, 0));
    }

    @Override // android.telecom.InCallService
    public final void onCallRemoved(Call call) {
        ((ype) ((ype) ogy.a.f()).ai((char) 5906)).u("onCallRemoved");
        this.a.c(new ogv(call, 1));
    }
}
