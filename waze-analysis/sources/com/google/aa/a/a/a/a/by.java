package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class by extends du<by, bv> implements fj {
    private static final by DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile fo<by> PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    static {
        by byVar = new by();
        DEFAULT_INSTANCE = byVar;
        du.registerDefaultInstance(by.class, byVar);
    }

    private by() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileSubtype() {
        this.bitField0_ &= -3;
        this.mobileSubtype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkType() {
        this.bitField0_ &= -2;
        this.networkType_ = -1;
    }

    public static by getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static by parseDelimitedFrom(InputStream inputStream) {
        return (by) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static by parseFrom(com.google.v.v vVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<by> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileSubtype(bw bwVar) {
        this.mobileSubtype_ = bwVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkType(bx bxVar) {
        this.networkType_ = bxVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "networkType_", i.s, "mobileSubtype_", i.r});
        }
        if (iOrdinal == 3) {
            return new by();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<by> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (by.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bw getMobileSubtype() {
        bw bwVarA = bw.a(this.mobileSubtype_);
        return bwVarA == null ? bw.UNKNOWN_MOBILE_SUBTYPE : bwVarA;
    }

    public bx getNetworkType() {
        bx bxVarA = bx.a(this.networkType_);
        return bxVarA == null ? bx.NONE : bxVarA;
    }

    public boolean hasMobileSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNetworkType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bv newBuilder(by byVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(byVar);
    }

    public static by parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (by) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static by parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static by parseFrom(com.google.v.z zVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static by parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static by parseFrom(InputStream inputStream) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static by parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static by parseFrom(ByteBuffer byteBuffer) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static by parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static by parseFrom(byte[] bArr) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static by parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (by) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
