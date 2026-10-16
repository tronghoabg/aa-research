package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pu extends com.google.v.du<pu, pt> implements com.google.v.fj {
    public static final int CODE_FIELD_NUMBER = 3;
    private static final pu DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<pu> PARSER = null;
    public static final int RESPONSE_ID_FIELD_NUMBER = 8;
    public static final int ROUTINGSERVERUNIQUEID_FIELD_NUMBER = 7;
    public static final int TRAFFICCOMMENTWITHARGUMENTS_FIELD_NUMBER = 9;
    public static final int TRAFFICCOMMENT_FIELD_NUMBER = 5;
    public static final int VOICETRAFFICCOMMENTWITHARGUMENTS_FIELD_NUMBER = 10;
    public static final int VOICETRAFFICCOMMENT_FIELD_NUMBER = 6;
    private int bitField0_;
    private long code_;
    private long id_;
    private i.b.ao trafficCommentWithArguments_;
    private i.b.ao voiceTrafficCommentWithArguments_;
    private String description_ = "";
    private String trafficComment_ = "";
    private String voiceTrafficComment_ = "";
    private String routingServerUniqueId_ = "";
    private String responseId_ = "";

    static {
        pu puVar = new pu();
        DEFAULT_INSTANCE = puVar;
        com.google.v.du.registerDefaultInstance(pu.class, puVar);
    }

    private pu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.bitField0_ &= -3;
        this.code_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -5;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseId() {
        this.bitField0_ &= -65;
        this.responseId_ = getDefaultInstance().getResponseId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingServerUniqueId() {
        this.bitField0_ &= -33;
        this.routingServerUniqueId_ = getDefaultInstance().getRoutingServerUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficComment() {
        this.bitField0_ &= -9;
        this.trafficComment_ = getDefaultInstance().getTrafficComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficCommentWithArguments() {
        this.trafficCommentWithArguments_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceTrafficComment() {
        this.bitField0_ &= -17;
        this.voiceTrafficComment_ = getDefaultInstance().getVoiceTrafficComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceTrafficCommentWithArguments() {
        this.voiceTrafficCommentWithArguments_ = null;
        this.bitField0_ &= -257;
    }

    public static pu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        i.b.ao aoVar2 = this.trafficCommentWithArguments_;
        if (aoVar2 != null && aoVar2 != i.b.ao.getDefaultInstance()) {
            i.b.an anVarNewBuilder = i.b.ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((i.b.an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.trafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        i.b.ao aoVar2 = this.voiceTrafficCommentWithArguments_;
        if (aoVar2 != null && aoVar2 != i.b.ao.getDefaultInstance()) {
            i.b.an anVarNewBuilder = i.b.ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((i.b.an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.voiceTrafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= 256;
    }

    public static pt newBuilder() {
        return (pt) DEFAULT_INSTANCE.createBuilder();
    }

    public static pu parseDelimitedFrom(InputStream inputStream) {
        return (pu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pu parseFrom(com.google.v.v vVar) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(long j2) {
        this.bitField0_ |= 2;
        this.code_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.responseId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseIdBytes(com.google.v.v vVar) {
        this.responseId_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingServerUniqueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.routingServerUniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingServerUniqueIdBytes(com.google.v.v vVar) {
        this.routingServerUniqueId_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficComment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.trafficComment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficCommentBytes(com.google.v.v vVar) {
        this.trafficComment_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.trafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceTrafficComment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.voiceTrafficComment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceTrafficCommentBytes(com.google.v.v vVar) {
        this.voiceTrafficComment_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.voiceTrafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= 256;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဉ\u0007\nဉ\b", new Object[]{"bitField0_", "id_", "code_", "description_", "trafficComment_", "voiceTrafficComment_", "routingServerUniqueId_", "responseId_", "trafficCommentWithArguments_", "voiceTrafficCommentWithArguments_"});
        }
        if (iOrdinal == 3) {
            return new pu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCode() {
        return this.code_;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public long getId() {
        return this.id_;
    }

    public String getResponseId() {
        return this.responseId_;
    }

    public com.google.v.v getResponseIdBytes() {
        return com.google.v.v.s(this.responseId_);
    }

    public String getRoutingServerUniqueId() {
        return this.routingServerUniqueId_;
    }

    public com.google.v.v getRoutingServerUniqueIdBytes() {
        return com.google.v.v.s(this.routingServerUniqueId_);
    }

    public String getTrafficComment() {
        return this.trafficComment_;
    }

    public com.google.v.v getTrafficCommentBytes() {
        return com.google.v.v.s(this.trafficComment_);
    }

    public i.b.ao getTrafficCommentWithArguments() {
        i.b.ao aoVar = this.trafficCommentWithArguments_;
        return aoVar == null ? i.b.ao.getDefaultInstance() : aoVar;
    }

    public String getVoiceTrafficComment() {
        return this.voiceTrafficComment_;
    }

    public com.google.v.v getVoiceTrafficCommentBytes() {
        return com.google.v.v.s(this.voiceTrafficComment_);
    }

    public i.b.ao getVoiceTrafficCommentWithArguments() {
        i.b.ao aoVar = this.voiceTrafficCommentWithArguments_;
        return aoVar == null ? i.b.ao.getDefaultInstance() : aoVar;
    }

    public boolean hasCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasResponseId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRoutingServerUniqueId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTrafficComment() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTrafficCommentWithArguments() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVoiceTrafficComment() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVoiceTrafficCommentWithArguments() {
        return (this.bitField0_ & 256) != 0;
    }

    public static pt newBuilder(pu puVar) {
        return (pt) DEFAULT_INSTANCE.createBuilder(puVar);
    }

    public static pu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pu parseFrom(com.google.v.z zVar) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pu parseFrom(InputStream inputStream) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pu parseFrom(ByteBuffer byteBuffer) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pu parseFrom(byte[] bArr) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
