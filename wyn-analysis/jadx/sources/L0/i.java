package L0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f6806a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f6807b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f6808c;

    static {
        i iVar = new i("Ltr", 0);
        f6806a = iVar;
        i iVar2 = new i("Rtl", 1);
        f6807b = iVar2;
        f6808c = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f6808c.clone();
    }
}
