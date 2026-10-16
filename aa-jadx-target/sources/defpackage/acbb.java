package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class acbb {
    public final defpackage.acbc a;
    public final defpackage.acbc b;
    public final defpackage.acbc c;
    public final defpackage.acbc d;
    public final defpackage.acbc e;

    public acbb(int i) {
        defpackage.acay acayVar = new defpackage.acay(i);
        double d = acayVar.a;
        double d2 = acayVar.b;
        defpackage.ysr.bI(d, d2, new java.util.HashMap());
        this.a = new defpackage.acbc(d, d2);
        double d3 = d2 / 3.0d;
        defpackage.ysr.bI(d, d3, new java.util.HashMap());
        this.b = new defpackage.acbc(d, d3);
        double d4 = 60.0d + d;
        double d5 = d2 / 2.0d;
        defpackage.ysr.bI(d4, d5, new java.util.HashMap());
        this.c = new defpackage.acbc(d4, d5);
        double dMin = java.lang.Math.min(d2 / 12.0d, 4.0d);
        defpackage.ysr.bI(d, dMin, new java.util.HashMap());
        this.d = new defpackage.acbc(d, dMin);
        double dMin2 = java.lang.Math.min(d2 / 6.0d, 8.0d);
        defpackage.ysr.bI(d, dMin2, new java.util.HashMap());
        this.e = new defpackage.acbc(d, dMin2);
        defpackage.ysr.bI(25.0d, 84.0d, new java.util.HashMap());
        new defpackage.acbc(25.0d, 84.0d);
    }
}
