package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cg extends du<cg, ce> implements fj {
    public static final int BATTLESTAR_CLIENT_INFO_FIELD_NUMBER = 1;
    private static final cg DEFAULT_INSTANCE;
    public static final int DESKTOP_SERVICES_CLIENT_INFO_FIELD_NUMBER = 6;
    public static final int DRIVE_DESKTOP_CLIENT_INFO_FIELD_NUMBER = 2;
    public static final int G1_DESKTOP_CLIENT_INFO_FIELD_NUMBER = 3;
    public static final int NEARBY_CLIENT_INFO_FIELD_NUMBER = 4;
    private static volatile fo<cg> PARSER = null;
    public static final int WINDOWS_CLIENT_INFO_FIELD_NUMBER = 5;
    private int clientInfoCase_ = 0;
    private Object clientInfo_;

    static {
        cg cgVar = new cg();
        DEFAULT_INSTANCE = cgVar;
        du.registerDefaultInstance(cg.class, cgVar);
    }

    private cg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattlestarClientInfo() {
        if (this.clientInfoCase_ == 1) {
            this.clientInfoCase_ = 0;
            this.clientInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfoCase_ = 0;
        this.clientInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDesktopServicesClientInfo() {
        if (this.clientInfoCase_ == 6) {
            this.clientInfoCase_ = 0;
            this.clientInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveDesktopClientInfo() {
        if (this.clientInfoCase_ == 2) {
            this.clientInfoCase_ = 0;
            this.clientInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearG1DesktopClientInfo() {
        if (this.clientInfoCase_ == 3) {
            this.clientInfoCase_ = 0;
            this.clientInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNearbyClientInfo() {
        if (this.clientInfoCase_ == 4) {
            this.clientInfoCase_ = 0;
            this.clientInfo_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWindowsClientInfo() {
        if (this.clientInfoCase_ == 5) {
            this.clientInfoCase_ = 0;
            this.clientInfo_ = null;
        }
    }

    public static cg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBattlestarClientInfo(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.clientInfoCase_ == 1 && this.clientInfo_ != m.getDefaultInstance()) {
            k kVarNewBuilder = m.newBuilder((m) this.clientInfo_);
            kVarNewBuilder.mergeFrom((k) mVar);
            mVar = kVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = mVar;
        this.clientInfoCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDesktopServicesClientInfo(z zVar) {
        Objects.requireNonNull(zVar);
        if (this.clientInfoCase_ == 6 && this.clientInfo_ != z.getDefaultInstance()) {
            x xVarNewBuilder = z.newBuilder((z) this.clientInfo_);
            xVarNewBuilder.mergeFrom((x) zVar);
            zVar = xVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = zVar;
        this.clientInfoCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriveDesktopClientInfo(ac acVar) {
        Objects.requireNonNull(acVar);
        if (this.clientInfoCase_ == 2 && this.clientInfo_ != ac.getDefaultInstance()) {
            aa aaVarNewBuilder = ac.newBuilder((ac) this.clientInfo_);
            aaVarNewBuilder.mergeFrom((aa) acVar);
            acVar = aaVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = acVar;
        this.clientInfoCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeG1DesktopClientInfo(af afVar) {
        Objects.requireNonNull(afVar);
        if (this.clientInfoCase_ == 3 && this.clientInfo_ != af.getDefaultInstance()) {
            ad adVarNewBuilder = af.newBuilder((af) this.clientInfo_);
            adVarNewBuilder.mergeFrom((ad) afVar);
            afVar = adVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = afVar;
        this.clientInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNearbyClientInfo(bd bdVar) {
        Objects.requireNonNull(bdVar);
        if (this.clientInfoCase_ == 4 && this.clientInfo_ != bd.getDefaultInstance()) {
            bb bbVarNewBuilder = bd.newBuilder((bd) this.clientInfo_);
            bbVarNewBuilder.mergeFrom((bb) bdVar);
            bdVar = bbVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = bdVar;
        this.clientInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWindowsClientInfo(dc dcVar) {
        Objects.requireNonNull(dcVar);
        if (this.clientInfoCase_ == 5 && this.clientInfo_ != dc.getDefaultInstance()) {
            cv cvVarNewBuilder = dc.newBuilder((dc) this.clientInfo_);
            cvVarNewBuilder.mergeFrom((cv) dcVar);
            dcVar = cvVarNewBuilder.buildPartial();
        }
        this.clientInfo_ = dcVar;
        this.clientInfoCase_ = 5;
    }

    public static ce newBuilder() {
        return (ce) DEFAULT_INSTANCE.createBuilder();
    }

    public static cg parseDelimitedFrom(InputStream inputStream) {
        return (cg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cg parseFrom(com.google.v.v vVar) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattlestarClientInfo(m mVar) {
        Objects.requireNonNull(mVar);
        this.clientInfo_ = mVar;
        this.clientInfoCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDesktopServicesClientInfo(z zVar) {
        Objects.requireNonNull(zVar);
        this.clientInfo_ = zVar;
        this.clientInfoCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveDesktopClientInfo(ac acVar) {
        Objects.requireNonNull(acVar);
        this.clientInfo_ = acVar;
        this.clientInfoCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setG1DesktopClientInfo(af afVar) {
        Objects.requireNonNull(afVar);
        this.clientInfo_ = afVar;
        this.clientInfoCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNearbyClientInfo(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.clientInfo_ = bdVar;
        this.clientInfoCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowsClientInfo(dc dcVar) {
        Objects.requireNonNull(dcVar);
        this.clientInfo_ = dcVar;
        this.clientInfoCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"clientInfo_", "clientInfoCase_", m.class, ac.class, af.class, bd.class, dc.class, z.class});
        }
        if (iOrdinal == 3) {
            return new cg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ce(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public m getBattlestarClientInfo() {
        return this.clientInfoCase_ == 1 ? (m) this.clientInfo_ : m.getDefaultInstance();
    }

    public cf getClientInfoCase() {
        switch (this.clientInfoCase_) {
            case 0:
                return cf.f3739g;
            case 1:
                return cf.f3733a;
            case 2:
                return cf.f3734b;
            case 3:
                return cf.f3735c;
            case 4:
                return cf.f3736d;
            case 5:
                return cf.f3737e;
            case 6:
                return cf.f3738f;
            default:
                return null;
        }
    }

    public z getDesktopServicesClientInfo() {
        return this.clientInfoCase_ == 6 ? (z) this.clientInfo_ : z.getDefaultInstance();
    }

    public ac getDriveDesktopClientInfo() {
        return this.clientInfoCase_ == 2 ? (ac) this.clientInfo_ : ac.getDefaultInstance();
    }

    public af getG1DesktopClientInfo() {
        return this.clientInfoCase_ == 3 ? (af) this.clientInfo_ : af.getDefaultInstance();
    }

    public bd getNearbyClientInfo() {
        return this.clientInfoCase_ == 4 ? (bd) this.clientInfo_ : bd.getDefaultInstance();
    }

    public dc getWindowsClientInfo() {
        return this.clientInfoCase_ == 5 ? (dc) this.clientInfo_ : dc.getDefaultInstance();
    }

    public boolean hasBattlestarClientInfo() {
        return this.clientInfoCase_ == 1;
    }

    public boolean hasDesktopServicesClientInfo() {
        return this.clientInfoCase_ == 6;
    }

    public boolean hasDriveDesktopClientInfo() {
        return this.clientInfoCase_ == 2;
    }

    public boolean hasG1DesktopClientInfo() {
        return this.clientInfoCase_ == 3;
    }

    public boolean hasNearbyClientInfo() {
        return this.clientInfoCase_ == 4;
    }

    public boolean hasWindowsClientInfo() {
        return this.clientInfoCase_ == 5;
    }

    public static ce newBuilder(cg cgVar) {
        return (ce) DEFAULT_INSTANCE.createBuilder(cgVar);
    }

    public static cg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cg parseFrom(com.google.v.z zVar) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cg parseFrom(InputStream inputStream) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cg parseFrom(ByteBuffer byteBuffer) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cg parseFrom(byte[] bArr) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cg) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
