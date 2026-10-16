package com.waze.ak;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah extends du<ah, ag> implements ai {
    public static final int CLIENT_ANNOUNCEMENTS_FIELD_NUMBER = 3;
    private static final ah DEFAULT_INSTANCE;
    public static final int INSTRUCTION_ANNOUNCEMENT_DATA_FIELD_NUMBER = 2;
    private static volatile fo<ah> PARSER = null;
    public static final int ROUTE_SEGMENT_INDEX_FIELD_NUMBER = 1;
    private int bitField0_;
    private long routeSegmentIndex_;
    private com.google.v.v instructionAnnouncementData_ = com.google.v.v.f13054a;
    private eo<c> clientAnnouncements_ = emptyProtobufList();

    static {
        ah ahVar = new ah();
        DEFAULT_INSTANCE = ahVar;
        du.registerDefaultInstance(ah.class, ahVar);
    }

    private ah() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClientAnnouncements(Iterable<? extends c> iterable) {
        ensureClientAnnouncementsIsMutable();
        com.google.v.c.addAll(iterable, this.clientAnnouncements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientAnnouncements(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureClientAnnouncementsIsMutable();
        this.clientAnnouncements_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAnnouncements() {
        this.clientAnnouncements_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstructionAnnouncementData() {
        this.bitField0_ &= -3;
        this.instructionAnnouncementData_ = getDefaultInstance().getInstructionAnnouncementData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteSegmentIndex() {
        this.bitField0_ &= -2;
        this.routeSegmentIndex_ = 0L;
    }

    private void ensureClientAnnouncementsIsMutable() {
        eo<c> eoVar = this.clientAnnouncements_;
        if (eoVar.c()) {
            return;
        }
        this.clientAnnouncements_ = du.mutableCopy(eoVar);
    }

    public static ah getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ag newBuilder() {
        return (ag) DEFAULT_INSTANCE.createBuilder();
    }

    public static ah parseDelimitedFrom(InputStream inputStream) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(com.google.v.v vVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ah> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeClientAnnouncements(int i2) {
        ensureClientAnnouncementsIsMutable();
        this.clientAnnouncements_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAnnouncements(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureClientAnnouncementsIsMutable();
        this.clientAnnouncements_.set(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstructionAnnouncementData(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.instructionAnnouncementData_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteSegmentIndex(long j2) {
        this.bitField0_ |= 1;
        this.routeSegmentIndex_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003\u001b", new Object[]{"bitField0_", "routeSegmentIndex_", "instructionAnnouncementData_", "clientAnnouncements_", c.class});
        }
        if (iOrdinal == 3) {
            return new ah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ag(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ah> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ah.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getClientAnnouncements(int i2) {
        return this.clientAnnouncements_.get(i2);
    }

    public int getClientAnnouncementsCount() {
        return this.clientAnnouncements_.size();
    }

    public List<c> getClientAnnouncementsList() {
        return this.clientAnnouncements_;
    }

    public d getClientAnnouncementsOrBuilder(int i2) {
        return this.clientAnnouncements_.get(i2);
    }

    public List<? extends d> getClientAnnouncementsOrBuilderList() {
        return this.clientAnnouncements_;
    }

    public com.google.v.v getInstructionAnnouncementData() {
        return this.instructionAnnouncementData_;
    }

    public long getRouteSegmentIndex() {
        return this.routeSegmentIndex_;
    }

    public boolean hasInstructionAnnouncementData() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteSegmentIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ag newBuilder(ah ahVar) {
        return (ag) DEFAULT_INSTANCE.createBuilder(ahVar);
    }

    public static ah parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ah) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(com.google.v.v vVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ah parseFrom(com.google.v.z zVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ah parseFrom(com.google.v.z zVar, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientAnnouncements(c cVar) {
        Objects.requireNonNull(cVar);
        ensureClientAnnouncementsIsMutable();
        this.clientAnnouncements_.add(cVar);
    }

    public static ah parseFrom(InputStream inputStream) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ah parseFrom(InputStream inputStream, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ah parseFrom(ByteBuffer byteBuffer) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ah parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ah parseFrom(byte[] bArr) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ah parseFrom(byte[] bArr, de deVar) {
        return (ah) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
