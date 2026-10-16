package db;

import R8.C0805a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0805a f34206b;

    public /* synthetic */ d(C0805a c0805a, int i5) {
        this.f34205a = i5;
        this.f34206b = c0805a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C0805a c0805a = this.f34206b;
        int i5 = this.f34205a;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(intent, "intent");
        switch (i5) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    c0805a.m("onBecomingNoisy", new Object[0]);
                    break;
                }
                break;
            default:
                c0805a.m("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                break;
        }
    }
}
