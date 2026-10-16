package com.waze.ap.b.a.a;

import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class af extends com.google.v.du<af, ae> implements ag {
    public static final int AUDIENCE_FIELD_NUMBER = 1;
    private static final af DEFAULT_INSTANCE;
    public static final int DISPLAY_POLICY_FIELD_NUMBER = 2;
    private static volatile fo<af> PARSER;
    private g audience_;
    private int bitField0_;
    private ad displayPolicy_;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        com.google.v.du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudience() {
        this.audience_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayPolicy() {
        this.displayPolicy_ = null;
        this.bitField0_ &= -3;
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudience(g gVar) {
        Objects.requireNonNull(gVar);
        g gVar2 = this.audience_;
        if (gVar2 != null && gVar2 != g.getDefaultInstance()) {
            f fVarNewBuilder = g.newBuilder(gVar2);
            fVarNewBuilder.mergeFrom((f) gVar);
            gVar = fVarNewBuilder.buildPartial();
        }
        this.audience_ = gVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayPolicy(ad adVar) {
        Objects.requireNonNull(adVar);
        ad adVar2 = this.displayPolicy_;
        if (adVar2 != null && adVar2 != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder(adVar2);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.displayPolicy_ = adVar;
        this.bitField0_ |= 2;
    }

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudience(g gVar) {
        Objects.requireNonNull(gVar);
        this.audience_ = gVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayPolicy(ad adVar) {
        Objects.requireNonNull(adVar);
        this.displayPolicy_ = adVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "audience_", "displayPolicy_"});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<af> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (af.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public g getAudience() {
        g gVar = this.audience_;
        return gVar == null ? g.getDefaultInstance() : gVar;
    }

    public ad getDisplayPolicy() {
        ad adVar = this.displayPolicy_;
        return adVar == null ? ad.getDefaultInstance() : adVar;
    }

    public boolean hasAudience() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisplayPolicy() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
