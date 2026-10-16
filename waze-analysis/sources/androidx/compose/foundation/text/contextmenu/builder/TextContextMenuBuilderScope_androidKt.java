package androidx.compose.foundation.text.contextmenu.builder;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuBuilderScope_androidKt {
    public static final void item(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, String str, int i2, l<? super TextContextMenuSession, ab> lVar) {
        textContextMenuBuilderScope.addComponent$foundation(new TextContextMenuItem(obj, str, i2, lVar));
    }

    public static /* synthetic */ void item$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, String str, int i2, l lVar, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        item(textContextMenuBuilderScope, obj, str, i2, lVar);
    }

    public static final void textClassificationItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, TextClassification textClassification, int i2, Drawable drawable) {
        textContextMenuBuilderScope.addComponent$foundation(new TextContextMenuTextClassificationItem(obj, textClassification, i2, drawable));
    }

    public static /* synthetic */ void textClassificationItem$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Object obj, TextClassification textClassification, int i2, Drawable drawable, int i3, Object obj2) {
        if ((i3 & 8) != 0) {
            drawable = null;
        }
        textClassificationItem(textContextMenuBuilderScope, obj, textClassification, i2, drawable);
    }
}
