package i.b.n;

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
public final class p extends du<p, o> implements fj {
    private static final p DEFAULT_INSTANCE;
    public static final int GET_POPULAR_FIELD_NUMBER = 8;
    public static final int LOCATION_FIELD_NUMBER = 3;
    public static final int MAX_RESULTS_FIELD_NUMBER = 5;
    private static volatile fo<p> PARSER = null;
    public static final int RADIUS_METERS_FIELD_NUMBER = 6;
    public static final int USER_INFO_FIELD_NUMBER = 2;
    public static final int VENUE_CONTEXT_FIELD_NUMBER = 7;
    public static final int VENUE_FILTER_ATTRIBUTES_FIELD_NUMBER = 9;
    public static final int VENUE_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean getPopular_;
    private i.b.s location_;
    private int maxResults_;
    private int radiusMeters_;
    private ai userInfo_;
    private ag venueFilterAttributes_;
    private String venueId_ = "";
    private String venueContext_ = "";

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetPopular() {
        this.bitField0_ &= -65;
        this.getPopular_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxResults() {
        this.bitField0_ &= -9;
        this.maxResults_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadiusMeters() {
        this.bitField0_ &= -17;
        this.radiusMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueContext() {
        this.bitField0_ &= -33;
        this.venueContext_ = getDefaultInstance().getVenueContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueFilterAttributes() {
        this.venueFilterAttributes_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -5;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(ai aiVar) {
        Objects.requireNonNull(aiVar);
        ai aiVar2 = this.userInfo_;
        if (aiVar2 != null && aiVar2 != ai.getDefaultInstance()) {
            ah ahVarNewBuilder = ai.newBuilder(aiVar2);
            ahVarNewBuilder.mergeFrom((ah) aiVar);
            aiVar = ahVarNewBuilder.buildPartial();
        }
        this.userInfo_ = aiVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueFilterAttributes(ag agVar) {
        Objects.requireNonNull(agVar);
        ag agVar2 = this.venueFilterAttributes_;
        if (agVar2 != null && agVar2 != ag.getDefaultInstance()) {
            af afVarNewBuilder = ag.newBuilder(agVar2);
            afVarNewBuilder.mergeFrom((af) agVar);
            agVar = afVarNewBuilder.buildPartial();
        }
        this.venueFilterAttributes_ = agVar;
        this.bitField0_ |= 128;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetPopular(boolean z) {
        this.bitField0_ |= 64;
        this.getPopular_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.location_ = sVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxResults(int i2) {
        this.bitField0_ |= 8;
        this.maxResults_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadiusMeters(int i2) {
        this.bitField0_ |= 16;
        this.radiusMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.userInfo_ = aiVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.venueContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContextBytes(com.google.v.v vVar) {
        this.venueContext_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueFilterAttributes(ag agVar) {
        Objects.requireNonNull(agVar);
        this.venueFilterAttributes_ = agVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005င\u0003\u0006င\u0004\u0007ဈ\u0005\bဇ\u0006\tဉ\u0007", new Object[]{"bitField0_", "userInfo_", "location_", "venueId_", "maxResults_", "radiusMeters_", "venueContext_", "getPopular_", "venueFilterAttributes_"});
        }
        if (iOrdinal == 3) {
            return new p();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new o(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<p> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (p.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getGetPopular() {
        return this.getPopular_;
    }

    public i.b.s getLocation() {
        i.b.s sVar = this.location_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public int getMaxResults() {
        return this.maxResults_;
    }

    public int getRadiusMeters() {
        return this.radiusMeters_;
    }

    public ai getUserInfo() {
        ai aiVar = this.userInfo_;
        return aiVar == null ? ai.getDefaultInstance() : aiVar;
    }

    public String getVenueContext() {
        return this.venueContext_;
    }

    public com.google.v.v getVenueContextBytes() {
        return com.google.v.v.s(this.venueContext_);
    }

    public ag getVenueFilterAttributes() {
        ag agVar = this.venueFilterAttributes_;
        return agVar == null ? ag.getDefaultInstance() : agVar;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasGetPopular() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMaxResults() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRadiusMeters() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVenueContext() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVenueFilterAttributes() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static o newBuilder(p pVar) {
        return (o) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(com.google.v.z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(com.google.v.z zVar, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
