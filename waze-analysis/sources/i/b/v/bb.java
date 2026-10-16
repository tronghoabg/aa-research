package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bb extends com.google.v.du<bb, ba> implements bc {
    private static final bb DEFAULT_INSTANCE;
    public static final int DISPLAY_STRING_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bb> PARSER;
    private int bitField0_;
    private String id_ = "";
    private String displayString_ = "";

    static {
        bb bbVar = new bb();
        DEFAULT_INSTANCE = bbVar;
        com.google.v.du.registerDefaultInstance(bb.class, bbVar);
    }

    private bb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayString() {
        this.bitField0_ &= -3;
        this.displayString_ = getDefaultInstance().getDisplayString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    public static bb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ba newBuilder() {
        return (ba) DEFAULT_INSTANCE.createBuilder();
    }

    public static bb parseDelimitedFrom(InputStream inputStream) {
        return (bb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bb parseFrom(com.google.v.v vVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayString(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.displayString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayStringBytes(com.google.v.v vVar) {
        this.displayString_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "id_", "displayString_"});
        }
        if (iOrdinal == 3) {
            return new bb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ba(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDisplayString() {
        return this.displayString_;
    }

    public com.google.v.v getDisplayStringBytes() {
        return com.google.v.v.s(this.displayString_);
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public boolean hasDisplayString() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ba newBuilder(bb bbVar) {
        return (ba) DEFAULT_INSTANCE.createBuilder(bbVar);
    }

    public static bb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bb parseFrom(com.google.v.z zVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bb parseFrom(InputStream inputStream) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bb parseFrom(ByteBuffer byteBuffer) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bb parseFrom(byte[] bArr) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
