package v9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f47062a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f47063b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f47064c;

    static {
        f fVar = new f("UNREACHABLE", 0);
        f47062a = fVar;
        f fVar2 = new f("REACHABLE", 1);
        f47063b = fVar2;
        f47064c = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f47064c.clone();
    }
}
