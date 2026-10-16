package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class ohk extends moc implements moa {
    public final int a;
    public final ComponentName b;
    private final CharSequence c;

    public ohk(ohj ohjVar) {
        super(ohjVar);
        this.a = ohjVar.a;
        this.c = ohjVar.b;
        this.b = ohjVar.c;
    }

    public final int a() {
        return (int) this.k;
    }

    @Override // defpackage.moc
    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("base", super.toString());
        xxgVarAo.f("callState", this.a);
        xxgVarAo.b("callContactType", this.c);
        return xxgVarAo.toString();
    }
}
