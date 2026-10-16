package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class afrv extends affc implements aimd, aime {
    private final agee _descriptor;
    private final boolean isReified;
    private final String name;
    public volatile List<? extends afib> upperBounds;
    private final afie variance;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public afrv(afrx afrxVar, agee ageeVar) {
        afrxVar.getClass();
        ageeVar.getClass();
        String strAsString = ageeVar.getName().asString();
        strAsString.getClass();
        aijg variance = ageeVar.getVariance();
        variance.getClass();
        this(ageeVar, afrxVar, strAsString, afrw.toKVariance(variance), ageeVar.isReified());
        List<aigl> upperBounds = ageeVar.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(upperBounds, 10));
        Iterator<T> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new aiqp((aigl) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        setUpperBounds(arrayList);
    }

    public final agee getDescriptor() {
        agee ageeVar = this._descriptor;
        if (ageeVar != null) {
            return ageeVar;
        }
        toString();
        throw new IllegalStateException("Descriptor-less type parameter: ".concat(toString()));
    }

    @Override // defpackage.afic
    public String getName() {
        return this.name;
    }

    @Override // defpackage.afic
    public List<afib> getUpperBounds() {
        List list = this.upperBounds;
        if (list != null) {
            return list;
        }
        affa.d("upperBounds");
        return null;
    }

    @Override // defpackage.afic
    public afie getVariance() {
        return this.variance;
    }

    public boolean isReified() {
        return this.isReified;
    }

    public void setUpperBounds(List<? extends afib> list) {
        list.getClass();
        this.upperBounds = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public afrv(afrx afrxVar, String str, afie afieVar, boolean z) {
        this(null, afrxVar, str, afieVar, z);
        afrxVar.getClass();
        str.getClass();
        afieVar.getClass();
    }

    private afrv(agee ageeVar, afrx afrxVar, String str, afie afieVar, boolean z) {
        super(afrxVar);
        this.name = str;
        this.variance = afieVar;
        this.isReified = z;
        this._descriptor = ageeVar;
    }
}
