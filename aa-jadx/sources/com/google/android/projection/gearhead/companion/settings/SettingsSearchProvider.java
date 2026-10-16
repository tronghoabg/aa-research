package com.google.android.projection.gearhead.companion.settings;

/* JADX INFO: loaded from: classes.dex */
public class SettingsSearchProvider extends defpackage.xrl {
    private android.content.Context a;

    @Override // defpackage.xrl
    public final android.database.Cursor a() {
        return new android.database.MatrixCursor(defpackage.xrk.b);
    }

    @Override // defpackage.xrl
    public final android.database.Cursor b() {
        return new android.database.MatrixCursor(defpackage.xrk.c);
    }

    @Override // defpackage.xrl
    public final android.database.Cursor c() {
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(defpackage.xrk.b);
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[1] = this.a.getString(com.google.android.projection.gearhead.R.string.app_name);
        objArr[2] = this.a.getString(com.google.android.projection.gearhead.R.string.system_settings_summary);
        objArr[5] = this.a.getString(com.google.android.projection.gearhead.R.string.settings_search_keywords);
        objArr[6] = this.a.getString(com.google.android.projection.gearhead.R.string.settings_title);
        objArr[12] = "aa_settings_search_key";
        objArr[9] = "com.google.android.projection.gearhead.SETTINGS";
        objArr[10] = this.a.getPackageName();
        objArr[11] = com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity.class.getCanonicalName();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // defpackage.xrl
    public final android.database.Cursor d() {
        return new android.database.MatrixCursor(defpackage.xrk.a);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.a = getContext();
        return true;
    }
}
