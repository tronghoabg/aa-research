package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginGetCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private final List<Action> actions;
    private final List<AuthenticationAction> authenticationActions;
    private final List<CredentialEntry> credentialEntries;
    private final RemoteEntry remoteEntry;

    /* compiled from: WazeSource */
    final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialResponse beginGetCredentialResponse) {
            x.f(bundle, "bundle");
            x.f(beginGetCredentialResponse, "response");
            CredentialEntry.Companion.marshall(beginGetCredentialResponse.getCredentialEntries(), bundle);
            Action.Companion.marshall$credentials(beginGetCredentialResponse.getActions(), bundle);
            AuthenticationAction.Companion.marshall$credentials(beginGetCredentialResponse.getAuthenticationActions(), bundle);
            RemoteEntry remoteEntry = beginGetCredentialResponse.getRemoteEntry();
            if (remoteEntry != null) {
                RemoteEntry.Companion.marshall$credentials(remoteEntry, bundle);
            }
        }

        public static final BeginGetCredentialResponse fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            List<CredentialEntry> listUnmarshallCredentialEntries = CredentialEntry.Companion.unmarshallCredentialEntries(bundle);
            List<Action> listUnmarshallActionList$credentials = Action.Companion.unmarshallActionList$credentials(bundle);
            List<AuthenticationAction> listUnmarshallAuthActionList$credentials = AuthenticationAction.Companion.unmarshallAuthActionList$credentials(bundle);
            RemoteEntry remoteEntryUnmarshallRemoteEntry$credentials = RemoteEntry.Companion.unmarshallRemoteEntry$credentials(bundle);
            if (listUnmarshallCredentialEntries.isEmpty() && listUnmarshallActionList$credentials.isEmpty() && listUnmarshallAuthActionList$credentials.isEmpty() && remoteEntryUnmarshallRemoteEntry$credentials == null) {
                return null;
            }
            return new BeginGetCredentialResponse(listUnmarshallCredentialEntries, listUnmarshallActionList$credentials, listUnmarshallAuthActionList$credentials, remoteEntryUnmarshallRemoteEntry$credentials);
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialResponse";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialResponse beginGetCredentialResponse) {
            x.f(bundle, "bundle");
            x.f(beginGetCredentialResponse, "response");
            bundle.putParcelable(REQUEST_KEY, BeginGetCredentialUtil.Companion.convertToFrameworkResponse(beginGetCredentialResponse));
        }

        public static final BeginGetCredentialResponse fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponse = (android.service.credentials.BeginGetCredentialResponse) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse != null) {
                return BeginGetCredentialUtil.Companion.convertToJetpackResponse(beginGetCredentialResponse);
            }
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private RemoteEntry remoteEntry;
        private List<CredentialEntry> credentialEntries = new ArrayList();
        private List<Action> actions = new ArrayList();
        private List<AuthenticationAction> authenticationActions = new ArrayList();

        public final Builder addAction(Action action) {
            x.f(action, "action");
            this.actions.add(action);
            return this;
        }

        public final Builder addAuthenticationAction(AuthenticationAction authenticationAction) {
            x.f(authenticationAction, "authenticationAction");
            this.authenticationActions.add(authenticationAction);
            return this;
        }

        public final Builder addCredentialEntry(CredentialEntry credentialEntry) {
            x.f(credentialEntry, "entry");
            this.credentialEntries.add(credentialEntry);
            return this;
        }

        public final BeginGetCredentialResponse build() {
            return new BeginGetCredentialResponse(i.ao(this.credentialEntries), i.ao(this.actions), i.ao(this.authenticationActions), this.remoteEntry);
        }

        public final Builder setActions(List<Action> list) {
            x.f(list, "actions");
            this.actions = i.aq(list);
            return this;
        }

        public final Builder setAuthenticationActions(List<AuthenticationAction> list) {
            x.f(list, "authenticationEntries");
            this.authenticationActions = i.aq(list);
            return this;
        }

        public final Builder setCredentialEntries(List<? extends CredentialEntry> list) {
            x.f(list, "entries");
            this.credentialEntries = i.aq(list);
            return this;
        }

        public final Builder setRemoteEntry(RemoteEntry remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    public /* synthetic */ BeginGetCredentialResponse(List list, List list2, List list3, RemoteEntry remoteEntry, int i2, o oVar) {
        this((i2 & 1) != 0 ? i.h() : list, (i2 & 2) != 0 ? i.h() : list2, (i2 & 4) != 0 ? i.h() : list3, (i2 & 8) != 0 ? null : remoteEntry);
    }

    public static final Bundle asBundle(BeginGetCredentialResponse beginGetCredentialResponse) {
        return Companion.asBundle(beginGetCredentialResponse);
    }

    public static final BeginGetCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final List<Action> getActions() {
        return this.actions;
    }

    public final List<AuthenticationAction> getAuthenticationActions() {
        return this.authenticationActions;
    }

    public final List<CredentialEntry> getCredentialEntries() {
        return this.credentialEntries;
    }

    public final RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(BeginGetCredentialResponse beginGetCredentialResponse) {
            x.f(beginGetCredentialResponse, "response");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginGetCredentialResponse);
                return bundle;
            }
            Api23Impl.asBundle(bundle, beginGetCredentialResponse);
            return bundle;
        }

        public final BeginGetCredentialResponse fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api23Impl.fromBundle(bundle);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialResponse(List<? extends CredentialEntry> list, List<Action> list2, List<AuthenticationAction> list3, RemoteEntry remoteEntry) {
        x.f(list, "credentialEntries");
        x.f(list2, "actions");
        x.f(list3, "authenticationActions");
        this.credentialEntries = list;
        this.actions = list2;
        this.authenticationActions = list3;
        this.remoteEntry = remoteEntry;
    }

    public BeginGetCredentialResponse() {
        this(null, null, null, null, 15, null);
    }
}
