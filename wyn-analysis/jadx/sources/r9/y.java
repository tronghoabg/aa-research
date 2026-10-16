package r9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f44679a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f44680b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f44681c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f44682d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ y[] f44683e;

    static {
        y yVar = new y("LISTEN", 0);
        f44679a = yVar;
        y yVar2 = new y("EXISTENCE_FILTER_MISMATCH", 1);
        f44680b = yVar2;
        y yVar3 = new y("EXISTENCE_FILTER_MISMATCH_BLOOM", 2);
        f44681c = yVar3;
        y yVar4 = new y("LIMBO_RESOLUTION", 3);
        f44682d = yVar4;
        f44683e = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f44683e.clone();
    }
}
