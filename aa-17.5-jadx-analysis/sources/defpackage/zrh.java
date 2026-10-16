package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zrh {
    private final Context a;
    private final zrr b;

    public zrh(Context context) {
        zrr zrrVar = zrr.a;
        this.a = context;
        this.b = zrrVar;
    }

    public final synchronized void a(String str, byte[] bArr) {
        zrr zrrVar = this.b;
        if (bArr == null) {
            StrictMode.ThreadPolicy threadPolicyC = zrrVar.c();
            try {
                this.a.deleteFile(str);
                return;
            } finally {
                this.b.d(threadPolicyC);
            }
        }
        StrictMode.ThreadPolicy threadPolicyC2 = zrrVar.c();
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(bArr);
            } catch (IOException unused) {
                this.a.deleteFile(str);
            }
            return;
        } finally {
            this.b.d(threadPolicyC2);
            roc.j(fileOutputStreamOpenFileOutput);
        }
    }

    public final synchronized byte[] b(String str) {
        FileInputStream fileInputStreamOpenFileInput;
        byte[] bArrA;
        StrictMode.ThreadPolicy threadPolicyB = this.b.b();
        FileInputStream fileInputStream = null;
        bArrA = null;
        bArrA = null;
        try {
            try {
                fileInputStreamOpenFileInput = this.a.openFileInput(str);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStreamOpenFileInput;
                this.b.d(threadPolicyB);
                roc.j(fileInputStream);
                throw th;
            }
        } catch (IOException unused) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th2) {
            th = th2;
            this.b.d(threadPolicyB);
            roc.j(fileInputStream);
            throw th;
        }
        if (fileInputStreamOpenFileInput != null) {
            try {
                bArrA = sps.a(fileInputStreamOpenFileInput, false);
            } catch (IOException unused2) {
                this.a.deleteFile(str);
                this.b.d(threadPolicyB);
                roc.j(fileInputStreamOpenFileInput);
                return bArrA;
            }
        }
        this.b.d(threadPolicyB);
        roc.j(fileInputStreamOpenFileInput);
        return bArrA;
    }
}
