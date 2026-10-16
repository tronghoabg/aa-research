package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class afci implements Serializable {
    private static final long serialVersionUID = 0;
    private final afco[] a;

    public afci(afco[] afcoVarArr) {
        this.a = afcoVarArr;
    }

    private final Object readResolve() {
        afco afcoVarPlus = afcp.a;
        int i = 0;
        while (true) {
            afco[] afcoVarArr = this.a;
            if (i >= afcoVarArr.length) {
                return afcoVarPlus;
            }
            afcoVarPlus = afcoVarPlus.plus(afcoVarArr[i]);
            i++;
        }
    }
}
