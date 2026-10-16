package com.waze.coroutines;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class CoroutineSetDebugProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        x.f(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ String getType(Uri uri) {
        x.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        x.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        System.setProperty("kotlinx.coroutines.debug", "off");
        return true;
    }

    @Override // android.content.ContentProvider
    public final /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        x.f(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        x.f(uri, "uri");
        return 0;
    }
}
