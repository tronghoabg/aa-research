package i.b.f.a;

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
/* loaded from: classes7.dex */
public final class y extends du<y, x> implements fj {
    private static final y DEFAULT_INSTANCE;
    private static volatile fo<y> PARSER = null;
    public static final int RULE_FIELD_NUMBER = 1;
    private eo<ay> rule_ = emptyProtobufList();

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        du.registerDefaultInstance(y.class, yVar);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRule(Iterable<? extends ay> iterable) {
        ensureRuleIsMutable();
        com.google.v.c.addAll(iterable, this.rule_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRule(int i2, ay ayVar) {
        Objects.requireNonNull(ayVar);
        ensureRuleIsMutable();
        this.rule_.add(i2, ayVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRule() {
        this.rule_ = emptyProtobufList();
    }

    private void ensureRuleIsMutable() {
        eo<ay> eoVar = this.rule_;
        if (eoVar.c()) {
            return;
        }
        this.rule_ = du.mutableCopy(eoVar);
    }

    public static y getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static y parseDelimitedFrom(InputStream inputStream) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(com.google.v.v vVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<y> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRule(int i2) {
        ensureRuleIsMutable();
        this.rule_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRule(int i2, ay ayVar) {
        Objects.requireNonNull(ayVar);
        ensureRuleIsMutable();
        this.rule_.set(i2, ayVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rule_", ay.class});
        }
        if (iOrdinal == 3) {
            return new y();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<y> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (y.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ay getRule(int i2) {
        return this.rule_.get(i2);
    }

    public int getRuleCount() {
        return this.rule_.size();
    }

    public List<ay> getRuleList() {
        return this.rule_;
    }

    public az getRuleOrBuilder(int i2) {
        return this.rule_.get(i2);
    }

    public List<? extends az> getRuleOrBuilderList() {
        return this.rule_;
    }

    public static x newBuilder(y yVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(yVar);
    }

    public static y parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(com.google.v.v vVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static y parseFrom(com.google.v.z zVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static y parseFrom(com.google.v.z zVar, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRule(ay ayVar) {
        Objects.requireNonNull(ayVar);
        ensureRuleIsMutable();
        this.rule_.add(ayVar);
    }

    public static y parseFrom(InputStream inputStream) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(InputStream inputStream, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(ByteBuffer byteBuffer) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static y parseFrom(byte[] bArr) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static y parseFrom(byte[] bArr, de deVar) {
        return (y) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
