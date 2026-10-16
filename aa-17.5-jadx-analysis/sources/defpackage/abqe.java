package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class abqe {
    public static final abqe a;
    public static final abqe b;
    public static final abqe c;
    public static final abqe d;
    public static final abqe e;
    public static final abqe f;
    public static final abqe g;
    public static final abqe h;
    public static final abqe i;
    private static final /* synthetic */ abqe[] j;

    static {
        abqe abqeVar = new abqe("INT", 0);
        a = abqeVar;
        abqe abqeVar2 = new abqe("LONG", 1);
        b = abqeVar2;
        abqe abqeVar3 = new abqe("FLOAT", 2);
        c = abqeVar3;
        abqe abqeVar4 = new abqe("DOUBLE", 3);
        d = abqeVar4;
        abqe abqeVar5 = new abqe("BOOLEAN", 4);
        e = abqeVar5;
        abqe abqeVar6 = new abqe("STRING", 5);
        f = abqeVar6;
        abms abmsVar = abms.d;
        abqe abqeVar7 = new abqe("BYTE_STRING", 6);
        g = abqeVar7;
        abqe abqeVar8 = new abqe("ENUM", 7);
        h = abqeVar8;
        abqe abqeVar9 = new abqe("MESSAGE", 8);
        i = abqeVar9;
        j = new abqe[]{abqeVar, abqeVar2, abqeVar3, abqeVar4, abqeVar5, abqeVar6, abqeVar7, abqeVar8, abqeVar9};
    }

    public static abqe valueOf(String str) {
        return (abqe) Enum.valueOf(abqe.class, str);
    }

    public static abqe[] values() {
        return (abqe[]) j.clone();
    }
}
