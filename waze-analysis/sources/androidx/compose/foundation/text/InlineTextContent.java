package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.Placeholder;
import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final q<String, Composer, Integer, ab> children;
    private final Placeholder placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(Placeholder placeholder, q<? super String, ? super Composer, ? super Integer, ab> qVar) {
        this.placeholder = placeholder;
        this.children = qVar;
    }

    public final q<String, Composer, Integer, ab> getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
