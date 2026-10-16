package androidx.core.telecom.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.affa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f"}, d2 = {"Landroidx/core/telecom/internal/MuteStateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onGlobalMuteChanged", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "mOnGlobalMuteChanged", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "core-telecom"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MuteStateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (affa.f("android.media.action.MICROPHONE_MUTE_CHANGED", intent != null ? intent.getAction() : null)) {
            Object systemService = context != null ? context.getSystemService("audio") : null;
            systemService.getClass();
        }
    }
}
