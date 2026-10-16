package com.google.v;

import com.google.v.dm;
import com.google.v.du;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class du<MessageType extends du<MessageType, BuilderType>, BuilderType extends dm<MessageType, BuilderType>> extends c<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static final Map<Class<?>, du<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected gf unknownFields = gf.c();

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends dq<MessageType, BuilderType>, BuilderType extends Cdo<MessageType, BuilderType>, T> ds<MessageType, T> checkIsLite(dc<MessageType, T> dcVar) {
        return (ds) dcVar;
    }

    private static <T extends du<T, ?>> T checkMessageInitialized(T t) throws eu {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().a();
    }

    private int computeSerializedSize(ft<?> ftVar) {
        return ftVar == null ? fq.a().b(this).a(this) : ftVar.a(this);
    }

    protected static ee emptyBooleanList() {
        return p.d();
    }

    protected static ef emptyDoubleList() {
        return cz.e();
    }

    protected static ej emptyFloatList() {
        return dj.g();
    }

    protected static ek emptyIntList() {
        return ed.g();
    }

    protected static en emptyLongList() {
        return fc.h();
    }

    protected static <E> eo<E> emptyProtobufList() {
        return fr.d();
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == gf.c()) {
            this.unknownFields = gf.e();
        }
    }

    static <T extends du> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
        Map<Class<?>, du<?, ?>> map = defaultInstanceMap;
        du<?, ?> duVar = map.get(cls);
        if (duVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                duVar = map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (duVar != null) {
            return duVar;
        }
        du<?, ?> defaultInstanceForType = ((du) gk.e(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        map.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends du<T, ?>> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(dt.f12879a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zL = fq.a().b(t).l(t);
        if (z) {
            t.dynamicMethod(dt.f12880b, true != zL ? null : t, null);
        }
        return zL;
    }

    protected static ee mutableCopy(ee eeVar) {
        int size = eeVar.size();
        return eeVar.f(size + size);
    }

    protected static Object newMessageInfo(fi fiVar, String str, Object[] objArr) {
        return new fs(fiVar, str, objArr);
    }

    public static <ContainingType extends fi, Type> ds<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, fi fiVar, eh ehVar, int i2, gm gmVar, boolean z, Class cls) {
        return new ds<>(containingtype, fr.d(), fiVar, new dr(ehVar, i2, gmVar, true, z));
    }

    public static <ContainingType extends fi, Type> ds<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, fi fiVar, eh ehVar, int i2, gm gmVar, Class cls) {
        return new ds<>(containingtype, type, fiVar, new dr(ehVar, i2, gmVar, false, false));
    }

    protected static <T extends du<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws eu {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, de.f12840a);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, de deVar) throws eu {
        z zVarZ;
        int i2 = z.f13068f;
        if (byteBuffer.hasArray()) {
            zVarZ = z.Z(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zVarZ = z.Z(bArr, 0, iRemaining);
        }
        T t2 = (T) parseFrom(t, zVarZ, deVar);
        checkMessageInitialized(t2);
        return t2;
    }

    private static <T extends du<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, de deVar) throws IOException {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            z zVarX = z.X(new a(inputStream, z.P(i2, inputStream)));
            T t2 = (T) parsePartialFrom(t, zVarX, deVar);
            zVarX.E(0);
            return t2;
        } catch (eu e2) {
            if (e2.b()) {
                throw new eu(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new eu(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends du<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i2, int i3, de deVar) throws eu {
        if (i3 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            ft ftVarB = fq.a().b(t2);
            ftVarB.i(t2, bArr, i2, i2 + i3, new k(deVar));
            ftVarB.f(t2);
            return t2;
        } catch (eu e2) {
            if (e2.b()) {
                throw new eu(e2);
            }
            throw e2;
        } catch (gd e3) {
            throw e3.a();
        } catch (IOException e4) {
            if (e4.getCause() instanceof eu) {
                throw ((eu) e4.getCause());
            }
            throw new eu(e4);
        } catch (IndexOutOfBoundsException unused) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    protected static <T extends du> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    final Object buildMessageInfo() {
        return dynamicMethod(dt.f12881c, null, null);
    }

    final void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    final void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    final int computeHashCode() {
        return fq.a().b(this).b(this);
    }

    protected final <MessageType2 extends du<MessageType2, BuilderType2>, BuilderType2 extends dm<MessageType2, BuilderType2>> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(dt.f12883e, null, null);
    }

    protected abstract Object dynamicMethod(dt dtVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return fq.a().b(this).k(this, (du) obj);
        }
        return false;
    }

    @Override // com.google.v.fj
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(dt.f12884f, null, null);
    }

    final int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.v.c
    final int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.v.fi
    public final fo<MessageType> getParserForType() {
        return (fo) dynamicMethod(dt.f12885g, null, null);
    }

    @Override // com.google.v.c
    int getSerializedSize(ft ftVar) {
        if (!isMutable()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int iComputeSerializedSize = computeSerializedSize(ftVar);
            setMemoizedSerializedSize(iComputeSerializedSize);
            return iComputeSerializedSize;
        }
        int iComputeSerializedSize2 = computeSerializedSize(ftVar);
        if (iComputeSerializedSize2 >= 0) {
            return iComputeSerializedSize2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iComputeSerializedSize2);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    final boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    final boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected final void makeImmutable() {
        fq.a().b(this).f(this);
        markImmutable();
    }

    final void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected final void mergeLengthDelimitedField(int i2, v vVar) {
        ensureUnknownFieldsInitialized();
        gf gfVar = this.unknownFields;
        gfVar.f();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        gfVar.i(go.c(i2, 2), vVar);
    }

    protected final void mergeUnknownFields(gf gfVar) {
        this.unknownFields = gf.d(this.unknownFields, gfVar);
    }

    protected final void mergeVarintField(int i2, int i3) {
        ensureUnknownFieldsInitialized();
        gf gfVar = this.unknownFields;
        gfVar.f();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        gfVar.i(go.c(i2, 0), Long.valueOf(i3));
    }

    @Override // com.google.v.fi
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(dt.f12883e, null, null);
    }

    final MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(dt.f12882d, null, null);
    }

    protected final boolean parseUnknownField(int i2, z zVar) {
        if (go.b(i2) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.l(i2, zVar);
    }

    final void setMemoizedHashCode(int i2) {
        this.memoizedHashCode = i2;
    }

    @Override // com.google.v.c
    void setMemoizedSerializedSize(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = i2 | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i2);
        }
    }

    @Override // com.google.v.fi
    public final BuilderType toBuilder() {
        return (BuilderType) ((dm) dynamicMethod(dt.f12883e, null, null)).mergeFrom((dm) this);
    }

    public String toString() {
        return fk.a(this, super.toString());
    }

    @Override // com.google.v.fi
    public void writeTo(ae aeVar) {
        fq.a().b(this).j(this, af.a(aeVar));
    }

    protected static ef mutableCopy(ef efVar) {
        int size = efVar.size();
        return efVar.f(size + size);
    }

    protected static <T extends du<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, de deVar) throws eu {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, deVar);
        checkMessageInitialized(t2);
        return t2;
    }

    protected final <MessageType2 extends du<MessageType2, BuilderType2>, BuilderType2 extends dm<MessageType2, BuilderType2>> BuilderType2 createBuilder(MessageType2 messagetype2) {
        return (BuilderType2) createBuilder().mergeFrom((dm) messagetype2);
    }

    protected static ej mutableCopy(ej ejVar) {
        int size = ejVar.size();
        return ejVar.f(size + size);
    }

    protected static ek mutableCopy(ek ekVar) {
        int size = ekVar.size();
        return ekVar.f(size + size);
    }

    protected static en mutableCopy(en enVar) {
        int size = enVar.size();
        return enVar.f(size + size);
    }

    protected static <E> eo<E> mutableCopy(eo<E> eoVar) {
        int size = eoVar.size();
        return eoVar.f(size + size);
    }

    @Override // com.google.v.fj
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    @Override // com.google.v.fi
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, v vVar, de deVar) throws eu {
        T t2 = (T) parsePartialFrom(t, vVar, deVar);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, z zVar) {
        return (T) parseFrom(t, zVar, de.f12840a);
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, z zVar, de deVar) throws eu {
        T t2 = (T) parsePartialFrom(t, zVar, deVar);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, InputStream inputStream) throws eu {
        T t2 = (T) parsePartialFrom(t, z.X(inputStream), de.f12840a);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, InputStream inputStream, de deVar) throws eu {
        T t2 = (T) parsePartialFrom(t, z.X(inputStream), deVar);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, de.f12840a);
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, v vVar) throws eu {
        T t2 = (T) parseFrom(t, vVar, de.f12840a);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, byte[] bArr) throws eu {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, de.f12840a);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parseFrom(T t, byte[] bArr, de deVar) throws eu {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, deVar);
        checkMessageInitialized(t2);
        return t2;
    }

    protected static <T extends du<T, ?>> T parsePartialFrom(T t, z zVar) {
        return (T) parsePartialFrom(t, zVar, de.f12840a);
    }

    static <T extends du<T, ?>> T parsePartialFrom(T t, z zVar, de deVar) throws eu {
        T t2 = (T) t.newMutableInstance();
        try {
            ft ftVarB = fq.a().b(t2);
            ftVarB.h(t2, aa.q(zVar), deVar);
            ftVarB.f(t2);
            return t2;
        } catch (eu e2) {
            if (e2.b()) {
                throw new eu(e2);
            }
            throw e2;
        } catch (gd e3) {
            throw e3.a();
        } catch (IOException e4) {
            if (e4.getCause() instanceof eu) {
                throw ((eu) e4.getCause());
            }
            throw new eu(e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof eu) {
                throw ((eu) e5.getCause());
            }
            throw e5;
        }
    }

    private static <T extends du<T, ?>> T parsePartialFrom(T t, v vVar, de deVar) {
        z zVarF = vVar.f();
        T t2 = (T) parsePartialFrom(t, zVarF, deVar);
        zVarF.E(0);
        return t2;
    }
}
