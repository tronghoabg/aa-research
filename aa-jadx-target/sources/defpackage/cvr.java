package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvr {
    public static final defpackage.cvs a;
    public static final defpackage.cvs b;
    public static final defpackage.cvs c;
    public static final defpackage.cvs d;
    public static final defpackage.cvs e;
    public static final defpackage.cvs f;
    public static final defpackage.cvs g;
    public static final defpackage.cvs h;
    public static final defpackage.cvs i;

    static {
        defpackage.cvt cvtVar = new defpackage.cvt("caption bar");
        a = cvtVar;
        defpackage.cvt cvtVar2 = new defpackage.cvt("display cutout");
        b = cvtVar2;
        defpackage.cvt cvtVar3 = new defpackage.cvt("ime");
        c = cvtVar3;
        defpackage.cvt cvtVar4 = new defpackage.cvt("mandatory system gestures");
        d = cvtVar4;
        defpackage.cvt cvtVar5 = new defpackage.cvt("navigation bars");
        e = cvtVar5;
        defpackage.cvt cvtVar6 = new defpackage.cvt("status bars");
        f = cvtVar6;
        new defpackage.csw("system bars", new defpackage.cvs[]{cvtVar6, cvtVar5, cvtVar});
        defpackage.cvt cvtVar7 = new defpackage.cvt("system gestures");
        g = cvtVar7;
        defpackage.cvt cvtVar8 = new defpackage.cvt("tappable element");
        h = cvtVar8;
        defpackage.cvt cvtVar9 = new defpackage.cvt("waterfall");
        i = cvtVar9;
        new defpackage.csw("safe drawing", new defpackage.cvs[]{cvtVar6, cvtVar5, cvtVar, cvtVar2, cvtVar3, cvtVar8});
        new defpackage.csw("safe gestures", new defpackage.cvs[]{cvtVar4, cvtVar7, cvtVar8, cvtVar9});
        new defpackage.csw("safe content", new defpackage.cvs[]{cvtVar6, cvtVar5, cvtVar, cvtVar3, cvtVar7, cvtVar4, cvtVar8, cvtVar2, cvtVar9});
    }
}
