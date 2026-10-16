package androidx.autofill.inline.common;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.net.Uri;
import androidx.autofill.inline.UiVersions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class SlicedContent implements UiVersions.Content {
    static final Uri INLINE_SLICE_URI = Uri.parse("inline.slice");
    protected final Slice mSlice;

    /* compiled from: WazeSource */
    public abstract class Builder<T extends SlicedContent> {
        protected final Slice.Builder mSliceBuilder;

        protected Builder(String str) {
            this.mSliceBuilder = new Slice.Builder(SlicedContent.INLINE_SLICE_URI, new SliceSpec(str, 1));
        }

        public abstract T build();
    }

    protected SlicedContent(Slice slice) {
        this.mSlice = slice;
    }

    public static String getVersion(Slice slice) {
        return slice.getSpec().getType();
    }

    public abstract PendingIntent getAttributionIntent();

    @Override // androidx.autofill.inline.UiVersions.Content
    public final Slice getSlice() {
        return this.mSlice;
    }

    public abstract boolean isValid();
}
