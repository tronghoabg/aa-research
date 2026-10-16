package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class afwu extends afww {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwu(Field field, boolean z) {
        super(field, z, true, null);
        field.getClass();
    }

    @Override // defpackage.afww, defpackage.afxe
    public void checkArguments(Object[] objArr) {
        objArr.getClass();
        super.checkArguments(objArr);
        checkObjectInstance(woy.cV(objArr));
    }
}
