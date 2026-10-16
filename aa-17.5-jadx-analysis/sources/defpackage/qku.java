package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class qku {
    public static final Object a = new Object();
    public static volatile qku b;
    public sjr c;
    boolean d;
    public final Object e = new Object();
    public qks f;
    public final long g;
    public qkw h;
    private final Context i;

    public qku(Context context) {
        spu.aw(context);
        this.i = context.getApplicationContext();
        this.d = false;
        this.g = 30000L;
    }

    @ResultIgnorabilityUnspecified
    public static final void c(qkt qktVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            String str = CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE;
            map.put("app_context", CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
            if (qktVar != null) {
                if (true != qktVar.b) {
                    str = CloudRecognizerProtocolStrings.DBG_VALUE;
                }
                map.put("limit_ad_tracking", str);
                String str2 = qktVar.a;
                if (str2 != null) {
                    map.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new qkr(map).start();
        }
    }

    public final void a() {
        spu.aq("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.i;
            if (context == null || this.c == null) {
                return;
            }
            try {
                if (this.d) {
                    spi.a().b(context, this.c);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.d = false;
            this.h = null;
            this.c = null;
        }
    }

    public final synchronized void b() throws IOException {
        if (!this.d) {
            try {
                Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                spu.aq("Calling this from your main thread can lead to deadlock");
                synchronized (this) {
                    if (!this.d) {
                        Context context = this.i;
                        try {
                            context.getPackageManager().getPackageInfo("com.android.vending", 0);
                            int iL = sjw.d.l(context, 12451000);
                            if (iL != 0 && iL != 2) {
                                throw new IOException("Google Play services not available");
                            }
                            sjr sjrVar = new sjr();
                            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                            intent.setPackage("com.google.android.gms");
                            try {
                                if (!spi.a().d(context, intent, sjrVar, 1)) {
                                    throw new IOException("Connection failure");
                                }
                                this.c = sjrVar;
                                try {
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    spu.aq("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                                    if (sjrVar.a) {
                                        throw new IllegalStateException("Cannot call get on this connection more than once");
                                    }
                                    sjrVar.a = true;
                                    IBinder iBinder = (IBinder) sjrVar.b.poll(10000L, timeUnit);
                                    if (iBinder == null) {
                                        throw new TimeoutException("Timed out waiting for the service connection");
                                    }
                                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                    this.h = iInterfaceQueryLocalInterface instanceof qkw ? (qkw) iInterfaceQueryLocalInterface : new qkw(iBinder);
                                    this.d = true;
                                } catch (InterruptedException unused) {
                                    throw new IOException("Interrupted exception");
                                } catch (Throwable th) {
                                    throw new IOException(th);
                                }
                            } finally {
                                IOException iOException = new IOException(th);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                            throw new skk(9);
                        }
                    }
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.d) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
            } catch (Exception e) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e);
            }
        }
    }

    protected final void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
