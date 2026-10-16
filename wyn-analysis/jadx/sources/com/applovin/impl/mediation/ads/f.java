package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.webkit.ClientCertRequest;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.ImageView;
import com.applovin.impl.AbstractC1626b;
import com.applovin.impl.C1669v0;
import com.applovin.impl.C1677z0;
import com.applovin.impl.Y;
import com.applovin.impl.d5;
import com.applovin.impl.e5;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.p8;
import com.applovin.impl.q5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t4;
import com.applovin.impl.w1;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.publisher.MolocoAdError;
import com.qonversion.android.sdk.internal.FacebookAttribution;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import f6.C2608u;
import g2.C2678H;
import g2.C2685f;
import g2.C2693n;
import g2.InterfaceC2684e;
import g2.q;
import g2.s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kd.T;
import kd.W;
import lb.C3456f;
import m9.F;
import m9.G;
import m9.N;
import m9.O;
import o9.i;
import o9.j;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.external.ExternalParser;
import p7.AbstractC3772b;
import p9.C3776A;
import p9.C3781b;
import p9.n;
import p9.u;
import p9.z;
import r9.C3950g;
import r9.C3955l;
import uc.C4281r;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22090d;

    public /* synthetic */ f(Object obj, Enum r22, String str, int i5) {
        this.f22087a = i5;
        this.f22089c = obj;
        this.f22090d = r22;
        this.f22088b = str;
    }

    /* JADX WARN: Type inference failed for: r3v34, types: [f6.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        char c10;
        N n10;
        char c11;
        long j8;
        int i5 = 24;
        int i10 = 25;
        switch (this.f22087a) {
            case 0:
                ((MaxFullscreenAdImpl.b) this.f22089c).a((String) this.f22088b, (MaxError) this.f22090d);
                return;
            case 1:
                p8.a((WebView) this.f22089c, (String) this.f22088b, (t4) this.f22090d);
                return;
            case 2:
                ((q5) this.f22089c).b((e5) this.f22088b, (d5.a) this.f22090d);
                return;
            case 3:
                ((com.applovin.impl.sdk.network.b) this.f22089c).b((com.applovin.impl.sdk.network.d) this.f22088b, (AppLovinPostbackListener) this.f22090d);
                return;
            case 4:
                ImageViewUtils.a((k) this.f22089c, (Bitmap) this.f22088b, (ImageView) this.f22090d);
                return;
            case 5:
                t2.a((MaxAdReviewListener) this.f22089c, (String) this.f22088b, (MaxAd) this.f22090d);
                return;
            case 6:
                ((t4) this.f22089c).b((Executor) this.f22088b, (t4.b) this.f22090d);
                return;
            case 7:
                ((w1) this.f22089c).a((AbstractC1626b) this.f22088b, (t4) this.f22090d);
                return;
            case 8:
                ((C1677z0) this.f22089c).a((C1669v0) this.f22088b, (Activity) this.f22090d);
                return;
            case 9:
                ((MolocoUnityLoadCallback) this.f22089c).onAdLoadFailed((String) this.f22088b, ((MolocoAdError.AdCreateError) this.f22090d).toString());
                return;
            case 10:
                ((MolocoUnityLoadCallback) this.f22089c).onAdLoadFailed((String) this.f22088b, ((MolocoAdError) this.f22090d).toString());
                return;
            case 11:
                FacebookAttribution.getAttributionId$lambda$0((FacebookAttribution) this.f22089c, (ContentResolver) this.f22088b, (WeakReference) this.f22090d);
                return;
            case 12:
                UnityAds.show$lambda$16$lambda$15$lambda$14((IUnityAdsShowListener) this.f22089c, (String) this.f22088b, (Throwable) this.f22090d);
                return;
            case 13:
                UnityAds.load$lambda$22$lambda$21$lambda$20((IUnityAdsLoadListener) this.f22089c, (String) this.f22088b, (Throwable) this.f22090d);
                return;
            case 14:
                ((LoadOperationState) this.f22089c).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) this.f22090d, (String) this.f22088b);
                return;
            case 15:
                ((IUnityAdsInitializationListener) this.f22089c).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.f22090d, (String) this.f22088b);
                return;
            case 16:
                com.unity3d.services.core.webview.WebView.evaluateJavascript$lambda$1((com.unity3d.services.core.webview.WebView) this.f22089c, (String) this.f22088b, (ValueCallback) this.f22090d);
                return;
            case 17:
                I5.f fVar = (I5.f) this.f22089c;
                this.f22088b.H(fVar.f5392a, fVar.f5393b, (C2608u) this.f22090d);
                return;
            case 18:
                com.unity3d.services.core.webview.b bVar = ((C2685f) this.f22089c).f35579c;
                String str = (String) this.f22088b;
                q qVar = (q) bVar.f32729b;
                qVar.f35651c = str;
                InterfaceC2684e interfaceC2684e = (InterfaceC2684e) this.f22090d;
                C2678H c2678hB = interfaceC2684e.B();
                s sVar = qVar.f35652d;
                if (c2678hB != null) {
                    C2693n c2693n = sVar.f35662d;
                    int iP = interfaceC2684e.p();
                    c2693n.f35636i.f35702c.put(Integer.valueOf(iP), c2678hB);
                    sVar.f35679v = true;
                }
                sVar.p();
                return;
            case 19:
                C1915d c1915d = new C1915d(i5);
                T t10 = (T) this.f22089c;
                t10.f39614a.g(t10, (WebView) this.f22088b, (ClientCertRequest) this.f22090d, c1915d);
                return;
            case 20:
                C1915d c1915d2 = new C1915d(i5);
                T t11 = (T) this.f22089c;
                t11.f39614a.n(t11, (WebView) this.f22088b, (WebResourceRequest) this.f22090d, c1915d2);
                return;
            case 21:
                C1915d c1915d3 = new C1915d(i10);
                W w2 = (W) this.f22089c;
                w2.f39626a.g(w2, (WebView) this.f22088b, (ClientCertRequest) this.f22090d, c1915d3);
                return;
            case 22:
                C1915d c1915d4 = new C1915d(i10);
                W w3 = (W) this.f22089c;
                w3.f39626a.n(w3, (WebView) this.f22088b, (WebResourceRequest) this.f22090d, c1915d4);
                return;
            case 23:
                C4281r c4281r = ((C3456f) this.f22089c).f40225b;
                if (c4281r != null) {
                    c4281r.a((String) this.f22088b, (Serializable) this.f22090d, null);
                    return;
                }
                return;
            case 24:
                ((tc.g) this.f22089c).b("DISK_SPACE_ERROR", ((String) this.f22088b) + ": " + ((Exception) this.f22090d).getMessage(), null);
                return;
            case 25:
                ((ExternalParser) this.f22089c).lambda$extractMetadata$2((InputStream) this.f22088b, (Metadata) this.f22090d);
                return;
            case 26:
                C3781b c3781b = (C3781b) this.f22089c;
                Object obj = this.f22088b;
                G g9 = (G) this.f22090d;
                if (c3781b.f43341c) {
                    return;
                }
                c3781b.f43340b.a(obj, g9);
                return;
            case 27:
                o9.f fVar2 = (o9.f) this.f22088b;
                ByteArrayInputStream byteArrayInputStream = fVar2.f41446b;
                N n11 = (N) this.f22090d;
                z zVar = ((n) this.f22089c).f43387i;
                C3955l c3955l = zVar.f43431a;
                AbstractC3772b abstractC3772b = c3955l.f44631a;
                try {
                    try {
                        o9.e eVar = fVar2.f41447c;
                        n10 = null;
                        try {
                            if (eVar != null) {
                                c11 = 0;
                            } else {
                                try {
                                    o9.c cVarC = fVar2.c();
                                    c11 = 0;
                                    try {
                                        if (!(cVarC instanceof o9.e)) {
                                            fVar2.a("Expected first element in bundle to be a metadata object");
                                            throw null;
                                        }
                                        eVar = (o9.e) cVarC;
                                        fVar2.f41447c = eVar;
                                        fVar2.f41449e = 0L;
                                    } catch (Exception e7) {
                                        e = e7;
                                        n10 = n11;
                                        Object[] objArr = new Object[1];
                                        objArr[c11] = e;
                                        Ba.c.p("Firestore", "Loading bundle failed : %s", 2, objArr);
                                        n10.b(new G("Bundle failed to load", F.INVALID_ARGUMENT, e));
                                        try {
                                            byteArrayInputStream.close();
                                            return;
                                        } catch (IOException e10) {
                                            Object[] objArr2 = new Object[1];
                                            objArr2[c11] = e10;
                                            Ba.c.p("SyncEngine", "Exception while closing bundle", 2, objArr2);
                                            return;
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    c11 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    c10 = 0;
                                    Throwable th2 = th;
                                    try {
                                        byteArrayInputStream.close();
                                        throw th2;
                                    } catch (IOException e12) {
                                        Object[] objArr3 = new Object[1];
                                        objArr3[c10] = e12;
                                        Ba.c.p("SyncEngine", "Exception while closing bundle", 2, objArr3);
                                        throw th2;
                                    }
                                }
                            }
                            if (((Boolean) abstractC3772b.O("Has newer bundle", new aa.f(22, c3955l, eVar))).booleanValue()) {
                                int i11 = eVar.f41442d;
                                long j10 = eVar.f41443e;
                                n11.c(new O(i11, i11, j10, j10, null, 3));
                                try {
                                    byteArrayInputStream.close();
                                    return;
                                } catch (IOException e13) {
                                    Object[] objArr4 = new Object[1];
                                    objArr4[c11] = e13;
                                    Ba.c.p("SyncEngine", "Exception while closing bundle", 2, objArr4);
                                    return;
                                }
                            }
                            n11.d(new O(0, eVar.f41442d, 0L, eVar.f41443e, null, 2));
                            o9.d dVar = new o9.d(c3955l, eVar);
                            long j11 = 0;
                            while (true) {
                                if (fVar2.f41447c != null) {
                                    j8 = j11;
                                } else {
                                    o9.c cVarC2 = fVar2.c();
                                    if (!(cVarC2 instanceof o9.e)) {
                                        fVar2.a("Expected first element in bundle to be a metadata object");
                                        throw null;
                                    }
                                    fVar2.f41447c = (o9.e) cVarC2;
                                    j8 = j11;
                                    fVar2.f41449e = 0L;
                                }
                                o9.c cVarC3 = fVar2.c();
                                if (cVarC3 == null) {
                                    zVar.b(dVar.b(), null);
                                    abstractC3772b.P("Save bundle", new ng.a(11, c3955l, eVar));
                                    int i12 = eVar.f41442d;
                                    long j12 = eVar.f41443e;
                                    n11.c(new O(i12, i12, j12, j12, null, 3));
                                    try {
                                        byteArrayInputStream.close();
                                        return;
                                    } catch (IOException e14) {
                                        Object[] objArr5 = new Object[1];
                                        objArr5[c11] = e14;
                                        Ba.c.p("SyncEngine", "Exception while closing bundle", 2, objArr5);
                                        return;
                                    }
                                }
                                long j13 = fVar2.f41449e;
                                O oA = dVar.a(cVarC3, j13 - j8);
                                if (oA != null) {
                                    n11.d(oA);
                                }
                                j11 = j13;
                            }
                        } catch (Exception e15) {
                            e = e15;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e16) {
                    e = e16;
                    n10 = n11;
                    c11 = 0;
                } catch (Throwable th4) {
                    th = th4;
                    c10 = 0;
                }
            case 28:
                z zVar2 = ((n) this.f22089c).f43387i;
                zVar2.a("writeMutations");
                C3955l c3955l2 = zVar2.f43431a;
                s8.q qVar2 = new s8.q(new Date());
                HashSet hashSet = new HashSet();
                List list = (List) this.f22088b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(((t9.h) it.next()).f45951a);
                }
                C3950g c3950g = (C3950g) c3955l2.f44631a.O("Locally write mutations", new Y(c3955l2, hashSet, list, qVar2));
                int i13 = c3950g.f44617a;
                HashMap map = zVar2.f43439i;
                Map map2 = (Map) map.get(zVar2.f43441l);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(zVar2.f43441l, map2);
                }
                map2.put(Integer.valueOf(i13), (TaskCompletionSource) this.f22090d);
                zVar2.b(c3950g.f44618b, null);
                zVar2.f43432b.i();
                return;
            default:
                C3955l c3955l3 = ((n) this.f22089c).f43385g;
                c3955l3.getClass();
                j jVar = (j) c3955l3.f44631a.O("Get named query", new aa.f(19, c3955l3, (String) this.f22088b));
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f22090d;
                if (jVar == null) {
                    taskCompletionSource.setResult(null);
                    return;
                }
                i iVar = jVar.f41459b;
                C3776A c3776a = iVar.f41456a;
                taskCompletionSource.setResult(new u(c3776a.f43310d, c3776a.f43311e, c3776a.f43309c, c3776a.f43308b, c3776a.f43312f, iVar.f41457b, c3776a.f43313g, c3776a.f43314h));
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i5) {
        this.f22087a = i5;
        this.f22089c = obj;
        this.f22088b = obj2;
        this.f22090d = obj3;
    }
}
