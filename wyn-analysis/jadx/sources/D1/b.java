package D1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2267a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f2268b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f2269c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f2270d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2271e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f2272f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f2273g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f2274h;

    /* JADX INFO: Fake field, exist only in values array */
    b EF9;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        b bVar2 = new b("PENALTY_DEATH", 1);
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f2267a = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f2268b = bVar4;
        b bVar5 = new b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f2269c = bVar5;
        b bVar6 = new b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f2270d = bVar6;
        b bVar7 = new b("DETECT_SET_USER_VISIBLE_HINT", 6);
        f2271e = bVar7;
        b bVar8 = new b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        f2272f = bVar8;
        b bVar9 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f2273g = bVar9;
        f2274h = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2274h.clone();
    }
}
