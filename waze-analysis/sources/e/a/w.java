package e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f47851a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f47852b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f47853c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f47854d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f47855e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ w[] f47856f;

    static {
        w wVar = new w("CONNECTING", 0);
        f47851a = wVar;
        w wVar2 = new w("READY", 1);
        f47852b = wVar2;
        w wVar3 = new w("TRANSIENT_FAILURE", 2);
        f47853c = wVar3;
        w wVar4 = new w("IDLE", 3);
        f47854d = wVar4;
        w wVar5 = new w("SHUTDOWN", 4);
        f47855e = wVar5;
        f47856f = new w[]{wVar, wVar2, wVar3, wVar4, wVar5};
    }

    public static w[] values() {
        return (w[]) f47856f.clone();
    }
}
