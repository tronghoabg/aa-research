package androidx.compose.foundation.text.contextmenu.builder;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuBuilderScope {
    public static final int $stable = 8;
    private final MutableObjectList<TextContextMenuComponent> components;
    private final MutableObjectList<l<TextContextMenuComponent, Boolean>> filters;

    public TextContextMenuBuilderScope() {
        int i2 = 0;
        int i3 = 1;
        o oVar = null;
        this.components = new MutableObjectList<>(i2, i3, oVar);
        this.filters = new MutableObjectList<>(i2, i3, oVar);
    }

    public final void addComponent$foundation(TextContextMenuComponent textContextMenuComponent) {
        this.components.add(textContextMenuComponent);
    }

    public final void addFilter$foundation(l<? super TextContextMenuComponent, Boolean> lVar) {
        this.filters.add(lVar);
    }

    public final TextContextMenuData build$foundation() {
        boolean z;
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, false ? 1 : 0);
        MutableObjectList<TextContextMenuComponent> mutableObjectList2 = this.components;
        Object[] objArr = mutableObjectList2.content;
        int i2 = mutableObjectList2._size;
        int i3 = 0;
        boolean z2 = true;
        TextContextMenuComponent textContextMenuComponent = null;
        while (i3 < i2) {
            TextContextMenuComponent textContextMenuComponent2 = (TextContextMenuComponent) objArr[i3];
            if (z2 && textContextMenuComponent2 == TextContextMenuSeparator.INSTANCE) {
                z = true;
            } else {
                if (TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2) && TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent)) {
                    z = false;
                    break;
                    break;
                }
                if (!TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2)) {
                    MutableObjectList<l<TextContextMenuComponent, Boolean>> mutableObjectList3 = this.filters;
                    Object[] objArr2 = mutableObjectList3.content;
                    int i4 = mutableObjectList3._size;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (!((Boolean) ((l) objArr2[i5]).invoke(textContextMenuComponent2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                mutableObjectList.add(textContextMenuComponent2);
                z = false;
                textContextMenuComponent = textContextMenuComponent2;
            }
            i3++;
            z2 = z;
        }
        MutableObjectList mutableObjectList4 = mutableObjectList;
        if (TextContextMenuBuilderScopeKt.isSeparator((TextContextMenuComponent) (mutableObjectList4.isEmpty() ? null : mutableObjectList4.content[mutableObjectList4._size - 1]))) {
            mutableObjectList.removeAt(mutableObjectList4._size - 1);
        }
        return new TextContextMenuData(mutableObjectList.asList());
    }

    public final void separator() {
        this.components.add(TextContextMenuSeparator.INSTANCE);
    }
}
