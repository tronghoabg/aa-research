package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bx extends com.google.v.du<bx, bv> implements com.google.v.fj {
    public static final int COORDINATE_FIELD_NUMBER = 2;
    private static final bx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bx> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<u> coordinate_ = emptyProtobufList();

    static {
        bx bxVar = new bx();
        DEFAULT_INSTANCE = bxVar;
        com.google.v.du.registerDefaultInstance(bx.class, bxVar);
    }

    private bx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCoordinate(Iterable<? extends u> iterable) {
        ensureCoordinateIsMutable();
        com.google.v.c.addAll(iterable, this.coordinate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoordinate(int i2, u uVar) {
        Objects.requireNonNull(uVar);
        ensureCoordinateIsMutable();
        this.coordinate_.add(i2, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    private void ensureCoordinateIsMutable() {
        com.google.v.eo<u> eoVar = this.coordinate_;
        if (eoVar.c()) {
            return;
        }
        this.coordinate_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bx parseDelimitedFrom(InputStream inputStream) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(com.google.v.v vVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCoordinate(int i2) {
        ensureCoordinateIsMutable();
        this.coordinate_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(int i2, u uVar) {
        Objects.requireNonNull(uVar);
        ensureCoordinateIsMutable();
        this.coordinate_.set(i2, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bw bwVar) {
        this.type_ = bwVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001᠌\u0000\u0002Л", new Object[]{"bitField0_", "type_", z.f49563j, "coordinate_", u.class});
            case 3:
                return new bx();
            case 4:
                return new bv(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<bx> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (bx.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public u getCoordinate(int i2) {
        return this.coordinate_.get(i2);
    }

    public int getCoordinateCount() {
        return this.coordinate_.size();
    }

    public List<u> getCoordinateList() {
        return this.coordinate_;
    }

    public v getCoordinateOrBuilder(int i2) {
        return this.coordinate_.get(i2);
    }

    public List<? extends v> getCoordinateOrBuilderList() {
        return this.coordinate_;
    }

    public bw getType() {
        bw bwVarA = bw.a(this.type_);
        return bwVarA == null ? bw.POINT : bwVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bv newBuilder(bx bxVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(bxVar);
    }

    public static bx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bx parseFrom(com.google.v.z zVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoordinate(u uVar) {
        Objects.requireNonNull(uVar);
        ensureCoordinateIsMutable();
        this.coordinate_.add(uVar);
    }

    public static bx parseFrom(InputStream inputStream) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(ByteBuffer byteBuffer) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bx parseFrom(byte[] bArr) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
