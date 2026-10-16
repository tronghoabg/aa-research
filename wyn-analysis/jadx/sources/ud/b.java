package ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f46773a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f46774b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f46775c;

    static {
        b bVar = new b("BLOCKING", 0);
        f46773a = bVar;
        b bVar2 = new b("FUTURE", 1);
        b bVar3 = new b("ASYNC", 2);
        f46774b = bVar3;
        f46775c = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f46775c.clone();
    }
}
