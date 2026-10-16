package defpackage;

/* loaded from: classes.dex */
public abstract class yox {
    public static final yox c = new yot();
    public static final yox d = new yot();

    protected yox() {
    }

    static yox b(yox yoxVar, yox yoxVar2) {
        yox yoxVar3;
        yox yoxVar4;
        if (yoxVar != null) {
            if (yoxVar2 == null || yoxVar == (yoxVar3 = c) || yoxVar2 == (yoxVar4 = d)) {
                return yoxVar;
            }
            if (yoxVar2 != yoxVar3 && yoxVar != yoxVar4) {
                return new you(yoxVar, yoxVar2);
            }
        }
        return yoxVar2;
    }

    protected abstract void a();
}
