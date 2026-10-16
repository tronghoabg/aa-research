package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.en;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gm;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y extends du<y, x> implements fj {
    public static final int CLIENT_IDS_ALLOWED_FIELD_NUMBER = 8;
    private static final y DEFAULT_INSTANCE;
    public static final int IS_EDITORIAL_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 489093789;
    public static final int MODIFICATIONS_ALLOWED_FIELD_NUMBER = 9;
    private static volatile fo<y> PARSER = null;
    public static final int REGIONS_ALLOWED_FIELD_NUMBER = 6;
    public static final int REGIONS_DISALLOWED_FIELD_NUMBER = 7;
    public static final int REQUIRES_ATTRIBUTION_FIELD_NUMBER = 3;
    public static final int REQUIRES_FIRST_PARTY_ONLY_FIELD_NUMBER = 5;
    public static final int REQUIRES_LINKBACK_FIELD_NUMBER = 2;
    public static final int REQUIRES_SHARE_ALIKE_FIELD_NUMBER = 4;
    public static final ds<com.google.w.n.a.b, y> messageSetExtension;
    private int bitField0_;
    private boolean isEditorial_;
    private com.google.w.i.a.c regionsAllowed_;
    private com.google.w.i.a.c regionsDisallowed_;
    private boolean requiresAttribution_;
    private boolean requiresFirstPartyOnly_;
    private boolean requiresLinkback_;
    private boolean requiresShareAlike_;
    private int modificationsAllowedMemoizedSerializedSize = -1;
    private eo<String> clientIdsAllowed_ = emptyProtobufList();
    private en modificationsAllowed_ = emptyLongList();

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        du.registerDefaultInstance(y.class, yVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, y.class);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClientIdsAllowed(Iterable<String> iterable) {
        ensureClientIdsAllowedIsMutable();
        com.google.v.c.addAll(iterable, this.clientIdsAllowed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllModificationsAllowed(Iterable<? extends Long> iterable) {
        ensureModificationsAllowedIsMutable();
        com.google.v.c.addAll(iterable, this.modificationsAllowed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientIdsAllowed(String str) {
        Objects.requireNonNull(str);
        ensureClientIdsAllowedIsMutable();
        this.clientIdsAllowed_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientIdsAllowedBytes(com.google.v.v vVar) {
        ensureClientIdsAllowedIsMutable();
        this.clientIdsAllowed_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addModificationsAllowed(long j2) {
        ensureModificationsAllowedIsMutable();
        this.modificationsAllowed_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientIdsAllowed() {
        this.clientIdsAllowed_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsEditorial() {
        this.bitField0_ &= -2;
        this.isEditorial_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModificationsAllowed() {
        this.modificationsAllowed_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionsAllowed() {
        this.regionsAllowed_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionsDisallowed() {
        this.regionsDisallowed_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiresAttribution() {
        this.bitField0_ &= -5;
        this.requiresAttribution_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiresFirstPartyOnly() {
        this.bitField0_ &= -17;
        this.requiresFirstPartyOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiresLinkback() {
        this.bitField0_ &= -3;
        this.requiresLinkback_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiresShareAlike() {
        this.bitField0_ &= -9;
        this.requiresShareAlike_ = false;
    }

    private void ensureClientIdsAllowedIsMutable() {
        eo<String> eoVar = this.clientIdsAllowed_;
        if (eoVar.c()) {
            return;
        }
        this.clientIdsAllowed_ = du.mutableCopy(eoVar);
    }

    private void ensureModificationsAllowedIsMutable() {
        en enVar = this.modificationsAllowed_;
        if (enVar.c()) {
            return;
        }
        this.modificationsAllowed_ = du.mutableCopy(enVar);
    }

    public static y getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegionsAllowed(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        com.google.w.i.a.c cVar2 = this.regionsAllowed_;
        if (cVar2 != null && cVar2 != com.google.w.i.a.c.getDefaultInstance()) {
            com.google.w.i.a.b bVarNewBuilder = com.google.w.i.a.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.google.w.i.a.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.regionsAllowed_ = cVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegionsDisallowed(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        com.google.w.i.a.c cVar2 = this.regionsDisallowed_;
        if (cVar2 != null && cVar2 != com.google.w.i.a.c.getDefaultInstance()) {
            com.google.w.i.a.b bVarNewBuilder = com.google.w.i.a.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.google.w.i.a.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.regionsDisallowed_ = cVar;
        this.bitField0_ |= 64;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static y parseDelimitedFrom(InputStream inputStream) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(com.google.v.v vVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<y> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientIdsAllowed(int i2, String str) {
        Objects.requireNonNull(str);
        ensureClientIdsAllowedIsMutable();
        this.clientIdsAllowed_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsEditorial(boolean z) {
        this.bitField0_ |= 1;
        this.isEditorial_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModificationsAllowed(int i2, long j2) {
        ensureModificationsAllowedIsMutable();
        this.modificationsAllowed_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionsAllowed(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        this.regionsAllowed_ = cVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionsDisallowed(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        this.regionsDisallowed_ = cVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiresAttribution(boolean z) {
        this.bitField0_ |= 4;
        this.requiresAttribution_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiresFirstPartyOnly(boolean z) {
        this.bitField0_ |= 16;
        this.requiresFirstPartyOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiresLinkback(boolean z) {
        this.bitField0_ |= 2;
        this.requiresLinkback_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiresShareAlike(boolean z) {
        this.bitField0_ |= 8;
        this.requiresShareAlike_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\u001a\t%", new Object[]{"bitField0_", "isEditorial_", "requiresLinkback_", "requiresAttribution_", "requiresShareAlike_", "requiresFirstPartyOnly_", "regionsAllowed_", "regionsDisallowed_", "clientIdsAllowed_", "modificationsAllowed_"});
        }
        if (iOrdinal == 3) {
            return new y();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<y> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (y.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getClientIdsAllowed(int i2) {
        return this.clientIdsAllowed_.get(i2);
    }

    public com.google.v.v getClientIdsAllowedBytes(int i2) {
        return com.google.v.v.s(this.clientIdsAllowed_.get(i2));
    }

    public int getClientIdsAllowedCount() {
        return this.clientIdsAllowed_.size();
    }

    public List<String> getClientIdsAllowedList() {
        return this.clientIdsAllowed_;
    }

    public boolean getIsEditorial() {
        return this.isEditorial_;
    }

    public long getModificationsAllowed(int i2) {
        return this.modificationsAllowed_.a(i2);
    }

    public int getModificationsAllowedCount() {
        return this.modificationsAllowed_.size();
    }

    public List<Long> getModificationsAllowedList() {
        return this.modificationsAllowed_;
    }

    public com.google.w.i.a.c getRegionsAllowed() {
        com.google.w.i.a.c cVar = this.regionsAllowed_;
        return cVar == null ? com.google.w.i.a.c.getDefaultInstance() : cVar;
    }

    public com.google.w.i.a.c getRegionsDisallowed() {
        com.google.w.i.a.c cVar = this.regionsDisallowed_;
        return cVar == null ? com.google.w.i.a.c.getDefaultInstance() : cVar;
    }

    public boolean getRequiresAttribution() {
        return this.requiresAttribution_;
    }

    public boolean getRequiresFirstPartyOnly() {
        return this.requiresFirstPartyOnly_;
    }

    public boolean getRequiresLinkback() {
        return this.requiresLinkback_;
    }

    public boolean getRequiresShareAlike() {
        return this.requiresShareAlike_;
    }

    public boolean hasIsEditorial() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRegionsAllowed() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRegionsDisallowed() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRequiresAttribution() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRequiresFirstPartyOnly() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequiresLinkback() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRequiresShareAlike() {
        return (this.bitField0_ & 8) != 0;
    }

    public static x newBuilder(y yVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(yVar);
    }

    public static y parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(com.google.v.v vVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static y parseFrom(com.google.v.z zVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static y parseFrom(com.google.v.z zVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static y parseFrom(InputStream inputStream) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(InputStream inputStream, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(ByteBuffer byteBuffer) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static y parseFrom(byte[] bArr) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static y parseFrom(byte[] bArr, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
