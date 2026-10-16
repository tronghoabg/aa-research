package defpackage;

import androidx.car.app.AppManager;
import androidx.car.app.HostCall;
import androidx.car.app.IAppHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.media.MediaPlaybackManager;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.suggestion.ISuggestionHost;
import androidx.car.app.suggestion.SuggestionManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundleable b;

    public /* synthetic */ s0(Bundleable bundleable, int i) {
        this.a = i;
        this.b = bundleable;
    }

    @Override // androidx.car.app.HostCall
    public final Object dispatch(Object obj) {
        switch (this.a) {
            case 0:
                return AppManager.lambda$showAlert$3(this.b, (IAppHost) obj);
            case 1:
                return MediaPlaybackManager.lambda$registerMediaPlaybackToken$0(this.b, (IMediaPlaybackHost) obj);
            case 2:
                return NavigationManager.lambda$updateTrip$0(this.b, (INavigationHost) obj);
            default:
                return SuggestionManager.lambda$updateSuggestions$0(this.b, (ISuggestionHost) obj);
        }
    }
}
