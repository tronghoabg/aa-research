package defpackage;

import android.view.KeyEvent;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final /* synthetic */ class oek implements oel {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oek(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.oel
    public final void a(ebf ebfVar) {
        int i = this.b;
        if (i == 0) {
            ebfVar.p((CarCall) this.a);
            return;
        }
        if (i == 1) {
            ebfVar.o((CarCall) this.a);
            return;
        }
        Object obj = this.a;
        if (i != 2) {
            ebfVar.n((CarCall) obj);
        } else {
            ebfVar.l((KeyEvent) obj);
        }
    }
}
