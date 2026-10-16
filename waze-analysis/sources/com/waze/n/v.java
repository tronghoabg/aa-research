package com.waze.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gb;
import com.google.v.gc;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends du<v, u> implements fj {
    public static final int CLIENT_VERSION_FIELD_NUMBER = 6;
    private static final v DEFAULT_INSTANCE;
    public static final int DISPLAY_INFO_FIELD_NUMBER = 5;
    public static final int DRIVING_INFO_FIELD_NUMBER = 3;
    public static final int EVENT_CLIENT_TIMESTAMP_FIELD_NUMBER = 1;
    private static volatile fo<v> PARSER = null;
    public static final int PROJECTED_PLATFORM_FIELD_NUMBER = 2;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private int bitField0_;
    private String clientVersion_ = "";
    private m displayInfo_;
    private p drivingInfo_;
    private gc eventClientTimestamp_;
    private int projectedPlatform_;
    private int sequenceNumber_;

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        du.registerDefaultInstance(v.class, vVar);
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientVersion() {
        this.bitField0_ &= -33;
        this.clientVersion_ = getDefaultInstance().getClientVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayInfo() {
        this.displayInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDrivingInfo() {
        this.drivingInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventClientTimestamp() {
        this.eventClientTimestamp_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProjectedPlatform() {
        this.bitField0_ &= -3;
        this.projectedPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSequenceNumber() {
        this.bitField0_ &= -17;
        this.sequenceNumber_ = 0;
    }

    public static v getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayInfo(m mVar) {
        Objects.requireNonNull(mVar);
        m mVar2 = this.displayInfo_;
        if (mVar2 != null && mVar2 != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder(mVar2);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.displayInfo_ = mVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDrivingInfo(p pVar) {
        Objects.requireNonNull(pVar);
        p pVar2 = this.drivingInfo_;
        if (pVar2 != null && pVar2 != p.getDefaultInstance()) {
            o oVarNewBuilder = p.newBuilder(pVar2);
            oVarNewBuilder.mergeFrom((o) pVar);
            pVar = oVarNewBuilder.buildPartial();
        }
        this.drivingInfo_ = pVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventClientTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.eventClientTimestamp_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.eventClientTimestamp_ = gcVar;
        this.bitField0_ |= 1;
    }

    public static u newBuilder() {
        return (u) DEFAULT_INSTANCE.createBuilder();
    }

    public static v parseDelimitedFrom(InputStream inputStream) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(com.google.v.v vVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<v> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.clientVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientVersionBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.clientVersion_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayInfo(m mVar) {
        Objects.requireNonNull(mVar);
        this.displayInfo_ = mVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrivingInfo(p pVar) {
        Objects.requireNonNull(pVar);
        this.drivingInfo_ = pVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventClientTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.eventClientTimestamp_ = gcVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectedPlatform(t tVar) {
        this.projectedPlatform_ = tVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectedPlatformValue(int i2) {
        this.bitField0_ |= 2;
        this.projectedPlatform_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSequenceNumber(int i2) {
        this.bitField0_ |= 16;
        this.sequenceNumber_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0003\u0004င\u0004\u0005ဉ\u0002\u0006ለ\u0005", new Object[]{"bitField0_", "eventClientTimestamp_", "projectedPlatform_", "drivingInfo_", "sequenceNumber_", "displayInfo_", "clientVersion_"});
        }
        if (iOrdinal == 3) {
            return new v();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new u(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<v> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (v.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getClientVersion() {
        return this.clientVersion_;
    }

    public com.google.v.v getClientVersionBytes() {
        return com.google.v.v.s(this.clientVersion_);
    }

    public m getDisplayInfo() {
        m mVar = this.displayInfo_;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public p getDrivingInfo() {
        p pVar = this.drivingInfo_;
        return pVar == null ? p.getDefaultInstance() : pVar;
    }

    public gc getEventClientTimestamp() {
        gc gcVar = this.eventClientTimestamp_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public t getProjectedPlatform() {
        t tVarA = t.a(this.projectedPlatform_);
        return tVarA == null ? t.UNRECOGNIZED : tVarA;
    }

    public int getProjectedPlatformValue() {
        return this.projectedPlatform_;
    }

    public int getSequenceNumber() {
        return this.sequenceNumber_;
    }

    public boolean hasClientVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDisplayInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDrivingInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEventClientTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProjectedPlatform() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSequenceNumber() {
        return (this.bitField0_ & 16) != 0;
    }

    public static u newBuilder(v vVar) {
        return (u) DEFAULT_INSTANCE.createBuilder(vVar);
    }

    public static v parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (v) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(com.google.v.v vVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static v parseFrom(com.google.v.z zVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static v parseFrom(com.google.v.z zVar, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static v parseFrom(InputStream inputStream) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static v parseFrom(InputStream inputStream, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static v parseFrom(ByteBuffer byteBuffer) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static v parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static v parseFrom(byte[] bArr) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static v parseFrom(byte[] bArr, de deVar) {
        return (v) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
