package i.b.n.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f extends du<f, e> implements fj {
    public static final int COORDINATES_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    private static volatile fo<f> PARSER;
    private eo<i.b.s> coordinates_ = emptyProtobufList();

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCoordinates(Iterable<? extends i.b.s> iterable) {
        ensureCoordinatesIsMutable();
        com.google.v.c.addAll(iterable, this.coordinates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoordinates(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureCoordinatesIsMutable();
        this.coordinates_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = emptyProtobufList();
    }

    private void ensureCoordinatesIsMutable() {
        eo<i.b.s> eoVar = this.coordinates_;
        if (eoVar.c()) {
            return;
        }
        this.coordinates_ = du.mutableCopy(eoVar);
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(com.google.v.v vVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCoordinates(int i2) {
        ensureCoordinatesIsMutable();
        this.coordinates_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureCoordinatesIsMutable();
        this.coordinates_.set(i2, sVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"coordinates_", i.b.s.class});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getCoordinates(int i2) {
        return this.coordinates_.get(i2);
    }

    public int getCoordinatesCount() {
        return this.coordinates_.size();
    }

    public List<i.b.s> getCoordinatesList() {
        return this.coordinates_;
    }

    public i.b.t getCoordinatesOrBuilder(int i2) {
        return this.coordinates_.get(i2);
    }

    public List<? extends i.b.t> getCoordinatesOrBuilderList() {
        return this.coordinates_;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(com.google.v.v vVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(com.google.v.z zVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(com.google.v.z zVar, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoordinates(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureCoordinatesIsMutable();
        this.coordinates_.add(sVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, de deVar) {
        return (f) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
