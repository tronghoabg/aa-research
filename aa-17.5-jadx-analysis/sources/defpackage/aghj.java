package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class aghj implements afdr {
    final /* synthetic */ aghm this$0;
    final /* synthetic */ aiiy val$substitutor;

    public aghj(aghm aghmVar, aiiy aiiyVar) {
        this.this$0 = aghmVar;
        this.val$substitutor = aiiyVar;
    }

    @Override // defpackage.afdr
    public Collection<agcj> invoke() {
        aipr aiprVar = new aipr();
        Iterator<? extends agcj> it = this.this$0.getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            aiprVar.add(it.next().substitute(this.val$substitutor));
        }
        return aiprVar;
    }
}
