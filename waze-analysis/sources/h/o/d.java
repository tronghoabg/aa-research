package h.o;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f48270a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f48271b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f48272c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f48273d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f48274e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f48275f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f48276g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ d[] f48277h;

    /* renamed from: i, reason: collision with root package name */
    private final TimeUnit f48278i;

    static {
        d dVar = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f48270a = dVar;
        d dVar2 = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        f48271b = dVar2;
        d dVar3 = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f48272c = dVar3;
        d dVar4 = new d("SECONDS", 3, TimeUnit.SECONDS);
        f48273d = dVar4;
        d dVar5 = new d("MINUTES", 4, TimeUnit.MINUTES);
        f48274e = dVar5;
        d dVar6 = new d("HOURS", 5, TimeUnit.HOURS);
        f48275f = dVar6;
        d dVar7 = new d("DAYS", 6, TimeUnit.DAYS);
        f48276g = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        f48277h = dVarArr;
        h.d.b.a(dVarArr);
    }

    private d(String str, int i2, TimeUnit timeUnit) {
        this.f48278i = timeUnit;
    }

    public static d[] values() {
        return (d[]) f48277h.clone();
    }

    public final TimeUnit a() {
        return this.f48278i;
    }
}
