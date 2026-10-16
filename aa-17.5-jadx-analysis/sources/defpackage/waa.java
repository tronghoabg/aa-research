package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class waa {
    private static volatile xxh a;

    private waa() {
    }

    public static xxh a(Context context) {
        xxh xxhVar;
        xxh xxmVar;
        xxh xxmVar2;
        xxh xxhVar2 = a;
        if (xxhVar2 != null) {
            return xxhVar2;
        }
        synchronized (waa.class) {
            xxhVar = a;
            if (xxhVar == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                int i = wac.a;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    int i2 = tmz.a;
                    if (!context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        try {
                            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                            xxmVar = file.exists() ? new xxm(file) : xvy.a;
                        } catch (RuntimeException e) {
                            Log.e("HermeticFileOverrides", "no data dir", e);
                            xxmVar = xvy.a;
                        }
                        if (xxmVar.f()) {
                            Object objB = xxmVar.b();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objB)));
                                try {
                                    aat aatVar = new aat(0);
                                    HashMap map = new HashMap();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String[] strArrSplit = line.split(" ", 3);
                                        if (strArrSplit.length != 3) {
                                            Log.e("HermeticFileOverrides", a.bz(line, "Invalid: "));
                                        } else {
                                            String str3 = new String(strArrSplit[0]);
                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                            if (strDecode2 == null) {
                                                String str4 = new String(strArrSplit[2]);
                                                strDecode2 = Uri.decode(str4);
                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                    map.put(str4, strDecode2);
                                                }
                                            }
                                            aat aatVar2 = (aat) aatVar.get(str3);
                                            if (aatVar2 == null) {
                                                aatVar2 = new aat(0);
                                                aatVar.put(str3, aatVar2);
                                            }
                                            aatVar2.put(strDecode, strDecode2);
                                        }
                                    }
                                    Log.w("HermeticFileOverrides", "Parsed " + objB.toString() + " for Android package " + context.getPackageName());
                                    rod rodVar = new rod(aatVar);
                                    bufferedReader.close();
                                    xxmVar2 = new xxm(rodVar);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            xxmVar2 = xvy.a;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        xxhVar = xxmVar2;
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } else {
                    xxhVar = xvy.a;
                }
                a = xxhVar;
            }
        }
        return xxhVar;
    }
}
