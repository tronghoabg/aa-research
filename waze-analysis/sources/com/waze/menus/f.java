package com.waze.menus;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum f {
    ADD_FAVORITE(0, R.string.NAVLIST_OPTIONS_ADD_FAVORITE, R.string.contentDescription_addressItemAddFavorite),
    REMOVE_FAVORITE(1, R.string.NAVLIST_OPTIONS_REMOVE_FAVORITE, R.string.contentDescription_addressItemRemoveFavorite),
    CHANGE_LOCATION(2, R.string.NAVLIST_OPTIONS_CHANGE_LOCATION, R.string.contentDescription_addressItemChangeLocation),
    PARKING(3, R.string.NAVLIST_OPTIONS_PARKING, R.string.contentDescription_addressItemFindParking),
    CALENDAR_SETTINGS(5, R.string.NAVLIST_OPTIONS_CALENDAR_SETTINGS, R.string.contentDescription_addressItemCalendarSettings),
    INFO(6, R.string.NAVLIST_OPTIONS_INFO, R.string.contentDescription_addressItemInfo),
    SEND_LOCATION(7, R.string.NAVLIST_OPTIONS_SEND_LOCATION, R.string.contentDescription_addressItemSendLocation),
    ROUTES(8, R.string.NAVLIST_OPTIONS_ROUTES, R.string.contentDescription_addressItemRoutes),
    EDIT_HOME(9, R.string.NAVLIST_OPTIONS_EDIT_HOME, R.string.contentDescription_addressItemEditHome),
    EDIT_WORK(10, R.string.NAVLIST_OPTIONS_EDIT_WORK, R.string.contentDescription_addressItemEditWork),
    SET_LOCATION(11, R.string.NAVLIST_OPTIONS_SET_LOCATION, R.string.contentDescription_addressItemSetLocation),
    DELETE(12, R.string.NAVLIST_OPTIONS_DELETE, R.string.contentDescription_addressItemDelete),
    SET_START_POINT(13, 0, R.string.contentDescription_addressItemSetStartPoint),
    RENAME_FAVORITE(14, R.string.NAVLIST_OPTIONS_RENAME_FAVORITE, R.string.contentDescription_addressItemRenameFavorite),
    EDIT_PLANNED_DRIVE(18, R.string.NAVLIST_OPTIONS_EDIT_PLANNED_DRIVE, R.string.contentDescription_addressItemEditPlannedDrive);

    private final int q;
    private final int r;
    private final int s;

    f(int i2, int i3, int i4) {
        this.q = i2;
        this.r = i3;
        this.s = i4;
    }

    static f d(int i2) {
        for (f fVar : values()) {
            if (fVar.q == i2) {
                return fVar;
            }
        }
        return null;
    }

    final int a() {
        return this.s;
    }

    final int b() {
        return this.q;
    }

    final int c() {
        return this.r;
    }
}
