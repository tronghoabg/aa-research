package v8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f47027a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f47028b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f47029c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f47030d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f47031e;

    static {
        b bVar = new b("AD_STORAGE", 0);
        f47027a = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        f47028b = bVar2;
        b bVar3 = new b("AD_USER_DATA", 2);
        f47029c = bVar3;
        b bVar4 = new b("AD_PERSONALIZATION", 3);
        f47030d = bVar4;
        f47031e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f47031e.clone();
    }
}
