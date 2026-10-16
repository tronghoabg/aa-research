package i.b.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import i.b.al;
import i.b.am;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ai extends du<ai, ah> implements fj {
    public static final int CONFIG_FIELD_NUMBER = 7;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 10;
    private static final ai DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile fo<ai> PARSER = null;
    public static final int ROUTE_POINT_FIELD_NUMBER = 9;
    public static final int SESSION_FIELD_NUMBER = 2;
    public static final int SESSION_UUID_FIELD_NUMBER = 11;
    public static final int SOCIAL_TOKENS_FIELD_NUMBER = 8;
    public static final int USERNAME_FIELD_NUMBER = 3;
    public static final int VIEW_FIELD_NUMBER = 5;
    private int bitField0_;
    private am config_;
    private long id_;
    private i.b.s location_;
    private am socialTokens_;
    private String session_ = "";
    private String username_ = "";
    private eo<i.b.s> view_ = emptyProtobufList();
    private eo<i.b.s> routePoint_ = emptyProtobufList();
    private String countryCode_ = "";
    private String sessionUuid_ = "";

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoutePoint(Iterable<? extends i.b.s> iterable) {
        ensureRoutePointIsMutable();
        com.google.v.c.addAll(iterable, this.routePoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllView(Iterable<? extends i.b.s> iterable) {
        ensureViewIsMutable();
        com.google.v.c.addAll(iterable, this.view_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutePoint(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureRoutePointIsMutable();
        this.routePoint_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addView(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureViewIsMutable();
        this.view_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.config_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryCode() {
        this.bitField0_ &= -65;
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutePoint() {
        this.routePoint_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.bitField0_ &= -3;
        this.session_ = getDefaultInstance().getSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionUuid() {
        this.bitField0_ &= -129;
        this.sessionUuid_ = getDefaultInstance().getSessionUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSocialTokens() {
        this.socialTokens_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsername() {
        this.bitField0_ &= -5;
        this.username_ = getDefaultInstance().getUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearView() {
        this.view_ = emptyProtobufList();
    }

    private void ensureRoutePointIsMutable() {
        eo<i.b.s> eoVar = this.routePoint_;
        if (eoVar.c()) {
            return;
        }
        this.routePoint_ = du.mutableCopy(eoVar);
    }

    private void ensureViewIsMutable() {
        eo<i.b.s> eoVar = this.view_;
        if (eoVar.c()) {
            return;
        }
        this.view_ = du.mutableCopy(eoVar);
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfig(am amVar) {
        Objects.requireNonNull(amVar);
        am amVar2 = this.config_;
        if (amVar2 != null && amVar2 != am.getDefaultInstance()) {
            al alVarNewBuilder = am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.config_ = amVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.location_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.location_ = sVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSocialTokens(am amVar) {
        Objects.requireNonNull(amVar);
        am amVar2 = this.socialTokens_;
        if (amVar2 != null && amVar2 != am.getDefaultInstance()) {
            al alVarNewBuilder = am.newBuilder(amVar2);
            alVarNewBuilder.mergeFrom((al) amVar);
            amVar = alVarNewBuilder.buildPartial();
        }
        this.socialTokens_ = amVar;
        this.bitField0_ |= 32;
    }

    public static ah newBuilder() {
        return (ah) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoutePoint(int i2) {
        ensureRoutePointIsMutable();
        this.routePoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeView(int i2) {
        ensureViewIsMutable();
        this.view_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfig(am amVar) {
        Objects.requireNonNull(amVar);
        this.config_ = amVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.countryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCodeBytes(com.google.v.v vVar) {
        this.countryCode_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.location_ = sVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutePoint(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureRoutePointIsMutable();
        this.routePoint_.set(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSession(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.session_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionBytes(com.google.v.v vVar) {
        this.session_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.sessionUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionUuidBytes(com.google.v.v vVar) {
        this.sessionUuid_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSocialTokens(am amVar) {
        Objects.requireNonNull(amVar);
        this.socialTokens_ = amVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsername(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.username_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsernameBytes(com.google.v.v vVar) {
        this.username_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setView(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureViewIsMutable();
        this.view_.set(i2, sVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001b\u0007ဉ\u0004\bဉ\u0005\t\u001b\nဈ\u0006\u000bဈ\u0007", new Object[]{"bitField0_", "id_", "session_", "username_", "location_", "view_", i.b.s.class, "config_", "socialTokens_", "routePoint_", i.b.s.class, "countryCode_", "sessionUuid_"});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public am getConfig() {
        am amVar = this.config_;
        return amVar == null ? am.getDefaultInstance() : amVar;
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public com.google.v.v getCountryCodeBytes() {
        return com.google.v.v.s(this.countryCode_);
    }

    public long getId() {
        return this.id_;
    }

    public i.b.s getLocation() {
        i.b.s sVar = this.location_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public i.b.s getRoutePoint(int i2) {
        return this.routePoint_.get(i2);
    }

    public int getRoutePointCount() {
        return this.routePoint_.size();
    }

    public List<i.b.s> getRoutePointList() {
        return this.routePoint_;
    }

    public i.b.t getRoutePointOrBuilder(int i2) {
        return this.routePoint_.get(i2);
    }

    public List<? extends i.b.t> getRoutePointOrBuilderList() {
        return this.routePoint_;
    }

    public String getSession() {
        return this.session_;
    }

    public com.google.v.v getSessionBytes() {
        return com.google.v.v.s(this.session_);
    }

    public String getSessionUuid() {
        return this.sessionUuid_;
    }

    public com.google.v.v getSessionUuidBytes() {
        return com.google.v.v.s(this.sessionUuid_);
    }

    @Deprecated
    public am getSocialTokens() {
        am amVar = this.socialTokens_;
        return amVar == null ? am.getDefaultInstance() : amVar;
    }

    public String getUsername() {
        return this.username_;
    }

    public com.google.v.v getUsernameBytes() {
        return com.google.v.v.s(this.username_);
    }

    @Deprecated
    public i.b.s getView(int i2) {
        return this.view_.get(i2);
    }

    @Deprecated
    public int getViewCount() {
        return this.view_.size();
    }

    @Deprecated
    public List<i.b.s> getViewList() {
        return this.view_;
    }

    @Deprecated
    public i.b.t getViewOrBuilder(int i2) {
        return this.view_.get(i2);
    }

    @Deprecated
    public List<? extends i.b.t> getViewOrBuilderList() {
        return this.view_;
    }

    public boolean hasConfig() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionUuid() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasSocialTokens() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUsername() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ah newBuilder(ai aiVar) {
        return (ah) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutePoint(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureRoutePointIsMutable();
        this.routePoint_.add(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addView(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureViewIsMutable();
        this.view_.add(sVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
