package i.b.p;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aj extends du<aj, ai> implements fj {
    public static final int ALLOCCURRENCES_FIELD_NUMBER = 6;
    public static final int BYLOCATION_FIELD_NUMBER = 5;
    public static final int BYNAME_FIELD_NUMBER = 4;
    public static final int COMMUNITY_FIELD_NUMBER = 2;
    private static final aj DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 3;
    private static volatile fo<aj> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private boolean allOccurrences_;
    private int bitField0_;
    private boolean byLocation_;
    private boolean byName_;
    private String community_ = "";
    private String eventId_ = "";
    private long userId_;

    static {
        aj ajVar = new aj();
        DEFAULT_INSTANCE = ajVar;
        du.registerDefaultInstance(aj.class, ajVar);
    }

    private aj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllOccurrences() {
        this.bitField0_ &= -33;
        this.allOccurrences_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearByLocation() {
        this.bitField0_ &= -17;
        this.byLocation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearByName() {
        this.bitField0_ &= -9;
        this.byName_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.bitField0_ &= -3;
        this.community_ = getDefaultInstance().getCommunity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.bitField0_ &= -5;
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.bitField0_ &= -2;
        this.userId_ = 0L;
    }

    public static aj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ai newBuilder() {
        return (ai) DEFAULT_INSTANCE.createBuilder();
    }

    public static aj parseDelimitedFrom(InputStream inputStream) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(com.google.v.v vVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllOccurrences(boolean z) {
        this.bitField0_ |= 32;
        this.allOccurrences_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setByLocation(boolean z) {
        this.bitField0_ |= 16;
        this.byLocation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setByName(boolean z) {
        this.bitField0_ |= 8;
        this.byName_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.community_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunityBytes(com.google.v.v vVar) {
        this.community_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(com.google.v.v vVar) {
        this.eventId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(long j2) {
        this.bitField0_ |= 1;
        this.userId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "userId_", "community_", "eventId_", "byName_", "byLocation_", "allOccurrences_"});
        }
        if (iOrdinal == 3) {
            return new aj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ai(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<aj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAllOccurrences() {
        return this.allOccurrences_;
    }

    public boolean getByLocation() {
        return this.byLocation_;
    }

    public boolean getByName() {
        return this.byName_;
    }

    public String getCommunity() {
        return this.community_;
    }

    public com.google.v.v getCommunityBytes() {
        return com.google.v.v.s(this.community_);
    }

    public String getEventId() {
        return this.eventId_;
    }

    public com.google.v.v getEventIdBytes() {
        return com.google.v.v.s(this.eventId_);
    }

    public long getUserId() {
        return this.userId_;
    }

    public boolean hasAllOccurrences() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasByLocation() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasByName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCommunity() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEventId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ai newBuilder(aj ajVar) {
        return (ai) DEFAULT_INSTANCE.createBuilder(ajVar);
    }

    public static aj parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(com.google.v.v vVar, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aj parseFrom(com.google.v.z zVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aj parseFrom(com.google.v.z zVar, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aj parseFrom(InputStream inputStream) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(InputStream inputStream, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(ByteBuffer byteBuffer) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aj parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aj parseFrom(byte[] bArr) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aj parseFrom(byte[] bArr, de deVar) {
        return (aj) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
