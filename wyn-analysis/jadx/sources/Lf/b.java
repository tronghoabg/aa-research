package Lf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7104a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f7105b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f7106c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f7107d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f7108e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f7109f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f7104a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f7105b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f7106c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f7107d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f7108e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f7109f = bVarArr;
        ic.d.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7109f.clone();
    }
}
