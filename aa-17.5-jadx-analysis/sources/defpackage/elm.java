package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class elm {
    public static final elm a;
    public static final elm b;
    public static final elm c;
    public static final elm d;
    public static final elm e;
    public static final elm f;
    public static final elm g;
    public static final elm h;
    public static final elm i;
    private static final /* synthetic */ elm[] j;

    static {
        elm elmVar = new elm("INT", 0);
        a = elmVar;
        elm elmVar2 = new elm("LONG", 1);
        b = elmVar2;
        elm elmVar3 = new elm("FLOAT", 2);
        c = elmVar3;
        elm elmVar4 = new elm("DOUBLE", 3);
        d = elmVar4;
        elm elmVar5 = new elm("BOOLEAN", 4);
        e = elmVar5;
        elm elmVar6 = new elm("STRING", 5);
        f = elmVar6;
        eip eipVar = eip.b;
        elm elmVar7 = new elm("BYTE_STRING", 6);
        g = elmVar7;
        elm elmVar8 = new elm("ENUM", 7);
        h = elmVar8;
        elm elmVar9 = new elm("MESSAGE", 8);
        i = elmVar9;
        j = new elm[]{elmVar, elmVar2, elmVar3, elmVar4, elmVar5, elmVar6, elmVar7, elmVar8, elmVar9};
    }

    public static elm valueOf(String str) {
        return (elm) Enum.valueOf(elm.class, str);
    }

    public static elm[] values() {
        return (elm[]) j.clone();
    }
}
