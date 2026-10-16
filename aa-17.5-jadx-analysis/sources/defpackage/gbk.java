package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gbk {
    public static final gbk a;
    public static final gbk b;
    public static final gbk c;
    private static final /* synthetic */ gbk[] d;

    static {
        gbk gbkVar = new gbk("NO_ACTION", 0);
        a = gbkVar;
        gbk gbkVar2 = new gbk("STATIC_ACTION", 1);
        b = gbkVar2;
        gbk gbkVar3 = new gbk("ANIMATING_ACTION", 2);
        c = gbkVar3;
        gbk[] gbkVarArr = {gbkVar, gbkVar2, gbkVar3};
        d = gbkVarArr;
        affa.p(gbkVarArr);
    }

    public static gbk valueOf(String str) {
        return (gbk) Enum.valueOf(gbk.class, str);
    }

    public static gbk[] values() {
        return (gbk[]) d.clone();
    }
}
