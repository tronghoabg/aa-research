package androidx.car.app;

import android.os.IInterface;
import androidx.car.app.HostDispatcher;
import androidx.car.app.IAppHost;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.suggestion.ISuggestionHost;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import defpackage.a5;
import java.security.InvalidParameterException;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class HostDispatcher {
    private IAppHost mAppHost;
    private ICarHost mCarHost;
    private IConstraintHost mConstraintHost;
    private INavigationHost mNavigationHost;
    private IMediaPlaybackHost mPlaybackMediaHost;
    private ISuggestionHost mSuggestionHost;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$dispatch$1(String str, String str2, HostCall hostCall) {
        IInterface host = getHost(str);
        if (host == null) {
            return null;
        }
        hostCall.dispatch(host);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$dispatchForResult$0(String str, String str2, HostCall hostCall) {
        IInterface host = getHost(str);
        if (host == null) {
            return null;
        }
        return hostCall.dispatch(host);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IAppHost lambda$getHost$2() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return IAppHost.Stub.asInterface(iCarHost.getHost(CarContext.APP_SERVICE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IConstraintHost lambda$getHost$3() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return IConstraintHost.Stub.asInterface(iCarHost.getHost(CarContext.CONSTRAINT_SERVICE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ISuggestionHost lambda$getHost$4() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return ISuggestionHost.Stub.asInterface(iCarHost.getHost(CarContext.SUGGESTION_SERVICE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IMediaPlaybackHost lambda$getHost$5() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return IMediaPlaybackHost.Stub.asInterface(iCarHost.getHost(CarContext.MEDIA_PLAYBACK_SERVICE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ INavigationHost lambda$getHost$6() {
        ICarHost iCarHost = this.mCarHost;
        Objects.requireNonNull(iCarHost);
        return INavigationHost.Stub.asInterface(iCarHost.getHost("navigation"));
    }

    public <ServiceT, ReturnT> void dispatch(String str, String str2, HostCall<ServiceT, ReturnT> hostCall) {
        RemoteUtils.dispatchCallToHost(str2, new a5(this, str, str2, hostCall, 0));
    }

    public <ServiceT, ReturnT> ReturnT dispatchForResult(String str, String str2, HostCall<ServiceT, ReturnT> hostCall) {
        return (ReturnT) RemoteUtils.dispatchCallToHostForResult(str2, new a5(this, str, str2, hostCall, 1));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public IInterface getHost(String str) {
        if (this.mCarHost == null) {
            return null;
        }
        try {
            switch (str.hashCode()) {
                case -1606703562:
                    if (str.equals(CarContext.CONSTRAINT_SERVICE)) {
                        if (this.mConstraintHost == null) {
                            final int i = 1;
                            this.mConstraintHost = (IConstraintHost) RemoteUtils.dispatchCallToHostForResult("getHost(Constraints)", new RemoteUtils.RemoteCall(this) { // from class: b5
                                public final /* synthetic */ HostDispatcher b;

                                {
                                    this.b = this;
                                }

                                @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                                public final Object call() {
                                    switch (i) {
                                        case 0:
                                            return this.b.lambda$getHost$2();
                                        case 1:
                                            return this.b.lambda$getHost$3();
                                        case 2:
                                            return this.b.lambda$getHost$4();
                                        case 3:
                                            return this.b.lambda$getHost$5();
                                        default:
                                            return this.b.lambda$getHost$6();
                                    }
                                }
                            });
                        }
                        return this.mConstraintHost;
                    }
                    break;
                case 96801:
                    if (str.equals(CarContext.APP_SERVICE)) {
                        if (this.mAppHost == null) {
                            final int i2 = 0;
                            this.mAppHost = (IAppHost) RemoteUtils.dispatchCallToHostForResult("getHost(App)", new RemoteUtils.RemoteCall(this) { // from class: b5
                                public final /* synthetic */ HostDispatcher b;

                                {
                                    this.b = this;
                                }

                                @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                                public final Object call() {
                                    switch (i2) {
                                        case 0:
                                            return this.b.lambda$getHost$2();
                                        case 1:
                                            return this.b.lambda$getHost$3();
                                        case 2:
                                            return this.b.lambda$getHost$4();
                                        case 3:
                                            return this.b.lambda$getHost$5();
                                        default:
                                            return this.b.lambda$getHost$6();
                                    }
                                }
                            });
                        }
                        return this.mAppHost;
                    }
                    break;
                case 98260:
                    if (str.equals(CarContext.CAR_SERVICE)) {
                        return this.mCarHost;
                    }
                    break;
                case 1197722116:
                    if (str.equals(CarContext.SUGGESTION_SERVICE)) {
                        if (this.mSuggestionHost == null) {
                            final int i3 = 2;
                            this.mSuggestionHost = (ISuggestionHost) RemoteUtils.dispatchCallToHostForResult("getHost(Suggestion)", new RemoteUtils.RemoteCall(this) { // from class: b5
                                public final /* synthetic */ HostDispatcher b;

                                {
                                    this.b = this;
                                }

                                @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                                public final Object call() {
                                    switch (i3) {
                                        case 0:
                                            return this.b.lambda$getHost$2();
                                        case 1:
                                            return this.b.lambda$getHost$3();
                                        case 2:
                                            return this.b.lambda$getHost$4();
                                        case 3:
                                            return this.b.lambda$getHost$5();
                                        default:
                                            return this.b.lambda$getHost$6();
                                    }
                                }
                            });
                        }
                        return this.mSuggestionHost;
                    }
                    break;
                case 1569536022:
                    if (str.equals(CarContext.MEDIA_PLAYBACK_SERVICE)) {
                        if (this.mPlaybackMediaHost == null) {
                            final int i4 = 3;
                            this.mPlaybackMediaHost = (IMediaPlaybackHost) RemoteUtils.dispatchCallToHostForResult("getHost(Media)", new RemoteUtils.RemoteCall(this) { // from class: b5
                                public final /* synthetic */ HostDispatcher b;

                                {
                                    this.b = this;
                                }

                                @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                                public final Object call() {
                                    switch (i4) {
                                        case 0:
                                            return this.b.lambda$getHost$2();
                                        case 1:
                                            return this.b.lambda$getHost$3();
                                        case 2:
                                            return this.b.lambda$getHost$4();
                                        case 3:
                                            return this.b.lambda$getHost$5();
                                        default:
                                            return this.b.lambda$getHost$6();
                                    }
                                }
                            });
                        }
                        return this.mPlaybackMediaHost;
                    }
                    break;
                case 1862666772:
                    if (str.equals("navigation")) {
                        if (this.mNavigationHost == null) {
                            final int i5 = 4;
                            this.mNavigationHost = (INavigationHost) RemoteUtils.dispatchCallToHostForResult("getHost(Navigation)", new RemoteUtils.RemoteCall(this) { // from class: b5
                                public final /* synthetic */ HostDispatcher b;

                                {
                                    this.b = this;
                                }

                                @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
                                public final Object call() {
                                    switch (i5) {
                                        case 0:
                                            return this.b.lambda$getHost$2();
                                        case 1:
                                            return this.b.lambda$getHost$3();
                                        case 2:
                                            return this.b.lambda$getHost$4();
                                        case 3:
                                            return this.b.lambda$getHost$5();
                                        default:
                                            return this.b.lambda$getHost$6();
                                    }
                                }
                            });
                        }
                        return this.mNavigationHost;
                    }
                    break;
            }
            throw new InvalidParameterException("Invalid host type: ".concat(str));
        } catch (HostException unused) {
            return null;
        }
    }

    public void resetHosts() {
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
