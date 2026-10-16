package i.b.i;

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
/* loaded from: classes7.dex */
public final class am extends du<am, al> implements fj {
    public static final int CONFIG_ITEM_FIELD_NUMBER = 1;
    private static final am DEFAULT_INSTANCE;
    public static final int LAST_SYNCED_FIELD_NUMBER = 2;
    private static volatile fo<am> PARSER;
    private int bitField0_;
    private eo<o> configItem_ = emptyProtobufList();
    private long lastSynced_;

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConfigItem(Iterable<? extends o> iterable) {
        ensureConfigItemIsMutable();
        com.google.v.c.addAll(iterable, this.configItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigItem(int i2, o oVar) {
        Objects.requireNonNull(oVar);
        ensureConfigItemIsMutable();
        this.configItem_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigItem() {
        this.configItem_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastSynced() {
        this.bitField0_ &= -2;
        this.lastSynced_ = 0L;
    }

    private void ensureConfigItemIsMutable() {
        eo<o> eoVar = this.configItem_;
        if (eoVar.c()) {
            return;
        }
        this.configItem_ = du.mutableCopy(eoVar);
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConfigItem(int i2) {
        ensureConfigItemIsMutable();
        this.configItem_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigItem(int i2, o oVar) {
        Objects.requireNonNull(oVar);
        ensureConfigItemIsMutable();
        this.configItem_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSynced(long j2) {
        this.bitField0_ |= 1;
        this.lastSynced_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"bitField0_", "configItem_", o.class, "lastSynced_"});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public o getConfigItem(int i2) {
        return this.configItem_.get(i2);
    }

    public int getConfigItemCount() {
        return this.configItem_.size();
    }

    public List<o> getConfigItemList() {
        return this.configItem_;
    }

    public p getConfigItemOrBuilder(int i2) {
        return this.configItem_.get(i2);
    }

    public List<? extends p> getConfigItemOrBuilderList() {
        return this.configItem_;
    }

    public long getLastSynced() {
        return this.lastSynced_;
    }

    public boolean hasLastSynced() {
        return (this.bitField0_ & 1) != 0;
    }

    public static al newBuilder(am amVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConfigItem(o oVar) {
        Objects.requireNonNull(oVar);
        ensureConfigItemIsMutable();
        this.configItem_.add(oVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
