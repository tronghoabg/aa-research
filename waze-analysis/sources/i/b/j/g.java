package i.b.j;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends du<g, f> implements fj {
    public static final int ACTIONS_CATEGORY_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    private static volatile fo<g> PARSER;
    private eo<b> actionsCategory_ = emptyProtobufList();

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActionsCategory(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureActionsCategoryIsMutable();
        this.actionsCategory_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllActionsCategory(Iterable<? extends b> iterable) {
        ensureActionsCategoryIsMutable();
        com.google.v.c.addAll(iterable, this.actionsCategory_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionsCategory() {
        this.actionsCategory_ = emptyProtobufList();
    }

    private void ensureActionsCategoryIsMutable() {
        eo<b> eoVar = this.actionsCategory_;
        if (eoVar.c()) {
            return;
        }
        this.actionsCategory_ = du.mutableCopy(eoVar);
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(com.google.v.v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActionsCategory(int i2) {
        ensureActionsCategoryIsMutable();
        this.actionsCategory_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionsCategory(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureActionsCategoryIsMutable();
        this.actionsCategory_.set(i2, bVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"actionsCategory_", b.class});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getActionsCategory(int i2) {
        return this.actionsCategory_.get(i2);
    }

    public int getActionsCategoryCount() {
        return this.actionsCategory_.size();
    }

    public List<b> getActionsCategoryList() {
        return this.actionsCategory_;
    }

    public c getActionsCategoryOrBuilder(int i2) {
        return this.actionsCategory_.get(i2);
    }

    public List<? extends c> getActionsCategoryOrBuilderList() {
        return this.actionsCategory_;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(com.google.v.v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(z zVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActionsCategory(b bVar) {
        Objects.requireNonNull(bVar);
        ensureActionsCategoryIsMutable();
        this.actionsCategory_.add(bVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
