package i.b.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f48514a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f48515b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f48516c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f48517d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ m[] f48518e;

    static {
        m mVar = new m("FEEDBACK_RECEIVED", 0);
        f48514a = mVar;
        m mVar2 = new m("FEEDBACK_DISMISSED", 1);
        f48515b = mVar2;
        m mVar3 = new m("FEEDBACK_CLICKED", 2);
        f48516c = mVar3;
        m mVar4 = new m("FEEDBACKEVENT_NOT_SET", 3);
        f48517d = mVar4;
        f48518e = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m[] values() {
        return (m[]) f48518e.clone();
    }
}
