package i.b.c;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends du<d, c> implements fj {
    public static final int BUTTON_ID_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int ENGAGEMENT_ID_FIELD_NUMBER = 1;
    public static final int OPTED_OUT_FIELD_NUMBER = 3;
    private static volatile fo<d> PARSER;
    private int bitField0_;
    private boolean optedOut_;
    private String engagementId_ = "";
    private String buttonId_ = "";

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonId() {
        this.bitField0_ &= -3;
        this.buttonId_ = getDefaultInstance().getButtonId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEngagementId() {
        this.bitField0_ &= -2;
        this.engagementId_ = getDefaultInstance().getEngagementId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptedOut() {
        this.bitField0_ &= -5;
        this.optedOut_ = false;
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.buttonId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonIdBytes(v vVar) {
        this.buttonId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEngagementId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.engagementId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEngagementIdBytes(v vVar) {
        this.engagementId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptedOut(boolean z) {
        this.bitField0_ |= 4;
        this.optedOut_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "engagementId_", "buttonId_", "optedOut_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getButtonId() {
        return this.buttonId_;
    }

    public v getButtonIdBytes() {
        return v.s(this.buttonId_);
    }

    public String getEngagementId() {
        return this.engagementId_;
    }

    public v getEngagementIdBytes() {
        return v.s(this.engagementId_);
    }

    public boolean getOptedOut() {
        return this.optedOut_;
    }

    public boolean hasButtonId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEngagementId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptedOut() {
        return (this.bitField0_ & 4) != 0;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
