package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.C1632d0;
import com.applovin.impl.C1634e0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class m5 extends j5 implements v3.a {

    /* renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f21916g;

    /* renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f21917h;

    /* renamed from: i, reason: collision with root package name */
    protected final String f21918i;

    /* renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.m f21919j;
    private final Collection k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21920l;

    /* renamed from: m, reason: collision with root package name */
    protected ExecutorService f21921m;

    /* renamed from: n, reason: collision with root package name */
    protected ExecutorService f21922n;

    /* renamed from: o, reason: collision with root package name */
    protected List f21923o;

    /* renamed from: p, reason: collision with root package name */
    private C1632d0 f21924p;

    public class a implements C1634e0.a {
        public a() {
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            m5.this.f21916g.a(uri);
            com.applovin.impl.sdk.o oVar = m5.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var = m5.this;
                m5Var.f21768c.a(m5Var.f21767b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    public class b implements C1634e0.a {
        public b() {
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            m5.this.f21916g.b(uri);
            com.applovin.impl.sdk.o oVar = m5.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var = m5.this;
                m5Var.f21768c.a(m5Var.f21767b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    public class c implements C1634e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1634e0.a f21927a;

        public c(C1634e0.a aVar) {
            this.f21927a = aVar;
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = m5.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    m5 m5Var = m5.this;
                    m5Var.f21768c.b(m5Var.f21767b, "Failed to cache video");
                }
                m5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", m5.this.f21916g.getAdIdNumber());
                m5.this.f21766a.t().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = m5.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var2 = m5.this;
                m5Var2.f21768c.a(m5Var2.f21767b, "Finish caching video for ad #" + m5.this.f21916g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f21927a.a(uri);
        }
    }

    public class d implements C1632d0.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f21929a;

        public d(e eVar) {
            this.f21929a = eVar;
        }

        @Override // com.applovin.impl.C1632d0.c
        public void a(String str, boolean z2) {
            if (z2) {
                m5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f21929a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    public m5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        this.f21918i = UUID.randomUUID().toString();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f21916g = bVar;
        this.f21917h = appLovinAdLoadListener;
        this.f21919j = kVar.G();
        this.k = h();
        if (((Boolean) kVar.a(y4.f23650N0)).booleanValue()) {
            if (kVar.r0().f()) {
                this.f21921m = kVar.r0().a();
                this.f21922n = kVar.r0().e();
            } else {
                String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
                this.f21921m = kVar.r0().a(R8.v.f("com.applovin.sdk.caching.", mediationServeId), ((Integer) kVar.a(y4.f23665P0)).intValue());
                this.f21922n = kVar.r0().a(R8.v.f("com.applovin.sdk.caching.html.", mediationServeId), ((Integer) kVar.a(y4.f23673Q0)).intValue());
            }
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f21766a.a(y4.f23613I0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f21917h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f21916g);
            this.f21917h = null;
        }
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.O().equalsIgnoreCase(this.f21916g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Updating flag for timeout...");
            }
            g();
        }
        this.f21766a.Z().b(this);
    }

    public C1634e0 b(String str, C1634e0.a aVar) {
        return a(str, this.f21916g.S(), true, aVar);
    }

    public Uri c(String str) {
        return b(str, this.f21916g.S(), true);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Rendered new ad:" + this.f21916g);
        }
        AppLovinSdkUtils.runOnUiThread(new D0(this, 10));
    }

    public void g() {
        this.f21920l = true;
        List list = this.f21923o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f21923o.iterator();
            while (it.hasNext()) {
                ((AbstractCallableC1630c0) it.next()).a(true);
            }
        }
        if (this.f21766a.r0().f()) {
            C1632d0 c1632d0 = this.f21924p;
            if (c1632d0 != null) {
                c1632d0.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f21921m;
        if (executorService != null) {
            executorService.shutdown();
            this.f21921m = null;
        }
        ExecutorService executorService2 = this.f21922n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f21922n = null;
        }
    }

    public void j() {
        if (AbstractC1654o0.e()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching mute images...");
        }
        Uri uriA = a(this.f21916g.G(), "mute");
        if (uriA != null) {
            this.f21916g.a(uriA);
        }
        Uri uriA2 = a(this.f21916g.Y(), "unmute");
        if (uriA2 != null) {
            this.f21916g.b(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Ad updated with muteImageFilename = " + this.f21916g.G() + ", unmuteImageFilename = " + this.f21916g.Y());
        }
    }

    public void k() {
        this.f21766a.Z().b(this);
        if (!this.f21766a.r0().f()) {
            ExecutorService executorService = this.f21921m;
            if (executorService != null) {
                executorService.shutdown();
                this.f21921m = null;
            }
            ExecutorService executorService2 = this.f21922n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f21922n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f21916g.getAdZone().d();
        if (((Boolean) this.f21766a.a(y4.f23766c1)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f21766a.h().b(this.f21916g);
        }
        this.f21766a.d0().a(this.f21918i);
    }

    public boolean l() {
        return this.f21920l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f21916g.b1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Subscribing to timeout events...");
            }
            this.f21766a.Z().a(this);
        }
    }

    public Uri b(String str, List list, boolean z2) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching video " + str + "...");
        }
        int iA = this.f21766a.G().a(str, this.f21916g);
        Map mapA = f2.a((AppLovinAdImpl) this.f21916g);
        String strA = this.f21919j.a(a(), str, this.f21916g.getCachePrefix(), list, z2, iA, this.f21918i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f21919j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Finish caching video for ad #" + this.f21916g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    public String c(String str, List list, boolean z2) {
        try {
            InputStream inputStreamA = this.f21919j.a(str, list, z2, f2.a((AppLovinAdImpl) this.f21916g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.f21919j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Unknown failure to read input stream.", th);
            }
            this.f21768c.a(this.f21767b, th);
            this.f21766a.D().a(this.f21767b, "readInputStreamAsString", th);
            return null;
        }
    }

    public List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f21916g.G() != null) {
            arrayList.add(a(this.f21916g.G().toString(), new a()));
        }
        if (this.f21916g.Y() != null) {
            arrayList.add(a(this.f21916g.Y().toString(), new b()));
        }
        return arrayList;
    }

    public List a(List list) {
        this.f21923o = list;
        return this.f21766a.r0().a(list, this.f21921m);
    }

    public C1634e0 a(String str, C1634e0.a aVar) {
        return new C1634e0(str, this.f21916g, this.f21918i, this.f21766a, aVar);
    }

    public C1634e0 a(String str, List list, boolean z2, C1634e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f21768c.a(this.f21767b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching video " + str + "...");
        }
        return new C1634e0(str, this.f21916g, list, z2, this.f21918i, this.f21766a, new c(aVar));
    }

    public C1632d0 a(String str, List list, e eVar) {
        C1632d0 c1632d0 = new C1632d0(str, this.f21916g, list, this.f21922n, this.f21918i, this.f21766a, new d(eVar));
        this.f21924p = c1632d0;
        return c1632d0;
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching " + str + " image...");
        }
        return b(string);
    }

    public Uri b(String str) {
        return a(str, this.f21916g.S(), true);
    }

    public Uri a(String str, List list, boolean z2) {
        try {
            int iA = this.f21766a.G().a(str, this.f21916g);
            Map mapA = f2.a((AppLovinAdImpl) this.f21916g);
            String strA = this.f21919j.a(a(), str, this.f21916g.getCachePrefix(), list, z2, iA, this.f21918i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f21919j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21768c.b(this.f21767b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Failed to cache image at url = " + str, th);
            }
            Map mapA2 = f2.a((AppLovinAdImpl) this.f21916g);
            CollectionUtils.putStringIfValid("url", str, mapA2);
            this.f21766a.D().a(this.f21767b, "cacheImageResource", th, mapA2);
            return null;
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(strA0)) {
            String strA = a(strA0, bVar.S(), bVar);
            bVar.c(strA);
            this.f21768c.f(this.f21767b, "Ad updated with video button HTML assets cached = " + strA);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r12, java.util.List r13, com.applovin.impl.sdk.ad.b r14) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L8
            goto Lfd
        L8:
            com.applovin.impl.sdk.k r0 = r11.f21766a
            com.applovin.impl.y4 r1 = com.applovin.impl.y4.f23620J0
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L28
            boolean r13 = com.applovin.impl.sdk.o.a()
            if (r13 == 0) goto Lfd
            com.applovin.impl.sdk.o r13 = r11.f21768c
            java.lang.String r14 = r11.f21767b
            java.lang.String r0 = "Resource caching is disabled, skipping cache..."
            r13.a(r14, r0)
            return r12
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.util.List r1 = r14.Q()
            java.util.List r2 = r14.H()
            java.util.Iterator r13 = r13.iterator()
        L39:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto Lfe
            java.lang.Object r3 = r13.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = r4
        L47:
            int r6 = r0.length()
            if (r4 >= r6) goto L39
            boolean r4 = r11.l()
            if (r4 == 0) goto L55
            goto Lfd
        L55:
            int r4 = r0.indexOf(r3, r5)
            r5 = -1
            if (r4 != r5) goto L5d
            goto L39
        L5d:
            int r5 = r0.length()
            r6 = r4
        L62:
            java.util.Collection r7 = r11.k
            char r8 = r0.charAt(r6)
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L77
            if (r6 >= r5) goto L77
            int r6 = r6 + 1
            goto L62
        L77:
            if (r6 <= r4) goto Lee
            if (r6 == r5) goto Lee
            int r5 = r3.length()
            int r5 = r5 + r4
            java.lang.String r5 = r0.substring(r5, r6)
            java.lang.String r7 = N0.a.f(r3, r5)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r5)
            if (r8 == 0) goto Ldc
            boolean r8 = r2.contains(r7)
            if (r8 != 0) goto Ldc
            android.net.Uri r5 = r11.a(r3, r5)
            if (r5 == 0) goto La9
            java.lang.String r8 = r5.toString()
            r0.replace(r4, r6, r8)
            java.lang.String r5 = r5.toString()
            r14.a(r5, r7)
            goto Leb
        La9:
            boolean r5 = r1.contains(r7)
            if (r5 == 0) goto Lb7
            r5 = -203(0xffffffffffffff35, float:NaN)
            r11.a(r5)
            r5 = 1
            r11.f21920l = r5
        Lb7:
            boolean r5 = com.applovin.impl.sdk.o.a()
            if (r5 == 0) goto Ld2
            com.applovin.impl.sdk.o r5 = r11.f21768c
            java.lang.String r8 = r11.f21767b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to cache HTML Resource: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r5.b(r8, r9)
        Ld2:
            java.util.Map r5 = com.applovin.impl.f2.a(r14)
            java.lang.String r8 = "cacheHtmlResource"
            r11.a(r7, r8, r5)
            goto Leb
        Ldc:
            boolean r7 = com.applovin.impl.sdk.o.a()
            if (r7 == 0) goto Leb
            com.applovin.impl.sdk.o r7 = r11.f21768c
            java.lang.String r8 = r11.f21767b
            java.lang.String r9 = "Skip caching of optional or non-resource: "
            cb.AbstractC1593a.s(r9, r5, r7, r8)
        Leb:
            r5 = r6
            goto L47
        Lee:
            boolean r13 = com.applovin.impl.sdk.o.a()
            if (r13 == 0) goto Lfd
            com.applovin.impl.sdk.o r13 = r11.f21768c
            java.lang.String r14 = r11.f21767b
            java.lang.String r0 = "Unable to cache resource; ad HTML is invalid."
            r13.b(r14, r0)
        Lfd:
            return r12
        Lfe:
            java.lang.String r12 = r0.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.m5.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    private Uri a(String str, String str2) {
        File fileA = this.f21919j.a(o7.a(Uri.parse(str2), this.f21916g.getCachePrefix(), this.f21766a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f21766a.a(y4.f23687R6)).booleanValue() && this.f21919j.a(fileA)) {
            return Uri.parse("file://" + fileA.getAbsolutePath());
        }
        String strF = N0.a.f(str, str2);
        if (!this.f21919j.a(fileA, strF, Arrays.asList(str), this.f21766a.G().a(strF, this.f21916g), this.f21918i, f2.a((AppLovinAdImpl) this.f21916g))) {
            return null;
        }
        return Uri.parse("file://" + fileA.getAbsolutePath());
    }

    public void a(int i5) {
        if (this.f21917h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Calling back ad load failed with error code: " + i5);
            }
            this.f21917h.failedToReceiveAd(i5);
            this.f21917h = null;
        }
        g();
    }

    public void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f21766a.D().a(d2.f21279M0, str2, map2);
    }
}
