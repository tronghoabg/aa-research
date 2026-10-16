package com.google.firebase.analytics;

import A7.InterfaceC0247e1;
import P9.d;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s8.g;
import v8.EnumC4332a;
import v8.b;
import v8.c;
import v8.e;

/* loaded from: classes4.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f27278c;

    /* renamed from: a, reason: collision with root package name */
    public final zzdy f27279a;

    /* renamed from: b, reason: collision with root package name */
    public c f27280b;

    public FirebaseAnalytics(zzdy zzdyVar) {
        AbstractC1732v.i(zzdyVar);
        this.f27279a = zzdyVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f27278c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f27278c == null) {
                        f27278c = new FirebaseAnalytics(zzdy.zza(context));
                    }
                } finally {
                }
            }
        }
        return f27278c;
    }

    @Keep
    public static InterfaceC0247e1 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdy zzdyVarZza = zzdy.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zzdyVarZza == null) {
            return null;
        }
        return new e(zzdyVarZza);
    }

    public final void a(HashMap map) {
        Bundle bundle = new Bundle();
        EnumC4332a enumC4332a = (EnumC4332a) map.get(b.f47027a);
        if (enumC4332a != null) {
            int iOrdinal = enumC4332a.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        EnumC4332a enumC4332a2 = (EnumC4332a) map.get(b.f47028b);
        if (enumC4332a2 != null) {
            int iOrdinal2 = enumC4332a2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        EnumC4332a enumC4332a3 = (EnumC4332a) map.get(b.f47029c);
        if (enumC4332a3 != null) {
            int iOrdinal3 = enumC4332a3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        EnumC4332a enumC4332a4 = (EnumC4332a) map.get(b.f47030d);
        if (enumC4332a4 != null) {
            int iOrdinal4 = enumC4332a4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f27279a.zzc(bundle);
    }

    public final ExecutorService b() {
        c cVar;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f27280b == null) {
                    this.f27280b = new c(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                cVar = this.f27280b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = P9.c.f9270m;
            return (String) Tasks.await(((P9.c) g.e().c(d.class)).d(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f27279a.zza(activity, str, str2);
    }
}
