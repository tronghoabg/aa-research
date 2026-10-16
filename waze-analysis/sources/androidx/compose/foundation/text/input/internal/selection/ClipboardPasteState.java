package androidx.compose.foundation.text.input.internal.selection;

import android.content.ClipDescription;
import androidx.compose.ui.platform.Clipboard;
import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ClipboardPasteState {
    public static final int $stable = 8;
    private boolean _hasClip;
    private boolean _hasText;
    private final Clipboard clipboard;

    public ClipboardPasteState(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final boolean getHasClip() {
        return this._hasClip;
    }

    public final boolean getHasText() {
        return this._hasText;
    }

    public final Object update(e<? super ab> eVar) {
        ClipDescription primaryClipDescription;
        boolean zHasPrimaryClip = this.clipboard.getNativeClipboard().hasPrimaryClip();
        this._hasClip = zHasPrimaryClip;
        boolean z = false;
        if (zHasPrimaryClip && (primaryClipDescription = this.clipboard.getNativeClipboard().getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        this._hasText = z;
        return ab.f48028a;
    }
}
