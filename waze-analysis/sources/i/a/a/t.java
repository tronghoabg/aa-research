package i.a.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends du<t, s> implements u {
    private static final t DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 3;
    private static volatile fo<t> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;
    private String text_ = "";
    private String direction_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        du.registerDefaultInstance(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirection() {
        this.bitField0_ &= -5;
        this.direction_ = getDefaultInstance().getDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -3;
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
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
    public void setDirection(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.direction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionBytes(com.google.v.v vVar) {
        this.direction_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        this.text_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i2) {
        this.bitField0_ |= 1;
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "type_", "text_", "direction_"});
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

    public String getDirection() {
        return this.direction_;
    }

    public com.google.v.v getDirectionBytes() {
        return com.google.v.v.s(this.direction_);
    }

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public int getType() {
        return this.type_;
    }

    public boolean hasDirection() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
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

    public static t parseFrom(z zVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static t parseFrom(z zVar, de deVar) {
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
