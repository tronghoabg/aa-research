package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afxx extends defpackage.afyd implements defpackage.afxe {
    private final java.lang.Object boundReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxx(java.lang.reflect.Method method, java.lang.Object obj) {
        super(method, false, null, 4, null);
        method.getClass();
        this.boundReceiver = obj;
    }

    @Override // defpackage.afxf
    public java.lang.Object call(java.lang.Object[] objArr) {
        objArr.getClass();
        checkArguments(objArr);
        return callMethod(this.boundReceiver, objArr);
    }
}
