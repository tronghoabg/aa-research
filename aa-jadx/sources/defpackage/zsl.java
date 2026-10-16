package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsl {
    private final android.content.Context a;
    private final defpackage.zsv b;

    public zsl(android.content.Context context) {
        defpackage.zsv zsvVar = defpackage.zsv.a;
        this.a = context;
        this.b = zsvVar;
    }

    public final synchronized void a(java.lang.String str, byte[] bArr) {
        defpackage.zsv zsvVar = this.b;
        if (bArr == null) {
            android.os.StrictMode.ThreadPolicy threadPolicyC = zsvVar.c();
            try {
                this.a.deleteFile(str);
                this.b.d(threadPolicyC);
                return;
            } catch (java.lang.Throwable th) {
                this.b.d(threadPolicyC);
                throw th;
            }
        }
        android.os.StrictMode.ThreadPolicy threadPolicyC2 = zsvVar.c();
        java.io.FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(bArr);
            } catch (java.io.IOException unused) {
                this.a.deleteFile(str);
            }
            this.b.d(threadPolicyC2);
            defpackage.tna.t(fileOutputStreamOpenFileOutput);
            return;
        } catch (java.lang.Throwable th2) {
            this.b.d(threadPolicyC2);
            defpackage.tna.t(fileOutputStreamOpenFileOutput);
            throw th2;
        }
        throw th;
    }

    public final synchronized byte[] b(java.lang.String str) {
        java.io.FileInputStream fileInputStreamOpenFileInput;
        byte[] bArrA;
        android.os.StrictMode.ThreadPolicy threadPolicyB = this.b.b();
        java.io.FileInputStream fileInputStream = null;
        bArrA = null;
        bArrA = null;
        try {
            try {
                fileInputStreamOpenFileInput = this.a.openFileInput(str);
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        bArrA = defpackage.sqq.a(fileInputStreamOpenFileInput, false);
                    } catch (java.io.IOException unused) {
                        this.a.deleteFile(str);
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStreamOpenFileInput;
                this.b.d(threadPolicyB);
                defpackage.tna.t(fileInputStream);
                throw th;
            }
        } catch (java.io.IOException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            this.b.d(threadPolicyB);
            defpackage.tna.t(fileInputStream);
            throw th;
        }
        this.b.d(threadPolicyB);
        defpackage.tna.t(fileInputStreamOpenFileInput);
        return bArrA;
    }
}
