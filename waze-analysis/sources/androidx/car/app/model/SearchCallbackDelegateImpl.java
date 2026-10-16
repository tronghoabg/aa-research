package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.model.ISearchCallback;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class SearchCallbackDelegateImpl implements SearchCallbackDelegate {
    private final ISearchCallback mStubCallback;

    /* compiled from: WazeSource */
    @CarProtocol
    class SearchCallbackStub extends ISearchCallback.Stub {
        private final SearchTemplate.SearchCallback mCallback;

        SearchCallbackStub(SearchTemplate.SearchCallback searchCallback) {
            this.mCallback = searchCallback;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onSearchSubmitted$1$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1643x5bd43f40(String str) {
            this.mCallback.onSearchSubmitted(str);
            return null;
        }

        /* renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        /* synthetic */ Object m1644xa7c97055(String str) {
            this.mCallback.onSearchTextChanged(str);
            return null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onSearchSubmitted", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.SearchCallbackDelegateImpl$SearchCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1643x5bd43f40(str);
                }
            });
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onSearchTextChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.SearchCallbackDelegateImpl$SearchCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return this.f$0.m1644xa7c97055(str);
                }
            });
        }
    }

    private SearchCallbackDelegateImpl(SearchTemplate.SearchCallback searchCallback) {
        this.mStubCallback = new SearchCallbackStub(searchCallback);
    }

    public static SearchCallbackDelegate create(SearchTemplate.SearchCallback searchCallback) {
        return new SearchCallbackDelegateImpl(searchCallback);
    }

    @Override // androidx.car.app.model.SearchCallbackDelegate
    public void sendSearchSubmitted(String str, OnDoneCallback onDoneCallback) {
        try {
            ((ISearchCallback) Objects.requireNonNull(this.mStubCallback)).onSearchSubmitted(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.car.app.model.SearchCallbackDelegate
    public void sendSearchTextChanged(String str, OnDoneCallback onDoneCallback) {
        try {
            ((ISearchCallback) Objects.requireNonNull(this.mStubCallback)).onSearchTextChanged(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
