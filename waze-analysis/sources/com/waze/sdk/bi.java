package com.waze.sdk;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.waze.BoundService;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.lg;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.navigate.dj;
import com.waze.navigate.eo;
import j$.util.Optional;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35330a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.s.e f35331b = new com.waze.shared_infra.s.e(new bk());

    /* renamed from: c, reason: collision with root package name */
    private static bi f35332c;

    /* renamed from: d, reason: collision with root package name */
    private lg f35333d;

    /* renamed from: e, reason: collision with root package name */
    private lg f35334e;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35339j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35341l;

    @Deprecated
    private Dialog o;
    private String q;
    private String r;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35335f = false;

    /* renamed from: g, reason: collision with root package name */
    private int f35336g = -1;

    /* renamed from: h, reason: collision with root package name */
    private SdkConfiguration f35337h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f35338i = false;

    /* renamed from: k, reason: collision with root package name */
    private int f35340k = -1;
    private final eo m = (eo) com.waze.web.r.h(eo.class);
    private final kotlinx.coroutines.b.bm n = bu.c(1, 1, kotlinx.coroutines.a.a.f51273c);
    private final dj p = new bf(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(Resources resources) {
        if (BoundService.a() != null) {
            BoundService.d(this.f35336g, this.f35337h);
            this.f35335f = true;
            this.f35334e = this.f35333d;
            B(resources);
            BoundService.e();
            BoundService.k(C());
            NavigationInfoNativeManager.getInstance().addNavigationUpdateListener(this.p);
            if (!this.f35334e.f25141a.contains("spotify")) {
                SdkConfiguration.setExternalAppAndType(this.f35334e.f25141a, 1);
            }
        }
        this.f35339j = false;
    }

    private final void B(Resources resources) {
        if (!this.f35335f) {
            f35331b.c(new bk());
            return;
        }
        if (this.f35334e.f25141a.contains("spotify")) {
            bd.d().L();
            return;
        }
        lg lgVar = this.f35334e;
        boolean z = !lgVar.f25144d;
        Drawable drawable = lgVar.f25143c;
        String str = lgVar.f25141a;
        com.waze.utils.i.a().c(SdkConfiguration.getCustomizedAppIconUrl(resources, str), new bg(this, str, z, resources, drawable));
    }

    private final boolean C() {
        return this.m.T();
    }

    public static bi d() {
        bi biVar = f35332c;
        if (biVar != null) {
            return biVar;
        }
        bi biVar2 = new bi();
        f35332c = biVar2;
        return biVar2;
    }

    public static kotlinx.coroutines.b.k f() {
        return com.waze.shared_infra.s.h.a(f35331b);
    }

    public static /* synthetic */ void h(bi biVar, Runnable runnable, boolean z) {
        SdkConfiguration.setTransportationCustomizationAgreed(biVar.f35337h.PackageNames[biVar.f35336g], z);
        if (z) {
            if (!biVar.q.equals("")) {
                biVar.n.c(biVar.q);
            }
            if (!biVar.r.equals("")) {
                ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE, biVar.r);
            }
        }
        runnable.run();
    }

    static /* bridge */ /* synthetic */ void k(bi biVar, String str, boolean z, Drawable drawable) {
        lg lgVar = biVar.f35334e;
        if (lgVar == null || !TextUtils.equals(lgVar.f25141a, str)) {
            return;
        }
        f35331b.c(new bk(z, drawable, null, str));
    }

    public static /* synthetic */ void x(bi biVar, Resources resources, com.waze.search.h.ay ayVar) {
        biVar.A(resources);
        bd.d().f35311b.c(Optional.of(new com.waze.main_screen.ae.a.c(biVar.f35337h.AppNames[biVar.f35336g], biVar.f35333d.f25144d)));
        if (((bd) ayVar.f35803a).f35310a != null) {
            String str = biVar.f35337h.AppNames[biVar.f35336g];
            boolean z = biVar.f35333d.f25144d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Runnable runnable) {
        String strC;
        String strC2;
        lg lgVar = this.f35333d;
        String str = lgVar.f25146f;
        if (str == null || !SdkConfiguration.isCustomizeCarIconSupported(this.f35337h.Scopes[this.f35336g])) {
            this.q = "";
        } else {
            this.q = str;
        }
        this.r = "";
        String str2 = lgVar.f25147g;
        if (str2 != null && !str2.equals(ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_VEHICLE_TYPE_CHOICE)) && SdkConfiguration.isCustomizeVehicleTypeSupported(this.f35337h.Scopes[this.f35336g])) {
            String[] strArrConfigGetVehicleTypes = ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).configGetVehicleTypes();
            int i2 = 1;
            while (true) {
                if (i2 >= strArrConfigGetVehicleTypes.length) {
                    break;
                }
                if (this.f35333d.f25147g.equals(strArrConfigGetVehicleTypes[i2])) {
                    this.r = this.f35333d.f25147g;
                    break;
                }
                i2 += 2;
            }
        }
        if (this.q == null || this.r == null) {
            return;
        }
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        String strC3 = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_YES_BUTTON, new Object[0]);
        int length = this.q.length();
        String str3 = this.r;
        if (length > 0) {
            if (str3.length() > 0) {
                strC = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_AND_CAR_TYPE_TITLE_PS, this.f35337h.AppNames[this.f35336g]);
                strC2 = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_AND_CAR_TYPE_BODY_PS, this.f35337h.AppNames[this.f35336g]);
            } else {
                strC = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TITLE, new Object[0]);
                strC2 = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_BODY_PS, this.f35337h.AppNames[this.f35336g]);
                strC3 = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_YES_BUTTON, new Object[0]);
            }
        } else if (str3.length() <= 0) {
            runnable.run();
            return;
        } else {
            strC = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TYPE_TITLE, new Object[0]);
            strC2 = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TYPE_BODY_PS, this.f35337h.AppNames[this.f35336g]);
            strC3 = aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_CAR_TYPE_YES_BUTTON, new Object[0]);
        }
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(strC);
        oVar.P(strC2);
        oVar.f13808a = new com.waze.navigate.f(this, runnable, 4, null);
        oVar.M(strC3);
        oVar.N(aVarA.c(R.string.TRANSPORTATION_CUSTOMIZATION_POPUP_NO_BUTTON, new Object[0]));
        oVar.H(new com.waze.design_components.c.f(runnable, 7));
        com.waze.z.a.d.ai.q(oVar);
    }

    public final String e() {
        int i2;
        if (!p() || (i2 = this.f35336g) < 0) {
            return null;
        }
        String[] strArr = this.f35337h.AppNames;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public final kotlinx.coroutines.b.bq g() {
        return this.n;
    }

    final void m() {
        PendingIntent pendingIntent;
        lg lgVar = this.f35333d;
        if (lgVar == null || (pendingIntent = lgVar.f25142b) == null) {
            return;
        }
        bq.b(pendingIntent);
    }

    public final void n(String str) {
        int i2 = this.f35336g;
        if (i2 >= 0) {
            String[] strArr = this.f35337h.PackageNames;
            if (i2 <= strArr.length) {
                if (this.f35335f && strArr[i2].equals(str)) {
                    this.f35335f = false;
                    this.f35336g = -1;
                    if (BoundService.a() != null) {
                        BoundService.o(str);
                    }
                    NavigationInfoNativeManager.getInstance().removeNavigationUpdateListener(this.p);
                    return;
                }
                return;
            }
        }
        com.waze.shared_infra.i.h.c("Index " + i2 + " is out of boundaries for packages");
    }

    public final boolean p() {
        return this.f35335f || this.f35336g >= 0;
    }

    public final boolean q() {
        int i2;
        SdkConfiguration sdkConfiguration;
        if (this.f35335f && (i2 = this.f35336g) >= 0 && (sdkConfiguration = this.f35337h) != null) {
            String[] strArr = sdkConfiguration.PackageNames;
            if (i2 < strArr.length && strArr[i2].contains("spotify")) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        lg lgVar;
        if (this.f35335f && (lgVar = this.f35333d) != null && lgVar.f25141a.contains("spotify")) {
            return bq.b(this.f35333d.f25142b);
        }
        return false;
    }

    final boolean s() {
        lg lgVar;
        return p() && (lgVar = this.f35334e) != null && lgVar.f25145e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(android.content.res.Resources r7, android.content.pm.PackageManager r8, com.waze.search.h.ay r9) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sdk.bi.y(android.content.res.Resources, android.content.pm.PackageManager, com.waze.search.h.ay):void");
    }
}
