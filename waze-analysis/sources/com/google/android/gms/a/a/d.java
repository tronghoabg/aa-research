package com.google.android.gms.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.AudioStats;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.work.WorkRequest;
import com.google.android.gms.common.ae;
import com.google.android.gms.common.af;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.i;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f4379g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static volatile d f4380h;

    /* renamed from: a, reason: collision with root package name */
    com.google.android.gms.common.c f4381a;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.gms.a.a.a.c f4382b;

    /* renamed from: c, reason: collision with root package name */
    boolean f4383c;

    /* renamed from: d, reason: collision with root package name */
    final Object f4384d = new Object();

    /* renamed from: e, reason: collision with root package name */
    b f4385e;

    /* renamed from: f, reason: collision with root package name */
    final long f4386f;

    /* renamed from: i, reason: collision with root package name */
    private final Context f4387i;

    public d(Context context) {
        av.m(context);
        this.f4387i = context.getApplicationContext();
        this.f4383c = false;
        this.f4386f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    }

    public static c a(Context context) {
        c cVar;
        d dVar = f4380h;
        if (dVar == null) {
            synchronized (f4379g) {
                dVar = f4380h;
                if (dVar == null) {
                    Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                    dVar = new d(context);
                    f4380h = dVar;
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        f fVarA = f.a(context);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            av.h("Calling this from your main thread can lead to deadlock");
            synchronized (dVar) {
                dVar.c();
                av.m(dVar.f4381a);
                av.m(dVar.f4382b);
                try {
                    cVar = new c(dVar.f4382b.a(), dVar.f4382b.b());
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception", e2);
                }
            }
            synchronized (dVar.f4384d) {
                b bVar = dVar.f4385e;
                if (bVar != null) {
                    bVar.f4374a.countDown();
                    try {
                        dVar.f4385e.join();
                    } catch (InterruptedException unused) {
                    }
                }
                long j2 = dVar.f4386f;
                if (j2 > 0) {
                    dVar.f4385e = new b(dVar, j2);
                }
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            dVar.d(cVar, jElapsedRealtime2, null);
            fVarA.c(0, jElapsedRealtime, SystemClock.elapsedRealtime(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + AccessibilityNodeInfoCompat.MathInfoCompat.MATH_TAG_STRING_LITERAL);
            return cVar;
        } catch (Throwable th) {
            dVar.d(null, -1L, th);
            fVarA.c(!(th instanceof IOException) ? !(th instanceof ae) ? !(th instanceof af) ? th instanceof IllegalStateException ? 8 : -1 : 16 : 9 : 1, jElapsedRealtime, SystemClock.elapsedRealtime(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
            throw th;
        }
    }

    public final void b() {
        av.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.f4387i;
            if (context == null || this.f4381a == null) {
                return;
            }
            try {
                if (this.f4383c) {
                    com.google.android.gms.common.c.a.a().b(context, this.f4381a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f4383c = false;
            this.f4382b = null;
            this.f4381a = null;
        }
    }

    final synchronized void c() {
        if (!this.f4383c) {
            try {
                Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                av.h("Calling this from your main thread can lead to deadlock");
                synchronized (this) {
                    if (!this.f4383c) {
                        Context context = this.f4387i;
                        try {
                            context.getPackageManager().getPackageInfo("com.android.vending", 0);
                            int iM = i.o().m(context, 12451000);
                            if (iM != 0 && iM != 2) {
                                throw new IOException("Google Play services not available");
                            }
                            com.google.android.gms.common.c cVar = new com.google.android.gms.common.c();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            try {
                                if (!com.google.android.gms.common.c.a.a().c(context, intent, cVar, 1)) {
                                    throw new IOException("Connection failure");
                                }
                                this.f4381a = cVar;
                                try {
                                    this.f4382b = com.google.android.gms.a.a.a.b.c(cVar.a(TimeUnit.MILLISECONDS));
                                    this.f4383c = true;
                                } catch (InterruptedException unused) {
                                    throw new IOException("Interrupted exception");
                                } catch (Throwable th) {
                                    throw new IOException(th);
                                }
                            } finally {
                                IOException iOException = new IOException(th);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            throw new ae();
                        }
                    }
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.f4383c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
            } catch (Exception e2) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
            }
        }
    }

    final void d(c cVar, long j2, Throwable th) {
        if (Math.random() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            HashMap map = new HashMap();
            String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            map.put("app_context", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (cVar != null) {
                if (true != cVar.b()) {
                    str = "0";
                }
                map.put("limit_ad_tracking", str);
                String strA = cVar.a();
                if (strA != null) {
                    map.put("ad_id_size", Integer.toString(strA.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j2));
            new a(this, map).start();
        }
    }

    protected final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
