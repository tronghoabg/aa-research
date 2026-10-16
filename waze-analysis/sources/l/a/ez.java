package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ez extends com.google.v.dm<fb, ez> implements com.google.v.fj {
    /* synthetic */ ez(byte[] bArr) {
        super(fb.DEFAULT_INSTANCE);
    }

    public final void a(el elVar) {
        copyOnWrite();
        ((fb) this.instance).setAndroidAutoConnected(elVar);
    }

    public final void b(en enVar) {
        copyOnWrite();
        ((fb) this.instance).setAndroidAutoDisconnected(enVar);
    }

    public final void c(ex exVar) {
        copyOnWrite();
        ((fb) this.instance).setAppCrashed(exVar.build());
    }

    public final void d(fe feVar) {
        copyOnWrite();
        ((fb) this.instance).setAppRecoveredFromCrashLoop(feVar.build());
    }

    public final void e(ti tiVar) {
        copyOnWrite();
        ((fb) this.instance).setDynamicSplashScreenHidden(tiVar);
    }

    public final void f(tl tlVar) {
        copyOnWrite();
        ((fb) this.instance).setDynamicSplashScreenShown(tlVar);
    }

    public final void g(abn abnVar) {
        copyOnWrite();
        ((fb) this.instance).setHybridPlatformModeEnded(abnVar);
    }

    public final void h(abp abpVar) {
        copyOnWrite();
        ((fb) this.instance).setHybridPlatformModeStarted(abpVar);
    }

    public final void i(axs axsVar) {
        copyOnWrite();
        ((fb) this.instance).setScreenOrientationSet(axsVar);
    }

    private ez() {
        throw null;
    }
}
