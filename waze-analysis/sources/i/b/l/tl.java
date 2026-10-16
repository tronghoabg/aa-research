package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tl extends com.google.v.du<tl, tk> implements com.google.v.fj {
    private static final tl DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<tl> PARSER = null;
    public static final int TO_FIELD_NUMBER = 2;
    private int bitField0_;
    private i.b.s from_;
    private i.b.s to_;

    static {
        tl tlVar = new tl();
        DEFAULT_INSTANCE = tlVar;
        com.google.v.du.registerDefaultInstance(tl.class, tlVar);
    }

    private tl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTo() {
        this.to_ = null;
        this.bitField0_ &= -3;
    }

    public static tl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFrom(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.from_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.from_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTo(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.to_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.to_ = sVar;
        this.bitField0_ |= 2;
    }

    public static tk newBuilder() {
        return (tk) DEFAULT_INSTANCE.createBuilder();
    }

    public static tl parseDelimitedFrom(InputStream inputStream) {
        return (tl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tl parseFrom(com.google.v.v vVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.from_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.to_ = sVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "from_", "to_"});
        }
        if (iOrdinal == 3) {
            return new tl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getFrom() {
        i.b.s sVar = this.from_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public i.b.s getTo() {
        i.b.s sVar = this.to_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasFrom() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static tk newBuilder(tl tlVar) {
        return (tk) DEFAULT_INSTANCE.createBuilder(tlVar);
    }

    public static tl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tl parseFrom(com.google.v.z zVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tl parseFrom(InputStream inputStream) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tl parseFrom(ByteBuffer byteBuffer) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tl parseFrom(byte[] bArr) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
