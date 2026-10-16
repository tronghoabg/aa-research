package u9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f46740a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f46741b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f46742c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f46743d;

    static {
        i iVar = new i("QUERY", 0);
        f46740a = iVar;
        i iVar2 = new i("DOCUMENTS", 1);
        f46741b = iVar2;
        i iVar3 = new i("TARGETTYPE_NOT_SET", 2);
        f46742c = iVar3;
        f46743d = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f46743d.clone();
    }
}
