package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bt extends com.google.v.du<bt, bs> implements bu {
    private static final bt DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bt> PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private int points_;

    static {
        bt btVar = new bt();
        DEFAULT_INSTANCE = btVar;
        com.google.v.du.registerDefaultInstance(bt.class, btVar);
    }

    private bt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.bitField0_ &= -3;
        this.points_ = 0;
    }

    public static bt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bs newBuilder() {
        return (bs) DEFAULT_INSTANCE.createBuilder();
    }

    public static bt parseDelimitedFrom(InputStream inputStream) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(com.google.v.v vVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(int i2) {
        this.bitField0_ |= 2;
        this.points_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"bitField0_", "name_", "points_"});
        }
        if (iOrdinal == 3) {
            return new bt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public int getPoints() {
        return this.points_;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPoints() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bs newBuilder(bt btVar) {
        return (bs) DEFAULT_INSTANCE.createBuilder(btVar);
    }

    public static bt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bt parseFrom(com.google.v.z zVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bt parseFrom(InputStream inputStream) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(ByteBuffer byteBuffer) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bt parseFrom(byte[] bArr) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
