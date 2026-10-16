package i.b.n.a;

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
public final class ab extends du<ab, aa> implements fj {
    private static final ab DEFAULT_INSTANCE;
    private static volatile fo<ab> PARSER = null;
    public static final int SERVICE_ID_FIELD_NUMBER = 1;
    private eo<String> serviceId_ = emptyProtobufList();

    static {
        ab abVar = new ab();
        DEFAULT_INSTANCE = abVar;
        du.registerDefaultInstance(ab.class, abVar);
    }

    private ab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServiceId(Iterable<String> iterable) {
        ensureServiceIdIsMutable();
        com.google.v.c.addAll(iterable, this.serviceId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServiceId(String str) {
        Objects.requireNonNull(str);
        ensureServiceIdIsMutable();
        this.serviceId_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServiceIdBytes(com.google.v.v vVar) {
        ensureServiceIdIsMutable();
        this.serviceId_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceId() {
        this.serviceId_ = emptyProtobufList();
    }

    private void ensureServiceIdIsMutable() {
        eo<String> eoVar = this.serviceId_;
        if (eoVar.c()) {
            return;
        }
        this.serviceId_ = du.mutableCopy(eoVar);
    }

    public static ab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aa newBuilder() {
        return (aa) DEFAULT_INSTANCE.createBuilder();
    }

    public static ab parseDelimitedFrom(InputStream inputStream) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(com.google.v.v vVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceId(int i2, String str) {
        Objects.requireNonNull(str);
        ensureServiceIdIsMutable();
        this.serviceId_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"serviceId_"});
        }
        if (iOrdinal == 3) {
            return new ab();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ab> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ab.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getServiceId(int i2) {
        return this.serviceId_.get(i2);
    }

    public com.google.v.v getServiceIdBytes(int i2) {
        return com.google.v.v.s(this.serviceId_.get(i2));
    }

    public int getServiceIdCount() {
        return this.serviceId_.size();
    }

    public List<String> getServiceIdList() {
        return this.serviceId_;
    }

    public static aa newBuilder(ab abVar) {
        return (aa) DEFAULT_INSTANCE.createBuilder(abVar);
    }

    public static ab parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(com.google.v.v vVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ab parseFrom(com.google.v.z zVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ab parseFrom(com.google.v.z zVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ab parseFrom(InputStream inputStream) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(InputStream inputStream, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(ByteBuffer byteBuffer) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ab parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ab parseFrom(byte[] bArr) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ab parseFrom(byte[] bArr, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
