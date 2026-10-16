package i.b.n.a;

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
/* loaded from: classes8.dex */
public final class al extends du<al, aj> implements fj {
    public static final int CATEGORY_FIELD_NUMBER = 1;
    public static final int CATEGORY_GROUP_FIELD_NUMBER = 2;
    private static final al DEFAULT_INSTANCE;
    private static volatile fo<al> PARSER;
    private int detectedItemCase_ = 0;
    private Object detectedItem_;

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        du.registerDefaultInstance(al.class, alVar);
    }

    private al() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        if (this.detectedItemCase_ == 1) {
            this.detectedItemCase_ = 0;
            this.detectedItem_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryGroup() {
        if (this.detectedItemCase_ == 2) {
            this.detectedItemCase_ = 0;
            this.detectedItem_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetectedItem() {
        this.detectedItemCase_ = 0;
        this.detectedItem_ = null;
    }

    public static al getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCategory(i.b.o.e eVar) {
        Objects.requireNonNull(eVar);
        if (this.detectedItemCase_ == 1 && this.detectedItem_ != i.b.o.e.getDefaultInstance()) {
            i.b.o.d dVarNewBuilder = i.b.o.e.newBuilder((i.b.o.e) this.detectedItem_);
            dVarNewBuilder.mergeFrom((i.b.o.d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.detectedItem_ = eVar;
        this.detectedItemCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCategoryGroup(i.b.o.g gVar) {
        Objects.requireNonNull(gVar);
        if (this.detectedItemCase_ == 2 && this.detectedItem_ != i.b.o.g.getDefaultInstance()) {
            i.b.o.f fVarNewBuilder = i.b.o.g.newBuilder((i.b.o.g) this.detectedItem_);
            fVarNewBuilder.mergeFrom((i.b.o.f) gVar);
            gVar = fVarNewBuilder.buildPartial();
        }
        this.detectedItem_ = gVar;
        this.detectedItemCase_ = 2;
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
    public void setCategory(i.b.o.e eVar) {
        Objects.requireNonNull(eVar);
        this.detectedItem_ = eVar;
        this.detectedItemCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryGroup(i.b.o.g gVar) {
        Objects.requireNonNull(gVar);
        this.detectedItem_ = gVar;
        this.detectedItemCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"detectedItem_", "detectedItemCase_", i.b.o.e.class, i.b.o.g.class});
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

    public i.b.o.e getCategory() {
        return this.detectedItemCase_ == 1 ? (i.b.o.e) this.detectedItem_ : i.b.o.e.getDefaultInstance();
    }

    public i.b.o.g getCategoryGroup() {
        return this.detectedItemCase_ == 2 ? (i.b.o.g) this.detectedItem_ : i.b.o.g.getDefaultInstance();
    }

    public ak getDetectedItemCase() {
        int i2 = this.detectedItemCase_;
        if (i2 == 0) {
            return ak.f49111c;
        }
        if (i2 == 1) {
            return ak.f49109a;
        }
        if (i2 != 2) {
            return null;
        }
        return ak.f49110b;
    }

    public boolean hasCategory() {
        return this.detectedItemCase_ == 1;
    }

    public boolean hasCategoryGroup() {
        return this.detectedItemCase_ == 2;
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
