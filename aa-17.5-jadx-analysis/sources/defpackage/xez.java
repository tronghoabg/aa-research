package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class xez implements mno {
    private static final yph a = yph.c("GH.GhStreamItemLauncher");

    @Override // defpackage.mno
    public final void a(Intent intent, PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (intent != null) {
            b(intent);
        } else {
            if (pendingIntent == null) {
                ((ype) ((ype) a.h()).ai((char) 10195)).u("intent and pendingIntent are both null");
                return;
            }
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                ((ype) ((ype) a.g()).ai((char) 10196)).u("Error sending pendingIntent. It was cancelled");
            }
        }
    }

    @Override // defpackage.mno
    public final void b(Intent intent) {
        try {
            mpe.a().i(intent);
        } catch (IllegalStateException unused) {
            ((ype) ((ype) a.g()).ai((char) 10197)).y("Car no longer connected, unable to start %s", intent);
        }
    }

    @Override // defpackage.mno
    public final void c(int i, Intent intent) {
        if (intent.getComponent() == null) {
            ComponentName componentName = i + (-1) != 3 ? mkn.b : mkn.f;
            ((ype) ((ype) a.h()).ai((char) 10194)).y("No component set for intent. Overriding with %s", componentName);
            intent.setComponent(componentName);
        }
        b(intent);
    }
}
