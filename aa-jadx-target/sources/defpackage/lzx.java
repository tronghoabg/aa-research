package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lzx implements lzo {
    private final com.google.android.apps.auto.sdk.nav.state.TurnEvent a = new com.google.android.apps.auto.sdk.nav.state.TurnEvent();
    private final com.google.android.apps.auto.sdk.nav.state.NavigationSummary b = new com.google.android.apps.auto.sdk.nav.state.NavigationSummary();
    private final android.content.ComponentName c = new android.content.ComponentName("", "");

    public final android.content.ComponentName a() {
        return this.c;
    }

    public final defpackage.eqp b() {
        throw new java.lang.UnsupportedOperationException("getNavigationSuggestionsLiveData not supported while waiting for a navigation provider");
    }

    public final com.google.android.apps.auto.sdk.nav.state.NavigationSummary c() {
        return this.b;
    }

    public final com.google.android.apps.auto.sdk.nav.state.TurnEvent d() {
        return this.a;
    }
}
