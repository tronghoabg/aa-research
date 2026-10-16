package androidx.car.app;

import android.os.IInterface;
import android.util.Log;
import androidx.car.app.IAppHost;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.suggestion.ISuggestionHost;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import j$.util.Objects;
import java.security.InvalidParameterException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HostDispatcher {
    private IAppHost mAppHost;
    private ICarHost mCarHost;
    private IConstraintHost mConstraintHost;
    private INavigationHost mNavigationHost;
    private IMediaPlaybackHost mPlaybackMediaHost;
    private ISuggestionHost mSuggestionHost;

    public <ServiceT, ReturnT> void dispatch(final String str, final String str2, final HostCall<ServiceT, ReturnT> hostCall) {
        RemoteUtils.dispatchCallToHost(str2, new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                this.f$0.m1591lambda$dispatch$1$androidxcarappHostDispatcher(str, str2, hostCall);
                return null;
            }
        });
    }

    public <ServiceT, ReturnT> ReturnT dispatchForResult(final String str, final String str2, final HostCall<ServiceT, ReturnT> hostCall) {
        return (ReturnT) RemoteUtils.dispatchCallToHostForResult(str2, new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                return this.f$0.m1592lambda$dispatchForResult$0$androidxcarappHostDispatcher(str, str2, hostCall);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    IInterface getHost(String str) {
        ICarHost iCarHost = this.mCarHost;
        if (iCarHost == null) {
            Log.e(LogTags.TAG_DISPATCH, "Host is not bound when attempting to retrieve host service");
            return null;
        }
        try {
            switch (str.hashCode()) {
                case -1606703562:
                    if (str.equals(CarContext.CONSTRAINT_SERVICE)) {
                        IConstraintHost iConstraintHost = this.mConstraintHost;
                        if (iConstraintHost != null) {
                            return iConstraintHost;
                        }
                        IConstraintHost iConstraintHost2 = (IConstraintHost) RemoteUtils.dispatchCallToHostForResult("getHost(Constraints)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda3
                            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                            public final Object call() {
                                return this.f$0.m1594lambda$getHost$3$androidxcarappHostDispatcher();
                            }
                        });
                        this.mConstraintHost = iConstraintHost2;
                        return iConstraintHost2;
                    }
                    break;
                case 96801:
                    if (str.equals(CarContext.APP_SERVICE)) {
                        IAppHost iAppHost = this.mAppHost;
                        if (iAppHost != null) {
                            return iAppHost;
                        }
                        IAppHost iAppHost2 = (IAppHost) RemoteUtils.dispatchCallToHostForResult("getHost(App)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda2
                            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                            public final Object call() {
                                return this.f$0.m1593lambda$getHost$2$androidxcarappHostDispatcher();
                            }
                        });
                        this.mAppHost = iAppHost2;
                        return iAppHost2;
                    }
                    break;
                case 98260:
                    if (str.equals(CarContext.CAR_SERVICE)) {
                        return iCarHost;
                    }
                    break;
                case 1197722116:
                    if (str.equals(CarContext.SUGGESTION_SERVICE)) {
                        ISuggestionHost iSuggestionHost = this.mSuggestionHost;
                        if (iSuggestionHost != null) {
                            return iSuggestionHost;
                        }
                        ISuggestionHost iSuggestionHost2 = (ISuggestionHost) RemoteUtils.dispatchCallToHostForResult("getHost(Suggestion)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda4
                            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                            public final Object call() {
                                return this.f$0.m1595lambda$getHost$4$androidxcarappHostDispatcher();
                            }
                        });
                        this.mSuggestionHost = iSuggestionHost2;
                        return iSuggestionHost2;
                    }
                    break;
                case 1569536022:
                    if (str.equals(CarContext.MEDIA_PLAYBACK_SERVICE)) {
                        IMediaPlaybackHost iMediaPlaybackHost = this.mPlaybackMediaHost;
                        if (iMediaPlaybackHost != null) {
                            return iMediaPlaybackHost;
                        }
                        IMediaPlaybackHost iMediaPlaybackHost2 = (IMediaPlaybackHost) RemoteUtils.dispatchCallToHostForResult("getHost(Media)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda5
                            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                            public final Object call() {
                                return this.f$0.m1596lambda$getHost$5$androidxcarappHostDispatcher();
                            }
                        });
                        this.mPlaybackMediaHost = iMediaPlaybackHost2;
                        return iMediaPlaybackHost2;
                    }
                    break;
                case 1862666772:
                    if (str.equals("navigation")) {
                        INavigationHost iNavigationHost = this.mNavigationHost;
                        if (iNavigationHost != null) {
                            return iNavigationHost;
                        }
                        INavigationHost iNavigationHost2 = (INavigationHost) RemoteUtils.dispatchCallToHostForResult("getHost(Navigation)", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.HostDispatcher$$ExternalSyntheticLambda6
                            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                            public final Object call() {
                                return this.f$0.m1597lambda$getHost$6$androidxcarappHostDispatcher();
                            }
                        });
                        this.mNavigationHost = iNavigationHost2;
                        return iNavigationHost2;
                    }
                    break;
            }
            throw new InvalidParameterException("Invalid host type: " + str);
        } catch (HostException unused) {
            Log.e(LogTags.TAG_DISPATCH, "Host threw an exception when attempting to retrieve host service");
            return null;
        }
    }

    /* renamed from: lambda$dispatch$1$androidx-car-app-HostDispatcher, reason: not valid java name */
    /* synthetic */ Object m1591lambda$dispatch$1$androidxcarappHostDispatcher(String str, String str2, HostCall hostCall) {
        IInterface host = getHost(str);
        if (host == null) {
            Log.e(LogTags.TAG_DISPATCH, "Could not retrieve host while dispatching call ".concat(String.valueOf(str2)));
            return null;
        }
        hostCall.dispatch(host);
        return null;
    }

    /* renamed from: lambda$dispatchForResult$0$androidx-car-app-HostDispatcher, reason: not valid java name */
    /* synthetic */ Object m1592lambda$dispatchForResult$0$androidxcarappHostDispatcher(String str, String str2, HostCall hostCall) {
        IInterface host = getHost(str);
        if (host != null) {
            return hostCall.dispatch(host);
        }
        Log.e(LogTags.TAG_DISPATCH, "Could not retrieve host while dispatching call ".concat(String.valueOf(str2)));
        return null;
    }

    /* renamed from: lambda$getHost$2$androidx-car-app-HostDispatcher, reason: not valid java name */
    /* synthetic */ IAppHost m1593lambda$getHost$2$androidxcarappHostDispatcher() {
        return IAppHost.Stub.asInterface(((ICarHost) Objects.requireNonNull(this.mCarHost)).getHost(CarContext.APP_SERVICE));
    }

    /* renamed from: lambda$getHost$3$androidx-car-app-HostDispatcher, reason: not valid java name */
    /* synthetic */ IConstraintHost m1594lambda$getHost$3$androidxcarappHostDispatcher() {
        return IConstraintHost.Stub.asInterface(((ICarHost) Objects.requireNonNull(this.mCarHost)).getHost(CarContext.CONSTRAINT_SERVICE));
    }

    /* renamed from: lambda$getHost$4$androidx-car-app-HostDispatcher, reason: not valid java name */
    /* synthetic */ ISuggestionHost m1595lambda$getHost$4$androidxcarappHostDispatcher() {
        return ISuggestionHost.Stub.asInterface(((ICarHost) Objects.requireNonNull(this.mCarHost)).getHost(CarContext.SUGGESTION_SERVICE));
    }

    /* renamed from: lambda$getHost$5$androidx-car-app-HostDispatcher, reason: not valid java name */
    /* synthetic */ IMediaPlaybackHost m1596lambda$getHost$5$androidxcarappHostDispatcher() {
        return IMediaPlaybackHost.Stub.asInterface(((ICarHost) Objects.requireNonNull(this.mCarHost)).getHost(CarContext.MEDIA_PLAYBACK_SERVICE));
    }

    /* renamed from: lambda$getHost$6$androidx-car-app-HostDispatcher, reason: not valid java name */
    /* synthetic */ INavigationHost m1597lambda$getHost$6$androidxcarappHostDispatcher() {
        return INavigationHost.Stub.asInterface(((ICarHost) Objects.requireNonNull(this.mCarHost)).getHost("navigation"));
    }

    void resetHosts() {
        ThreadUtils.checkMainThread();
        this.mCarHost = null;
        this.mAppHost = null;
        this.mNavigationHost = null;
    }

    public void setCarHost(ICarHost iCarHost) {
        ThreadUtils.checkMainThread();
        resetHosts();
        this.mCarHost = iCarHost;
    }
}
