package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ev extends com.google.v.du<ev, eu> implements com.google.v.fj {
    private static final ev DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ev> PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 3;
    public static final int SECRET_KEY_FIELD_NUMBER = 2;
    private int bitField0_;
    private long id_;
    private int protocol_;
    private String secretKey_ = "";

    static {
        ev evVar = new ev();
        DEFAULT_INSTANCE = evVar;
        com.google.v.du.registerDefaultInstance(ev.class, evVar);
    }

    private ev() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.bitField0_ &= -5;
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecretKey() {
        this.bitField0_ &= -3;
        this.secretKey_ = getDefaultInstance().getSecretKey();
    }

    public static ev getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eu newBuilder() {
        return (eu) DEFAULT_INSTANCE.createBuilder();
    }

    public static ev parseDelimitedFrom(InputStream inputStream) {
        return (ev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ev parseFrom(com.google.v.v vVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ev> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i2) {
        this.bitField0_ |= 4;
        this.protocol_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.secretKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKeyBytes(com.google.v.v vVar) {
        this.secretKey_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "id_", "secretKey_", "protocol_"});
        }
        if (iOrdinal == 3) {
            return new ev();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ev> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ev.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getId() {
        return this.id_;
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public String getSecretKey() {
        return this.secretKey_;
    }

    public com.google.v.v getSecretKeyBytes() {
        return com.google.v.v.s(this.secretKey_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProtocol() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSecretKey() {
        return (this.bitField0_ & 2) != 0;
    }

    public static eu newBuilder(ev evVar) {
        return (eu) DEFAULT_INSTANCE.createBuilder(evVar);
    }

    public static ev parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ev) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ev parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ev parseFrom(com.google.v.z zVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ev parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ev parseFrom(InputStream inputStream) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ev parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ev parseFrom(ByteBuffer byteBuffer) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ev parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ev parseFrom(byte[] bArr) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ev parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ev) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
