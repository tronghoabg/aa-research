package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class afxb implements java.lang.reflect.InvocationHandler {
    private final java.lang.Class arg$0;
    private final java.util.Map arg$1;
    private final defpackage.afar arg$2;
    private final defpackage.afar arg$3;
    private final java.util.List arg$4;

    public afxb(java.lang.Class cls, java.util.Map map, defpackage.afar afarVar, defpackage.afar afarVar2, java.util.List list) {
        this.arg$0 = cls;
        this.arg$1 = map;
        this.arg$2 = afarVar;
        this.arg$3 = afarVar2;
        this.arg$4 = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return defpackage.afxd.createAnnotationInstance$lambda$6(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4, obj, method, objArr);
    }
}
