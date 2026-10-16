package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final /* synthetic */ class lsf implements mnl {
    public final /* synthetic */ lhf a;
    private final /* synthetic */ int b;

    public /* synthetic */ lsf(lhf lhfVar, int i) {
        this.b = i;
        this.a = lhfVar;
    }

    @Override // defpackage.mnl
    public final void a(PrintWriter printWriter) {
        int i = this.b;
        lhf lhfVar = this.a;
        if (i != 0) {
            ((lqu) lhfVar).e(printWriter);
        } else {
            ((lsj) lhfVar).a(printWriter);
        }
    }
}
