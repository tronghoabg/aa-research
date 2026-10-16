package defpackage;

import androidx.car.app.model.Alert;
import defpackage.ejf;
import defpackage.eji;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class eji<MessageType extends eji<MessageType, BuilderType>, BuilderType extends ejf<MessageType, BuilderType>> extends eie<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map<Class<?>, eji<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected ekz unknownFields = ekz.a;

    private final int b(ekp ekpVar) {
        return ekpVar == null ? ekm.a.b(this).a(this) : ekpVar.a(this);
    }

    protected static void p(Class cls, eji ejiVar) {
        ejiVar.o();
        defaultInstanceMap.put(cls, ejiVar);
    }

    public static final boolean t(eji ejiVar) {
        byte bByteValue = ((Byte) ejiVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zG = ekm.a.b(ejiVar).g(ejiVar);
        ejiVar.a(2);
        return zG;
    }

    protected abstract Object a(int i);

    @Override // defpackage.eie
    public final int c(ekp ekpVar) {
        if (s()) {
            int iB = b(ekpVar);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(a.bp(iB, "serialized size must be non-negative, was "));
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int iB2 = b(ekpVar);
        q(iB2);
        return iB2;
    }

    final int e() {
        return ekm.a.b(this).b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ekm.a.b(this).f(this, (eji) obj);
        }
        return false;
    }

    final int g() {
        return this.memoizedSerializedSize & Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.eke
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

    public final ejf i() {
        return (ejf) a(5);
    }

    @Override // defpackage.eke
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final ejf m() {
        return (ejf) a(5);
    }

    @Override // defpackage.ekf
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final eji f() {
        return (eji) a(6);
    }

    public final eji l() {
        return (eji) a(4);
    }

    protected final void n() {
        ekm.a.b(this).d(this);
        o();
    }

    final void o() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    final void q(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.bp(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = i | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    @Override // defpackage.eke
    public final void r(eiw eiwVar) throws IOException {
        ekp ekpVarB = ekm.a.b(this);
        Object erbVar = eiwVar.f;
        if (erbVar == null) {
            erbVar = new erb(eiwVar);
        }
        ekpVarB.i(this, (erb) erbVar);
    }

    final boolean s() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final String toString() throws SecurityException {
        String string = super.toString();
        int i = ekg.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        ekg.b(this, sb, 0);
        return sb.toString();
    }
}
