package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f20402a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f20403b = "";

    private a(Context context) {
        String string;
        if (f20402a == null) {
            synchronized (a.class) {
                if (f20402a == null) {
                    String strC = o.a().c();
                    if (strC != null) {
                        f20402a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f20402a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f20402a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f20402a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(f20403b)) {
                new a(context);
                UUID uuid = f20402a;
                if (uuid != null) {
                    f20403b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f20403b;
    }
}
