package k9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f39325a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f39326b;

    static {
        d dVar = new d("DEFAULT", 0);
        f39325a = dVar;
        f39326b = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f39326b.clone();
    }
}
