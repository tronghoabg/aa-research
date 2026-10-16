package i.b.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class mt {

    /* renamed from: a, reason: collision with root package name */
    public static final mt f48905a;

    /* renamed from: b, reason: collision with root package name */
    public static final mt f48906b;

    /* renamed from: c, reason: collision with root package name */
    public static final mt f48907c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ mt[] f48908d;

    static {
        mt mtVar = new mt("DEPARTURE_EPOCH_SECONDS", 0);
        f48905a = mtVar;
        mt mtVar2 = new mt("ARRIVAL_EPOCH_SECONDS", 1);
        f48906b = mtVar2;
        mt mtVar3 = new mt("CONSTRAINT_NOT_SET", 2);
        f48907c = mtVar3;
        f48908d = new mt[]{mtVar, mtVar2, mtVar3};
    }

    public static mt[] values() {
        return (mt[]) f48908d.clone();
    }
}
