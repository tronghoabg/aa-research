package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* renamed from: i.b.v.do, reason: invalid class name */
/* loaded from: classes8.dex */
public final class Cdo extends com.google.v.du<Cdo, dn> implements dp {
    private static final Cdo DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<Cdo> PARSER;
    private int bitField0_;
    private String id_ = "";
    private String name_ = "";

    static {
        Cdo cdo = new Cdo();
        DEFAULT_INSTANCE = cdo;
        com.google.v.du.registerDefaultInstance(Cdo.class, cdo);
    }

    private Cdo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    public static Cdo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dn newBuilder() {
        return (dn) DEFAULT_INSTANCE.createBuilder();
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(com.google.v.v vVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<Cdo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "id_", "name_"});
        }
        if (iOrdinal == 3) {
            return new Cdo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<Cdo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Cdo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static dn newBuilder(Cdo cdo) {
        return (dn) DEFAULT_INSTANCE.createBuilder(cdo);
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Cdo parseFrom(InputStream inputStream) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Cdo parseFrom(byte[] bArr) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cdo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
