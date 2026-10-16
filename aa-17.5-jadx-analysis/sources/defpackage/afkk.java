package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class afkk implements afdr {
    private final List arg$0;
    private final int arg$1;

    public afkk(List list, int i) {
        this.arg$0 = list;
        this.arg$1 = i;
    }

    @Override // defpackage.afdr
    public Object invoke() {
        return afko.computeParameters$lambda$1(this.arg$0, this.arg$1);
    }
}
