package com.applovin.impl.sdk.nativeAd;

import C8.i;
import E4.n;
import J5.o;
import J5.t;
import N1.D;
import Q1.k;
import Q1.x;
import T3.m;
import Va.C1062m8;
import Va.X7;
import Wa.h;
import X2.j;
import Y2.B;
import a2.C1323c;
import a6.C1333b;
import ac.C1346a;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.sdk.AppLovinAd;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.MolocoAdError;
import com.qonversion.android.sdk.internal.AdvertisingProvider;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.core.properties.SdkProperties;
import dd.InterfaceC2422a;
import f5.C2570h;
import f6.C2584N;
import g2.AbstractC2671A;
import g2.AbstractC2677G;
import g2.C2672B;
import g2.C2673C;
import g2.C2674D;
import g2.C2693n;
import g2.C2694o;
import g2.RunnableC2692m;
import g2.u;
import g2.y;
import io.ktor.utils.io.T;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.f;
import jb.g;
import k2.C3146c;
import k2.X;
import kd.C3313i;
import kd.C3323t;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.C3407I;
import l8.C3410L;
import l8.e0;
import l8.j0;
import l8.t0;
import m9.G;
import m9.M;
import m9.O;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;
import p8.C3774a;
import p8.C3775b;
import p8.q;
import r7.AbstractC3935e;
import r9.K;
import s2.w;
import uc.C4281r;
import uc.InterfaceC4269f;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23151c;

    public /* synthetic */ e(int i5, Object obj, Object obj2) {
        this.f23149a = i5;
        this.f23150b = obj;
        this.f23151c = obj2;
    }

    private final void a() {
        C1323c c1323c;
        L8.a aVar = (L8.a) this.f23150b;
        g gVar = (g) this.f23151c;
        synchronized (aVar) {
            HashSet hashSet = new HashSet((HashSet) aVar.f6986d);
            ((HashSet) aVar.f6987e).remove(gVar);
            ((HashSet) aVar.f6986d).add(gVar);
            f fVar = gVar.f38724f;
            if (fVar == null || (c1323c = fVar.f38717a) == null || !((jb.e) c1323c.f17156b).j()) {
                f fVar2 = gVar.f38724f;
                if ((fVar2 != null ? fVar2.a() : null) != null) {
                    HashMap map = (HashMap) aVar.f6989g;
                    f fVar3 = gVar.f38724f;
                    map.remove(fVar3 != null ? fVar3.a() : null);
                }
            }
            aVar.g(gVar);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                aVar.g((g) it.next());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException, NumberFormatException {
        t oVar;
        long j8;
        String str;
        e0 e0VarA;
        m this$0;
        Object obj = null;
        int i5 = 0;
        switch (this.f23149a) {
            case 0:
                ((b) this.f23150b).b((AppLovinNativeAdImpl) this.f23151c);
                return;
            case 1:
                ((ImageView) this.f23150b).setImageBitmap((Bitmap) this.f23151c);
                return;
            case 2:
                ((AppLovinAdapterAdViewListener) this.f23150b).lambda$adReceived$0((AppLovinAd) this.f23151c);
                return;
            case 3:
                ((MolocoUnityShowCallback) this.f23150b).onAdShowFailed((String) this.f23151c, "Ad cannot be shown as it was not loaded");
                return;
            case 4:
                MolocoAdError molocoAdError = (MolocoAdError) this.f23151c;
                ((MolocoUnityShowCallback) this.f23150b).onAdShowFailed(molocoAdError.getAdUnitId(), molocoAdError.toString());
                return;
            case 5:
                AdvertisingProvider.init$lambda$2((Context) this.f23150b, (AdvertisingProvider.Callback) this.f23151c);
                return;
            case 6:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) this.f23150b, (String) this.f23151c);
                return;
            case 7:
                ((BiddingBaseManager) this.f23150b).lambda$uploadSignals$2((BiddingSignals) this.f23151c);
                return;
            case 8:
                ((BiddingBaseManager) this.f23150b).lambda$onUnityAdsTokenReady$0((String) this.f23151c);
                return;
            case 9:
                ((ShowOperationState) this.f23150b).lambda$onUnityAdsShowStart$2((String) this.f23151c);
                return;
            case 10:
                ((ShowOperationState) this.f23150b).lambda$onUnityAdsShowComplete$3((UnityAds.UnityAdsShowCompletionState) this.f23151c);
                return;
            case 11:
                SdkProperties.lambda$notifyInitializationFailed$1((InitializationListener) this.f23150b, (String) this.f23151c);
                return;
            case 12:
                SdkProperties.lambda$notifyInitializationFailed$2((IUnityAdsInitializationListener) this.f23150b, (String) this.f23151c);
                return;
            case 13:
                ((InterfaceC2422a) this.f23150b).g((q) this.f23151c);
                return;
            case 14:
                q qVar = (q) this.f23150b;
                Callable callable = (Callable) this.f23151c;
                if (qVar.f43295a instanceof C3774a) {
                    return;
                }
                try {
                    Object objCall = callable.call();
                    if (objCall == null) {
                        objCall = p8.m.f43294g;
                    }
                    if (p8.m.f43293f.i(qVar, null, objCall)) {
                        p8.m.c(qVar, false);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (p8.m.f43293f.i(qVar, null, new C3775b(th))) {
                        p8.m.c(qVar, false);
                        return;
                    }
                    return;
                }
            case 15:
                ((h) this.f23150b).f15449c.a(this.f23151c);
                return;
            case 16:
                C4281r c4281r = ((C2570h) this.f23150b).f34845b;
                if (c4281r != null) {
                    c4281r.a("notifyError", ((JSONObject) this.f23151c).toString(), null);
                    return;
                }
                return;
            case 17:
                C2584N c2584n = (C2584N) this.f23150b;
                C1333b c1333b = c2584n.f34944q;
                t tVar = (t) this.f23151c;
                if (c1333b == null) {
                    oVar = tVar;
                    j8 = -9223372036854775807L;
                } else {
                    j8 = -9223372036854775807L;
                    oVar = new o(-9223372036854775807L);
                }
                c2584n.f34951x = oVar;
                c2584n.f34952y = tVar.f();
                boolean z2 = !c2584n.f34922E && tVar.f() == j8;
                c2584n.f34953z = z2;
                c2584n.f34918A = z2 ? 7 : 1;
                c2584n.f34935g.s(c2584n.f34952y, tVar.e(), c2584n.f34953z);
                if (c2584n.f34948u) {
                    return;
                }
                c2584n.u();
                return;
            case 18:
                B b5 = (B) this.f23150b;
                AbstractC3409K abstractC3409K = (AbstractC3409K) this.f23151c;
                C2693n c2693n = (C2693n) b5.f16384c;
                c2693n.getClass();
                Pattern pattern = AbstractC2671A.f35503a;
                CharSequence charSequence = (CharSequence) abstractC3409K.get(0);
                Pattern pattern2 = AbstractC2671A.f35504b;
                boolean zMatches = pattern2.matcher(charSequence).matches();
                n nVar = c2693n.f35634g;
                if (!zMatches) {
                    Matcher matcher = AbstractC2671A.f35503a.matcher((CharSequence) abstractC3409K.get(0));
                    k.c(matcher.matches());
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    AbstractC2671A.a(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    Uri.parse(strGroup2);
                    int iIndexOf = abstractC3409K.indexOf("");
                    k.c(iIndexOf > 0);
                    List listSubList = abstractC3409K.subList(1, iIndexOf);
                    C1323c c1323c = new C1323c(10);
                    c1323c.F(listSubList);
                    C2694o c2694o = new C2694o(c1323c);
                    new B8.e(AbstractC2671A.f35510h).e(abstractC3409K.subList(iIndexOf + 1, abstractC3409K.size()));
                    String strB = c2694o.b("CSeq");
                    strB.getClass();
                    int i10 = Integer.parseInt(strB);
                    C2693n c2693n2 = (C2693n) nVar.f2940d;
                    n nVar2 = new n(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE, new C2694o(new C1323c(i10, c2693n2.f35630c, c2693n2.k)), "");
                    C2694o c2694o2 = (C2694o) nVar2.f2939c;
                    k.c(c2694o2.b("CSeq") != null);
                    C3406H c3406h = new C3406H(4);
                    int i11 = nVar2.f2938b;
                    if (i11 == 200) {
                        str = "OK";
                    } else if (i11 == 461) {
                        str = "Unsupported Transport";
                    } else if (i11 == 500) {
                        str = "Internal Server Error";
                    } else if (i11 == 505) {
                        str = "RTSP Version Not Supported";
                    } else if (i11 == 301) {
                        str = "Move Permanently";
                    } else if (i11 == 302) {
                        str = "Move Temporarily";
                    } else if (i11 == 400) {
                        str = "Bad Request";
                    } else if (i11 == 401) {
                        str = "Unauthorized";
                    } else if (i11 == 404) {
                        str = "Not Found";
                    } else if (i11 != 405) {
                        switch (i11) {
                            case 454:
                                str = "Session Not Found";
                                break;
                            case 455:
                                str = "Method Not Valid In This State";
                                break;
                            case 456:
                                str = "Header Field Not Valid";
                                break;
                            case 457:
                                str = "Invalid Range";
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        str = "Method Not Allowed";
                    }
                    int i12 = x.f9724a;
                    Locale locale = Locale.US;
                    c3406h.a("RTSP/1.0 " + i11 + StringUtils.SPACE + str);
                    C3410L c3410l = c2694o2.f35646a;
                    t0 it = c3410l.f40060d.keySet().iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        AbstractC3409K abstractC3409KD = c3410l.d(str2);
                        for (int i13 = 0; i13 < abstractC3409KD.size(); i13++) {
                            c3406h.a(String.format(Locale.US, "%s: %s", str2, abstractC3409KD.get(i13)));
                        }
                    }
                    c3406h.a("");
                    c3406h.a((String) nVar2.f2940d);
                    c2693n2.f35636i.b(c3406h.g());
                    nVar.f2938b = Math.max(nVar.f2938b, i10 + 1);
                    return;
                }
                Matcher matcher2 = pattern2.matcher((CharSequence) abstractC3409K.get(0));
                k.c(matcher2.matches());
                String strGroup3 = matcher2.group(1);
                strGroup3.getClass();
                int i14 = Integer.parseInt(strGroup3);
                int iIndexOf2 = abstractC3409K.indexOf("");
                k.c(iIndexOf2 > 0);
                List listSubList2 = abstractC3409K.subList(1, iIndexOf2);
                C1323c c1323c2 = new C1323c(10);
                c1323c2.F(listSubList2);
                C2694o c2694o3 = new C2694o(c1323c2);
                String strE = new B8.e(AbstractC2671A.f35510h).e(abstractC3409K.subList(iIndexOf2 + 1, abstractC3409K.size()));
                String strB2 = c2694o3.b("CSeq");
                strB2.getClass();
                int i15 = Integer.parseInt(strB2);
                SparseArray sparseArray = c2693n.f35633f;
                C2672B c2672b = (C2672B) sparseArray.get(i15);
                if (c2672b == null) {
                    return;
                }
                sparseArray.remove(i15);
                C1346a c1346a = c2693n.f35628a;
                int i16 = c2672b.f35512b;
                try {
                    try {
                        if (i14 == 200) {
                            switch (i16) {
                                case 1:
                                case 3:
                                case 7:
                                case 8:
                                case 9:
                                case 11:
                                case 12:
                                    return;
                                case 2:
                                    b5.v(new j(16, c2694o3, AbstractC2677G.a(strE)));
                                    return;
                                case 4:
                                    AbstractC3409K abstractC3409KJ = AbstractC3409K.j(AbstractC2671A.b(c2694o3.b("Public")));
                                    if (c2693n.f35639m != null) {
                                        return;
                                    }
                                    if (!abstractC3409KJ.isEmpty() && !abstractC3409KJ.contains(2)) {
                                        c1346a.N("DESCRIBE not supported.", null);
                                        return;
                                    }
                                    Uri uri = c2693n.f35635h;
                                    String str3 = c2693n.k;
                                    nVar.getClass();
                                    nVar.y(nVar.k(2, str3, j0.c(1, new Object[]{"Accept", "application/sdp"}, null), uri));
                                    return;
                                case 5:
                                    b5.x();
                                    return;
                                case 6:
                                    String strB3 = c2694o3.b("Range");
                                    C2673C c2673cA = strB3 == null ? C2673C.f35515c : C2673C.a(strB3);
                                    try {
                                        String strB4 = c2694o3.b("RTP-Info");
                                        if (strB4 == null) {
                                            C3407I c3407i = AbstractC3409K.f40056b;
                                            e0VarA = e0.f40101e;
                                        } else {
                                            e0VarA = C2674D.a(c2693n.f35635h, strB4);
                                        }
                                    } catch (D unused) {
                                        C3407I c3407i2 = AbstractC3409K.f40056b;
                                        e0VarA = e0.f40101e;
                                    }
                                    AbstractC3409K abstractC3409KJ2 = AbstractC3409K.j(e0VarA);
                                    int i17 = c2693n.f35641o;
                                    k.g(i17 == 1 || i17 == 2);
                                    c2693n.f35641o = 2;
                                    if (c2693n.f35639m == null) {
                                        long j10 = c2693n.f35638l / 2;
                                        RunnableC2692m runnableC2692m = new RunnableC2692m(c2693n, j10);
                                        c2693n.f35639m = runnableC2692m;
                                        if (!runnableC2692m.f35626c) {
                                            runnableC2692m.f35626c = true;
                                            runnableC2692m.f35624a.postDelayed(runnableC2692m, j10);
                                        }
                                    }
                                    c2693n.f35645s = -9223372036854775807L;
                                    c2693n.f35629b.M(x.K(c2673cA.f35517a), abstractC3409KJ2);
                                    return;
                                case 10:
                                    String strB5 = c2694o3.b("Session");
                                    String strB6 = c2694o3.b("Transport");
                                    if (strB5 == null || strB6 == null) {
                                        throw D.b("Missing mandatory session or transport header", null);
                                    }
                                    A2.d dVarC = AbstractC2671A.c(strB5);
                                    k.g(c2693n.f35641o != -1);
                                    c2693n.f35641o = 1;
                                    c2693n.k = (String) dVarC.f272c;
                                    c2693n.f35638l = dVarC.f271b;
                                    c2693n.b();
                                    return;
                                default:
                                    throw new IllegalStateException();
                            }
                        }
                        if (i14 == 401) {
                            if (c2693n.f35637j == null || c2693n.f35643q) {
                                C2693n.a(c2693n, new T(AbstractC2671A.h(i16) + StringUtils.SPACE + i14));
                                return;
                            }
                            AbstractC3409K abstractC3409KD2 = c2694o3.f35646a.d(C2694o.a("WWW-Authenticate"));
                            if (abstractC3409KD2.isEmpty()) {
                                throw D.b("Missing WWW-Authenticate header in a 401 response.", null);
                            }
                            for (int i18 = 0; i18 < abstractC3409KD2.size(); i18++) {
                                C1062m8 c1062m8E = AbstractC2671A.e((String) abstractC3409KD2.get(i18));
                                c2693n.f35640n = c1062m8E;
                                if (c1062m8E.f14387b == 2) {
                                    nVar.w();
                                    c2693n.f35643q = true;
                                    return;
                                }
                            }
                            nVar.w();
                            c2693n.f35643q = true;
                            return;
                        }
                        if (i14 == 461) {
                            String str4 = AbstractC2671A.h(i16) + StringUtils.SPACE + i14;
                            String strB7 = c2672b.f35513c.b("Transport");
                            strB7.getClass();
                            C2693n.a(c2693n, (i16 != 10 || strB7.contains("TCP")) ? new T(str4) : new u(str4));
                            return;
                        }
                        if (i14 != 301 && i14 != 302) {
                            C2693n.a(c2693n, new T(AbstractC2671A.h(i16) + StringUtils.SPACE + i14));
                            return;
                        }
                        if (c2693n.f35641o != -1) {
                            c2693n.f35641o = 0;
                        }
                        String strB8 = c2694o3.b(HttpHeaders.LOCATION);
                        if (strB8 == null) {
                            c1346a.N("Redirection without new location.", null);
                            return;
                        }
                        Uri uri2 = Uri.parse(strB8);
                        c2693n.f35635h = AbstractC2671A.f(uri2);
                        c2693n.f35637j = AbstractC2671A.d(uri2);
                        Uri uri3 = c2693n.f35635h;
                        String str5 = c2693n.k;
                        nVar.getClass();
                        nVar.y(nVar.k(2, str5, j0.c(1, new Object[]{"Accept", "application/sdp"}, null), uri3));
                        return;
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        C2693n.a(c2693n, new T(e));
                        return;
                    }
                } catch (D e10) {
                    e = e10;
                    C2693n.a(c2693n, new T(e));
                    return;
                }
            case 19:
                y yVar = (y) this.f23150b;
                byte[] bArr = (byte[]) this.f23151c;
                yVar.getClass();
                try {
                    yVar.f35695a.write(bArr);
                    return;
                } catch (Exception unused2) {
                    if (yVar.f35698d.f35705f) {
                        return;
                    }
                    B b10 = yVar.f35698d.f35700a;
                    return;
                }
            case 20:
                ((ProfileInstallerInitializer) this.f23150b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? i3.f.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new i3.c((Context) this.f23151c, i5), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 21:
                Runnable runnable = (Runnable) this.f23151c;
                this$0 = (m) this.f23150b;
                this$0.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 22:
                g gVar = (g) this.f23150b;
                gVar.getClass();
                f fVar = (f) this.f23151c;
                fVar.f38718b.run();
                gVar.f38724f = fVar;
                gVar.f38723e.run();
                return;
            case 23:
                a();
                return;
            case 24:
                ((Q1.c) this.f23150b).accept(this.f23151c);
                return;
            case 25:
                ((X) this.f23150b).B((w) this.f23151c);
                return;
            case 26:
                Runnable command = (Runnable) this.f23150b;
                AbstractC3340k.e(command, "$command");
                this$0 = (m) this.f23151c;
                AbstractC3340k.e(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                }
            case 27:
                C1915d c1915d = new C1915d(22);
                C3323t c3323t = (C3323t) this.f23150b;
                C3313i c3313i = c3323t.f39695b;
                String messageArg = (String) this.f23151c;
                AbstractC3340k.e(messageArg, "messageArg");
                i iVar = c3313i.f39663a;
                iVar.getClass();
                new X7((InterfaceC4269f) iVar.f1940c, iVar.q(), obj, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage").m(AbstractC3935e.D(c3323t, messageArg), new C3146c(c1915d, 19));
                return;
            case 28:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f23151c;
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f23150b;
                firebaseFirestore.getClass();
                try {
                    K.d0(firebaseFirestore.f27323b, firebaseFirestore.f27324c, firebaseFirestore.f27325d);
                    taskCompletionSource.setResult(null);
                    return;
                } catch (G e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            default:
                ((M) this.f23150b).f40440b.f14864b.a((O) this.f23151c);
                return;
        }
    }

    public /* synthetic */ e(y yVar, byte[] bArr, e0 e0Var) {
        this.f23149a = 19;
        this.f23150b = yVar;
        this.f23151c = bArr;
    }
}
