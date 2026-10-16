package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class ahaf implements afdr {
    private final ahaj arg$0;
    private final List arg$1;
    private final int arg$2;

    public ahaf(ahaj ahajVar, List list, int i) {
        this.arg$0 = ahajVar;
        this.arg$1 = list;
        this.arg$2 = i;
    }

    @Override // defpackage.afdr
    public Object invoke() {
        return ahaj.computeIndexedQualifiers$lambda$2(this.arg$0, this.arg$1, this.arg$2);
    }
}
