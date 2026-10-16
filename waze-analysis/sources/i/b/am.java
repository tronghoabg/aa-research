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
public final class am extends du<am, al> implements fj {
    private static final am DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 1;
    private static volatile fo<am> PARSER;
    private eo<aj> entry_ = emptyProtobufList();

    static {
        am amVar = new am();
        DEFAULT_INSTANCE = amVar;
        du.registerDefaultInstance(am.class, amVar);
    }

    private am() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends aj> iterable) {
        ensureEntryIsMutable();
        com.google.v.c.addAll(iterable, this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int i2, aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureEntryIsMutable();
        this.entry_.add(i2, ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = emptyProtobufList();
    }

    private void ensureEntryIsMutable() {
        eo<aj> eoVar = this.entry_;
        if (eoVar.c()) {
            return;
        }
        this.entry_ = du.mutableCopy(eoVar);
    }

    public static am getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static am parseDelimitedFrom(InputStream inputStream) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(com.google.v.v vVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<am> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int i2) {
        ensureEntryIsMutable();
        this.entry_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int i2, aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureEntryIsMutable();
        this.entry_.set(i2, ajVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"entry_", aj.class});
        }
        if (iOrdinal == 3) {
            return new am();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<am> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (am.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aj getEntry(int i2) {
        return this.entry_.get(i2);
    }

    public int getEntryCount() {
        return this.entry_.size();
    }

    public List<aj> getEntryList() {
        return this.entry_;
    }

    public ak getEntryOrBuilder(int i2) {
        return this.entry_.get(i2);
    }

    public List<? extends ak> getEntryOrBuilderList() {
        return this.entry_;
    }

    public static al newBuilder(am amVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(amVar);
    }

    public static am parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (am) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(com.google.v.v vVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static am parseFrom(com.google.v.z zVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static am parseFrom(com.google.v.z zVar, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureEntryIsMutable();
        this.entry_.add(ajVar);
    }

    public static am parseFrom(InputStream inputStream) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static am parseFrom(InputStream inputStream, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static am parseFrom(ByteBuffer byteBuffer) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static am parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static am parseFrom(byte[] bArr) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static am parseFrom(byte[] bArr, de deVar) {
        return (am) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
