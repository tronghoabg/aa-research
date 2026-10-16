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
public final class Action {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_ACTION_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.ACTION_PENDING_INTENT_";
    private static final String EXTRA_ACTION_SIZE = "androidx.credentials.provider.extra.ACTION_SIZE";
    private static final String EXTRA_ACTION_SUBTITLE_PREFIX = "androidx.credentials.provider.extra.ACTION_SUBTITLE_";
    private static final String EXTRA_ACTION_TITLE_PREFIX = "androidx.credentials.provider.extra.ACTION_TITLE_";
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_HINT_SUBTITLE = "androidx.credentials.provider.action.HINT_ACTION_SUBTEXT";
    private static final String SLICE_HINT_TITLE = "androidx.credentials.provider.action.HINT_ACTION_TITLE";
    private static final int SLICE_SPEC_REVISION = 0;
    private static final String SLICE_SPEC_TYPE = "Action";
    private static final String TAG = "Action";
    private final PendingIntent pendingIntent;
    private final CharSequence subtitle;
    private final CharSequence title;

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final Action fromAction(android.service.credentials.Action action) {
            x.f(action, "action");
            Slice slice = action.getSlice();
            x.e(slice, "getSlice(...)");
            return Action.Companion.fromSlice(slice);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final PendingIntent pendingIntent;
        private CharSequence subtitle;
        private final CharSequence title;

        public Builder(CharSequence charSequence, PendingIntent pendingIntent) {
            x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
            x.f(pendingIntent, "pendingIntent");
            this.title = charSequence;
            this.pendingIntent = pendingIntent;
        }

        public final Action build() {
            return new Action(this.title, this.pendingIntent, this.subtitle);
        }

        public final Builder setSubtitle(CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }
    }

    public Action(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2) {
        x.f(charSequence, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(pendingIntent, "pendingIntent");
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        this.subtitle = charSequence2;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("title must not be empty");
        }
    }

    public static final Action fromAction(android.service.credentials.Action action) {
        return Companion.fromAction(action);
    }

    public static final Action fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(Action action) {
        return Companion.toSlice(action);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return x.n(this.title, action.title) && x.n(this.pendingIntent, action.pendingIntent) && x.n(this.subtitle, action.subtitle);
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.title.hashCode() * 31) + this.pendingIntent.hashCode();
        CharSequence charSequence = this.subtitle;
        return (iHashCode * 31) + (charSequence != null ? charSequence.hashCode() : 0);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Action fromAction(android.service.credentials.Action action) {
            x.f(action, "action");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromAction(action);
            }
            return null;
        }

        public final Action fromSlice(Slice slice) {
            x.f(slice, "slice");
            List items = slice.getItems();
            x.e(items, "getItems(...)");
            Iterator it = items.iterator();
            CharSequence text = "";
            PendingIntent action = null;
            CharSequence text2 = null;
            while (it.hasNext()) {
                SliceItem sliceItemM94m = be$$ExternalSyntheticApiModelOutline0.m94m(it.next());
                if (sliceItemM94m.hasHint(Action.SLICE_HINT_TITLE)) {
                    text = sliceItemM94m.getText();
                    x.e(text, "getText(...)");
                } else if (sliceItemM94m.hasHint(Action.SLICE_HINT_SUBTITLE)) {
                    text2 = sliceItemM94m.getText();
                } else if (sliceItemM94m.hasHint(Action.SLICE_HINT_PENDING_INTENT)) {
                    action = sliceItemM94m.getAction();
                }
            }
            try {
                CharSequence charSequence = text;
                x.c(action);
                return new Action(text, action, text2);
            } catch (Exception e2) {
                Log.i("Action", "fromSlice failed with: ".concat(String.valueOf(e2.getMessage())));
                return null;
            }
        }

        public final void marshall$credentials(List<Action> list, Bundle bundle) {
            x.f(list, "<this>");
            x.f(bundle, "bundle");
            bundle.putInt(Action.EXTRA_ACTION_SIZE, list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                bundle.putParcelable(a.a(i2, Action.EXTRA_ACTION_PENDING_INTENT_PREFIX), list.get(i2).getPendingIntent());
                bundle.putCharSequence(a.a(i2, Action.EXTRA_ACTION_TITLE_PREFIX), list.get(i2).getTitle());
                bundle.putCharSequence(a.a(i2, Action.EXTRA_ACTION_SUBTITLE_PREFIX), list.get(i2).getSubtitle());
            }
        }

        public final Slice toSlice(Action action) {
            x.f(action, "action");
            CharSequence title = action.getTitle();
            CharSequence subtitle = action.getSubtitle();
            PendingIntent pendingIntent = action.getPendingIntent();
            Slice.Builder builderAddText = new Slice.Builder(Uri.EMPTY, new SliceSpec("Action", 0)).addText(title, null, i.d(Action.SLICE_HINT_TITLE)).addText(subtitle, null, i.d(Action.SLICE_HINT_SUBTITLE));
            builderAddText.addAction(pendingIntent, new Slice.Builder(builderAddText).addHints(Collections.singletonList(Action.SLICE_HINT_PENDING_INTENT)).build(), null);
            Slice sliceBuild = builderAddText.build();
            x.e(sliceBuild, "build(...)");
            return sliceBuild;
        }

        public final List<Action> unmarshallActionList$credentials(Bundle bundle) {
            x.f(bundle, "<this>");
            ArrayList arrayList = new ArrayList();
            int i2 = bundle.getInt(Action.EXTRA_ACTION_SIZE, 0);
            for (int i3 = 0; i3 < i2; i3++) {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(a.a(i3, Action.EXTRA_ACTION_PENDING_INTENT_PREFIX));
                CharSequence charSequence = bundle.getCharSequence(a.a(i3, Action.EXTRA_ACTION_TITLE_PREFIX));
                CharSequence charSequence2 = bundle.getCharSequence(a.a(i3, Action.EXTRA_ACTION_SUBTITLE_PREFIX));
                if (pendingIntent == null || charSequence == null) {
                    return i.h();
                }
                arrayList.add(new Action(charSequence, pendingIntent, charSequence2));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ Action(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, int i2, o oVar) {
        this(charSequence, pendingIntent, (i2 & 4) != 0 ? null : charSequence2);
    }
}
