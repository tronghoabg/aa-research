package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hxv implements hxt {
    private final File a;
    private hsw b;
    private final ieb d = new ieb((byte[]) null, (byte[]) null);
    private final ieb c = new ieb((char[]) null);

    public hxv(File file) {
        this.a = file;
    }

    private final synchronized hsw c() throws IOException {
        hsw hswVar;
        hswVar = this.b;
        if (hswVar == null) {
            File file = this.a;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    hsw.d(file2, file3, false);
                }
            }
            hsw hswVar2 = new hsw(file);
            if (hswVar2.b.exists()) {
                try {
                    hswVar2.b();
                    hsw.a(hswVar2.c);
                    Iterator it = hswVar2.h.values().iterator();
                    while (it.hasNext()) {
                        hsv hsvVar = (hsv) it.next();
                        if (hsvVar.g == null) {
                            for (int i = 0; i < hswVar2.d; i = 1) {
                                hswVar2.f += hsvVar.b[0];
                            }
                        } else {
                            hsvVar.g = null;
                            for (int i2 = 0; i2 < hswVar2.d; i2 = 1) {
                                hsw.a(hsvVar.e());
                                hsw.a(hsvVar.c());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file.toString() + " is corrupt: " + e.getMessage() + ", removing");
                    hswVar2.close();
                    hsz.b(hswVar2.a);
                }
                hswVar = hswVar2;
                this.b = hswVar;
            }
            file.mkdirs();
            hswVar2 = new hsw(file);
            hswVar2.c();
            hswVar = hswVar2;
            this.b = hswVar;
        }
        return hswVar;
    }

    @Override // defpackage.hxt
    public final File a(hui huiVar) {
        String strP = this.c.p(huiVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strP + " for for Key: " + String.valueOf(huiVar));
        }
        try {
            hwi hwiVarH = c().h(strP);
            if (hwiVarH == null) {
                return null;
            }
            Object obj = hwiVarH.b;
            if (obj != null) {
                return ((File[]) obj)[0];
            }
            return new File(((hsw) hwiVarH.c).a, ((String) hwiVarH.a) + ".0");
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v14, types: [htz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.hxt
    public final void b(hui huiVar, ncp ncpVar) {
        ajju ajjuVar;
        File fileC;
        ajju ajjuVar2;
        String strP = this.c.p(huiVar);
        ieb iebVar = this.d;
        synchronized (iebVar) {
            ajjuVar = (ajju) iebVar.a.get(strP);
            if (ajjuVar == null) {
                ?? r3 = ((htm) iebVar.b).a;
                synchronized (r3) {
                    ajjuVar2 = (ajju) r3.poll();
                }
                ajjuVar = ajjuVar2 == null ? new ajju((byte[]) null) : ajjuVar2;
                iebVar.a.put(strP, ajjuVar);
            }
            ajjuVar.a++;
        }
        ajjuVar.b.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strP + " for for Key: " + String.valueOf(huiVar));
            }
            try {
                hsw hswVarC = c();
                if (hswVarC.h(strP) == null) {
                    nbu nbuVarJ = hswVarC.j(strP);
                    if (nbuVarJ == null) {
                        throw new IllegalStateException(a.bz(strP, "Had two simultaneous puts for: "));
                    }
                    try {
                        Object obj = nbuVarJ.d;
                        synchronized (obj) {
                            Object obj2 = nbuVarJ.b;
                            if (((hsv) obj2).g != nbuVarJ) {
                                throw new IllegalStateException();
                            }
                            if (!((hsv) obj2).e) {
                                ((boolean[]) nbuVarJ.c)[0] = true;
                            }
                            fileC = ((hsv) obj2).c();
                            ((hsw) obj).a.mkdirs();
                        }
                        if (ncpVar.a.a(ncpVar.b, fileC, (hum) ncpVar.c)) {
                            ((hsw) obj).i(nbuVarJ, true);
                            nbuVarJ.a = true;
                        }
                    } finally {
                        nbuVarJ.e();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.d.q(strP);
        }
    }
}
