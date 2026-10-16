package Cf;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f2206b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f2207c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f2208d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f2209e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f2210f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f2211g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c[] f2212h;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f2213a;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f2206b = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f2207c = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f2208d = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f2209e = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f2210f = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f2211g = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f2212h = cVarArr;
        ic.d.t(cVarArr);
    }

    public c(String str, int i5, TimeUnit timeUnit) {
        this.f2213a = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2212h.clone();
    }
}
