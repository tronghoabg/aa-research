package i.b.k;

import androidx.camera.video.AudioStats;
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
    public static final int BACKGROUND_RGB_FIELD_NUMBER = 7;
    private static final b DEFAULT_INSTANCE;
    public static final int DESTRUCTIVE_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 6;
    public static final int OFFLINE_FIELD_NUMBER = 5;
    private static volatile fo<b> PARSER = null;
    public static final int RATIO_FIELD_NUMBER = 9;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TEXT_RGB_FIELD_NUMBER = 8;
    public static final int WAZE_URL_FIELD_NUMBER = 3;
    private long backgroundRgb_;
    private int bitField0_;
    private boolean destructive_;
    private boolean offline_;
    private double ratio_;
    private long textRgb_;
    private String id_ = "";
    private String text_ = "";
    private String wazeUrl_ = "";
    private String imageUrl_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundRgb() {
        this.bitField0_ &= -65;
        this.backgroundRgb_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestructive() {
        this.bitField0_ &= -9;
        this.destructive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.bitField0_ &= -33;
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffline() {
        this.bitField0_ &= -17;
        this.offline_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRatio() {
        this.bitField0_ &= -257;
        this.ratio_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -3;
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextRgb() {
        this.bitField0_ &= -129;
        this.textRgb_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWazeUrl() {
        this.bitField0_ &= -5;
        this.wazeUrl_ = getDefaultInstance().getWazeUrl();
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
    public void setBackgroundRgb(long j2) {
        this.bitField0_ |= 64;
        this.backgroundRgb_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestructive(boolean z) {
        this.bitField0_ |= 8;
        this.destructive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(v vVar) {
        this.imageUrl_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffline(boolean z) {
        this.bitField0_ |= 16;
        this.offline_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRatio(double d2) {
        this.bitField0_ |= 256;
        this.ratio_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(v vVar) {
        this.text_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextRgb(long j2) {
        this.bitField0_ |= 128;
        this.textRgb_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.wazeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWazeUrlBytes(v vVar) {
        this.wazeUrl_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဂ\u0007\tက\b", new Object[]{"bitField0_", "id_", "text_", "wazeUrl_", "destructive_", "offline_", "imageUrl_", "backgroundRgb_", "textRgb_", "ratio_"});
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

    public long getBackgroundRgb() {
        return this.backgroundRgb_;
    }

    public boolean getDestructive() {
        return this.destructive_;
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public v getImageUrlBytes() {
        return v.s(this.imageUrl_);
    }

    public boolean getOffline() {
        return this.offline_;
    }

    public double getRatio() {
        return this.ratio_;
    }

    public String getText() {
        return this.text_;
    }

    public v getTextBytes() {
        return v.s(this.text_);
    }

    public long getTextRgb() {
        return this.textRgb_;
    }

    public String getWazeUrl() {
        return this.wazeUrl_;
    }

    public v getWazeUrlBytes() {
        return v.s(this.wazeUrl_);
    }

    public boolean hasBackgroundRgb() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDestructive() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasImageUrl() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOffline() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRatio() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTextRgb() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasWazeUrl() {
        return (this.bitField0_ & 4) != 0;
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
