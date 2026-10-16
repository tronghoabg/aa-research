package android.support.v4.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    public static final cx f299a;

    /* renamed from: b, reason: collision with root package name */
    public static final cx f300b;

    /* renamed from: c, reason: collision with root package name */
    public static final cx f301c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cx[] f302d;

    static {
        cx cxVar = new cx("NONE", 0);
        f299a = cxVar;
        cx cxVar2 = new cx("ADDING", 1);
        f300b = cxVar2;
        cx cxVar3 = new cx("REMOVING", 2);
        f301c = cxVar3;
        cx[] cxVarArr = {cxVar, cxVar2, cxVar3};
        f302d = cxVarArr;
        h.d.b.a(cxVarArr);
    }

    public static cx[] values() {
        return (cx[]) f302d.clone();
    }
}
