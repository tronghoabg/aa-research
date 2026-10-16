package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes3.dex */
final class wrc implements OnBackAnimationCallback {
    final /* synthetic */ wra a;
    final /* synthetic */ wrd b;

    public wrc(wrd wrdVar, wra wraVar) {
        this.a = wraVar;
        this.b = wrdVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.O();
        }
    }

    public final void onBackInvoked() {
        this.a.Q();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.Y(new nw(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.W(new nw(backEvent));
        }
    }
}
