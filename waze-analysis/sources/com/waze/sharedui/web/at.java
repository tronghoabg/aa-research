package com.waze.sharedui.web;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import androidx.camera.core.processing.util.GLUtils;
import androidx.webkit.ProxyConfig;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.map.b.dp;
import com.waze.map.b.fk;
import com.waze.trip_overview.Cdo;
import com.waze.trip_overview.bb;
import com.waze.trip_overview.bc;
import com.waze.trip_overview.bd;
import com.waze.trip_overview.bf;
import com.waze.trip_overview.bg;
import com.waze.trip_overview.bk;
import com.waze.trip_overview.di;
import com.waze.trip_overview.dm;
import com.waze.trip_overview.dn;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.a.it;
import l.a.iu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class at {
    public /* synthetic */ at(byte[] bArr) {
    }

    public static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", c(str));
        intent.setFlags(268435456);
        return intent;
    }

    public static Uri b(Uri uri) {
        return (TextUtils.isEmpty(uri.getScheme()) || ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uri.getScheme())) ? uri.buildUpon().scheme(ProxyConfig.MATCH_HTTPS).build() : uri;
    }

    public static Uri c(String str) {
        Uri uri = Uri.parse(str);
        if (TextUtils.isEmpty(uri.getScheme()) && !str.startsWith("//")) {
            uri = Uri.parse("//".concat(String.valueOf(str)));
        }
        return b(uri);
    }

    public static String d(Context context) {
        try {
            return WebSettings.getDefaultUserAgent(context);
        } catch (AndroidRuntimeException e2) {
            com.waze.shared_infra.i.h.e("Failed to get Default UserAgent", e2);
            return "WazeAndroidDefaultUserAgentFallback";
        }
    }

    public static String e(String str) {
        return s(str, false);
    }

    public static void f(Context context, String str) {
        Uri uriC = c(str);
        b(uriC);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uriC);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Cannot open external browser with URL: ".concat(String.valueOf(String.valueOf(uriC))), e2);
        }
    }

    static void g(WebSettings webSettings) {
        webSettings.setSavePassword(false);
        webSettings.setSupportZoom(false);
        webSettings.setSaveFormData(false);
        webSettings.setDomStorageEnabled(false);
        webSettings.setJavaScriptEnabled(false);
        webSettings.setAllowFileAccess(false);
        if (ConfigValues.CONFIG_VALUE_WEB_VIEW_ENABLE_ASSET_LOADER.b().booleanValue()) {
            return;
        }
        webSettings.setAllowFileAccessFromFileURLs(false);
    }

    public static /* synthetic */ fk h(fk fkVar, fk fkVar2) {
        h.g.b.x.f(fkVar, "<this>");
        return new fk(Math.min(fkVar.b(), fkVar2.b()), Math.max(fkVar.a(), fkVar2.a()));
    }

    public static Cdo i(com.waze.modules.navigation.ah ahVar) {
        if (ahVar == null) {
            return null;
        }
        bc bcVar = bc.f41056a;
        bd bdVar = bd.f41060a;
        bb bbVar = bb.f41044a;
        bk bkVar = bk.f41093a;
        dn dnVar = dn.f41397a;
        dm dmVar = dm.f41385a;
        bg bgVar = bg.f41078a;
        bf bfVar = bf.f41069a;
        int iOrdinal = ahVar.ordinal();
        if (iOrdinal == 0) {
            return Cdo.f41407h;
        }
        if (iOrdinal == 1) {
            return Cdo.f41402c;
        }
        if (iOrdinal == 2) {
            return Cdo.f41403d;
        }
        if (iOrdinal == 3) {
            return Cdo.f41404e;
        }
        if (iOrdinal == 5) {
            return Cdo.f41400a;
        }
        if (iOrdinal == 6) {
            return Cdo.f41406g;
        }
        if (iOrdinal == 7) {
            return Cdo.f41405f;
        }
        if (iOrdinal == 14) {
            return Cdo.f41410k;
        }
        if (iOrdinal == 19) {
            return Cdo.f41401b;
        }
        switch (iOrdinal) {
            case 10:
                return Cdo.f41409j;
            case 11:
                return Cdo.f41411l;
            case 12:
                return Cdo.f41408i;
            default:
                return null;
        }
    }

    public static /* synthetic */ iu j(di diVar) {
        it itVarNewBuilder = iu.newBuilder();
        itVarNewBuilder.b(diVar.b());
        itVarNewBuilder.d(diVar.d());
        itVarNewBuilder.c(diVar.c());
        itVarNewBuilder.a(diVar.a());
        iu iuVarBuild = itVarNewBuilder.build();
        h.g.b.x.e(iuVarBuild, "build(...)");
        return iuVarBuild;
    }

    public static /* synthetic */ di k(com.waze.trip_overview.ap apVar) {
        return new di(apVar.a().left, apVar.a().top, apVar.a().right, apVar.a().bottom);
    }

    public static dp l(com.waze.modules.c.ar arVar) {
        h.g.b.x.f(arVar, "<this>");
        return new dp(arVar.o(), arVar.a());
    }

    public static com.waze.trip_overview.ar m(com.waze.modules.c.ar arVar) {
        int i2;
        int i3;
        h.g.b.x.f(arVar, "route");
        List listN = arVar.n();
        int i4 = 0;
        if ((listN instanceof Collection) && listN.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = listN.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((com.waze.modules.c.h) it.next()).b() == com.waze.modules.c.j.f30173c && (i2 = i2 + 1) < 0) {
                    h.a.i.o();
                }
            }
        }
        List listN2 = arVar.n();
        if ((listN2 instanceof Collection) && listN2.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it2 = listN2.iterator();
            i3 = 0;
            while (it2.hasNext()) {
                if (((com.waze.modules.c.h) it2.next()).b() == com.waze.modules.c.j.f30172b && (i3 = i3 + 1) < 0) {
                    h.a.i.o();
                }
            }
        }
        List<com.waze.modules.c.h> listN3 = arVar.n();
        if (!(listN3 instanceof Collection) || !listN3.isEmpty()) {
            for (com.waze.modules.c.h hVar : listN3) {
                if (hVar.b() == com.waze.modules.c.j.f30176f) {
                    int i5 = com.waze.trip_overview.c.f41145a;
                    if (com.waze.trip_overview.c.b(hVar) && (i4 = i4 + 1) < 0) {
                        h.a.i.o();
                    }
                }
            }
        }
        return new com.waze.trip_overview.ar(i2, i3, i4);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static com.waze.trip_overview.at n(com.waze.modules.c.ar r26, boolean r27, com.waze.trip_overview.z r28, com.waze.shared_infra.o.a r29) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.web.at.n(com.waze.modules.c.ar, boolean, com.waze.trip_overview.z, com.waze.shared_infra.o.a):com.waze.trip_overview.at");
    }

    public static String o(long j2, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        return t(aVar, j2, R.string.TRIP_OVERVIEW_DRIVE_DURATION_PD_MINS, R.string.TRIP_OVERVIEW_DRIVE_DURATION_PD_HOURS, R.string.TRIP_OVERVIEW_DRIVE_DURATION_PD_HOURS_PD_MINS);
    }

    public static String p(com.waze.modules.c.ar arVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(arVar, "<this>");
        h.g.b.x.f(aVar, "stringProvider");
        Long lI = arVar.i();
        if (lI.longValue() > 0 && ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_FEATURE_ENABLED.b().booleanValue() && ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_CARBON_EMISSION_CARD_ENABLED.b().booleanValue()) {
            return aVar.c(R.string.TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_UNITS_PS, new DecimalFormat(GLUtils.VERSION_UNKNOWN).format(Float.valueOf(lI.longValue() > 100 ? lI.longValue() / 1000.0f : 0.1f)));
        }
        return null;
    }

    public static List q(List list, long j2) {
        ArrayList arrayList;
        Object next;
        h.g.b.x.f(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            com.waze.modules.c.ar arVarD = ((com.waze.modules.c.ar) next).d();
            if (arVarD != null && arVarD.a() == j2) {
                break;
            }
        }
        com.waze.modules.c.ar arVar = (com.waze.modules.c.ar) next;
        if (arVar != null) {
            com.waze.modules.c.ar arVarD2 = arVar.d();
            if (arVarD2 != null) {
                List<com.waze.modules.c.ar> listAq = h.a.i.aq(list);
                ArrayList arrayList2 = new ArrayList(h.a.i.q(listAq, 10));
                for (com.waze.modules.c.ar arVar2 : listAq) {
                    if (arVar2.a() == arVar.a()) {
                        arVar2 = arVarD2;
                    }
                    arrayList2.add(arVar2);
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return list;
    }

    public static List r(com.waze.modules.c.ar arVar, com.waze.trip_overview.z zVar, com.waze.shared_infra.o.a aVar) {
        int i2;
        h.g.b.x.f(arVar, "<this>");
        h.g.b.x.f(zVar, "configuration");
        h.g.b.x.f(aVar, "stringProvider");
        ArrayList arrayList = new ArrayList();
        if (arVar.B()) {
            arrayList.add(new com.waze.trip_overview.views.e(aVar.c(R.string.TRIP_OVERVIEW_PTL_ALERT, new Object[0]), com.waze.design_components.b.d.y, R.color.alarming_variant));
        }
        com.waze.uid.r rVarS = zVar.s();
        if (rVarS.f()) {
            i2 = R.string.TRIP_OVERVIEW_REQUIRED_AREA_NAME_NO_PREFIX_PS;
        } else if (rVarS instanceof com.waze.trip_overview.x) {
            i2 = R.string.TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_PS;
        } else {
            if (!(rVarS instanceof com.waze.trip_overview.w)) {
                throw new h.i();
            }
            i2 = R.string.TRIP_OVERVIEW_REQUIRED_PERMIT_ALERT_PS;
        }
        List listM = arVar.m();
        ArrayList arrayList2 = new ArrayList(h.a.i.q(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.waze.trip_overview.views.e(aVar.c(i2, (String) it.next()), com.waze.design_components.b.d.y, R.color.alarming_variant));
        }
        arrayList.addAll(arrayList2);
        if (arVar.v()) {
            arrayList.add(new com.waze.trip_overview.views.e(aVar.c(R.string.TRIP_OVERVIEW_LICENSE_PLATE_RESTRICTION_ALERT, new Object[0]), com.waze.design_components.b.d.y, R.color.alarming_variant));
        }
        if (arVar.x()) {
            arrayList.add(new com.waze.trip_overview.views.e(aVar.c(R.string.TRIP_OVERVIEW_FERRY_ALERT, new Object[0]), com.waze.design_components.b.d.z, R.color.cautious_variant));
        }
        if (arVar.z()) {
            arrayList.add(new com.waze.trip_overview.views.e(aVar.c(R.string.TRIP_OVERVIEW_BORDER_CROSSING_ALERT, new Object[0]), com.waze.design_components.b.d.z, R.color.cautious_variant));
        }
        return arrayList;
    }

    private static String s(String str, boolean z) {
        try {
            URI uri = new URI(str);
            return new URI(uri.getScheme(), uri.getHost(), uri.getPath(), null).normalize().toString();
        } catch (URISyntaxException unused) {
            if (z) {
                com.waze.shared_infra.i.h.c("Fail to parse URL: ".concat(String.valueOf(str)));
                return "";
            }
            com.waze.shared_infra.i.h.c("Fail to parse URL: " + str + ", try to encode the query part...");
            return s(com.google.d.k.g.a().b(str), true);
        }
    }

    private static String t(com.waze.shared_infra.o.a aVar, long j2, int i2, int i3, int i4) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j3 = j2 / 60;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long j4 = j3 / 60;
        h.k kVar = new h.k(Integer.valueOf((int) j4), Integer.valueOf((int) (j3 - TimeUnit.HOURS.toMinutes(j4))));
        int iIntValue = ((Number) kVar.a()).intValue();
        int iIntValue2 = ((Number) kVar.b()).intValue();
        return iIntValue == 0 ? aVar.c(i2, Integer.valueOf(iIntValue2)) : iIntValue2 == 0 ? aVar.c(i3, Integer.valueOf(iIntValue)) : aVar.c(i4, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    private at() {
        throw null;
    }
}
