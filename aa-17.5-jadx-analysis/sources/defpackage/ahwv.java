package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ahwv extends ahsy {
    final /* synthetic */ ArrayList<agbi> $result;
    final /* synthetic */ ahww this$0;

    public ahwv(ArrayList<agbi> arrayList, ahww ahwwVar) {
        this.$result = arrayList;
        this.this$0 = ahwwVar;
    }

    @Override // defpackage.ahsz
    public void addFakeOverride(agax agaxVar) {
        agaxVar.getClass();
        ahtj.resolveUnknownVisibilityForMember(agaxVar, null);
        this.$result.add(agaxVar);
    }

    @Override // defpackage.ahsy
    protected void conflict(agax agaxVar, agax agaxVar2) {
        agaxVar.getClass();
        agaxVar2.getClass();
        throw new IllegalStateException("Conflict in scope of " + this.this$0.getContainingClass() + ": " + agaxVar + " vs " + agaxVar2);
    }
}
