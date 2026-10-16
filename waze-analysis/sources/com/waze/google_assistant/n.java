package com.waze.google_assistant;

import android.content.Intent;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import androidx.car.app.CarContext;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.config.ConfigValues;
import com.waze.cr;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24227a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f24228b;

    /* renamed from: c, reason: collision with root package name */
    private final k f24229c;

    /* renamed from: d, reason: collision with root package name */
    private final ah f24230d;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("GoogleAssistantIntentManager");
        h.g.b.x.e(eVarD, "create(...)");
        f24228b = eVarD;
    }

    public n(k kVar, ah ahVar) {
        h.g.b.x.f(kVar, "actionsRunner");
        h.g.b.x.f(ahVar, "googleAssistantStatHelper");
        this.f24229c = kVar;
        this.f24230d = ahVar;
    }

    public static /* synthetic */ h.ab a(n nVar, UrlQuerySanitizer urlQuerySanitizer, String str, boolean z) {
        String value = urlQuerySanitizer.getValue("act");
        if (value == null) {
            f24228b.b("handle action failed, reason = action empty");
        } else {
            com.waze.shared_infra.i.e eVar = f24228b;
            eVar.a("action <" + value + "> and data <" + str + "> received, shouldBeUnified = " + z);
            h.g.b.x.f(value, "param");
            if (com.waze.location.q.h(az.f24131e, value, z)) {
                nVar.f24229c.u();
            } else if (com.waze.location.q.h(az.f24133g, value, z) || com.waze.location.q.h(az.f24134h, value, z) || com.waze.location.q.h(az.f24135i, value, z)) {
                nVar.f24229c.o();
            } else if (com.waze.location.q.h(az.f24137k, value, z)) {
                nVar.f24229c.r();
            } else if (com.waze.location.q.h(az.f24127a, value, z)) {
                nVar.f24229c.p(false);
            } else if (com.waze.location.q.h(az.f24128b, value, z)) {
                nVar.f24229c.p(true);
            } else if (com.waze.location.q.h(az.f24130d, value, z)) {
                nVar.f24229c.t();
            } else if (com.waze.location.q.h(az.f24129c, value, z)) {
                nVar.f24229c.q();
            } else if (com.waze.location.q.h(az.m, value, z)) {
                nVar.f24229c.j();
            } else if (com.waze.location.q.h(az.q, value, z)) {
                k kVar = nVar.f24229c;
                com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_FERRIES;
                h.g.b.x.e(bVar, "CONFIG_VALUE_ROUTING_AVOID_FERRIES");
                kVar.w(bVar, true, e.o);
            } else if (com.waze.location.q.h(az.r, value, z)) {
                k kVar2 = nVar.f24229c;
                com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_FERRIES;
                h.g.b.x.e(bVar2, "CONFIG_VALUE_ROUTING_AVOID_FERRIES");
                kVar2.w(bVar2, false, e.o);
            } else if (com.waze.location.q.h(az.o, value, z)) {
                k kVar3 = nVar.f24229c;
                com.waze.config.b bVar3 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS;
                h.g.b.x.e(bVar3, "CONFIG_VALUE_ROUTING_AVOID_TOLLS");
                kVar3.w(bVar3, true, e.f24169h);
            } else if (com.waze.location.q.h(az.p, value, z)) {
                k kVar4 = nVar.f24229c;
                com.waze.config.b bVar4 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_TOLLS;
                h.g.b.x.e(bVar4, "CONFIG_VALUE_ROUTING_AVOID_TOLLS");
                kVar4.w(bVar4, false, e.f24169h);
            } else if (com.waze.location.q.h(az.s, value, z)) {
                k kVar5 = nVar.f24229c;
                com.waze.config.b bVar5 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PRIMARIES;
                h.g.b.x.e(bVar5, "CONFIG_VALUE_ROUTING_AVOID_PRIMARIES");
                kVar5.w(bVar5, true, e.f24168g);
            } else if (com.waze.location.q.h(az.t, value, z)) {
                k kVar6 = nVar.f24229c;
                com.waze.config.b bVar6 = ConfigValues.CONFIG_VALUE_ROUTING_AVOID_PRIMARIES;
                h.g.b.x.e(bVar6, "CONFIG_VALUE_ROUTING_AVOID_PRIMARIES");
                kVar6.w(bVar6, false, e.f24168g);
            } else if (com.waze.location.q.h(az.f24136j, value, z)) {
                nVar.f24229c.g();
            } else if (com.waze.location.q.h(az.n, value, z)) {
                nVar.f24229c.s();
            } else if (com.waze.location.q.h(az.u, value, z)) {
                nVar.f24229c.k(urlQuerySanitizer.getValue("accident_type"), urlQuerySanitizer.getValue("road_direction"), z);
            } else if (com.waze.location.q.h(az.w, value, z)) {
                nVar.f24229c.m(urlQuerySanitizer.getValue("road_direction"), z);
            } else if (com.waze.location.q.h(az.v, value, z)) {
                nVar.f24229c.n(urlQuerySanitizer.getValue("traffic_type"), urlQuerySanitizer.getValue("road_direction"), z);
            } else if (com.waze.location.q.h(az.x, value, z)) {
                nVar.f24229c.l(urlQuerySanitizer.getValue("hazard_type"), urlQuerySanitizer.getValue("road_direction"), urlQuerySanitizer.getValue("location_on_road"), z);
            } else {
                eVar.e("handle action failed, reason = action code <" + value + "> not supported");
                nVar.f24230d.c(null, false);
            }
        }
        return h.ab.f48028a;
    }

    static final h.ab b(n nVar, Uri uri, cr crVar, Intent intent) {
        List listAf;
        boolean zB = com.waze.ad.c.b.b(intent);
        com.waze.shared_infra.i.e eVar = f24228b;
        Objects.toString(uri);
        eVar.e("received tactile uri = ".concat(uri.toString()));
        String queryParameter = uri.getQueryParameter("q");
        String str = queryParameter;
        if (str != null && str.length() != 0) {
            crVar.e(queryParameter, true);
        } else if (uri.getPathSegments().size() >= 4 && h.g.b.x.n(uri.getPathSegments().get(0), "maps") && h.g.b.x.n(uri.getPathSegments().get(1), "dir")) {
            String str2 = uri.getPathSegments().get(2);
            String lastPathSegment = uri.getLastPathSegment();
            String str3 = null;
            if (lastPathSegment != null && (listAf = h.n.o.af(lastPathSegment, new String[]{"data="}, 0, 6)) != null) {
                str3 = (String) h.a.i.S(listAf, 1);
            }
            String str4 = str3;
            if (str4 == null || str4.length() == 0) {
                eVar.e("no serialized data from tactile uri, performing search on query text `" + str2 + "`");
                String str5 = str2;
                if (str5 != null && str5.length() != 0) {
                    crVar.e(str2, zB);
                }
            } else {
                nVar.f24229c.i(str3, str2, crVar, zB);
            }
        }
        return h.ab.f48028a;
    }

    static final h.ab c(n nVar, String str, String str2, cr crVar, Intent intent) {
        nVar.f24229c.h(str, str2, crVar, com.waze.ad.c.b.b(intent));
        return h.ab.f48028a;
    }

    private static final void e(cr crVar, h.g.a.a aVar) {
        if (crVar.f()) {
            aVar.invoke();
        } else {
            f24228b.e("Parsed as Google Assistant intent, blocked since we're not allowed to handle GA intents");
        }
    }

    public final boolean d(final Intent intent, final cr crVar) {
        Object obj;
        String encodedSchemeSpecificPart;
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        h.g.b.x.f(crVar, "helper");
        Uri data = intent.getData();
        if (data != null) {
            String scheme = data.getScheme();
            String action = intent.getAction();
            boolean z = h.g.b.x.n(scheme, "geo.action") && h.g.b.x.n(action, "android.intent.action.VIEW") && crVar.g();
            if ((z || h.g.b.x.n(scheme, "google.maps") || (h.g.b.x.n(scheme, "geo") && h.g.b.x.n(action, "android.intent.action.VIEW"))) && (encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart()) != null) {
                if (encodedSchemeSpecificPart.length() <= 0) {
                    encodedSchemeSpecificPart = null;
                }
                if (encodedSchemeSpecificPart != null) {
                    ay ayVar = new ay();
                    ayVar.parseUrl(encodedSchemeSpecificPart);
                    if (ayVar.hasParameter("act")) {
                        e(crVar, new com.waze.car_lib.b.j(this, ayVar, encodedSchemeSpecificPart, z, 4));
                        return true;
                    }
                }
            }
        }
        final Uri data2 = intent.getData();
        if (data2 == null) {
            return false;
        }
        String host = data2.getHost();
        if (h.g.b.x.n(host, "www.google.com")) {
            List<String> pathSegments = data2.getPathSegments();
            h.g.b.x.e(pathSegments, "getPathSegments(...)");
            if (h.g.b.x.n(h.a.i.S(pathSegments, 0), "maps")) {
                e(crVar, new h.g.a.a() { // from class: com.waze.google_assistant.l
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return n.b(this.f24218a, data2, crVar, intent);
                    }
                });
                return true;
            }
        }
        int i2 = 6;
        int i3 = 7;
        if (!h.g.b.x.n(host, "maps.google.com")) {
            obj = "geo";
        } else if (h.g.b.x.n(data2.getQueryParameter("entry"), "sar")) {
            final String queryParameter = data2.getQueryParameter("results");
            obj = "geo";
            final String queryParameter2 = data2.getQueryParameter("q");
            String str = queryParameter;
            if (str != null && str.length() != 0) {
                e(crVar, new h.g.a.a() { // from class: com.waze.google_assistant.m
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return n.c(this.f24222a, queryParameter, queryParameter2, crVar, intent);
                    }
                });
                return true;
            }
            String str2 = queryParameter2;
            if (str2 != null && str2.length() != 0) {
                e(crVar, new com.waze.app_nav.hub.o(crVar, queryParameter2, intent, 7));
                return true;
            }
        } else {
            obj = "geo";
            if (h.g.b.x.n(data2.getQueryParameter("place"), "home")) {
                e(crVar, new com.waze.beacons.m(crVar, 11));
                return true;
            }
            if (h.g.b.x.n(data2.getQueryParameter("place"), "work")) {
                e(crVar, new com.waze.beacons.m(crVar, i2));
                return true;
            }
        }
        String strDecode = Uri.decode(data2.toString());
        if (h.g.b.x.n(strDecode, "google.navigation:q=home&entry=s:si")) {
            e(crVar, new com.waze.beacons.m(crVar, i3));
        } else {
            if (!h.g.b.x.n(strDecode, "google.navigation:q=work&entry=s:si")) {
                String action2 = intent.getAction();
                Uri data3 = intent.getData();
                if (h.g.b.x.n(data3 != null ? data3.getHost() : null, "maps.google.com") && (h.g.b.x.n(action2, CarContext.ACTION_NAVIGATE) || h.g.b.x.n(action2, "android.intent.action.NAVIGATE"))) {
                    int intExtra = intent.getIntExtra("com.google.android.googlequicksearchbox.LocationAlias", -1);
                    if (intExtra == 0) {
                        f24228b.e("parseAsCarNavigateHomeWork: starting navigation home");
                        e(crVar, new com.waze.beacons.m(crVar, 9));
                    } else if (intExtra == 1) {
                        f24228b.e("parseAsCarNavigateHomeWork: starting navigation work");
                        e(crVar, new com.waze.beacons.m(crVar, 10));
                    }
                    return true;
                }
                String action3 = intent.getAction();
                Uri data4 = intent.getData();
                String scheme2 = data4 != null ? data4.getScheme() : null;
                if (h.g.b.x.n(scheme2, obj) && (h.g.b.x.n(action3, CarContext.ACTION_NAVIGATE) || h.g.b.x.n(action3, "android.intent.action.NAVIGATE") || h.g.b.x.n(action3, "android.intent.action.SEARCH") || (h.g.b.x.n(action3, "android.intent.action.VIEW") && crVar.g()))) {
                    try {
                        String queryParameter3 = Uri.parse("http://" + intent.getDataString()).getQueryParameter("q");
                        String str3 = queryParameter3;
                        if (str3 != null && str3.length() != 0) {
                            f24228b.e("parseAsUnifiedSearchOrNavigationIntent: starting handling intent by onVoiceSearchInitiated action: " + action3 + " searchTerm: " + queryParameter3);
                            e(crVar, new com.waze.app_nav.hub.o(queryParameter3, crVar, intent, 6));
                            return true;
                        }
                    } catch (Exception e2) {
                        com.waze.shared_infra.i.e eVar = f24228b;
                        e2.toString();
                        eVar.g("parseAsUnifiedSearchOrNavigationIntent: issue parsing deep-link: ".concat(e2.toString()));
                    }
                }
                f24228b.e("parseAsUnifiedSearchOrNavigationIntent: intent action filtered out, scheme: " + scheme2 + " action: " + action3);
                return false;
            }
            e(crVar, new com.waze.beacons.m(crVar, 8));
        }
        return true;
    }
}
