package ae;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17623b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f17624c;

    /* renamed from: a, reason: collision with root package name */
    public final int f17625a;

    static {
        a aVar = new a("Verbose", 0, 0);
        a aVar2 = new a("Info", 1, 10);
        f17623b = aVar2;
        a[] aVarArr = {aVar, aVar2, new a("Warning", 2, 20), new a("Error", 3, 30), new a("Disabled", 4, com.google.android.gms.common.api.f.API_PRIORITY_OTHER)};
        f17624c = aVarArr;
        ic.d.t(aVarArr);
    }

    public a(String str, int i5, int i10) {
        this.f17625a = i10;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17624c.clone();
    }
}
