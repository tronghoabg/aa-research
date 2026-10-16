package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ey extends com.google.v.du<ey, ex> implements com.google.v.fj {
    private static final ey DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ey> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private bf value_;

    static {
        ey eyVar = new ey();
        DEFAULT_INSTANCE = eyVar;
        com.google.v.du.registerDefaultInstance(ey.class, eyVar);
    }

    private ey() {
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

    public static ey getDefaultInstance() {
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
    public void mergeValue(bf bfVar) {
        Objects.requireNonNull(bfVar);
        bf bfVar2 = this.value_;
        if (bfVar2 != null && bfVar2 != bf.getDefaultInstance()) {
            be beVarNewBuilder = bf.newBuilder(bfVar2);
            beVarNewBuilder.mergeFrom((be) bfVar);
            bfVar = beVarNewBuilder.buildPartial();
        }
        this.value_ = bfVar;
        this.bitField0_ |= 1;
    }

    public static ex newBuilder() {
        return (ex) DEFAULT_INSTANCE.createBuilder();
    }

    public static ey parseDelimitedFrom(InputStream inputStream) {
        return (ey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ey parseFrom(com.google.v.v vVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(bf bfVar) {
        Objects.requireNonNull(bfVar);
        this.value_ = bfVar;
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
            return new ey();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ex(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ey> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ey.class) {
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

    public bf getValue() {
        bf bfVar = this.value_;
        return bfVar == null ? bf.getDefaultInstance() : bfVar;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ex newBuilder(ey eyVar) {
        return (ex) DEFAULT_INSTANCE.createBuilder(eyVar);
    }

    public static ey parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ey parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ey parseFrom(com.google.v.z zVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ey parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ey parseFrom(InputStream inputStream) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ey parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ey parseFrom(ByteBuffer byteBuffer) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ey parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ey parseFrom(byte[] bArr) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ey parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
