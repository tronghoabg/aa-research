package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class elu {
    public static final defpackage.elu a;
    public static final defpackage.elu b;
    public static final defpackage.elu c;
    public static final defpackage.elu d;
    public static final defpackage.elu e;
    public static final defpackage.elu f;
    public static final defpackage.elu g;
    public static final defpackage.elu h;
    public static final defpackage.elu i;
    private static final /* synthetic */ defpackage.elu[] j;

    static {
        defpackage.elu eluVar = new defpackage.elu("INT", 0);
        a = eluVar;
        defpackage.elu eluVar2 = new defpackage.elu("LONG", 1);
        b = eluVar2;
        defpackage.elu eluVar3 = new defpackage.elu("FLOAT", 2);
        c = eluVar3;
        defpackage.elu eluVar4 = new defpackage.elu("DOUBLE", 3);
        d = eluVar4;
        defpackage.elu eluVar5 = new defpackage.elu("BOOLEAN", 4);
        e = eluVar5;
        defpackage.elu eluVar6 = new defpackage.elu("STRING", 5);
        f = eluVar6;
        defpackage.eix eixVar = defpackage.eix.b;
        defpackage.elu eluVar7 = new defpackage.elu("BYTE_STRING", 6);
        g = eluVar7;
        defpackage.elu eluVar8 = new defpackage.elu("ENUM", 7);
        h = eluVar8;
        defpackage.elu eluVar9 = new defpackage.elu("MESSAGE", 8);
        i = eluVar9;
        j = new defpackage.elu[]{eluVar, eluVar2, eluVar3, eluVar4, eluVar5, eluVar6, eluVar7, eluVar8, eluVar9};
    }

    public static defpackage.elu valueOf(java.lang.String str) {
        return (defpackage.elu) java.lang.Enum.valueOf(defpackage.elu.class, str);
    }

    public static defpackage.elu[] values() {
        return (defpackage.elu[]) j.clone();
    }
}
