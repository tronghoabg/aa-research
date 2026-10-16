package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class eh extends com.google.v.du<eh, ef> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTES_FIELD_NUMBER = 1;
    private static final eh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<eh> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private com.google.v.eo<dk> alternativeRoutes_ = emptyProtobufList();
    private int reason_;

    static {
        eh ehVar = new eh();
        DEFAULT_INSTANCE = ehVar;
        com.google.v.du.registerDefaultInstance(eh.class, ehVar);
    }

    private eh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlternativeRoutes(Iterable<? extends dk> iterable) {
        ensureAlternativeRoutesIsMutable();
        com.google.v.c.addAll(iterable, this.alternativeRoutes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlternativeRoutes(int i2, dk dkVar) {
        Objects.requireNonNull(dkVar);
        ensureAlternativeRoutesIsMutable();
        this.alternativeRoutes_.add(i2, dkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRoutes() {
        this.alternativeRoutes_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    private void ensureAlternativeRoutesIsMutable() {
        com.google.v.eo<dk> eoVar = this.alternativeRoutes_;
        if (eoVar.c()) {
            return;
        }
        this.alternativeRoutes_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static eh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ef newBuilder() {
        return (ef) DEFAULT_INSTANCE.createBuilder();
    }

    public static eh parseDelimitedFrom(InputStream inputStream) {
        return (eh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eh parseFrom(com.google.v.v vVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlternativeRoutes(int i2) {
        ensureAlternativeRoutesIsMutable();
        this.alternativeRoutes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRoutes(int i2, dk dkVar) {
        Objects.requireNonNull(dkVar);
        ensureAlternativeRoutesIsMutable();
        this.alternativeRoutes_.set(i2, dkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(eg egVar) {
        this.reason_ = egVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"alternativeRoutes_", dk.class, "reason_"});
        }
        if (iOrdinal == 3) {
            return new eh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ef(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public dk getAlternativeRoutes(int i2) {
        return this.alternativeRoutes_.get(i2);
    }

    public int getAlternativeRoutesCount() {
        return this.alternativeRoutes_.size();
    }

    public List<dk> getAlternativeRoutesList() {
        return this.alternativeRoutes_;
    }

    public dl getAlternativeRoutesOrBuilder(int i2) {
        return this.alternativeRoutes_.get(i2);
    }

    public List<? extends dl> getAlternativeRoutesOrBuilderList() {
        return this.alternativeRoutes_;
    }

    public eg getReason() {
        eg egVar;
        switch (this.reason_) {
            case 0:
                egVar = eg.REASON_UNSPECIFIED;
                break;
            case 1:
                egVar = eg.INITIAL;
                break;
            case 2:
                egVar = eg.ALTERNATIVE_RETURNED;
                break;
            case 3:
                egVar = eg.REROUTE;
                break;
            case 4:
                egVar = eg.REACHED_WAYPOINT;
                break;
            case 5:
                egVar = eg.ROUTE_SETTINGS_CHANGED;
                break;
            case 6:
                egVar = eg.HOV_TOGGLE;
                break;
            default:
                egVar = null;
                break;
        }
        return egVar == null ? eg.UNRECOGNIZED : egVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public static ef newBuilder(eh ehVar) {
        return (ef) DEFAULT_INSTANCE.createBuilder(ehVar);
    }

    public static eh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eh parseFrom(com.google.v.z zVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlternativeRoutes(dk dkVar) {
        Objects.requireNonNull(dkVar);
        ensureAlternativeRoutesIsMutable();
        this.alternativeRoutes_.add(dkVar);
    }

    public static eh parseFrom(InputStream inputStream) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eh parseFrom(ByteBuffer byteBuffer) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eh parseFrom(byte[] bArr) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
