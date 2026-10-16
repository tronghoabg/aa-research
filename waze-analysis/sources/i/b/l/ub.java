package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ub extends com.google.v.du<ub, ua> implements com.google.v.fj {
    private static final ub DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ub> PARSER = null;
    public static final int REPORT_FIELD_NUMBER = 1;
    private int bitField0_;
    private tz report_;

    static {
        ub ubVar = new ub();
        DEFAULT_INSTANCE = ubVar;
        com.google.v.du.registerDefaultInstance(ub.class, ubVar);
    }

    private ub() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReport() {
        this.report_ = null;
        this.bitField0_ &= -2;
    }

    public static ub getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReport(tz tzVar) {
        Objects.requireNonNull(tzVar);
        tz tzVar2 = this.report_;
        if (tzVar2 != null && tzVar2 != tz.getDefaultInstance()) {
            ty tyVarNewBuilder = tz.newBuilder(tzVar2);
            tyVarNewBuilder.mergeFrom((ty) tzVar);
            tzVar = tyVarNewBuilder.buildPartial();
        }
        this.report_ = tzVar;
        this.bitField0_ |= 1;
    }

    public static ua newBuilder() {
        return (ua) DEFAULT_INSTANCE.createBuilder();
    }

    public static ub parseDelimitedFrom(InputStream inputStream) {
        return (ub) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ub parseFrom(com.google.v.v vVar) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ub> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReport(tz tzVar) {
        Objects.requireNonNull(tzVar);
        this.report_ = tzVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "report_"});
        }
        if (iOrdinal == 3) {
            return new ub();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ua(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ub> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ub.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public tz getReport() {
        tz tzVar = this.report_;
        return tzVar == null ? tz.getDefaultInstance() : tzVar;
    }

    public boolean hasReport() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ua newBuilder(ub ubVar) {
        return (ua) DEFAULT_INSTANCE.createBuilder(ubVar);
    }

    public static ub parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ub) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ub parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ub parseFrom(com.google.v.z zVar) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ub parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ub parseFrom(InputStream inputStream) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ub parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ub parseFrom(ByteBuffer byteBuffer) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ub parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ub parseFrom(byte[] bArr) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ub parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ub) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
