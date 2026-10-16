package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fh extends com.google.v.du<fh, fg> implements com.google.v.fj {
    private static final fh DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fh> PARSER;
    private static final com.google.v.el<com.waze.bg.a.bn> itemSubtype_converter_ = new ff(0);
    private com.google.v.ek itemSubtype_ = emptyIntList();

    static {
        fh fhVar = new fh();
        DEFAULT_INSTANCE = fhVar;
        com.google.v.du.registerDefaultInstance(fh.class, fhVar);
    }

    private fh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.bn> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.bn> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.bn bnVar) {
        Objects.requireNonNull(bnVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(bnVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemSubtype() {
        this.itemSubtype_ = emptyIntList();
    }

    private void ensureItemSubtypeIsMutable() {
        com.google.v.ek ekVar = this.itemSubtype_;
        if (ekVar.c()) {
            return;
        }
        this.itemSubtype_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static fh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fg newBuilder() {
        return (fg) DEFAULT_INSTANCE.createBuilder();
    }

    public static fh parseDelimitedFrom(InputStream inputStream) {
        return (fh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fh parseFrom(com.google.v.v vVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.bn bnVar) {
        Objects.requireNonNull(bnVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, bnVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"itemSubtype_", com.waze.bg.a.bn.a()});
        }
        if (iOrdinal == 3) {
            return new fh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.bn getItemSubtype(int i2) {
        com.waze.bg.a.bn bnVarB = com.waze.bg.a.bn.b(this.itemSubtype_.d(i2));
        return bnVarB == null ? com.waze.bg.a.bn.ANIMAL_UNSPECIFIED : bnVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.bn> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public static fg newBuilder(fh fhVar) {
        return (fg) DEFAULT_INSTANCE.createBuilder(fhVar);
    }

    public static fh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fh parseFrom(com.google.v.z zVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fh parseFrom(InputStream inputStream) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fh parseFrom(ByteBuffer byteBuffer) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fh parseFrom(byte[] bArr) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
