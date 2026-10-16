package h4;

import A.AbstractC0213f;
import Ef.A;
import Ef.S;
import android.graphics.Bitmap;
import j4.C3079a;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2775b {

    /* renamed from: a, reason: collision with root package name */
    public final A f36057a;

    /* renamed from: b, reason: collision with root package name */
    public final A f36058b;

    /* renamed from: c, reason: collision with root package name */
    public final A f36059c;

    /* renamed from: d, reason: collision with root package name */
    public final A f36060d;

    /* renamed from: e, reason: collision with root package name */
    public final C3079a f36061e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36062f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f36063g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f36064h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36065i;

    /* renamed from: j, reason: collision with root package name */
    public final int f36066j;
    public final int k;

    public C2775b() {
        Lf.e eVar = S.f3698a;
        Ff.e eVar2 = Jf.n.f6132a.f4117e;
        Lf.d dVar = Lf.d.f7120b;
        C3079a c3079a = C3079a.f38629a;
        Bitmap.Config config = k4.e.f39264a;
        this.f36057a = eVar2;
        this.f36058b = dVar;
        this.f36059c = dVar;
        this.f36060d = dVar;
        this.f36061e = c3079a;
        this.f36062f = 3;
        this.f36063g = config;
        this.f36064h = true;
        this.f36065i = 1;
        this.f36066j = 1;
        this.k = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2775b)) {
            return false;
        }
        C2775b c2775b = (C2775b) obj;
        return AbstractC3340k.a(this.f36057a, c2775b.f36057a) && AbstractC3340k.a(this.f36058b, c2775b.f36058b) && AbstractC3340k.a(this.f36059c, c2775b.f36059c) && AbstractC3340k.a(this.f36060d, c2775b.f36060d) && AbstractC3340k.a(this.f36061e, c2775b.f36061e) && this.f36062f == c2775b.f36062f && this.f36063g == c2775b.f36063g && this.f36064h == c2775b.f36064h && this.f36065i == c2775b.f36065i && this.f36066j == c2775b.f36066j && this.k == c2775b.k;
    }

    public final int hashCode() {
        int iHashCode = (this.f36060d.hashCode() + ((this.f36059c.hashCode() + ((this.f36058b.hashCode() + (this.f36057a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f36061e.getClass();
        return AbstractC0213f.f(this.k) + AbstractC0213f.d(this.f36066j, AbstractC0213f.d(this.f36065i, (((((this.f36063g.hashCode() + AbstractC0213f.d(this.f36062f, (C3079a.class.hashCode() + iHashCode) * 31, 31)) * 31) + (this.f36064h ? 1231 : 1237)) * 31) + 1237) * 923521, 31), 31);
    }
}
