package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
final class adst {
    private ArrayList a = new ArrayList();
    private volatile adjh b = adjh.d;

    final void a(adjh adjhVar) {
        if (this.b == adjhVar || this.b == adjh.e) {
            return;
        }
        this.b = adjhVar;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
