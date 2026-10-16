package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class afwl extends afwq implements afwe {
    private final Object boundReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwl(Field field, Object obj) {
        super(field, false, null);
        field.getClass();
        this.boundReceiver = obj;
    }

    @Override // defpackage.afwq, defpackage.afwf
    public Object call(Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return ((Field) mo61getMember()).get(this.boundReceiver);
    }
}
