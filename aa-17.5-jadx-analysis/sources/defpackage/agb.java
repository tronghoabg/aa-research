package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class agb {
    final /* synthetic */ agg a;
    private final bwq b = new ParcelableSnapshotMutableState(null, bxp.c);
    private final bii c;

    public agb(agg aggVar, bii biiVar) {
        this.a = aggVar;
        this.c = biiVar;
    }

    public final aga a() {
        return (aga) this.b.a();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [afec, java.lang.Object] */
    public final bym b(afec afecVar, Object obj, aei aeiVar, afec afecVar2) {
        aga agaVarA = a();
        if (agaVarA == null) {
            agg aggVar = this.a;
            Object objInvoke = afecVar2.invoke(aggVar.e());
            bii biiVar = this.c;
            aei aeiVar2 = (aei) biiVar.b.invoke(afecVar2.invoke(aggVar.e()));
            aeiVar2.d();
            aga agaVar = new aga(this, new age(aggVar, objInvoke, aeiVar2, biiVar), afecVar, afecVar2);
            this.b.b(agaVar);
            aggVar.x(agaVar.a);
            agaVarA = agaVar;
        }
        agg aggVar2 = this.a;
        agaVarA.c = afecVar2;
        agaVarA.b = afecVar;
        agaVarA.b(aggVar2.d(), obj, aeiVar);
        return agaVarA;
    }
}
