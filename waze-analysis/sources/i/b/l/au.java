package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class au extends com.google.v.dm<av, au> implements com.google.v.fj {
    /* synthetic */ au(byte[] bArr) {
        super(av.DEFAULT_INSTANCE);
    }

    public final void a(at atVar) {
        copyOnWrite();
        ((av) this.instance).setAccessTokenType(atVar);
    }

    public final void b(bo boVar) {
        copyOnWrite();
        ((av) this.instance).setChangeEmailTwoFactorAuth(boVar.build());
    }

    public final void c(String str) {
        copyOnWrite();
        ((av) this.instance).setCommunity(str);
    }

    public final void d(bc bcVar) {
        copyOnWrite();
        ((av) this.instance).setInitialNotificationsPreferences(bcVar.build());
    }

    public final void e(String str) {
        copyOnWrite();
        ((av) this.instance).setToken(str);
    }

    public final void f() {
        copyOnWrite();
        ((av) this.instance).setUidEnabled(true);
    }

    public final void g() {
        copyOnWrite();
        ((av) this.instance).setForce(true);
    }

    private au() {
        throw null;
    }
}
