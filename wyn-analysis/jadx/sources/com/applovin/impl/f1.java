package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import b.C1489b;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p9.C3778C;
import u.AbstractC4159a;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21534a;

    /* renamed from: b, reason: collision with root package name */
    private u.g f21535b;

    public class a extends u.m {
        public a() {
        }

        @Override // u.m
        public void onCustomTabsServiceConnected(ComponentName componentName, u.g gVar) {
            f1.this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f21534a.O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.this.f21535b = gVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f1.this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.this.f21534a.O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.this.f21535b = null;
        }
    }

    public class b extends AbstractC4159a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f21537a;

        public b(com.applovin.impl.adview.a aVar) {
            this.f21537a = new WeakReference(aVar);
        }

        @Override // u.AbstractC4159a
        public void onNavigationEvent(int i5, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.f21537a.get();
            if (aVar == null) {
                f1.this.f21534a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f21534a.O().b("CustomTabsManager", "Unable to track navigation event (" + i5 + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b bVarG = aVar.g();
            if (bVarG == null) {
                f1.this.f21534a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f21534a.O().b("CustomTabsManager", "Unable to track navigation event (" + i5 + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i5) {
                case 1:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackCustomTabsNavigationStarted(bVarG);
                        break;
                    }
                    break;
                case 2:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackCustomTabsNavigationFinished(bVarG);
                        break;
                    }
                    break;
                case 3:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackCustomTabsNavigationFailed(bVarG);
                        break;
                    }
                    break;
                case 4:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackCustomTabsNavigationAborted(bVarG);
                        break;
                    }
                    break;
                case 5:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackCustomTabsTabShown(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), bVarG, aVar.i());
                    break;
                case 6:
                    if (bVarG.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackCustomTabsTabHidden(bVarG);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), bVarG, aVar.i());
                    break;
                default:
                    f1.this.f21534a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f21534a.O().a("CustomTabsManager", "Unknown navigation event: " + i5);
                        break;
                    }
                    break;
            }
        }

        @Override // u.AbstractC4159a
        public void onRelationshipValidationResult(int i5, Uri uri, boolean z2, Bundle bundle) {
            f1.this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f21534a.O();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z2 ? "succeeded" : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i5);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public class c extends AbstractC4159a {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f21539a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f21539a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // u.AbstractC4159a
        public void onNavigationEvent(int i5, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f21539a.get();
            if (appLovinNativeAdImpl == null) {
                f1.this.f21534a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.this.f21534a.O().b("CustomTabsManager", "Unable to track navigation event (" + i5 + "). Native ad is null.");
                }
                return;
            }
            switch (i5) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.this.f21534a.k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.this.f21534a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.this.f21534a.O().a("CustomTabsManager", "Unknown navigation event: " + i5);
                        break;
                    }
                    break;
            }
        }

        @Override // u.AbstractC4159a
        public void onRelationshipValidationResult(int i5, Uri uri, boolean z2, Bundle bundle) {
            f1.this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVarO = f1.this.f21534a.O();
                StringBuilder sb2 = new StringBuilder("Validation ");
                sb2.append(z2 ? "succeeded" : "failed");
                sb2.append(" for session-URL relation(");
                sb2.append(i5);
                sb2.append("), requestedOrigin(");
                sb2.append(uri);
                sb2.append(")");
                oVarO.a("CustomTabsManager", sb2.toString());
            }
        }
    }

    public f1(com.applovin.impl.sdk.k kVar) {
        this.f21534a = kVar;
    }

    public void b(List list, u.n nVar) {
        if (list.isEmpty()) {
            return;
        }
        if (nVar != null) {
            a("warmup urls", new Ab.a(this, list, nVar, 22));
            return;
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public void a() {
        if (((Boolean) this.f21534a.a(y4.f23779d7)).booleanValue() && this.f21535b == null) {
            String strB = u.g.b(com.applovin.impl.sdk.k.o(), this.f21534a.c(y4.e7), true);
            String strB2 = u.g.b(com.applovin.impl.sdk.k.o(), null, false);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f21534a.a(y4.f23795f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(strB, linkedList);
                CollectionUtils.addUniqueObjectIfExists(strB2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f21534a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21534a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(g1 g1Var, u.n nVar) {
        u.g gVar = this.f21535b;
        gVar.getClass();
        try {
            ((C1489b) gVar.f46069a).X();
        } catch (RemoteException unused) {
        }
        if (g1Var == null) {
            return;
        }
        Integer numE = g1Var.e();
        String strB = g1Var.b();
        if (numE == null || TextUtils.isEmpty(strB)) {
            return;
        }
        if (nVar == null) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().a("CustomTabsManager", "Validating session-URL relation: " + numE + " with digital asset link: " + strB);
        }
        int iIntValue = numE.intValue();
        Uri uri = Uri.parse(strB);
        if (iIntValue < 1 || iIntValue > 2) {
            return;
        }
        try {
            ((C1489b) nVar.f46075b).W(nVar.f46076c, iIntValue, uri, new Bundle());
        } catch (RemoteException unused2) {
        }
    }

    private void a(LinkedList linkedList) {
        boolean zIsEmpty;
        boolean zA = false;
        try {
            zA = u.g.a(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!zA) {
                this.f21534a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21534a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th) {
            try {
                this.f21534a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21534a.O().a("CustomTabsManager", "Failed to bind to service", th);
                }
                if (zA) {
                    return;
                } else {
                    if (zIsEmpty) {
                        return;
                    }
                }
            } finally {
                if (!zA && !linkedList.isEmpty()) {
                    this.f21534a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21534a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
        if (zA || linkedList.isEmpty()) {
            return;
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
        }
    }

    public u.n a(com.applovin.impl.adview.a aVar) {
        if (this.f21535b == null) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            u.n nVarC = this.f21535b.c(new b(aVar));
            a(nVarC, aVar.g());
            return nVarC;
        } catch (Exception e7) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e7);
            }
            return null;
        }
    }

    public u.n a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f21535b == null) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            u.n nVarC = this.f21535b.c(new c(appLovinNativeAdImpl));
            a(nVarC, appLovinNativeAdImpl);
            return nVarC;
        } catch (Exception e7) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e7);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, u.n nVar) {
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        boolean zR = false;
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        Uri uri = Uri.parse(str);
        nVar.getClass();
        try {
            zR = ((C1489b) nVar.f46075b).R(nVar.f46076c, uri, new Bundle(), arrayList);
        } catch (RemoteException unused) {
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().a("CustomTabsManager", "Warmup for URLs ".concat(zR ? "succeeded" : "failed"));
        }
    }

    public void a(Uri uri, com.applovin.impl.adview.a aVar, Activity activity) {
        if (aVar.h() == null) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new Cb.a(this, aVar, activity, uri, 10))) {
            this.f21534a.n0().pauseForClick();
            return;
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        a(aVar, activity).a(activity, uri);
    }

    public boolean a(Uri uri, AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean zA = a("launch uri", new Cb.a(this, appLovinNativeAdImpl, activity, uri, 11));
        if (zA) {
            this.f21534a.n0().pauseForClick();
            return zA;
        }
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
        return zA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        a(appLovinNativeAdImpl, activity).a(activity, uri);
    }

    private void a(u.n nVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), nVar);
    }

    private void a(u.n nVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), nVar);
    }

    private void a(g1 g1Var, u.n nVar) {
        a("client warmup", new Ab.a(this, g1Var, nVar, 23));
    }

    private u.k a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b bVarG = aVar.g();
        return a(bVarG != null ? bVarG.getCustomTabsSettings() : null, bVarG != null ? bVarG.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private u.k a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private u.k a(g1 g1Var, Bundle bundle, u.n nVar, Activity activity) {
        this.f21534a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21534a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        C3778C c3778c = new C3778C(nVar);
        boolean zBooleanValue = ((Boolean) this.f21534a.a(y4.f23804g7)).booleanValue();
        Intent intent = (Intent) c3778c.f43324c;
        if (zBooleanValue) {
            int i5 = R.anim.applovin_slide_up_animation;
            int i10 = R.anim.applovin_slide_down_animation;
            c3778c.f43326e = ActivityOptions.makeCustomAnimation(activity, i5, i10);
            intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(activity, i5, i10).toBundle());
        }
        if (g1Var != null) {
            Integer numH = g1Var.h();
            if (numH != null) {
                int iIntValue = numH.intValue() | (-16777216);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue);
                c3778c.f43328g = bundle2;
            }
            Integer numA = g1Var.a();
            if (numA != null) {
                int iIntValue2 = numA.intValue() | (-16777216);
                if (((SparseArray) c3778c.f43327f) == null) {
                    c3778c.f43327f = new SparseArray();
                }
                SparseArray sparseArray = (SparseArray) c3778c.f43327f;
                Bundle bundle3 = new Bundle();
                bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iIntValue2);
                sparseArray.put(2, bundle3);
            }
            Boolean boolI = g1Var.i();
            if (boolI != null) {
                intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", boolI.booleanValue());
            }
            Boolean boolG = g1Var.g();
            if (boolG != null) {
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", boolG.booleanValue() ? 1 : 0);
            }
            Boolean boolC = g1Var.c();
            if (boolC != null) {
                c3778c.f43323b = boolC.booleanValue();
            }
            Integer numF = g1Var.f();
            if (numF != null) {
                c3778c.e(numF.intValue());
            }
        }
        u.k kVarB = c3778c.b();
        if (g1Var != null) {
            String strD = g1Var.d();
            Intent intent2 = kVarB.f46072a;
            if (strD != null) {
                intent2.putExtra("android.intent.extra.REFERRER", Uri.parse(strD));
            }
            if (!bundle.isEmpty()) {
                intent2.putExtra("com.android.browser.headers", bundle);
            }
        }
        return kVarB;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.f21534a.a(y4.f23813h7)).booleanValue()) {
            l7.a(uri, activity, this.f21534a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f21534a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.f21534a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f21534a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21534a.O().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f21534a.D().a("CustomTabsManager", str, th);
            return false;
        }
    }
}
