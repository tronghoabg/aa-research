package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class agfs implements agfk {
    private final agfk delegate;
    private final afec<ahnf, Boolean> fqNameFilter;
    private final boolean isDefinitelyNewInference;

    /* JADX WARN: Multi-variable type inference failed */
    public agfs(agfk agfkVar, boolean z, afec<? super ahnf, Boolean> afecVar) {
        agfkVar.getClass();
        afecVar.getClass();
        this.delegate = agfkVar;
        this.isDefinitelyNewInference = z;
        this.fqNameFilter = afecVar;
    }

    private final boolean shouldBeReturned(agfc agfcVar) {
        ahnf fqName = agfcVar.getFqName();
        return fqName != null && this.fqNameFilter.invoke(fqName).booleanValue();
    }

    @Override // defpackage.agfk
    public agfc findAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        if (this.fqNameFilter.invoke(ahnfVar).booleanValue()) {
            return this.delegate.findAnnotation(ahnfVar);
        }
        return null;
    }

    @Override // defpackage.agfk
    public boolean hasAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        if (this.fqNameFilter.invoke(ahnfVar).booleanValue()) {
            return this.delegate.hasAnnotation(ahnfVar);
        }
        return false;
    }

    @Override // defpackage.agfk
    public boolean isEmpty() {
        boolean z;
        agfk agfkVar = this.delegate;
        if ((agfkVar instanceof Collection) && ((Collection) agfkVar).isEmpty()) {
            z = false;
        } else {
            Iterator<agfc> it = agfkVar.iterator();
            while (it.hasNext()) {
                if (shouldBeReturned(it.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return this.isDefinitelyNewInference ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator<agfc> iterator() {
        ArrayList arrayList = new ArrayList();
        for (agfc agfcVar : this.delegate) {
            if (shouldBeReturned(agfcVar)) {
                arrayList.add(agfcVar);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agfs(agfk agfkVar, afec<? super ahnf, Boolean> afecVar) {
        this(agfkVar, false, afecVar);
        agfkVar.getClass();
        afecVar.getClass();
    }
}
