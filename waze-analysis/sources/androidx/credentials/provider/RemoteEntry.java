package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0;
import android.util.Log;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RemoteEntry {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_REMOTE_ENTRY_PENDING_INTENT = "androidx.credentials.provider.extra.REMOTE_ENTRY_PENDING_INTENT";
    private static final int REVISION_ID = 1;
    private static final String SLICE_HINT_IS_AUTO_SELECT = "androidx.credentials.provider.remoteEntry.SLICE_HINT_IS_AUTO_SELECT";
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_SPEC_TYPE = "RemoteEntry";
    private static final String TAG = "RemoteEntry";
    private boolean isAutoSelect;
    private final PendingIntent pendingIntent;

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
            x.f(remoteEntry, "remoteEntry");
            Slice slice = remoteEntry.getSlice();
            x.e(slice, "getSlice(...)");
            return RemoteEntry.Companion.fromSlice(slice);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final PendingIntent pendingIntent;

        public Builder(PendingIntent pendingIntent) {
            x.f(pendingIntent, "pendingIntent");
            this.pendingIntent = pendingIntent;
        }

        public final RemoteEntry build() {
            return new RemoteEntry(this.pendingIntent);
        }
    }

    public RemoteEntry(PendingIntent pendingIntent) {
        x.f(pendingIntent, "pendingIntent");
        this.pendingIntent = pendingIntent;
    }

    public static final RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
        return Companion.fromRemoteEntry(remoteEntry);
    }

    public static final RemoteEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(RemoteEntry remoteEntry) {
        return Companion.toSlice(remoteEntry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteEntry) {
            return x.n(this.pendingIntent, ((RemoteEntry) obj).pendingIntent);
        }
        return false;
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public int hashCode() {
        return this.pendingIntent.hashCode();
    }

    public final boolean isAutoSelect() {
        return this.isAutoSelect;
    }

    public final void setAutoSelect(boolean z) {
        this.isAutoSelect = z;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final RemoteEntry fromRemoteEntry(android.service.credentials.RemoteEntry remoteEntry) {
            x.f(remoteEntry, "remoteEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromRemoteEntry(remoteEntry);
            }
            return null;
        }

        public final RemoteEntry fromSlice(Slice slice) {
            x.f(slice, "slice");
            List items = slice.getItems();
            x.e(items, "getItems(...)");
            Iterator it = items.iterator();
            boolean z = false;
            PendingIntent action = null;
            while (it.hasNext()) {
                SliceItem sliceItemM94m = be$$ExternalSyntheticApiModelOutline0.m94m(it.next());
                if (sliceItemM94m.hasHint(RemoteEntry.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItemM94m.getAction();
                } else if (sliceItemM94m.hasHint(RemoteEntry.SLICE_HINT_IS_AUTO_SELECT)) {
                    z = true;
                }
            }
            try {
                x.c(action);
                return new RemoteEntry(action, z);
            } catch (Exception e2) {
                Log.i("RemoteEntry", "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public final void marshall$credentials(RemoteEntry remoteEntry, Bundle bundle) {
            x.f(remoteEntry, "<this>");
            x.f(bundle, "bundle");
            bundle.putParcelable(RemoteEntry.EXTRA_REMOTE_ENTRY_PENDING_INTENT, remoteEntry.getPendingIntent());
        }

        public final Slice toSlice(RemoteEntry remoteEntry) {
            x.f(remoteEntry, "remoteEntry");
            PendingIntent pendingIntent = remoteEntry.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("RemoteEntry", 1));
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(RemoteEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
            if (remoteEntry.isAutoSelect()) {
                builder.addInt(1, null, i.d(RemoteEntry.SLICE_HINT_IS_AUTO_SELECT));
            }
            Slice sliceBuild = builder.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final RemoteEntry unmarshallRemoteEntry$credentials(Bundle bundle) {
            x.f(bundle, "<this>");
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(RemoteEntry.EXTRA_REMOTE_ENTRY_PENDING_INTENT);
            if (pendingIntent == null) {
                return null;
            }
            return new RemoteEntry(pendingIntent);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteEntry(PendingIntent pendingIntent, boolean z) {
        this(pendingIntent);
        x.f(pendingIntent, "pendingIntent");
        this.isAutoSelect = z;
    }
}
