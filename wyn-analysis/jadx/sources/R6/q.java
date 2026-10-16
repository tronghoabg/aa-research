package r6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: e, reason: collision with root package name */
    public int f44472e;

    /* renamed from: f, reason: collision with root package name */
    public int f44473f;

    /* renamed from: g, reason: collision with root package name */
    public int f44474g;

    /* renamed from: h, reason: collision with root package name */
    public int f44475h;

    /* renamed from: l, reason: collision with root package name */
    public e0 f44478l;

    /* renamed from: m, reason: collision with root package name */
    public int f44479m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f44480n;

    /* renamed from: o, reason: collision with root package name */
    public int f44481o;

    /* renamed from: p, reason: collision with root package name */
    public int f44482p;

    /* renamed from: q, reason: collision with root package name */
    public int f44483q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f44484r;

    /* renamed from: s, reason: collision with root package name */
    public e0 f44485s;

    /* renamed from: t, reason: collision with root package name */
    public int f44486t;

    /* renamed from: u, reason: collision with root package name */
    public int f44487u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f44488v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f44489w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f44490x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f44491y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f44492z;

    /* renamed from: a, reason: collision with root package name */
    public int f44468a = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: b, reason: collision with root package name */
    public int f44469b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public int f44470c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: d, reason: collision with root package name */
    public int f44471d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: i, reason: collision with root package name */
    public int f44476i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: j, reason: collision with root package name */
    public int f44477j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public boolean k = true;

    public q() {
        C3407I c3407i = AbstractC3409K.f40056b;
        e0 e0Var = e0.f40101e;
        this.f44478l = e0Var;
        this.f44479m = 0;
        this.f44480n = e0Var;
        this.f44481o = 0;
        this.f44482p = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f44483q = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f44484r = e0Var;
        this.f44485s = e0Var;
        this.f44486t = 0;
        this.f44487u = 0;
        this.f44488v = false;
        this.f44489w = false;
        this.f44490x = false;
        this.f44491y = new HashMap();
        this.f44492z = new HashSet();
    }

    public void a(int i5) {
        Iterator it = this.f44491y.values().iterator();
        while (it.hasNext()) {
            if (((p) it.next()).f44466a.f35019c == i5) {
                it.remove();
            }
        }
    }

    public final void b(r rVar) {
        this.f44468a = rVar.f44493a;
        this.f44469b = rVar.f44494b;
        this.f44470c = rVar.f44495c;
        this.f44471d = rVar.f44496d;
        this.f44472e = rVar.f44497e;
        this.f44473f = rVar.f44498f;
        this.f44474g = rVar.f44499g;
        this.f44475h = rVar.f44500h;
        this.f44476i = rVar.f44501i;
        this.f44477j = rVar.f44502j;
        this.k = rVar.k;
        this.f44478l = rVar.f44503l;
        this.f44479m = rVar.f44504m;
        this.f44480n = rVar.f44505n;
        this.f44481o = rVar.f44506o;
        this.f44482p = rVar.f44507p;
        this.f44483q = rVar.f44508q;
        this.f44484r = rVar.f44509r;
        this.f44485s = rVar.f44510s;
        this.f44486t = rVar.f44511t;
        this.f44487u = rVar.f44512u;
        this.f44488v = rVar.f44513v;
        this.f44489w = rVar.f44514w;
        this.f44490x = rVar.f44515x;
        this.f44492z = new HashSet(rVar.f44517z);
        this.f44491y = new HashMap(rVar.f44516y);
    }

    public q c(int i5, int i10) {
        this.f44476i = i5;
        this.f44477j = i10;
        this.k = true;
        return this;
    }
}
