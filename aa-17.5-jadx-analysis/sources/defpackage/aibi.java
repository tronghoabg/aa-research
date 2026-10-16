package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aibi extends ahsy {
    final /* synthetic */ List $result;

    public aibi(List list) {
        this.$result = list;
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
        if (agaxVar2 instanceof aghm) {
            ((aghm) agaxVar2).putInUserDataMap(agcd.INSTANCE, agaxVar);
        }
    }
}
