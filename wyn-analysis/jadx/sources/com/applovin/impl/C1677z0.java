package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.C1667u0;
import com.applovin.impl.C1669v0;
import com.applovin.impl.C1673x0;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1677z0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f23962a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23963b;

    /* renamed from: d, reason: collision with root package name */
    private List f23965d;

    /* renamed from: e, reason: collision with root package name */
    private String f23966e;

    /* renamed from: f, reason: collision with root package name */
    private C1669v0 f23967f;

    /* renamed from: g, reason: collision with root package name */
    private C1667u0.c f23968g;

    /* renamed from: h, reason: collision with root package name */
    private C1669v0 f23969h;

    /* renamed from: i, reason: collision with root package name */
    private Dialog f23970i;

    /* renamed from: j, reason: collision with root package name */
    private long f23971j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private long f23972l;

    /* renamed from: c, reason: collision with root package name */
    private final C1665t0 f23964c = new C1665t0();

    /* renamed from: m, reason: collision with root package name */
    private C1667u0.b f23973m = new C1667u0.b();

    /* renamed from: n, reason: collision with root package name */
    private final AbstractC1626b f23974n = new a();

    /* renamed from: com.applovin.impl.z0$a */
    public class a extends AbstractC1626b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || C1677z0.this.f23969h == null) {
                return;
            }
            if (C1677z0.this.f23970i != null) {
                C1677z0 c1677z0 = C1677z0.this;
                if (!AbstractC1631d.d(c1677z0.a(c1677z0.f23970i))) {
                    C1677z0.this.f23970i.dismiss();
                }
                C1677z0.this.f23970i = null;
            }
            C1669v0 c1669v0 = C1677z0.this.f23969h;
            C1677z0.this.f23969h = null;
            C1677z0 c1677z02 = C1677z0.this;
            c1677z02.a(c1677z02.f23967f, c1669v0, activity);
        }
    }

    /* renamed from: com.applovin.impl.z0$b */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f23976a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1673x0 f23977b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1669v0 f23978c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f23979d;

        public b(boolean z2, C1673x0 c1673x0, C1669v0 c1669v0, Activity activity) {
            this.f23976a = z2;
            this.f23977b = c1673x0;
            this.f23978c = c1669v0;
            this.f23979d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i5) {
            C1677z0.this.f23969h = null;
            C1677z0.this.f23970i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - C1677z0.this.f23972l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f23976a), mapHashMap);
            C1677z0.this.f23962a.w0().d(d2.f21332o, mapHashMap);
            C1669v0 c1669v0A = C1677z0.this.a(this.f23977b.a());
            if (c1669v0A == null) {
                C1677z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            C1677z0.this.a(this.f23978c, c1669v0A, this.f23979d);
            if (c1669v0A.d() != C1669v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.applovin.impl.z0$c */
    public class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f23981a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f23982b;

        public c(Uri uri, Activity activity) {
            this.f23981a = uri;
            this.f23982b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            o7.a(this.f23981a, this.f23982b, C1677z0.this.f23962a);
        }
    }

    /* renamed from: com.applovin.impl.z0$d */
    public class d extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f23984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f23985b;

        public d(Uri uri, Activity activity) {
            this.f23984a = uri;
            this.f23985b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            o7.a(this.f23984a, this.f23985b, C1677z0.this.f23962a);
        }
    }

    /* renamed from: com.applovin.impl.z0$e */
    public class e implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f23987a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1669v0 f23988b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f23989c;

        public e(long j8, C1669v0 c1669v0, Activity activity) {
            this.f23987a = j8;
            this.f23988b = c1669v0;
            this.f23989c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            C1677z0.this.f23973m.a(appLovinCmpError);
            C1677z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f23987a);
            C1677z0.this.a(this.f23988b, this.f23989c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* renamed from: com.applovin.impl.z0$f */
    public class f implements CmpServiceImpl.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f23991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1669v0 f23992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f23993c;

        public f(long j8, C1669v0 c1669v0, Activity activity) {
            this.f23991a = j8;
            this.f23992b = c1669v0;
            this.f23993c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            C1677z0.this.f23973m.a(appLovinCmpError);
            C1677z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f23991a);
            C1677z0.this.a(this.f23992b, this.f23993c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* renamed from: com.applovin.impl.z0$g */
    public class g implements CmpServiceImpl.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f23995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1669v0 f23996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f23997c;

        public g(long j8, C1669v0 c1669v0, Activity activity) {
            this.f23995a = j8;
            this.f23996b = c1669v0;
            this.f23997c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f23995a));
            if (appLovinCmpError != null) {
                C1677z0.this.f23973m.a(appLovinCmpError);
                mapHashMap.putAll(C1677z0.this.a(appLovinCmpError));
                C1677z0.this.f23962a.w0().d(d2.f21342t, mapHashMap);
            } else {
                C1677z0.this.f23973m.c();
                C1677z0.this.f23962a.w0().d(d2.f21344u, mapHashMap);
            }
            C1677z0.this.b(this.f23996b, this.f23997c);
        }
    }

    /* renamed from: com.applovin.impl.z0$h */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1669v0 f23999a;

        public h(C1669v0 c1669v0) {
            this.f23999a = c1669v0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1677z0 c1677z0 = C1677z0.this;
            c1677z0.a(c1677z0.f23967f, this.f23999a, C1677z0.this.f23962a.v0());
        }
    }

    public C1677z0(com.applovin.impl.sdk.k kVar) {
        this.f23962a = kVar;
        this.f23963b = ((Integer) kVar.a(y4.f23756a7)).intValue();
    }

    private void c(C1669v0 c1669v0, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.f(this, c1669v0, activity, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(C1669v0 c1669v0, Activity activity) {
        a(c1669v0, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f23971j));
        CollectionUtils.putStringIfValid("details", this.f23964c.toString(), mapHashMap);
        this.f23962a.w0().d(d2.f21346v, mapHashMap);
        this.f23965d = null;
        this.f23967f = null;
        this.f23971j = 0L;
        this.k = 0L;
        this.f23972l = 0L;
        this.f23964c.a();
        this.f23962a.e().b(this.f23974n);
        C1667u0.c cVar = this.f23968g;
        if (cVar != null) {
            cVar.a(this.f23973m);
            this.f23968g = null;
        }
        this.f23973m = new C1667u0.b();
    }

    public void a(Activity activity, C1667u0.c cVar) {
        a(C1669v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i5, Activity activity, C1667u0.c cVar) {
        if (this.f23965d != null) {
            this.f23962a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f23962a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f23965d);
            }
            this.f23962a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f23962a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f23965d);
            }
            cVar.a(new C1667u0.b(new C1661s0(C1661s0.f22753d, "Consent flow is already in progress.")));
            return;
        }
        List listA = AbstractC1625a1.a(this.f23962a);
        this.f23965d = listA;
        this.f23966e = String.valueOf(listA);
        this.f23968g = cVar;
        C1669v0 c1669v0A = a(i5);
        this.f23962a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f23962a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f23965d + "\nInitial state: " + c1669v0A);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f23974n);
        this.f23962a.w0().a(d2.f21328m);
        this.f23971j = SystemClock.elapsedRealtime();
        a((C1669v0) null, c1669v0A, activity);
    }

    public boolean a() {
        return this.f23965d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C1669v0 c1669v0, Activity activity, Boolean bool) {
        a(c1669v0, a(c1669v0.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C1669v0 c1669v0, C1669v0 c1669v02, Activity activity) {
        this.f23967f = c1669v0;
        c(c1669v02, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C1669v0 c1669v0, final Activity activity) {
        boolean z2;
        SpannableString spannableString;
        if (c1669v0 == null) {
            a("Consent flow state is null");
            return;
        }
        this.f23962a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f23962a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + c1669v0);
        }
        long jElapsedRealtime = this.f23967f != null ? SystemClock.elapsedRealtime() - this.k : 0L;
        this.k = SystemClock.elapsedRealtime();
        this.f23964c.a(c1669v0, jElapsedRealtime);
        if (c1669v0.d() == C1669v0.b.ALERT) {
            if (AbstractC1631d.d(activity)) {
                a(c1669v0);
                return;
            }
            this.f23962a.F().trackEvent("cf_start");
            C1671w0 c1671w0 = (C1671w0) c1669v0;
            this.f23969h = c1671w0;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f23962a.x().h();
            final boolean z10 = uriH != null;
            for (C1673x0 c1673x0 : c1671w0.f()) {
                b bVar = new b(z10, c1673x0, c1669v0, activity);
                if (c1673x0.c() == C1673x0.a.POSITIVE) {
                    builder.setPositiveButton(c1673x0.d(), bVar);
                } else if (c1673x0.c() == C1673x0.a.NEGATIVE) {
                    builder.setNegativeButton(c1673x0.d(), bVar);
                } else {
                    builder.setNeutralButton(c1673x0.d(), bVar);
                }
            }
            String strH = c1671w0.h();
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z10) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f23962a.x().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(c1671w0.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.A1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f20738a.a(alertDialogCreate, activity, z10, dialogInterface);
                }
            });
            this.f23970i = alertDialogCreate;
            alertDialogCreate.show();
            this.f23973m.d();
            return;
        }
        if (c1669v0.d() == C1669v0.b.POST_ALERT) {
            if (this.f23962a.x().k() && this.f23962a.x().m()) {
                if (AbstractC1631d.d(activity)) {
                    a(c1669v0);
                    return;
                } else {
                    this.f23962a.w0().a(d2.f21334p);
                    this.f23962a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), c1669v0, activity));
                    return;
                }
            }
            a(c1669v0, activity, Boolean.FALSE);
            return;
        }
        if (c1669v0.d() == C1669v0.b.EVENT) {
            C1675y0 c1675y0 = (C1675y0) c1669v0;
            String strG = c1675y0.g();
            Map<String, ?> mapF = c1675y0.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f23962a.F().trackEvent(strG, mapF);
            b(c1675y0, activity);
            return;
        }
        if (c1669v0.d() == C1669v0.b.CMP_LOAD) {
            if (AbstractC1631d.d(activity)) {
                a(c1669v0);
                return;
            } else if (this.f23962a.x().m()) {
                this.f23962a.s().preloadCmp(activity);
                a(c1669v0, activity, Boolean.FALSE);
                return;
            } else {
                this.f23962a.w0().a(d2.f21334p);
                this.f23962a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), c1669v0, activity));
                return;
            }
        }
        if (c1669v0.d() == C1669v0.b.CMP_SHOW) {
            if (AbstractC1631d.d(activity)) {
                a(c1669v0);
                return;
            }
            if (!this.f23962a.x().m()) {
                this.f23962a.F().trackEvent("cf_start");
            }
            this.f23962a.w0().a(d2.f21340s);
            this.f23962a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), c1669v0, activity));
            return;
        }
        if (c1669v0.d() == C1669v0.b.DECISION) {
            C1669v0.a aVarA = c1669v0.a();
            if (aVarA == C1669v0.a.IS_AL_GDPR) {
                boolean zK = this.f23962a.x().k();
                this.f23964c.a(c1669v0, zK, jElapsedRealtime);
                a(c1669v0, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == C1669v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z2 = !this.f23962a.A0() || ((Boolean) this.f23962a.a(a5.f20966t, Boolean.FALSE)).booleanValue();
                this.f23964c.a(c1669v0, z2, jElapsedRealtime);
                a(c1669v0, activity, Boolean.valueOf(z2));
                return;
            } else {
                if (aVarA != C1669v0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z2 = this.f23962a.x().h() != null;
                this.f23964c.a(c1669v0, z2, jElapsedRealtime);
                a(c1669v0, activity, Boolean.valueOf(z2));
                return;
            }
        }
        if (c1669v0.d() == C1669v0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + c1669v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z2, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f23963b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f23972l = SystemClock.elapsedRealtime();
        this.f23962a.w0().d(d2.f21330n, CollectionUtils.hashMap("details", String.valueOf(z2)));
    }

    private void a(C1669v0 c1669v0) {
        this.f23964c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(c1669v0), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.f23962a.D().a(d2.f21283O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f23966e + "\nLast successful state: " + this.f23967f));
        this.f23964c.b(str);
        C1667u0.b bVar = this.f23973m;
        if (bVar != null) {
            bVar.a(new C1661s0(C1661s0.f22754e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1669v0 a(int i5) {
        List<C1669v0> list = this.f23965d;
        if (list == null) {
            return null;
        }
        for (C1669v0 c1669v0 : list) {
            if (i5 == c1669v0.c()) {
                return c1669v0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j8) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j8));
        if (appLovinCmpError == null) {
            this.f23962a.w0().d(d2.f21336q, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f23962a.w0().d(d2.f21338r, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }
}
