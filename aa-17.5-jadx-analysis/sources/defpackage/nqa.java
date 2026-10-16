package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class nqa {
    static final /* synthetic */ afia[] a = {new affn(nqa.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/system/immersive/AssistantImmersiveManager;", 0)};

    public static final boolean b(Intent intent) {
        intent.getClass();
        return intent.getBooleanExtra("assistant_immersive_activity", false);
    }

    public final nqd a() {
        return (nqd) nqd.c.getValue(this, a[0]);
    }
}
