package defpackage;

import android.view.KeyEvent;

/* loaded from: classes.dex */
final class cpr extends cfx implements cpq {
    public afec a;
    public afec b;

    public cpr(afec afecVar, afec afecVar2) {
        this.a = afecVar;
        this.b = afecVar2;
    }

    @Override // defpackage.cpq
    public final boolean A(KeyEvent keyEvent) {
        afec afecVar = this.a;
        if (afecVar != null) {
            return ((Boolean) afecVar.invoke(new cpo(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.cpq
    public final boolean B(KeyEvent keyEvent) {
        afec afecVar = this.b;
        if (afecVar != null) {
            return ((Boolean) afecVar.invoke(new cpo(keyEvent))).booleanValue();
        }
        return false;
    }
}
