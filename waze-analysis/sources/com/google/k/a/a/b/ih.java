package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ih extends com.google.v.du<ih, ig> implements ii {
    private static final ih DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<ih> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ce metadata_;
    private int type_ = 17;

    static {
        ih ihVar = new ih();
        DEFAULT_INSTANCE = ihVar;
        com.google.v.du.registerDefaultInstance(ih.class, ihVar);
    }

    private ih() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 17;
    }

    public static ih getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static ig newBuilder() {
        return (ig) DEFAULT_INSTANCE.createBuilder();
    }

    public static ih parseDelimitedFrom(InputStream inputStream) {
        return (ih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ih parseFrom(com.google.v.v vVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ih> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(hz hzVar) {
        this.type_ = hzVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001Ǵ\u0002\u0000\u0000\u0000\u0001᠌\u0000Ǵဉ\u0001", new Object[]{"bitField0_", "type_", hs.f11479g, "metadata_"});
        }
        if (iOrdinal == 3) {
            return new ih();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ig(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ih> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ih.class) {
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

    public hz getType() {
        hz hzVarA = hz.a(this.type_);
        return hzVarA == null ? hz.ENDPOINT_UNKNOWN : hzVarA;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ig newBuilder(ih ihVar) {
        return (ig) DEFAULT_INSTANCE.createBuilder(ihVar);
    }

    public static ih parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ih parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ih parseFrom(com.google.v.z zVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ih parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ih parseFrom(InputStream inputStream) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ih parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ih parseFrom(ByteBuffer byteBuffer) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ih parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ih parseFrom(byte[] bArr) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ih parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
