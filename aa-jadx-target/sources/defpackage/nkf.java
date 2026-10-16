package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nkf {
    public static final defpackage.nkf a;
    public static final defpackage.nkf b;
    public static final defpackage.nkf c;
    public static final defpackage.nkf d;
    public static final defpackage.nkf e;
    public static final defpackage.nkf f;
    public static final defpackage.nkf g;
    public static final defpackage.nkf h;
    public static final defpackage.nkf i;
    private static final /* synthetic */ defpackage.nkf[] j;

    static {
        defpackage.nkf nkfVar = new defpackage.nkf("PHONE", 0);
        a = nkfVar;
        defpackage.nkf nkfVar2 = new defpackage.nkf("IN_CALL_INFO", 1);
        b = nkfVar2;
        defpackage.nkf nkfVar3 = new defpackage.nkf("IN_CALL_APP", 2);
        c = nkfVar3;
        defpackage.nkf nkfVar4 = new defpackage.nkf("MEDIA", 3);
        d = nkfVar4;
        defpackage.nkf nkfVar5 = new defpackage.nkf("NAV_START", 4);
        e = nkfVar5;
        defpackage.nkf nkfVar6 = new defpackage.nkf("NAV_FULLSCREEN", 5);
        f = nkfVar6;
        defpackage.nkf nkfVar7 = new defpackage.nkf("RECENT", 6);
        g = nkfVar7;
        defpackage.nkf nkfVar8 = new defpackage.nkf("DASHBOARD", 7);
        h = nkfVar8;
        defpackage.nkf nkfVar9 = new defpackage.nkf("OTHER", 8);
        i = nkfVar9;
        defpackage.nkf[] nkfVarArr = {nkfVar, nkfVar2, nkfVar3, nkfVar4, nkfVar5, nkfVar6, nkfVar7, nkfVar8, nkfVar9};
        j = nkfVarArr;
        defpackage.afga.p(nkfVarArr);
    }

    public static defpackage.nkf valueOf(java.lang.String str) {
        return (defpackage.nkf) java.lang.Enum.valueOf(defpackage.nkf.class, str);
    }

    public static defpackage.nkf[] values() {
        return (defpackage.nkf[]) j.clone();
    }
}
