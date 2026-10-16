package gg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f35915a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f35916b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f35917c;

    /* JADX INFO: Fake field, exist only in values array */
    d EF3;

    static {
        d dVar = new d("CR", 0);
        d dVar2 = new d("CRLF", 1);
        f35915a = dVar2;
        d dVar3 = new d("LF", 2);
        f35916b = dVar3;
        f35917c = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f35917c.clone();
    }
}
