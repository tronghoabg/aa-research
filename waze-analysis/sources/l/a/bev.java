package l.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bev {

    /* renamed from: a, reason: collision with root package name */
    public static final bev f53838a;

    /* renamed from: b, reason: collision with root package name */
    public static final bev f53839b;

    /* renamed from: c, reason: collision with root package name */
    public static final bev f53840c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bev[] f53841d;

    static {
        bev bevVar = new bev("SIRI_SHORTCUT_FINISHED", 0);
        f53838a = bevVar;
        bev bevVar2 = new bev("SIRI_SHORTCUT_ADDED", 1);
        f53839b = bevVar2;
        bev bevVar3 = new bev("STAT_NOT_SET", 2);
        f53840c = bevVar3;
        f53841d = new bev[]{bevVar, bevVar2, bevVar3};
    }

    public static bev[] values() {
        return (bev[]) f53841d.clone();
    }
}
