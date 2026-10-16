package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gv extends com.google.v.du<gv, gu> implements com.google.v.fj {
    private static final gv DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gv> PARSER = null;
    public static final int SHOW_OTHER_SIDE_FIELD_NUMBER = 2;
    private static final com.google.v.el<com.waze.bg.a.bw> itemSubtype_converter_ = new ff(7);
    private int bitField0_;
    private com.google.v.ek itemSubtype_ = emptyIntList();
    private boolean showOtherSide_;

    static {
        gv gvVar = new gv();
        DEFAULT_INSTANCE = gvVar;
        com.google.v.du.registerDefaultInstance(gv.class, gvVar);
    }

    private gv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.bw> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.bw> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(bwVar.getNumber());
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

    public static gv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gu newBuilder() {
        return (gu) DEFAULT_INSTANCE.createBuilder();
    }

    public static gv parseDelimitedFrom(InputStream inputStream) {
        return (gv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gv parseFrom(com.google.v.v vVar) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, bwVar.getNumber());
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002ဇ\u0000", new Object[]{"bitField0_", "itemSubtype_", com.waze.bg.a.bw.a(), "showOtherSide_"});
        }
        if (iOrdinal == 3) {
            return new gv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.bw getItemSubtype(int i2) {
        com.waze.bg.a.bw bwVarB = com.waze.bg.a.bw.b(this.itemSubtype_.d(i2));
        return bwVarB == null ? com.waze.bg.a.bw.POLICE_UNSPECIFIED : bwVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.bw> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public boolean getShowOtherSide() {
        return this.showOtherSide_;
    }

    public boolean hasShowOtherSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gu newBuilder(gv gvVar) {
        return (gu) DEFAULT_INSTANCE.createBuilder(gvVar);
    }

    public static gv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gv parseFrom(com.google.v.z zVar) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gv parseFrom(InputStream inputStream) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gv parseFrom(ByteBuffer byteBuffer) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gv parseFrom(byte[] bArr) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
