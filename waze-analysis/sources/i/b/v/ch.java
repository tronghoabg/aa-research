package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ch extends com.google.v.du<ch, cg> implements ci {
    public static final int DAYS_FIELD_NUMBER = 803;
    private static final ch DEFAULT_INSTANCE;
    public static final int FROM_FIELD_NUMBER = 801;
    private static volatile com.google.v.fo<ch> PARSER = null;
    public static final int TO_FIELD_NUMBER = 802;
    private int bitField0_;
    private String from_ = "";
    private String to_ = "";
    private com.google.v.en days_ = emptyLongList();

    static {
        ch chVar = new ch();
        DEFAULT_INSTANCE = chVar;
        com.google.v.du.registerDefaultInstance(ch.class, chVar);
    }

    private ch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDays(Iterable<? extends Long> iterable) {
        ensureDaysIsMutable();
        com.google.v.c.addAll(iterable, this.days_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDays(long j2) {
        ensureDaysIsMutable();
        this.days_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDays() {
        this.days_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.bitField0_ &= -2;
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTo() {
        this.bitField0_ &= -3;
        this.to_ = getDefaultInstance().getTo();
    }

    private void ensureDaysIsMutable() {
        com.google.v.en enVar = this.days_;
        if (enVar.c()) {
            return;
        }
        this.days_ = com.google.v.du.mutableCopy(enVar);
    }

    public static ch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cg newBuilder() {
        return (cg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ch parseDelimitedFrom(InputStream inputStream) {
        return (ch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ch parseFrom(com.google.v.v vVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDays(int i2, long j2) {
        ensureDaysIsMutable();
        this.days_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(com.google.v.v vVar) {
        this.from_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.to_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToBytes(com.google.v.v vVar) {
        this.to_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001̡̣\u0003\u0000\u0001\u0000̡ဈ\u0000̢ဈ\u0001̣\u0014", new Object[]{"bitField0_", "from_", "to_", "days_"});
        }
        if (iOrdinal == 3) {
            return new ch();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ch> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ch.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDays(int i2) {
        return this.days_.a(i2);
    }

    public int getDaysCount() {
        return this.days_.size();
    }

    public List<Long> getDaysList() {
        return this.days_;
    }

    public String getFrom() {
        return this.from_;
    }

    public com.google.v.v getFromBytes() {
        return com.google.v.v.s(this.from_);
    }

    public String getTo() {
        return this.to_;
    }

    public com.google.v.v getToBytes() {
        return com.google.v.v.s(this.to_);
    }

    public boolean hasFrom() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cg newBuilder(ch chVar) {
        return (cg) DEFAULT_INSTANCE.createBuilder(chVar);
    }

    public static ch parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ch) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ch parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ch parseFrom(com.google.v.z zVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ch parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ch parseFrom(InputStream inputStream) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ch parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ch parseFrom(ByteBuffer byteBuffer) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ch parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ch parseFrom(byte[] bArr) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ch parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ch) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
