package com.waze.ch;

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
/* loaded from: classes7.dex */
public final class o extends du<o, l> implements fj {
    private static final o DEFAULT_INSTANCE;
    public static final int DISPLAY_VIEWPORT_FIELD_NUMBER = 1;
    public static final int GOOGLE_MAPS_ZOOM_LEVEL_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 4;
    public static final int MOTION_FIELD_NUMBER = 7;
    private static volatile fo<o> PARSER = null;
    public static final int REQUEST_MODE_FIELD_NUMBER = 3;
    public static final int TRIGGER_REASON_FIELD_NUMBER = 6;
    public static final int USER_POSITION_FIELD_NUMBER = 5;
    private int bitField0_;
    private i.b.x displayViewport_;
    private int googleMapsZoomLevel_;
    private e metadata_;
    private z motion_;
    private int requestMode_;
    private int triggerReason_;
    private com.waze.bg.d.d userPosition_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayViewport() {
        this.displayViewport_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleMapsZoomLevel() {
        this.bitField0_ &= -3;
        this.googleMapsZoomLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMotion() {
        this.motion_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestMode() {
        this.bitField0_ &= -9;
        this.requestMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerReason() {
        this.bitField0_ &= -33;
        this.triggerReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPosition() {
        this.userPosition_ = null;
        this.bitField0_ &= -5;
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayViewport(i.b.x xVar) {
        Objects.requireNonNull(xVar);
        i.b.x xVar2 = this.displayViewport_;
        if (xVar2 != null && xVar2 != i.b.x.getDefaultInstance()) {
            i.b.w wVarNewBuilder = i.b.x.newBuilder(xVar2);
            wVarNewBuilder.mergeFrom((i.b.w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.displayViewport_ = xVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.metadata_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            c cVarNewBuilder = e.newBuilder(eVar2);
            cVarNewBuilder.mergeFrom((c) eVar);
            eVar = cVarNewBuilder.buildPartial();
        }
        this.metadata_ = eVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMotion(z zVar) {
        Objects.requireNonNull(zVar);
        z zVar2 = this.motion_;
        if (zVar2 != null && zVar2 != z.getDefaultInstance()) {
            y yVarNewBuilder = z.newBuilder(zVar2);
            yVarNewBuilder.mergeFrom((y) zVar);
            zVar = yVarNewBuilder.buildPartial();
        }
        this.motion_ = zVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        com.waze.bg.d.d dVar2 = this.userPosition_;
        if (dVar2 != null && dVar2 != com.waze.bg.d.d.getDefaultInstance()) {
            com.waze.bg.d.c cVarNewBuilder = com.waze.bg.d.d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((com.waze.bg.d.c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.userPosition_ = dVar;
        this.bitField0_ |= 4;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(com.google.v.v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayViewport(i.b.x xVar) {
        Objects.requireNonNull(xVar);
        this.displayViewport_ = xVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleMapsZoomLevel(int i2) {
        this.bitField0_ |= 2;
        this.googleMapsZoomLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(e eVar) {
        Objects.requireNonNull(eVar);
        this.metadata_ = eVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMotion(z zVar) {
        Objects.requireNonNull(zVar);
        this.motion_ = zVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMode(m mVar) {
        this.requestMode_ = mVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerReason(n nVar) {
        this.triggerReason_ = nVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        this.userPosition_ = dVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003᠌\u0003\u0004ဉ\u0004\u0005ဉ\u0002\u0006᠌\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "displayViewport_", "googleMapsZoomLevel_", "requestMode_", j.f22366c, "metadata_", "userPosition_", "triggerReason_", j.f22367d, "motion_"});
        }
        if (iOrdinal == 3) {
            return new o();
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
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.x getDisplayViewport() {
        i.b.x xVar = this.displayViewport_;
        return xVar == null ? i.b.x.getDefaultInstance() : xVar;
    }

    public int getGoogleMapsZoomLevel() {
        return this.googleMapsZoomLevel_;
    }

    public e getMetadata() {
        e eVar = this.metadata_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public z getMotion() {
        z zVar = this.motion_;
        return zVar == null ? z.getDefaultInstance() : zVar;
    }

    public m getRequestMode() {
        m mVarA = m.a(this.requestMode_);
        return mVarA == null ? m.MODE_UNSPECIFIED : mVarA;
    }

    public n getTriggerReason() {
        n nVarA = n.a(this.triggerReason_);
        return nVarA == null ? n.TRIGGER_REASON_UNSPECIFIED : nVarA;
    }

    public com.waze.bg.d.d getUserPosition() {
        com.waze.bg.d.d dVar = this.userPosition_;
        return dVar == null ? com.waze.bg.d.d.getDefaultInstance() : dVar;
    }

    public boolean hasDisplayViewport() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGoogleMapsZoomLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMotion() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRequestMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTriggerReason() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUserPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    public static l newBuilder(o oVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(com.google.v.z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(com.google.v.z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
