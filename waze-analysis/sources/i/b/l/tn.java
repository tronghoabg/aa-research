package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tn extends com.google.v.du<tn, tm> implements com.google.v.fj {
    private static final tn DEFAULT_INSTANCE;
    public static final int METERS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<tn> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int meters_;
    private i.b.ah status_;

    static {
        tn tnVar = new tn();
        DEFAULT_INSTANCE = tnVar;
        com.google.v.du.registerDefaultInstance(tn.class, tnVar);
    }

    private tn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeters() {
        this.bitField0_ &= -2;
        this.meters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -3;
    }

    public static tn getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static tm newBuilder() {
        return (tm) DEFAULT_INSTANCE.createBuilder();
    }

    public static tn parseDelimitedFrom(InputStream inputStream) {
        return (tn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tn parseFrom(com.google.v.v vVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeters(int i2) {
        this.bitField0_ |= 1;
        this.meters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "meters_", "status_"});
        }
        if (iOrdinal == 3) {
            return new tn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getMeters() {
        return this.meters_;
    }

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public boolean hasMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public static tm newBuilder(tn tnVar) {
        return (tm) DEFAULT_INSTANCE.createBuilder(tnVar);
    }

    public static tn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tn parseFrom(com.google.v.z zVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tn parseFrom(InputStream inputStream) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tn parseFrom(ByteBuffer byteBuffer) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tn parseFrom(byte[] bArr) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
