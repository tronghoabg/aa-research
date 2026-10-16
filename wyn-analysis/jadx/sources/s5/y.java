package s5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f45051a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y[] f45052b;

    /* JADX INFO: Fake field, exist only in values array */
    y EF2;

    static {
        y yVar = new y("UNKNOWN", 0);
        y yVar2 = new y("ANDROID_FIREBASE", 1);
        f45051a = yVar2;
        f45052b = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f45052b.clone();
    }
}
