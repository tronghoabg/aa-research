package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class rdm extends rdj {
    public final rdl l;
    public final zgp m;

    public rdm(rdl rdlVar, Looper looper) {
        super(looper);
        this.l = rdlVar;
        this.f = (rox) new ntn((Object) null).h(new koy(this, 20));
        this.m = zgj.v(rdlVar.b()).w(new kpf(this, 2), new tde(new sss(Looper.getMainLooper()), 1));
    }

    @Override // defpackage.rdj
    public final qup C() {
        rdl rdlVar = this.l;
        woy.aa(rdlVar != null, "Client is not connected yet.");
        qup qupVarA = rdlVar.a();
        qupVarA.getClass();
        return qupVarA;
    }

    public final String toString() {
        String str;
        rdl rdlVar = this.l;
        if (rdlVar != null) {
            str = String.valueOf(rdlVar.getClass()) + "@" + rdlVar.hashCode();
        } else {
            str = "null";
        }
        return String.valueOf(getClass()) + "@" + hashCode() + "/" + str;
    }
}
