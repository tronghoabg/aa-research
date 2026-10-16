package defpackage;

/* loaded from: classes2.dex */
public abstract class ajrp extends ajrm implements ajpc {
    public ajpb c;

    @Override // defpackage.ajpc
    public final ajpb a() {
        return this.c;
    }

    @Override // defpackage.ajpc
    public final boolean b() {
        ajoy ajoyVarHW = hW("Expect");
        return ajoyVarHW != null && "100-continue".equalsIgnoreCase(ajoyVarHW.c());
    }

    @Override // defpackage.ajrm
    public final Object clone() throws CloneNotSupportedException {
        ajrp ajrpVar = (ajrp) super.clone();
        ajpb ajpbVar = this.c;
        if (ajpbVar != null) {
            ajrpVar.c = (ajpb) ahgc.a(ajpbVar);
        }
        return ajrpVar;
    }
}
