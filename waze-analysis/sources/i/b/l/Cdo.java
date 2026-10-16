package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* renamed from: i.b.l.do, reason: invalid class name */
/* loaded from: classes8.dex */
public final class Cdo extends com.google.v.du<Cdo, dn> implements com.google.v.fj {
    private static final Cdo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<Cdo> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private i.b.ah status_;

    static {
        Cdo cdo = new Cdo();
        DEFAULT_INSTANCE = cdo;
        com.google.v.du.registerDefaultInstance(Cdo.class, cdo);
    }

    private Cdo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static Cdo getDefaultInstance() {
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

    public static dn newBuilder() {
        return (dn) DEFAULT_INSTANCE.createBuilder();
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(com.google.v.v vVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<Cdo> parser() {
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
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "status_"});
        }
        if (iOrdinal == 3) {
            return new Cdo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<Cdo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Cdo.class) {
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

    public static dn newBuilder(Cdo cdo) {
        return (dn) DEFAULT_INSTANCE.createBuilder(cdo);
    }

    public static Cdo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Cdo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Cdo parseFrom(InputStream inputStream) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cdo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Cdo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Cdo parseFrom(byte[] bArr) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cdo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (Cdo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
