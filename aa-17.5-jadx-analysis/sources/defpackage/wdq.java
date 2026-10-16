package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class wdq {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public final Context c;
    public final xyc d;
    public final xyc e;
    public final xyc f;
    public final xyc g;
    public volatile wbj h;
    public final xyc i;
    public volatile wbl j;
    private final xyc k;

    public wdq(Context context, xyc xycVar, xyc xycVar2) {
        this.c = context;
        this.e = xycVar;
        this.d = xycVar2;
        int i = 13;
        byte[] bArr = null;
        this.g = wub.L(new jbk(context, "storage-info.pb", i, bArr));
        int i2 = tmz.a;
        this.i = wub.L(new jbk(context.isDeviceProtectedStorage() ? context : context.createDeviceProtectedStorageContext(), "device-encrypted-storage-info.pb", i, bArr));
        this.f = wub.L(new vks(this, 16));
        this.k = wub.L(new vks(xycVar, 17));
    }

    public static void e(String str, abow abowVar, String str2) throws IOException {
        File file = new File(str);
        yrm.g(file);
        File fileCreateTempFile = File.createTempFile(str2, ".pb", file.getParentFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                abowVar.g(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException(String.valueOf(fileCreateTempFile) + " could not be renamed to " + file.toString());
            } finally {
            }
        } catch (IOException e) {
            fileCreateTempFile.delete();
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.StrictMode$ThreadPolicy] */
    public final wbj a() {
        wbj wbjVar;
        wbj wbjVar2;
        FileInputStream fileInputStream;
        wbj wbjVar3 = this.h;
        if (wbjVar3 != null) {
            return wbjVar3;
        }
        synchronized (a) {
            wbjVar = this.h;
            if (wbjVar == null) {
                StrictMode.ThreadPolicy threadPolicyE = tmz.e(this.c);
                if (threadPolicyE != 0) {
                    try {
                        threadPolicyE = StrictMode.allowThreadDiskWrites();
                        try {
                            fileInputStream = new FileInputStream((String) this.g.gu());
                        } catch (IOException | IllegalStateException unused) {
                            wbjVar2 = wbj.b;
                        }
                        try {
                            abnj abnjVar = abnj.a;
                            wbj wbjVar4 = wbj.b;
                            int i = abmw.l;
                            abnv abnvVarC = abnv.C(wbjVar4, new abmv(fileInputStream), abnjVar);
                            abnv.U(abnvVarC);
                            wbjVar2 = (wbj) abnvVarC;
                            fileInputStream.close();
                            StrictMode.setThreadPolicy(threadPolicyE);
                            wbjVar = wbjVar2;
                            this.h = wbjVar;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyE);
                        throw th3;
                    }
                } else {
                    wbjVar = wbj.b;
                }
            }
        }
        return wbjVar;
    }

    public final wbl b() {
        wbl wblVar;
        wbl wblVar2;
        FileInputStream fileInputStream;
        wbl wblVar3 = this.j;
        if (wblVar3 != null) {
            return wblVar3;
        }
        synchronized (b) {
            wblVar = this.j;
            if (wblVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        fileInputStream = new FileInputStream((String) this.i.gu());
                    } catch (IOException | IllegalStateException unused) {
                        wblVar2 = wbl.b;
                    }
                    try {
                        wblVar2 = (wbl) abnv.z(wbl.b, fileInputStream, abnj.a);
                        fileInputStream.close();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        wblVar = wblVar2;
                        this.j = wblVar;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th3;
                }
            }
        }
        return wblVar;
    }

    public final wdh c(boolean z) {
        boolean z2;
        yfq yfqVarO;
        abms abmsVar;
        String str;
        yfq yfqVarO2;
        yfq yfqVarO3;
        int i;
        boolean z3;
        boolean z4;
        wbi wbiVar;
        String str2 = "";
        if (z) {
            wbl wblVarB = b();
            z2 = wblVarB.e;
            yfqVarO = yfq.o(new abof(wblVarB.i, wbl.a));
            abmsVar = wblVarB.d;
            str = wblVarB.f;
            yfqVarO2 = yfq.o(wblVarB.g);
            yfqVarO3 = yfq.o(wblVarB.h);
            if ((wblVarB.c & 8) != 0) {
                wbm wbmVar = wblVarB.j;
                if (wbmVar == null) {
                    wbmVar = wbm.a;
                }
                if (wbmVar.c == Build.VERSION.SDK_INT) {
                    wbm wbmVar2 = wblVarB.j;
                    if (wbmVar2 == null) {
                        wbmVar2 = wbm.a;
                    }
                    str2 = wbmVar2.b;
                }
            }
            i = wblVarB.c & 1;
            z3 = wblVarB.l;
            z4 = wblVarB.k;
            wbiVar = wblVarB.m;
            if (wbiVar == null) {
                wbiVar = wbi.a;
            }
        } else {
            wbj wbjVarA = a();
            z2 = wbjVarA.e;
            yfqVarO = yfq.o(new abof(wbjVarA.j, wbj.a));
            abmsVar = wbjVarA.d;
            str = wbjVarA.f;
            yfqVarO2 = yfq.o(wbjVarA.h);
            yfqVarO3 = yfq.o(wbjVarA.i);
            if ((wbjVarA.c & 16) != 0) {
                wbm wbmVar3 = wbjVarA.k;
                if (wbmVar3 == null) {
                    wbmVar3 = wbm.a;
                }
                if (wbmVar3.c == Build.VERSION.SDK_INT) {
                    wbm wbmVar4 = wbjVarA.k;
                    if (wbmVar4 == null) {
                        wbmVar4 = wbm.a;
                    }
                    str2 = wbmVar4.b;
                }
            }
            i = wbjVarA.c & 1;
            z3 = wbjVarA.m;
            z4 = wbjVarA.l;
            wbiVar = wbjVarA.n;
            if (wbiVar == null) {
                wbiVar = wbi.a;
            }
        }
        return new wdh(z2, yfqVarO, abmsVar, str, str2, yfqVarO2, yfqVarO3, 1 == i, z3, z4, wbiVar);
    }

    public final zgp d(boolean z) {
        zgt zgtVar = (zgt) this.e.gu();
        zgtVar.getClass();
        return zfb.g(zgj.v(z ? wub.Z((zgp) this.k.gu()) : zgl.a), new kew(this, 9), zgtVar);
    }
}
