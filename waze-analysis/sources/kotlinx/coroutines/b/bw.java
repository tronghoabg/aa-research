package kotlinx.coroutines.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    public static final bw f51619a;

    /* renamed from: b, reason: collision with root package name */
    public static final bw f51620b;

    /* renamed from: c, reason: collision with root package name */
    public static final bw f51621c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bw[] f51622d;

    static {
        bw bwVar = new bw("START", 0);
        f51619a = bwVar;
        bw bwVar2 = new bw("STOP", 1);
        f51620b = bwVar2;
        bw bwVar3 = new bw("STOP_AND_RESET_REPLAY_CACHE", 2);
        f51621c = bwVar3;
        bw[] bwVarArr = {bwVar, bwVar2, bwVar3};
        f51622d = bwVarArr;
        h.d.b.a(bwVarArr);
    }

    public static bw[] values() {
        return (bw[]) f51622d.clone();
    }
}
