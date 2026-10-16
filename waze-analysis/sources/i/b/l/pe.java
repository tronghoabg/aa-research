package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pe extends com.google.v.du<pe, pd> implements com.google.v.fj {
    private static final pe DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pe> PARSER = null;
    public static final int VISUAL_EXPLANATION_FIELD_NUMBER = 1;
    public static final int VOCAL_EXPLANATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private qs visualExplanation_;
    private qx vocalExplanation_;

    static {
        pe peVar = new pe();
        DEFAULT_INSTANCE = peVar;
        com.google.v.du.registerDefaultInstance(pe.class, peVar);
    }

    private pe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisualExplanation() {
        this.visualExplanation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVocalExplanation() {
        this.vocalExplanation_ = null;
        this.bitField0_ &= -3;
    }

    public static pe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVisualExplanation(qs qsVar) {
        Objects.requireNonNull(qsVar);
        qs qsVar2 = this.visualExplanation_;
        if (qsVar2 != null && qsVar2 != qs.getDefaultInstance()) {
            qr qrVarNewBuilder = qs.newBuilder(qsVar2);
            qrVarNewBuilder.mergeFrom((qr) qsVar);
            qsVar = qrVarNewBuilder.buildPartial();
        }
        this.visualExplanation_ = qsVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVocalExplanation(qx qxVar) {
        Objects.requireNonNull(qxVar);
        qx qxVar2 = this.vocalExplanation_;
        if (qxVar2 != null && qxVar2 != qx.getDefaultInstance()) {
            qw qwVarNewBuilder = qx.newBuilder(qxVar2);
            qwVarNewBuilder.mergeFrom((qw) qxVar);
            qxVar = qwVarNewBuilder.buildPartial();
        }
        this.vocalExplanation_ = qxVar;
        this.bitField0_ |= 2;
    }

    public static pd newBuilder() {
        return (pd) DEFAULT_INSTANCE.createBuilder();
    }

    public static pe parseDelimitedFrom(InputStream inputStream) {
        return (pe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pe parseFrom(com.google.v.v vVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisualExplanation(qs qsVar) {
        Objects.requireNonNull(qsVar);
        this.visualExplanation_ = qsVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVocalExplanation(qx qxVar) {
        Objects.requireNonNull(qxVar);
        this.vocalExplanation_ = qxVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "visualExplanation_", "vocalExplanation_"});
        }
        if (iOrdinal == 3) {
            return new pe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public qs getVisualExplanation() {
        qs qsVar = this.visualExplanation_;
        return qsVar == null ? qs.getDefaultInstance() : qsVar;
    }

    public qx getVocalExplanation() {
        qx qxVar = this.vocalExplanation_;
        return qxVar == null ? qx.getDefaultInstance() : qxVar;
    }

    public boolean hasVisualExplanation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVocalExplanation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static pd newBuilder(pe peVar) {
        return (pd) DEFAULT_INSTANCE.createBuilder(peVar);
    }

    public static pe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pe parseFrom(com.google.v.z zVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pe parseFrom(InputStream inputStream) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pe parseFrom(ByteBuffer byteBuffer) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pe parseFrom(byte[] bArr) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
