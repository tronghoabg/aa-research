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
import com.waze.gas.GasNativeManager;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AuthenticationAction {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.AUTH_ACTION_PENDING_INTENT_";
    private static final String EXTRA_AUTH_ACTION_SIZE = "androidx.credentials.provider.extra.AUTH_ACTION_SIZE";
    private static final String EXTRA_AUTH_ACTION_TITLE_PREFIX = "androidx.credentials.provider.extra.AUTH_ACTION_TITLE_";
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.authenticationAction.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_HINT_TITLE = "androidx.credentials.provider.authenticationAction.SLICE_HINT_TITLE";
    private static final int SLICE_SPEC_REVISION = 0;
    private static final String SLICE_SPEC_TYPE = "AuthenticationAction";
    private static final String TAG = "AuthenticationAction";
    private final PendingIntent pendingIntent;
    private final CharSequence title;

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final AuthenticationAction fromAction(android.service.credentials.Action action) {
            x.f(action, "authenticationAction");
            Slice slice = action.getSlice();
            x.e(slice, "getSlice(...)");
            return AuthenticationAction.Companion.fromSlice(slice);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final PendingIntent pendingIntent;
        private final CharSequence title;

        public Builder(CharSequence charSequence, PendingIntent pendingIntent) {
            x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
            x.f(pendingIntent, "pendingIntent");
            this.title = charSequence;
            this.pendingIntent = pendingIntent;
        }

        public final AuthenticationAction build() {
            return new AuthenticationAction(this.title, this.pendingIntent);
        }
    }

    public AuthenticationAction(CharSequence charSequence, PendingIntent pendingIntent) {
        x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(pendingIntent, "pendingIntent");
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    public static final AuthenticationAction fromAction(android.service.credentials.Action action) {
        return Companion.fromAction(action);
    }

    public static final AuthenticationAction fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(AuthenticationAction authenticationAction) {
        return Companion.toSlice(authenticationAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationAction)) {
            return false;
        }
        AuthenticationAction authenticationAction = (AuthenticationAction) obj;
        return x.n(this.title, authenticationAction.title) && x.n(this.pendingIntent, authenticationAction.pendingIntent);
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.pendingIntent.hashCode();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final AuthenticationAction fromAction(android.service.credentials.Action action) {
            x.f(action, "authenticationAction");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromAction(action);
            }
            return null;
        }

        public final AuthenticationAction fromSlice(Slice slice) {
            x.f(slice, "slice");
            List items = slice.getItems();
            x.e(items, "getItems(...)");
            Iterator it = items.iterator();
            CharSequence text = null;
            PendingIntent action = null;
            while (it.hasNext()) {
                SliceItem sliceItemM94m = be$$ExternalSyntheticApiModelOutline0.m94m(it.next());
                if (sliceItemM94m.hasHint(AuthenticationAction.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItemM94m.getAction();
                } else if (sliceItemM94m.hasHint(AuthenticationAction.SLICE_HINT_TITLE)) {
                    text = sliceItemM94m.getText();
                }
            }
            try {
                x.c(text);
                x.c(action);
                return new AuthenticationAction(text, action);
            } catch (Exception e2) {
                Log.i("AuthenticationAction", "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public final void marshall$credentials(List<AuthenticationAction> list, Bundle bundle) {
            x.f(list, "<this>");
            x.f(bundle, "bundle");
            bundle.putInt(AuthenticationAction.EXTRA_AUTH_ACTION_SIZE, list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                bundle.putParcelable(a.a(i2, AuthenticationAction.EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX), list.get(i2).getPendingIntent());
                bundle.putCharSequence(a.a(i2, AuthenticationAction.EXTRA_AUTH_ACTION_TITLE_PREFIX), list.get(i2).getTitle());
            }
        }

        public final Slice toSlice(AuthenticationAction authenticationAction) {
            x.f(authenticationAction, "authenticationAction");
            CharSequence title = authenticationAction.getTitle();
            PendingIntent pendingIntent = authenticationAction.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("AuthenticationAction", 0));
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(AuthenticationAction.SLICE_HINT_PENDING_INTENT)).build(), null).addText(title, null, i.d(AuthenticationAction.SLICE_HINT_TITLE));
            Slice sliceBuild = builder.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final List<AuthenticationAction> unmarshallAuthActionList$credentials(Bundle bundle) {
            x.f(bundle, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = bundle.getInt(AuthenticationAction.EXTRA_AUTH_ACTION_SIZE, 0);
            for (int i3 = 0; i3 < i2; i3++) {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(a.a(i3, AuthenticationAction.EXTRA_AUTH_ACTION_PENDING_INTENT_PREFIX));
                CharSequence charSequence = bundle.getCharSequence(a.a(i3, AuthenticationAction.EXTRA_AUTH_ACTION_TITLE_PREFIX));
                if (pendingIntent == null || charSequence == null) {
                    return i.h();
                }
                arrayList.add(new AuthenticationAction(charSequence, pendingIntent));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
