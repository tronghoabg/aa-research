package com.waze.reports;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bh implements ActionMode.Callback {
    bh(GasPriceReportActivity gasPriceReportActivity) {
        Objects.requireNonNull(gasPriceReportActivity);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
