package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bnw extends com.google.v.du<bnw, bnu> implements com.google.v.fj {
    private static final bnw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bnw> PARSER = null;
    public static final int REASONS_FIELD_NUMBER = 1;
    private static final com.google.v.el<bnv> reasons_converter_ = new ve(19);
    private int reasonsMemoizedSerializedSize;
    private com.google.v.ek reasons_ = emptyIntList();

    static {
        bnw bnwVar = new bnw();
        DEFAULT_INSTANCE = bnwVar;
        com.google.v.du.registerDefaultInstance(bnw.class, bnwVar);
    }

    private bnw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReasons(Iterable<? extends bnv> iterable) {
        ensureReasonsIsMutable();
        Iterator<? extends bnv> it = iterable.iterator();
        while (it.hasNext()) {
            this.reasons_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReasonsValue(Iterable<Integer> iterable) {
        ensureReasonsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.reasons_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasons(bnv bnvVar) {
        Objects.requireNonNull(bnvVar);
        ensureReasonsIsMutable();
        this.reasons_.i(bnvVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReasonsValue(int i2) {
        ensureReasonsIsMutable();
        this.reasons_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReasons() {
        this.reasons_ = emptyIntList();
    }

    private void ensureReasonsIsMutable() {
        com.google.v.ek ekVar = this.reasons_;
        if (ekVar.c()) {
            return;
        }
        this.reasons_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static bnw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bnu newBuilder() {
        return (bnu) DEFAULT_INSTANCE.createBuilder();
    }

    public static bnw parseDelimitedFrom(InputStream inputStream) {
        return (bnw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnw parseFrom(com.google.v.v vVar) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bnw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasons(int i2, bnv bnvVar) {
        Objects.requireNonNull(bnvVar);
        ensureReasonsIsMutable();
        this.reasons_.e(i2, bnvVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonsValue(int i2, int i3) {
        ensureReasonsIsMutable();
        this.reasons_.e(i2, i3);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"reasons_"});
        }
        if (iOrdinal == 3) {
            return new bnw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bnu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bnw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bnw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bnv getReasons(int i2) {
        bnv bnvVarA = bnv.a(this.reasons_.d(i2));
        return bnvVarA == null ? bnv.UNRECOGNIZED : bnvVarA;
    }

    public int getReasonsCount() {
        return this.reasons_.size();
    }

    public List<bnv> getReasonsList() {
        return new com.google.v.em(this.reasons_, reasons_converter_);
    }

    public int getReasonsValue(int i2) {
        return this.reasons_.d(i2);
    }

    public List<Integer> getReasonsValueList() {
        return this.reasons_;
    }

    public static bnu newBuilder(bnw bnwVar) {
        return (bnu) DEFAULT_INSTANCE.createBuilder(bnwVar);
    }

    public static bnw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bnw parseFrom(com.google.v.z zVar) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bnw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bnw parseFrom(InputStream inputStream) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bnw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bnw parseFrom(ByteBuffer byteBuffer) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bnw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bnw parseFrom(byte[] bArr) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bnw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bnw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
