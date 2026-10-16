package v9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f47134a;

    /* renamed from: b, reason: collision with root package name */
    public static final z f47135b;

    /* renamed from: c, reason: collision with root package name */
    public static final z f47136c;

    /* renamed from: d, reason: collision with root package name */
    public static final z f47137d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f47138e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ z[] f47139f;

    static {
        z zVar = new z("NoChange", 0);
        f47134a = zVar;
        z zVar2 = new z("Added", 1);
        f47135b = zVar2;
        z zVar3 = new z("Removed", 2);
        f47136c = zVar3;
        z zVar4 = new z("Current", 3);
        f47137d = zVar4;
        z zVar5 = new z("Reset", 4);
        f47138e = zVar5;
        f47139f = new z[]{zVar, zVar2, zVar3, zVar4, zVar5};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f47139f.clone();
    }
}
