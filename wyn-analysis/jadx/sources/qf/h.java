package qf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f44276a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f44277b;

    static {
        h hVar = new h("TOP_DOWN", 0);
        f44276a = hVar;
        h[] hVarArr = {hVar, new h("BOTTOM_UP", 1)};
        f44277b = hVarArr;
        ic.d.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f44277b.clone();
    }
}
