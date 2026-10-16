package com.waze.ak;

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
/* loaded from: classes5.dex */
public final class x extends du<x, w> implements fj {
    public static final int DEFAULT_INITIAL_ANNOUNCEMENT_FIELD_NUMBER = 2;
    private static final x DEFAULT_INSTANCE;
    private static volatile fo<x> PARSER = null;
    public static final int ROUTE_INITIAL_ANNOUNCEMENT_FIELD_NUMBER = 3;
    public static final int SKIP_INITIAL_ANNOUNCEMENT_FIELD_NUMBER = 1;
    private int announcementCase_ = 0;
    private Object announcement_;

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnouncement() {
        this.announcementCase_ = 0;
        this.announcement_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultInitialAnnouncement() {
        if (this.announcementCase_ == 2) {
            this.announcementCase_ = 0;
            this.announcement_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteInitialAnnouncement() {
        if (this.announcementCase_ == 3) {
            this.announcementCase_ = 0;
            this.announcement_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipInitialAnnouncement() {
        if (this.announcementCase_ == 1) {
            this.announcementCase_ = 0;
            this.announcement_ = null;
        }
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDefaultInitialAnnouncement(h hVar) {
        Objects.requireNonNull(hVar);
        if (this.announcementCase_ == 2 && this.announcement_ != h.getDefaultInstance()) {
            g gVarNewBuilder = h.newBuilder((h) this.announcement_);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.announcement_ = hVar;
        this.announcementCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteInitialAnnouncement(aa aaVar) {
        Objects.requireNonNull(aaVar);
        if (this.announcementCase_ == 3 && this.announcement_ != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder((aa) this.announcement_);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.announcement_ = aaVar;
        this.announcementCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkipInitialAnnouncement(ac acVar) {
        Objects.requireNonNull(acVar);
        if (this.announcementCase_ == 1 && this.announcement_ != ac.getDefaultInstance()) {
            ab abVarNewBuilder = ac.newBuilder((ac) this.announcement_);
            abVarNewBuilder.mergeFrom((ab) acVar);
            acVar = abVarNewBuilder.buildPartial();
        }
        this.announcement_ = acVar;
        this.announcementCase_ = 1;
    }

    public static w newBuilder() {
        return (w) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultInitialAnnouncement(h hVar) {
        Objects.requireNonNull(hVar);
        this.announcement_ = hVar;
        this.announcementCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteInitialAnnouncement(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.announcement_ = aaVar;
        this.announcementCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipInitialAnnouncement(ac acVar) {
        Objects.requireNonNull(acVar);
        this.announcement_ = acVar;
        this.announcementCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"announcement_", "announcementCase_", ac.class, h.class, aa.class});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new w(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public v getAnnouncementCase() {
        int i2 = this.announcementCase_;
        if (i2 == 0) {
            return v.f14121d;
        }
        if (i2 == 1) {
            return v.f14118a;
        }
        if (i2 == 2) {
            return v.f14119b;
        }
        if (i2 != 3) {
            return null;
        }
        return v.f14120c;
    }

    public h getDefaultInitialAnnouncement() {
        return this.announcementCase_ == 2 ? (h) this.announcement_ : h.getDefaultInstance();
    }

    public aa getRouteInitialAnnouncement() {
        return this.announcementCase_ == 3 ? (aa) this.announcement_ : aa.getDefaultInstance();
    }

    public ac getSkipInitialAnnouncement() {
        return this.announcementCase_ == 1 ? (ac) this.announcement_ : ac.getDefaultInstance();
    }

    public boolean hasDefaultInitialAnnouncement() {
        return this.announcementCase_ == 2;
    }

    public boolean hasRouteInitialAnnouncement() {
        return this.announcementCase_ == 3;
    }

    public boolean hasSkipInitialAnnouncement() {
        return this.announcementCase_ == 1;
    }

    public static w newBuilder(x xVar) {
        return (w) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
