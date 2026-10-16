package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fo extends com.google.v.du<fo, fm> implements fp {
    private static final fo DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<fo> PARSER = null;
    public static final int RANK_FIELD_NUMBER = 2;
    public static final int RAW_SCALAR_FIELD_NUMBER = 4;
    public static final int RAW_STRING_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ce metadata_;
    private float rank_;
    private float rawScalar_;
    private String rawString_ = "";
    private int type_;

    static {
        fo foVar = new fo();
        DEFAULT_INSTANCE = foVar;
        com.google.v.du.registerDefaultInstance(fo.class, foVar);
    }

    private fo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.bitField0_ &= -3;
        this.rank_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawScalar() {
        this.bitField0_ &= -5;
        this.rawScalar_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawString() {
        this.bitField0_ &= -9;
        this.rawString_ = getDefaultInstance().getRawString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static fo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 16;
    }

    public static fm newBuilder() {
        return (fm) DEFAULT_INSTANCE.createBuilder();
    }

    public static fo parseDelimitedFrom(InputStream inputStream) {
        return (fo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fo parseFrom(com.google.v.v vVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(float f2) {
        this.bitField0_ |= 2;
        this.rank_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawScalar(float f2) {
        this.bitField0_ |= 4;
        this.rawScalar_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawString(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.rawString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawStringBytes(com.google.v.v vVar) {
        this.rawString_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(fn fnVar) {
        this.type_ = fnVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001Ǵ\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0004ခ\u0002\u0005ဈ\u0003Ǵဉ\u0004", new Object[]{"bitField0_", "type_", dq.f11275g, "rank_", "rawScalar_", "rawString_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new fo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public float getRank() {
        return this.rank_;
    }

    public float getRawScalar() {
        return this.rawScalar_;
    }

    public String getRawString() {
        return this.rawString_;
    }

    public com.google.v.v getRawStringBytes() {
        return com.google.v.v.s(this.rawString_);
    }

    public fn getType() {
        fn fnVarA = fn.a(this.type_);
        return fnVarA == null ? fn.SIGNAL_UNKNOWN : fnVarA;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRank() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRawScalar() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRawString() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fm newBuilder(fo foVar) {
        return (fm) DEFAULT_INSTANCE.createBuilder(foVar);
    }

    public static fo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fo parseFrom(com.google.v.z zVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fo parseFrom(InputStream inputStream) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fo parseFrom(ByteBuffer byteBuffer) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fo parseFrom(byte[] bArr) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
