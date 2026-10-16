package com.google.android.gms.ads.nativead;

import Y2.B;
import a2.C1323c;
import a2.v;
import ac.C1346a;
import ad.L;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import ba.C1521a;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmp;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import ef.C2527k;
import f9.C2618a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import k1.InterfaceC3118e;
import kc.r;
import kotlin.jvm.internal.AbstractC3340k;
import nb.InterfaceC3613b;
import org.json.JSONException;
import org.json.JSONObject;
import p9.n;
import pb.RunnableC3790a;
import q.InterfaceC3815h0;
import q.InterfaceC3822l;
import q7.BinderC3877b;
import r0.InterfaceC3906k;
import r0.InterfaceC3910o;
import r9.RunnableC3954k;
import t0.t;
import t6.q;
import uc.C4278o;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import x6.InterfaceC4487r;
import zg.C4668g;
import zg.C4683w;
import zg.InterfaceC4666e;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements zzblz, AdShowListener, InterfaceC3815h0, InterfaceC3118e, p.i, InterfaceC4487r, InterfaceC3613b, InterfaceC4279p, InterfaceC4666e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26355a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26356b;

    public /* synthetic */ l(int i5, boolean z2) {
        this.f26355a = i5;
    }

    public static void h(t tVar) {
        P.d dVar;
        int i5;
        int i10 = 0;
        if (tVar.f45507N == 3 && !tVar.L && !tVar.f45505K && tVar.f45528s && (dVar = tVar.f45502H) != null && (i5 = dVar.f8972c) > 0) {
            Object[] objArr = dVar.f8970a;
            int i11 = 0;
            do {
                C2527k c2527k = (C2527k) objArr[i11];
                ((InterfaceC3910o) c2527k.f34672b).m((InterfaceC3906k) c2527k.f34671a);
                i11++;
            } while (i11 < i5);
        }
        tVar.f45503I = false;
        P.d dVarL = tVar.l();
        int i12 = dVarL.f8972c;
        if (i12 > 0) {
            Object[] objArr2 = dVarL.f8970a;
            do {
                h((t) objArr2[i10]);
                i10++;
            } while (i10 < i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kc.e] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, kc.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(uc.C4278o r13, uc.InterfaceC4280q r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nativead.l.k(uc.o, uc.q):void");
    }

    @Override // zg.InterfaceC4666e
    public Type a() {
        return (Type) this.f26356b;
    }

    public void b() {
        Dd.c cVar = (Dd.c) this.f26356b;
        synchronized (cVar) {
            cVar.C();
            ((n) cVar.f2643c).c(false);
        }
    }

    @Override // k1.InterfaceC3118e
    public ContentInfo c() {
        return (ContentInfo) this.f26356b;
    }

    @Override // k1.InterfaceC3118e
    public ClipData d() {
        return ((ContentInfo) this.f26356b).getClip();
    }

    @Override // zg.InterfaceC4666e
    public Object e(C4683w c4683w) {
        C4668g c4668g = new C4668g(c4683w);
        c4683w.i(new C1346a(c4668g, 27));
        return c4668g;
    }

    @Override // p.i
    public boolean f(p.k kVar, MenuItem menuItem) {
        InterfaceC3822l interfaceC3822l = ((ActionMenuView) this.f26356b).f17850z;
        return interfaceC3822l != null && ((Toolbar) ((L) interfaceC3822l).f17515b).f17967G.a(menuItem);
    }

    @Override // k1.InterfaceC3118e
    public int g() {
        return ((ContentInfo) this.f26356b).getFlags();
    }

    @Override // k1.InterfaceC3118e
    public int getSource() {
        return ((ContentInfo) this.f26356b).getSource();
    }

    public void i() {
        Dd.c cVar = (Dd.c) this.f26356b;
        synchronized (cVar) {
            cVar.C();
            ((n) cVar.f2643c).c(true);
        }
    }

    public void j(String str, String str2, InterfaceC4280q interfaceC4280q) {
        ((Handler) this.f26356b).post(new RunnableC3954k(interfaceC4280q, str, str2, 1));
    }

    public void l(InterfaceC4280q interfaceC4280q, Serializable serializable) {
        ((Handler) this.f26356b).post(new ng.a(15, interfaceC4280q, serializable));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        InterstitialAdShowListener interstitialAdShowListener = (InterstitialAdShowListener) this.f26356b;
        if (interstitialAdShowListener != null) {
            interstitialAdShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        InterstitialAdShowListener interstitialAdShowListener = (InterstitialAdShowListener) this.f26356b;
        if (interstitialAdShowListener != null) {
            interstitialAdShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // nb.InterfaceC3613b
    public void onAdLoaded() {
        RunnableC3790a runnableC3790a = (RunnableC3790a) this.f26356b;
        ((ConcurrentHashMap) ((pb.b) runnableC3790a.f43450c).f1971b).put(((nb.c) runnableC3790a.f43449b).f41000a, (vb.c) runnableC3790a.f43451d);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(MolocoAdError molocoAdError) {
        AbstractC3340k.e(molocoAdError, "molocoAdError");
        InterstitialAdShowListener interstitialAdShowListener = (InterstitialAdShowListener) this.f26356b;
        if (interstitialAdShowListener != null) {
            interstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        InterstitialAdShowListener interstitialAdShowListener = (InterstitialAdShowListener) this.f26356b;
        if (interstitialAdShowListener != null) {
            interstitialAdShowListener.onAdShowSuccess(molocoAd);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) throws JSONException {
        Bundle bundle;
        int i5 = 3;
        int i10 = 4;
        int i11 = 8;
        boolean z2 = false;
        z2 = false;
        int i12 = 1;
        switch (this.f26355a) {
            case 23:
                k(c4278o, interfaceC4280q);
                break;
            case 24:
                v vVar = (v) this.f26356b;
                if (((C1521a) vVar.f17322b) != null) {
                    String str = c4278o.f46759a;
                    str.getClass();
                    switch (str) {
                        case "Scribe.isFeatureAvailable":
                            try {
                                C1521a c1521a = (C1521a) vVar.f17322b;
                                if (Build.VERSION.SDK_INT < 34) {
                                    c1521a.getClass();
                                } else if (((InputMethodManager) c1521a.f19414b).isStylusHandwritingAvailable()) {
                                    z2 = true;
                                }
                                ((tc.g) interfaceC4280q).a(Boolean.valueOf(z2));
                                break;
                            } catch (IllegalStateException e7) {
                                ((tc.g) interfaceC4280q).b("error", e7.getMessage(), null);
                                return;
                            }
                        case "Scribe.startStylusHandwriting":
                            if (Build.VERSION.SDK_INT < 33) {
                                ((tc.g) interfaceC4280q).b("error", "Requires API level 33 or higher.", null);
                                break;
                            } else {
                                try {
                                    C1521a c1521a2 = (C1521a) vVar.f17322b;
                                    ((InputMethodManager) c1521a2.f19414b).startStylusHandwriting((r) c1521a2.f19415c);
                                    ((tc.g) interfaceC4280q).a(null);
                                    break;
                                } catch (IllegalStateException e10) {
                                    ((tc.g) interfaceC4280q).b("error", e10.getMessage(), null);
                                    return;
                                }
                            }
                        case "Scribe.isStylusHandwritingAvailable":
                            if (Build.VERSION.SDK_INT < 34) {
                                ((tc.g) interfaceC4280q).b("error", "Requires API level 34 or higher.", null);
                                break;
                            } else {
                                try {
                                    ((tc.g) interfaceC4280q).a(Boolean.valueOf(((InputMethodManager) ((C1521a) vVar.f17322b).f19414b).isStylusHandwritingAvailable()));
                                    break;
                                } catch (IllegalStateException e11) {
                                    ((tc.g) interfaceC4280q).b("error", e11.getMessage(), null);
                                    return;
                                }
                            }
                        default:
                            ((tc.g) interfaceC4280q).c();
                            break;
                    }
                }
                break;
            default:
                q qVar = (q) this.f26356b;
                if (((C1323c) qVar.f45907b) != null) {
                    String str2 = c4278o.f46759a;
                    str2.getClass();
                    Object obj = c4278o.f46760b;
                    switch (str2.hashCode()) {
                        case -1779068172:
                            if (str2.equals("TextInput.setPlatformViewClient")) {
                                break;
                            }
                            break;
                        case -1015421462:
                            if (str2.equals("TextInput.setEditingState")) {
                                break;
                            }
                            break;
                        case -37561188:
                            if (str2.equals("TextInput.setClient")) {
                                break;
                            }
                            break;
                        case 270476819:
                            if (str2.equals("TextInput.hide")) {
                                break;
                            }
                            break;
                        case 270803918:
                            if (str2.equals("TextInput.show")) {
                                break;
                            }
                            break;
                        case 649192816:
                            if (str2.equals("TextInput.sendAppPrivateCommand")) {
                                break;
                            }
                            break;
                        case 1204752139:
                            if (str2.equals("TextInput.setEditableSizeAndTransform")) {
                                break;
                            }
                            break;
                        case 1727570905:
                            if (str2.equals("TextInput.finishAutofillContext")) {
                                break;
                            }
                            break;
                        case 1904427655:
                            if (str2.equals("TextInput.clearClient")) {
                                break;
                            }
                            break;
                        case 2113369584:
                            if (str2.equals("TextInput.requestAutofill")) {
                                break;
                            }
                            break;
                    }
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Switch insn not found in header
                        	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        Method dump skipped, instructions count: 1052
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nativead.l.onMethodCall(uc.o, uc.q):void");
                }

                @Override // x6.InterfaceC4487r
                public void onUserEarnedReward(R6.b bVar) {
                    ((rb.j) this.f26356b).f44737c.onUserEarnedReward();
                }

                public String toString() {
                    switch (this.f26355a) {
                        case 7:
                            return "ContentInfoCompat{" + ((ContentInfo) this.f26356b) + "}";
                        default:
                            return super.toString();
                    }
                }

                @Override // p.i
                public void z(p.k kVar) {
                    C1323c c1323c = ((ActionMenuView) this.f26356b).f17845u;
                    if (c1323c != null) {
                        c1323c.z(kVar);
                    }
                }

                @Override // com.google.android.gms.internal.ads.zzblz
                public void zza(ImageView.ScaleType scaleType) {
                    zzbmp zzbmpVar = ((NativeAdView) this.f26356b).f26336b;
                    if (zzbmpVar == null || scaleType == null) {
                        return;
                    }
                    try {
                        zzbmpVar.zzdC(new BinderC3877b(scaleType));
                    } catch (RemoteException e7) {
                        H6.l.d("Unable to call setMediaViewImageScaleType on delegate", e7);
                    }
                }

                public /* synthetic */ l(Object obj, int i5) {
                    this.f26355a = i5;
                    this.f26356b = obj;
                }

                public l(int i5) {
                    this.f26355a = i5;
                    switch (i5) {
                        case 12:
                            this.f26356b = new AtomicLong();
                            break;
                        case 19:
                            this.f26356b = new Handler(Looper.getMainLooper());
                            break;
                        case 20:
                            this.f26356b = new P.d(new t[16]);
                            break;
                        default:
                            this.f26356b = new Bf.i("^[a-z][a-z0-9]*(\\.[a-z][a-z0-9]*)+$");
                            break;
                    }
                }

                public l(C2618a c2618a) {
                    Bundle bundle;
                    this.f26355a = 3;
                    Bundle bundle2 = new Bundle();
                    if (c2618a != null) {
                        if (c2618a.f35246e == null) {
                            new Bundle();
                        }
                        Bundle bundle3 = c2618a.f35246e;
                        Bundle bundle4 = (bundle3 == null ? new Bundle() : bundle3).getBundle("scionData");
                        if (bundle4 != null && (bundle = bundle4.getBundle("_cmp")) != null) {
                            String string = bundle.getString("medium");
                            if (!TextUtils.isEmpty(string)) {
                                bundle2.putString("utm_medium", string);
                            }
                            String string2 = bundle.getString("source");
                            if (!TextUtils.isEmpty(string2)) {
                                bundle2.putString("utm_source", string2);
                            }
                            String string3 = bundle.getString("campaign");
                            if (!TextUtils.isEmpty(string3)) {
                                bundle2.putString("utm_campaign", string3);
                            }
                        }
                    }
                    this.f26356b = bundle2;
                }

                public l(InterfaceC4269f interfaceC4269f) {
                    this.f26355a = 22;
                    new C4281r(interfaceC4269f, "flutter/keyboard", C4287x.f46768b, null).b(new B(this));
                }

                public l(JSONObject jSONObject, ArrayList arrayList, ArrayList arrayList2) {
                    this.f26355a = 17;
                    this.f26356b = jSONObject;
                }

                public l(ContentInfo contentInfo) {
                    this.f26355a = 7;
                    contentInfo.getClass();
                    this.f26356b = e1.c.k(contentInfo);
                }
            }
