package i.b.q;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class al extends du<al, aj> implements am {
    private static final al DEFAULT_INSTANCE;
    public static final int DESTINATION_SUGGESTION_FIELD_NUMBER = 3;
    public static final int DRIVE_SUGGESTION_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<al> PARSER;
    private int bitField0_;
    private Object suggestion_;
    private int suggestionCase_ = 0;
    private String name_ = "";

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        du.registerDefaultInstance(al.class, alVar);
    }

    private al() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationSuggestion() {
        if (this.suggestionCase_ == 3) {
            this.suggestionCase_ = 0;
            this.suggestion_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveSuggestion() {
        if (this.suggestionCase_ == 2) {
            this.suggestionCase_ = 0;
            this.suggestion_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestion() {
        this.suggestionCase_ = 0;
        this.suggestion_ = null;
    }

    public static al getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationSuggestion(g gVar) {
        Objects.requireNonNull(gVar);
        if (this.suggestionCase_ == 3 && this.suggestion_ != g.getDefaultInstance()) {
            f fVarNewBuilder = g.newBuilder((g) this.suggestion_);
            fVarNewBuilder.mergeFrom((f) gVar);
            gVar = fVarNewBuilder.buildPartial();
        }
        this.suggestion_ = gVar;
        this.suggestionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriveSuggestion(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.suggestionCase_ == 2 && this.suggestion_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.suggestion_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.suggestion_ = mVar;
        this.suggestionCase_ = 2;
    }

    public static aj newBuilder() {
        return (aj) DEFAULT_INSTANCE.createBuilder();
    }

    public static al parseDelimitedFrom(InputStream inputStream) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(com.google.v.v vVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<al> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationSuggestion(g gVar) {
        Objects.requireNonNull(gVar);
        this.suggestion_ = gVar;
        this.suggestionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveSuggestion(m mVar) {
        Objects.requireNonNull(mVar);
        this.suggestion_ = mVar;
        this.suggestionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"suggestion_", "suggestionCase_", "bitField0_", "name_", m.class, g.class});
        }
        if (iOrdinal == 3) {
            return new al();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<al> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (al.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public g getDestinationSuggestion() {
        return this.suggestionCase_ == 3 ? (g) this.suggestion_ : g.getDefaultInstance();
    }

    public m getDriveSuggestion() {
        return this.suggestionCase_ == 2 ? (m) this.suggestion_ : m.getDefaultInstance();
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public ak getSuggestionCase() {
        int i2 = this.suggestionCase_;
        if (i2 == 0) {
            return ak.f49242c;
        }
        if (i2 == 2) {
            return ak.f49240a;
        }
        if (i2 != 3) {
            return null;
        }
        return ak.f49241b;
    }

    public boolean hasDestinationSuggestion() {
        return this.suggestionCase_ == 3;
    }

    public boolean hasDriveSuggestion() {
        return this.suggestionCase_ == 2;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aj newBuilder(al alVar) {
        return (aj) DEFAULT_INSTANCE.createBuilder(alVar);
    }

    public static al parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(com.google.v.v vVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static al parseFrom(com.google.v.z zVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static al parseFrom(com.google.v.z zVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static al parseFrom(InputStream inputStream) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(InputStream inputStream, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(ByteBuffer byteBuffer) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static al parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static al parseFrom(byte[] bArr) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static al parseFrom(byte[] bArr, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
