package i.b.q;

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
public final class y extends du<y, x> implements fj {
    private static final y DEFAULT_INSTANCE;
    private static volatile fo<y> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int SUGGESTIONS_FIELD_NUMBER = 3;
    private int bitField0_;
    private i.b.ah status_;
    private eo<al> suggestions_ = emptyProtobufList();

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        du.registerDefaultInstance(y.class, yVar);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestions(Iterable<? extends al> iterable) {
        ensureSuggestionsIsMutable();
        com.google.v.c.addAll(iterable, this.suggestions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestions(int i2, al alVar) {
        Objects.requireNonNull(alVar);
        ensureSuggestionsIsMutable();
        this.suggestions_.add(i2, alVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestions() {
        this.suggestions_ = emptyProtobufList();
    }

    private void ensureSuggestionsIsMutable() {
        eo<al> eoVar = this.suggestions_;
        if (eoVar.c()) {
            return;
        }
        this.suggestions_ = du.mutableCopy(eoVar);
    }

    public static y getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        i.b.ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != i.b.ah.getDefaultInstance()) {
            i.b.af afVarNewBuilder = i.b.ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((i.b.af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
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
    public void removeSuggestions(int i2) {
        ensureSuggestionsIsMutable();
        this.suggestions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestions(int i2, al alVar) {
        Objects.requireNonNull(alVar);
        ensureSuggestionsIsMutable();
        this.suggestions_.set(i2, alVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b", new Object[]{"bitField0_", "status_", "suggestions_", al.class});
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

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public al getSuggestions(int i2) {
        return this.suggestions_.get(i2);
    }

    public int getSuggestionsCount() {
        return this.suggestions_.size();
    }

    public List<al> getSuggestionsList() {
        return this.suggestions_;
    }

    public am getSuggestionsOrBuilder(int i2) {
        return this.suggestions_.get(i2);
    }

    public List<? extends am> getSuggestionsOrBuilderList() {
        return this.suggestions_;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
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
    public void addSuggestions(al alVar) {
        Objects.requireNonNull(alVar);
        ensureSuggestionsIsMutable();
        this.suggestions_.add(alVar);
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
