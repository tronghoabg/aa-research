package com.google.android.gms.h.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gm;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends du<k, j> implements fj {
    public static final int ANDROID_USER_TYPE_FIELD_NUMBER = 6;
    public static final int CLIENT_INFO_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int DEVICE_INFO_FIELD_NUMBER = 4;
    public static final int ENTRY_POINT_INFO_FIELD_NUMBER = 2;
    public static final int METRIC_EXTENSION_FIELD_NUMBER = 8;
    public static final int MODULE_INFO_FIELD_NUMBER = 3;
    private static volatile fo<k> PARSER = null;
    public static final int SERVICE_ID_FIELD_NUMBER = 5;
    public static final ds<j.a.a.a.a.b, k> metricExtension;
    private int androidUserType_;
    private int bitField0_;
    private i clientInfo_;
    private b deviceInfo_;
    private e entryPointInfo_;
    private m moduleInfo_;
    private int serviceId_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
        metricExtension = du.newSingularGeneratedExtension(j.a.a.a.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, 8, gm.MESSAGE, k.class);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidUserType() {
        this.bitField0_ &= -33;
        this.androidUserType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceInfo() {
        this.deviceInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointInfo() {
        this.entryPointInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModuleInfo() {
        this.moduleInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceId() {
        this.bitField0_ &= -17;
        this.serviceId_ = 0;
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientInfo(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.clientInfo_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            f fVarNewBuilder = i.newBuilder(iVar2);
            fVarNewBuilder.mergeFrom((f) iVar);
            iVar = fVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = iVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeviceInfo(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.deviceInfo_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.deviceInfo_ = bVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEntryPointInfo(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.entryPointInfo_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            c cVarNewBuilder = e.newBuilder(eVar2);
            cVarNewBuilder.mergeFrom((c) eVar);
            eVar = cVarNewBuilder.buildPartial();
        }
        this.entryPointInfo_ = eVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModuleInfo(m mVar) {
        Objects.requireNonNull(mVar);
        m mVar2 = this.moduleInfo_;
        if (mVar2 != null && mVar2 != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder(mVar2);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.moduleInfo_ = mVar;
        this.bitField0_ |= 4;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidUserType(com.google.android.gms.common.b bVar) {
        this.androidUserType_ = bVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInfo(i iVar) {
        Objects.requireNonNull(iVar);
        this.clientInfo_ = iVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceInfo(b bVar) {
        Objects.requireNonNull(bVar);
        this.deviceInfo_ = bVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointInfo(e eVar) {
        Objects.requireNonNull(eVar);
        this.entryPointInfo_ = eVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModuleInfo(m mVar) {
        Objects.requireNonNull(mVar);
        this.moduleInfo_ = mVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceId(com.google.android.gms.common.b.b bVar) {
        this.serviceId_ = bVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"bitField0_", "clientInfo_", "entryPointInfo_", "moduleInfo_", "deviceInfo_", "serviceId_", com.google.android.gms.common.b.b.b(), "androidUserType_", com.google.android.gms.common.b.b()});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.android.gms.common.b getAndroidUserType() {
        com.google.android.gms.common.b bVarA = com.google.android.gms.common.b.a(this.androidUserType_);
        return bVarA == null ? com.google.android.gms.common.b.ANDROID_USER_TYPE_UNKNOWN : bVarA;
    }

    public i getClientInfo() {
        i iVar = this.clientInfo_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public b getDeviceInfo() {
        b bVar = this.deviceInfo_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public e getEntryPointInfo() {
        e eVar = this.entryPointInfo_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public m getModuleInfo() {
        m mVar = this.moduleInfo_;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public com.google.android.gms.common.b.b getServiceId() {
        com.google.android.gms.common.b.b bVarA = com.google.android.gms.common.b.b.a(this.serviceId_);
        return bVarA == null ? com.google.android.gms.common.b.b.UNKNOWN : bVarA;
    }

    public boolean hasAndroidUserType() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClientInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEntryPointInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasModuleInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasServiceId() {
        return (this.bitField0_ & 16) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
