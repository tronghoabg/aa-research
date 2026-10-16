package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ew extends com.google.v.du<ew, ev> implements com.google.v.fj {
    private static final ew DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ew> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private at value_;

    static {
        ew ewVar = new ew();
        DEFAULT_INSTANCE = ewVar;
        com.google.v.du.registerDefaultInstance(ew.class, ewVar);
    }

    private ew() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static ew getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(br brVar) {
        Objects.requireNonNull(brVar);
        br brVar2 = this.info_;
        if (brVar2 != null && brVar2 != br.getDefaultInstance()) {
            bq bqVarNewBuilder = br.newBuilder(brVar2);
            bqVarNewBuilder.mergeFrom((bq) brVar);
            brVar = bqVarNewBuilder.buildPartial();
        }
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(at atVar) {
        Objects.requireNonNull(atVar);
        at atVar2 = this.value_;
        if (atVar2 != null && atVar2 != at.getDefaultInstance()) {
            y yVarNewBuilder = at.newBuilder(atVar2);
            yVarNewBuilder.mergeFrom((y) atVar);
            atVar = yVarNewBuilder.buildPartial();
        }
        this.value_ = atVar;
        this.bitField0_ |= 1;
    }

    public static ev newBuilder() {
        return (ev) DEFAULT_INSTANCE.createBuilder();
    }

    public static ew parseDelimitedFrom(InputStream inputStream) {
        return (ew) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ew parseFrom(com.google.v.v vVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ew> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(at atVar) {
        Objects.requireNonNull(atVar);
        this.value_ = atVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "value_", "info_"});
        }
        if (iOrdinal == 3) {
            return new ew();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ev(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ew> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ew.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public br getInfo() {
        br brVar = this.info_;
        return brVar == null ? br.getDefaultInstance() : brVar;
    }

    public at getValue() {
        at atVar = this.value_;
        return atVar == null ? at.getDefaultInstance() : atVar;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ev newBuilder(ew ewVar) {
        return (ev) DEFAULT_INSTANCE.createBuilder(ewVar);
    }

    public static ew parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ew) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ew parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ew parseFrom(com.google.v.z zVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ew parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ew parseFrom(InputStream inputStream) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ew parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ew parseFrom(ByteBuffer byteBuffer) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ew parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ew parseFrom(byte[] bArr) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ew parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
