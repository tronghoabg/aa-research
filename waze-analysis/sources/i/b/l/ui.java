package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ui extends com.google.v.du<ui, uh> implements com.google.v.fj {
    private static final ui DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ui> PARSER = null;
    public static final int TAKEOVER_FIELD_NUMBER = 1;
    private com.google.v.eo<ts> takeover_ = emptyProtobufList();

    static {
        ui uiVar = new ui();
        DEFAULT_INSTANCE = uiVar;
        com.google.v.du.registerDefaultInstance(ui.class, uiVar);
    }

    private ui() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTakeover(Iterable<? extends ts> iterable) {
        ensureTakeoverIsMutable();
        com.google.v.c.addAll(iterable, this.takeover_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTakeover(int i2, ts tsVar) {
        Objects.requireNonNull(tsVar);
        ensureTakeoverIsMutable();
        this.takeover_.add(i2, tsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeover() {
        this.takeover_ = emptyProtobufList();
    }

    private void ensureTakeoverIsMutable() {
        com.google.v.eo<ts> eoVar = this.takeover_;
        if (eoVar.c()) {
            return;
        }
        this.takeover_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ui getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static uh newBuilder() {
        return (uh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ui parseDelimitedFrom(InputStream inputStream) {
        return (ui) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ui parseFrom(com.google.v.v vVar) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ui> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTakeover(int i2) {
        ensureTakeoverIsMutable();
        this.takeover_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeover(int i2, ts tsVar) {
        Objects.requireNonNull(tsVar);
        ensureTakeoverIsMutable();
        this.takeover_.set(i2, tsVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"takeover_", ts.class});
        }
        if (iOrdinal == 3) {
            return new ui();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new uh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ui> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ui.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ts getTakeover(int i2) {
        return this.takeover_.get(i2);
    }

    public int getTakeoverCount() {
        return this.takeover_.size();
    }

    public List<ts> getTakeoverList() {
        return this.takeover_;
    }

    public tt getTakeoverOrBuilder(int i2) {
        return this.takeover_.get(i2);
    }

    public List<? extends tt> getTakeoverOrBuilderList() {
        return this.takeover_;
    }

    public static uh newBuilder(ui uiVar) {
        return (uh) DEFAULT_INSTANCE.createBuilder(uiVar);
    }

    public static ui parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ui) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ui parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ui parseFrom(com.google.v.z zVar) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ui parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTakeover(ts tsVar) {
        Objects.requireNonNull(tsVar);
        ensureTakeoverIsMutable();
        this.takeover_.add(tsVar);
    }

    public static ui parseFrom(InputStream inputStream) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ui parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ui parseFrom(ByteBuffer byteBuffer) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ui parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ui parseFrom(byte[] bArr) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ui parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ui) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
