package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afxl extends defpackage.afxq implements defpackage.afxe {
    private final java.lang.Object boundReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxl(java.lang.reflect.Field field, java.lang.Object obj) {
        super(field, false, null);
        field.getClass();
        this.boundReceiver = obj;
    }

    @Override // defpackage.afxq, defpackage.afxf
    public java.lang.Object call(java.lang.Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return ((java.lang.reflect.Field) mo60getMember()).get(this.boundReceiver);
    }
}
