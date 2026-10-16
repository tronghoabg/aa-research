package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class akn extends com.google.v.du<akn, akj> implements com.google.v.fj {
    public static final int CONFIDENCE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final akn DEFAULT_INSTANCE;
    public static final int MOTION_START_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int MOTION_TYPES_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<akn> PARSER = null;
    public static final int WAKEUP_SESSION_ID_FIELD_NUMBER = 5;
    private static final com.google.v.el<akm> motionTypes_converter_ = new ve(12);
    private int bitField0_;
    private int confidence_;
    private int context_;
    private long motionStartTimestampMs_;
    private int motionTypesMemoizedSerializedSize;
    private com.google.v.ek motionTypes_ = emptyIntList();
    private long wakeupSessionId_;

    static {
        akn aknVar = new akn();
        DEFAULT_INSTANCE = aknVar;
        com.google.v.du.registerDefaultInstance(akn.class, aknVar);
    }

    private akn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMotionTypes(Iterable<? extends akm> iterable) {
        ensureMotionTypesIsMutable();
        Iterator<? extends akm> it = iterable.iterator();
        while (it.hasNext()) {
            this.motionTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMotionTypesValue(Iterable<Integer> iterable) {
        ensureMotionTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.motionTypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMotionTypes(akm akmVar) {
        Objects.requireNonNull(akmVar);
        ensureMotionTypesIsMutable();
        this.motionTypes_.i(akmVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMotionTypesValue(int i2) {
        ensureMotionTypesIsMutable();
        this.motionTypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidence() {
        this.confidence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMotionStartTimestampMs() {
        this.bitField0_ &= -2;
        this.motionStartTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMotionTypes() {
        this.motionTypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWakeupSessionId() {
        this.bitField0_ &= -3;
        this.wakeupSessionId_ = 0L;
    }

    private void ensureMotionTypesIsMutable() {
        com.google.v.ek ekVar = this.motionTypes_;
        if (ekVar.c()) {
            return;
        }
        this.motionTypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static akn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static akj newBuilder() {
        return (akj) DEFAULT_INSTANCE.createBuilder();
    }

    public static akn parseDelimitedFrom(InputStream inputStream) {
        return (akn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akn parseFrom(com.google.v.v vVar) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<akn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidence(akk akkVar) {
        this.confidence_ = akkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidenceValue(int i2) {
        this.confidence_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(akl aklVar) {
        this.context_ = aklVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMotionStartTimestampMs(long j2) {
        this.bitField0_ |= 1;
        this.motionStartTimestampMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMotionTypes(int i2, akm akmVar) {
        Objects.requireNonNull(akmVar);
        ensureMotionTypesIsMutable();
        this.motionTypes_.e(i2, akmVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMotionTypesValue(int i2, int i3) {
        ensureMotionTypesIsMutable();
        this.motionTypes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWakeupSessionId(long j2) {
        this.bitField0_ |= 2;
        this.wakeupSessionId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001,\u0002\f\u0003\f\u0004ဂ\u0000\u0005ဂ\u0001", new Object[]{"bitField0_", "motionTypes_", "confidence_", "context_", "motionStartTimestampMs_", "wakeupSessionId_"});
        }
        if (iOrdinal == 3) {
            return new akn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new akj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<akn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (akn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public akk getConfidence() {
        int i2 = this.confidence_;
        akk akkVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : akk.LOW : akk.MEDIUM : akk.HIGH : akk.CONFIDENCE_UNSPECIFIED;
        return akkVar == null ? akk.UNRECOGNIZED : akkVar;
    }

    public int getConfidenceValue() {
        return this.confidence_;
    }

    public akl getContext() {
        int i2 = this.context_;
        akl aklVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : akl.APP_WAKE_UP_SYSTEM : akl.USER_LOGIN : akl.CONTEXT_UNSPECIFIED;
        return aklVar == null ? akl.UNRECOGNIZED : aklVar;
    }

    public int getContextValue() {
        return this.context_;
    }

    public long getMotionStartTimestampMs() {
        return this.motionStartTimestampMs_;
    }

    public akm getMotionTypes(int i2) {
        akm akmVarA = akm.a(this.motionTypes_.d(i2));
        return akmVarA == null ? akm.UNRECOGNIZED : akmVarA;
    }

    public int getMotionTypesCount() {
        return this.motionTypes_.size();
    }

    public List<akm> getMotionTypesList() {
        return new com.google.v.em(this.motionTypes_, motionTypes_converter_);
    }

    public int getMotionTypesValue(int i2) {
        return this.motionTypes_.d(i2);
    }

    public List<Integer> getMotionTypesValueList() {
        return this.motionTypes_;
    }

    public long getWakeupSessionId() {
        return this.wakeupSessionId_;
    }

    public boolean hasMotionStartTimestampMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWakeupSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static akj newBuilder(akn aknVar) {
        return (akj) DEFAULT_INSTANCE.createBuilder(aknVar);
    }

    public static akn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static akn parseFrom(com.google.v.z zVar) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static akn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static akn parseFrom(InputStream inputStream) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akn parseFrom(ByteBuffer byteBuffer) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static akn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static akn parseFrom(byte[] bArr) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static akn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (akn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
