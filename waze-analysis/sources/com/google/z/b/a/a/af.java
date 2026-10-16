package com.google.z.b.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.ds;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gb;
import com.google.v.gc;
import com.google.v.gm;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class af extends du<af, ae> implements fj {
    public static final int AVAILABILITY_ENDS_FIELD_NUMBER = 3;
    public static final int AVAILABILITY_STARTS_FIELD_NUMBER = 2;
    private static final af DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 489271632;
    private static volatile fo<af> PARSER = null;
    public static final int REGIONS_ALLOWED_FIELD_NUMBER = 1;
    public static final ds<com.google.w.n.a.b, af> messageSetExtension;
    private gc availabilityEnds_;
    private gc availabilityStarts_;
    private int bitField0_;
    private com.google.w.i.a.c regionsAllowed_;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
        messageSetExtension = du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, gm.MESSAGE, af.class);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityEnds() {
        this.availabilityEnds_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailabilityStarts() {
        this.availabilityStarts_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionsAllowed() {
        this.regionsAllowed_ = null;
        this.bitField0_ &= -2;
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailabilityEnds(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.availabilityEnds_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.availabilityEnds_ = gcVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailabilityStarts(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.availabilityStarts_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.availabilityStarts_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegionsAllowed(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        com.google.w.i.a.c cVar2 = this.regionsAllowed_;
        if (cVar2 != null && cVar2 != com.google.w.i.a.c.getDefaultInstance()) {
            com.google.w.i.a.b bVarNewBuilder = com.google.w.i.a.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.google.w.i.a.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.regionsAllowed_ = cVar;
        this.bitField0_ |= 1;
    }

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityEnds(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.availabilityEnds_ = gcVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailabilityStarts(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.availabilityStarts_ = gcVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionsAllowed(com.google.w.i.a.c cVar) {
        Objects.requireNonNull(cVar);
        this.regionsAllowed_ = cVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "regionsAllowed_", "availabilityStarts_", "availabilityEnds_"});
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
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gc getAvailabilityEnds() {
        gc gcVar = this.availabilityEnds_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public gc getAvailabilityStarts() {
        gc gcVar = this.availabilityStarts_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public com.google.w.i.a.c getRegionsAllowed() {
        com.google.w.i.a.c cVar = this.regionsAllowed_;
        return cVar == null ? com.google.w.i.a.c.getDefaultInstance() : cVar;
    }

    public boolean hasAvailabilityEnds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAvailabilityStarts() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegionsAllowed() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
