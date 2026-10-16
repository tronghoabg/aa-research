package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ax extends com.google.v.du<ax, aw> implements fj {
    private static final ax DEFAULT_INSTANCE;
    private static volatile fo<ax> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private i.b.ah status_;

    static {
        ax axVar = new ax();
        DEFAULT_INSTANCE = axVar;
        com.google.v.du.registerDefaultInstance(ax.class, axVar);
    }

    private ax() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static ax getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        i.b.ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != i.b.ah.getDefaultInstance()) {
            i.b.af afVarNewBuilder = i.b.ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((i.b.af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static aw newBuilder() {
        return (aw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ax parseDelimitedFrom(InputStream inputStream) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(com.google.v.v vVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ax> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "status_"});
        }
        if (iOrdinal == 3) {
            return new ax();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ax> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ax.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aw newBuilder(ax axVar) {
        return (aw) DEFAULT_INSTANCE.createBuilder(axVar);
    }

    public static ax parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ax) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ax parseFrom(com.google.v.z zVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ax parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ax parseFrom(InputStream inputStream) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ax parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ax parseFrom(ByteBuffer byteBuffer) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ax parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ax parseFrom(byte[] bArr) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ax parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ax) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
