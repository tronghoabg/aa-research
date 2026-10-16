package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b8 {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f21166a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private static final Random f21167b = new Random(System.currentTimeMillis());

    public static void a(t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, u7 u7Var, int i5, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i5);
        }
        Set setA = a(t7Var, kVar);
        if (CollectionUtils.isEmpty(setA)) {
            return;
        }
        a(setA, u7Var, kVar);
    }

    public static boolean b(p7 p7Var) {
        c8 c8VarP1;
        List listG;
        return (p7Var == null || (c8VarP1 = p7Var.p1()) == null || (listG = c8VarP1.g()) == null || listG.isEmpty()) ? false : true;
    }

    public static u7 c(p7 p7Var) {
        if (b(p7Var) || a(p7Var)) {
            return null;
        }
        return u7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f21166a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(p7 p7Var) {
        s7 s7VarG1;
        x7 x7VarE;
        if (p7Var == null || (s7VarG1 = p7Var.g1()) == null || (x7VarE = s7VarG1.e()) == null) {
            return false;
        }
        return x7VarE.c() != null || StringUtils.isValidString(x7VarE.b());
    }

    public static boolean b(q8 q8Var) {
        if (q8Var != null) {
            return q8Var.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j8, Uri uri, u7 u7Var, com.applovin.impl.sdk.k kVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(u7Var.b());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j8 >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j8));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                kVar.D().a("VastUtils", th);
                return null;
            }
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j8) {
        if (j8 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j8);
            long minutes = timeUnit.toMinutes(j8);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j8 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(f21167b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, u7.UNSPECIFIED, kVar);
    }

    public static void a(Set set, u7 u7Var, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, u7Var, kVar);
    }

    public static void a(Set set, long j8, Uri uri, u7 u7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                z7 z7Var = (z7) it.next();
                long j10 = j8;
                Uri uri2 = uri;
                u7 u7Var2 = u7Var;
                com.applovin.impl.sdk.k kVar2 = kVar;
                Uri uriA = a(z7Var.c(), j10, uri2, u7Var2, kVar2);
                if (uriA != null) {
                    kVar2.f0().a(com.applovin.impl.sdk.network.d.b().d(uriA.toString()).a(false).b(z7Var.d()).a(), false);
                }
                j8 = j10;
                uri = uri2;
                u7Var = u7Var2;
                kVar = kVar2;
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(q8 q8Var, Map map, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        List<q8> listA;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (q8Var == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        q8 q8VarC = q8Var.c("TrackingEvents");
        if (q8VarC == null || (listA = q8VarC.a("Tracking")) == null) {
            return;
        }
        for (q8 q8Var2 : listA) {
            String str = (String) q8Var2.a().get("event");
            if (StringUtils.isValidString(str)) {
                z7 z7VarA = z7.a(q8Var2, t7Var, kVar);
                if (z7VarA != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(z7VarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(z7VarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastUtils", "Could not find event for tracking node = " + q8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z7 z7VarA = z7.a((q8) it.next(), t7Var, kVar);
            if (z7VarA != null) {
                set.add(z7VarA);
            }
        }
    }

    public static boolean a(q8 q8Var) {
        if (q8Var != null) {
            return q8Var.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(t7 t7Var) {
        q8 q8VarB;
        if (t7Var != null) {
            List listA = t7Var.a();
            int size = t7Var.a().size();
            if (size <= 0 || (q8VarB = ((q8) listA.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return q8VarB.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(q8 q8Var, String str, String str2) {
        q8 q8VarC = q8Var.c(str);
        if (q8VarC != null) {
            String strD = q8VarC.d();
            if (StringUtils.isValidString(strD)) {
                return strD;
            }
        }
        return str2;
    }

    private static Set a(t7 t7Var, com.applovin.impl.sdk.k kVar) {
        List listA;
        if (t7Var == null) {
            return null;
        }
        List<q8> listA2 = t7Var.a();
        HashSet hashSet = new HashSet(listA2.size());
        for (q8 q8Var : listA2) {
            q8 q8VarB = q8Var.b("Wrapper");
            if (q8VarB == null) {
                q8VarB = q8Var.b("InLine");
            }
            if (q8VarB != null) {
                listA = q8VarB.a("Error");
            } else {
                listA = q8Var.a("Error");
            }
            hashSet = a(hashSet, listA, t7Var, kVar);
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z7 z7VarA = z7.a((q8) it.next(), t7Var, kVar);
                if (z7VarA != null) {
                    hashSet.add(z7VarA);
                }
            }
        }
        return hashSet;
    }
}
