package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bll extends com.google.v.du<bll, bli> implements com.google.v.fj {
    private static final bll DEFAULT_INSTANCE;
    public static final int IN_CAR_CONTENT_ELEMENT_TYPES_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<bll> PARSER = null;
    public static final int ROUTE_ALT_ID_FIELD_NUMBER = 2;
    public static final int ROUTE_UUID_FIELD_NUMBER = 3;
    public static final int SELECTION_METHOD_FIELD_NUMBER = 1;
    private static final com.google.v.el<blj> inCarContentElementTypes_converter_ = new ve(16);
    private int bitField0_;
    private int inCarContentElementTypesMemoizedSerializedSize;
    private long routeAltId_;
    private int selectionMethod_;
    private String routeUuid_ = "";
    private com.google.v.ek inCarContentElementTypes_ = emptyIntList();

    static {
        bll bllVar = new bll();
        DEFAULT_INSTANCE = bllVar;
        com.google.v.du.registerDefaultInstance(bll.class, bllVar);
    }

    private bll() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInCarContentElementTypes(Iterable<? extends blj> iterable) {
        ensureInCarContentElementTypesIsMutable();
        Iterator<? extends blj> it = iterable.iterator();
        while (it.hasNext()) {
            this.inCarContentElementTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInCarContentElementTypesValue(Iterable<Integer> iterable) {
        ensureInCarContentElementTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.inCarContentElementTypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInCarContentElementTypes(blj bljVar) {
        Objects.requireNonNull(bljVar);
        ensureInCarContentElementTypesIsMutable();
        this.inCarContentElementTypes_.i(bljVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInCarContentElementTypesValue(int i2) {
        ensureInCarContentElementTypesIsMutable();
        this.inCarContentElementTypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarContentElementTypes() {
        this.inCarContentElementTypes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteAltId() {
        this.bitField0_ &= -2;
        this.routeAltId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUuid() {
        this.routeUuid_ = getDefaultInstance().getRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectionMethod() {
        this.selectionMethod_ = 0;
    }

    private void ensureInCarContentElementTypesIsMutable() {
        com.google.v.ek ekVar = this.inCarContentElementTypes_;
        if (ekVar.c()) {
            return;
        }
        this.inCarContentElementTypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static bll getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bli newBuilder() {
        return (bli) DEFAULT_INSTANCE.createBuilder();
    }

    public static bll parseDelimitedFrom(InputStream inputStream) {
        return (bll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bll parseFrom(com.google.v.v vVar) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bll> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarContentElementTypes(int i2, blj bljVar) {
        Objects.requireNonNull(bljVar);
        ensureInCarContentElementTypesIsMutable();
        this.inCarContentElementTypes_.e(i2, bljVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarContentElementTypesValue(int i2, int i3) {
        ensureInCarContentElementTypesIsMutable();
        this.inCarContentElementTypes_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteAltId(long j2) {
        this.bitField0_ |= 1;
        this.routeAltId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.routeUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routeUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionMethod(blk blkVar) {
        this.selectionMethod_ = blkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectionMethodValue(int i2) {
        this.selectionMethod_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002ဂ\u0000\u0003Ȉ\u0004,", new Object[]{"bitField0_", "selectionMethod_", "routeAltId_", "routeUuid_", "inCarContentElementTypes_"});
        }
        if (iOrdinal == 3) {
            return new bll();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bli(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bll> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bll.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public blj getInCarContentElementTypes(int i2) {
        blj bljVarA = blj.a(this.inCarContentElementTypes_.d(i2));
        return bljVarA == null ? blj.UNRECOGNIZED : bljVarA;
    }

    public int getInCarContentElementTypesCount() {
        return this.inCarContentElementTypes_.size();
    }

    public List<blj> getInCarContentElementTypesList() {
        return new com.google.v.em(this.inCarContentElementTypes_, inCarContentElementTypes_converter_);
    }

    public int getInCarContentElementTypesValue(int i2) {
        return this.inCarContentElementTypes_.d(i2);
    }

    public List<Integer> getInCarContentElementTypesValueList() {
        return this.inCarContentElementTypes_;
    }

    public long getRouteAltId() {
        return this.routeAltId_;
    }

    public String getRouteUuid() {
        return this.routeUuid_;
    }

    public com.google.v.v getRouteUuidBytes() {
        return com.google.v.v.s(this.routeUuid_);
    }

    public blk getSelectionMethod() {
        int i2 = this.selectionMethod_;
        blk blkVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : blk.USER_CLICK : blk.DEFAULT_SELECTION : blk.SELECTION_METHOD_UNSPECIFIED;
        return blkVar == null ? blk.UNRECOGNIZED : blkVar;
    }

    public int getSelectionMethodValue() {
        return this.selectionMethod_;
    }

    public boolean hasRouteAltId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bli newBuilder(bll bllVar) {
        return (bli) DEFAULT_INSTANCE.createBuilder(bllVar);
    }

    public static bll parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bll) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bll parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bll parseFrom(com.google.v.z zVar) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bll parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bll parseFrom(InputStream inputStream) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bll parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bll parseFrom(ByteBuffer byteBuffer) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bll parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bll parseFrom(byte[] bArr) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bll parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bll) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
