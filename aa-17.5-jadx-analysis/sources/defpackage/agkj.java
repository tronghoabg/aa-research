package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agkj extends agkf implements agzg {
    private final Object[] values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agkj(ahnj ahnjVar, Object[] objArr) {
        super(ahnjVar, null);
        objArr.getClass();
        this.values = objArr;
    }

    public List<agkf> getElements() {
        Object[] objArr = this.values;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            agke agkeVar = agkf.Factory;
            obj.getClass();
            arrayList.add(agkeVar.create(obj, null));
        }
        return arrayList;
    }
}
