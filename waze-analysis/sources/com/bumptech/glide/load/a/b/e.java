package com.bumptech.glide.load.a.b;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    private final File f3074b;

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.a.f f3075c;

    /* renamed from: d, reason: collision with root package name */
    private final o f3076d = new o((byte[]) null);

    /* renamed from: a, reason: collision with root package name */
    private final o f3073a = new o();

    protected e(File file) {
        this.f3074b = file;
    }

    private final synchronized com.bumptech.glide.a.f c() {
        com.bumptech.glide.a.f fVarL;
        fVarL = this.f3075c;
        if (fVarL == null) {
            fVarL = com.bumptech.glide.a.f.l(this.f3074b);
            this.f3075c = fVarL;
        }
        return fVarL;
    }

    @Override // com.bumptech.glide.load.a.b.b
    public final File a(com.bumptech.glide.load.o oVar) {
        String strA = this.f3073a.a(oVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + String.valueOf(oVar));
        }
        try {
            com.bumptech.glide.a.e eVarC = c().c(strA);
            if (eVarC != null) {
                return eVarC.a();
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.a.b.b
    public final void b(com.bumptech.glide.load.o oVar, a aVar) {
        com.bumptech.glide.a.f fVarC;
        o oVar2 = this.f3076d;
        String strA = this.f3073a.a(oVar);
        oVar2.d(strA);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + String.valueOf(oVar));
            }
            try {
                fVarC = c();
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
            if (fVarC.c(strA) != null) {
                oVar2.e(strA);
                return;
            }
            com.bumptech.glide.a.c cVarB = fVarC.b(strA);
            if (cVarB == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strA);
            }
            try {
                if (aVar.a(cVarB.f())) {
                    cVarB.d();
                }
                cVarB.c();
            } catch (Throwable th) {
                cVarB.c();
                throw th;
            }
        } finally {
            this.f3076d.e(strA);
        }
    }
}
