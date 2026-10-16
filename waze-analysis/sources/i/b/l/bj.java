package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bj extends com.google.v.dm<bk, bj> implements com.google.v.fj {
    /* synthetic */ bj(byte[] bArr) {
        super(bk.DEFAULT_INSTANCE);
    }

    public final void a(at atVar) {
        copyOnWrite();
        ((bk) this.instance).setAccessTokenType(atVar);
    }

    public final void b(bo boVar) {
        copyOnWrite();
        ((bk) this.instance).setChangeEmailTwoFactorAuth(boVar.build());
    }

    public final void c(String str) {
        copyOnWrite();
        ((bk) this.instance).setCommunity(str);
    }

    public final void d(bc bcVar) {
        copyOnWrite();
        ((bk) this.instance).setInitialNotificationsPreferences(bcVar.build());
    }

    public final void e(String str) {
        copyOnWrite();
        ((bk) this.instance).setToken(str);
    }

    private bj() {
        throw null;
    }
}
