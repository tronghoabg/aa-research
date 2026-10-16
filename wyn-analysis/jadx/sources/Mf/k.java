package Mf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f7660a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f7661b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f7662c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f7663d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f7664e;

    static {
        k kVar = new k("SUCCESSFUL", 0);
        f7660a = kVar;
        k kVar2 = new k("REREGISTER", 1);
        f7661b = kVar2;
        k kVar3 = new k("CANCELLED", 2);
        f7662c = kVar3;
        k kVar4 = new k("ALREADY_SELECTED", 3);
        f7663d = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f7664e = kVarArr;
        ic.d.t(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f7664e.clone();
    }
}
