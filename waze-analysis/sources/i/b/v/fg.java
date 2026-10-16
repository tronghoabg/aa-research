package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fg extends com.google.v.du<fg, ff> implements com.google.v.fj {
    private static final fg DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<fg> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private br info_;
    private long value_;

    static {
        fg fgVar = new fg();
        DEFAULT_INSTANCE = fgVar;
        com.google.v.du.registerDefaultInstance(fg.class, fgVar);
    }

    private fg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.bitField0_ &= -2;
        this.value_ = 0L;
    }

    public static fg getDefaultInstance() {
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

    public static ff newBuilder() {
        return (ff) DEFAULT_INSTANCE.createBuilder();
    }

    public static fg parseDelimitedFrom(InputStream inputStream) {
        return (fg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fg parseFrom(com.google.v.v vVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(br brVar) {
        Objects.requireNonNull(brVar);
        this.info_ = brVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j2) {
        this.bitField0_ |= 1;
        this.value_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "value_", "info_"});
        }
        if (iOrdinal == 3) {
            return new fg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ff(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fg.class) {
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

    public long getValue() {
        return this.value_;
    }

    public boolean hasInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ff newBuilder(fg fgVar) {
        return (ff) DEFAULT_INSTANCE.createBuilder(fgVar);
    }

    public static fg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fg parseFrom(com.google.v.z zVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fg parseFrom(InputStream inputStream) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fg parseFrom(ByteBuffer byteBuffer) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fg parseFrom(byte[] bArr) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
