package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1668v {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f23361a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f23362b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f23363c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f23364d = false;

    /* renamed from: e, reason: collision with root package name */
    private static a f23365e = null;

    /* renamed from: com.applovin.impl.v$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f23366a;

        /* renamed from: b, reason: collision with root package name */
        private String f23367b = "";

        /* renamed from: c, reason: collision with root package name */
        private EnumC0024a f23368c = EnumC0024a.NOT_SET;

        /* renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC0024a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* renamed from: a, reason: collision with root package name */
            private final String f23373a;

            EnumC0024a(String str) {
                this.f23373a = str;
            }

            public String b() {
                return this.f23373a;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0024a b() {
            return this.f23368c;
        }

        public boolean c() {
            return this.f23366a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            EnumC0024a enumC0024aB = b();
            EnumC0024a enumC0024aB2 = aVar.b();
            return enumC0024aB != null ? enumC0024aB.equals(enumC0024aB2) : enumC0024aB2 == null;
        }

        public int hashCode() {
            int i5 = c() ? 79 : 97;
            String strA = a();
            int iHashCode = ((i5 + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            EnumC0024a enumC0024aB = b();
            return (iHashCode * 59) + (enumC0024aB != null ? enumC0024aB.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(boolean z2) {
            this.f23366a = z2;
        }

        public void a(String str) {
            this.f23367b = str;
        }

        public void a(EnumC0024a enumC0024a) {
            this.f23368c = enumC0024a;
        }

        public String a() {
            return this.f23367b;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        o7.a();
        Object obj = f23362b;
        synchronized (obj) {
            try {
                if (f23364d) {
                    return f23365e;
                }
                Collection collection = f23363c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarC = c(context);
                    synchronized (obj) {
                        f23364d = true;
                        f23365e = aVarC;
                        hashSet = new HashSet(collection);
                        collection.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e7) {
                    com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e7);
                }
                synchronized (f23362b) {
                    aVar = f23365e;
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f23361a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z2);
                aVar.a(z2 ? a.EnumC0024a.ON : a.EnumC0024a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e7) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e7);
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f23361a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        o7.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(zIsLimitAdTrackingEnabled);
            aVar.a(zIsLimitAdTrackingEnabled ? a.EnumC0024a.ON : a.EnumC0024a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.o.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    public static boolean a() {
        return o7.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}
