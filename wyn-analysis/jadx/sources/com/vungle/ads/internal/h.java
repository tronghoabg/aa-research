package com.vungle.ads.internal;

import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final e f33008a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f33009b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f33010c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f33011d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f33012e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f33013f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f33014g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h[] f33015h;

    static {
        e eVar = new e();
        f33008a = eVar;
        d dVar = new d();
        f33009b = dVar;
        g gVar = new g();
        f33010c = gVar;
        f fVar = new f();
        f33011d = fVar;
        c cVar = new c();
        f33012e = cVar;
        b bVar = new b();
        f33013f = bVar;
        a aVar = new a();
        f33014g = aVar;
        f33015h = new h[]{eVar, dVar, gVar, fVar, cVar, bVar, aVar};
    }

    public /* synthetic */ h(String str, int i5, int i10) {
        this(str, i5);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f33015h.clone();
    }

    public final boolean a() {
        return AbstractC3935e.D(f33013f, f33014g).contains(this);
    }

    public abstract boolean a(h hVar);

    public final h b(h adState) {
        AbstractC3340k.e(adState, "adState");
        if (this != adState && !a(adState)) {
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Cannot transition from ");
            sbA.append(name());
            sbA.append(" to ");
            sbA.append(adState.name());
            String string = sbA.toString();
            Xf.c cVar = s.f33613p;
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AdInternal", "Illegal state transition", new IllegalStateException(string));
        }
        return adState;
    }

    public h(String str, int i5) {
    }
}
