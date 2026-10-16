package com.waze.uid.state_impl.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import com.waze.uid.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PendingIntent f44611a;

    k(PendingIntent pendingIntent) {
        this.f44611a = pendingIntent;
    }

    @Override // com.waze.uid.b.x
    public final IntentSenderRequest a(Context context) {
        h.g.b.x.f(context, "context");
        IntentSender intentSender = this.f44611a.getIntentSender();
        h.g.b.x.e(intentSender, "getIntentSender(...)");
        return new IntentSenderRequest.Builder(intentSender).build();
    }
}
