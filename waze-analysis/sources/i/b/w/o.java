package i.b.w;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class o extends du<o, n> implements fj {
    private static final o DEFAULT_INSTANCE;
    private static volatile fo<o> PARSER = null;
    public static final int PROMPTS_FIELD_NUMBER = 1;
    private eo<l> prompts_ = emptyProtobufList();

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPrompts(Iterable<? extends l> iterable) {
        ensurePromptsIsMutable();
        com.google.v.c.addAll(iterable, this.prompts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPrompts(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensurePromptsIsMutable();
        this.prompts_.add(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompts() {
        this.prompts_ = emptyProtobufList();
    }

    private void ensurePromptsIsMutable() {
        eo<l> eoVar = this.prompts_;
        if (eoVar.c()) {
            return;
        }
        this.prompts_ = du.mutableCopy(eoVar);
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePrompts(int i2) {
        ensurePromptsIsMutable();
        this.prompts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrompts(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensurePromptsIsMutable();
        this.prompts_.set(i2, lVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"prompts_", l.class});
        }
        if (iOrdinal == 3) {
            return new o();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new n(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<o> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (o.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public l getPrompts(int i2) {
        return this.prompts_.get(i2);
    }

    public int getPromptsCount() {
        return this.prompts_.size();
    }

    public List<l> getPromptsList() {
        return this.prompts_;
    }

    public m getPromptsOrBuilder(int i2) {
        return this.prompts_.get(i2);
    }

    public List<? extends m> getPromptsOrBuilderList() {
        return this.prompts_;
    }

    public static n newBuilder(o oVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPrompts(l lVar) {
        Objects.requireNonNull(lVar);
        ensurePromptsIsMutable();
        this.prompts_.add(lVar);
    }

    public static o parseFrom(InputStream inputStream) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static o parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static o parseFrom(byte[] bArr) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
