package com.google.android.projection.gearhead.companion.settings;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.google.android.projection.gearhead.R;
import defpackage.xqj;
import defpackage.xqk;

/* loaded from: classes.dex */
public class SettingsSearchProvider extends xqk {
    private Context a;

    @Override // defpackage.xqk
    public final Cursor a() {
        return new MatrixCursor(xqj.b);
    }

    @Override // defpackage.xqk
    public final Cursor b() {
        return new MatrixCursor(xqj.c);
    }

    @Override // defpackage.xqk
    public final Cursor c() {
        MatrixCursor matrixCursor = new MatrixCursor(xqj.b);
        Object[] objArr = new Object[16];
        objArr[1] = this.a.getString(R.string.app_name);
        objArr[2] = this.a.getString(R.string.system_settings_summary);
        objArr[5] = this.a.getString(R.string.settings_search_keywords);
        objArr[6] = this.a.getString(R.string.settings_title);
        objArr[12] = "aa_settings_search_key";
        objArr[9] = "com.google.android.projection.gearhead.SETTINGS";
        objArr[10] = this.a.getPackageName();
        objArr[11] = DefaultSettingsActivity.class.getCanonicalName();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // defpackage.xqk
    public final Cursor d() {
        return new MatrixCursor(xqj.a);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.a = getContext();
        return true;
    }
}
