package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsf {
    static final java.lang.String a = "_m_t";
    private static final java.lang.String b = "zsf";
    private final android.content.Context c;

    public zsf(android.content.Context context) {
        this.c = context;
    }

    private static defpackage.zxm d(java.io.FileInputStream fileInputStream, java.lang.String str) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(fileInputStream);
        defpackage.zxm zxmVar = null;
        try {
            try {
                long j = dataInputStream.readLong();
                java.lang.String utf = dataInputStream.readUTF();
                try {
                    if (str.equals(dataInputStream.readUTF())) {
                        zxmVar = new defpackage.zxm(utf, j);
                    } else {
                        java.lang.String str2 = b;
                        if (defpackage.zsr.e(str2, 4)) {
                            android.util.Log.i(str2, "New API Key detected, fetching a new token.");
                        }
                    }
                } catch (java.io.EOFException unused) {
                    java.lang.String str3 = b;
                    if (defpackage.zsr.e(str3, 4)) {
                        android.util.Log.i(str3, "The API Key is not stored with the token");
                    }
                }
            } finally {
                try {
                    dataInputStream.close();
                } catch (java.io.IOException e) {
                    java.lang.String str4 = b;
                    if (defpackage.zsr.e(str4, 5)) {
                        android.util.Log.w(str4, "Error closing token file: ".concat(java.lang.String.valueOf(e.getMessage())));
                    }
                }
            }
        } catch (java.io.IOException e2) {
            java.lang.String str5 = b;
            if (defpackage.zsr.e(str5, 5)) {
                android.util.Log.w(str5, "Error reading token file: " + e2.getMessage());
            }
        }
        return zxmVar;
    }

    final synchronized void a() {
        android.os.StrictMode.ThreadPolicy threadPolicyC = defpackage.zsv.a.c();
        try {
            if (this.c.deleteFile(a)) {
                java.lang.String str = b;
                if (defpackage.zsr.e(str, 4)) {
                    android.util.Log.i(str, "Deleted saved auth token");
                }
            } else {
                java.lang.String str2 = b;
                if (defpackage.zsr.e(str2, 6)) {
                    android.util.Log.e(str2, "Error while trying to delete the auth token");
                }
            }
            defpackage.zsv.a.d(threadPolicyC);
        } catch (java.lang.Throwable th) {
            defpackage.zsv.a.d(threadPolicyC);
            throw th;
        }
    }

    public final synchronized void b(java.lang.String str, java.lang.String str2, long j) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String strValueOf;
        android.os.StrictMode.ThreadPolicy threadPolicyC = defpackage.zsv.a.c();
        try {
            try {
                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(this.c.openFileOutput(a, 0));
                try {
                    try {
                        dataOutputStream.writeLong(j);
                        dataOutputStream.writeUTF(str2);
                        dataOutputStream.writeUTF(str);
                        try {
                            dataOutputStream.close();
                        } catch (java.io.IOException e) {
                            str3 = b;
                            if (defpackage.zsr.e(str3, 5)) {
                                str4 = "Error closing token file: ";
                                strValueOf = java.lang.String.valueOf(e.getMessage());
                                android.util.Log.w(str3, str4.concat(strValueOf));
                            }
                            defpackage.zsv.a.d(threadPolicyC);
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            dataOutputStream.close();
                        } catch (java.io.IOException e2) {
                            java.lang.String str5 = b;
                            if (defpackage.zsr.e(str5, 5)) {
                                android.util.Log.w(str5, "Error closing token file: ".concat(java.lang.String.valueOf(e2.getMessage())));
                            }
                        }
                        throw th;
                    }
                } catch (java.io.IOException e3) {
                    java.lang.String str6 = b;
                    if (defpackage.zsr.e(str6, 5)) {
                        android.util.Log.w(str6, "Error writing token file: " + e3.getMessage());
                    }
                    try {
                        dataOutputStream.close();
                    } catch (java.io.IOException e4) {
                        str3 = b;
                        if (defpackage.zsr.e(str3, 5)) {
                            str4 = "Error closing token file: ";
                            strValueOf = java.lang.String.valueOf(e4.getMessage());
                            android.util.Log.w(str3, str4.concat(strValueOf));
                        }
                        defpackage.zsv.a.d(threadPolicyC);
                    }
                }
                java.lang.String str7 = b;
                if (defpackage.zsr.e(str7, 4)) {
                    android.util.Log.i(str7, "Saved auth token");
                }
            } catch (java.lang.Throwable th2) {
                defpackage.zsv.a.d(threadPolicyC);
                throw th2;
            }
        } catch (java.io.FileNotFoundException e5) {
            java.lang.String str8 = b;
            if (defpackage.zsr.e(str8, 5)) {
                android.util.Log.w(str8, "Error opening token file: " + e5.getMessage());
            }
        }
        defpackage.zsv.a.d(threadPolicyC);
    }

    final synchronized defpackage.zxm c(java.lang.String str) {
        defpackage.zxm zxmVarD;
        android.os.StrictMode.ThreadPolicy threadPolicyA = defpackage.zsv.a.a();
        try {
            zxmVarD = d(this.c.openFileInput(a), str);
        } catch (java.io.FileNotFoundException unused) {
            zxmVarD = null;
        } finally {
            defpackage.zsv.a.d(threadPolicyA);
        }
        return zxmVarD;
    }
}
