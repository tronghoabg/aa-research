package androidx.compose.foundation.text.contextmenu.data;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuTextClassificationItem extends TextContextMenuComponent {
    public static final int $stable = 8;
    private final Drawable icon;
    private final int index;
    private final TextClassification textClassification;

    public TextContextMenuTextClassificationItem(Object obj, TextClassification textClassification, int i2, Drawable drawable) {
        super(obj);
        this.textClassification = textClassification;
        this.index = i2;
        this.icon = drawable;
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final int getIndex() {
        return this.index;
    }

    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public String toString() {
        return "TextContextMenuTextClassificationItem(key=" + getKey() + ", textClassification=" + this.textClassification + ", index=" + this.index + ", icon=" + this.icon + ')';
    }

    public /* synthetic */ TextContextMenuTextClassificationItem(Object obj, TextClassification textClassification, int i2, Drawable drawable, int i3, o oVar) {
        this(obj, textClassification, i2, (i3 & 8) != 0 ? null : drawable);
    }
}
