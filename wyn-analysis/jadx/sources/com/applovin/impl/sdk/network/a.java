package com.applovin.impl.sdk.network;

import A7.AbstractC0279p0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.v4;
import com.applovin.impl.y4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f23153a;

    /* renamed from: b, reason: collision with root package name */
    private String f23154b;

    /* renamed from: c, reason: collision with root package name */
    private Map f23155c;

    /* renamed from: d, reason: collision with root package name */
    private Map f23156d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f23157e;

    /* renamed from: f, reason: collision with root package name */
    private String f23158f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f23159g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23160h;

    /* renamed from: i, reason: collision with root package name */
    private int f23161i;

    /* renamed from: j, reason: collision with root package name */
    private final int f23162j;
    private final int k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f23163l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f23164m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f23165n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f23166o;

    /* renamed from: p, reason: collision with root package name */
    private final v4.a f23167p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f23168q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f23169r;

    /* renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0023a {

        /* renamed from: a, reason: collision with root package name */
        String f23170a;

        /* renamed from: b, reason: collision with root package name */
        String f23171b;

        /* renamed from: c, reason: collision with root package name */
        String f23172c;

        /* renamed from: e, reason: collision with root package name */
        Map f23174e;

        /* renamed from: f, reason: collision with root package name */
        JSONObject f23175f;

        /* renamed from: g, reason: collision with root package name */
        Object f23176g;

        /* renamed from: i, reason: collision with root package name */
        int f23178i;

        /* renamed from: j, reason: collision with root package name */
        int f23179j;
        boolean k;

        /* renamed from: m, reason: collision with root package name */
        boolean f23181m;

        /* renamed from: n, reason: collision with root package name */
        boolean f23182n;

        /* renamed from: o, reason: collision with root package name */
        boolean f23183o;

        /* renamed from: p, reason: collision with root package name */
        boolean f23184p;

        /* renamed from: q, reason: collision with root package name */
        v4.a f23185q;

        /* renamed from: h, reason: collision with root package name */
        int f23177h = 1;

        /* renamed from: l, reason: collision with root package name */
        boolean f23180l = true;

        /* renamed from: d, reason: collision with root package name */
        Map f23173d = new HashMap();

        public C0023a(k kVar) {
            this.f23178i = ((Integer) kVar.a(y4.f23738Y2)).intValue();
            this.f23179j = ((Integer) kVar.a(y4.f23730X2)).intValue();
            this.f23181m = ((Boolean) kVar.a(y4.f23918u3)).booleanValue();
            this.f23182n = ((Boolean) kVar.a(y4.f23844l5)).booleanValue();
            this.f23185q = v4.a.a(((Integer) kVar.a(y4.f23853m5)).intValue());
            this.f23184p = ((Boolean) kVar.a(y4.f23640L5)).booleanValue();
        }

        public C0023a a(Map map) {
            this.f23174e = map;
            return this;
        }

        public C0023a b(String str) {
            this.f23171b = str;
            return this;
        }

        public C0023a c(String str) {
            this.f23170a = str;
            return this;
        }

        public C0023a d(boolean z2) {
            this.f23180l = z2;
            return this;
        }

        public C0023a e(boolean z2) {
            this.f23181m = z2;
            return this;
        }

        public C0023a f(boolean z2) {
            this.f23183o = z2;
            return this;
        }

        public C0023a a(JSONObject jSONObject) {
            this.f23175f = jSONObject;
            return this;
        }

        public C0023a b(Map map) {
            this.f23173d = map;
            return this;
        }

        public C0023a c(int i5) {
            this.f23178i = i5;
            return this;
        }

        public C0023a a(String str) {
            this.f23172c = str;
            return this;
        }

        public C0023a b(int i5) {
            this.f23179j = i5;
            return this;
        }

        public C0023a c(boolean z2) {
            this.k = z2;
            return this;
        }

        public C0023a a(Object obj) {
            this.f23176g = obj;
            return this;
        }

        public C0023a b(boolean z2) {
            this.f23184p = z2;
            return this;
        }

        public C0023a a(int i5) {
            this.f23177h = i5;
            return this;
        }

        public C0023a a(boolean z2) {
            this.f23182n = z2;
            return this;
        }

        public C0023a a(v4.a aVar) {
            this.f23185q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public a(C0023a c0023a) {
        this.f23153a = c0023a.f23171b;
        this.f23154b = c0023a.f23170a;
        this.f23155c = c0023a.f23173d;
        this.f23156d = c0023a.f23174e;
        this.f23157e = c0023a.f23175f;
        this.f23158f = c0023a.f23172c;
        this.f23159g = c0023a.f23176g;
        int i5 = c0023a.f23177h;
        this.f23160h = i5;
        this.f23161i = i5;
        this.f23162j = c0023a.f23178i;
        this.k = c0023a.f23179j;
        this.f23163l = c0023a.k;
        this.f23164m = c0023a.f23180l;
        this.f23165n = c0023a.f23181m;
        this.f23166o = c0023a.f23182n;
        this.f23167p = c0023a.f23185q;
        this.f23168q = c0023a.f23183o;
        this.f23169r = c0023a.f23184p;
    }

    public void a(String str) {
        this.f23153a = str;
    }

    public void b(String str) {
        this.f23154b = str;
    }

    public int c() {
        return this.f23160h - this.f23161i;
    }

    public Object d() {
        return this.f23159g;
    }

    public v4.a e() {
        return this.f23167p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f23153a;
        if (str == null ? aVar.f23153a != null : !str.equals(aVar.f23153a)) {
            return false;
        }
        Map map = this.f23155c;
        if (map == null ? aVar.f23155c != null : !map.equals(aVar.f23155c)) {
            return false;
        }
        Map map2 = this.f23156d;
        if (map2 == null ? aVar.f23156d != null : !map2.equals(aVar.f23156d)) {
            return false;
        }
        String str2 = this.f23158f;
        if (str2 == null ? aVar.f23158f != null : !str2.equals(aVar.f23158f)) {
            return false;
        }
        String str3 = this.f23154b;
        if (str3 == null ? aVar.f23154b != null : !str3.equals(aVar.f23154b)) {
            return false;
        }
        JSONObject jSONObject = this.f23157e;
        if (jSONObject == null ? aVar.f23157e != null : !jSONObject.equals(aVar.f23157e)) {
            return false;
        }
        Object obj2 = this.f23159g;
        if (obj2 == null ? aVar.f23159g == null : obj2.equals(aVar.f23159g)) {
            return this.f23160h == aVar.f23160h && this.f23161i == aVar.f23161i && this.f23162j == aVar.f23162j && this.k == aVar.k && this.f23163l == aVar.f23163l && this.f23164m == aVar.f23164m && this.f23165n == aVar.f23165n && this.f23166o == aVar.f23166o && this.f23167p == aVar.f23167p && this.f23168q == aVar.f23168q && this.f23169r == aVar.f23169r;
        }
        return false;
    }

    public String f() {
        return this.f23153a;
    }

    public Map g() {
        return this.f23156d;
    }

    public String h() {
        return this.f23154b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f23153a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23158f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23154b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f23159g;
        int iB = ((((this.f23167p.b() + ((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f23160h) * 31) + this.f23161i) * 31) + this.f23162j) * 31) + this.k) * 31) + (this.f23163l ? 1 : 0)) * 31) + (this.f23164m ? 1 : 0)) * 31) + (this.f23165n ? 1 : 0)) * 31) + (this.f23166o ? 1 : 0)) * 31)) * 31) + (this.f23168q ? 1 : 0)) * 31) + (this.f23169r ? 1 : 0);
        Map map = this.f23155c;
        if (map != null) {
            iB = (iB * 31) + map.hashCode();
        }
        Map map2 = this.f23156d;
        if (map2 != null) {
            iB = (iB * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f23157e;
        if (jSONObject == null) {
            return iB;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).hashCode() + (iB * 31);
    }

    public Map i() {
        return this.f23155c;
    }

    public int j() {
        return this.f23161i;
    }

    public int k() {
        return this.k;
    }

    public int l() {
        return this.f23162j;
    }

    public boolean m() {
        return this.f23166o;
    }

    public boolean n() {
        return this.f23163l;
    }

    public boolean o() {
        return this.f23169r;
    }

    public boolean p() {
        return this.f23164m;
    }

    public boolean q() {
        return this.f23165n;
    }

    public boolean r() {
        return this.f23168q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequest {endpoint=");
        sb2.append(this.f23153a);
        sb2.append(", backupEndpoint=");
        sb2.append(this.f23158f);
        sb2.append(", httpMethod=");
        sb2.append(this.f23154b);
        sb2.append(", httpHeaders=");
        sb2.append(this.f23156d);
        sb2.append(", body=");
        sb2.append(this.f23157e);
        sb2.append(", emptyResponse=");
        sb2.append(this.f23159g);
        sb2.append(", initialRetryAttempts=");
        sb2.append(this.f23160h);
        sb2.append(", retryAttemptsLeft=");
        sb2.append(this.f23161i);
        sb2.append(", timeoutMillis=");
        sb2.append(this.f23162j);
        sb2.append(", retryDelayMillis=");
        sb2.append(this.k);
        sb2.append(", exponentialRetries=");
        sb2.append(this.f23163l);
        sb2.append(", retryOnAllErrors=");
        sb2.append(this.f23164m);
        sb2.append(", retryOnNoConnection=");
        sb2.append(this.f23165n);
        sb2.append(", encodingEnabled=");
        sb2.append(this.f23166o);
        sb2.append(", encodingType=");
        sb2.append(this.f23167p);
        sb2.append(", trackConnectionSpeed=");
        sb2.append(this.f23168q);
        sb2.append(", gzipBodyEncoding=");
        return AbstractC0279p0.p(sb2, this.f23169r, '}');
    }

    public String a() {
        return this.f23158f;
    }

    public JSONObject b() {
        return this.f23157e;
    }

    public void a(int i5) {
        this.f23161i = i5;
    }

    public static C0023a a(k kVar) {
        return new C0023a(kVar);
    }
}
