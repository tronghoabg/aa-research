package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gb extends com.google.v.du<gb, ga> implements com.google.v.fj {
    private static final gb DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gb> PARSER = null;
    public static final int SHOW_OTHER_SIDE_FIELD_NUMBER = 2;
    private static final com.google.v.el<com.waze.bg.a.bt> itemSubtype_converter_ = new ff(4);
    private int bitField0_;
    private com.google.v.ek itemSubtype_ = emptyIntList();
    private boolean showOtherSide_;

    static {
        gb gbVar = new gb();
        DEFAULT_INSTANCE = gbVar;
        com.google.v.du.registerDefaultInstance(gb.class, gbVar);
    }

    private gb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.bt> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.bt> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.bt btVar) {
        Objects.requireNonNull(btVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(btVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemSubtype() {
        this.itemSubtype_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowOtherSide() {
        this.bitField0_ &= -2;
        this.showOtherSide_ = false;
    }

    private void ensureItemSubtypeIsMutable() {
        com.google.v.ek ekVar = this.itemSubtype_;
        if (ekVar.c()) {
            return;
        }
        this.itemSubtype_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static gb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ga newBuilder() {
        return (ga) DEFAULT_INSTANCE.createBuilder();
    }

    public static gb parseDelimitedFrom(InputStream inputStream) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(com.google.v.v vVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.bt btVar) {
        Objects.requireNonNull(btVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, btVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowOtherSide(boolean z) {
        this.bitField0_ |= 1;
        this.showOtherSide_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002ဇ\u0000", new Object[]{"bitField0_", "itemSubtype_", com.waze.bg.a.bt.a(), "showOtherSide_"});
        }
        if (iOrdinal == 3) {
            return new gb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ga(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.bt getItemSubtype(int i2) {
        com.waze.bg.a.bt btVarB = com.waze.bg.a.bt.b(this.itemSubtype_.d(i2));
        return btVarB == null ? com.waze.bg.a.bt.HAZARD_UNSPECIFIED : btVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.bt> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public boolean getShowOtherSide() {
        return this.showOtherSide_;
    }

    public boolean hasShowOtherSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ga newBuilder(gb gbVar) {
        return (ga) DEFAULT_INSTANCE.createBuilder(gbVar);
    }

    public static gb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gb parseFrom(com.google.v.z zVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gb parseFrom(InputStream inputStream) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gb parseFrom(ByteBuffer byteBuffer) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gb parseFrom(byte[] bArr) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
