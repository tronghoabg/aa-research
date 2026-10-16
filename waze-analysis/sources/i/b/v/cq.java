package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cq extends com.google.v.du<cq, cp> implements com.google.v.fj {
    private static final cq DEFAULT_INSTANCE;
    public static final int LOTTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<cq> PARSER;
    private static final com.google.v.el<co> lotType_converter_ = new al(3);
    private com.google.v.ek lotType_ = emptyIntList();

    static {
        cq cqVar = new cq();
        DEFAULT_INSTANCE = cqVar;
        com.google.v.du.registerDefaultInstance(cq.class, cqVar);
    }

    private cq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLotType(Iterable<? extends co> iterable) {
        ensureLotTypeIsMutable();
        Iterator<? extends co> it = iterable.iterator();
        while (it.hasNext()) {
            this.lotType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLotType(co coVar) {
        Objects.requireNonNull(coVar);
        ensureLotTypeIsMutable();
        this.lotType_.i(coVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLotType() {
        this.lotType_ = emptyIntList();
    }

    private void ensureLotTypeIsMutable() {
        com.google.v.ek ekVar = this.lotType_;
        if (ekVar.c()) {
            return;
        }
        this.lotType_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static cq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cp newBuilder() {
        return (cp) DEFAULT_INSTANCE.createBuilder();
    }

    public static cq parseDelimitedFrom(InputStream inputStream) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(com.google.v.v vVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLotType(int i2, co coVar) {
        Objects.requireNonNull(coVar);
        ensureLotTypeIsMutable();
        this.lotType_.e(i2, coVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"lotType_", z.n});
        }
        if (iOrdinal == 3) {
            return new cq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public co getLotType(int i2) {
        co coVarA = co.a(this.lotType_.d(i2));
        return coVarA == null ? co.STREET_LEVEL : coVarA;
    }

    public int getLotTypeCount() {
        return this.lotType_.size();
    }

    public List<co> getLotTypeList() {
        return new com.google.v.em(this.lotType_, lotType_converter_);
    }

    public static cp newBuilder(cq cqVar) {
        return (cp) DEFAULT_INSTANCE.createBuilder(cqVar);
    }

    public static cq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cq parseFrom(com.google.v.z zVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cq parseFrom(InputStream inputStream) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(ByteBuffer byteBuffer) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cq parseFrom(byte[] bArr) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
