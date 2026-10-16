package N1;

import java.util.HashMap;
import java.util.HashSet;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import n2.C3586i;

/* loaded from: classes.dex */
public class S {

    /* renamed from: a, reason: collision with root package name */
    public int f8085a = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: b, reason: collision with root package name */
    public int f8086b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public int f8087c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: d, reason: collision with root package name */
    public int f8088d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: e, reason: collision with root package name */
    public int f8089e = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: f, reason: collision with root package name */
    public int f8090f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8091g = true;

    /* renamed from: h, reason: collision with root package name */
    public e0 f8092h;

    /* renamed from: i, reason: collision with root package name */
    public e0 f8093i;

    /* renamed from: j, reason: collision with root package name */
    public int f8094j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public e0 f8095l;

    /* renamed from: m, reason: collision with root package name */
    public Q f8096m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f8097n;

    /* renamed from: o, reason: collision with root package name */
    public int f8098o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f8099p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f8100q;

    public S() {
        C3407I c3407i = AbstractC3409K.f40056b;
        e0 e0Var = e0.f40101e;
        this.f8092h = e0Var;
        this.f8093i = e0Var;
        this.f8094j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.k = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f8095l = e0Var;
        this.f8096m = Q.f8081d;
        this.f8097n = e0Var;
        this.f8098o = 0;
        this.f8099p = new HashMap();
        this.f8100q = new HashSet();
    }

    public final void a(C3586i c3586i) {
        this.f8085a = c3586i.f8101a;
        this.f8086b = c3586i.f8102b;
        this.f8087c = c3586i.f8103c;
        this.f8088d = c3586i.f8104d;
        this.f8089e = c3586i.f8105e;
        this.f8090f = c3586i.f8106f;
        this.f8091g = c3586i.f8107g;
        this.f8092h = c3586i.f8108h;
        this.f8093i = c3586i.f8109i;
        this.f8094j = c3586i.f8110j;
        this.k = c3586i.k;
        this.f8095l = c3586i.f8111l;
        this.f8096m = c3586i.f8112m;
        this.f8097n = c3586i.f8113n;
        this.f8098o = c3586i.f8114o;
        this.f8100q = new HashSet(c3586i.f8116q);
        this.f8099p = new HashMap(c3586i.f8115p);
    }

    public S b(int i5, int i10) {
        this.f8089e = i5;
        this.f8090f = i10;
        this.f8091g = true;
        return this;
    }
}
