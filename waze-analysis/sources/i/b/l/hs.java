package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hs extends com.google.v.du<hs, hr> implements com.google.v.fj {
    private static final hs DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<hs> PARSER = null;
    public static final int SHOW_OTHER_SIDE_FIELD_NUMBER = 2;
    private static final com.google.v.el<com.waze.bg.a.by> itemSubtype_converter_ = new ff(8);
    private int bitField0_;
    private com.google.v.ek itemSubtype_ = emptyIntList();
    private boolean showOtherSide_;

    static {
        hs hsVar = new hs();
        DEFAULT_INSTANCE = hsVar;
        com.google.v.du.registerDefaultInstance(hs.class, hsVar);
    }

    private hs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.by> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.by> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.by byVar) {
        Objects.requireNonNull(byVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(byVar.getNumber());
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

    public static hs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hr newBuilder() {
        return (hr) DEFAULT_INSTANCE.createBuilder();
    }

    public static hs parseDelimitedFrom(InputStream inputStream) {
        return (hs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hs parseFrom(com.google.v.v vVar) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.by byVar) {
        Objects.requireNonNull(byVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, byVar.getNumber());
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002ဇ\u0000", new Object[]{"bitField0_", "itemSubtype_", com.waze.bg.a.by.a(), "showOtherSide_"});
        }
        if (iOrdinal == 3) {
            return new hs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.by getItemSubtype(int i2) {
        com.waze.bg.a.by byVarB = com.waze.bg.a.by.b(this.itemSubtype_.d(i2));
        return byVarB == null ? com.waze.bg.a.by.TRAFFIC_UNSPECIFIED : byVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.by> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public boolean getShowOtherSide() {
        return this.showOtherSide_;
    }

    public boolean hasShowOtherSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hr newBuilder(hs hsVar) {
        return (hr) DEFAULT_INSTANCE.createBuilder(hsVar);
    }

    public static hs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hs parseFrom(com.google.v.z zVar) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hs parseFrom(InputStream inputStream) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hs parseFrom(ByteBuffer byteBuffer) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hs parseFrom(byte[] bArr) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
