package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fm extends com.google.v.du<fm, fl> implements com.google.v.fj {
    private static final fm DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fm> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private cw value_;

    static {
        fm fmVar = new fm();
        DEFAULT_INSTANCE = fmVar;
        com.google.v.du.registerDefaultInstance(fm.class, fmVar);
    }

    private fm() {
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

    public static fm getDefaultInstance() {
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
    public void mergeValue(cw cwVar) {
        Objects.requireNonNull(cwVar);
        cw cwVar2 = this.value_;
        if (cwVar2 != null && cwVar2 != cw.getDefaultInstance()) {
            cl clVarNewBuilder = cw.newBuilder(cwVar2);
            clVarNewBuilder.mergeFrom((cl) cwVar);
            cwVar = clVarNewBuilder.buildPartial();
        }
        this.value_ = cwVar;
        this.bitField0_ |= 1;
    }

    public static fl newBuilder() {
        return (fl) DEFAULT_INSTANCE.createBuilder();
    }

    public static fm parseDelimitedFrom(InputStream inputStream) {
        return (fm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fm parseFrom(com.google.v.v vVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(cw cwVar) {
        Objects.requireNonNull(cwVar);
        this.value_ = cwVar;
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
            return new fm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fm.class) {
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

    public cw getValue() {
        cw cwVar = this.value_;
        return cwVar == null ? cw.getDefaultInstance() : cwVar;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fl newBuilder(fm fmVar) {
        return (fl) DEFAULT_INSTANCE.createBuilder(fmVar);
    }

    public static fm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fm parseFrom(com.google.v.z zVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fm parseFrom(InputStream inputStream) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fm parseFrom(ByteBuffer byteBuffer) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fm parseFrom(byte[] bArr) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
