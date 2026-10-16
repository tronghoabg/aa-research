package com.google.android.projection.gearhead.companion.settings;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class SettingsSearchProvider extends defpackage.xrl {
    private android.content.Context a;

    @Override // defpackage.xrl
    public final android.database.Cursor a() {
        return new android.database.MatrixCursor(xrk.b);
    }

    @Override // defpackage.xrl
    public final android.database.Cursor b() {
        return new android.database.MatrixCursor(xrk.c);
    }

    @Override // defpackage.xrl
    public final android.database.Cursor c() {
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(xrk.b);
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[1] = this.a.getString(2132083143);
        objArr[2] = this.a.getString(2132085371);
        objArr[5] = this.a.getString(2132085233);
        objArr[6] = this.a.getString(2132085248);
        objArr[12] = "aa_settings_search_key";
        objArr[9] = "com.google.android.projection.gearhead.SETTINGS";
        objArr[10] = this.a.getPackageName();
        objArr[11] = com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity.class.getCanonicalName();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }

    @Override // defpackage.xrl
    public final android.database.Cursor d() {
        return new android.database.MatrixCursor(xrk.a);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.a = getContext();
        return true;
    }
}
