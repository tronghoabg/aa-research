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
public final class s extends du<s, r> implements fj {
    private static final s DEFAULT_INSTANCE;
    public static final int EV_CONNECTOR_TYPE_IDS_FIELD_NUMBER = 1;
    private static volatile fo<s> PARSER;
    private eo<String> evConnectorTypeIds_ = emptyProtobufList();

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvConnectorTypeIds(Iterable<String> iterable) {
        ensureEvConnectorTypeIdsIsMutable();
        com.google.v.c.addAll(iterable, this.evConnectorTypeIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorTypeIds(String str) {
        Objects.requireNonNull(str);
        ensureEvConnectorTypeIdsIsMutable();
        this.evConnectorTypeIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorTypeIdsBytes(com.google.v.v vVar) {
        ensureEvConnectorTypeIdsIsMutable();
        this.evConnectorTypeIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnectorTypeIds() {
        this.evConnectorTypeIds_ = emptyProtobufList();
    }

    private void ensureEvConnectorTypeIdsIsMutable() {
        eo<String> eoVar = this.evConnectorTypeIds_;
        if (eoVar.c()) {
            return;
        }
        this.evConnectorTypeIds_ = du.mutableCopy(eoVar);
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(com.google.v.v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnectorTypeIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEvConnectorTypeIdsIsMutable();
        this.evConnectorTypeIds_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"evConnectorTypeIds_"});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getEvConnectorTypeIds(int i2) {
        return this.evConnectorTypeIds_.get(i2);
    }

    public com.google.v.v getEvConnectorTypeIdsBytes(int i2) {
        return com.google.v.v.s(this.evConnectorTypeIds_.get(i2));
    }

    public int getEvConnectorTypeIdsCount() {
        return this.evConnectorTypeIds_.size();
    }

    public List<String> getEvConnectorTypeIdsList() {
        return this.evConnectorTypeIds_;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(com.google.v.v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(com.google.v.z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(com.google.v.z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
