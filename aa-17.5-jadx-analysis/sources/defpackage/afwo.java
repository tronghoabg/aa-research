package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class afwo extends afwq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwo(Field field) {
        super(field, true, null);
        field.getClass();
    }

    @Override // defpackage.afxe
    public void checkArguments(Object[] objArr) {
        objArr.getClass();
        super.checkArguments(objArr);
        checkObjectInstance(woy.cV(objArr));
    }
}
