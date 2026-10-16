package com.google.android.libraries.phenotype.client.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends du<f, a> implements fj {
    public static final int CONFIG_PACKAGE_FIELD_NUMBER = 3;
    private static final f DEFAULT_INSTANCE;
    private static volatile fo<f> PARSER = null;
    public static final int SNAPSHOT_RESULT_FIELD_NUMBER = 2;
    public static final int SNAPSHOT_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private e snapshotResult_;
    private String snapshotToken_ = "";
    private String configPackage_ = "";

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigPackage() {
        this.bitField0_ &= -5;
        this.configPackage_ = getDefaultInstance().getConfigPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotResult() {
        this.snapshotResult_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotToken() {
        this.bitField0_ &= -2;
        this.snapshotToken_ = getDefaultInstance().getSnapshotToken();
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSnapshotResult(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.snapshotResult_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            b bVarNewBuilder = e.newBuilder(eVar2);
            bVarNewBuilder.mergeFrom((b) eVar);
            eVar = bVarNewBuilder.buildPartial();
        }
        this.snapshotResult_ = eVar;
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigPackage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.configPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigPackageBytes(v vVar) {
        this.configPackage_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotResult(e eVar) {
        Objects.requireNonNull(eVar);
        this.snapshotResult_ = eVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.snapshotToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotTokenBytes(v vVar) {
        this.snapshotToken_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "snapshotToken_", "snapshotResult_", "configPackage_"});
        }
        if (iOrdinal == 3) {
            return new f();
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
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getConfigPackage() {
        return this.configPackage_;
    }

    public v getConfigPackageBytes() {
        return v.s(this.configPackage_);
    }

    public e getSnapshotResult() {
        e eVar = this.snapshotResult_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public String getSnapshotToken() {
        return this.snapshotToken_;
    }

    public v getSnapshotTokenBytes() {
        return v.s(this.snapshotToken_);
    }

    public boolean hasConfigPackage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSnapshotResult() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSnapshotToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(f fVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
