package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class th extends com.google.v.du<th, tg> implements com.google.v.fj {
    public static final int DB_ID_FIELD_NUMBER = 1;
    private static final th DEFAULT_INSTANCE;
    public static final int FULL_NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<th> PARSER;
    private int bitField0_;
    private long dbId_;
    private String fullName_ = "";

    static {
        th thVar = new th();
        DEFAULT_INSTANCE = thVar;
        com.google.v.du.registerDefaultInstance(th.class, thVar);
    }

    private th() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDbId() {
        this.bitField0_ &= -2;
        this.dbId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFullName() {
        this.bitField0_ &= -3;
        this.fullName_ = getDefaultInstance().getFullName();
    }

    public static th getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tg newBuilder() {
        return (tg) DEFAULT_INSTANCE.createBuilder();
    }

    public static th parseDelimitedFrom(InputStream inputStream) {
        return (th) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static th parseFrom(com.google.v.v vVar) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<th> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDbId(long j2) {
        this.bitField0_ |= 1;
        this.dbId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.fullName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullNameBytes(com.google.v.v vVar) {
        this.fullName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "dbId_", "fullName_"});
        }
        if (iOrdinal == 3) {
            return new th();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<th> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (th.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDbId() {
        return this.dbId_;
    }

    public String getFullName() {
        return this.fullName_;
    }

    public com.google.v.v getFullNameBytes() {
        return com.google.v.v.s(this.fullName_);
    }

    public boolean hasDbId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFullName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static tg newBuilder(th thVar) {
        return (tg) DEFAULT_INSTANCE.createBuilder(thVar);
    }

    public static th parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (th) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static th parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static th parseFrom(com.google.v.z zVar) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static th parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static th parseFrom(InputStream inputStream) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static th parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static th parseFrom(ByteBuffer byteBuffer) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static th parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static th parseFrom(byte[] bArr) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static th parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (th) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
