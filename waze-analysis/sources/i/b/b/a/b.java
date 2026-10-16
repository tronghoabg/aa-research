package i.b.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends du<b, a> implements c {
    public static final int AUDIO_CHANNEL_NAME_FIELD_NUMBER = 1;
    public static final int AUDIO_CHANNEL_TYPE_FIELD_NUMBER = 2;
    private static final b DEFAULT_INSTANCE;
    private static volatile fo<b> PARSER;
    private String audioChannelName_ = "";
    private String audioChannelType_ = "";
    private int bitField0_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioChannelName() {
        this.bitField0_ &= -2;
        this.audioChannelName_ = getDefaultInstance().getAudioChannelName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioChannelType() {
        this.bitField0_ &= -3;
        this.audioChannelType_ = getDefaultInstance().getAudioChannelType();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioChannelName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.audioChannelName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioChannelNameBytes(v vVar) {
        this.audioChannelName_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioChannelType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.audioChannelType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioChannelTypeBytes(v vVar) {
        this.audioChannelType_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "audioChannelName_", "audioChannelType_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAudioChannelName() {
        return this.audioChannelName_;
    }

    public v getAudioChannelNameBytes() {
        return v.s(this.audioChannelName_);
    }

    public String getAudioChannelType() {
        return this.audioChannelType_;
    }

    public v getAudioChannelTypeBytes() {
        return v.s(this.audioChannelType_);
    }

    public boolean hasAudioChannelName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAudioChannelType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
