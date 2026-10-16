package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ke extends com.google.v.du<ke, kd> implements com.google.v.fj {
    public static final int COMMUNITY_FIELD_NUMBER = 1;
    private static final ke DEFAULT_INSTANCE;
    public static final int MEANINGFUL_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ke> PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 3;
    public static final int USER_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private String community_ = "";
    private boolean meaningful_ = true;
    private jc profile_;
    private long userId_;

    static {
        ke keVar = new ke();
        DEFAULT_INSTANCE = keVar;
        com.google.v.du.registerDefaultInstance(ke.class, keVar);
    }

    private ke() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -2;
        this.community_ = getDefaultInstance().getCommunity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeaningful() {
        this.bitField0_ &= -3;
        this.meaningful_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfile() {
        this.profile_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -9;
        this.userId_ = 0L;
    }

    public static ke getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProfile(jc jcVar) {
        Objects.requireNonNull(jcVar);
        jc jcVar2 = this.profile_;
        if (jcVar2 != null && jcVar2 != jc.getDefaultInstance()) {
            jb jbVarNewBuilder = jc.newBuilder(jcVar2);
            jbVarNewBuilder.mergeFrom((jb) jcVar);
            jcVar = jbVarNewBuilder.buildPartial();
        }
        this.profile_ = jcVar;
        this.bitField0_ |= 4;
    }

    public static kd newBuilder() {
        return (kd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ke parseDelimitedFrom(InputStream inputStream) {
        return (ke) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ke parseFrom(com.google.v.v vVar) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ke> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.community_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityBytes(com.google.v.v vVar) {
        this.community_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeaningful(boolean z) {
        this.bitField0_ |= 2;
        this.meaningful_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfile(jc jcVar) {
        Objects.requireNonNull(jcVar);
        this.profile_ = jcVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 8;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "community_", "meaningful_", "profile_", "userId_"});
        }
        if (iOrdinal == 3) {
            return new ke();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ke> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ke.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCommunity() {
        return this.community_;
    }

    public com.google.v.v getCommunityBytes() {
        return com.google.v.v.s(this.community_);
    }

    public boolean getMeaningful() {
        return this.meaningful_;
    }

    public jc getProfile() {
        jc jcVar = this.profile_;
        return jcVar == null ? jc.getDefaultInstance() : jcVar;
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMeaningful() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProfile() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static kd newBuilder(ke keVar) {
        return (kd) DEFAULT_INSTANCE.createBuilder(keVar);
    }

    public static ke parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ke) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ke parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ke parseFrom(com.google.v.z zVar) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ke parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ke parseFrom(InputStream inputStream) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ke parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ke parseFrom(ByteBuffer byteBuffer) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ke parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ke parseFrom(byte[] bArr) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ke parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ke) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
