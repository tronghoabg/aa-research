package androidx.credentials;

import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PrepareGetCredentialResponse {
    private final l<String, Boolean> credentialTypeDelegate;
    private final a<Boolean> hasAuthResultsDelegate;
    private final a<Boolean> hasRemoteResultsDelegate;
    private final boolean isNullHandlesForTest;
    private final PendingGetCredentialHandle pendingGetCredentialHandle;

    /* compiled from: WazeSource */
    public final class Builder {
        private android.credentials.PrepareGetCredentialResponse frameworkResponse;
        private a<Boolean> hasAuthResultsDelegate;
        private l<? super String, Boolean> hasCredentialResultsDelegate;
        private a<Boolean> hasRemoteResultsDelegate;
        private PendingGetCredentialHandle pendingGetCredentialHandle;

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasAuthenticationResults() {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            x.c(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasAuthenticationResults();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasCredentialType(String str) {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            x.c(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasCredentialResults(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasRemoteResults() {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            x.c(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasRemoteResults();
        }

        public final PrepareGetCredentialResponse build() {
            return new PrepareGetCredentialResponse(this.pendingGetCredentialHandle, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, false, null);
        }

        public final Builder setFrameworkResponse(android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse) {
            this.frameworkResponse = prepareGetCredentialResponse;
            if (prepareGetCredentialResponse != null) {
                this.hasCredentialResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(this);
                this.hasAuthResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(this);
                this.hasRemoteResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$3(this);
            }
            return this;
        }

        public final Builder setPendingGetCredentialHandle(PendingGetCredentialHandle pendingGetCredentialHandle) {
            x.f(pendingGetCredentialHandle, "handle");
            this.pendingGetCredentialHandle = pendingGetCredentialHandle;
            return this;
        }
    }

    /* compiled from: WazeSource */
    public final class PendingGetCredentialHandle {
        private final PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle;

        public PendingGetCredentialHandle(PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.frameworkHandle = pendingGetCredentialHandle;
            if (Build.VERSION.SDK_INT >= 34) {
                x.c(pendingGetCredentialHandle);
            }
        }

        public final PrepareGetCredentialResponse.PendingGetCredentialHandle getFrameworkHandle() {
            return this.frameworkHandle;
        }
    }

    /* compiled from: WazeSource */
    public final class TestBuilder {
        private a<Boolean> hasAuthResultsDelegate;
        private l<? super String, Boolean> hasCredentialResultsDelegate;
        private a<Boolean> hasRemoteResultsDelegate;

        public final PrepareGetCredentialResponse build() {
            return new PrepareGetCredentialResponse(null, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, true, null);
        }

        public final TestBuilder setCredentialTypeDelegate(l<? super String, Boolean> lVar) {
            x.f(lVar, "handler");
            this.hasCredentialResultsDelegate = lVar;
            return this;
        }

        public final TestBuilder setHasAuthResultsDelegate(a<Boolean> aVar) {
            x.f(aVar, "handler");
            this.hasAuthResultsDelegate = aVar;
            return this;
        }

        public final TestBuilder setHasRemoteResultsDelegate(a<Boolean> aVar) {
            x.f(aVar, "handler");
            this.hasRemoteResultsDelegate = aVar;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, a<Boolean> aVar, a<Boolean> aVar2, l<? super String, Boolean> lVar, boolean z) {
        this.pendingGetCredentialHandle = pendingGetCredentialHandle;
        this.hasRemoteResultsDelegate = aVar;
        this.hasAuthResultsDelegate = aVar2;
        this.credentialTypeDelegate = lVar;
        this.isNullHandlesForTest = z;
        if (Build.VERSION.SDK_INT < 34 || z) {
            return;
        }
        x.c(pendingGetCredentialHandle);
    }

    public final l<String, Boolean> getCredentialTypeDelegate() {
        return this.credentialTypeDelegate;
    }

    public final a<Boolean> getHasAuthResultsDelegate() {
        return this.hasAuthResultsDelegate;
    }

    public final a<Boolean> getHasRemoteResultsDelegate() {
        return this.hasRemoteResultsDelegate;
    }

    public final PendingGetCredentialHandle getPendingGetCredentialHandle() {
        return this.pendingGetCredentialHandle;
    }

    public final boolean hasAuthenticationResults() {
        a<Boolean> aVar = this.hasAuthResultsDelegate;
        if (aVar != null) {
            return aVar.invoke().booleanValue();
        }
        return false;
    }

    public final boolean hasCredentialResults(String str) {
        x.f(str, "credentialType");
        l<String, Boolean> lVar = this.credentialTypeDelegate;
        if (lVar != null) {
            return lVar.invoke(str).booleanValue();
        }
        return false;
    }

    public final boolean hasRemoteResults() {
        a<Boolean> aVar = this.hasRemoteResultsDelegate;
        if (aVar != null) {
            return aVar.invoke().booleanValue();
        }
        return false;
    }

    public final boolean isNullHandlesForTest() {
        return this.isNullHandlesForTest;
    }

    public /* synthetic */ PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, a aVar, a aVar2, l lVar, boolean z, o oVar) {
        this(pendingGetCredentialHandle, aVar, aVar2, lVar, z);
    }
}
