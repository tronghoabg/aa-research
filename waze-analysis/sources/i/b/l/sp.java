package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sp extends com.google.v.du<sp, so> implements com.google.v.fj {
    private static final sp DEFAULT_INSTANCE;
    public static final int DESTINATIONINMTE_FIELD_NUMBER = 1;
    public static final int MTEONROUTE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<sp> PARSER;
    private int bitField0_;
    private rw destinationInMte_;
    private com.google.v.eo<rw> mteOnRoute_ = emptyProtobufList();

    static {
        sp spVar = new sp();
        DEFAULT_INSTANCE = spVar;
        com.google.v.du.registerDefaultInstance(sp.class, spVar);
    }

    private sp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMteOnRoute(Iterable<? extends rw> iterable) {
        ensureMteOnRouteIsMutable();
        com.google.v.c.addAll(iterable, this.mteOnRoute_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMteOnRoute(int i2, rw rwVar) {
        Objects.requireNonNull(rwVar);
        ensureMteOnRouteIsMutable();
        this.mteOnRoute_.add(i2, rwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationInMte() {
        this.destinationInMte_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteOnRoute() {
        this.mteOnRoute_ = emptyProtobufList();
    }

    private void ensureMteOnRouteIsMutable() {
        com.google.v.eo<rw> eoVar = this.mteOnRoute_;
        if (eoVar.c()) {
            return;
        }
        this.mteOnRoute_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static sp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationInMte(rw rwVar) {
        Objects.requireNonNull(rwVar);
        rw rwVar2 = this.destinationInMte_;
        if (rwVar2 != null && rwVar2 != rw.getDefaultInstance()) {
            rv rvVarNewBuilder = rw.newBuilder(rwVar2);
            rvVarNewBuilder.mergeFrom((rv) rwVar);
            rwVar = rvVarNewBuilder.buildPartial();
        }
        this.destinationInMte_ = rwVar;
        this.bitField0_ |= 1;
    }

    public static so newBuilder() {
        return (so) DEFAULT_INSTANCE.createBuilder();
    }

    public static sp parseDelimitedFrom(InputStream inputStream) {
        return (sp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sp parseFrom(com.google.v.v vVar) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMteOnRoute(int i2) {
        ensureMteOnRouteIsMutable();
        this.mteOnRoute_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationInMte(rw rwVar) {
        Objects.requireNonNull(rwVar);
        this.destinationInMte_ = rwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteOnRoute(int i2, rw rwVar) {
        Objects.requireNonNull(rwVar);
        ensureMteOnRouteIsMutable();
        this.mteOnRoute_.set(i2, rwVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "destinationInMte_", "mteOnRoute_", rw.class});
        }
        if (iOrdinal == 3) {
            return new sp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new so(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public rw getDestinationInMte() {
        rw rwVar = this.destinationInMte_;
        return rwVar == null ? rw.getDefaultInstance() : rwVar;
    }

    public rw getMteOnRoute(int i2) {
        return this.mteOnRoute_.get(i2);
    }

    public int getMteOnRouteCount() {
        return this.mteOnRoute_.size();
    }

    public List<rw> getMteOnRouteList() {
        return this.mteOnRoute_;
    }

    public rx getMteOnRouteOrBuilder(int i2) {
        return this.mteOnRoute_.get(i2);
    }

    public List<? extends rx> getMteOnRouteOrBuilderList() {
        return this.mteOnRoute_;
    }

    public boolean hasDestinationInMte() {
        return (this.bitField0_ & 1) != 0;
    }

    public static so newBuilder(sp spVar) {
        return (so) DEFAULT_INSTANCE.createBuilder(spVar);
    }

    public static sp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sp parseFrom(com.google.v.z zVar) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMteOnRoute(rw rwVar) {
        Objects.requireNonNull(rwVar);
        ensureMteOnRouteIsMutable();
        this.mteOnRoute_.add(rwVar);
    }

    public static sp parseFrom(InputStream inputStream) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sp parseFrom(ByteBuffer byteBuffer) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sp parseFrom(byte[] bArr) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
