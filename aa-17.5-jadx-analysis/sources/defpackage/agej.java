package defpackage;

import defpackage.ailx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class agej<Type extends ailx> {
    private agej() {
    }

    public final <Other extends aily> agej<Other> mapUnderlyingType(afec<? super Type, ? extends Other> afecVar) {
        afecVar.getClass();
        if (this instanceof agck) {
            agck agckVar = (agck) this;
            return new agck(agckVar.getUnderlyingPropertyName(), afecVar.invoke(agckVar.getUnderlyingType()));
        }
        if (!(this instanceof agcv)) {
            throw new aezs();
        }
        List<aezu<ahnj, Type>> underlyingPropertyNamesToTypes = ((agcv) this).getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList(woy.bp(underlyingPropertyNamesToTypes, 10));
        Iterator<T> it = underlyingPropertyNamesToTypes.iterator();
        while (it.hasNext()) {
            aezu aezuVar = (aezu) it.next();
            arrayList.add(new aezu((ahnj) aezuVar.a, afecVar.invoke((ailx) aezuVar.b)));
        }
        return new agcv(arrayList);
    }

    public /* synthetic */ agej(afeu afeuVar) {
        this();
    }
}
