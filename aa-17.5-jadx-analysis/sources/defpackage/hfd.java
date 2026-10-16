package defpackage;

import androidx.car.app.serialization.Bundleable;
import androidx.car.app.suggestion.ISuggestionHost;

/* loaded from: classes2.dex */
public final class hfd extends ISuggestionHost.Stub {
    public final /* synthetic */ hfe a;

    public hfd(hfe hfeVar) {
        this.a = hfeVar;
    }

    @Override // androidx.car.app.suggestion.ISuggestionHost
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.suggestion.ISuggestionHost
    public final void updateSuggestions(Bundleable bundleable) {
        ((ynz) ((ynz) hfe.c.f().o(ypi.a, "CarApp.H.Sug")).ai('f')).u("Received Suggestions from 3p App");
        this.a.n("updateSuggestions", new esx(this, bundleable, 20, (char[]) null));
    }
}
