package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ji extends com.google.v.du<ji, jh> implements com.google.v.fj {
    private static final ji DEFAULT_INSTANCE;
    public static final int LOC_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ji> PARSER;
    private int bitField0_;
    private i.b.s loc_;

    static {
        ji jiVar = new ji();
        DEFAULT_INSTANCE = jiVar;
        com.google.v.du.registerDefaultInstance(ji.class, jiVar);
    }

    private ji() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoc() {
        this.loc_ = null;
        this.bitField0_ &= -2;
    }

    public static ji getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLoc(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.loc_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.loc_ = sVar;
        this.bitField0_ |= 1;
    }

    public static jh newBuilder() {
        return (jh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ji parseDelimitedFrom(InputStream inputStream) {
        return (ji) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ji parseFrom(com.google.v.v vVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ji> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoc(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.loc_ = sVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "loc_"});
        }
        if (iOrdinal == 3) {
            return new ji();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ji> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ji.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getLoc() {
        i.b.s sVar = this.loc_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasLoc() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jh newBuilder(ji jiVar) {
        return (jh) DEFAULT_INSTANCE.createBuilder(jiVar);
    }

    public static ji parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ji) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ji parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ji parseFrom(com.google.v.z zVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ji parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ji parseFrom(InputStream inputStream) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ji parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ji parseFrom(ByteBuffer byteBuffer) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ji parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ji parseFrom(byte[] bArr) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ji parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
