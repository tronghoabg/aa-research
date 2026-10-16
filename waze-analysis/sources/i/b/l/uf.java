package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class uf extends com.google.v.du<uf, uc> implements ug {
    public static final int ALERTS_FIELD_NUMBER = 5;
    private static final uf DEFAULT_INSTANCE;
    public static final int DISPLAYTIMESECONDS_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<uf> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int displayTimeSeconds_;
    private Object takeover_;
    private int type_;
    private int takeoverCase_ = 0;
    private String id_ = "";

    static {
        uf ufVar = new uf();
        DEFAULT_INSTANCE = ufVar;
        com.google.v.du.registerDefaultInstance(uf.class, ufVar);
    }

    private uf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerts() {
        if (this.takeoverCase_ == 5) {
            this.takeoverCase_ = 0;
            this.takeover_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayTimeSeconds() {
        this.bitField0_ &= -5;
        this.displayTimeSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -3;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeover() {
        this.takeoverCase_ = 0;
        this.takeover_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static uf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerts(ub ubVar) {
        Objects.requireNonNull(ubVar);
        if (this.takeoverCase_ == 5 && this.takeover_ != ub.getDefaultInstance()) {
            ua uaVarNewBuilder = ub.newBuilder((ub) this.takeover_);
            uaVarNewBuilder.mergeFrom((ua) ubVar);
            ubVar = uaVarNewBuilder.buildPartial();
        }
        this.takeover_ = ubVar;
        this.takeoverCase_ = 5;
    }

    public static uc newBuilder() {
        return (uc) DEFAULT_INSTANCE.createBuilder();
    }

    public static uf parseDelimitedFrom(InputStream inputStream) {
        return (uf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uf parseFrom(com.google.v.v vVar) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<uf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerts(ub ubVar) {
        Objects.requireNonNull(ubVar);
        this.takeover_ = ubVar;
        this.takeoverCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayTimeSeconds(int i2) {
        this.bitField0_ |= 4;
        this.displayTimeSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(ue ueVar) {
        this.type_ = ueVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0005<\u0000", new Object[]{"takeover_", "takeoverCase_", "bitField0_", "type_", pa.f48961j, "id_", "displayTimeSeconds_", ub.class});
        }
        if (iOrdinal == 3) {
            return new uf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new uc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<uf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (uf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ub getAlerts() {
        return this.takeoverCase_ == 5 ? (ub) this.takeover_ : ub.getDefaultInstance();
    }

    public int getDisplayTimeSeconds() {
        return this.displayTimeSeconds_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public ud getTakeoverCase() {
        int i2 = this.takeoverCase_;
        if (i2 == 0) {
            return ud.f49058b;
        }
        if (i2 != 5) {
            return null;
        }
        return ud.f49057a;
    }

    public ue getType() {
        ue ueVarA = ue.a(this.type_);
        return ueVarA == null ? ue.UNKNOWN : ueVarA;
    }

    public boolean hasAlerts() {
        return this.takeoverCase_ == 5;
    }

    public boolean hasDisplayTimeSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static uc newBuilder(uf ufVar) {
        return (uc) DEFAULT_INSTANCE.createBuilder(ufVar);
    }

    public static uf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static uf parseFrom(com.google.v.z zVar) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static uf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static uf parseFrom(InputStream inputStream) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uf parseFrom(ByteBuffer byteBuffer) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static uf parseFrom(byte[] bArr) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static uf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (uf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
