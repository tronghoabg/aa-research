package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gt extends com.google.v.du<gt, gs> implements com.google.v.fj {
    private static final gt DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gt> PARSER;
    private static final com.google.v.el<com.waze.bg.a.bv> itemSubtype_converter_ = new ff(6);
    private com.google.v.ek itemSubtype_ = emptyIntList();

    static {
        gt gtVar = new gt();
        DEFAULT_INSTANCE = gtVar;
        com.google.v.du.registerDefaultInstance(gt.class, gtVar);
    }

    private gt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.bv> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.bv> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.bv bvVar) {
        Objects.requireNonNull(bvVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(bvVar.getNumber());
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

    public static gt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gs newBuilder() {
        return (gs) DEFAULT_INSTANCE.createBuilder();
    }

    public static gt parseDelimitedFrom(InputStream inputStream) {
        return (gt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gt parseFrom(com.google.v.v vVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.bv bvVar) {
        Objects.requireNonNull(bvVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, bvVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"itemSubtype_", com.waze.bg.a.bv.a()});
        }
        if (iOrdinal == 3) {
            return new gt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.bv getItemSubtype(int i2) {
        com.waze.bg.a.bv bvVarB = com.waze.bg.a.bv.b(this.itemSubtype_.d(i2));
        return bvVarB == null ? com.waze.bg.a.bv.PERSONAL_SAFETY_UNSPECIFIED : bvVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.bv> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public static gs newBuilder(gt gtVar) {
        return (gs) DEFAULT_INSTANCE.createBuilder(gtVar);
    }

    public static gt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gt parseFrom(com.google.v.z zVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gt parseFrom(InputStream inputStream) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gt parseFrom(ByteBuffer byteBuffer) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gt parseFrom(byte[] bArr) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
