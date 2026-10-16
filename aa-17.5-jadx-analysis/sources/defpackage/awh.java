package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
final class awh extends auw implements cwu {
    public afec a;
    public awp d;

    public awh(afec afecVar) {
        super(awq.a);
        this.a = afecVar;
    }

    @Override // defpackage.aus, defpackage.cfx
    public final void er() {
        View viewC = tt.c(this);
        WeakHashMap weakHashMap = awp.a;
        awp awpVarY = asl.y(viewC);
        awpVarY.b(viewC);
        f((awo) this.a.invoke(awpVarY));
        this.d = awpVarY;
        super.er();
    }

    @Override // defpackage.aus, defpackage.cfx
    public final void q() {
        View viewC = tt.c(this);
        awp awpVar = this.d;
        if (awpVar != null) {
            awpVar.a(viewC);
        }
        super.q();
    }
}
