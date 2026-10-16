package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class api {
    public static final api a;
    public static final api b;
    private static final /* synthetic */ api[] c;

    static {
        api apiVar = new api("Vertical", 0);
        a = apiVar;
        api apiVar2 = new api("Horizontal", 1);
        b = apiVar2;
        api[] apiVarArr = {apiVar, apiVar2};
        c = apiVarArr;
        affa.p(apiVarArr);
    }

    public static api valueOf(String str) {
        return (api) Enum.valueOf(api.class, str);
    }

    public static api[] values() {
        return (api[]) c.clone();
    }
}
