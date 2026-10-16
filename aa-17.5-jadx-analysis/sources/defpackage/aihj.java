package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aihj {
    private aihj() {
    }

    public final aihk create(aihk aihkVar, aged agedVar, List<? extends aiin> list) {
        agedVar.getClass();
        list.getClass();
        List<agee> parameters = agedVar.getTypeConstructor().getParameters();
        parameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(parameters, 10));
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((agee) it.next()).getOriginal());
        }
        return new aihk(aihkVar, agedVar, list, woy.bc(woy.ci(arrayList, list)), null);
    }

    public /* synthetic */ aihj(afeu afeuVar) {
        this();
    }
}
