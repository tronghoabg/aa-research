package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hzw implements defpackage.huj {
    private final defpackage.hxu a;

    public hzw(defpackage.hxu hxuVar) {
        this.a = hxuVar;
    }

    @Override // defpackage.huj
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.huw huwVar) throws java.lang.Throwable {
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        byte[] bArr = (byte[]) this.a.a(65536, byte[].class);
        java.io.FileOutputStream fileOutputStream = null;
        boolean z = false;
        try {
            try {
                try {
                    java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                    while (true) {
                        try {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        } catch (java.io.IOException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            if (android.util.Log.isLoggable("StreamEncoder", 3)) {
                                android.util.Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.a.c(bArr);
                            return z;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.io.IOException unused) {
                                }
                            }
                            this.a.c(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z = true;
                    fileOutputStream2.close();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.io.IOException unused2) {
        }
        this.a.c(bArr);
        return z;
    }
}
