package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f20584a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f20585b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f20586c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f20587d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f20588e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f20589f = -1;

    /* renamed from: z, reason: collision with root package name */
    private static volatile b f20590z;

    /* renamed from: B, reason: collision with root package name */
    private int f20592B;

    /* renamed from: g, reason: collision with root package name */
    private Application f20593g;

    /* renamed from: h, reason: collision with root package name */
    private Context f20594h;

    /* renamed from: n, reason: collision with root package name */
    private String f20599n;

    /* renamed from: o, reason: collision with root package name */
    private long f20600o;

    /* renamed from: p, reason: collision with root package name */
    private String f20601p;

    /* renamed from: q, reason: collision with root package name */
    private long f20602q;

    /* renamed from: r, reason: collision with root package name */
    private String f20603r;

    /* renamed from: s, reason: collision with root package name */
    private long f20604s;

    /* renamed from: t, reason: collision with root package name */
    private String f20605t;

    /* renamed from: u, reason: collision with root package name */
    private long f20606u;

    /* renamed from: v, reason: collision with root package name */
    private String f20607v;

    /* renamed from: w, reason: collision with root package name */
    private long f20608w;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f20595i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List<Long> f20596j = new ArrayList();
    private List<String> k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<Long> f20597l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private LinkedList<a> f20598m = new LinkedList<>();

    /* renamed from: x, reason: collision with root package name */
    private boolean f20609x = false;

    /* renamed from: y, reason: collision with root package name */
    private long f20610y = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f20591A = 50;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f20612a;

        /* renamed from: b, reason: collision with root package name */
        String f20613b;

        /* renamed from: c, reason: collision with root package name */
        long f20614c;

        public a(String str, String str2, long j8) {
            this.f20613b = str2;
            this.f20614c = j8;
            this.f20612a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f20614c)) + " : " + this.f20612a + ' ' + this.f20613b;
        }
    }

    private b(Application application) {
        this.f20594h = application;
        this.f20593g = application;
        if (application != null) {
            try {
                this.f20593g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f20599n = activity.getClass().getName();
                        b.this.f20600o = System.currentTimeMillis();
                        boolean unused = b.f20585b = bundle != null;
                        boolean unused2 = b.f20586c = true;
                        b.this.f20595i.add(b.this.f20599n);
                        b.this.f20596j.add(Long.valueOf(b.this.f20600o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f20599n, b.this.f20600o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f20595i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f20595i.size()) {
                            b.this.f20595i.remove(iIndexOf);
                            b.this.f20596j.remove(iIndexOf);
                        }
                        b.this.k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f20597l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f20605t = activity.getClass().getName();
                        b.this.f20606u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.f20592B == 0) {
                            b.this.f20609x = false;
                            boolean unused = b.f20586c = false;
                            b.this.f20610y = SystemClock.uptimeMillis();
                        } else if (b.this.f20592B < 0) {
                            b.n(b.this);
                            b.this.f20609x = false;
                            boolean unused2 = b.f20586c = false;
                            b.this.f20610y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f20605t, b.this.f20606u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f20603r = activity.getClass().getName();
                        b.this.f20604s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f20609x) {
                            if (b.f20584a) {
                                b.k();
                                int unused = b.f20587d = 1;
                                long unused2 = b.f20589f = b.this.f20604s;
                            }
                            if (!b.this.f20603r.equals(b.this.f20605t)) {
                                return;
                            }
                            if (b.f20586c && !b.f20585b) {
                                int unused3 = b.f20587d = 4;
                                long unused4 = b.f20589f = b.this.f20604s;
                                return;
                            } else if (!b.f20586c) {
                                int unused5 = b.f20587d = 3;
                                long unused6 = b.f20589f = b.this.f20604s;
                                return;
                            }
                        }
                        b.this.f20609x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f20603r, b.this.f20604s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f20601p = activity.getClass().getName();
                        b.this.f20602q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f20601p, b.this.f20602q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f20607v = activity.getClass().getName();
                        b.this.f20608w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f20607v, b.this.f20608w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i5 = bVar.f20592B;
        bVar.f20592B = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int l(b bVar) {
        int i5 = bVar.f20592B;
        bVar.f20592B = i5 - 1;
        return i5;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.f20592B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f20584a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f20595i;
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < this.f20595i.size(); i5++) {
                try {
                    jSONArray.put(a(this.f20595i.get(i5), this.f20596j.get(i5).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.k;
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                try {
                    jSONArray.put(a(this.k.get(i5), this.f20597l.get(i5).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f20599n, this.f20600o));
                jSONObject.put("last_start_activity", a(this.f20601p, this.f20602q));
                jSONObject.put("last_resume_activity", a(this.f20603r, this.f20604s));
                jSONObject.put("last_pause_activity", a(this.f20605t, this.f20606u));
                jSONObject.put("last_stop_activity", a(this.f20607v, this.f20608w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final String h() {
        return String.valueOf(this.f20603r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f20598m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f20609x;
    }

    public static long c() {
        return f20589f;
    }

    public static b d() {
        if (f20590z == null) {
            synchronized (b.class) {
                try {
                    if (f20590z == null) {
                        f20590z = new b(com.apm.insight.e.h());
                    }
                } finally {
                }
            }
        }
        return f20590z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f20610y;
    }

    public static int b() {
        int i5 = f20587d;
        return i5 == 1 ? f20588e ? 2 : 1 : i5;
    }

    public static void a() {
        f20588e = true;
    }

    private static JSONObject a(String str, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_NAME, str);
            jSONObject.put("time", j8);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j8, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f20598m.size() >= bVar.f20591A) {
                    aVar = bVar.f20598m.poll();
                    if (aVar != null) {
                        bVar.f20598m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j8);
                    bVar.f20598m.add(aVar);
                }
                aVar.f20613b = str2;
                aVar.f20612a = str;
                aVar.f20614c = j8;
            } catch (Throwable unused) {
            }
        }
    }
}
