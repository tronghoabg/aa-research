package com.google.android.libraries.assistant.a.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.google.d.f.h;
import com.google.d.f.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final i f5795a = i.l("com/google/android/libraries/assistant/entry/contentprovider/GsaPublicContentProvider");

    public static final String a(ContentResolver contentResolver) {
        try {
            Cursor cursorQuery = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.GsaPublicContentProvider").appendPath("publicvalue").appendPath("opa_app_integration_data").build(), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("value");
                        if (columnIndex < 0) {
                            cursorQuery.close();
                            return null;
                        }
                        cursorQuery.moveToFirst();
                        String string = cursorQuery.getString(columnIndex);
                        cursorQuery.close();
                        return string;
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Exception unused) {
            ((h) ((h) f5795a.f()).i("com/google/android/libraries/assistant/entry/contentprovider/GsaPublicContentProvider", "getStringValue", 64, "GsaPublicContentProvider.java")).p("Not able to read content for key: %s", "opa_app_integration_data");
            return null;
        }
    }
}
