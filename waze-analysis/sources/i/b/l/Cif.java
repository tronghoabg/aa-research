package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* renamed from: i.b.l.if, reason: invalid class name */
/* loaded from: classes8.dex */
public final class Cif extends com.google.v.du<Cif, ie> implements com.google.v.fj {
    private static final Cif DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<Cif> PARSER = null;
    public static final int SHOW_OTHER_SIDE_FIELD_NUMBER = 2;
    private static final com.google.v.el<com.waze.bg.a.ca> itemSubtype_converter_ = new ff(9);
    private int bitField0_;
    private com.google.v.ek itemSubtype_ = emptyIntList();
    private boolean showOtherSide_;

    static {
        Cif cif = new Cif();
        DEFAULT_INSTANCE = cif;
        com.google.v.du.registerDefaultInstance(Cif.class, cif);
    }

    private Cif() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.ca> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.ca> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.ca caVar) {
        Objects.requireNonNull(caVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(caVar.getNumber());
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

    public static Cif getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ie newBuilder() {
        return (ie) DEFAULT_INSTANCE.createBuilder();
    }

    public static Cif parseDelimitedFrom(InputStream inputStream) {
        return (Cif) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cif parseFrom(com.google.v.v vVar) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<Cif> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.ca caVar) {
        Objects.requireNonNull(caVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, caVar.getNumber());
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002ဇ\u0000", new Object[]{"bitField0_", "itemSubtype_", com.waze.bg.a.ca.a(), "showOtherSide_"});
        }
        if (iOrdinal == 3) {
            return new Cif();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ie(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<Cif> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Cif.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.ca getItemSubtype(int i2) {
        com.waze.bg.a.ca caVarB = com.waze.bg.a.ca.b(this.itemSubtype_.d(i2));
        return caVarB == null ? com.waze.bg.a.ca.WEATHER_UNSPECIFIED : caVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.ca> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public boolean getShowOtherSide() {
        return this.showOtherSide_;
    }

    public boolean hasShowOtherSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ie newBuilder(Cif cif) {
        return (ie) DEFAULT_INSTANCE.createBuilder(cif);
    }

    public static Cif parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cif) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cif parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Cif parseFrom(com.google.v.z zVar) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Cif parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Cif parseFrom(InputStream inputStream) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Cif parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Cif parseFrom(ByteBuffer byteBuffer) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Cif parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Cif parseFrom(byte[] bArr) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Cif parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (Cif) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
