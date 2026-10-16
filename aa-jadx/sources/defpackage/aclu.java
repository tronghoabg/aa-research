package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aclu implements defpackage.aclt, defpackage.aclm {
    public static final defpackage.aclu a = new defpackage.aclu(null);
    public final java.lang.Object b;

    public aclu(java.lang.Object obj) {
        this.b = obj;
    }

    public static defpackage.aclt b(java.lang.Object obj) {
        obj.getClass();
        return new defpackage.aclu(obj);
    }

    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        return this.b;
    }
}
