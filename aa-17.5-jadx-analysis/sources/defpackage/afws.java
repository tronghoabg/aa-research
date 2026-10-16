package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class afws extends afww implements afwe {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afws(Field field, boolean z) {
        super(field, z, false, null);
        field.getClass();
    }

    @Override // defpackage.afww, defpackage.afwf
    public Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        objArr.getClass();
        checkArguments(objArr);
        ((Field) mo61getMember()).set(null, woy.cX(objArr));
        return afak.a;
    }
}
