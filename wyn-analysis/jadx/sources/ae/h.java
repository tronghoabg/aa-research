package ae;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f17652a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f17653b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f17654c;

    static {
        h hVar = new h("Push", 0);
        f17652a = hVar;
        h hVar2 = new h("FullScreen", 1);
        h hVar3 = new h("NoAnimation", 2);
        f17653b = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f17654c = hVarArr;
        ic.d.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f17654c.clone();
    }
}
