package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dl extends com.google.v.du<dl, dj> implements dm {
    private static final dl DEFAULT_INSTANCE;
    public static final int OPEN_HOURS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<dl> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.eo<ch> openHours_ = emptyProtobufList();
    private int type_;

    static {
        dl dlVar = new dl();
        DEFAULT_INSTANCE = dlVar;
        com.google.v.du.registerDefaultInstance(dl.class, dlVar);
    }

    private dl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOpenHours(Iterable<? extends ch> iterable) {
        ensureOpenHoursIsMutable();
        com.google.v.c.addAll(iterable, this.openHours_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenHours(int i2, ch chVar) {
        Objects.requireNonNull(chVar);
        ensureOpenHoursIsMutable();
        this.openHours_.add(i2, chVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenHours() {
        this.openHours_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    private void ensureOpenHoursIsMutable() {
        com.google.v.eo<ch> eoVar = this.openHours_;
        if (eoVar.c()) {
            return;
        }
        this.openHours_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dj newBuilder() {
        return (dj) DEFAULT_INSTANCE.createBuilder();
    }

    public static dl parseDelimitedFrom(InputStream inputStream) {
        return (dl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dl parseFrom(com.google.v.v vVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOpenHours(int i2) {
        ensureOpenHoursIsMutable();
        this.openHours_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenHours(int i2, ch chVar) {
        Objects.requireNonNull(chVar);
        ensureOpenHoursIsMutable();
        this.openHours_.set(i2, chVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(dk dkVar) {
        this.type_ = dkVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"bitField0_", "type_", z.s, "openHours_", ch.class});
        }
        if (iOrdinal == 3) {
            return new dl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ch getOpenHours(int i2) {
        return this.openHours_.get(i2);
    }

    public int getOpenHoursCount() {
        return this.openHours_.size();
    }

    public List<ch> getOpenHoursList() {
        return this.openHours_;
    }

    public ci getOpenHoursOrBuilder(int i2) {
        return this.openHours_.get(i2);
    }

    public List<? extends ci> getOpenHoursOrBuilderList() {
        return this.openHours_;
    }

    public dk getType() {
        dk dkVarA = dk.a(this.type_);
        return dkVarA == null ? dk.SECONDARY_OPEN_HOURS_UNSPECIFIED : dkVarA;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dj newBuilder(dl dlVar) {
        return (dj) DEFAULT_INSTANCE.createBuilder(dlVar);
    }

    public static dl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dl parseFrom(com.google.v.z zVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenHours(ch chVar) {
        Objects.requireNonNull(chVar);
        ensureOpenHoursIsMutable();
        this.openHours_.add(chVar);
    }

    public static dl parseFrom(InputStream inputStream) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dl parseFrom(ByteBuffer byteBuffer) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dl parseFrom(byte[] bArr) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
