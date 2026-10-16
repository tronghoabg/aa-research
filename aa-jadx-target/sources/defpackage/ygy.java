package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ygy extends defpackage.yhs implements defpackage.yjm {
    private static final long serialVersionUID = 0;
    private transient defpackage.ygy a;

    public ygy(defpackage.yhe yheVar, int i) {
        super(yheVar, i);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException(defpackage.a.bo(i, "Invalid key count "));
        }
        defpackage.yha yhaVar = new defpackage.yha(4);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new java.io.InvalidObjectException(defpackage.a.bo(i4, "Invalid value count "));
            }
            int i5 = defpackage.ygw.d;
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            for (int i6 = 0; i6 < i4; i6++) {
                java.lang.Object object2 = objectInputStream.readObject();
                object2.getClass();
                ygrVar.i(object2);
            }
            yhaVar.f(object, ygrVar.g());
            i2 += i4;
        }
        try {
            this.a = new defpackage.ygy(yhaVar.d(true), i2);
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private java.lang.Object readResolve() {
        defpackage.ygy ygyVar = this.a;
        ygyVar.getClass();
        return ygyVar;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        defpackage.ytn.g(this, objectOutputStream);
    }

    @Override // defpackage.yjm
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.ygw c(java.lang.Object obj) {
        defpackage.ygw ygwVar = (defpackage.ygw) this.map.get(obj);
        if (ygwVar != null) {
            return ygwVar;
        }
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }

    @Override // defpackage.yjm
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.util.List g(java.lang.Object obj) {
        throw null;
    }
}
