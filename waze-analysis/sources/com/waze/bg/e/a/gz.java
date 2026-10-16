package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gz extends com.google.v.du<gz, gy> implements com.google.v.fj {
    private static final gz DEFAULT_INSTANCE;
    public static final int EXTRA_INFO_LABEL_FIELD_NUMBER = 2;
    public static final int MAP_VIEW_LABEL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gz> PARSER;
    private int bitField0_;
    private ea extraInfoLabel_;
    private ek mapViewLabel_;

    static {
        gz gzVar = new gz();
        DEFAULT_INSTANCE = gzVar;
        com.google.v.du.registerDefaultInstance(gz.class, gzVar);
    }

    private gz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtraInfoLabel() {
        this.extraInfoLabel_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapViewLabel() {
        this.mapViewLabel_ = null;
        this.bitField0_ &= -2;
    }

    public static gz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtraInfoLabel(ea eaVar) {
        Objects.requireNonNull(eaVar);
        ea eaVar2 = this.extraInfoLabel_;
        if (eaVar2 != null && eaVar2 != ea.getDefaultInstance()) {
            dy dyVarNewBuilder = ea.newBuilder(eaVar2);
            dyVarNewBuilder.mergeFrom((dy) eaVar);
            eaVar = dyVarNewBuilder.buildPartial();
        }
        this.extraInfoLabel_ = eaVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapViewLabel(ek ekVar) {
        Objects.requireNonNull(ekVar);
        ek ekVar2 = this.mapViewLabel_;
        if (ekVar2 != null && ekVar2 != ek.getDefaultInstance()) {
            ej ejVarNewBuilder = ek.newBuilder(ekVar2);
            ejVarNewBuilder.mergeFrom((ej) ekVar);
            ekVar = ejVarNewBuilder.buildPartial();
        }
        this.mapViewLabel_ = ekVar;
        this.bitField0_ |= 1;
    }

    public static gy newBuilder() {
        return (gy) DEFAULT_INSTANCE.createBuilder();
    }

    public static gz parseDelimitedFrom(InputStream inputStream) {
        return (gz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gz parseFrom(com.google.v.v vVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraInfoLabel(ea eaVar) {
        Objects.requireNonNull(eaVar);
        this.extraInfoLabel_ = eaVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapViewLabel(ek ekVar) {
        Objects.requireNonNull(ekVar);
        this.mapViewLabel_ = ekVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "mapViewLabel_", "extraInfoLabel_"});
        }
        if (iOrdinal == 3) {
            return new gz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ea getExtraInfoLabel() {
        ea eaVar = this.extraInfoLabel_;
        return eaVar == null ? ea.getDefaultInstance() : eaVar;
    }

    public ek getMapViewLabel() {
        ek ekVar = this.mapViewLabel_;
        return ekVar == null ? ek.getDefaultInstance() : ekVar;
    }

    public boolean hasExtraInfoLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMapViewLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gy newBuilder(gz gzVar) {
        return (gy) DEFAULT_INSTANCE.createBuilder(gzVar);
    }

    public static gz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gz parseFrom(com.google.v.z zVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gz parseFrom(InputStream inputStream) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gz parseFrom(ByteBuffer byteBuffer) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gz parseFrom(byte[] bArr) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
