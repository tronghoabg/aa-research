package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class acp extends com.google.v.du<acp, aco> implements com.google.v.fj {
    private static final acp DEFAULT_INSTANCE;
    public static final int MAP_BUTTONS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<acp> PARSER = null;
    public static final int TOP_BAR_BUTTONS_FIELD_NUMBER = 2;
    private static final com.google.v.el<ack> mapButtons_converter_ = new ve(4);
    private static final com.google.v.el<ack> topBarButtons_converter_ = new ve(5);
    private int mapButtonsMemoizedSerializedSize;
    private int topBarButtonsMemoizedSerializedSize;
    private com.google.v.ek mapButtons_ = emptyIntList();
    private com.google.v.ek topBarButtons_ = emptyIntList();

    static {
        acp acpVar = new acp();
        DEFAULT_INSTANCE = acpVar;
        com.google.v.du.registerDefaultInstance(acp.class, acpVar);
    }

    private acp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMapButtons(Iterable<? extends ack> iterable) {
        ensureMapButtonsIsMutable();
        Iterator<? extends ack> it = iterable.iterator();
        while (it.hasNext()) {
            this.mapButtons_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMapButtonsValue(Iterable<Integer> iterable) {
        ensureMapButtonsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.mapButtons_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTopBarButtons(Iterable<? extends ack> iterable) {
        ensureTopBarButtonsIsMutable();
        Iterator<? extends ack> it = iterable.iterator();
        while (it.hasNext()) {
            this.topBarButtons_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTopBarButtonsValue(Iterable<Integer> iterable) {
        ensureTopBarButtonsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.topBarButtons_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMapButtons(ack ackVar) {
        Objects.requireNonNull(ackVar);
        ensureMapButtonsIsMutable();
        this.mapButtons_.i(ackVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMapButtonsValue(int i2) {
        ensureMapButtonsIsMutable();
        this.mapButtons_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopBarButtons(ack ackVar) {
        Objects.requireNonNull(ackVar);
        ensureTopBarButtonsIsMutable();
        this.topBarButtons_.i(ackVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTopBarButtonsValue(int i2) {
        ensureTopBarButtonsIsMutable();
        this.topBarButtons_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapButtons() {
        this.mapButtons_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopBarButtons() {
        this.topBarButtons_ = emptyIntList();
    }

    private void ensureMapButtonsIsMutable() {
        com.google.v.ek ekVar = this.mapButtons_;
        if (ekVar.c()) {
            return;
        }
        this.mapButtons_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureTopBarButtonsIsMutable() {
        com.google.v.ek ekVar = this.topBarButtons_;
        if (ekVar.c()) {
            return;
        }
        this.topBarButtons_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static acp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aco newBuilder() {
        return (aco) DEFAULT_INSTANCE.createBuilder();
    }

    public static acp parseDelimitedFrom(InputStream inputStream) {
        return (acp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acp parseFrom(com.google.v.v vVar) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<acp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapButtons(int i2, ack ackVar) {
        Objects.requireNonNull(ackVar);
        ensureMapButtonsIsMutable();
        this.mapButtons_.e(i2, ackVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapButtonsValue(int i2, int i3) {
        ensureMapButtonsIsMutable();
        this.mapButtons_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBarButtons(int i2, ack ackVar) {
        Objects.requireNonNull(ackVar);
        ensureTopBarButtonsIsMutable();
        this.topBarButtons_.e(i2, ackVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopBarButtonsValue(int i2, int i3) {
        ensureTopBarButtonsIsMutable();
        this.topBarButtons_.e(i2, i3);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002,", new Object[]{"mapButtons_", "topBarButtons_"});
        }
        if (iOrdinal == 3) {
            return new acp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aco(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<acp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (acp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ack getMapButtons(int i2) {
        ack ackVarA = ack.a(this.mapButtons_.d(i2));
        return ackVarA == null ? ack.UNRECOGNIZED : ackVarA;
    }

    public int getMapButtonsCount() {
        return this.mapButtons_.size();
    }

    public List<ack> getMapButtonsList() {
        return new com.google.v.em(this.mapButtons_, mapButtons_converter_);
    }

    public int getMapButtonsValue(int i2) {
        return this.mapButtons_.d(i2);
    }

    public List<Integer> getMapButtonsValueList() {
        return this.mapButtons_;
    }

    public ack getTopBarButtons(int i2) {
        ack ackVarA = ack.a(this.topBarButtons_.d(i2));
        return ackVarA == null ? ack.UNRECOGNIZED : ackVarA;
    }

    public int getTopBarButtonsCount() {
        return this.topBarButtons_.size();
    }

    public List<ack> getTopBarButtonsList() {
        return new com.google.v.em(this.topBarButtons_, topBarButtons_converter_);
    }

    public int getTopBarButtonsValue(int i2) {
        return this.topBarButtons_.d(i2);
    }

    public List<Integer> getTopBarButtonsValueList() {
        return this.topBarButtons_;
    }

    public static aco newBuilder(acp acpVar) {
        return (aco) DEFAULT_INSTANCE.createBuilder(acpVar);
    }

    public static acp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static acp parseFrom(com.google.v.z zVar) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static acp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static acp parseFrom(InputStream inputStream) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acp parseFrom(ByteBuffer byteBuffer) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static acp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static acp parseFrom(byte[] bArr) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static acp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (acp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
