package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fl extends com.google.v.du<fl, fk> implements com.google.v.fj {
    private static final fl DEFAULT_INSTANCE;
    public static final int ITEM_SUBTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fl> PARSER = null;
    public static final int SHOW_OTHER_SIDE_FIELD_NUMBER = 2;
    private static final com.google.v.el<com.waze.bg.a.bo> itemSubtype_converter_ = new ff(2);
    private int bitField0_;
    private com.google.v.ek itemSubtype_ = emptyIntList();
    private boolean showOtherSide_;

    static {
        fl flVar = new fl();
        DEFAULT_INSTANCE = flVar;
        com.google.v.du.registerDefaultInstance(fl.class, flVar);
    }

    private fl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItemSubtype(Iterable<? extends com.waze.bg.a.bo> iterable) {
        ensureItemSubtypeIsMutable();
        Iterator<? extends com.waze.bg.a.bo> it = iterable.iterator();
        while (it.hasNext()) {
            this.itemSubtype_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItemSubtype(com.waze.bg.a.bo boVar) {
        Objects.requireNonNull(boVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.i(boVar.getNumber());
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

    public static fl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fk newBuilder() {
        return (fk) DEFAULT_INSTANCE.createBuilder();
    }

    public static fl parseDelimitedFrom(InputStream inputStream) {
        return (fl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fl parseFrom(com.google.v.v vVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemSubtype(int i2, com.waze.bg.a.bo boVar) {
        Objects.requireNonNull(boVar);
        ensureItemSubtypeIsMutable();
        this.itemSubtype_.e(i2, boVar.getNumber());
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002ဇ\u0000", new Object[]{"bitField0_", "itemSubtype_", com.waze.bg.a.bo.a(), "showOtherSide_"});
        }
        if (iOrdinal == 3) {
            return new fl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.bo getItemSubtype(int i2) {
        com.waze.bg.a.bo boVarB = com.waze.bg.a.bo.b(this.itemSubtype_.d(i2));
        return boVarB == null ? com.waze.bg.a.bo.BLOCKED_LANE_UNSPECIFIED : boVarB;
    }

    public int getItemSubtypeCount() {
        return this.itemSubtype_.size();
    }

    public List<com.waze.bg.a.bo> getItemSubtypeList() {
        return new com.google.v.em(this.itemSubtype_, itemSubtype_converter_);
    }

    public boolean getShowOtherSide() {
        return this.showOtherSide_;
    }

    public boolean hasShowOtherSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fk newBuilder(fl flVar) {
        return (fk) DEFAULT_INSTANCE.createBuilder(flVar);
    }

    public static fl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fl parseFrom(com.google.v.z zVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fl parseFrom(InputStream inputStream) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fl parseFrom(ByteBuffer byteBuffer) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fl parseFrom(byte[] bArr) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
