package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bha extends com.google.v.dm<bhd, bha> implements com.google.v.fj {
    /* synthetic */ bha(byte[] bArr) {
        super(bhd.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bhd) this.instance).setFreshLocationAvailable(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bhd) this.instance).setLoggedIn(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((bhd) this.instance).setNetworkAvailable(z);
    }

    public final void d(bhb bhbVar) {
        copyOnWrite();
        ((bhd) this.instance).setResult(bhbVar);
    }

    public final void e(bhc bhcVar) {
        copyOnWrite();
        ((bhd) this.instance).setSuggestionType(bhcVar);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((bhd) this.instance).setTripForecastFlag(z);
    }

    private bha() {
        throw null;
    }
}
