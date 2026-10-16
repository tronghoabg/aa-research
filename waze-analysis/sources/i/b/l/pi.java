package i.b.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pi {

    /* renamed from: a, reason: collision with root package name */
    public static final pi f48986a;

    /* renamed from: b, reason: collision with root package name */
    public static final pi f48987b;

    /* renamed from: c, reason: collision with root package name */
    public static final pi f48988c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ pi[] f48989d;

    static {
        pi piVar = new pi("ACCEPTED_REASON", 0);
        f48986a = piVar;
        pi piVar2 = new pi("DECLINED_REASON", 1);
        f48987b = piVar2;
        pi piVar3 = new pi("ONEOFREASON_NOT_SET", 2);
        f48988c = piVar3;
        f48989d = new pi[]{piVar, piVar2, piVar3};
    }

    public static pi[] values() {
        return (pi[]) f48989d.clone();
    }
}
