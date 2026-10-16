package i.b.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class z extends du<z, y> implements fj {
    private static final z DEFAULT_INSTANCE;
    public static final int DISPLAY_GROUP_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile fo<z> PARSER = null;
    public static final int SERVER_HOSTNAME_FIELD_NUMBER = 3;
    public static final int TRACE_FIELD_NUMBER = 4;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String id_ = "";
    private eo<g> displayGroup_ = emptyProtobufList();
    private String serverHostname_ = "";
    private String trace_ = "";

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        du.registerDefaultInstance(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisplayGroup(Iterable<? extends g> iterable) {
        ensureDisplayGroupIsMutable();
        com.google.v.c.addAll(iterable, this.displayGroup_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayGroup(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureDisplayGroupIsMutable();
        this.displayGroup_.add(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayGroup() {
        this.displayGroup_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerHostname() {
        this.bitField0_ &= -3;
        this.serverHostname_ = getDefaultInstance().getServerHostname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrace() {
        this.bitField0_ &= -5;
        this.trace_ = getDefaultInstance().getTrace();
    }

    private void ensureDisplayGroupIsMutable() {
        eo<g> eoVar = this.displayGroup_;
        if (eoVar.c()) {
            return;
        }
        this.displayGroup_ = du.mutableCopy(eoVar);
    }

    public static z getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static y newBuilder() {
        return (y) DEFAULT_INSTANCE.createBuilder();
    }

    public static z parseDelimitedFrom(InputStream inputStream) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(com.google.v.v vVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<z> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDisplayGroup(int i2) {
        ensureDisplayGroupIsMutable();
        this.displayGroup_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayGroup(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureDisplayGroupIsMutable();
        this.displayGroup_.set(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerHostname(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.serverHostname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerHostnameBytes(com.google.v.v vVar) {
        this.serverHostname_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrace(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.trace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceBytes(com.google.v.v vVar) {
        this.trace_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"bitField0_", "id_", "displayGroup_", g.class, "serverHostname_", "trace_"});
            case 3:
                return new z();
            case 4:
                return new y(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<z> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (z.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public g getDisplayGroup(int i2) {
        return this.displayGroup_.get(i2);
    }

    public int getDisplayGroupCount() {
        return this.displayGroup_.size();
    }

    public List<g> getDisplayGroupList() {
        return this.displayGroup_;
    }

    public h getDisplayGroupOrBuilder(int i2) {
        return this.displayGroup_.get(i2);
    }

    public List<? extends h> getDisplayGroupOrBuilderList() {
        return this.displayGroup_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getServerHostname() {
        return this.serverHostname_;
    }

    public com.google.v.v getServerHostnameBytes() {
        return com.google.v.v.s(this.serverHostname_);
    }

    public String getTrace() {
        return this.trace_;
    }

    public com.google.v.v getTraceBytes() {
        return com.google.v.v.s(this.trace_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasServerHostname() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrace() {
        return (this.bitField0_ & 4) != 0;
    }

    public static y newBuilder(z zVar) {
        return (y) DEFAULT_INSTANCE.createBuilder(zVar);
    }

    public static z parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (z) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(com.google.v.v vVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static z parseFrom(com.google.v.z zVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static z parseFrom(com.google.v.z zVar, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisplayGroup(g gVar) {
        Objects.requireNonNull(gVar);
        ensureDisplayGroupIsMutable();
        this.displayGroup_.add(gVar);
    }

    public static z parseFrom(InputStream inputStream) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static z parseFrom(InputStream inputStream, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static z parseFrom(ByteBuffer byteBuffer) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static z parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static z parseFrom(byte[] bArr) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static z parseFrom(byte[] bArr, de deVar) {
        return (z) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
