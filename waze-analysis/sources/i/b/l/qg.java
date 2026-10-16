package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qg extends com.google.v.du<qg, qf> implements com.google.v.fj {
    public static final int ACCEPTBYDEFAULT_FIELD_NUMBER = 10;
    private static final qg DEFAULT_INSTANCE;
    public static final int DETOURID_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSILENT_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<qg> PARSER = null;
    public static final int PROMPTTOCONFIRM_FIELD_NUMBER = 11;
    public static final int REROUTEEXPLANATION_FIELD_NUMBER = 8;
    public static final int REROUTEROUTINGRESULT_FIELD_NUMBER = 7;
    public static final int REROUTESEGMENT_FIELD_NUMBER = 2;
    public static final int SECONDSAFTER_FIELD_NUMBER = 4;
    public static final int SECONDSBEFORE_FIELD_NUMBER = 3;
    public static final int TRAFFICCOMMENTWITHARGUMENTS_FIELD_NUMBER = 12;
    public static final int TRAFFICCOMMENT_FIELD_NUMBER = 5;
    private boolean acceptByDefault_;
    private int bitField0_;
    private long detourId_;
    private int id_;
    private boolean isSilent_;
    private boolean promptToConfirm_;
    private pe rerouteExplanation_;
    private sl rerouteRoutingResult_;
    private int rerouteSegment_;
    private int secondsAfter_;
    private int secondsBefore_;
    private i.b.ao trafficCommentWithArguments_;
    private byte memoizedIsInitialized = 2;
    private String trafficComment_ = "";

    static {
        qg qgVar = new qg();
        DEFAULT_INSTANCE = qgVar;
        com.google.v.du.registerDefaultInstance(qg.class, qgVar);
    }

    private qg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcceptByDefault() {
        this.bitField0_ &= -513;
        this.acceptByDefault_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourId() {
        this.bitField0_ &= -33;
        this.detourId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSilent() {
        this.bitField0_ &= -257;
        this.isSilent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptToConfirm() {
        this.bitField0_ &= -1025;
        this.promptToConfirm_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteExplanation() {
        this.rerouteExplanation_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteRoutingResult() {
        this.rerouteRoutingResult_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteSegment() {
        this.bitField0_ &= -3;
        this.rerouteSegment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsAfter() {
        this.bitField0_ &= -9;
        this.secondsAfter_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsBefore() {
        this.bitField0_ &= -5;
        this.secondsBefore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficComment() {
        this.bitField0_ &= -17;
        this.trafficComment_ = getDefaultInstance().getTrafficComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficCommentWithArguments() {
        this.trafficCommentWithArguments_ = null;
        this.bitField0_ &= -2049;
    }

    public static qg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteExplanation(pe peVar) {
        Objects.requireNonNull(peVar);
        pe peVar2 = this.rerouteExplanation_;
        if (peVar2 != null && peVar2 != pe.getDefaultInstance()) {
            pd pdVarNewBuilder = pe.newBuilder(peVar2);
            pdVarNewBuilder.mergeFrom((pd) peVar);
            peVar = pdVarNewBuilder.buildPartial();
        }
        this.rerouteExplanation_ = peVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRerouteRoutingResult(sl slVar) {
        Objects.requireNonNull(slVar);
        sl slVar2 = this.rerouteRoutingResult_;
        if (slVar2 != null && slVar2 != sl.getDefaultInstance()) {
            sk skVarNewBuilder = sl.newBuilder(slVar2);
            skVarNewBuilder.mergeFrom((sk) slVar);
            slVar = skVarNewBuilder.buildPartial();
        }
        this.rerouteRoutingResult_ = slVar;
        this.bitField0_ |= 64;
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
        this.bitField0_ |= 2048;
    }

    public static qf newBuilder() {
        return (qf) DEFAULT_INSTANCE.createBuilder();
    }

    public static qg parseDelimitedFrom(InputStream inputStream) {
        return (qg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qg parseFrom(com.google.v.v vVar) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcceptByDefault(boolean z) {
        this.bitField0_ |= 512;
        this.acceptByDefault_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourId(long j2) {
        this.bitField0_ |= 32;
        this.detourId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.bitField0_ |= 1;
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSilent(boolean z) {
        this.bitField0_ |= 256;
        this.isSilent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptToConfirm(boolean z) {
        this.bitField0_ |= 1024;
        this.promptToConfirm_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteExplanation(pe peVar) {
        Objects.requireNonNull(peVar);
        this.rerouteExplanation_ = peVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteRoutingResult(sl slVar) {
        Objects.requireNonNull(slVar);
        this.rerouteRoutingResult_ = slVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteSegment(int i2) {
        this.bitField0_ |= 2;
        this.rerouteSegment_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsAfter(int i2) {
        this.bitField0_ |= 8;
        this.secondsAfter_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsBefore(int i2) {
        this.bitField0_ |= 4;
        this.secondsBefore_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficComment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.trafficComment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficCommentBytes(com.google.v.v vVar) {
        this.trafficComment_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.trafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= 2048;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ᐉ\u0006\bဉ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဉ\u000b", new Object[]{"bitField0_", "id_", "rerouteSegment_", "secondsBefore_", "secondsAfter_", "trafficComment_", "detourId_", "rerouteRoutingResult_", "rerouteExplanation_", "isSilent_", "acceptByDefault_", "promptToConfirm_", "trafficCommentWithArguments_"});
            case 3:
                return new qg();
            case 4:
                return new qf(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<qg> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (qg.class) {
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

    public boolean getAcceptByDefault() {
        return this.acceptByDefault_;
    }

    @Deprecated
    public long getDetourId() {
        return this.detourId_;
    }

    public int getId() {
        return this.id_;
    }

    public boolean getIsSilent() {
        return this.isSilent_;
    }

    public boolean getPromptToConfirm() {
        return this.promptToConfirm_;
    }

    public pe getRerouteExplanation() {
        pe peVar = this.rerouteExplanation_;
        return peVar == null ? pe.getDefaultInstance() : peVar;
    }

    public sl getRerouteRoutingResult() {
        sl slVar = this.rerouteRoutingResult_;
        return slVar == null ? sl.getDefaultInstance() : slVar;
    }

    public int getRerouteSegment() {
        return this.rerouteSegment_;
    }

    public int getSecondsAfter() {
        return this.secondsAfter_;
    }

    public int getSecondsBefore() {
        return this.secondsBefore_;
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

    public boolean hasAcceptByDefault() {
        return (this.bitField0_ & 512) != 0;
    }

    @Deprecated
    public boolean hasDetourId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsSilent() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasPromptToConfirm() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasRerouteExplanation() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRerouteRoutingResult() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRerouteSegment() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSecondsAfter() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSecondsBefore() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTrafficComment() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTrafficCommentWithArguments() {
        return (this.bitField0_ & 2048) != 0;
    }

    public static qf newBuilder(qg qgVar) {
        return (qf) DEFAULT_INSTANCE.createBuilder(qgVar);
    }

    public static qg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qg parseFrom(com.google.v.z zVar) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qg parseFrom(InputStream inputStream) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qg parseFrom(ByteBuffer byteBuffer) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qg parseFrom(byte[] bArr) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
