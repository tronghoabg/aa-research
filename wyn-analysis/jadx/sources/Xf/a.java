package Xf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16248a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f16249b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f16250c;

    static {
        a aVar = new a("NONE", 0);
        f16248a = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f16249b = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f16250c = aVarArr;
        ic.d.t(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16250c.clone();
    }
}
