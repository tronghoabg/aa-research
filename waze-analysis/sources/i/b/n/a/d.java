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
public final class d extends du<d, c> implements fj {
    public static final int COORDINATES_FIELD_NUMBER = 1;
    private static final d DEFAULT_INSTANCE;
    private static volatile fo<d> PARSER;
    private eo<i.b.s> coordinates_ = emptyProtobufList();

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
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

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(com.google.v.v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
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

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(com.google.v.v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(com.google.v.z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(com.google.v.z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCoordinates(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureCoordinatesIsMutable();
        this.coordinates_.add(sVar);
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
