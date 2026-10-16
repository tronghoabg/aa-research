package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class w extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public v f33876a;

    public final void a(v vVar) {
        this.f33876a = vVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        v vVar;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e7) {
                String localizedMessage = e7.getLocalizedMessage();
                if (localizedMessage != null) {
                    boolean z2 = u.f33874a;
                    t.b("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (AbstractC3340k.a(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            boolean z10 = u.f33874a;
            t.a("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                v vVar2 = this.f33876a;
                if (vVar2 != null) {
                    vVar2.a(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (vVar = this.f33876a) != null) {
                    vVar.a(false);
                    return;
                }
                return;
            }
            v vVar3 = this.f33876a;
            if (vVar3 != null) {
                vVar3.a(true);
            }
        }
    }
}
