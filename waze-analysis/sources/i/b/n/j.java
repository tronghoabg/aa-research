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
public final class j extends du<j, i> implements fj {
    private static final j DEFAULT_INSTANCE;
    public static final int EV_CONNECTOR_TYPE_IDS_FIELD_NUMBER = 1;
    public static final int EV_NETWORKS_FIELD_NUMBER = 2;
    private static volatile fo<j> PARSER;
    private eo<String> evConnectorTypeIds_ = emptyProtobufList();
    private eo<String> evNetworks_ = emptyProtobufList();

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvConnectorTypeIds(Iterable<String> iterable) {
        ensureEvConnectorTypeIdsIsMutable();
        com.google.v.c.addAll(iterable, this.evConnectorTypeIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvNetworks(Iterable<String> iterable) {
        ensureEvNetworksIsMutable();
        com.google.v.c.addAll(iterable, this.evNetworks_);
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
    public void addEvNetworks(String str) {
        Objects.requireNonNull(str);
        ensureEvNetworksIsMutable();
        this.evNetworks_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvNetworksBytes(com.google.v.v vVar) {
        ensureEvNetworksIsMutable();
        this.evNetworks_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnectorTypeIds() {
        this.evConnectorTypeIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvNetworks() {
        this.evNetworks_ = emptyProtobufList();
    }

    private void ensureEvConnectorTypeIdsIsMutable() {
        eo<String> eoVar = this.evConnectorTypeIds_;
        if (eoVar.c()) {
            return;
        }
        this.evConnectorTypeIds_ = du.mutableCopy(eoVar);
    }

    private void ensureEvNetworksIsMutable() {
        eo<String> eoVar = this.evNetworks_;
        if (eoVar.c()) {
            return;
        }
        this.evNetworks_ = du.mutableCopy(eoVar);
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(com.google.v.v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnectorTypeIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEvConnectorTypeIdsIsMutable();
        this.evConnectorTypeIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvNetworks(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEvNetworksIsMutable();
        this.evNetworks_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"evConnectorTypeIds_", "evNetworks_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
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

    public String getEvNetworks(int i2) {
        return this.evNetworks_.get(i2);
    }

    public com.google.v.v getEvNetworksBytes(int i2) {
        return com.google.v.v.s(this.evNetworks_.get(i2));
    }

    public int getEvNetworksCount() {
        return this.evNetworks_.size();
    }

    public List<String> getEvNetworksList() {
        return this.evNetworks_;
    }

    public static i newBuilder(j jVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(com.google.v.v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(com.google.v.z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(com.google.v.z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
