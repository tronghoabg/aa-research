package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ubp implements upw {
    private final ues a;
    private final ubq b;
    private final int c;
    private final List d;
    private final List e;

    public ubp(ues uesVar, ubq ubqVar, int i, List list, List list2) {
        this.a = uesVar;
        this.b = ubqVar;
        this.c = i;
        this.d = list;
        this.e = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.upw
    public final void a(upy upyVar) {
        ubq ubqVar = this.b;
        if (ubqVar.K()) {
            return;
        }
        boolean Z = qrv.Z(ubqVar.I(), this.d, this.e);
        ues uesVar = this.a;
        uwk uwkVar = null;
        if (Z) {
            abjb abjbVar = (abjb) ubqVar.I().f.get(this.c);
            uwkVar = uesVar.h(abjbVar.c == 4 ? (abjd) abjbVar.d : abjd.a, ubqVar.G(), null);
        } else {
            abjb abjbVar2 = (abjb) ubqVar.I().f.get(this.c);
            uwi uwiVarD = uesVar.d(abjbVar2.c == 4 ? (abjd) abjbVar2.d : abjd.a, ubqVar.G(), upyVar, null);
            if (uwiVarD != null) {
                uwkVar = new uwk(uwiVarD);
            }
        }
        ubqVar.J(this.c, uwkVar);
    }
}
