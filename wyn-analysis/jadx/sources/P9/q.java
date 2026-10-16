package p9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f43392a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f43393b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q[] f43394c;

    static {
        q qVar = new q("ADDED", 0);
        f43392a = qVar;
        q qVar2 = new q("REMOVED", 1);
        f43393b = qVar2;
        f43394c = new q[]{qVar, qVar2};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f43394c.clone();
    }
}
