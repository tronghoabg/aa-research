package com.google.firebase.installations.b;

import android.util.Log;
import com.google.firebase.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private File f9977a;

    /* renamed from: b, reason: collision with root package name */
    private final e f9978b;

    public b(e eVar) {
        this.f9978b = eVar;
    }

    private final File c() {
        if (this.f9977a == null) {
            synchronized (this) {
                if (this.f9977a == null) {
                    e eVar = this.f9978b;
                    String str = "PersistedInstallation." + eVar.h() + ".json";
                    File file = new File(eVar.a().getNoBackupFilesDir(), str);
                    this.f9977a = file;
                    if (file.exists()) {
                        return this.f9977a;
                    }
                    File file2 = new File(eVar.a().getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo(this.f9977a)) {
                        Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                        return file2;
                    }
                }
            }
        }
        return this.f9977a;
    }

    public final d a() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(c());
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, 16384);
                    if (i2 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        c cVarA = d.a();
        cVarA.d(strOptString);
        cVarA.g(new int[]{1, 2, 3, 4, 5}[iOptInt]);
        cVarA.b(strOptString2);
        cVarA.f(strOptString3);
        cVarA.h(jOptLong);
        cVarA.c(jOptLong2);
        cVarA.e(strOptString4);
        return cVarA.a();
    }

    public final void b(d dVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.j());
            int iM = dVar.m();
            int i2 = iM - 1;
            if (iM == 0) {
                throw null;
            }
            jSONObject.put("Status", i2);
            jSONObject.put("AuthToken", dVar.i());
            jSONObject.put("RefreshToken", dVar.l());
            jSONObject.put("TokenCreationEpochInSecs", dVar.g());
            jSONObject.put("ExpiresInSecs", dVar.f());
            jSONObject.put("FisError", dVar.k());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f9978b.a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(c())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }
}
