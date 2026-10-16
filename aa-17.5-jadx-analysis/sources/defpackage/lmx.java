package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
final class lmx implements Runnable {
    public AaPlaybackState a;
    public String b;
    final /* synthetic */ lnb c;

    public lmx(lnb lnbVar) {
        this.c = lnbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.Q() == 3) {
            llu lluVar = new llu((byte[][]) null);
            ((eb) lluVar.b).c(this.a.Q(), this.a.U() + 1000, this.a.O(), this.a.T() + 1000);
            ((eb) lluVar.b).d = this.a.n();
            this.a = lluVar.K();
            this.c.g.postDelayed(this, 1000L);
        }
        this.c.q(this.a, this.b);
    }
}
