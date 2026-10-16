package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gp extends com.google.v.du<gp, gm> implements com.google.v.fj {
    public static final int CAUSE_FIELD_NUMBER = 4;
    private static final gp DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    public static final int OPCODE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<gp> PARSER = null;
    public static final int POINTS_RECEIVED_FIELD_NUMBER = 2;
    public static final int REQUEST_FIELD_NUMBER = 8;
    public static final int VENUE3_FIELD_NUMBER = 7;
    public static final int VENUE_FIELD_NUMBER = 5;
    private int bitField0_;
    private int pointsReceived_;
    private gw request_;
    private ed venue3_;
    private ef venue_;
    private byte memoizedIsInitialized = 2;
    private String id_ = "";
    private int opcode_ = 1;
    private int cause_ = 1;
    private String message_ = "";

    static {
        gp gpVar = new gp();
        DEFAULT_INSTANCE = gpVar;
        com.google.v.du.registerDefaultInstance(gp.class, gpVar);
    }

    private gp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCause() {
        this.bitField0_ &= -9;
        this.cause_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.bitField0_ &= -33;
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpcode() {
        this.bitField0_ &= -5;
        this.opcode_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointsReceived() {
        this.bitField0_ &= -3;
        this.pointsReceived_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue3() {
        this.venue3_ = null;
        this.bitField0_ &= -65;
    }

    public static gp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(gw gwVar) {
        Objects.requireNonNull(gwVar);
        gw gwVar2 = this.request_;
        if (gwVar2 != null && gwVar2 != gw.getDefaultInstance()) {
            gv gvVarNewBuilder = gw.newBuilder(gwVar2);
            gvVarNewBuilder.mergeFrom((gv) gwVar);
            gwVar = gvVarNewBuilder.buildPartial();
        }
        this.request_ = gwVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        ef efVar2 = this.venue_;
        if (efVar2 != null && efVar2 != ef.getDefaultInstance()) {
            eb ebVarNewBuilder = ef.newBuilder(efVar2);
            ebVarNewBuilder.mergeFrom((eb) efVar);
            efVar = ebVarNewBuilder.buildPartial();
        }
        this.venue_ = efVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue3(ed edVar) {
        Objects.requireNonNull(edVar);
        ed edVar2 = this.venue3_;
        if (edVar2 != null && edVar2 != ed.getDefaultInstance()) {
            ec ecVarNewBuilder = ed.newBuilder(edVar2);
            ecVarNewBuilder.mergeFrom((ec) edVar);
            edVar = ecVarNewBuilder.buildPartial();
        }
        this.venue3_ = edVar;
        this.bitField0_ |= 64;
    }

    public static gm newBuilder() {
        return (gm) DEFAULT_INSTANCE.createBuilder();
    }

    public static gp parseDelimitedFrom(InputStream inputStream) {
        return (gp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gp parseFrom(com.google.v.v vVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCause(gn gnVar) {
        this.cause_ = gnVar.getNumber();
        this.bitField0_ |= 8;
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
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(com.google.v.v vVar) {
        this.message_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpcode(go goVar) {
        this.opcode_ = goVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsReceived(int i2) {
        this.bitField0_ |= 2;
        this.pointsReceived_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(gw gwVar) {
        Objects.requireNonNull(gwVar);
        this.request_ = gwVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        this.venue_ = efVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue3(ed edVar) {
        Objects.requireNonNull(edVar);
        this.venue3_ = edVar;
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ဈ\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ᐉ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"bitField0_", "id_", "pointsReceived_", "opcode_", ft.f49498f, "cause_", ft.f49497e, "venue_", "message_", "venue3_", "request_"});
            case 3:
                return new gp();
            case 4:
                return new gm(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gp> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gp.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public gn getCause() {
        gn gnVarA = gn.a(this.cause_);
        return gnVarA == null ? gn.BABY_WAZER : gnVarA;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getMessage() {
        return this.message_;
    }

    public com.google.v.v getMessageBytes() {
        return com.google.v.v.s(this.message_);
    }

    public go getOpcode() {
        go goVarA = go.a(this.opcode_);
        return goVarA == null ? go.NOT_ALLOWED : goVarA;
    }

    public int getPointsReceived() {
        return this.pointsReceived_;
    }

    public gw getRequest() {
        gw gwVar = this.request_;
        return gwVar == null ? gw.getDefaultInstance() : gwVar;
    }

    public ef getVenue() {
        ef efVar = this.venue_;
        return efVar == null ? ef.getDefaultInstance() : efVar;
    }

    public ed getVenue3() {
        ed edVar = this.venue3_;
        return edVar == null ? ed.getDefaultInstance() : edVar;
    }

    public boolean hasCause() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOpcode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPointsReceived() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRequest() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVenue() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVenue3() {
        return (this.bitField0_ & 64) != 0;
    }

    public static gm newBuilder(gp gpVar) {
        return (gm) DEFAULT_INSTANCE.createBuilder(gpVar);
    }

    public static gp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gp parseFrom(com.google.v.z zVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gp parseFrom(InputStream inputStream) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gp parseFrom(ByteBuffer byteBuffer) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gp parseFrom(byte[] bArr) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
