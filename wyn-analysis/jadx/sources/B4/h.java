package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1590a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f1591b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f1592c;

    static {
        h hVar = new h("SRGB", 0);
        f1590a = hVar;
        h hVar2 = new h("DISPLAY_P3", 1);
        f1591b = hVar2;
        f1592c = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f1592c.clone();
    }
}
