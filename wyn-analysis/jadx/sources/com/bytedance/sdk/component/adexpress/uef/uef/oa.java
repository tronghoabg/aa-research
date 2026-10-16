package com.bytedance.sdk.component.adexpress.uef.uef;

import android.content.ContentValues;
import android.database.Cursor;

/* loaded from: classes.dex */
public interface oa {
    int uef(String str, ContentValues contentValues, String str2, String[] strArr);

    int uef(String str, String str2, String[] strArr);

    Cursor uef(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5);

    void uef(String str, ContentValues contentValues);
}
