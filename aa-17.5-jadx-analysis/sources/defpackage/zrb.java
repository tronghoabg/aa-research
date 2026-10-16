package defpackage;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zrb {
    static final String a = "_m_t";
    private static final String b = "zrb";
    private final Context c;

    public zrb(Context context) {
        this.c = context;
    }

    private static zwj d(FileInputStream fileInputStream, String str) {
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        zwj zwjVar = null;
        try {
            try {
                long j = dataInputStream.readLong();
                String utf = dataInputStream.readUTF();
                try {
                } catch (EOFException unused) {
                    String str2 = b;
                    if (zrn.e(str2, 4)) {
                        Log.i(str2, "The API Key is not stored with the token");
                    }
                }
                if (str.equals(dataInputStream.readUTF())) {
                    zwjVar = new zwj(utf, j);
                } else {
                    String str3 = b;
                    if (zrn.e(str3, 4)) {
                        Log.i(str3, "New API Key detected, fetching a new token.");
                    }
                }
            } finally {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    String str4 = b;
                    if (zrn.e(str4, 5)) {
                        Log.w(str4, "Error closing token file: ".concat(String.valueOf(e.getMessage())));
                    }
                }
            }
        } catch (IOException e2) {
            String str5 = b;
            if (zrn.e(str5, 5)) {
                Log.w(str5, "Error reading token file: " + e2.getMessage());
            }
        }
        return zwjVar;
    }

    final synchronized void a() {
        StrictMode.ThreadPolicy threadPolicyC = zrr.a.c();
        try {
            if (this.c.deleteFile(a)) {
                String str = b;
                if (zrn.e(str, 4)) {
                    Log.i(str, "Deleted saved auth token");
                }
            } else {
                String str2 = b;
                if (zrn.e(str2, 6)) {
                    Log.e(str2, "Error while trying to delete the auth token");
                }
            }
        } finally {
            zrr.a.d(threadPolicyC);
        }
    }

    public final synchronized void b(String str, String str2, long j) {
        String str3;
        String str4;
        String strValueOf;
        StrictMode.ThreadPolicy threadPolicyC = zrr.a.c();
        try {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(this.c.openFileOutput(a, 0));
                try {
                    try {
                        dataOutputStream.writeLong(j);
                        dataOutputStream.writeUTF(str2);
                        dataOutputStream.writeUTF(str);
                        try {
                            dataOutputStream.close();
                        } catch (IOException e) {
                            str3 = b;
                            if (zrn.e(str3, 5)) {
                                str4 = "Error closing token file: ";
                                strValueOf = String.valueOf(e.getMessage());
                                Log.w(str3, str4.concat(strValueOf));
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e2) {
                            String str5 = b;
                            if (zrn.e(str5, 5)) {
                                Log.w(str5, "Error closing token file: ".concat(String.valueOf(e2.getMessage())));
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    String str6 = b;
                    if (zrn.e(str6, 5)) {
                        Log.w(str6, "Error writing token file: " + e3.getMessage());
                    }
                    try {
                        dataOutputStream.close();
                    } catch (IOException e4) {
                        str3 = b;
                        if (zrn.e(str3, 5)) {
                            str4 = "Error closing token file: ";
                            strValueOf = String.valueOf(e4.getMessage());
                            Log.w(str3, str4.concat(strValueOf));
                        }
                    }
                }
                String str7 = b;
                if (zrn.e(str7, 4)) {
                    Log.i(str7, "Saved auth token");
                }
            } finally {
                zrr.a.d(threadPolicyC);
            }
        } catch (FileNotFoundException e5) {
            String str8 = b;
            if (zrn.e(str8, 5)) {
                Log.w(str8, "Error opening token file: " + e5.getMessage());
            }
        }
    }

    final synchronized zwj c(String str) {
        zwj zwjVarD;
        StrictMode.ThreadPolicy threadPolicyA = zrr.a.a();
        try {
            zwjVarD = d(this.c.openFileInput(a), str);
        } catch (FileNotFoundException unused) {
            zwjVarD = null;
        } catch (Throwable th) {
            zrr.a.d(threadPolicyA);
            throw th;
        }
        zrr.a.d(threadPolicyA);
        return zwjVarD;
    }
}
