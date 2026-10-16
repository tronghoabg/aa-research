package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class alc extends com.google.v.dm<ald, alc> implements com.google.v.fj {
    /* synthetic */ alc(byte[] bArr) {
        super(ald.DEFAULT_INSTANCE);
    }

    public final void a(alb albVar) {
        copyOnWrite();
        ((ald) this.instance).setAction(albVar);
    }

    public final void b() {
        copyOnWrite();
        ((ald) this.instance).setButtonPackEnabled(true);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ald) this.instance).setExternalTripToken(str);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((ald) this.instance).setIsIsv(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((ald) this.instance).setMissingPendingIntent(z);
    }

    public final void f(String str) {
        copyOnWrite();
        ((ald) this.instance).setPartnerAppId(str);
    }

    private alc() {
        throw null;
    }
}
