package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjg extends com.google.v.du<bjg, bjf> implements com.google.v.fj {
    private static final bjg DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bjg> PARSER;
    private int bitField0_;
    private bje params_;

    static {
        bjg bjgVar = new bjg();
        DEFAULT_INSTANCE = bjgVar;
        com.google.v.du.registerDefaultInstance(bjg.class, bjgVar);
    }

    private bjg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
        this.bitField0_ &= -2;
    }

    public static bjg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(bje bjeVar) {
        Objects.requireNonNull(bjeVar);
        bje bjeVar2 = this.params_;
        if (bjeVar2 != null && bjeVar2 != bje.getDefaultInstance()) {
            bjc bjcVarNewBuilder = bje.newBuilder(bjeVar2);
            bjcVarNewBuilder.mergeFrom((bjc) bjeVar);
            bjeVar = bjcVarNewBuilder.buildPartial();
        }
        this.params_ = bjeVar;
        this.bitField0_ |= 1;
    }

    public static bjf newBuilder() {
        return (bjf) DEFAULT_INSTANCE.createBuilder();
    }

    public static bjg parseDelimitedFrom(InputStream inputStream) {
        return (bjg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjg parseFrom(com.google.v.v vVar) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bjg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(bje bjeVar) {
        Objects.requireNonNull(bjeVar);
        this.params_ = bjeVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
        }
        if (iOrdinal == 3) {
            return new bjg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bjf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bjg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bjg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bje getParams() {
        bje bjeVar = this.params_;
        return bjeVar == null ? bje.getDefaultInstance() : bjeVar;
    }

    public boolean hasParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bjf newBuilder(bjg bjgVar) {
        return (bjf) DEFAULT_INSTANCE.createBuilder(bjgVar);
    }

    public static bjg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bjg parseFrom(com.google.v.z zVar) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bjg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bjg parseFrom(InputStream inputStream) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjg parseFrom(ByteBuffer byteBuffer) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bjg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bjg parseFrom(byte[] bArr) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bjg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bjg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
