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
public final class p extends du<p, n> implements fj {
    public static final int BIRDSONG_BUILD_LABEL_FIELD_NUMBER = 3;
    public static final int BUILD_LABEL_FIELD_NUMBER = 2;
    public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
    private static final p DEFAULT_INSTANCE;
    private static volatile fo<p> PARSER;
    private int bitField0_;
    private int clientType_;
    private String buildLabel_ = "";
    private String birdsongBuildLabel_ = "";

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        du.registerDefaultInstance(p.class, pVar);
    }

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirdsongBuildLabel() {
        this.bitField0_ &= -5;
        this.birdsongBuildLabel_ = getDefaultInstance().getBirdsongBuildLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildLabel() {
        this.bitField0_ &= -3;
        this.buildLabel_ = getDefaultInstance().getBuildLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientType() {
        this.bitField0_ &= -2;
        this.clientType_ = 0;
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static p parseDelimitedFrom(InputStream inputStream) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(com.google.v.v vVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<p> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirdsongBuildLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.birdsongBuildLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirdsongBuildLabelBytes(com.google.v.v vVar) {
        this.birdsongBuildLabel_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.buildLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildLabelBytes(com.google.v.v vVar) {
        this.buildLabel_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(o oVar) {
        this.clientType_ = oVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "clientType_", i.f3786d, "buildLabel_", "birdsongBuildLabel_"});
        }
        if (iOrdinal == 3) {
            return new p();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<p> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (p.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBirdsongBuildLabel() {
        return this.birdsongBuildLabel_;
    }

    public com.google.v.v getBirdsongBuildLabelBytes() {
        return com.google.v.v.s(this.birdsongBuildLabel_);
    }

    public String getBuildLabel() {
        return this.buildLabel_;
    }

    public com.google.v.v getBuildLabelBytes() {
        return com.google.v.v.s(this.buildLabel_);
    }

    public o getClientType() {
        o oVarA = o.a(this.clientType_);
        return oVarA == null ? o.CLIENT_UNKNOWN : oVarA;
    }

    public boolean hasBirdsongBuildLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBuildLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasClientType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static n newBuilder(p pVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (p) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static p parseFrom(com.google.v.z zVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static p parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static p parseFrom(InputStream inputStream) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static p parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static p parseFrom(ByteBuffer byteBuffer) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static p parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static p parseFrom(byte[] bArr) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static p parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (p) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
