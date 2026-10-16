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
public final class h extends du<h, g> implements fj {
    private static final h DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile fo<h> PARSER;
    private int bitField0_;
    private i.b.s location_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -2;
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.location_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.location_ = sVar;
        this.bitField0_ |= 1;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(com.google.v.v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.location_ = sVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "location_"});
        }
        if (iOrdinal == 3) {
            return new h();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getLocation() {
        i.b.s sVar = this.location_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(com.google.v.v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(com.google.v.z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(com.google.v.z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
