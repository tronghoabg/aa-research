package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends du<t, s> implements fj {
    private static final t DEFAULT_INSTANCE;
    public static final int MOOD_NAME_FIELD_NUMBER = 1;
    public static final int MOOD_URL_FIELD_NUMBER = 2;
    private static volatile fo<t> PARSER;
    private int bitField0_;
    private String moodName_ = "";
    private String moodUrl_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        du.registerDefaultInstance(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodName() {
        this.bitField0_ &= -2;
        this.moodName_ = getDefaultInstance().getMoodName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoodUrl() {
        this.bitField0_ &= -3;
        this.moodUrl_ = getDefaultInstance().getMoodUrl();
    }

    public static t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static t parseDelimitedFrom(InputStream inputStream) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(com.google.v.v vVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<t> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.moodName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodNameBytes(com.google.v.v vVar) {
        this.moodName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.moodUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoodUrlBytes(com.google.v.v vVar) {
        this.moodUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "moodName_", "moodUrl_"});
        }
        if (iOrdinal == 3) {
            return new t();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new s(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<t> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (t.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getMoodName() {
        return this.moodName_;
    }

    public com.google.v.v getMoodNameBytes() {
        return com.google.v.v.s(this.moodName_);
    }

    public String getMoodUrl() {
        return this.moodUrl_;
    }

    public com.google.v.v getMoodUrlBytes() {
        return com.google.v.v.s(this.moodUrl_);
    }

    public boolean hasMoodName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMoodUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public static s newBuilder(t tVar) {
        return (s) DEFAULT_INSTANCE.createBuilder(tVar);
    }

    public static t parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(com.google.v.v vVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static t parseFrom(com.google.v.z zVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static t parseFrom(com.google.v.z zVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static t parseFrom(InputStream inputStream) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(InputStream inputStream, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(ByteBuffer byteBuffer) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static t parseFrom(byte[] bArr) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static t parseFrom(byte[] bArr, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
