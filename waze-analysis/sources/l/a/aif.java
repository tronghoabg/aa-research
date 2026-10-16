package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aif extends com.google.v.du<aif, aie> implements aig {
    public static final int BOTTOM_COORDINATE_FIELD_NUMBER = 5;
    private static final aif DEFAULT_INSTANCE;
    public static final int LEFT_COORDINATE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<aif> PARSER = null;
    public static final int RIGHT_COORDINATE_FIELD_NUMBER = 2;
    public static final int TOP_COORDINATE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long bottomCoordinate_;
    private long leftCoordinate_;
    private long rightCoordinate_;
    private long topCoordinate_;
    private long type_;

    static {
        aif aifVar = new aif();
        DEFAULT_INSTANCE = aifVar;
        com.google.v.du.registerDefaultInstance(aif.class, aifVar);
    }

    private aif() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBottomCoordinate() {
        this.bitField0_ &= -17;
        this.bottomCoordinate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftCoordinate() {
        this.bitField0_ &= -5;
        this.leftCoordinate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightCoordinate() {
        this.bitField0_ &= -3;
        this.rightCoordinate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopCoordinate() {
        this.bitField0_ &= -9;
        this.topCoordinate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0L;
    }

    public static aif getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aie newBuilder() {
        return (aie) DEFAULT_INSTANCE.createBuilder();
    }

    public static aif parseDelimitedFrom(InputStream inputStream) {
        return (aif) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aif parseFrom(com.google.v.v vVar) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aif> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomCoordinate(long j2) {
        this.bitField0_ |= 16;
        this.bottomCoordinate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeftCoordinate(long j2) {
        this.bitField0_ |= 4;
        this.leftCoordinate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightCoordinate(long j2) {
        this.bitField0_ |= 2;
        this.rightCoordinate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopCoordinate(long j2) {
        this.bitField0_ |= 8;
        this.topCoordinate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(long j2) {
        this.bitField0_ |= 1;
        this.type_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"bitField0_", "type_", "rightCoordinate_", "leftCoordinate_", "topCoordinate_", "bottomCoordinate_"});
        }
        if (iOrdinal == 3) {
            return new aif();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aie(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aif> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aif.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getBottomCoordinate() {
        return this.bottomCoordinate_;
    }

    public long getLeftCoordinate() {
        return this.leftCoordinate_;
    }

    public long getRightCoordinate() {
        return this.rightCoordinate_;
    }

    public long getTopCoordinate() {
        return this.topCoordinate_;
    }

    public long getType() {
        return this.type_;
    }

    public boolean hasBottomCoordinate() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasLeftCoordinate() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRightCoordinate() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTopCoordinate() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aie newBuilder(aif aifVar) {
        return (aie) DEFAULT_INSTANCE.createBuilder(aifVar);
    }

    public static aif parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aif) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aif parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aif parseFrom(com.google.v.z zVar) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aif parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aif parseFrom(InputStream inputStream) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aif parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aif parseFrom(ByteBuffer byteBuffer) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aif parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aif parseFrom(byte[] bArr) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aif parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
