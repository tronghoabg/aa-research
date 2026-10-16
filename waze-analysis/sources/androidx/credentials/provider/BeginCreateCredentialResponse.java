package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginCreateCredentialResponse {
    public static final Companion Companion = new Companion(null);
    private final List<CreateEntry> createEntries;
    private final RemoteEntry remoteEntry;

    /* compiled from: WazeSource */
    final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialResponse beginCreateCredentialResponse) {
            x.f(bundle, "bundle");
            x.f(beginCreateCredentialResponse, "response");
            CreateEntry.Companion.marshall(beginCreateCredentialResponse.getCreateEntries(), bundle);
            RemoteEntry remoteEntry = beginCreateCredentialResponse.getRemoteEntry();
            if (remoteEntry != null) {
                RemoteEntry.Companion.marshall$credentials(remoteEntry, bundle);
            }
        }

        public static final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            List<CreateEntry> listUnmarshallCreateEntries = CreateEntry.Companion.unmarshallCreateEntries(bundle);
            RemoteEntry remoteEntryUnmarshallRemoteEntry$credentials = RemoteEntry.Companion.unmarshallRemoteEntry$credentials(bundle);
            if (listUnmarshallCreateEntries.isEmpty() && remoteEntryUnmarshallRemoteEntry$credentials == null) {
                return null;
            }
            return new BeginCreateCredentialResponse(listUnmarshallCreateEntries, remoteEntryUnmarshallRemoteEntry$credentials);
        }
    }

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialResponse";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialResponse beginCreateCredentialResponse) {
            x.f(bundle, "bundle");
            x.f(beginCreateCredentialResponse, "response");
            bundle.putParcelable(REQUEST_KEY, BeginCreateCredentialUtil.Companion.convertToFrameworkResponse(beginCreateCredentialResponse));
        }

        public static final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            android.service.credentials.BeginCreateCredentialResponse beginCreateCredentialResponse = (android.service.credentials.BeginCreateCredentialResponse) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginCreateCredentialResponse.class);
            if (beginCreateCredentialResponse != null) {
                return BeginCreateCredentialUtil.Companion.convertToJetpackResponse(beginCreateCredentialResponse);
            }
            return null;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private List<CreateEntry> createEntries = new ArrayList();
        private RemoteEntry remoteEntry;

        public final Builder addCreateEntry(CreateEntry createEntry) {
            x.f(createEntry, "createEntry");
            this.createEntries.add(createEntry);
            return this;
        }

        public final BeginCreateCredentialResponse build() {
            return new BeginCreateCredentialResponse(i.ao(this.createEntries), this.remoteEntry);
        }

        public final Builder setCreateEntries(List<CreateEntry> list) {
            x.f(list, "createEntries");
            this.createEntries = i.aq(list);
            return this;
        }

        public final Builder setRemoteEntry(RemoteEntry remoteEntry) {
            this.remoteEntry = remoteEntry;
            return this;
        }
    }

    public /* synthetic */ BeginCreateCredentialResponse(List list, RemoteEntry remoteEntry, int i2, o oVar) {
        this((i2 & 1) != 0 ? i.h() : list, (i2 & 2) != 0 ? null : remoteEntry);
    }

    public static final Bundle asBundle(BeginCreateCredentialResponse beginCreateCredentialResponse) {
        return Companion.asBundle(beginCreateCredentialResponse);
    }

    public static final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final List<CreateEntry> getCreateEntries() {
        return this.createEntries;
    }

    public final RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Bundle asBundle(BeginCreateCredentialResponse beginCreateCredentialResponse) {
            x.f(beginCreateCredentialResponse, "response");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginCreateCredentialResponse);
                return bundle;
            }
            Api23Impl.asBundle(bundle, beginCreateCredentialResponse);
            return bundle;
        }

        public final BeginCreateCredentialResponse fromBundle(Bundle bundle) {
            x.f(bundle, "bundle");
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api23Impl.fromBundle(bundle);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public BeginCreateCredentialResponse(List<CreateEntry> list, RemoteEntry remoteEntry) {
        x.f(list, "createEntries");
        this.createEntries = list;
        this.remoteEntry = remoteEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginCreateCredentialResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
