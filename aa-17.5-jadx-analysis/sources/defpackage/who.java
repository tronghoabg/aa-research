package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class who {
    public static final who a;
    public static final who b;
    private static final /* synthetic */ who[] c;

    static {
        who whoVar = new who("EMBEDDED", 0);
        a = whoVar;
        who whoVar2 = new who("POPUP", 1);
        b = whoVar2;
        c = new who[]{whoVar, whoVar2};
    }

    public static who valueOf(String str) {
        return (who) Enum.valueOf(who.class, str);
    }

    public static who[] values() {
        return (who[]) c.clone();
    }
}
