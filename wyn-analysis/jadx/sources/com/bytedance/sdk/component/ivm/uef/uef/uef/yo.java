package com.bytedance.sdk.component.ivm.uef.uef.uef;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public class yo {
    public static void uef(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            uef.uef(context).uef().uef(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void uef(Context context, String str, List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            uef.uef(context).uef().uef(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }

    public static int uef(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return uef.uef(context).uef().uef(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int uef(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return uef.uef(context).uef().uef(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static Cursor uef(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return uef.uef(context).uef().uef(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void uef(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            uef.uef(context).uef().uef(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }
}
