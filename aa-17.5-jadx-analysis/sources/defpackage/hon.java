package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hon {
    public static final hon a;
    public static final hon b;
    public static final hon c;
    public static final hon d;
    public static final hon e;
    public static final hon f;
    public static final hon g;
    public static final /* synthetic */ afdf h;
    private static final /* synthetic */ hon[] i;

    static {
        hon honVar = new hon("UNSPECIFIED", 0);
        a = honVar;
        hon honVar2 = new hon("FOOD_AND_DRINK", 1);
        b = honVar2;
        hon honVar3 = new hon("SERVICE_PROVIDER", 2);
        c = honVar3;
        hon honVar4 = new hon("SHOPPING", 3);
        d = honVar4;
        hon honVar5 = new hon("HEALTH", 4);
        e = honVar5;
        hon honVar6 = new hon("LODGING", 5);
        f = honVar6;
        hon honVar7 = new hon("TRANSPORT", 6);
        g = honVar7;
        hon[] honVarArr = {honVar, honVar2, honVar3, honVar4, honVar5, honVar6, honVar7};
        i = honVarArr;
        h = affa.p(honVarArr);
    }

    public static hon valueOf(String str) {
        return (hon) Enum.valueOf(hon.class, str);
    }

    public static hon[] values() {
        return (hon[]) i.clone();
    }
}
