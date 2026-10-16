package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aw extends com.google.v.du<aw, av> implements com.google.v.fj {
    private static final aw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aw> PARSER = null;
    public static final int TYPE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String typeId_ = "";

    static {
        aw awVar = new aw();
        DEFAULT_INSTANCE = awVar;
        com.google.v.du.registerDefaultInstance(aw.class, awVar);
    }

    private aw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeId() {
        this.bitField0_ &= -2;
        this.typeId_ = getDefaultInstance().getTypeId();
    }

    public static aw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static av newBuilder() {
        return (av) DEFAULT_INSTANCE.createBuilder();
    }

    public static aw parseDelimitedFrom(InputStream inputStream) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(com.google.v.v vVar) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.typeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeIdBytes(com.google.v.v vVar) {
        this.typeId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "typeId_"});
        }
        if (iOrdinal == 3) {
            return new aw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new av(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getTypeId() {
        return this.typeId_;
    }

    public com.google.v.v getTypeIdBytes() {
        return com.google.v.v.s(this.typeId_);
    }

    public boolean hasTypeId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static av newBuilder(aw awVar) {
        return (av) DEFAULT_INSTANCE.createBuilder(awVar);
    }

    public static aw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aw parseFrom(com.google.v.z zVar) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aw parseFrom(InputStream inputStream) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aw parseFrom(ByteBuffer byteBuffer) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aw parseFrom(byte[] bArr) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
