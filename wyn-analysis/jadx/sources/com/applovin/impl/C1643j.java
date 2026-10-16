package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import cb.AbstractC1593a;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1643j implements AppLovinCommunicatorSubscriber {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21751a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21752b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f21753c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final Set f21754d = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: com.applovin.impl.j$a */
    public class a extends LinkedHashMap {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    /* renamed from: com.applovin.impl.j$b */
    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public C1643j(com.applovin.impl.sdk.k kVar) {
        this.f21751a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public void b(b bVar) {
        this.f21754d.remove(bVar);
    }

    public void c(String str) {
        this.f21751a.O();
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.s("Removing ad info for serve id: ", str, this.f21751a.O(), "AdReviewManager");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f21752b) {
            this.f21753c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "j";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.f21751a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21751a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.f21751a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21751a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.f21751a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21751a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.f21751a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21751a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.f21752b) {
                try {
                    this.f21751a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21751a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.f21753c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.f21751a.O();
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.s("Received SafeDK ad info with Ad Review creative id: ", string2, this.f21751a.O(), "AdReviewManager");
            }
            if (!StringUtils.isValidString(string2) || this.f21754d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.f21754d);
            this.f21751a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21751a.O().a("AdReviewManager", "Notifying listeners: " + this.f21754d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f21751a.r0().a((j5) new s6(this.f21751a, "creativeIdGenerated", new Cb.a(this, (b) it.next(), string, string2, 12)), e6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b(MobileAdsBridge.versionMethodName);
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f21752b) {
            bundle = (Bundle) this.f21753c.get(str);
        }
        this.f21751a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21751a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class<?> cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, null).invoke(null, null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public void a(b bVar) {
        this.f21754d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar, String str, String str2) {
        this.f21751a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21751a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }
}
