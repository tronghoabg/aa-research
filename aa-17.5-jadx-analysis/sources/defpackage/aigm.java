package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class aigm implements afec {
    private final aiid arg$0;
    private final List arg$1;
    private final aihr arg$2;
    private final boolean arg$3;

    public aigm(aiid aiidVar, List list, aihr aihrVar, boolean z) {
        this.arg$0 = aiidVar;
        this.arg$1 = list;
        this.arg$2 = aihrVar;
        this.arg$3 = z;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return aigq.simpleType$lambda$0(this.arg$0, this.arg$1, this.arg$2, this.arg$3, (aiju) obj);
    }
}
