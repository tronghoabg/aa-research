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
public final class d extends du<d, c> implements fj {
    public static final int APP_INFO_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int DEVICE_INFO_FIELD_NUMBER = 4;
    public static final int LOCATION_FIELD_NUMBER = 6;
    private static volatile fo<d> PARSER = null;
    public static final int REQUEST_CLIENT_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int REQUEST_CLIENT_TIME_ZONE_FIELD_NUMBER = 7;
    public static final int SESSION_INFO_FIELD_NUMBER = 1;
    private i appInfo_;
    private int bitField0_;
    private k deviceInfo_;
    private r location_;
    private String requestClientTimeZone_ = "";
    private gc requestClientTimestamp_;
    private f sessionInfo_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInfo() {
        this.appInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceInfo() {
        this.deviceInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestClientTimeZone() {
        this.bitField0_ &= -17;
        this.requestClientTimeZone_ = getDefaultInstance().getRequestClientTimeZone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestClientTimestamp() {
        this.requestClientTimestamp_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionInfo() {
        this.sessionInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppInfo(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.appInfo_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.appInfo_ = iVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceInfo(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.deviceInfo_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder(kVar2);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.deviceInfo_ = kVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.location_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.location_ = rVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequestClientTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.requestClientTimestamp_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.requestClientTimestamp_ = gcVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSessionInfo(f fVar) {
        Objects.requireNonNull(fVar);
        f fVar2 = this.sessionInfo_;
        if (fVar2 != null && fVar2 != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder(fVar2);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.sessionInfo_ = fVar;
        this.bitField0_ |= 1;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(com.google.v.v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInfo(i iVar) {
        Objects.requireNonNull(iVar);
        this.appInfo_ = iVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceInfo(k kVar) {
        Objects.requireNonNull(kVar);
        this.deviceInfo_ = kVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(r rVar) {
        Objects.requireNonNull(rVar);
        this.location_ = rVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestClientTimeZone(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.requestClientTimeZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestClientTimeZoneBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.requestClientTimeZone_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestClientTimestamp(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.requestClientTimestamp_ = gcVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionInfo(f fVar) {
        Objects.requireNonNull(fVar);
        this.sessionInfo_ = fVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0005\u0007ለ\u0004", new Object[]{"bitField0_", "sessionInfo_", "appInfo_", "deviceInfo_", "requestClientTimestamp_", "location_", "requestClientTimeZone_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getAppInfo() {
        i iVar = this.appInfo_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public k getDeviceInfo() {
        k kVar = this.deviceInfo_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public r getLocation() {
        r rVar = this.location_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    public String getRequestClientTimeZone() {
        return this.requestClientTimeZone_;
    }

    public com.google.v.v getRequestClientTimeZoneBytes() {
        return com.google.v.v.s(this.requestClientTimeZone_);
    }

    public gc getRequestClientTimestamp() {
        gc gcVar = this.requestClientTimestamp_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public f getSessionInfo() {
        f fVar = this.sessionInfo_;
        return fVar == null ? f.getDefaultInstance() : fVar;
    }

    public boolean hasAppInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeviceInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRequestClientTimeZone() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestClientTimestamp() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSessionInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(com.google.v.v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(com.google.v.z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(com.google.v.z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
