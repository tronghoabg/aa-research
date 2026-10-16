package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fa extends com.google.v.du<fa, ez> implements com.google.v.fj {
    private static final fa DEFAULT_INSTANCE;
    public static final int MEETINGS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fa> PARSER = null;
    public static final int REPLACE_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.v.eo<ex> meetings_ = emptyProtobufList();
    private boolean replace_;

    static {
        fa faVar = new fa();
        DEFAULT_INSTANCE = faVar;
        com.google.v.du.registerDefaultInstance(fa.class, faVar);
    }

    private fa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMeetings(Iterable<? extends ex> iterable) {
        ensureMeetingsIsMutable();
        com.google.v.c.addAll(iterable, this.meetings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMeetings(int i2, ex exVar) {
        Objects.requireNonNull(exVar);
        ensureMeetingsIsMutable();
        this.meetings_.add(i2, exVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeetings() {
        this.meetings_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplace() {
        this.bitField0_ &= -2;
        this.replace_ = false;
    }

    private void ensureMeetingsIsMutable() {
        com.google.v.eo<ex> eoVar = this.meetings_;
        if (eoVar.c()) {
            return;
        }
        this.meetings_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static fa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ez newBuilder() {
        return (ez) DEFAULT_INSTANCE.createBuilder();
    }

    public static fa parseDelimitedFrom(InputStream inputStream) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(com.google.v.v vVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMeetings(int i2) {
        ensureMeetingsIsMutable();
        this.meetings_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeetings(int i2, ex exVar) {
        Objects.requireNonNull(exVar);
        ensureMeetingsIsMutable();
        this.meetings_.set(i2, exVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplace(boolean z) {
        this.bitField0_ |= 1;
        this.replace_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"bitField0_", "meetings_", ex.class, "replace_"});
        }
        if (iOrdinal == 3) {
            return new fa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ez(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ex getMeetings(int i2) {
        return this.meetings_.get(i2);
    }

    public int getMeetingsCount() {
        return this.meetings_.size();
    }

    public List<ex> getMeetingsList() {
        return this.meetings_;
    }

    public ey getMeetingsOrBuilder(int i2) {
        return this.meetings_.get(i2);
    }

    public List<? extends ey> getMeetingsOrBuilderList() {
        return this.meetings_;
    }

    public boolean getReplace() {
        return this.replace_;
    }

    public boolean hasReplace() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ez newBuilder(fa faVar) {
        return (ez) DEFAULT_INSTANCE.createBuilder(faVar);
    }

    public static fa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fa parseFrom(com.google.v.z zVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMeetings(ex exVar) {
        Objects.requireNonNull(exVar);
        ensureMeetingsIsMutable();
        this.meetings_.add(exVar);
    }

    public static fa parseFrom(InputStream inputStream) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fa parseFrom(ByteBuffer byteBuffer) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fa parseFrom(byte[] bArr) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
