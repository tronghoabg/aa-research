package okhttp3.internal.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f56139a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f56140b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f56141c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f56142d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f56143e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f56144f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f56145g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f56146h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f56147i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f56148j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f56149k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f56150l;
    public static final b m;
    public static final b n;
    private static final /* synthetic */ b[] o;
    private final int p;

    static {
        b bVar = new b("NO_ERROR", 0, 0);
        f56139a = bVar;
        b bVar2 = new b("PROTOCOL_ERROR", 1, 1);
        f56140b = bVar2;
        b bVar3 = new b("INTERNAL_ERROR", 2, 2);
        f56141c = bVar3;
        b bVar4 = new b("FLOW_CONTROL_ERROR", 3, 3);
        f56142d = bVar4;
        b bVar5 = new b("SETTINGS_TIMEOUT", 4, 4);
        f56143e = bVar5;
        b bVar6 = new b("STREAM_CLOSED", 5, 5);
        f56144f = bVar6;
        b bVar7 = new b("FRAME_SIZE_ERROR", 6, 6);
        f56145g = bVar7;
        b bVar8 = new b("REFUSED_STREAM", 7, 7);
        f56146h = bVar8;
        b bVar9 = new b("CANCEL", 8, 8);
        f56147i = bVar9;
        b bVar10 = new b("COMPRESSION_ERROR", 9, 9);
        f56148j = bVar10;
        b bVar11 = new b("CONNECT_ERROR", 10, 10);
        f56149k = bVar11;
        b bVar12 = new b("ENHANCE_YOUR_CALM", 11, 11);
        f56150l = bVar12;
        b bVar13 = new b("INADEQUATE_SECURITY", 12, 12);
        m = bVar13;
        b bVar14 = new b("HTTP_1_1_REQUIRED", 13, 13);
        n = bVar14;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        o = bVarArr;
        h.d.b.a(bVarArr);
    }

    private b(String str, int i2, int i3) {
        this.p = i3;
    }

    public static b[] values() {
        return (b[]) o.clone();
    }

    public final int a() {
        return this.p;
    }
}
