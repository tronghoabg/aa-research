package com.google.android.apps.auto.components.config.phenotype.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.afec;
import defpackage.affa;
import defpackage.ikn;
import defpackage.kms;
import defpackage.mdd;
import defpackage.vky;
import defpackage.wub;
import defpackage.ype;
import defpackage.yph;
import defpackage.zfq;
import j$.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcom/google/android/apps/auto/components/config/phenotype/receiver/FlagUpdaterReceiver;", "Lcom/google/android/apps/auto/components/performance/TracedBroadcastReceiver;", "<init>", "()V", "doReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "getClassNameNotObfuscated", "Lcom/google/android/libraries/performance/primes/NoPiiString;", "kotlin.jvm.PlatformType", "Companion", "java.com.google.android.apps.auto.components.config.phenotype.receiver_receiver"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FlagUpdaterReceiver extends mdd {
    public static final yph a = yph.c("GH.FlagUpdaterReceiver");
    private static final Duration b;
    private static final afec c;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(25L);
        durationOfSeconds.getClass();
        b = durationOfSeconds;
        c = kms.a;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("FlagUpdaterReceiver");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zgp] */
    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (!affa.f(action, "android.intent.action.MY_PACKAGE_REPLACED")) {
            ((ype) a.h()).y("Received unexpected Intent action of %s", action);
            return;
        }
        ((ype) a.f()).u("Loading flags");
        wub.ah(wub.ae(c.invoke(context), b.toSeconds(), TimeUnit.SECONDS, Executors.newSingleThreadScheduledExecutor()), new ikn(e(), 2), zfq.a);
    }
}
