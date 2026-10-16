package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextActionModeCallback {
    public static final int $stable = 8;
    private final a<ab> onActionModeDestroy;
    private a<ab> onAutofillRequested;
    private a<ab> onCopyRequested;
    private a<ab> onCutRequested;
    private a<ab> onPasteRequested;
    private a<ab> onSelectAllRequested;
    private Rect rect;

    public /* synthetic */ TextActionModeCallback(a aVar, Rect rect, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : aVar, (i2 & 2) != 0 ? Rect.Companion.getZero() : rect, (i2 & 4) != 0 ? null : aVar2, (i2 & 8) != 0 ? null : aVar3, (i2 & 16) != 0 ? null : aVar4, (i2 & 32) != 0 ? null : aVar5, (i2 & 64) != 0 ? null : aVar6);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, a<ab> aVar) {
        if (aVar != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui(menu, menuItemOption);
        } else {
            if (aVar != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final a<ab> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final a<ab> getOnAutofillRequested() {
        return this.onAutofillRequested;
    }

    public final a<ab> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final a<ab> getOnCutRequested() {
        return this.onCutRequested;
    }

    public final a<ab> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final a<ab> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem == null) {
            x.g();
        }
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            a<ab> aVar = this.onCopyRequested;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            a<ab> aVar2 = this.onPasteRequested;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            a<ab> aVar3 = this.onCutRequested;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == MenuItemOption.SelectAll.getId()) {
            a<ab> aVar4 = this.onSelectAllRequested;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            if (itemId != MenuItemOption.Autofill.getId()) {
                return false;
            }
            a<ab> aVar5 = this.onAutofillRequested;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested != null) {
            addMenuItem$ui(menu, MenuItemOption.SelectAll);
        }
        if (this.onAutofillRequested == null) {
            return true;
        }
        addMenuItem$ui(menu, MenuItemOption.Autofill);
        return true;
    }

    public final void onDestroyActionMode() {
        a<ab> aVar = this.onActionModeDestroy;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui(menu);
        return true;
    }

    public final void setOnAutofillRequested(a<ab> aVar) {
        this.onAutofillRequested = aVar;
    }

    public final void setOnCopyRequested(a<ab> aVar) {
        this.onCopyRequested = aVar;
    }

    public final void setOnCutRequested(a<ab> aVar) {
        this.onCutRequested = aVar;
    }

    public final void setOnPasteRequested(a<ab> aVar) {
        this.onPasteRequested = aVar;
    }

    public final void setOnSelectAllRequested(a<ab> aVar) {
        this.onSelectAllRequested = aVar;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    public final void updateMenuItems$ui(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Autofill, this.onAutofillRequested);
    }

    public TextActionModeCallback(a<ab> aVar, Rect rect, a<ab> aVar2, a<ab> aVar3, a<ab> aVar4, a<ab> aVar5, a<ab> aVar6) {
        this.onActionModeDestroy = aVar;
        this.rect = rect;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
        this.onAutofillRequested = aVar6;
    }

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
