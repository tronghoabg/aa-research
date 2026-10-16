package h.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f48251a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f48252b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f48253c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f48254d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f48255e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f48256f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f48257g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ m[] f48258h;

    /* renamed from: i, reason: collision with root package name */
    private final int f48259i;

    static {
        m mVar = new m("IGNORE_CASE", 0, 2);
        f48251a = mVar;
        m mVar2 = new m("MULTILINE", 1, 8);
        f48252b = mVar2;
        m mVar3 = new m("LITERAL", 2, 16);
        f48253c = mVar3;
        m mVar4 = new m("UNIX_LINES", 3, 1);
        f48254d = mVar4;
        m mVar5 = new m("COMMENTS", 4, 4);
        f48255e = mVar5;
        m mVar6 = new m("DOT_MATCHES_ALL", 5, 32);
        f48256f = mVar6;
        m mVar7 = new m("CANON_EQ", 6, 128);
        f48257g = mVar7;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7};
        f48258h = mVarArr;
        h.d.b.a(mVarArr);
    }

    private m(String str, int i2, int i3) {
        this.f48259i = i3;
    }

    public static m[] values() {
        return (m[]) f48258h.clone();
    }

    public final int a() {
        return this.f48259i;
    }
}
