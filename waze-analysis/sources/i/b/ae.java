package i.b;

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
public final class ae extends du<ae, ad> implements fj {
    private static final ae DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 1;
    private static volatile fo<ae> PARSER;
    private eo<ab> entry_ = emptyProtobufList();

    static {
        ae aeVar = new ae();
        DEFAULT_INSTANCE = aeVar;
        du.registerDefaultInstance(ae.class, aeVar);
    }

    private ae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends ab> iterable) {
        ensureEntryIsMutable();
        com.google.v.c.addAll(iterable, this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int i2, ab abVar) {
        Objects.requireNonNull(abVar);
        ensureEntryIsMutable();
        this.entry_.add(i2, abVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = emptyProtobufList();
    }

    private void ensureEntryIsMutable() {
        eo<ab> eoVar = this.entry_;
        if (eoVar.c()) {
            return;
        }
        this.entry_ = du.mutableCopy(eoVar);
    }

    public static ae getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ad newBuilder() {
        return (ad) DEFAULT_INSTANCE.createBuilder();
    }

    public static ae parseDelimitedFrom(InputStream inputStream) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(com.google.v.v vVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ae> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int i2) {
        ensureEntryIsMutable();
        this.entry_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int i2, ab abVar) {
        Objects.requireNonNull(abVar);
        ensureEntryIsMutable();
        this.entry_.set(i2, abVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"entry_", ab.class});
        }
        if (iOrdinal == 3) {
            return new ae();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ad(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ae> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ae.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ab getEntry(int i2) {
        return this.entry_.get(i2);
    }

    public int getEntryCount() {
        return this.entry_.size();
    }

    public List<ab> getEntryList() {
        return this.entry_;
    }

    public ac getEntryOrBuilder(int i2) {
        return this.entry_.get(i2);
    }

    public List<? extends ac> getEntryOrBuilderList() {
        return this.entry_;
    }

    public static ad newBuilder(ae aeVar) {
        return (ad) DEFAULT_INSTANCE.createBuilder(aeVar);
    }

    public static ae parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ae) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(com.google.v.v vVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ae parseFrom(com.google.v.z zVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ae parseFrom(com.google.v.z zVar, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(ab abVar) {
        Objects.requireNonNull(abVar);
        ensureEntryIsMutable();
        this.entry_.add(abVar);
    }

    public static ae parseFrom(InputStream inputStream) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ae parseFrom(InputStream inputStream, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ae parseFrom(ByteBuffer byteBuffer) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ae parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ae parseFrom(byte[] bArr) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ae parseFrom(byte[] bArr, de deVar) {
        return (ae) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
