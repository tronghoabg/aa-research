package z5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f48376a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f48377b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f48378c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f48379d;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f48376a = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f48377b = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f48378c = dVar3;
        f48379d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f48379d.clone();
    }
}
