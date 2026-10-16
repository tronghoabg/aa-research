package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yik extends defpackage.ydf implements java.io.Serializable {
    private static final long serialVersionUID = 912559;

    public static defpackage.yon o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
        return new defpackage.yoq(obj, obj2, obj3);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public abstract defpackage.yhe g();

    /* JADX INFO: renamed from: h */
    public abstract defpackage.yhe k();

    @Override // defpackage.yoo
    public /* bridge */ /* synthetic */ java.util.Map k() {
        throw null;
    }

    public final defpackage.yhx l() {
        return (defpackage.yhx) super.c();
    }

    public final defpackage.yhx m() {
        return g().keySet();
    }

    public final defpackage.yhx n() {
        return k().keySet();
    }

    abstract java.lang.Object writeReplace();
}
