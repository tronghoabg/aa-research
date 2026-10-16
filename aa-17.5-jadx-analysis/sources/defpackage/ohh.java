package defpackage;

import android.content.Context;
import android.telecom.Call;
import android.telecom.CallAudioState;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ohh extends dws {
    public static final yph b = yph.c("GH.LocalInCallService");
    public final Map c = new LinkedHashMap();
    public final ajmd d;

    public ohh(ajmd ajmdVar) {
        this.d = ajmdVar;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.telecom.InCallService
    public final void onCallAdded(Call call) {
        call.getClass();
        ((ype) b.f()).u("onCallAdded");
        ahnc.d(dty.f(this), mkm.a.e().i(), 0, new nkn(this, call, (afck) null, 9), 2);
        this.d.m(new ogv(call, 3));
    }

    @Override // android.telecom.InCallService
    public final void onCallAudioStateChanged(CallAudioState callAudioState) {
        callAudioState.getClass();
        ((ype) b.f()).u("onCallAudioStateChanged");
        this.d.m(new ogv(callAudioState, 4));
    }

    @Override // android.telecom.InCallService
    public final void onCallRemoved(Call call) {
        call.getClass();
        ((ype) b.f()).u("onCallRemoved");
        this.d.m(new ogv(call, 5));
        this.c.remove(call);
    }
}
