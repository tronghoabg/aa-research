package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;

/* loaded from: classes.dex */
final class lzq implements lzh {
    private final TurnEvent a = new TurnEvent();
    private final NavigationSummary b = new NavigationSummary();
    private final ComponentName c = new ComponentName("", "");

    @Override // defpackage.lzh
    public final ComponentName a() {
        return this.c;
    }

    @Override // defpackage.lzh
    public final eqj b() {
        throw new UnsupportedOperationException("getNavigationSuggestionsLiveData not supported while waiting for a navigation provider");
    }

    @Override // defpackage.lzh
    public final NavigationSummary c() {
        return this.b;
    }

    @Override // defpackage.lzh
    public final TurnEvent d() {
        return this.a;
    }
}
