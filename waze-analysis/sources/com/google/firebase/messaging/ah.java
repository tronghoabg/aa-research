package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ah {

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f10135a;

    public ah(Context context) {
        this.f10135a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || d()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            b();
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: ".concat(String.valueOf(e2.getMessage())));
            }
        }
    }

    private static final String e(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public final synchronized ag a(String str, String str2) {
        return ag.a(this.f10135a.getString(e(str, str2), null));
    }

    public final synchronized void b() {
        this.f10135a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3, String str4) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = ag.f10130d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e2.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f10135a.edit();
        editorEdit.putString(e(str, str2), string);
        editorEdit.commit();
    }

    public final synchronized boolean d() {
        return this.f10135a.getAll().isEmpty();
    }
}
