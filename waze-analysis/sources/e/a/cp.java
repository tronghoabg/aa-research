package e.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cp {

    /* renamed from: a, reason: collision with root package name */
    public static final cp f46544a;

    /* renamed from: b, reason: collision with root package name */
    public static final cp f46545b;

    /* renamed from: c, reason: collision with root package name */
    public static final cp f46546c;

    /* renamed from: d, reason: collision with root package name */
    public static final cp f46547d;

    /* renamed from: e, reason: collision with root package name */
    public static final cp f46548e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cp[] f46549f;

    static {
        cp cpVar = new cp("UNARY", 0);
        f46544a = cpVar;
        cp cpVar2 = new cp("CLIENT_STREAMING", 1);
        f46545b = cpVar2;
        cp cpVar3 = new cp("SERVER_STREAMING", 2);
        f46546c = cpVar3;
        cp cpVar4 = new cp("BIDI_STREAMING", 3);
        f46547d = cpVar4;
        cp cpVar5 = new cp("UNKNOWN", 4);
        f46548e = cpVar5;
        f46549f = new cp[]{cpVar, cpVar2, cpVar3, cpVar4, cpVar5};
    }

    public static cp[] values() {
        return (cp[]) f46549f.clone();
    }

    public final boolean a() {
        return this == f46544a || this == f46546c;
    }
}
