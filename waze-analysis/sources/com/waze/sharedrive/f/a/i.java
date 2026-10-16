package com.waze.sharedrive.f.a;

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
public final class i extends du<i, a> implements fj {
    private static final i DEFAULT_INSTANCE;
    public static final int DRIVER_FIELD_NUMBER = 3;
    private static volatile fo<i> PARSER = null;
    public static final int VIEWER_FIELD_NUMBER = 1;
    public static final int VIEWER_SHARING_LOCATION_FIELD_NUMBER = 2;
    private int roleCase_ = 0;
    private Object role_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriver() {
        if (this.roleCase_ == 3) {
            this.roleCase_ = 0;
            this.role_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRole() {
        this.roleCase_ = 0;
        this.role_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewer() {
        if (this.roleCase_ == 1) {
            this.roleCase_ = 0;
            this.role_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViewerSharingLocation() {
        if (this.roleCase_ == 2) {
            this.roleCase_ = 0;
            this.role_ = null;
        }
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriver(c cVar) {
        Objects.requireNonNull(cVar);
        if (this.roleCase_ == 3 && this.role_ != c.getDefaultInstance()) {
            b bVarNewBuilder = c.newBuilder((c) this.role_);
            bVarNewBuilder.mergeFrom((b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.role_ = cVar;
        this.roleCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewer(f fVar) {
        Objects.requireNonNull(fVar);
        if (this.roleCase_ == 1 && this.role_ != f.getDefaultInstance()) {
            e eVarNewBuilder = f.newBuilder((f) this.role_);
            eVarNewBuilder.mergeFrom((e) fVar);
            fVar = eVarNewBuilder.buildPartial();
        }
        this.role_ = fVar;
        this.roleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeViewerSharingLocation(h hVar) {
        Objects.requireNonNull(hVar);
        if (this.roleCase_ == 2 && this.role_ != h.getDefaultInstance()) {
            g gVarNewBuilder = h.newBuilder((h) this.role_);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.role_ = hVar;
        this.roleCase_ = 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(com.google.v.v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriver(c cVar) {
        Objects.requireNonNull(cVar);
        this.role_ = cVar;
        this.roleCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewer(f fVar) {
        Objects.requireNonNull(fVar);
        this.role_ = fVar;
        this.roleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewerSharingLocation(h hVar) {
        Objects.requireNonNull(hVar);
        this.role_ = hVar;
        this.roleCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"role_", "roleCase_", f.class, h.class, c.class});
        }
        if (iOrdinal == 3) {
            return new i();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getDriver() {
        return this.roleCase_ == 3 ? (c) this.role_ : c.getDefaultInstance();
    }

    public d getRoleCase() {
        int i2 = this.roleCase_;
        if (i2 == 0) {
            return d.f38578d;
        }
        if (i2 == 1) {
            return d.f38575a;
        }
        if (i2 == 2) {
            return d.f38576b;
        }
        if (i2 != 3) {
            return null;
        }
        return d.f38577c;
    }

    public f getViewer() {
        return this.roleCase_ == 1 ? (f) this.role_ : f.getDefaultInstance();
    }

    public h getViewerSharingLocation() {
        return this.roleCase_ == 2 ? (h) this.role_ : h.getDefaultInstance();
    }

    public boolean hasDriver() {
        return this.roleCase_ == 3;
    }

    public boolean hasViewer() {
        return this.roleCase_ == 1;
    }

    public boolean hasViewerSharingLocation() {
        return this.roleCase_ == 2;
    }

    public static a newBuilder(i iVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(com.google.v.v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(com.google.v.z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(com.google.v.z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
