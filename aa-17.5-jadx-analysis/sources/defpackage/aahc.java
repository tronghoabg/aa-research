package defpackage;

import android.util.Log;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.StreetViewSource;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aahc implements aahd {
    public static final String a = "aahc";
    public final zrt b;
    public boolean c;
    public aahb d;
    public aahe e;
    private final aaha f;
    private final zst g;
    private final Executor h;

    public aahc(aaha aahaVar, zst zstVar, Runnable runnable) {
        Executor executorB = zrz.b();
        zrt zrtVar = zrt.a;
        aagx aagxVar = aagx.b;
        zkt.n(aahaVar, "tileCache");
        this.f = aahaVar;
        zkt.n(zstVar, "drd");
        this.g = zstVar;
        zkt.n(runnable, "reportNetworkSuccessfulRunnable");
        this.h = executorB;
        zkt.n(zrtVar, "uiThreadChecker");
        this.b = zrtVar;
        zkt.n(aagxVar, "depthMapParser");
        synchronized (this) {
            this.c = false;
            this.d = null;
            this.e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149 A[Catch: IOException -> 0x020c, IOException | RuntimeException -> 0x020e, TryCatch #7 {IOException | RuntimeException -> 0x020e, blocks: (B:61:0x013d, B:63:0x0149, B:68:0x0163, B:72:0x0182, B:73:0x018e, B:74:0x0191, B:76:0x019c, B:77:0x01a9, B:79:0x01b0, B:80:0x01c4, B:81:0x01d2, B:82:0x01f3, B:83:0x01f4, B:84:0x01ff, B:85:0x0200, B:86:0x020b), top: B:120:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200 A[Catch: IOException -> 0x020c, IOException | RuntimeException -> 0x020e, TryCatch #7 {IOException | RuntimeException -> 0x020e, blocks: (B:61:0x013d, B:63:0x0149, B:68:0x0163, B:72:0x0182, B:73:0x018e, B:74:0x0191, B:76:0x019c, B:77:0x01a9, B:79:0x01b0, B:80:0x01c4, B:81:0x01d2, B:82:0x01f3, B:83:0x01f4, B:84:0x01ff, B:85:0x0200, B:86:0x020b), top: B:120:0x013d }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4, types: [aagv[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [byte[][]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[][]] */
    /* JADX WARN: Type inference failed for: r4v11, types: [byte[][]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [aagv[], byte[][]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [aagu[], byte[][]] */
    /* JADX WARN: Type inference failed for: r8v5, types: [aagu[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final defpackage.aagt f(defpackage.acih r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aahc.f(acih):aagt");
    }

    public final void a(String str, LatLng latLng, Integer num, StreetViewSource streetViewSource) {
        String str2;
        String str3 = a;
        if (zrn.e(str3, 4)) {
            Log.i(str3, String.format("loadPano(ID[%s],LL[%s],radM[%s],SS[%s])", str, latLng, num, streetViewSource));
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            acih acihVarA = null;
            this.e = null;
            if (str != null) {
                str2 = str;
                this.e = new aahe(str, null, null, null, this, str, aahf.b);
                acihVarA = this.f.a(str2);
            } else {
                str2 = str;
                if (num != null && streetViewSource != null) {
                    num.intValue();
                    zkt.n(latLng, "latLng");
                    this.e = new aahe(null, latLng, num, streetViewSource, this, String.format("%s@%sm:%s", latLng, num, streetViewSource), aahf.b);
                } else if (num != null) {
                    num.intValue();
                    zkt.n(latLng, "latLng");
                    this.e = new aahe(null, latLng, num, null, this, String.format("%s@%sm", latLng, num), aahf.b);
                } else if (streetViewSource != null) {
                    zkt.n(latLng, "latLng");
                    this.e = new aahe(null, latLng, null, streetViewSource, this, String.format("%s:%s", latLng, streetViewSource), aahf.b);
                } else {
                    zkt.n(latLng, "latLng");
                    this.e = new aahe(null, latLng, null, null, this, String.valueOf(latLng), aahf.b);
                }
            }
            aahe aaheVar = this.e;
            if (acihVarA == null) {
                if (zrn.e(str3, 4)) {
                    Log.i(str3, String.format("DRD.addDataRequest(%s)", aaheVar));
                }
                this.g.i(aaheVar);
                return;
            }
            acia aciaVar = acihVarA.c;
            if (aciaVar == null) {
                aciaVar = acia.a;
            }
            String str4 = aciaVar.j;
            aagi aagiVar = new aagi(str2, acihVarA, f(acihVarA));
            if (zrn.e(str3, 4)) {
                Log.i(str3, String.format("Cache hit for [%s]=>[%s]=>[%s]", str2, str4, aagiVar));
            }
            e(aaheVar, aagiVar);
        }
    }

    public final synchronized void b() {
        this.b.a();
        if (this.c) {
            String str = a;
            if (zrn.e(str, 5)) {
                Log.w(str, "onDestroy() called more than once!");
                return;
            }
            return;
        }
        String str2 = a;
        if (zrn.e(str2, 4)) {
            Log.i(str2, "onDestroy()");
        }
        this.c = true;
        this.d = null;
        this.e = null;
    }

    @Override // defpackage.aahd
    public final void c(aahe aaheVar, acih acihVar, byte[] bArr) {
        String str = a;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("onStreetViewMetadataProtoRequestFinished(%s)", aaheVar));
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            if (acihVar == null) {
                if (zrn.e(str, 6)) {
                    Log.e(str, String.format("Request failed [%s]", aaheVar));
                }
                e(aaheVar, aagi.a);
                return;
            }
            ExecutorService executorService = zrz.a;
            acia aciaVar = acihVar.c;
            if (aciaVar == null) {
                aciaVar = acia.a;
            }
            aaha aahaVar = this.f;
            String str2 = aciaVar.j;
            aahaVar.c(str2, acihVar);
            if (bArr != null) {
                aahaVar.b(new aagj(str2, 0, 0, 0), bArr);
            } else if (zrn.e(str, 6)) {
                Log.e(str, String.format("Failed to retrieve root tile for [%s]", aaheVar));
            }
            String str3 = aaheVar.b;
            if (str3 != null && !a.C(str3, str2)) {
                if (zrn.e(str, 4)) {
                    Log.i(str, String.format("Adding PanoID alias to cache [%s]=>[%s]", str3, str2));
                }
                aahaVar.c(str3, acihVar);
                if (bArr != null) {
                    aahaVar.b(new aagj(str3, 0, 0, 0), bArr);
                }
            }
            e(aaheVar, new aagi(str3, acihVar, f(acihVar)));
        }
    }

    public final synchronized void d(aahb aahbVar) {
        this.b.a();
        if (this.c) {
            return;
        }
        this.d = aahbVar;
    }

    final void e(aahe aaheVar, aagi aagiVar) {
        zkt.n(aaheVar, "StreetViewMetadataProtoRequest");
        zkt.n(aagiVar, "StreetViewPanoTarget");
        synchronized (this) {
            if (!this.c && a.C(aaheVar, this.e)) {
                this.h.execute(new uze(this, aaheVar, aagiVar, 10));
            }
        }
    }
}
