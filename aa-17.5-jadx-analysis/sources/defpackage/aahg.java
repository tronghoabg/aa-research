package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class aahg implements aagr {
    public static final String a = "aahg";
    public final aahn b;
    public final Map c;
    public final Queue d;
    public aagq e;
    public boolean f;
    private final zst g;
    private final aaha h;
    private final Bitmap.Config i;

    public aahg(zst zstVar, aaha aahaVar, aahn aahnVar, Bitmap.Config config) {
        aahf aahfVar = aahf.b;
        zkt.n(zstVar, "drd");
        this.g = zstVar;
        zkt.n(aahaVar, "diskCache");
        this.h = aahaVar;
        zkt.n(aahnVar, "frameRequestor");
        this.b = aahnVar;
        zkt.n(config, "bitmapConfig");
        this.i = config;
        zkt.n(aahfVar, "streetViewProtoDefaults");
        synchronized (this) {
            this.c = new HashMap();
            this.d = new LinkedList();
            this.e = null;
            this.f = false;
        }
    }

    static final Bitmap d(byte[] bArr, Bitmap.Config config, aagj aagjVar) {
        if (bArr == null) {
            return null;
        }
        try {
            int length = bArr.length;
            zkt.e(length > 0, "Empty jpeg array.");
            zkt.n(aagjVar, "keyForDebugging");
            if (bArr[0] == 67) {
                String str = aahf.a;
                if (zrn.e(str, 4)) {
                    Log.i(str, String.format("JPEG compressed tile received for %s", aagjVar));
                }
                bArr = zpk.b(bArr, 0, length);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = config;
            options.inDither = true;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (Throwable th) {
            String str2 = a;
            if (zrn.e(str2, 6)) {
                Log.e(str2, String.format("decodeTileToBitmap(%s) failed %s", aagjVar, th.getMessage()), th);
            }
            return null;
        }
    }

    @Override // defpackage.aagr
    public final void a(aagj aagjVar) {
        zkt.n(aagjVar, "key");
        String str = a;
        if (zrn.e(str, 3)) {
            Log.d(str, String.format("requestTile(%s)", aagjVar));
        }
        synchronized (this) {
            if (this.f) {
                if (zrn.e(str, 5)) {
                    Log.w(str, String.format("requestTile(%s) called after onDestroy()", aagjVar));
                }
                return;
            }
            Bitmap bitmapD = d(this.h.d(aagjVar), this.i, aagjVar);
            if (bitmapD != null) {
                if (zrn.e(str, 4)) {
                    Log.i(str, String.format("requestTile(%s) in disk cache", aagjVar));
                }
                this.d.add(new zro(aagjVar, bitmapD));
                this.b.b("TILE_NETWORK_CACHED");
                return;
            }
            Map map = this.c;
            if (map.containsKey(aagjVar)) {
                if (zrn.e(str, 3)) {
                    Log.d(str, String.format("requestTile(%s) already in pendingRequests", aagjVar));
                }
                return;
            }
            aahh aahhVar = new aahh(aagjVar, this);
            map.put(aagjVar, aahhVar);
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("requestTile(%s) => DRD.addDataRequest(%s)", aagjVar, aahhVar));
            }
            this.g.i(aahhVar);
        }
    }

    @Override // defpackage.aagr
    public final synchronized void b(aagq aagqVar) {
        this.e = aagqVar;
    }

    public final void c(aagj aagjVar, boolean z, boolean z2, Map map) {
        String str = a;
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("onStreetViewTileRequestFinished(%s,%s,%s,%s)", aagjVar, Boolean.valueOf(z), Boolean.valueOf(z2), map.keySet()));
        }
        aahh aahhVar = null;
        Bitmap bitmap = null;
        for (aagj aagjVar2 : map.keySet()) {
            byte[] bArr = (byte[]) map.get(aagjVar2);
            Bitmap bitmapD = d(bArr, this.i, aagjVar2);
            if (bitmapD != null) {
                this.h.b(aagjVar2, bArr);
                if (a.C(aagjVar2, aagjVar)) {
                    bitmap = bitmapD;
                }
            }
        }
        boolean z3 = (bitmap != null || z2 || z) ? false : true;
        synchronized (this) {
            if (this.f) {
                if (zrn.e(str, 5)) {
                    Log.w(str, String.format("DRD result for %s received after onDestroy()", aagjVar));
                }
                return;
            }
            Map map2 = this.c;
            if (map2.containsKey(aagjVar)) {
                if (z3) {
                    aahhVar = (aahh) map2.get(aagjVar);
                } else {
                    map2.remove(aagjVar);
                    this.d.add(new zro(aagjVar, bitmap));
                }
            }
            String str2 = a;
            if (zrn.e(str2, 3)) {
                Log.d(str2, String.format("onStreetViewTileRequestFinished(%s) => %s vs %s", aagjVar, bitmap, aahhVar));
            }
            if (aahhVar != null) {
                this.g.i(aahhVar);
            } else {
                this.b.b("TILE_NETWORK_RECEIVED");
            }
        }
    }
}
