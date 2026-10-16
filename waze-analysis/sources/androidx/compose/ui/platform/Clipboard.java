package androidx.compose.ui.platform;

import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Clipboard {
    Object getClipEntry(e<? super ClipEntry> eVar);

    android.content.ClipboardManager getNativeClipboard();

    Object setClipEntry(ClipEntry clipEntry, e<? super ab> eVar);
}
