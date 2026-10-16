package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cb extends com.google.v.du<cb, ca> implements com.google.v.fj {
    private static final cb DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1001;
    public static final int EXPIRATION_GMT_FIELD_NUMBER = 1002;
    private static volatile com.google.v.fo<cb> PARSER;
    private int bitField0_;
    private long expirationGmt_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<cd> element_ = emptyProtobufList();

    static {
        cb cbVar = new cb();
        DEFAULT_INSTANCE = cbVar;
        com.google.v.du.registerDefaultInstance(cb.class, cbVar);
    }

    private cb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllElement(Iterable<? extends cd> iterable) {
        ensureElementIsMutable();
        com.google.v.c.addAll(iterable, this.element_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addElement(int i2, cd cdVar) {
        Objects.requireNonNull(cdVar);
        ensureElementIsMutable();
        this.element_.add(i2, cdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElement() {
        this.element_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpirationGmt() {
        this.bitField0_ &= -2;
        this.expirationGmt_ = 0L;
    }

    private void ensureElementIsMutable() {
        com.google.v.eo<cd> eoVar = this.element_;
        if (eoVar.c()) {
            return;
        }
        this.element_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ca newBuilder() {
        return (ca) DEFAULT_INSTANCE.createBuilder();
    }

    public static cb parseDelimitedFrom(InputStream inputStream) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(com.google.v.v vVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeElement(int i2) {
        ensureElementIsMutable();
        this.element_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElement(int i2, cd cdVar) {
        Objects.requireNonNull(cdVar);
        ensureElementIsMutable();
        this.element_.set(i2, cdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpirationGmt(long j2) {
        this.bitField0_ |= 1;
        this.expirationGmt_ = j2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001ϩϪ\u0002\u0000\u0001\u0001ϩЛϪဂ\u0000", new Object[]{"bitField0_", "element_", cd.class, "expirationGmt_"});
            case 3:
                return new cb();
            case 4:
                return new ca(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<cb> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cb.class) {
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

    public cd getElement(int i2) {
        return this.element_.get(i2);
    }

    public int getElementCount() {
        return this.element_.size();
    }

    public List<cd> getElementList() {
        return this.element_;
    }

    public ce getElementOrBuilder(int i2) {
        return this.element_.get(i2);
    }

    public List<? extends ce> getElementOrBuilderList() {
        return this.element_;
    }

    public long getExpirationGmt() {
        return this.expirationGmt_;
    }

    public boolean hasExpirationGmt() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ca newBuilder(cb cbVar) {
        return (ca) DEFAULT_INSTANCE.createBuilder(cbVar);
    }

    public static cb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cb parseFrom(com.google.v.z zVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addElement(cd cdVar) {
        Objects.requireNonNull(cdVar);
        ensureElementIsMutable();
        this.element_.add(cdVar);
    }

    public static cb parseFrom(InputStream inputStream) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(ByteBuffer byteBuffer) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cb parseFrom(byte[] bArr) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
