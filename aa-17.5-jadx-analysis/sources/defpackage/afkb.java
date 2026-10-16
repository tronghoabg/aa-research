package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public class afkb extends afkc {
    private final afrj container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkb(afrj afrjVar) {
        super(afrjVar);
        afrjVar.getClass();
        this.container = afrjVar;
    }

    @Override // defpackage.agha, defpackage.agbk
    public afko<?> visitPropertyDescriptor(agdn agdnVar, afak afakVar) {
        int i;
        agdnVar.getClass();
        afakVar.getClass();
        List<agdq> contextReceiverParameters = agdnVar.getContextReceiverParameters();
        contextReceiverParameters.getClass();
        if (contextReceiverParameters.isEmpty()) {
            i = (agdnVar.getDispatchReceiverParameter() != null ? 1 : 0) + (agdnVar.getExtensionReceiverParameter() != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (agdnVar.isVar()) {
            if (i == -1) {
                return new aflg(this.container, agdnVar, afpq.EMPTY);
            }
            if (i == 0) {
                return new afkx(this.container, agdnVar, afpq.EMPTY);
            }
            afrj afrjVar = this.container;
            return i != 1 ? new afld(afrjVar, agdnVar, afpq.EMPTY) : new afla(afrjVar, agdnVar, afpq.EMPTY);
        }
        if (i == -1) {
            return new afmm(this.container, agdnVar, afpq.EMPTY);
        }
        if (i == 0) {
            return new aflz(this.container, agdnVar, afpq.EMPTY);
        }
        afrj afrjVar2 = this.container;
        return i != 1 ? new afmh(afrjVar2, agdnVar, afpq.EMPTY) : new afmd(afrjVar2, agdnVar, afpq.EMPTY);
    }
}
