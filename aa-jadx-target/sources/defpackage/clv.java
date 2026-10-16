package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class clv {
    public static final defpackage.zo a;

    static {
        float[] fArr = defpackage.clr.a;
        defpackage.cmd cmdVar = defpackage.clr.e;
        int i = cmdVar.c;
        defpackage.cls clsVar = new defpackage.cls(cmdVar);
        defpackage.cmd cmdVar2 = defpackage.clr.e;
        int i2 = cmdVar2.c;
        defpackage.clp clpVar = defpackage.clr.x;
        int i3 = i2 | (clpVar.c << 6);
        defpackage.clu cluVar = new defpackage.clu(cmdVar2, clpVar);
        defpackage.clp clpVar2 = defpackage.clr.x;
        int i4 = clpVar2.c;
        defpackage.cmd cmdVar3 = defpackage.clr.e;
        int i5 = i4 | (cmdVar3.c << 6);
        defpackage.clu cluVar2 = new defpackage.clu(clpVar2, cmdVar3);
        defpackage.zo zoVar = defpackage.zp.a;
        defpackage.zo zoVar2 = new defpackage.zo(6);
        zoVar2.g(i | (i << 6), clsVar);
        zoVar2.g(i3, cluVar);
        zoVar2.g(i5, cluVar2);
        a = zoVar2;
    }
}
