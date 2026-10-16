package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class lzx implements defpackage.lzo {
    private final com.google.android.apps.auto.sdk.nav.state.TurnEvent a = new com.google.android.apps.auto.sdk.nav.state.TurnEvent();
    private final com.google.android.apps.auto.sdk.nav.state.NavigationSummary b = new com.google.android.apps.auto.sdk.nav.state.NavigationSummary();
    private final android.content.ComponentName c = new android.content.ComponentName("", "");

    @Override // defpackage.lzo
    public final android.content.ComponentName a() {
        return this.c;
    }

    @Override // defpackage.lzo
    public final defpackage.eqp b() {
        throw new java.lang.UnsupportedOperationException("getNavigationSuggestionsLiveData not supported while waiting for a navigation provider");
    }

    @Override // defpackage.lzo
    public final com.google.android.apps.auto.sdk.nav.state.NavigationSummary c() {
        return this.b;
    }

    @Override // defpackage.lzo
    public final com.google.android.apps.auto.sdk.nav.state.TurnEvent d() {
        return this.a;
    }
}
