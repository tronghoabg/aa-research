package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ClipboardManager {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.ClipboardManager$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static ClipEntry $default$getClip(ClipboardManager clipboardManager) {
            return null;
        }

        public static android.content.ClipboardManager $default$getNativeClipboard(ClipboardManager clipboardManager) {
            throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
        }

        public static boolean $default$hasText(ClipboardManager clipboardManager) {
            AnnotatedString text = clipboardManager.getText();
            return text != null && text.length() > 0;
        }

        public static void $default$setClip(ClipboardManager clipboardManager, ClipEntry clipEntry) {
        }
    }

    ClipEntry getClip();

    android.content.ClipboardManager getNativeClipboard();

    AnnotatedString getText();

    boolean hasText();

    void setClip(ClipEntry clipEntry);

    void setText(AnnotatedString annotatedString);
}
