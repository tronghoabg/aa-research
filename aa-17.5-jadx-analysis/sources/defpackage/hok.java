package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hok {
    public static final hok a;
    public static final /* synthetic */ afdf b;
    private static final /* synthetic */ hok[] c;

    static {
        hok hokVar = new hok();
        a = hokVar;
        hok[] hokVarArr = {hokVar};
        c = hokVarArr;
        b = affa.p(hokVarArr);
    }

    private hok() {
    }

    public static hok valueOf(String str) {
        return (hok) Enum.valueOf(hok.class, str);
    }

    public static hok[] values() {
        return (hok[]) c.clone();
    }
}
