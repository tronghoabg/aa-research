package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wrz implements android.window.OnBackAnimationCallback {
    final /* synthetic */ defpackage.wrx a;
    final /* synthetic */ defpackage.wsa b;

    public wrz(defpackage.wsa wsaVar, defpackage.wrx wrxVar) {
        this.a = wrxVar;
        this.b = wsaVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.D();
        }
    }

    public final void onBackInvoked() {
        this.a.F();
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        if (this.b.d()) {
            this.a.N(new defpackage.ny(backEvent));
        }
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        if (this.b.d()) {
            this.a.L(new defpackage.ny(backEvent));
        }
    }
}
