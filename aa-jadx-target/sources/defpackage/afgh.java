package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class afgh extends defpackage.afgg {
    public afgh(defpackage.afig afigVar, java.lang.String str, java.lang.String str2) {
        super(NO_RECEIVER, ((defpackage.affr) afigVar).getJClass(), str, str2, !(afigVar instanceof defpackage.afie) ? 1 : 0);
    }

    @Override // defpackage.afix
    public java.lang.Object get(java.lang.Object obj) {
        return getGetter().call(new java.lang.Object[]{obj});
    }

    @Override // defpackage.afim
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        getSetter().call(new java.lang.Object[]{obj, obj2});
    }

    public afgh(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public afgh(java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }
}
