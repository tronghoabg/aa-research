package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f10746a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f10747b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10748c;

    private w(Context context, String str) {
        this.f10747b = context;
        this.f10748c = str;
    }

    public static synchronized w b(Context context, String str) {
        Map map;
        map = f10746a;
        if (!map.containsKey(str)) {
            map.put(str, new w(context, str));
        }
        return (w) map.get(str);
    }

    public final synchronized h a() {
        FileInputStream fileInputStreamOpenFileInput;
        FileInputStream fileInputStream = null;
        try {
            fileInputStreamOpenFileInput = this.f10747b.openFileInput(this.f10748c);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            int iAvailable = fileInputStreamOpenFileInput.available();
            byte[] bArr = new byte[iAvailable];
            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
            h hVarB = h.b(new JSONObject(new String(bArr, "UTF-8")));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            return hVarB;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStreamOpenFileInput;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    final String c() {
        return this.f10748c;
    }

    public final synchronized void d() {
        this.f10747b.deleteFile(this.f10748c);
    }

    public final synchronized void e(h hVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f10747b.openFileOutput(this.f10748c, 0);
        try {
            fileOutputStreamOpenFileOutput.write(hVar.toString().getBytes("UTF-8"));
        } finally {
            fileOutputStreamOpenFileOutput.close();
        }
    }
}
