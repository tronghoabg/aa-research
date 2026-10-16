package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ejq<MessageType extends defpackage.ejq<MessageType, BuilderType>, BuilderType extends defpackage.ejn<MessageType, BuilderType>> extends defpackage.eim<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static java.util.Map<java.lang.Class<?>, defpackage.ejq<?, ?>> defaultInstanceMap = new j$.util.concurrent.ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected defpackage.elh unknownFields = defpackage.elh.a;

    private final int b(defpackage.ekx ekxVar) {
        return ekxVar == null ? defpackage.eku.a.b(this).a(this) : ekxVar.a(this);
    }

    protected static void p(java.lang.Class cls, defpackage.ejq ejqVar) {
        ejqVar.o();
        defaultInstanceMap.put(cls, ejqVar);
    }

    public static final boolean t(defpackage.ejq ejqVar) {
        byte bByteValue = ((java.lang.Byte) ejqVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = defpackage.eku.a.b(ejqVar).g(ejqVar);
        ejqVar.a(2);
        return zG;
    }

    protected abstract java.lang.Object a(int i);

    @Override // defpackage.eim
    public final int c(defpackage.ekx ekxVar) {
        if (s()) {
            int iB = b(ekxVar);
            if (iB >= 0) {
                return iB;
            }
            throw new java.lang.IllegalStateException(defpackage.a.bo(iB, "serialized size must be non-negative, was "));
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int iB2 = b(ekxVar);
        q(iB2);
        return iB2;
    }

    final int e() {
        return defpackage.eku.a.b(this).b(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return defpackage.eku.a.b(this).f(this, (defpackage.ejq) obj);
        }
        return false;
    }

    final int g() {
        return this.memoizedSerializedSize & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.ekm
    public final int h() {
        return c(null);
    }

    public final int hashCode() {
        if (s()) {
            return e();
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iE = e();
        this.memoizedHashCode = iE;
        return iE;
    }

    public final defpackage.ejn i() {
        return (defpackage.ejn) a(5);
    }

    @Override // defpackage.ekm
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final defpackage.ejn m() {
        return (defpackage.ejn) a(5);
    }

    @Override // defpackage.ekn
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final defpackage.ejq f() {
        return (defpackage.ejq) a(6);
    }

    public final defpackage.ejq l() {
        return (defpackage.ejq) a(4);
    }

    protected final void n() {
        defpackage.eku.a.b(this).d(this);
        o();
    }

    final void o() {
        this.memoizedSerializedSize &= androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    final void q(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException(defpackage.a.bo(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = i | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    @Override // defpackage.ekm
    public final void r(defpackage.eje ejeVar) throws java.io.IOException {
        defpackage.ekx ekxVarB = defpackage.eku.a.b(this);
        java.lang.Object erhVar = ejeVar.f;
        if (erhVar == null) {
            erhVar = new defpackage.erh(ejeVar);
        }
        ekxVarB.j(this, (defpackage.erh) erhVar);
    }

    final boolean s() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        int i = defpackage.eko.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("# ");
        sb.append(string);
        defpackage.eko.b(this, sb, 0);
        return sb.toString();
    }
}
