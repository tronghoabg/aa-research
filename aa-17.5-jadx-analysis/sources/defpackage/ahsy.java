package defpackage;

/* loaded from: classes3.dex */
public abstract class ahsy extends ahsz {
    protected abstract void conflict(agax agaxVar, agax agaxVar2);

    @Override // defpackage.ahsz
    public void inheritanceConflict(agax agaxVar, agax agaxVar2) {
        agaxVar.getClass();
        agaxVar2.getClass();
        conflict(agaxVar, agaxVar2);
    }

    @Override // defpackage.ahsz
    public void overrideConflict(agax agaxVar, agax agaxVar2) {
        agaxVar.getClass();
        agaxVar2.getClass();
        conflict(agaxVar, agaxVar2);
    }
}
