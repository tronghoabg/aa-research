package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aggm {
    public static final defpackage.aggk composeAnnotations(defpackage.aggk aggkVar, defpackage.aggk aggkVar2) {
        aggkVar.getClass();
        aggkVar2.getClass();
        if (aggkVar.isEmpty()) {
            return aggkVar2;
        }
        return aggkVar2.isEmpty() ? aggkVar : new defpackage.aggr(aggkVar, aggkVar2);
    }
}
