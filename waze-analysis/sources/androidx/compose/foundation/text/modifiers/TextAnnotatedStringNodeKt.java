package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.AnnotatedString;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextAnnotatedStringNodeKt {
    public static final boolean hasLinks(AnnotatedString annotatedString) {
        return annotatedString.hasLinkAnnotations(0, annotatedString.length());
    }
}
