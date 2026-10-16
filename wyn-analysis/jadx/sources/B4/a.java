package B4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1579a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f1580b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1581c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f1582d;

    static {
        a aVar = new a("PREFER_ARGB_8888", 0);
        f1579a = aVar;
        a aVar2 = new a("PREFER_RGB_565", 1);
        f1580b = aVar2;
        f1582d = new a[]{aVar, aVar2};
        f1581c = aVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1582d.clone();
    }
}
