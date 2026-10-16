package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.C1646k0;
import com.applovin.impl.o7;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.InterfaceC0018a {

    /* renamed from: a, reason: collision with root package name */
    private final k f22538a;

    /* renamed from: e, reason: collision with root package name */
    private AppLovinCmpError f22542e;

    /* renamed from: f, reason: collision with root package name */
    private e f22543f;

    /* renamed from: g, reason: collision with root package name */
    private f f22544g;

    /* renamed from: c, reason: collision with root package name */
    private final Object f22540c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private d f22541d = d.NONE;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.privacy.cmp.a f22539b = c();

    public class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f22545a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f22546b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        public class C0017a implements f {
            public C0017a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.f22545a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f22545a = onCompletedListener;
            this.f22546b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f22545a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f22546b, new C0017a());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f22549a;

        public b(Activity activity) {
            this.f22549a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f22539b.b(this.f22549a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f22551a;

        public c(Activity activity) {
            this.f22551a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f22539b.a(this.f22551a, CmpServiceImpl.this.a(), CmpServiceImpl.this);
        }
    }

    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.f22538a = kVar;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (o7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f22538a);
        }
        if (!this.f22538a.x().j()) {
            return null;
        }
        o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.f22539b.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f22539b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0018a
    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0018a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.f22540c) {
            try {
                if (this.f22543f == null) {
                    this.f22541d = d.COMPLETED;
                    this.f22542e = cmpErrorImpl;
                } else {
                    this.f22541d = d.NONE;
                    a(cmpErrorImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0018a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f22540c) {
            try {
                if (this.f22543f == null) {
                    this.f22541d = d.COMPLETED;
                } else {
                    this.f22541d = d.NONE;
                    a((AppLovinCmpError) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.InterfaceC0018a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.f22544g = fVar;
        if (this.f22539b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f22538a.O();
        if (o.a()) {
            this.f22538a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.f22538a.x().j()) {
            o.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f22543f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f22543f = null;
        this.f22542e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.f22544g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.f22544g = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.f22539b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z2;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f22540c) {
            if (eVar != null) {
                try {
                    this.f22543f = eVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d dVar = this.f22541d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.f22541d = d.LOADING;
                z2 = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.f22541d = dVar2;
                z2 = true;
            }
            if (z2) {
                a(this.f22542e);
                return;
            }
            c cVar = new c(activity);
            if (this.f22539b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1646k0 a() {
        return new C1646k0(this.f22538a.x().d());
    }
}
