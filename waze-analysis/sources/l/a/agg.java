package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agg extends com.google.v.du<agg, age> implements com.google.v.fj {
    public static final int AVAILABLE_OPTIONS_FIELD_NUMBER = 5;
    private static final agg DEFAULT_INSTANCE;
    public static final int IN_CAR_SUBTITLE_FIELD_NUMBER = 4;
    public static final int IN_CAR_TITLE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<agg> PARSER = null;
    public static final int SOUND_ENABLED_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TIMEOUT_SECONDS_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 1;
    private static final com.google.v.el<agf> availableOptions_converter_ = new ve(10);
    private int availableOptionsMemoizedSerializedSize;
    private int bitField0_;
    private boolean soundEnabled_;
    private long timeoutSeconds_;
    private String title_ = "";
    private String subtitle_ = "";
    private String inCarTitle_ = "";
    private String inCarSubtitle_ = "";
    private com.google.v.ek availableOptions_ = emptyIntList();

    static {
        agg aggVar = new agg();
        DEFAULT_INSTANCE = aggVar;
        com.google.v.du.registerDefaultInstance(agg.class, aggVar);
    }

    private agg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableOptions(Iterable<? extends agf> iterable) {
        ensureAvailableOptionsIsMutable();
        Iterator<? extends agf> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableOptions_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableOptionsValue(Iterable<Integer> iterable) {
        ensureAvailableOptionsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableOptions_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableOptions(agf agfVar) {
        Objects.requireNonNull(agfVar);
        ensureAvailableOptionsIsMutable();
        this.availableOptions_.i(agfVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableOptionsValue(int i2) {
        ensureAvailableOptionsIsMutable();
        this.availableOptions_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableOptions() {
        this.availableOptions_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarSubtitle() {
        this.bitField0_ &= -9;
        this.inCarSubtitle_ = getDefaultInstance().getInCarSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarTitle() {
        this.bitField0_ &= -5;
        this.inCarTitle_ = getDefaultInstance().getInCarTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundEnabled() {
        this.bitField0_ &= -33;
        this.soundEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtitle() {
        this.bitField0_ &= -3;
        this.subtitle_ = getDefaultInstance().getSubtitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutSeconds() {
        this.bitField0_ &= -17;
        this.timeoutSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.bitField0_ &= -2;
        this.title_ = getDefaultInstance().getTitle();
    }

    private void ensureAvailableOptionsIsMutable() {
        com.google.v.ek ekVar = this.availableOptions_;
        if (ekVar.c()) {
            return;
        }
        this.availableOptions_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static agg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static age newBuilder() {
        return (age) DEFAULT_INSTANCE.createBuilder();
    }

    public static agg parseDelimitedFrom(InputStream inputStream) {
        return (agg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agg parseFrom(com.google.v.v vVar) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<agg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableOptions(int i2, agf agfVar) {
        Objects.requireNonNull(agfVar);
        ensureAvailableOptionsIsMutable();
        this.availableOptions_.e(i2, agfVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableOptionsValue(int i2, int i3) {
        ensureAvailableOptionsIsMutable();
        this.availableOptions_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarSubtitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.inCarSubtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarSubtitleBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.inCarSubtitle_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.inCarTitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarTitleBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.inCarTitle_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundEnabled(boolean z) {
        this.bitField0_ |= 32;
        this.soundEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.subtitle_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtitleBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.subtitle_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutSeconds(long j2) {
        this.bitField0_ |= 16;
        this.timeoutSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005,\u0006ဂ\u0004\u0007ဇ\u0005", new Object[]{"bitField0_", "title_", "subtitle_", "inCarTitle_", "inCarSubtitle_", "availableOptions_", "timeoutSeconds_", "soundEnabled_"});
        }
        if (iOrdinal == 3) {
            return new agg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new age(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<agg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (agg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public agf getAvailableOptions(int i2) {
        agf agfVarA = agf.a(this.availableOptions_.d(i2));
        return agfVarA == null ? agf.UNRECOGNIZED : agfVarA;
    }

    public int getAvailableOptionsCount() {
        return this.availableOptions_.size();
    }

    public List<agf> getAvailableOptionsList() {
        return new com.google.v.em(this.availableOptions_, availableOptions_converter_);
    }

    public int getAvailableOptionsValue(int i2) {
        return this.availableOptions_.d(i2);
    }

    public List<Integer> getAvailableOptionsValueList() {
        return this.availableOptions_;
    }

    public String getInCarSubtitle() {
        return this.inCarSubtitle_;
    }

    public com.google.v.v getInCarSubtitleBytes() {
        return com.google.v.v.s(this.inCarSubtitle_);
    }

    public String getInCarTitle() {
        return this.inCarTitle_;
    }

    public com.google.v.v getInCarTitleBytes() {
        return com.google.v.v.s(this.inCarTitle_);
    }

    public boolean getSoundEnabled() {
        return this.soundEnabled_;
    }

    public String getSubtitle() {
        return this.subtitle_;
    }

    public com.google.v.v getSubtitleBytes() {
        return com.google.v.v.s(this.subtitle_);
    }

    public long getTimeoutSeconds() {
        return this.timeoutSeconds_;
    }

    public String getTitle() {
        return this.title_;
    }

    public com.google.v.v getTitleBytes() {
        return com.google.v.v.s(this.title_);
    }

    public boolean hasInCarSubtitle() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInCarTitle() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSoundEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSubtitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimeoutSeconds() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static age newBuilder(agg aggVar) {
        return (age) DEFAULT_INSTANCE.createBuilder(aggVar);
    }

    public static agg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static agg parseFrom(com.google.v.z zVar) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static agg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static agg parseFrom(InputStream inputStream) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agg parseFrom(ByteBuffer byteBuffer) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static agg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static agg parseFrom(byte[] bArr) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static agg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (agg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
