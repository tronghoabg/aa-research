package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class afwr extends afww implements afwe {
    private final Object boundReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwr(Field field, boolean z, Object obj) {
        super(field, z, false, null);
        field.getClass();
        this.boundReceiver = obj;
    }

    @Override // defpackage.afww, defpackage.afwf
    public Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        objArr.getClass();
        checkArguments(objArr);
        ((Field) mo61getMember()).set(this.boundReceiver, woy.cU(objArr));
        return afak.a;
    }
}
