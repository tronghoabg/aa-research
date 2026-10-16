package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hl extends com.google.v.du<hl, hk> implements com.google.v.fj {
    public static final int CAMPAIGNS_FIELD_NUMBER = 1;
    private static final hl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hl> PARSER;
    private com.google.v.eo<hi> campaigns_ = emptyProtobufList();

    static {
        hl hlVar = new hl();
        DEFAULT_INSTANCE = hlVar;
        com.google.v.du.registerDefaultInstance(hl.class, hlVar);
    }

    private hl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCampaigns(Iterable<? extends hi> iterable) {
        ensureCampaignsIsMutable();
        com.google.v.c.addAll(iterable, this.campaigns_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCampaigns(int i2, hi hiVar) {
        Objects.requireNonNull(hiVar);
        ensureCampaignsIsMutable();
        this.campaigns_.add(i2, hiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaigns() {
        this.campaigns_ = emptyProtobufList();
    }

    private void ensureCampaignsIsMutable() {
        com.google.v.eo<hi> eoVar = this.campaigns_;
        if (eoVar.c()) {
            return;
        }
        this.campaigns_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hk newBuilder() {
        return (hk) DEFAULT_INSTANCE.createBuilder();
    }

    public static hl parseDelimitedFrom(InputStream inputStream) {
        return (hl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hl parseFrom(com.google.v.v vVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCampaigns(int i2) {
        ensureCampaignsIsMutable();
        this.campaigns_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaigns(int i2, hi hiVar) {
        Objects.requireNonNull(hiVar);
        ensureCampaignsIsMutable();
        this.campaigns_.set(i2, hiVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"campaigns_", hi.class});
        }
        if (iOrdinal == 3) {
            return new hl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hi getCampaigns(int i2) {
        return this.campaigns_.get(i2);
    }

    public int getCampaignsCount() {
        return this.campaigns_.size();
    }

    public List<hi> getCampaignsList() {
        return this.campaigns_;
    }

    public hj getCampaignsOrBuilder(int i2) {
        return this.campaigns_.get(i2);
    }

    public List<? extends hj> getCampaignsOrBuilderList() {
        return this.campaigns_;
    }

    public static hk newBuilder(hl hlVar) {
        return (hk) DEFAULT_INSTANCE.createBuilder(hlVar);
    }

    public static hl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hl parseFrom(com.google.v.z zVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCampaigns(hi hiVar) {
        Objects.requireNonNull(hiVar);
        ensureCampaignsIsMutable();
        this.campaigns_.add(hiVar);
    }

    public static hl parseFrom(InputStream inputStream) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hl parseFrom(ByteBuffer byteBuffer) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hl parseFrom(byte[] bArr) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
