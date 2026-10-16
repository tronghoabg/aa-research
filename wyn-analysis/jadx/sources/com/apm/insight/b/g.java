package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.p;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: r, reason: collision with root package name */
    private static int f20225r = 2;

    /* renamed from: a, reason: collision with root package name */
    private c f20226a;

    /* renamed from: b, reason: collision with root package name */
    private int f20227b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f20228c;

    /* renamed from: d, reason: collision with root package name */
    private int f20229d;

    /* renamed from: e, reason: collision with root package name */
    private int f20230e;

    /* renamed from: f, reason: collision with root package name */
    private f f20231f;

    /* renamed from: g, reason: collision with root package name */
    private long f20232g;

    /* renamed from: h, reason: collision with root package name */
    private long f20233h;

    /* renamed from: i, reason: collision with root package name */
    private int f20234i;

    /* renamed from: j, reason: collision with root package name */
    private long f20235j;
    private String k;

    /* renamed from: l, reason: collision with root package name */
    private String f20236l;

    /* renamed from: m, reason: collision with root package name */
    private com.apm.insight.b.e f20237m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f20238n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20239o;

    /* renamed from: p, reason: collision with root package name */
    private final p f20240p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f20241q;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f20242s;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        long f20251a;

        /* renamed from: b, reason: collision with root package name */
        long f20252b;

        /* renamed from: c, reason: collision with root package name */
        long f20253c;

        /* renamed from: d, reason: collision with root package name */
        boolean f20254d;

        /* renamed from: e, reason: collision with root package name */
        int f20255e;

        /* renamed from: f, reason: collision with root package name */
        StackTraceElement[] f20256f;

        private a() {
        }

        public /* synthetic */ a(byte b5) {
            this();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        a f20257a;

        /* renamed from: b, reason: collision with root package name */
        private int f20258b;

        public final void a(a aVar) {
            throw null;
        }
    }

    public interface c {
    }

    public static class d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public long f20259a;

        /* renamed from: b, reason: collision with root package name */
        long f20260b;

        /* renamed from: c, reason: collision with root package name */
        long f20261c;

        /* renamed from: d, reason: collision with root package name */
        int f20262d;

        /* renamed from: e, reason: collision with root package name */
        int f20263e;

        /* renamed from: f, reason: collision with root package name */
        long f20264f;

        /* renamed from: g, reason: collision with root package name */
        long f20265g;

        /* renamed from: h, reason: collision with root package name */
        String f20266h;

        /* renamed from: i, reason: collision with root package name */
        public String f20267i;

        /* renamed from: j, reason: collision with root package name */
        private String f20268j;
        private d k;

        public final JSONObject a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", g.a(this.f20266h));
                jSONObject.put("cpuDuration", this.f20265g);
                jSONObject.put("duration", this.f20264f);
                jSONObject.put("type", this.f20262d);
                jSONObject.put("count", this.f20263e);
                jSONObject.put("messageCount", this.f20263e);
                jSONObject.put("lastDuration", this.f20260b - this.f20261c);
                jSONObject.put("start", this.f20259a);
                jSONObject.put("end", this.f20260b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
                return jSONObject;
            } catch (JSONException e7) {
                e7.printStackTrace();
                return jSONObject;
            }
        }

        public final void b() {
            this.f20262d = -1;
            this.f20263e = -1;
            this.f20264f = -1L;
            this.f20266h = null;
            this.f20268j = null;
            this.k = null;
            this.f20267i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ p e() {
        return null;
    }

    private g(byte b5) {
        this.f20227b = 0;
        this.f20228c = 0;
        this.f20229d = 100;
        this.f20230e = 200;
        this.f20232g = -1L;
        this.f20233h = -1L;
        this.f20234i = -1;
        this.f20235j = -1L;
        this.f20238n = false;
        this.f20239o = false;
        this.f20241q = false;
        this.f20242s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* renamed from: b, reason: collision with root package name */
            private long f20245b;

            /* renamed from: a, reason: collision with root package name */
            private long f20244a = 0;

            /* renamed from: c, reason: collision with root package name */
            private int f20246c = -1;

            /* renamed from: d, reason: collision with root package name */
            private int f20247d = 0;

            /* renamed from: e, reason: collision with root package name */
            private int f20248e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f20257a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.f20246c == g.this.f20228c) {
                    this.f20247d++;
                } else {
                    this.f20247d = 0;
                    this.f20248e = 0;
                    this.f20245b = jUptimeMillis;
                }
                this.f20246c = g.this.f20228c;
                int i5 = this.f20247d;
                if (i5 > 0 && i5 - this.f20248e >= g.f20225r && this.f20244a != 0 && jUptimeMillis - this.f20245b > 700 && g.this.f20241q) {
                    aVar.f20256f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f20248e = this.f20247d;
                }
                aVar.f20254d = g.this.f20241q;
                aVar.f20253c = (jUptimeMillis - this.f20244a) - 300;
                aVar.f20251a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f20244a = jUptimeMillis2;
                aVar.f20252b = jUptimeMillis2 - jUptimeMillis;
                aVar.f20255e = g.this.f20228c;
                g.e().a(g.this.f20242s, 300L);
                g.c().a(aVar);
            }
        };
        this.f20226a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.f20240p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i5 = gVar.f20227b;
        gVar.f20227b = i5 + 1;
        return i5;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i5 = 0;
            for (e eVar : this.f20231f.a()) {
                if (eVar != null) {
                    i5++;
                    jSONArray.put(eVar.a().put("id", i5));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.f20238n) {
            return;
        }
        this.f20238n = true;
        this.f20229d = 100;
        this.f20230e = 300;
        this.f20231f = new f(100);
        this.f20237m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f20219a);
                g gVar = g.this;
                gVar.k = gVar.f20236l;
                g.this.f20236l = "no message running";
                g.this.f20241q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.f20241q = true;
                g.this.f20236l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f20219a);
            }
        };
        h.a();
        h.a(this.f20237m);
        j.a(j.a());
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private int f20269a;

        /* renamed from: b, reason: collision with root package name */
        private int f20270b;

        /* renamed from: c, reason: collision with root package name */
        private e f20271c;

        /* renamed from: d, reason: collision with root package name */
        private List<e> f20272d = new ArrayList();

        public f(int i5) {
            this.f20269a = i5;
        }

        public final e a(int i5) {
            e eVar = this.f20271c;
            if (eVar != null) {
                eVar.f20262d = i5;
                this.f20271c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f20262d = i5;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.f20272d.size();
            int i5 = this.f20269a;
            if (size < i5) {
                this.f20272d.add(eVar);
                this.f20270b = this.f20272d.size();
                return;
            }
            int i10 = this.f20270b % i5;
            this.f20270b = i10;
            e eVar2 = this.f20272d.set(i10, eVar);
            eVar2.b();
            this.f20271c = eVar2;
            this.f20270b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            if (this.f20272d.size() == this.f20269a) {
                for (int i10 = this.f20270b; i10 < this.f20272d.size(); i10++) {
                    arrayList.add(this.f20272d.get(i10));
                }
                while (i5 < this.f20270b - 1) {
                    arrayList.add(this.f20272d.get(i5));
                    i5++;
                }
            } else {
                while (i5 < this.f20272d.size()) {
                    arrayList.add(this.f20272d.get(i5));
                    i5++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i5, long j8, String str) {
        a(i5, j8, str, true);
    }

    private void a(int i5, long j8, String str, boolean z2) {
        this.f20239o = true;
        e eVarA = this.f20231f.a(i5);
        eVarA.f20264f = j8 - this.f20232g;
        if (z2) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.f20265g = jCurrentThreadTimeMillis - this.f20235j;
            this.f20235j = jCurrentThreadTimeMillis;
        } else {
            eVarA.f20265g = -1L;
        }
        eVarA.f20263e = this.f20227b;
        eVarA.f20266h = str;
        eVarA.f20267i = this.k;
        eVarA.f20259a = this.f20232g;
        eVarA.f20260b = j8;
        eVarA.f20261c = this.f20233h;
        this.f20231f.a(eVarA);
        this.f20227b = 0;
        this.f20232g = j8;
    }

    public final e a(long j8) {
        e eVar = new e();
        eVar.f20266h = this.f20236l;
        eVar.f20267i = this.k;
        eVar.f20264f = j8 - this.f20233h;
        eVar.f20265g = 0 - this.f20235j;
        eVar.f20263e = this.f20227b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(StringUtils.SPACE)) {
                str = str.replace(StringUtils.SPACE, "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z2, long j8) {
        int i5 = gVar.f20228c + 1;
        gVar.f20228c = i5;
        gVar.f20228c = i5 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        gVar.f20239o = false;
        if (gVar.f20232g < 0) {
            gVar.f20232g = j8;
        }
        if (gVar.f20233h < 0) {
            gVar.f20233h = j8;
        }
        if (gVar.f20234i < 0) {
            gVar.f20234i = Process.myTid();
            gVar.f20235j = SystemClock.currentThreadTimeMillis();
        }
        long j10 = j8 - gVar.f20232g;
        int i10 = gVar.f20230e;
        if (j10 > i10) {
            long j11 = gVar.f20233h;
            if (j8 - j11 <= i10) {
                gVar.a(9, j8, gVar.f20236l);
            } else if (z2) {
                if (gVar.f20227b == 0) {
                    gVar.a(1, j8, "no message running");
                } else {
                    gVar.a(9, j11, gVar.k);
                    gVar.a(1, j8, "no message running", false);
                }
            } else if (gVar.f20227b == 0) {
                gVar.a(8, j8, gVar.f20236l, true);
            } else {
                gVar.a(9, j11, gVar.k, false);
                gVar.a(8, j8, gVar.f20236l, true);
            }
        }
        gVar.f20233h = j8;
    }
}
