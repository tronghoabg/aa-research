package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class jn extends com.google.v.du<jn, jm> implements com.google.v.fj {
    public static final int CAPABILITIES_FIELD_NUMBER = 9;
    private static final jn DEFAULT_INSTANCE;
    public static final int EVENTS_DISTANCE_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<jn> PARSER = null;
    public static final int PING_STATUS_FIELD_NUMBER = 6;
    public static final int PRIVATE_PING_STATUS_FIELD_NUMBER = 8;
    public static final int SEE_ME_LEVEL_FIELD_NUMBER = 1;
    public static final int SHOW_ALERTS_FIELD_NUMBER = 4;
    public static final int SHOW_NICKNAME_NEXT_TO_MY_REPORTS_FIELD_NUMBER = 2;
    public static final int SHOW_TRAFFIC_FIELD_NUMBER = 5;
    public static final int SHOW_USERS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int capabilities_;
    private int eventsDistance_;
    private int pingStatus_;
    private int privatePingStatus_;
    private int seeMeLevel_;
    private boolean showAlerts_;
    private int showNicknameNextToMyReports_;
    private boolean showTraffic_;
    private boolean showUsers_;

    static {
        jn jnVar = new jn();
        DEFAULT_INSTANCE = jnVar;
        com.google.v.du.registerDefaultInstance(jn.class, jnVar);
    }

    private jn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCapabilities() {
        this.bitField0_ &= -257;
        this.capabilities_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventsDistance() {
        this.bitField0_ &= -65;
        this.eventsDistance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPingStatus() {
        this.bitField0_ &= -33;
        this.pingStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivatePingStatus() {
        this.bitField0_ &= -129;
        this.privatePingStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeeMeLevel() {
        this.bitField0_ &= -2;
        this.seeMeLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowAlerts() {
        this.bitField0_ &= -9;
        this.showAlerts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowNicknameNextToMyReports() {
        this.bitField0_ &= -3;
        this.showNicknameNextToMyReports_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTraffic() {
        this.bitField0_ &= -17;
        this.showTraffic_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowUsers() {
        this.bitField0_ &= -5;
        this.showUsers_ = false;
    }

    public static jn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jm newBuilder() {
        return (jm) DEFAULT_INSTANCE.createBuilder();
    }

    public static jn parseDelimitedFrom(InputStream inputStream) {
        return (jn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jn parseFrom(com.google.v.v vVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCapabilities(int i2) {
        this.bitField0_ |= 256;
        this.capabilities_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventsDistance(int i2) {
        this.bitField0_ |= 64;
        this.eventsDistance_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPingStatus(jl jlVar) {
        this.pingStatus_ = jlVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivatePingStatus(jl jlVar) {
        this.privatePingStatus_ = jlVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeeMeLevel(int i2) {
        this.bitField0_ |= 1;
        this.seeMeLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowAlerts(boolean z) {
        this.bitField0_ |= 8;
        this.showAlerts_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowNicknameNextToMyReports(int i2) {
        this.bitField0_ |= 2;
        this.showNicknameNextToMyReports_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTraffic(boolean z) {
        this.bitField0_ |= 16;
        this.showTraffic_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowUsers(boolean z) {
        this.bitField0_ |= 4;
        this.showUsers_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            com.google.v.ei eiVar = hf.f48743g;
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007င\u0006\b᠌\u0007\tင\b", new Object[]{"bitField0_", "seeMeLevel_", "showNicknameNextToMyReports_", "showUsers_", "showAlerts_", "showTraffic_", "pingStatus_", eiVar, "eventsDistance_", "privatePingStatus_", eiVar, "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new jn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCapabilities() {
        return this.capabilities_;
    }

    public int getEventsDistance() {
        return this.eventsDistance_;
    }

    public jl getPingStatus() {
        jl jlVarA = jl.a(this.pingStatus_);
        return jlVarA == null ? jl.PING_UNSUPPORTED : jlVarA;
    }

    public jl getPrivatePingStatus() {
        jl jlVarA = jl.a(this.privatePingStatus_);
        return jlVarA == null ? jl.PING_UNSUPPORTED : jlVarA;
    }

    public int getSeeMeLevel() {
        return this.seeMeLevel_;
    }

    public boolean getShowAlerts() {
        return this.showAlerts_;
    }

    public int getShowNicknameNextToMyReports() {
        return this.showNicknameNextToMyReports_;
    }

    public boolean getShowTraffic() {
        return this.showTraffic_;
    }

    public boolean getShowUsers() {
        return this.showUsers_;
    }

    public boolean hasCapabilities() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasEventsDistance() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPingStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPrivatePingStatus() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSeeMeLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShowAlerts() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasShowNicknameNextToMyReports() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasShowTraffic() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasShowUsers() {
        return (this.bitField0_ & 4) != 0;
    }

    public static jm newBuilder(jn jnVar) {
        return (jm) DEFAULT_INSTANCE.createBuilder(jnVar);
    }

    public static jn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jn parseFrom(com.google.v.z zVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jn parseFrom(InputStream inputStream) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jn parseFrom(ByteBuffer byteBuffer) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jn parseFrom(byte[] bArr) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
