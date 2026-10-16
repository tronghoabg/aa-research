package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.presenter.w;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.r1;
import ef.C2527k;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import ff.AbstractC2640A;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33569a;

    /* renamed from: b, reason: collision with root package name */
    public final x f33570b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f33571c;

    /* renamed from: d, reason: collision with root package name */
    public final com.vungle.ads.internal.platform.f f33572d;

    /* renamed from: e, reason: collision with root package name */
    public Long f33573e;

    /* renamed from: f, reason: collision with root package name */
    public a f33574f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2525i f33575g;

    /* renamed from: h, reason: collision with root package name */
    public AlertDialog f33576h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC2525i f33577i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f33578j;
    public final Map k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f33579l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f33580m;

    /* renamed from: n, reason: collision with root package name */
    public com.vungle.ads.internal.omsdk.b f33581n;

    /* renamed from: o, reason: collision with root package name */
    public p0 f33582o;

    public w(Context context, r1 delegate, h0 advertisement, com.vungle.ads.internal.platform.f platform) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(delegate, "delegate");
        AbstractC3340k.e(advertisement, "advertisement");
        AbstractC3340k.e(platform, "platform");
        this.f33569a = context;
        this.f33570b = delegate;
        this.f33571c = advertisement;
        this.f33572d = platform;
        this.f33575g = Fe.c.y(EnumC2526j.f34667a, new v(context));
        this.f33577i = Fe.c.z(new t(this));
        this.f33578j = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        this.k = AbstractC2640A.R(new C2527k("video.mute", bool), new C2527k("video.unmute", bool));
        this.f33579l = new LinkedHashMap();
        this.f33580m = AbstractC2640A.R(new C2527k(8, bool), new C2527k(9, bool), new C2527k(10, bool));
        this.f33582o = new p0(context, advertisement);
    }

    public final com.vungle.ads.internal.util.s a() {
        return (com.vungle.ads.internal.util.s) this.f33577i.getValue();
    }

    public final com.vungle.ads.internal.network.r b() {
        return (com.vungle.ads.internal.network.r) this.f33575g.getValue();
    }

    public final void c() {
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k()) {
            PrivacyManager.INSTANCE.getClass();
            if ("unknown".equals(PrivacyManager.b())) {
                d();
            }
        }
        a aVar = this.f33574f;
        if (aVar != null) {
            aVar.a("start", null, ((r1) this.f33570b).q());
        }
        this.f33573e = Long.valueOf(System.currentTimeMillis());
    }

    public final void d() {
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.f33569a instanceof Activity)) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.c("NativeAdPresenter", "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: Hb.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                w.a(this.f4991a, dialogInterface, i5);
            }
        };
        ConfigManager.INSTANCE.getClass();
        String strJ = ConfigManager.j();
        String strI = ConfigManager.i();
        String strG = ConfigManager.g();
        String strH = ConfigManager.h();
        Context context = this.f33569a;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (strJ != null && strJ.length() != 0) {
            builder.setTitle(strJ);
        }
        if (strI != null && strI.length() != 0) {
            builder.setMessage(strI);
        }
        builder.setPositiveButton(strG, onClickListener);
        builder.setNegativeButton(strH, onClickListener);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Hb.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w.a(this.f4992a, dialogInterface);
            }
        });
        this.f33576h = alertDialogCreate;
        alertDialogCreate.show();
    }

    public final void a(a aVar) {
        this.f33574f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.w.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("NativeAdPresenter", "user interaction on Native ad");
            this.f33582o.a(motionEvent);
        }
    }

    public static final void a(w this$0, DialogInterface dialogInterface, int i5) {
        String value;
        AbstractC3340k.e(this$0, "this$0");
        if (i5 == -2) {
            value = PrivacyConsent.OPT_OUT.getValue();
        } else if (i5 != -1) {
            value = "opted_out_by_timeout";
        } else {
            value = PrivacyConsent.OPT_IN.getValue();
        }
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a(value, "vungle_modal", null);
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k() && "unknown".equals(PrivacyManager.b())) {
            this$0.d();
        }
    }

    public static final void a(w this$0, DialogInterface dialogInterface) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.f33576h = null;
    }

    public final void a(View view, String omSdkData) {
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(omSdkData, "omSdkData");
        boolean zC = this.f33571c.C();
        if (omSdkData.length() <= 0 || !zC) {
            return;
        }
        String strA = ((com.vungle.ads.internal.omsdk.c) Fe.c.y(EnumC2526j.f34667a, new s(this.f33569a)).getValue()).a();
        if (strA != null) {
            com.vungle.ads.internal.omsdk.b bVar = new com.vungle.ads.internal.omsdk.b(omSdkData, strA, ((r1) this.f33570b).t());
            bVar.a(view);
            this.f33581n = bVar;
        }
    }

    public final void a(int i5, Map map) {
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("NativeAdPresenter", "onOMEvent: event=" + i5 + " value=" + map);
        Object obj = this.f33580m.get(Integer.valueOf(i5));
        Boolean bool = Boolean.TRUE;
        if (!AbstractC3340k.a(obj, bool) && AbstractC3340k.a(this.f33579l.get(Integer.valueOf(i5)), bool)) {
            com.vungle.ads.internal.util.t.a("NativeAdPresenter", "Ignore this already fired om event: " + i5);
        }
        this.f33579l.put(Integer.valueOf(i5), bool);
        switch (i5) {
            case 1:
                com.vungle.ads.internal.omsdk.b bVar = this.f33581n;
                if (bVar != null) {
                    bVar.d();
                    break;
                }
                break;
            case 2:
                com.vungle.ads.internal.omsdk.b bVar2 = this.f33581n;
                if (bVar2 != null) {
                    bVar2.c();
                    break;
                }
                break;
            case 3:
                com.vungle.ads.internal.omsdk.b bVar3 = this.f33581n;
                if (bVar3 != null) {
                    bVar3.b();
                    break;
                }
                break;
            case 4:
                Object obj2 = map != null ? map.get("OM_KEY_DURATION") : null;
                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                float fFloatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float fFloatValue2 = number != null ? number.floatValue() : 0.0f;
                Object obj3 = map != null ? map.get("OM_KEY_VOLUME") : null;
                Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                if (number2 != null) {
                    fFloatValue = number2.floatValue();
                }
                com.vungle.ads.internal.omsdk.b bVar4 = this.f33581n;
                if (bVar4 != null) {
                    bVar4.a(fFloatValue2, fFloatValue);
                    break;
                }
                break;
            case 5:
            case 6:
            case 7:
                com.vungle.ads.internal.omsdk.b bVar5 = this.f33581n;
                if (bVar5 != null) {
                    bVar5.a(i5);
                    break;
                }
                break;
            case 8:
                com.vungle.ads.internal.omsdk.b bVar6 = this.f33581n;
                if (bVar6 != null) {
                    bVar6.e();
                    break;
                }
                break;
            case 9:
                com.vungle.ads.internal.omsdk.b bVar7 = this.f33581n;
                if (bVar7 != null) {
                    bVar7.a(true);
                    break;
                }
                break;
            case 10:
                com.vungle.ads.internal.omsdk.b bVar8 = this.f33581n;
                if (bVar8 != null) {
                    bVar8.a(false);
                    break;
                }
                break;
            case 11:
                com.vungle.ads.internal.omsdk.b bVar9 = this.f33581n;
                if (bVar9 != null) {
                    bVar9.a();
                    break;
                }
                break;
        }
    }
}
