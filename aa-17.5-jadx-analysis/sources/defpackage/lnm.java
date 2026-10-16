package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.gms.car.CarInfo;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class lnm {
    public static final void A(bux buxVar, int i) {
        bux buxVarC = buxVar.c(-180966693);
        if (buxVarC.I(i != 0, i & 1)) {
            cfy cfyVarA = awd.c(cfy.e, 1.0f).a(new aix(cjn.i(0), ckq.a));
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 8);
        }
    }

    public static final void B(lgn lgnVar, bux buxVar, int i) {
        bux buxVar2;
        lgn lgnVar2;
        int i2 = i & 1;
        bux buxVarC = buxVar.c(-992032212);
        if (buxVarC.I(1 == i2, i2)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if (i2 == 0 || buxVarC.F()) {
                eru eruVarA = esh.a(buxVarC);
                if (eruVarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                lgnVar2 = (lgn) epq.e(affw.b(lgn.class), eruVarA, null, null, ecw.g(eruVarA));
            } else {
                buxVarC.s();
                lgnVar2 = lgnVar;
            }
            buxVarC.l();
            cfy cfyVarC = awd.c(cfy.e, 1.0f);
            ctp ctpVarB = atk.b(cfl.e, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            lgnVar = lgnVar2;
            buxVar2 = buxVarC;
            brp.b("TODO", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar2, 6, 0, 262142);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        lgn lgnVar3 = lgnVar;
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(lgnVar3, i, 7);
        }
    }

    public static final String C(CarInfo carInfo) {
        return "HEAD_UNIT_MANAGER_LAST_NOTIFICATION_".concat(U(carInfo));
    }

    public static final String D(CarInfo carInfo) {
        return "HEAD_UNIT_MANAGER_NUMBER_OF_NOTIFICATIONS_".concat(U(carInfo));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cmw E(androidx.car.app.model.CarIcon r4, defpackage.bux r5) {
        /*
            bvf r0 = defpackage.daa.b
            java.lang.Object r0 = r5.f(r0)
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r5.C(r4)
            java.lang.Object r2 = r5.g()
            if (r1 != 0) goto L16
            java.lang.Object r1 = defpackage.buw.a
            if (r2 != r1) goto L73
        L16:
            r0.getClass()
            androidx.core.graphics.drawable.IconCompat r1 = r4.getIcon()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L22
            goto L5e
        L22:
            android.graphics.drawable.Drawable r1 = r1.e(r0)
            if (r1 != 0) goto L29
            goto L5e
        L29:
            androidx.car.app.model.CarColor r4 = r4.getTint()
            if (r4 == 0) goto L5d
            int r3 = r4.getType()
            if (r3 != 0) goto L4f
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r3 = 32
            if (r0 != r3) goto L4a
            int r4 = r4.getColorDark()
            goto L50
        L4a:
            int r4 = r4.getColor()
            goto L50
        L4f:
            r4 = r2
        L50:
            if (r4 == 0) goto L5d
            android.graphics.drawable.Drawable r3 = r1.mutate()
            r3.getClass()
            r3.setTint(r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L6a
            long r0 = defpackage.cjn.i(r2)
            cmv r4 = new cmv
            r4.<init>(r0)
            goto L6f
        L6a:
            lfy r4 = new lfy
            r4.<init>(r3)
        L6f:
            r2 = r4
            r5.x(r2)
        L73:
            cmw r2 = (defpackage.cmw) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnm.E(androidx.car.app.model.CarIcon, bux):cmw");
    }

    public static final CarIcon F(Context context, int i, boolean z) {
        context.getClass();
        tj tjVar = new tj(IconCompat.m(context, i));
        if (z) {
            tjVar.a(CarColor.createCustom(-16777216, -1));
        }
        return new CarIcon(tjVar);
    }

    public static final boolean G() {
        Context context = mki.a.c;
        context.getClass();
        return context.getSharedPreferences("action_developer_settings", 0).getBoolean("cal_beta_features_enabled", false);
    }

    public static final boolean H() {
        return acob.t() || lej.a.a().e() || G();
    }

    public static void I(List list, String str, PersistableBundle persistableBundle) {
        String string = persistableBundle.getString(str);
        if (string != null) {
            list.add(new dzi(str, string));
        }
    }

    public static final String J(String str, Context context) {
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            return str2 == null ? "UNAVAILABLE" : str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return "UNAVAILABLE";
        }
    }

    public static ldl K() {
        return (ldl) mki.a.i(ldl.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L(defpackage.gjo r28, defpackage.cfy r29, defpackage.cfn r30, defpackage.csi r31, float r32, defpackage.cjw r33, defpackage.hdo r34, defpackage.hdo r35, defpackage.cjd r36, defpackage.afec r37, defpackage.bux r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lnm.L(gjo, cfy, cfn, csi, float, cjw, hdo, hdo, cjd, afec, bux, int, int, int):void");
    }

    public static final void M(lbt lbtVar, yzy yzyVar) {
        ebf.j().f(rrc.h(yxy.GEARHEAD, lbtVar.c(), yzyVar));
    }

    public static final Duration N(Instant instant, abpt abptVar) {
        Duration durationBetween = Duration.between(wox.ai(abptVar), instant);
        durationBetween.getClass();
        return durationBetween;
    }

    public static final lbt O(yzz yzzVar) {
        return (lbt) lbt.c.get(yzzVar);
    }

    public static final lbt P(int i) {
        yzz yzzVarB = yzz.b(i);
        if (yzzVarB == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = lbt.a;
        return O(yzzVarB);
    }

    public static final void Q() {
        lbt.a.clear();
        lbt.b.clear();
    }

    public static final void R(lbt lbtVar, yzz yzzVar, yfq yfqVar) {
        lbtVar.getClass();
        yzzVar.getClass();
        yfqVar.getClass();
        lbt.a.put(lbtVar, yzzVar);
        lbt.b.put(lbtVar, yfqVar);
    }

    public static lbs S() {
        return (lbs) mki.a.i(lbs.class);
    }

    private static final String T(List list) {
        return woy.cu(list, " • ", null, null, new lti(13), 30);
    }

    private static final String U(CarInfo carInfo) {
        return carInfo.a + "_" + carInfo.b + "_" + carInfo.c + "_" + carInfo.i + "_" + carInfo.j + "_" + carInfo.l + "_" + carInfo.k + "_" + carInfo.d;
    }

    public static void a() {
    }

    public static Intent b(ComponentName componentName, String str, Bundle bundle) {
        woy.O(!TextUtils.isEmpty(str), "search query is null");
        Intent intent = new Intent("MEDIA_SHOW_SEARCH_RESULTS");
        intent.setComponent(componentName);
        intent.putExtra("search_extras", bundle);
        intent.putExtra("query", str);
        return intent;
    }

    public static Intent c(ComponentName componentName) {
        ljp ljpVarD = ljp.d();
        boolean zContains = false;
        if (componentName != null && acrz.w()) {
            ygr ygrVar = ljpVarD.e;
            if (ygrVar == null) {
                ygp ygpVar = new ygp();
                List<ResolveInfo> listQueryIntentServices = mki.a.c.getPackageManager().queryIntentServices(new Intent("androidx.car.app.media.action.SHOW_MEDIA_PLAYBACK"), 0);
                listQueryIntentServices.getClass();
                ArrayList<ResolveInfo> arrayList = new ArrayList();
                for (Object obj : listQueryIntentServices) {
                    if (((ResolveInfo) obj).serviceInfo != null) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
                for (ResolveInfo resolveInfo : arrayList) {
                    arrayList2.add(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
                }
                ygpVar.k(arrayList2);
                ljpVarD.e = ygpVar.g();
                ljp.b.l().y("playbackIntentSupportedApps: %s", ljpVarD.e);
                ygrVar = ljpVarD.e;
            }
            if (ygrVar != null) {
                zContains = ygrVar.contains(componentName);
            }
        }
        Intent intent = new Intent(true != zContains ? "MEDIA_SHOW_PLAYBACK_VIEW" : "androidx.car.app.media.action.SHOW_MEDIA_PLAYBACK");
        intent.setComponent(componentName);
        return intent;
    }

    public static boolean d(Intent intent) {
        return !jrj.d(intent);
    }

    public static boolean e(Intent intent) {
        if (intent.getComponent() != null) {
            return Objects.equals(intent.getAction(), "MEDIA_SHOW_PLAYBACK_VIEW") || Objects.equals(intent.getAction(), "androidx.car.app.media.action.SHOW_MEDIA_PLAYBACK");
        }
        return false;
    }

    public static final ltr f(Uri uri) {
        String path;
        if (uri == null || !affa.f(uri.getScheme(), "android.resource") || (path = uri.getPath()) == null || !afyh.u(path, "station_icon_fallback", false)) {
            return null;
        }
        Resources resources = mki.a.c.getResources();
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "com.google.android.projection.gearhead";
        }
        String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        int identifier = resources.getIdentifier(lastPathSegment, uri.getPathSegments().get(0), authority);
        if (identifier != 0) {
            return new ltr(authority, identifier);
        }
        return null;
    }

    public static final String g(lmd lmdVar, String str, String str2) {
        String strQ = lmdVar.Q(str);
        String str3 = null;
        if (strQ == null || true == afyh.v(strQ)) {
            strQ = null;
        }
        String strQ2 = lmdVar.Q(str2);
        if (strQ2 != null && true != afyh.v(strQ2)) {
            str3 = strQ2;
        }
        return T(woy.da(new String[]{strQ, str3}));
    }

    public static final String h(lmd lmdVar, String str, String str2) {
        String strQ = lmdVar.Q("com.google.android.apps.auto.radio.FREQUENCY");
        String str3 = null;
        if (strQ == null || true == afyh.v(strQ)) {
            strQ = null;
        }
        String strQ2 = lmdVar.Q(str);
        if (strQ2 == null || true == afyh.v(strQ2)) {
            strQ2 = null;
        }
        String strQ3 = lmdVar.Q(str2);
        if (strQ3 != null && true != afyh.v(strQ3)) {
            str3 = strQ3;
        }
        return T(woy.da(new String[]{strQ, strQ2, str3}));
    }

    public static /* synthetic */ String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "DISCONNECTED" : "ERROR" : "LOADED" : "LOADING";
    }

    public static lud j() {
        return (lud) mki.a.i(lud.class);
    }

    public static luc k() {
        return (luc) mki.a.i(luc.class);
    }

    public static ltx l() {
        return (ltx) mki.a.i(ltx.class);
    }

    public static ltw m() {
        return (ltw) mki.a.i(ltw.class);
    }

    public static final CarIconSpan n(int i) {
        Context context = mki.a.c;
        context.getClass();
        return CarIconSpan.create(thq.d(context, i, new lle(11)), 2);
    }

    public static final Action o(CharSequence charSequence) {
        sw swVar = new sw();
        swVar.e(charSequence);
        swVar.b(CarColor.createCustom(0, 0));
        return swVar.a();
    }

    public static final boolean p(AaPlaybackState aaPlaybackState, lmd lmdVar, ComponentName componentName) {
        omw omwVarC = omu.c(aaPlaybackState, lmdVar);
        return omwVarC == omw.b || omwVarC == omw.c || y().h(componentName);
    }

    public static final boolean q(lmc lmcVar) {
        String string;
        if (lmcVar.O() != null) {
            return true;
        }
        Uri uriP = lmcVar.P();
        return (uriP == null || (string = uriP.toString()) == null || string.length() <= 0) ? false : true;
    }

    public static final lkv r(Uri uri, afec afecVar) {
        boolean z = Boolean.parseBoolean(uri.getPathSegments().get(0));
        Uri uri2 = Uri.parse(uri.getPathSegments().get(1));
        uri2.getClass();
        return new lkv(z, afecVar.invoke(uri2));
    }

    public static final qw s(qn qnVar, mon monVar) {
        return new thj(qnVar, new lkt(0), new jzi(qnVar, monVar, 13));
    }

    public static final void t(List list, ComponentName componentName) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            llu lluVar = (llu) it.next();
            ohu ohuVarA = ohu.a();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fF);
            rrbVarH.p(componentName);
            rrbVarH.z(((MediaBrowserCompat.MediaItem) lluVar.b).a);
            ohuVarA.b((rrc) rrbVarH.l());
        }
        Iterator it2 = list.iterator();
        boolean zContainsKey = false;
        boolean zContainsKey2 = false;
        boolean zContainsKey3 = false;
        boolean zContainsKey4 = false;
        boolean z = false;
        boolean z2 = false;
        while (it2.hasNext()) {
            llu lluVar2 = (llu) it2.next();
            Bundle bundleN = lluVar2.h().n();
            zContainsKey |= bundleN.containsKey("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT");
            zContainsKey2 |= bundleN.containsKey("androidx.media.MediaItem.Extras.COMPLETION_PERCENTAGE");
            zContainsKey3 |= bundleN.containsKey("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT");
            zContainsKey4 |= bundleN.containsKey("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT");
            htm htmVar = new htm(lluVar2.h().n());
            List listBi = woy.bi(htmVar.k(true), htmVar.k(false), htmVar.l());
            if (!listBi.isEmpty()) {
                Iterator it3 = listBi.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (((lla) it3.next()) == lla.b) {
                        z = true;
                        break;
                    }
                }
            }
            List listBi2 = woy.bi(htmVar.n(true), htmVar.n(false), htmVar.m());
            if (!listBi2.isEmpty()) {
                Iterator it4 = listBi2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    } else if (affa.f((Boolean) it4.next(), true)) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (zContainsKey) {
                ohu ohuVarA2 = ohu.a();
                rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fD);
                rrbVarH2.p(componentName);
                ohuVarA2.b((rrc) rrbVarH2.l());
            }
            if (zContainsKey2) {
                ohu ohuVarA3 = ohu.a();
                rrb rrbVarH3 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fE);
                rrbVarH3.p(componentName);
                ohuVarA3.b((rrc) rrbVarH3.l());
            }
            if (zContainsKey3) {
                ohu ohuVarA4 = ohu.a();
                rrb rrbVarH4 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fP);
                rrbVarH4.p(componentName);
                ohuVarA4.b((rrc) rrbVarH4.l());
            }
            if (zContainsKey4) {
                ohu ohuVarA5 = ohu.a();
                rrb rrbVarH5 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fO);
                rrbVarH5.p(componentName);
                ohuVarA5.b((rrc) rrbVarH5.l());
            }
            if (z) {
                ohu ohuVarA6 = ohu.a();
                rrb rrbVarH6 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fM);
                rrbVarH6.p(componentName);
                ohuVarA6.b((rrc) rrbVarH6.l());
            }
            if (z2) {
                ohu ohuVarA7 = ohu.a();
                rrb rrbVarH7 = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.fN);
                rrbVarH7.p(componentName);
                ohuVarA7.b((rrc) rrbVarH7.l());
            }
        }
    }

    public static final int u(int i, Context context) {
        return afgi.k(i * context.getResources().getDisplayMetrics().density);
    }

    public static final int v(qx qxVar) {
        Collection collectionB = qxVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            if (affa.f(((qw) obj).c, "BROWSE")) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() - 1;
    }

    public static final void w(qw qwVar) {
        qwVar.g().f(qwVar);
    }

    public static final void x(qw qwVar) {
        Collection collectionB = qwVar.g().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            if (affa.f(((qw) obj).c, qwVar.c)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qwVar.g().g((qw) it.next());
        }
        qwVar.g().f(qwVar);
    }

    public static ljs y() {
        return (ljs) mki.a.i(ljs.class);
    }

    public static ljq z() {
        return (ljq) mki.a.i(ljq.class);
    }
}
