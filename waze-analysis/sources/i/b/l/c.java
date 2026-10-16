package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c extends com.google.v.du<c, a> implements com.google.v.fj {
    public static final int COMMUNITY_FIELD_NUMBER = 10243;
    private static final c DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<c> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 10241;
    private int bitField0_;
    private com.google.v.eo<i.b.p.o> community_ = emptyProtobufList();
    private int type_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        com.google.v.du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommunity(Iterable<? extends i.b.p.o> iterable) {
        ensureCommunityIsMutable();
        com.google.v.c.addAll(iterable, this.community_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(int i2, i.b.p.o oVar) {
        Objects.requireNonNull(oVar);
        ensureCommunityIsMutable();
        this.community_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommunity() {
        this.community_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    private void ensureCommunityIsMutable() {
        com.google.v.eo<i.b.p.o> eoVar = this.community_;
        if (eoVar.c()) {
            return;
        }
        this.community_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(com.google.v.v vVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCommunity(int i2) {
        ensureCommunityIsMutable();
        this.community_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommunity(int i2, i.b.p.o oVar) {
        Objects.requireNonNull(oVar);
        ensureCommunityIsMutable();
        this.community_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(b bVar) {
        this.type_ = bVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001⠁⠃\u0002\u0000\u0001\u0000⠁᠌\u0000⠃\u001b", new Object[]{"bitField0_", "type_", e.f48655b, "community_", i.b.p.o.class});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.p.o getCommunity(int i2) {
        return this.community_.get(i2);
    }

    public int getCommunityCount() {
        return this.community_.size();
    }

    public List<i.b.p.o> getCommunityList() {
        return this.community_;
    }

    public i.b.p.p getCommunityOrBuilder(int i2) {
        return this.community_.get(i2);
    }

    public List<? extends i.b.p.p> getCommunityOrBuilderList() {
        return this.community_;
    }

    public b getType() {
        b bVarA = b.a(this.type_);
        return bVarA == null ? b.UNKNOWN : bVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(com.google.v.z zVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommunity(i.b.p.o oVar) {
        Objects.requireNonNull(oVar);
        ensureCommunityIsMutable();
        this.community_.add(oVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (c) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
