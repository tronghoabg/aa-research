package com.google.android.apps.auto.components.bugreport;

import android.content.Context;
import android.content.Intent;
import com.google.android.projection.gearhead.R;
import defpackage.ebf;
import defpackage.isp;
import defpackage.kfl;
import defpackage.kgg;
import defpackage.mdd;
import defpackage.obs;
import defpackage.vky;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"Lcom/google/android/apps/auto/components/bugreport/BugreportTitleTranscriptionReceiver;", "Lcom/google/android/apps/auto/components/performance/TracedBroadcastReceiver;", "<init>", "()V", "doReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "getClassNameNotObfuscated", "Lcom/google/android/libraries/performance/primes/NoPiiString;", "java.com.google.android.apps.auto.components.bugreport_bugreport"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BugreportTitleTranscriptionReceiver extends mdd {
    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("BugreportTitleTranscriptionReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (!ebf.A().k().isEmpty()) {
            obs.a().c(context, BugreportRequester.c, R.string.bugreport_cannot_perform_title_transcription, 0);
            return;
        }
        AtomicReference atomicReference = new AtomicReference();
        kfl.h().O(new kgg(atomicReference, new isp(atomicReference, context, intent, intent.getIntExtra("EXTRA_NOTIFICATION_ID", 0), 5)));
    }
}
