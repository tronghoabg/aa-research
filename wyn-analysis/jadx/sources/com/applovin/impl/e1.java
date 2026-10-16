package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import cb.AbstractC1593a;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.apache.tika.mime.MimeTypes;

/* loaded from: classes.dex */
public class e1 implements m1.a {

    /* renamed from: m, reason: collision with root package name */
    private static WeakReference f21397m;

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f21398n = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21399a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21400b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f21401c;

    /* renamed from: e, reason: collision with root package name */
    private final d1 f21403e;

    /* renamed from: g, reason: collision with root package name */
    private m1 f21405g;

    /* renamed from: h, reason: collision with root package name */
    private h7 f21406h;

    /* renamed from: i, reason: collision with root package name */
    private int f21407i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21408j;
    private long k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21409l;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21402d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f21404f = new WeakReference(null);

    public class a extends LinkedHashMap {
        public a(int i5) {
            super(i5);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    public class b extends AbstractC1626b {
        public b() {
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.this.h() || e1.f21397m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = e1.f21397m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(e1.this.f21403e, e1.this.f21399a.e());
                }
                e1.f21398n.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = e1.f21397m = null;
            }
        }
    }

    public class c implements AbstractC1631d.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21412a;

        public c(Object obj) {
            this.f21412a = obj;
        }

        @Override // com.applovin.impl.AbstractC1631d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.f21412a, e1.this.f21399a.H().b()), e1.this.f21399a);
            e1.f21398n.set(false);
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.f21399a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f21400b = contextO;
        this.f21401c = new a(10);
        this.f21403e = new d1(contextO);
    }

    private void m() {
        this.f21399a.e().a(new b());
    }

    public void k() {
        m1 m1Var = this.f21405g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f21408j = ((Boolean) this.f21399a.a(y4.f23884q1)).booleanValue();
            if (this.f21405g == null) {
                this.f21405g = new m1(this.f21399a, this);
            }
            this.f21405g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f21398n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f21399a.H().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f21402d) {
            arrayList = new ArrayList(this.f21401c.values());
        }
        Collections.reverse(arrayList);
        this.f21403e.a(arrayList, this.f21399a);
        if (!this.f21409l) {
            m();
            this.f21409l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        AbstractC1631d.a(this.f21400b, MaxCreativeDebuggerActivity.class);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        AbstractC1631d.a(this.f21400b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f21399a.e(), new c(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f21397m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.k);
        if (this.k == 0 || seconds < 10) {
            return;
        }
        this.f21399a.D().a(d2.f21311d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f21399a.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f21407i = 0;
    }

    @Override // com.applovin.impl.m1.a
    public void b() {
        if (this.f21407i == 0) {
            this.f21406h = h7.a(TimeUnit.SECONDS.toMillis(3L), this.f21399a, new H(this, 0));
        }
        int i5 = this.f21407i;
        if (i5 % 2 == 0) {
            this.f21407i = i5 + 1;
        }
    }

    public boolean g() {
        return ((Boolean) this.f21399a.a(y4.f23875p1)).booleanValue() && this.f21399a.o0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof y2 ? ((y2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    @Override // com.applovin.impl.m1.a
    public void a() {
        int i5 = this.f21407i;
        if (i5 % 2 == 1) {
            this.f21407i = i5 + 1;
        }
        if (this.f21407i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new H(this, 1));
            this.f21407i = 0;
            this.f21406h.a();
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String strB = b(obj);
                synchronized (this.f21402d) {
                    try {
                        q1 q1Var = (q1) this.f21401c.get(strB);
                        if (q1Var != null) {
                            q1Var.a(obj);
                        } else {
                            this.f21401c.put(strB, new q1(obj, System.currentTimeMillis()));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f21404f.get() == null && !h()) {
            Activity activityB = this.f21399a.e().b();
            if (activityB == null) {
                this.f21399a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21399a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View viewFindViewById = activityB.findViewById(R.id.content);
                if (viewFindViewById instanceof FrameLayout) {
                    final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    final View viewA = a(frameLayout, activityB);
                    frameLayout.addView(viewA);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewA.startAnimation(alphaAnimation);
                    ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.I
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f20784a.a(viewA, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Kb.c(this, viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener, 2), TimeUnit.SECONDS.toMillis(5L));
                    this.f21404f = new WeakReference(viewA);
                }
            }
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f21408j) {
            view.setOnTouchListener(null);
            this.k = 0L;
        }
        frameLayout.removeView(view);
        this.f21404f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f21404f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.k > 0 && this.f21408j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(q1 q1Var) {
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        y2 y2VarE = q1Var.e();
        if (bVarC == null) {
            if (y2VarE != null) {
                return y2VarE.D();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(bVarC.getOriginalFullResponse().toString().getBytes(), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    private View a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i5 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i5, i5, i5, i5);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i5, i5, i5, i5 * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.f21408j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.J
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f20788a.a(frameLayout, view, motionEvent);
                }
            });
        } else {
            button.setOnClickListener(new K(this, 0));
        }
        if (AbstractC1654o0.e()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    private String b(Object obj) {
        String strO;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            strO = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            strO = obj instanceof y2 ? ((y2) obj).O() : null;
        }
        return StringUtils.isValidString(strO) ? strO : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new H(this, 2), TimeUnit.SECONDS.toMillis(10L));
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (view.getVisibility() == 0) {
            this.k = 0L;
            n();
            return true;
        }
        b(view, frameLayout);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z2) {
        String strA = a(q1Var);
        v2 v2Var = new v2();
        if (z2) {
            v2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        v2Var.b(strA);
        String strB = b(q1Var);
        if (strB != null) {
            v2Var.a("\nBid Response:\n");
            v2Var.a(strB);
        }
        String str = q1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType(MimeTypes.PLAIN_TEXT).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage(null), "Share Ad Report");
        if (z2) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.f21399a.o0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    public String a(q1 q1Var) {
        v2 v2Var = new v2();
        v2Var.b("Ad Info:\n");
        y2 y2VarE = q1Var.e();
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        if (y2VarE != null) {
            v2Var.a(y2VarE);
        } else if (bVarC != null) {
            v2Var.a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").a(bVarC).b(bVarC);
        }
        v2Var.a(this.f21399a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a(ApiHeadersProvider.PLATFORM, "fireos".equals(this.f21399a.A().z()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f21399a.a(y4.f23676Q3)).a("App Package Name", this.f21400b.getPackageName()).a("Device", Build.BRAND + org.apache.tika.utils.StringUtils.SPACE + Build.MODEL + " (" + Build.DEVICE + ")").a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f21399a.i0()).a("Ad Review Version", C1643j.b()).a(a(q1Var.a())).a("User ID", this.f21399a.x0().e() != null ? this.f21399a.x0().e() : OfficeOpenXMLExtended.SECURITY_NONE).a("MD", this.f21399a.a(y4.f23906t));
        v2Var.a("\nDebug Info:\n").a(v4.b(v2Var2.toString(), o7.a(this.f21399a), v4.a.V2, this.f21399a.j0(), this.f21399a));
        return v2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f21399a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21399a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = o7.a(obj);
        Bundle bundleA = this.f21399a.j().a(strA);
        this.f21399a.O();
        if (com.applovin.impl.sdk.o.a()) {
            AbstractC1593a.s("Serve id: ", strA, this.f21399a.O(), "CreativeDebuggerService");
        }
        this.f21399a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21399a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }
}
