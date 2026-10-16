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
public final class l extends du<l, k> implements fj {
    public static final int AUTOCOMPLETEDETAILS_FIELD_NUMBER = 7;
    private static final l DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<l> PARSER = null;
    public static final int RETURN_ALL_DATA_FIELD_NUMBER = 6;
    public static final int TRACE_FORMAT_FIELD_NUMBER = 8;
    public static final int TRACE_LEVEL_FIELD_NUMBER = 9;
    public static final int USER_INFO_FIELD_NUMBER = 2;
    public static final int VENUE_CONTEXT_FIELD_NUMBER = 5;
    public static final int VENUE_ID_FIELD_NUMBER = 3;
    public static final int VENUE_REFERENCE_FIELD_NUMBER = 4;
    private c autocompleteDetails_;
    private int bitField0_;
    private boolean returnAllData_;
    private int traceFormat_;
    private int traceLevel_;
    private ai userInfo_;
    private String id_ = "";
    private String venueId_ = "";
    private String venueReference_ = "";
    private String venueContext_ = "";

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutocompleteDetails() {
        this.autocompleteDetails_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnAllData() {
        this.bitField0_ &= -33;
        this.returnAllData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceFormat() {
        this.bitField0_ &= -129;
        this.traceFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceLevel() {
        this.bitField0_ &= -257;
        this.traceLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueContext() {
        this.bitField0_ &= -17;
        this.venueContext_ = getDefaultInstance().getVenueContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField0_ &= -5;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueReference() {
        this.bitField0_ &= -9;
        this.venueReference_ = getDefaultInstance().getVenueReference();
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAutocompleteDetails(c cVar) {
        Objects.requireNonNull(cVar);
        c cVar2 = this.autocompleteDetails_;
        if (cVar2 != null && cVar2 != c.getDefaultInstance()) {
            a aVarNewBuilder = c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.autocompleteDetails_ = cVar;
        this.bitField0_ |= 64;
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
        this.bitField0_ |= 2;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteDetails(c cVar) {
        Objects.requireNonNull(cVar);
        this.autocompleteDetails_ = cVar;
        this.bitField0_ |= 64;
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
    public void setReturnAllData(boolean z) {
        this.bitField0_ |= 32;
        this.returnAllData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceFormat(n nVar) {
        this.traceFormat_ = nVar.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceLevel(int i2) {
        this.bitField0_ |= 256;
        this.traceLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.userInfo_ = aiVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.venueContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContextBytes(com.google.v.v vVar) {
        this.venueContext_ = vVar.u();
        this.bitField0_ |= 16;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueReference(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.venueReference_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueReferenceBytes(com.google.v.v vVar) {
        this.venueReference_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဉ\u0006\b᠌\u0007\tင\b", new Object[]{"bitField0_", "id_", "userInfo_", "venueId_", "venueReference_", "venueContext_", "returnAllData_", "autocompleteDetails_", "traceFormat_", m.f49152a, "traceLevel_"});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getAutocompleteDetails() {
        c cVar = this.autocompleteDetails_;
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public boolean getReturnAllData() {
        return this.returnAllData_;
    }

    public n getTraceFormat() {
        n nVarA = n.a(this.traceFormat_);
        return nVarA == null ? n.DISABLED : nVarA;
    }

    public int getTraceLevel() {
        return this.traceLevel_;
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

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public String getVenueReference() {
        return this.venueReference_;
    }

    public com.google.v.v getVenueReferenceBytes() {
        return com.google.v.v.s(this.venueReference_);
    }

    public boolean hasAutocompleteDetails() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReturnAllData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTraceFormat() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasTraceLevel() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVenueContext() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVenueReference() {
        return (this.bitField0_ & 8) != 0;
    }

    public static k newBuilder(l lVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(com.google.v.z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(com.google.v.z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
