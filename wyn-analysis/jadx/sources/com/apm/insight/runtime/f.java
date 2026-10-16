package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.l.c;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f20646a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f20647b;

    /* renamed from: c, reason: collision with root package name */
    private int f20648c;

    /* renamed from: d, reason: collision with root package name */
    private int f20649d;

    public f(Context context) {
        this.f20647b = null;
        this.f20648c = 50;
        this.f20649d = 100;
        this.f20646a = context;
        this.f20647b = b();
        this.f20648c = a.a(this.f20648c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f20649d = a.a(this.f20649d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> b() {
        File fileH = com.apm.insight.l.j.h(this.f20646a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (!com.apm.insight.a.a(jSONArrayA)) {
                Long lDecode = Long.decode(jSONArrayA.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > 86400000) {
                    File fileG = com.apm.insight.l.j.g(this.f20646a);
                    fileH.renameTo(new File(fileG, String.valueOf(System.currentTimeMillis())));
                    String[] list = fileG.list();
                    if (list != null && list.length > 5) {
                        Arrays.sort(list);
                        new File(fileG, list[0]).delete();
                        return map;
                    }
                } else {
                    map.put("time", lDecode);
                    for (int i5 = 1; i5 < jSONArrayA.length(); i5++) {
                        String[] strArrSplit = jSONArrayA.optString(i5, "").split(StringUtils.SPACE);
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                        }
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
        return map;
    }

    public final void a() throws Throwable {
        HashMap<String, Long> map = this.f20647b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            com.apm.insight.c.a();
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lRemove);
        sb2.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(' ');
            sb2.append(entry.getValue());
            sb2.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f20646a), sb2.toString(), false);
        } catch (IOException unused) {
        }
    }

    public final boolean a(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return c.AnonymousClass1.a(this.f20647b, str, 1L).longValue() < ((long) this.f20648c) && c.AnonymousClass1.a(this.f20647b, "all", 1L).longValue() < ((long) this.f20649d);
    }
}
