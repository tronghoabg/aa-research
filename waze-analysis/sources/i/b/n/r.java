package i.b.n;

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
public final class r extends du<r, q> implements fj {
    private static final r DEFAULT_INSTANCE;
    private static volatile fo<r> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private byte memoizedIsInitialized = 2;
    private eo<t> result_ = emptyProtobufList();

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResult(Iterable<? extends t> iterable) {
        ensureResultIsMutable();
        com.google.v.c.addAll(iterable, this.result_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResult(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureResultIsMutable();
        this.result_.add(i2, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = emptyProtobufList();
    }

    private void ensureResultIsMutable() {
        eo<t> eoVar = this.result_;
        if (eoVar.c()) {
            return;
        }
        this.result_ = du.mutableCopy(eoVar);
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeResult(int i2) {
        ensureResultIsMutable();
        this.result_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(int i2, t tVar) {
        Objects.requireNonNull(tVar);
        ensureResultIsMutable();
        this.result_.set(i2, tVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"result_", t.class});
            case 3:
                return new r();
            case 4:
                return new q(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<r> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (r.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public t getResult(int i2) {
        return this.result_.get(i2);
    }

    public int getResultCount() {
        return this.result_.size();
    }

    public List<t> getResultList() {
        return this.result_;
    }

    public u getResultOrBuilder(int i2) {
        return this.result_.get(i2);
    }

    public List<? extends u> getResultOrBuilderList() {
        return this.result_;
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResult(t tVar) {
        Objects.requireNonNull(tVar);
        ensureResultIsMutable();
        this.result_.add(tVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
