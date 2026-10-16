package com.google.firebase.perf.metrics.a;

import android.content.Context;
import com.google.firebase.perf.f.ad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10516a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f10517b = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");

    public static String b(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (com.google.firebase.perf.e.a aVar : com.google.firebase.perf.e.a.values()) {
            if (aVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static void c(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!f10517b.matcher(str).matches()) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static boolean d(ad adVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (adVar.hasTraceMetric()) {
            arrayList.add(new d(adVar.getTraceMetric()));
        }
        if (adVar.hasNetworkRequestMetric()) {
            arrayList.add(new c(adVar.getNetworkRequestMetric(), context));
        }
        if (adVar.hasApplicationInfo()) {
            arrayList.add(new a(adVar.getApplicationInfo()));
        }
        if (adVar.hasGaugeMetric()) {
            arrayList.add(new b(adVar.getGaugeMetric()));
        }
        if (arrayList.isEmpty()) {
            com.google.firebase.perf.c.a.a().b("No validators found for PerfMetric.");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean a();
}
