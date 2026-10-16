package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.pgl.ssdk.a4;
import com.pgl.ssdk.aa;
import com.pgl.ssdk.ab;
import com.pgl.ssdk.ac;
import com.pgl.ssdk.ad;
import com.pgl.ssdk.ae;
import com.pgl.ssdk.af;
import com.pgl.ssdk.ag;
import com.pgl.ssdk.ah;
import com.pgl.ssdk.aj;
import com.pgl.ssdk.ak;
import com.pgl.ssdk.al;
import com.pgl.ssdk.an;
import com.pgl.ssdk.ao;
import com.pgl.ssdk.ar;
import com.pgl.ssdk.av;
import com.pgl.ssdk.aw;
import com.pgl.ssdk.ax;
import com.pgl.ssdk.ay;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.pgl.ssdk.f;
import com.pgl.ssdk.u;
import com.pgl.ssdk.v;
import com.pgl.ssdk.w;
import com.pgl.ssdk.x;
import com.pgl.ssdk.y;
import com.pgl.ssdk.z;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f32557a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f32558b = false;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Object> f32559c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f32560d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static av.a f32561e;

    /* renamed from: f, reason: collision with root package name */
    public Context f32562f;

    /* renamed from: g, reason: collision with root package name */
    private String f32563g;

    /* renamed from: h, reason: collision with root package name */
    private int f32564h;

    /* renamed from: i, reason: collision with root package name */
    private String f32565i;

    /* renamed from: j, reason: collision with root package name */
    private String f32566j = null;
    private String k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f32567l = 1;

    /* renamed from: m, reason: collision with root package name */
    public int f32568m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32569n = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.c();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.pgl.ssdk.ces.b$b, reason: collision with other inner class name */
    public class RunnableC0168b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32571a;

        public RunnableC0168b(String str) {
            this.f32571a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f32571a) && this.f32571a.equals(PglSSManager.REPORT_SCENE_ADSHOW)) {
                ab.b(b.this.f32562f);
            }
            al.a(b.this.f32562f).a();
            aa.b(b.this.f32562f);
        }
    }

    private b(Context context, String str) {
        this.f32562f = context;
        this.f32563g = str;
    }

    public static b a(Context context, String str, int i5, int i10, String str2) {
        if (f32557a == null) {
            synchronized (b.class) {
                try {
                    if (f32557a == null) {
                        if (context == null) {
                            context = ab.a().getApplicationContext();
                        }
                        if (context == null) {
                            f32560d = 4;
                            return null;
                        }
                        a(i5);
                        av.a aVarB = av.b(context, "nms");
                        if (aVarB != null) {
                            f32560d = aVarB.f32550a;
                            f32561e = aVarB;
                            return null;
                        }
                        b bVar = new b(context, str);
                        f32557a = bVar;
                        bVar.f32564h = i10;
                        f32557a.f32565i = str2;
                        f32557a.b(context);
                        f32557a.e(a(context));
                        z.a(context);
                        f32560d = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32557a;
    }

    public static String b() {
        if (e() != null) {
            return e().f32566j;
        }
        return null;
    }

    public static String c() {
        b bVarE = e();
        if (bVarE == null || TextUtils.isEmpty(bVarE.k)) {
            return null;
        }
        return bVarE.k;
    }

    public static int d() {
        return f32560d;
    }

    public static b e() {
        return f32557a;
    }

    public static av.a f() {
        return f32561e;
    }

    public String g() {
        return a4.a();
    }

    public void h() {
        a4.a(this.f32562f, this.f32563g);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ay.a(aw.a(this.f32562f, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i5 = f32557a.f32568m;
            if ((i5 > 0 && i5 < 100 && Math.random() * 100.0d < i5) || i5 == 100) {
                a("Start", null, TextUtils.isEmpty(a4.a()) ? 10000L : 0L);
            }
        } else {
            a("Start", null, TextUtils.isEmpty(a4.a()) ? 10000L : 0L);
            aw.b(this.f32562f, "pgl_init_report", jCurrentTimeMillis);
        }
        a("Start");
        if (this.f32569n) {
            ar.a(new a(), 20000L);
        }
    }

    private void b(Context context) {
        if (context == null || f32558b) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            com.pgl.ssdk.ces.a.meta(102, null, this.f32563g);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.f32564h));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ab.h(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            com.pgl.ssdk.ces.a.meta(152, null, ab.i(context));
            com.pgl.ssdk.ces.a.meta(153, null, ab.d(context));
            com.pgl.ssdk.ces.a.meta(106, null, ab.f(context));
            com.pgl.ssdk.ces.a.meta(107, null, ab.e(context));
            com.pgl.ssdk.ces.a.meta(108, null, ab.c(context));
            com.pgl.ssdk.ces.a.meta(109, null, ab.d());
            com.pgl.ssdk.ces.a.meta(110, null, ab.c());
            com.pgl.ssdk.ces.a.meta(115, null, this.f32565i);
            f32558b = true;
        } catch (Throwable unused) {
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.pgl.ssdk.ces.a.meta(104, null, str);
    }

    public Object a(int i5, Object obj) {
        if (i5 == 123) {
            return af.a(this.f32562f);
        }
        if (i5 == 121) {
            return ad.a();
        }
        if (i5 == 122) {
            return ad.b();
        }
        if (i5 == 126) {
            return ad.b(this.f32562f);
        }
        if (i5 == 128) {
            return ad.c(this.f32562f);
        }
        if (i5 == 120) {
            return ac.c();
        }
        if (i5 == 124) {
            return ag.c(this.f32562f);
        }
        if (i5 == 130) {
            return ag.a(this.f32562f);
        }
        if (i5 == 145) {
            return ah.c(this.f32562f);
        }
        if (i5 == 125) {
            return ag.b(this.f32562f);
        }
        if (i5 == 129) {
            return ae.f(this.f32562f);
        }
        if (i5 == 141) {
            return ae.e(this.f32562f);
        }
        if (i5 == 134) {
            return ak.a(this.f32562f).b();
        }
        if (i5 == 140) {
            return al.a(this.f32562f).e();
        }
        if (i5 == 144) {
            return al.a(this.f32562f).d();
        }
        if (i5 == 133) {
            return a(obj);
        }
        if (i5 == 135) {
            return v.g();
        }
        if (i5 == 201) {
            return ad.a(this.f32562f);
        }
        if (i5 == 202) {
            return ad.c();
        }
        if (i5 == 236) {
            return ax.a((String) obj);
        }
        if (i5 == 142) {
            return ab.g(this.f32562f);
        }
        if (i5 == 143) {
            return ah.a(this.f32562f);
        }
        if (i5 == 146) {
            return v.c();
        }
        if (i5 == 147) {
            return Boolean.valueOf(ab.j(this.f32562f));
        }
        if (i5 == 148) {
            return u.b(this.f32562f);
        }
        if (i5 == 149) {
            return w.a(this.f32562f);
        }
        if (i5 == 150) {
            return Integer.valueOf(x.a(this.f32562f));
        }
        if (i5 == 151) {
            return w.a();
        }
        if (i5 == 161) {
            return Boolean.valueOf(v.h());
        }
        if (i5 == 163) {
            return aj.a();
        }
        if (i5 == 169) {
            return Boolean.valueOf(aa.a(this.f32562f));
        }
        if (i5 == 170) {
            return Integer.valueOf(y.b((String) obj));
        }
        if (i5 == 203) {
            return ab.b();
        }
        if (i5 == 205) {
            return Integer.valueOf(ab.k(this.f32562f));
        }
        if (i5 == 204) {
            return Integer.valueOf(ae.a(this.f32562f));
        }
        if (i5 == 206) {
            return ah.b(this.f32562f);
        }
        return null;
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f32566j)) {
            this.f32566j = str;
            com.pgl.ssdk.ces.a.meta(103, null, str);
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.k)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.k = str;
            a4.b();
        }
    }

    public static String a() {
        if (e() != null) {
            return e().f32563g;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.lang.String r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ces.b.b(java.lang.String):void");
    }

    private static String a(Context context) {
        String strA = aw.a(context, "iid");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        aw.b(context, "iid", string);
        return string;
    }

    private String a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f32559c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f32559c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public Map<String, String> a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, this.f32562f, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    public static void a(int i5) {
        an.a(i5);
    }

    public void a(MotionEvent motionEvent) {
        y.a(motionEvent, this.f32562f);
    }

    public void a(String str) {
        ar.b(new RunnableC0168b(str));
    }

    public void a(String str, String str2, String str3, String str4) {
        c(str2);
        d(str4);
        try {
            h();
        } catch (Throwable unused) {
        }
    }

    public void a(String str, Map<String, Object> map, long j8) {
        try {
            ar.a(new ao(this.f32562f, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), j8);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ces.b.a(java.util.Map):void");
    }
}
