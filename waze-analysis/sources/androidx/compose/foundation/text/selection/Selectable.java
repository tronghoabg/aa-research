package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Selectable {
    void appendSelectableInfoToBuilder(SelectionLayoutBuilder selectionLayoutBuilder);

    Rect getBoundingBox(int i2);

    float getCenterYForOffset(int i2);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo3845getHandlePositiondBAh8RU(Selection selection, boolean z);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    float getLineHeight(int i2);

    float getLineLeft(int i2);

    float getLineRight(int i2);

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo3846getRangeOfLineContainingjx7JFs(int i2);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();

    TextLayoutResult textLayoutResult();
}
