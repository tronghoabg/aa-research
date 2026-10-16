package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3799a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f3800b;

    /* JADX INFO: Fake field, exist only in values array */
    d EF4;

    static {
        d dVar = new d("StartInput", 0);
        d dVar2 = new d("StopInput", 1);
        d dVar3 = new d("ShowKeyboard", 2);
        f3799a = dVar3;
        f3800b = new d[]{dVar, dVar2, dVar3, new d("HideKeyboard", 3)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3800b.clone();
    }
}
