package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import androidx.car.app.utils.RemoteUtils$1;
import defpackage.qu;
import defpackage.rb;
import defpackage.tr;
import defpackage.vi;
import defpackage.vm;
import defpackage.xr;
import defpackage.xy;

@rb
/* loaded from: classes2.dex */
public class SearchCallbackDelegateImpl implements vi {
    private final ISearchCallback mStubCallback;

    @rb
    public static class SearchCallbackStub extends ISearchCallback.Stub {
        private final vm mCallback;

        public SearchCallbackStub(vm vmVar) {
            this.mCallback = vmVar;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onSearchSubmitted$1$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m153x5bd43f40(String str) throws xr {
            this.mCallback.a(str);
            return null;
        }

        /* renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ Object m154xa7c97055(String str) throws xr {
            this.mCallback.b(str);
            return null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onSearchSubmitted", new xy() { // from class: vj
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m153x5bd43f40(str);
                }
            });
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            tr.b(iOnDoneCallback, "onSearchTextChanged", new xy() { // from class: vk
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m154xa7c97055(str);
                }
            });
        }
    }

    private SearchCallbackDelegateImpl(vm vmVar) {
        this.mStubCallback = new SearchCallbackStub(vmVar);
    }

    public static vi create(vm vmVar) {
        return new SearchCallbackDelegateImpl(vmVar);
    }

    @Override // defpackage.vi
    public void sendSearchSubmitted(String str, qu quVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchSubmitted(str, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.vi
    public void sendSearchTextChanged(String str, qu quVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            iSearchCallback.getClass();
            iSearchCallback.onSearchTextChanged(str, new RemoteUtils$1(quVar));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
