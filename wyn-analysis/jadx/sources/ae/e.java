package ae;

import mf.C3560b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final d f17637b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f17638c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f17639d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f17640e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f17641f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f17642g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f17643h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f17644i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f17645j;
    public static final /* synthetic */ e[] k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C3560b f17646l;

    /* renamed from: a, reason: collision with root package name */
    public final String f17647a;

    static {
        e eVar = new e("Unknown", 0, "unknown");
        f17638c = eVar;
        e eVar2 = new e("Url", 1, "url");
        f17639d = eVar2;
        e eVar3 = new e("DeepLink", 2, "deeplink");
        f17640e = eVar3;
        e eVar4 = new e("Navigation", 3, "navigation");
        f17641f = eVar4;
        e eVar5 = new e("Purchase", 4, "purchase");
        f17642g = eVar5;
        e eVar6 = new e("Restore", 5, "restore");
        f17643h = eVar6;
        e eVar7 = new e("Close", 6, "close");
        f17644i = eVar7;
        e eVar8 = new e("CloseAll", 7, "closeAll");
        f17645j = eVar8;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, new e("LoadProducts", 8, "getProducts"), new e("ShowScreen", 9, "showScreen")};
        k = eVarArr;
        f17646l = ic.d.t(eVarArr);
        f17637b = new d(0);
    }

    public e(String str, int i5, String str2) {
        this.f17647a = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) k.clone();
    }
}
