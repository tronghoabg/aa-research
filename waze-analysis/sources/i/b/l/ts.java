package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ts extends com.google.v.du<ts, tq> implements tt {
    public static final int CLICKED_BUTTON_ID_FIELD_NUMBER = 5;
    public static final int CLOSEREASON_FIELD_NUMBER = 4;
    private static final ts DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ts> PARSER = null;
    public static final int TAKEOVER_FIELD_NUMBER = 1;
    public static final int TIMEDISPLAYEDMILLIS_FIELD_NUMBER = 2;
    public static final int USERINTERACTED_FIELD_NUMBER = 3;
    private int bitField0_;
    private uf takeover_;
    private int timeDisplayedMillis_;
    private boolean userInteracted_;
    private int closeReason_ = 1;
    private String clickedButtonId_ = "";

    static {
        ts tsVar = new ts();
        DEFAULT_INSTANCE = tsVar;
        com.google.v.du.registerDefaultInstance(ts.class, tsVar);
    }

    private ts() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickedButtonId() {
        this.bitField0_ &= -17;
        this.clickedButtonId_ = getDefaultInstance().getClickedButtonId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloseReason() {
        this.bitField0_ &= -9;
        this.closeReason_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeover() {
        this.takeover_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeDisplayedMillis() {
        this.bitField0_ &= -3;
        this.timeDisplayedMillis_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInteracted() {
        this.bitField0_ &= -5;
        this.userInteracted_ = false;
    }

    public static ts getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTakeover(uf ufVar) {
        Objects.requireNonNull(ufVar);
        uf ufVar2 = this.takeover_;
        if (ufVar2 != null && ufVar2 != uf.getDefaultInstance()) {
            uc ucVarNewBuilder = uf.newBuilder(ufVar2);
            ucVarNewBuilder.mergeFrom((uc) ufVar);
            ufVar = ucVarNewBuilder.buildPartial();
        }
        this.takeover_ = ufVar;
        this.bitField0_ |= 1;
    }

    public static tq newBuilder() {
        return (tq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ts parseDelimitedFrom(InputStream inputStream) {
        return (ts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ts parseFrom(com.google.v.v vVar) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ts> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedButtonId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.clickedButtonId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickedButtonIdBytes(com.google.v.v vVar) {
        this.clickedButtonId_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseReason(tr trVar) {
        this.closeReason_ = trVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeover(uf ufVar) {
        Objects.requireNonNull(ufVar);
        this.takeover_ = ufVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeDisplayedMillis(int i2) {
        this.bitField0_ |= 2;
        this.timeDisplayedMillis_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInteracted(boolean z) {
        this.bitField0_ |= 4;
        this.userInteracted_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "takeover_", "timeDisplayedMillis_", "userInteracted_", "closeReason_", pa.f48960i, "clickedButtonId_"});
        }
        if (iOrdinal == 3) {
            return new ts();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ts> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ts.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getClickedButtonId() {
        return this.clickedButtonId_;
    }

    public com.google.v.v getClickedButtonIdBytes() {
        return com.google.v.v.s(this.clickedButtonId_);
    }

    public tr getCloseReason() {
        tr trVarA = tr.a(this.closeReason_);
        return trVarA == null ? tr.DRIVE_RESUMED : trVarA;
    }

    public uf getTakeover() {
        uf ufVar = this.takeover_;
        return ufVar == null ? uf.getDefaultInstance() : ufVar;
    }

    public int getTimeDisplayedMillis() {
        return this.timeDisplayedMillis_;
    }

    public boolean getUserInteracted() {
        return this.userInteracted_;
    }

    public boolean hasClickedButtonId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCloseReason() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTakeover() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeDisplayedMillis() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUserInteracted() {
        return (this.bitField0_ & 4) != 0;
    }

    public static tq newBuilder(ts tsVar) {
        return (tq) DEFAULT_INSTANCE.createBuilder(tsVar);
    }

    public static ts parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ts) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ts parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ts parseFrom(com.google.v.z zVar) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ts parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ts parseFrom(InputStream inputStream) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ts parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ts parseFrom(ByteBuffer byteBuffer) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ts parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ts parseFrom(byte[] bArr) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ts parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ts) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
