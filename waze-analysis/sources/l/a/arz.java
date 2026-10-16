package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class arz extends com.google.v.du<arz, ary> implements com.google.v.fj {
    private static final arz DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<arz> PARSER = null;
    public static final int PTO_COUNT_FIELD_NUMBER = 3;
    public static final int PTO_TYPES_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 1;
    private static final com.google.v.el<arx> ptoTypes_converter_ = new ve(13);
    private int bitField0_;
    private long latencyMs_;
    private long ptoCount_;
    private int ptoTypesMemoizedSerializedSize;
    private com.google.v.ek ptoTypes_ = emptyIntList();
    private long status_;

    static {
        arz arzVar = new arz();
        DEFAULT_INSTANCE = arzVar;
        com.google.v.du.registerDefaultInstance(arz.class, arzVar);
    }

    private arz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPtoTypes(Iterable<? extends arx> iterable) {
        ensurePtoTypesIsMutable();
        Iterator<? extends arx> it = iterable.iterator();
        while (it.hasNext()) {
            this.ptoTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPtoTypesValue(Iterable<Integer> iterable) {
        ensurePtoTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.ptoTypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPtoTypes(arx arxVar) {
        Objects.requireNonNull(arxVar);
        ensurePtoTypesIsMutable();
        this.ptoTypes_.i(arxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPtoTypesValue(int i2) {
        ensurePtoTypesIsMutable();
        this.ptoTypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -3;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPtoCount() {
        this.bitField0_ &= -5;
        this.ptoCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPtoTypes() {
        this.ptoTypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0L;
    }

    private void ensurePtoTypesIsMutable() {
        com.google.v.ek ekVar = this.ptoTypes_;
        if (ekVar.c()) {
            return;
        }
        this.ptoTypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static arz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ary newBuilder() {
        return (ary) DEFAULT_INSTANCE.createBuilder();
    }

    public static arz parseDelimitedFrom(InputStream inputStream) {
        return (arz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arz parseFrom(com.google.v.v vVar) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<arz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 2;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPtoCount(long j2) {
        this.bitField0_ |= 4;
        this.ptoCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPtoTypes(int i2, arx arxVar) {
        Objects.requireNonNull(arxVar);
        ensurePtoTypesIsMutable();
        this.ptoTypes_.e(i2, arxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPtoTypesValue(int i2, int i3) {
        ensurePtoTypesIsMutable();
        this.ptoTypes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(long j2) {
        this.bitField0_ |= 1;
        this.status_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004,", new Object[]{"bitField0_", "status_", "latencyMs_", "ptoCount_", "ptoTypes_"});
        }
        if (iOrdinal == 3) {
            return new arz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ary(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<arz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (arz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public long getPtoCount() {
        return this.ptoCount_;
    }

    public arx getPtoTypes(int i2) {
        arx arxVarA = arx.a(this.ptoTypes_.d(i2));
        return arxVarA == null ? arx.UNRECOGNIZED : arxVarA;
    }

    public int getPtoTypesCount() {
        return this.ptoTypes_.size();
    }

    public List<arx> getPtoTypesList() {
        return new com.google.v.em(this.ptoTypes_, ptoTypes_converter_);
    }

    public int getPtoTypesValue(int i2) {
        return this.ptoTypes_.d(i2);
    }

    public List<Integer> getPtoTypesValueList() {
        return this.ptoTypes_;
    }

    public long getStatus() {
        return this.status_;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPtoCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ary newBuilder(arz arzVar) {
        return (ary) DEFAULT_INSTANCE.createBuilder(arzVar);
    }

    public static arz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static arz parseFrom(com.google.v.z zVar) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static arz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static arz parseFrom(InputStream inputStream) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arz parseFrom(ByteBuffer byteBuffer) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static arz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static arz parseFrom(byte[] bArr) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static arz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (arz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
