package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f9963a;

    /* renamed from: b, reason: collision with root package name */
    final Context f9964b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f9965c = new ArrayMap();

    public n(Context context) {
        this.f9964b = context;
        this.f9963a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || b()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            a();
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Error creating file in no backup dir: ".concat(String.valueOf(e2.getMessage())));
            }
        }
    }

    static String c(String str) {
        return str.concat("|S|cre");
    }

    private static final String g(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public final synchronized void a() {
        this.f9965c.clear();
        this.f9963a.edit().clear().commit();
    }

    public final synchronized boolean b() {
        return this.f9963a.getAll().isEmpty();
    }

    public final synchronized void d(String str) {
        SharedPreferences sharedPreferences = this.f9963a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.contains(c(str))) {
            String string = sharedPreferences.getString(c(str), null);
            jCurrentTimeMillis = 0;
            if (string != null) {
                try {
                    jCurrentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            SharedPreferences sharedPreferences2 = this.f9963a;
            String strC = c(str);
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.putString(strC, String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        }
        this.f9965c.put(str, Long.valueOf(jCurrentTimeMillis));
    }

    public final synchronized m e(String str, String str2) {
        return m.a(this.f9963a.getString(g(str, str2), null));
    }

    public final synchronized void f(String str, String str2, String str3, String str4) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = m.f9958d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e2.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f9963a.edit();
        editorEdit.putString(g(str, str2), string);
        editorEdit.commit();
    }
}
