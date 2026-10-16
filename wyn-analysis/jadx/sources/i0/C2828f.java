package i0;

import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import e0.AbstractC2461m;
import e0.C2454f;
import e0.C2455g;
import ef.EnumC2526j;
import g0.InterfaceC2663d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: i0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2828f extends AbstractC2822B {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC2461m f36621b;

    /* renamed from: c, reason: collision with root package name */
    public float f36622c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f36623d;

    /* renamed from: e, reason: collision with root package name */
    public float f36624e;

    /* renamed from: f, reason: collision with root package name */
    public float f36625f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC2461m f36626g;

    /* renamed from: h, reason: collision with root package name */
    public int f36627h;

    /* renamed from: i, reason: collision with root package name */
    public int f36628i;

    /* renamed from: j, reason: collision with root package name */
    public float f36629j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f36630l;

    /* renamed from: m, reason: collision with root package name */
    public float f36631m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36632n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f36633o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f36634p;

    /* renamed from: q, reason: collision with root package name */
    public g0.g f36635q;

    /* renamed from: r, reason: collision with root package name */
    public final C2454f f36636r;

    /* renamed from: s, reason: collision with root package name */
    public final C2454f f36637s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f36638t;

    /* renamed from: u, reason: collision with root package name */
    public final C8.i f36639u;

    public C2828f() {
        int i5 = I.f36530a;
        this.f36623d = ff.v.f35432a;
        this.f36624e = 1.0f;
        this.f36627h = 0;
        this.f36628i = 0;
        this.f36629j = 4.0f;
        this.f36630l = 1.0f;
        this.f36632n = true;
        this.f36633o = true;
        this.f36634p = true;
        this.f36636r = e0.z.e();
        this.f36637s = e0.z.e();
        this.f36638t = Fe.c.y(EnumC2526j.f34669c, C2827e.f36618j);
        this.f36639u = new C8.i(13);
    }

    @Override // i0.AbstractC2822B
    public final void a(InterfaceC2663d interfaceC2663d) {
        InterfaceC2663d interfaceC2663d2;
        g0.g gVar;
        AbstractC3340k.e(interfaceC2663d, "<this>");
        if (this.f36632n) {
            C8.i iVar = this.f36639u;
            ((ArrayList) iVar.f1939b).clear();
            C2454f c2454f = this.f36636r;
            c2454f.c();
            List nodes = this.f36623d;
            AbstractC3340k.e(nodes, "nodes");
            ((ArrayList) iVar.f1939b).addAll(nodes);
            iVar.y(c2454f);
            e();
        } else if (this.f36634p) {
            e();
        }
        this.f36632n = false;
        this.f36634p = false;
        AbstractC2461m abstractC2461m = this.f36621b;
        C2454f c2454f2 = this.f36637s;
        if (abstractC2461m != null) {
            interfaceC2663d2 = interfaceC2663d;
            com.google.android.gms.internal.consent_sdk.a.e(interfaceC2663d2, c2454f2, abstractC2461m, this.f36622c, null, 56);
        } else {
            interfaceC2663d2 = interfaceC2663d;
        }
        AbstractC2461m abstractC2461m2 = this.f36626g;
        if (abstractC2461m2 != null) {
            g0.g gVar2 = this.f36635q;
            if (this.f36633o || gVar2 == null) {
                g0.g gVar3 = new g0.g(this.f36625f, this.f36629j, this.f36627h, this.f36628i, 16);
                this.f36635q = gVar3;
                this.f36633o = false;
                gVar = gVar3;
            } else {
                gVar = gVar2;
            }
            com.google.android.gms.internal.consent_sdk.a.e(interfaceC2663d2, c2454f2, abstractC2461m2, this.f36624e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ef.i, java.lang.Object] */
    public final void e() {
        Path path;
        C2454f c2454f = this.f36637s;
        c2454f.c();
        float f10 = this.k;
        C2454f path2 = this.f36636r;
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f36630l == 1.0f) {
            long j8 = C2384c.f33931b;
            c2454f.getClass();
            AbstractC3340k.e(path2, "path");
            c2454f.f34364a.addPath(path2.f34364a, C2384c.b(j8), C2384c.c(j8));
            return;
        }
        ?? r12 = this.f36638t;
        C2455g c2455g = (C2455g) r12.getValue();
        if (path2 != null) {
            c2455g.getClass();
            path = path2.f34364a;
        } else {
            path = null;
        }
        c2455g.f34367a.setPath(path, false);
        float length = ((C2455g) r12.getValue()).f34367a.getLength();
        float f11 = this.k;
        float f12 = this.f36631m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f36630l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((C2455g) r12.getValue()).a(f13, f14, c2454f);
        } else {
            ((C2455g) r12.getValue()).a(f13, length, c2454f);
            ((C2455g) r12.getValue()).a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f14, c2454f);
        }
    }

    public final String toString() {
        return this.f36636r.toString();
    }
}
