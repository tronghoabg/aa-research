package com.waze.sharedui.g;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum f {
    COLUMN_TEXT(true, R.layout.bottom_sheet_simple_row_item),
    COLUMN_TEXT_ICON(true, R.layout.bottom_sheet_row_item),
    GRID_SMALL(false, R.layout.bottom_sheet_grid_item);


    /* renamed from: e, reason: collision with root package name */
    private final boolean f38952e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38953f;

    f(boolean z, int i2) {
        this.f38952e = z;
        this.f38953f = i2;
    }

    public final int b(int i2) {
        if (this.f38952e) {
            return 1;
        }
        return i2;
    }
}
