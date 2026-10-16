package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yia<K, V> extends defpackage.yhs<K, V> implements defpackage.ynk<K, V> {
    private static final long serialVersionUID = 0;
    private transient defpackage.yia a;
    private transient defpackage.yhx b;
    private final transient defpackage.yhx<V> emptySet;

    public yia(defpackage.yhe yheVar, int i, java.util.Comparator comparator) {
        super(yheVar, i);
        this.emptySet = comparator == null ? defpackage.ynd.a : defpackage.yii.F(comparator);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        java.util.Comparator comparator = (java.util.Comparator) objectInputStream.readObject();
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
            defpackage.ygl yhvVar = comparator == null ? new defpackage.yhv() : new defpackage.yig(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                java.lang.Object object2 = objectInputStream.readObject();
                object2.getClass();
                yhvVar.c(object2);
            }
            defpackage.yhx yhxVarG = yhvVar.g();
            if (yhxVarG.size() != i4) {
                throw new java.io.InvalidObjectException("Duplicate key-value pairs exist for key ".concat(object.toString()));
            }
            yhaVar.f(object, yhxVarG);
            i2 += i4;
        }
        try {
            this.a = new defpackage.yia(yhaVar.d(true), i2, comparator);
        } catch (java.lang.IllegalArgumentException e) {
            throw ((java.io.InvalidObjectException) new java.io.InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private java.lang.Object readResolve() {
        defpackage.yia yiaVar = this.a;
        yiaVar.getClass();
        return yiaVar;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        defpackage.yhx<V> yhxVar = this.emptySet;
        objectOutputStream.writeObject(yhxVar instanceof defpackage.yii ? ((defpackage.yii) yhxVar).a : null);
        defpackage.ytn.g(this, objectOutputStream);
    }

    @Override // defpackage.ynk
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.util.Set E(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.yhs, defpackage.yda, defpackage.ylx
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.yhx u() {
        defpackage.yhx yhxVar = this.b;
        if (yhxVar != null) {
            return yhxVar;
        }
        yhz yhzVar = new yhz(this);
        this.b = yhzVar;
        return yhzVar;
    }

    @Override // defpackage.ynk
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ java.util.Set u() {
        throw null;
    }

    @Override // defpackage.ynk
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ java.util.Set c(java.lang.Object obj) {
        throw null;
    }

    @Override // defpackage.yhs, defpackage.ylx
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final defpackage.yhx c(java.lang.Object obj) {
        return (defpackage.yhx) defpackage.ysr.bz((defpackage.yhx) this.map.get(obj), this.emptySet);
    }
}
