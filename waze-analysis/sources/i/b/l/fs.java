package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fs extends com.google.v.du<fs, fr> implements com.google.v.fj {
    private static final fs DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fs> PARSER = null;
    public static final int SHOW_OTHER_SIDE_FIELD_NUMBER = 2;
    private static final com.google.v.el<com.waze.bg.a.br> itemSubtype_converter_ = new ff(3);
    private int bitField0_;
    private com.google.v.ek itemSubtype_ = emptyIntList();
    private boolean showOtherSide_;

    static {
        fs fsVar = new fs();
        DEFAULT_INSTANCE = fsVar;
        com.google.v.du.registerDefaultInstance(fs.class, fsVar);
    }

    private fs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.br> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.br> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.br brVar) {
        Objects.requireNonNull(brVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(brVar.getNumber());
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

    public static fs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fr newBuilder() {
        return (fr) DEFAULT_INSTANCE.createBuilder();
    }

    public static fs parseDelimitedFrom(InputStream inputStream) {
        return (fs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fs parseFrom(com.google.v.v vVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.br brVar) {
        Objects.requireNonNull(brVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, brVar.getNumber());
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002ဇ\u0000", new Object[]{"bitField0_", "itemSubtype_", com.waze.bg.a.br.a(), "showOtherSide_"});
        }
        if (iOrdinal == 3) {
            return new fs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.br getItemSubtype(int i2) {
        com.waze.bg.a.br brVarB = com.waze.bg.a.br.b(this.itemSubtype_.d(i2));
        return brVarB == null ? com.waze.bg.a.br.CRASH_UNSPECIFIED : brVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.br> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public boolean getShowOtherSide() {
        return this.showOtherSide_;
    }

    public boolean hasShowOtherSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fr newBuilder(fs fsVar) {
        return (fr) DEFAULT_INSTANCE.createBuilder(fsVar);
    }

    public static fs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fs parseFrom(com.google.v.z zVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fs parseFrom(InputStream inputStream) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fs parseFrom(ByteBuffer byteBuffer) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fs parseFrom(byte[] bArr) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
