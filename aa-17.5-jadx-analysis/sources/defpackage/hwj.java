package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
public final class hwj implements hwo, hxx, hwq {
    public static final boolean a = Log.isLoggable("Engine", 2);
    public final hvr b;
    public final hxw c;
    public final gsv d;
    public final gms e;
    public final aaem f;
    public final zit g;
    private final hwh h;

    public hwj(hxw hxwVar, htm htmVar, hye hyeVar, hye hyeVar2, hye hyeVar3, hye hyeVar4) throws Throwable {
        this.c = hxwVar;
        hwh hwhVar = new hwh(htmVar);
        this.h = hwhVar;
        hvr hvrVar = new hvr();
        this.b = hvrVar;
        synchronized (this) {
            try {
                try {
                    synchronized (hvrVar) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.e = new gms((byte[]) null);
                    this.d = new gsv(hyeVar, hyeVar2, hyeVar4, this, this);
                    this.g = new zit(hwhVar);
                    this.f = new aaem((byte[]) null);
                    hxwVar.a = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void a(String str, long j, hui huiVar) {
        Log.v("Engine", str + " in " + ift.a(j) + "ms, key: " + huiVar.toString());
    }

    public static void d(String str, hwr hwrVar) {
        if (Log.isLoggable("GlideMemoryTracking", 3)) {
            Object objC = hwrVar.c();
            Bitmap bitmap = objC instanceof Bitmap ? (Bitmap) objC : objC instanceof BitmapDrawable ? ((BitmapDrawable) objC).getBitmap() : null;
            if (bitmap != null) {
                int iIdentityHashCode = System.identityHashCode(bitmap);
                Log.d("GlideMemoryTracking", "Engine [Device: " + Build.DEVICE + "]: Loaded bitmap [ID: " + iIdentityHashCode + "] from memory cache (" + str + "). Size: [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] (" + ify.a(bitmap) + " bytes)");
            }
        }
    }

    @Override // defpackage.hwo
    public final synchronized void b(hwn hwnVar, hui huiVar) {
        this.e.a(huiVar, hwnVar);
    }

    @Override // defpackage.hwo
    public final synchronized void c(hwn hwnVar, hui huiVar, hwr hwrVar) {
        if (hwrVar != null) {
            if (hwrVar.a) {
                this.b.b(huiVar, hwrVar);
            }
            this.e.a(huiVar, hwnVar);
        } else {
            this.e.a(huiVar, hwnVar);
        }
    }
}
