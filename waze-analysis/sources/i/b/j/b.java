package i.b.j;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends du<b, a> implements c {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final b DEFAULT_INSTANCE;
    private static volatile fo<b> PARSER;
    private int bitField0_;
    private String category_ = "";
    private eo<i.b.k.b> action_ = emptyProtobufList();

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAction(int i2, i.b.k.b bVar) {
        Objects.requireNonNull(bVar);
        ensureActionIsMutable();
        this.action_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAction(Iterable<? extends i.b.k.b> iterable) {
        ensureActionIsMutable();
        com.google.v.c.addAll(iterable, this.action_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.bitField0_ &= -2;
        this.category_ = getDefaultInstance().getCategory();
    }

    private void ensureActionIsMutable() {
        eo<i.b.k.b> eoVar = this.action_;
        if (eoVar.c()) {
            return;
        }
        this.action_ = du.mutableCopy(eoVar);
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

    public static b parseFrom(com.google.v.v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAction(int i2) {
        ensureActionIsMutable();
        this.action_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(int i2, i.b.k.b bVar) {
        Objects.requireNonNull(bVar);
        ensureActionIsMutable();
        this.action_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.category_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryBytes(com.google.v.v vVar) {
        this.category_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "category_", "action_", i.b.k.b.class});
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

    public i.b.k.b getAction(int i2) {
        return this.action_.get(i2);
    }

    public int getActionCount() {
        return this.action_.size();
    }

    public List<i.b.k.b> getActionList() {
        return this.action_;
    }

    public i.b.k.c getActionOrBuilder(int i2) {
        return this.action_.get(i2);
    }

    public List<? extends i.b.k.c> getActionOrBuilderList() {
        return this.action_;
    }

    public String getCategory() {
        return this.category_;
    }

    public com.google.v.v getCategoryBytes() {
        return com.google.v.v.s(this.category_);
    }

    public boolean hasCategory() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAction(i.b.k.b bVar) {
        Objects.requireNonNull(bVar);
        ensureActionIsMutable();
        this.action_.add(bVar);
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
