package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aff extends com.google.v.du<aff, afe> implements com.google.v.fj {
    private static final aff DEFAULT_INSTANCE;
    public static final int EXTENDED_LAUNCH_TIMES_MS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<aff> PARSER = null;
    public static final int RESUME_TIMES_MS_FIELD_NUMBER = 3;
    public static final int TIMES_TO_FIRST_DRAW_MS_FIELD_NUMBER = 1;
    public static final int TIMES_TO_PREWARMED_FIRST_DRAW_MS_FIELD_NUMBER = 2;
    private int timesToFirstDrawMsMemoizedSerializedSize = -1;
    private int timesToPrewarmedFirstDrawMsMemoizedSerializedSize = -1;
    private int resumeTimesMsMemoizedSerializedSize = -1;
    private int extendedLaunchTimesMsMemoizedSerializedSize = -1;
    private com.google.v.en timesToFirstDrawMs_ = emptyLongList();
    private com.google.v.en timesToPrewarmedFirstDrawMs_ = emptyLongList();
    private com.google.v.en resumeTimesMs_ = emptyLongList();
    private com.google.v.en extendedLaunchTimesMs_ = emptyLongList();

    static {
        aff affVar = new aff();
        DEFAULT_INSTANCE = affVar;
        com.google.v.du.registerDefaultInstance(aff.class, affVar);
    }

    private aff() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtendedLaunchTimesMs(Iterable<? extends Long> iterable) {
        ensureExtendedLaunchTimesMsIsMutable();
        com.google.v.c.addAll(iterable, this.extendedLaunchTimesMs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResumeTimesMs(Iterable<? extends Long> iterable) {
        ensureResumeTimesMsIsMutable();
        com.google.v.c.addAll(iterable, this.resumeTimesMs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimesToFirstDrawMs(Iterable<? extends Long> iterable) {
        ensureTimesToFirstDrawMsIsMutable();
        com.google.v.c.addAll(iterable, this.timesToFirstDrawMs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimesToPrewarmedFirstDrawMs(Iterable<? extends Long> iterable) {
        ensureTimesToPrewarmedFirstDrawMsIsMutable();
        com.google.v.c.addAll(iterable, this.timesToPrewarmedFirstDrawMs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtendedLaunchTimesMs(long j2) {
        ensureExtendedLaunchTimesMsIsMutable();
        this.extendedLaunchTimesMs_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResumeTimesMs(long j2) {
        ensureResumeTimesMsIsMutable();
        this.resumeTimesMs_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimesToFirstDrawMs(long j2) {
        ensureTimesToFirstDrawMsIsMutable();
        this.timesToFirstDrawMs_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimesToPrewarmedFirstDrawMs(long j2) {
        ensureTimesToPrewarmedFirstDrawMsIsMutable();
        this.timesToPrewarmedFirstDrawMs_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendedLaunchTimesMs() {
        this.extendedLaunchTimesMs_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeTimesMs() {
        this.resumeTimesMs_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimesToFirstDrawMs() {
        this.timesToFirstDrawMs_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimesToPrewarmedFirstDrawMs() {
        this.timesToPrewarmedFirstDrawMs_ = emptyLongList();
    }

    private void ensureExtendedLaunchTimesMsIsMutable() {
        com.google.v.en enVar = this.extendedLaunchTimesMs_;
        if (enVar.c()) {
            return;
        }
        this.extendedLaunchTimesMs_ = com.google.v.du.mutableCopy(enVar);
    }

    private void ensureResumeTimesMsIsMutable() {
        com.google.v.en enVar = this.resumeTimesMs_;
        if (enVar.c()) {
            return;
        }
        this.resumeTimesMs_ = com.google.v.du.mutableCopy(enVar);
    }

    private void ensureTimesToFirstDrawMsIsMutable() {
        com.google.v.en enVar = this.timesToFirstDrawMs_;
        if (enVar.c()) {
            return;
        }
        this.timesToFirstDrawMs_ = com.google.v.du.mutableCopy(enVar);
    }

    private void ensureTimesToPrewarmedFirstDrawMsIsMutable() {
        com.google.v.en enVar = this.timesToPrewarmedFirstDrawMs_;
        if (enVar.c()) {
            return;
        }
        this.timesToPrewarmedFirstDrawMs_ = com.google.v.du.mutableCopy(enVar);
    }

    public static aff getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afe newBuilder() {
        return (afe) DEFAULT_INSTANCE.createBuilder();
    }

    public static aff parseDelimitedFrom(InputStream inputStream) {
        return (aff) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aff parseFrom(com.google.v.v vVar) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aff> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendedLaunchTimesMs(int i2, long j2) {
        ensureExtendedLaunchTimesMsIsMutable();
        this.extendedLaunchTimesMs_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeTimesMs(int i2, long j2) {
        ensureResumeTimesMsIsMutable();
        this.resumeTimesMs_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimesToFirstDrawMs(int i2, long j2) {
        ensureTimesToFirstDrawMsIsMutable();
        this.timesToFirstDrawMs_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimesToPrewarmedFirstDrawMs(int i2, long j2) {
        ensureTimesToPrewarmedFirstDrawMsIsMutable();
        this.timesToPrewarmedFirstDrawMs_.d(i2, j2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001%\u0002%\u0003%\u0004%", new Object[]{"timesToFirstDrawMs_", "timesToPrewarmedFirstDrawMs_", "resumeTimesMs_", "extendedLaunchTimesMs_"});
        }
        if (iOrdinal == 3) {
            return new aff();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aff> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aff.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getExtendedLaunchTimesMs(int i2) {
        return this.extendedLaunchTimesMs_.a(i2);
    }

    public int getExtendedLaunchTimesMsCount() {
        return this.extendedLaunchTimesMs_.size();
    }

    public List<Long> getExtendedLaunchTimesMsList() {
        return this.extendedLaunchTimesMs_;
    }

    public long getResumeTimesMs(int i2) {
        return this.resumeTimesMs_.a(i2);
    }

    public int getResumeTimesMsCount() {
        return this.resumeTimesMs_.size();
    }

    public List<Long> getResumeTimesMsList() {
        return this.resumeTimesMs_;
    }

    public long getTimesToFirstDrawMs(int i2) {
        return this.timesToFirstDrawMs_.a(i2);
    }

    public int getTimesToFirstDrawMsCount() {
        return this.timesToFirstDrawMs_.size();
    }

    public List<Long> getTimesToFirstDrawMsList() {
        return this.timesToFirstDrawMs_;
    }

    public long getTimesToPrewarmedFirstDrawMs(int i2) {
        return this.timesToPrewarmedFirstDrawMs_.a(i2);
    }

    public int getTimesToPrewarmedFirstDrawMsCount() {
        return this.timesToPrewarmedFirstDrawMs_.size();
    }

    public List<Long> getTimesToPrewarmedFirstDrawMsList() {
        return this.timesToPrewarmedFirstDrawMs_;
    }

    public static afe newBuilder(aff affVar) {
        return (afe) DEFAULT_INSTANCE.createBuilder(affVar);
    }

    public static aff parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aff) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aff parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aff parseFrom(com.google.v.z zVar) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aff parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aff parseFrom(InputStream inputStream) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aff parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aff parseFrom(ByteBuffer byteBuffer) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aff parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aff parseFrom(byte[] bArr) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aff parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
