package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gz extends com.google.v.du<gz, gy> implements com.google.v.fj {
    private static final gz DEFAULT_INSTANCE;
    public static final int MAIN_VENUE_FIELD_NUMBER = 4;
    public static final int MERGED_VENUE_IDS_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<gz> PARSER = null;
    public static final int RETURN_VENUE_FIELD_NUMBER = 6;
    public static final int SESSION_FIELD_NUMBER = 3;
    public static final int USER_INFO_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private ed mainVenue_;
    private boolean returnVenue_;
    private dx userInfo_;
    private long version_;
    private byte memoizedIsInitialized = 2;
    private String session_ = "";
    private com.google.v.eo<fz> mergedVenueIds_ = emptyProtobufList();

    static {
        gz gzVar = new gz();
        DEFAULT_INSTANCE = gzVar;
        com.google.v.du.registerDefaultInstance(gz.class, gzVar);
    }

    private gz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMergedVenueIds(Iterable<? extends fz> iterable) {
        ensureMergedVenueIdsIsMutable();
        com.google.v.c.addAll(iterable, this.mergedVenueIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMergedVenueIds(int i2, fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureMergedVenueIdsIsMutable();
        this.mergedVenueIds_.add(i2, fzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMainVenue() {
        this.mainVenue_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergedVenueIds() {
        this.mergedVenueIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnVenue() {
        this.bitField0_ &= -17;
        this.returnVenue_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.bitField0_ &= -5;
        this.session_ = getDefaultInstance().getSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
    }

    private void ensureMergedVenueIdsIsMutable() {
        com.google.v.eo<fz> eoVar = this.mergedVenueIds_;
        if (eoVar.c()) {
            return;
        }
        this.mergedVenueIds_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMainVenue(ed edVar) {
        Objects.requireNonNull(edVar);
        ed edVar2 = this.mainVenue_;
        if (edVar2 != null && edVar2 != ed.getDefaultInstance()) {
            ec ecVarNewBuilder = ed.newBuilder(edVar2);
            ecVarNewBuilder.mergeFrom((ec) edVar);
            edVar = ecVarNewBuilder.buildPartial();
        }
        this.mainVenue_ = edVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.userInfo_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.userInfo_ = dxVar;
        this.bitField0_ |= 1;
    }

    public static gy newBuilder() {
        return (gy) DEFAULT_INSTANCE.createBuilder();
    }

    public static gz parseDelimitedFrom(InputStream inputStream) {
        return (gz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gz parseFrom(com.google.v.v vVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMergedVenueIds(int i2) {
        ensureMergedVenueIdsIsMutable();
        this.mergedVenueIds_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMainVenue(ed edVar) {
        Objects.requireNonNull(edVar);
        this.mainVenue_ = edVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergedVenueIds(int i2, fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureMergedVenueIdsIsMutable();
        this.mergedVenueIds_.set(i2, fzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnVenue(boolean z) {
        this.bitField0_ |= 16;
        this.returnVenue_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSession(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.session_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionBytes(com.google.v.v vVar) {
        this.session_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.userInfo_ = dxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(long j2) {
        this.bitField0_ |= 2;
        this.version_ = j2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005\u001b\u0006ဇ\u0004", new Object[]{"bitField0_", "userInfo_", "version_", "session_", "mainVenue_", "mergedVenueIds_", fz.class, "returnVenue_"});
            case 3:
                return new gz();
            case 4:
                return new gy(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gz> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gz.class) {
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

    public ed getMainVenue() {
        ed edVar = this.mainVenue_;
        return edVar == null ? ed.getDefaultInstance() : edVar;
    }

    public fz getMergedVenueIds(int i2) {
        return this.mergedVenueIds_.get(i2);
    }

    public int getMergedVenueIdsCount() {
        return this.mergedVenueIds_.size();
    }

    public List<fz> getMergedVenueIdsList() {
        return this.mergedVenueIds_;
    }

    public ga getMergedVenueIdsOrBuilder(int i2) {
        return this.mergedVenueIds_.get(i2);
    }

    public List<? extends ga> getMergedVenueIdsOrBuilderList() {
        return this.mergedVenueIds_;
    }

    public boolean getReturnVenue() {
        return this.returnVenue_;
    }

    public String getSession() {
        return this.session_;
    }

    public com.google.v.v getSessionBytes() {
        return com.google.v.v.s(this.session_);
    }

    public dx getUserInfo() {
        dx dxVar = this.userInfo_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    @Deprecated
    public long getVersion() {
        return this.version_;
    }

    public boolean hasMainVenue() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasReturnVenue() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gy newBuilder(gz gzVar) {
        return (gy) DEFAULT_INSTANCE.createBuilder(gzVar);
    }

    public static gz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gz parseFrom(com.google.v.z zVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMergedVenueIds(fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureMergedVenueIdsIsMutable();
        this.mergedVenueIds_.add(fzVar);
    }

    public static gz parseFrom(InputStream inputStream) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gz parseFrom(ByteBuffer byteBuffer) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gz parseFrom(byte[] bArr) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
