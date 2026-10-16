package h4;

import A.AbstractC0213f;
import Ef.A;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1451o;
import ff.v;
import i4.InterfaceC2850g;
import j4.C3079a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Headers;
import y3.C4552j;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36092a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36093b;

    /* renamed from: c, reason: collision with root package name */
    public final C4552j f36094c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f36095d;

    /* renamed from: e, reason: collision with root package name */
    public final v f36096e;

    /* renamed from: f, reason: collision with root package name */
    public final C3079a f36097f;

    /* renamed from: g, reason: collision with root package name */
    public final Headers f36098g;

    /* renamed from: h, reason: collision with root package name */
    public final p f36099h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f36100i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f36101j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f36102l;

    /* renamed from: m, reason: collision with root package name */
    public final A f36103m;

    /* renamed from: n, reason: collision with root package name */
    public final A f36104n;

    /* renamed from: o, reason: collision with root package name */
    public final A f36105o;

    /* renamed from: p, reason: collision with root package name */
    public final A f36106p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1451o f36107q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC2850g f36108r;

    /* renamed from: s, reason: collision with root package name */
    public final n f36109s;

    /* renamed from: t, reason: collision with root package name */
    public final C2776c f36110t;

    /* renamed from: u, reason: collision with root package name */
    public final C2775b f36111u;

    /* renamed from: v, reason: collision with root package name */
    public final int f36112v;

    /* renamed from: w, reason: collision with root package name */
    public final int f36113w;

    /* renamed from: x, reason: collision with root package name */
    public final int f36114x;

    /* renamed from: y, reason: collision with root package name */
    public final int f36115y;

    /* renamed from: z, reason: collision with root package name */
    public final int f36116z;

    public h(Context context, Object obj, C4552j c4552j, Bitmap.Config config, int i5, v vVar, C3079a c3079a, Headers headers, p pVar, boolean z2, boolean z10, boolean z11, boolean z12, int i10, int i11, int i12, A a5, A a10, A a11, A a12, AbstractC1451o abstractC1451o, InterfaceC2850g interfaceC2850g, int i13, n nVar, C2776c c2776c, C2775b c2775b) {
        this.f36092a = context;
        this.f36093b = obj;
        this.f36094c = c4552j;
        this.f36095d = config;
        this.f36112v = i5;
        this.f36096e = vVar;
        this.f36097f = c3079a;
        this.f36098g = headers;
        this.f36099h = pVar;
        this.f36100i = z2;
        this.f36101j = z10;
        this.k = z11;
        this.f36102l = z12;
        this.f36113w = i10;
        this.f36114x = i11;
        this.f36115y = i12;
        this.f36103m = a5;
        this.f36104n = a10;
        this.f36105o = a11;
        this.f36106p = a12;
        this.f36107q = abstractC1451o;
        this.f36108r = interfaceC2850g;
        this.f36116z = i13;
        this.f36109s = nVar;
        this.f36110t = c2776c;
        this.f36111u = c2775b;
    }

    public static g a(h hVar) {
        Context context = hVar.f36092a;
        hVar.getClass();
        return new g(hVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return AbstractC3340k.a(this.f36092a, hVar.f36092a) && this.f36093b.equals(hVar.f36093b) && AbstractC3340k.a(this.f36094c, hVar.f36094c) && this.f36095d == hVar.f36095d && this.f36112v == hVar.f36112v && AbstractC3340k.a(this.f36096e, hVar.f36096e) && AbstractC3340k.a(this.f36097f, hVar.f36097f) && AbstractC3340k.a(this.f36098g, hVar.f36098g) && this.f36099h.equals(hVar.f36099h) && this.f36100i == hVar.f36100i && this.f36101j == hVar.f36101j && this.k == hVar.k && this.f36102l == hVar.f36102l && this.f36113w == hVar.f36113w && this.f36114x == hVar.f36114x && this.f36115y == hVar.f36115y && AbstractC3340k.a(this.f36103m, hVar.f36103m) && AbstractC3340k.a(this.f36104n, hVar.f36104n) && AbstractC3340k.a(this.f36105o, hVar.f36105o) && AbstractC3340k.a(this.f36106p, hVar.f36106p) && AbstractC3340k.a(this.f36107q, hVar.f36107q) && this.f36108r.equals(hVar.f36108r) && this.f36116z == hVar.f36116z && this.f36109s.equals(hVar.f36109s) && this.f36110t.equals(hVar.f36110t) && AbstractC3340k.a(this.f36111u, hVar.f36111u);
    }

    public final int hashCode() {
        int iHashCode = (this.f36093b.hashCode() + (this.f36092a.hashCode() * 31)) * 31;
        C4552j c4552j = this.f36094c;
        int iD = AbstractC0213f.d(this.f36112v, (this.f36095d.hashCode() + ((iHashCode + (c4552j != null ? c4552j.hashCode() : 0)) * 923521)) * 961, 29791);
        this.f36096e.getClass();
        this.f36097f.getClass();
        return this.f36111u.hashCode() + ((this.f36110t.hashCode() + ((this.f36109s.f36132a.hashCode() + AbstractC0213f.d(this.f36116z, (this.f36108r.hashCode() + ((this.f36107q.hashCode() + ((this.f36106p.hashCode() + ((this.f36105o.hashCode() + ((this.f36104n.hashCode() + ((this.f36103m.hashCode() + AbstractC0213f.d(this.f36115y, AbstractC0213f.d(this.f36114x, AbstractC0213f.d(this.f36113w, (((((((((this.f36099h.f36141a.hashCode() + ((((C3079a.class.hashCode() + ((1 + iD) * 31)) * 31) + Arrays.hashCode(this.f36098g.f42270a)) * 31)) * 31) + (this.f36100i ? 1231 : 1237)) * 31) + (this.f36101j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.f36102l ? 1231 : 1237)) * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * (-1807454463))) * 31);
    }
}
