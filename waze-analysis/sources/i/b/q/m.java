package i.b.q;

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
public final class m extends du<m, l> implements fj {
    public static final int ADDITIONALINFO_FIELD_NUMBER = 4;
    private static final m DEFAULT_INSTANCE;
    public static final int DRIVEPLAN_FIELD_NUMBER = 2;
    private static volatile fo<m> PARSER = null;
    public static final int ROUTEINFO_FIELD_NUMBER = 3;
    public static final int SUGGESTIONID_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 1;
    private c additionalInfo_;
    private int bitField0_;
    private k drivePlan_;
    private ai routeInfo_;
    private String suggestionId_ = "";
    private int type_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalInfo() {
        this.additionalInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrivePlan() {
        this.drivePlan_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteInfo() {
        this.routeInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionId() {
        this.bitField0_ &= -9;
        this.suggestionId_ = getDefaultInstance().getSuggestionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -17;
        this.type_ = 0;
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdditionalInfo(c cVar) {
        Objects.requireNonNull(cVar);
        c cVar2 = this.additionalInfo_;
        if (cVar2 != null && cVar2 != c.getDefaultInstance()) {
            a aVarNewBuilder = c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.additionalInfo_ = cVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDrivePlan(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.drivePlan_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder(kVar2);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.drivePlan_ = kVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteInfo(ai aiVar) {
        Objects.requireNonNull(aiVar);
        ai aiVar2 = this.routeInfo_;
        if (aiVar2 != null && aiVar2 != ai.getDefaultInstance()) {
            ah ahVarNewBuilder = ai.newBuilder(aiVar2);
            ahVarNewBuilder.mergeFrom((ah) aiVar);
            aiVar = ahVarNewBuilder.buildPartial();
        }
        this.routeInfo_ = aiVar;
        this.bitField0_ |= 2;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(com.google.v.v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalInfo(c cVar) {
        Objects.requireNonNull(cVar);
        this.additionalInfo_ = cVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrivePlan(k kVar) {
        Objects.requireNonNull(kVar);
        this.drivePlan_ = kVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteInfo(ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.routeInfo_ = aiVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.suggestionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionIdBytes(com.google.v.v vVar) {
        this.suggestionId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(q qVar) {
        this.type_ = qVar.getNumber();
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "type_", ac.f49232b, "drivePlan_", "routeInfo_", "additionalInfo_", "suggestionId_"});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getAdditionalInfo() {
        c cVar = this.additionalInfo_;
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    public k getDrivePlan() {
        k kVar = this.drivePlan_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public ai getRouteInfo() {
        ai aiVar = this.routeInfo_;
        return aiVar == null ? ai.getDefaultInstance() : aiVar;
    }

    public String getSuggestionId() {
        return this.suggestionId_;
    }

    public com.google.v.v getSuggestionIdBytes() {
        return com.google.v.v.s(this.suggestionId_);
    }

    @Deprecated
    public q getType() {
        q qVarA = q.a(this.type_);
        return qVarA == null ? q.UNKNOWN : qVarA;
    }

    public boolean hasAdditionalInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDrivePlan() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRouteInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSuggestionId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasType() {
        return (this.bitField0_ & 16) != 0;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(com.google.v.v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(com.google.v.z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(com.google.v.z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
