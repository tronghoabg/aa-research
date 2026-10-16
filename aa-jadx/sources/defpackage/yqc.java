package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yqc {
    public static final defpackage.yqc c = new defpackage.ypy();
    public static final defpackage.yqc d = new defpackage.ypy();

    protected yqc() {
    }

    static defpackage.yqc b(defpackage.yqc yqcVar, defpackage.yqc yqcVar2) {
        defpackage.yqc yqcVar3;
        defpackage.yqc yqcVar4;
        if (yqcVar != null) {
            if (yqcVar2 == null || yqcVar == (yqcVar3 = c) || yqcVar2 == (yqcVar4 = d)) {
                return yqcVar;
            }
            if (yqcVar2 != yqcVar3 && yqcVar != yqcVar4) {
                return new defpackage.ypz(yqcVar, yqcVar2);
            }
        }
        return yqcVar2;
    }

    protected abstract void a();
}
