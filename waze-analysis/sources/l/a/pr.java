package l.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pr {

    /* renamed from: a, reason: collision with root package name */
    public static final pr f55229a;

    /* renamed from: b, reason: collision with root package name */
    public static final pr f55230b;

    /* renamed from: c, reason: collision with root package name */
    public static final pr f55231c;

    /* renamed from: d, reason: collision with root package name */
    public static final pr f55232d;

    /* renamed from: e, reason: collision with root package name */
    public static final pr f55233e;

    /* renamed from: f, reason: collision with root package name */
    public static final pr f55234f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ pr[] f55235g;

    static {
        pr prVar = new pr("LAUNCHED_FROM_APP", 0);
        f55229a = prVar;
        pr prVar2 = new pr("APP_OPENED_VIA_DEEP_LINK", 1);
        f55230b = prVar2;
        pr prVar3 = new pr("SDK_CONNECTION_MADE", 2);
        f55231c = prVar3;
        pr prVar4 = new pr("APP_VERSION_OUTDATED_POPUP_SHOWN", 3);
        f55232d = prVar4;
        pr prVar5 = new pr("APP_VERSION_OUTDATED_POPUP_CLICKED", 4);
        f55233e = prVar5;
        pr prVar6 = new pr("STAT_NOT_SET", 5);
        f55234f = prVar6;
        f55235g = new pr[]{prVar, prVar2, prVar3, prVar4, prVar5, prVar6};
    }

    public static pr[] values() {
        return (pr[]) f55235g.clone();
    }
}
