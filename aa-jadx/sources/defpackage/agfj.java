package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class agfj<Type extends defpackage.aimx> {
    private agfj() {
    }

    public final <Other extends defpackage.aimy> defpackage.agfj<Other> mapUnderlyingType(defpackage.affc<? super Type, ? extends Other> affcVar) {
        affcVar.getClass();
        if (this instanceof defpackage.agdk) {
            defpackage.agdk agdkVar = (defpackage.agdk) this;
            return new defpackage.agdk(agdkVar.getUnderlyingPropertyName(), affcVar.invoke(agdkVar.getUnderlyingType()));
        }
        if (!(this instanceof defpackage.agdv)) {
            throw new defpackage.afas();
        }
        java.util.List<defpackage.afau<defpackage.ahoj, Type>> underlyingPropertyNamesToTypes = ((defpackage.agdv) this).getUnderlyingPropertyNamesToTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(underlyingPropertyNamesToTypes, 10));
        java.util.Iterator<T> it = underlyingPropertyNamesToTypes.iterator();
        while (it.hasNext()) {
            defpackage.afau afauVar = (defpackage.afau) it.next();
            arrayList.add(new defpackage.afau((defpackage.ahoj) afauVar.a, affcVar.invoke((defpackage.aimx) afauVar.b)));
        }
        return new defpackage.agdv(arrayList);
    }

    public /* synthetic */ agfj(defpackage.affu affuVar) {
        this();
    }
}
