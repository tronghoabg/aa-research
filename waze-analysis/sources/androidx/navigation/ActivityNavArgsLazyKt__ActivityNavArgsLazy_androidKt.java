package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt {
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final Activity activity) {
        x.f(activity, "<this>");
        x.i();
        int i2 = ar.f48106a;
        return new NavArgsLazy<>(new m(NavArgs.class), new a<Bundle>() { // from class: androidx.navigation.ActivityNavArgsLazyKt__ActivityNavArgsLazy_androidKt.navArgs.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // h.g.a.a
            public final Bundle invoke() {
                Intent intent = activity.getIntent();
                Activity activity2 = activity;
                if (intent == null) {
                    throw new IllegalStateException("Activity " + activity2 + " has a null Intent");
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras;
                }
                throw new IllegalStateException("Activity " + activity2 + " has null extras in " + intent);
            }
        });
    }
}
