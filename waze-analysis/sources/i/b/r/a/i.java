package i.b.r.a;

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
public final class i extends du<i, h> implements fj {
    private static final i DEFAULT_INSTANCE;
    private static volatile fo<i> PARSER = null;
    public static final int TIME_PREFERENCE_FIELD_NUMBER = 1;
    private eo<f> timePreference_ = emptyProtobufList();

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimePreference(Iterable<? extends f> iterable) {
        ensureTimePreferenceIsMutable();
        com.google.v.c.addAll(iterable, this.timePreference_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimePreference(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureTimePreferenceIsMutable();
        this.timePreference_.add(i2, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimePreference() {
        this.timePreference_ = emptyProtobufList();
    }

    private void ensureTimePreferenceIsMutable() {
        eo<f> eoVar = this.timePreference_;
        if (eoVar.c()) {
            return;
        }
        this.timePreference_ = du.mutableCopy(eoVar);
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTimePreference(int i2) {
        ensureTimePreferenceIsMutable();
        this.timePreference_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimePreference(int i2, f fVar) {
        Objects.requireNonNull(fVar);
        ensureTimePreferenceIsMutable();
        this.timePreference_.set(i2, fVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"timePreference_", f.class});
        }
        if (iOrdinal == 3) {
            return new i();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public f getTimePreference(int i2) {
        return this.timePreference_.get(i2);
    }

    public int getTimePreferenceCount() {
        return this.timePreference_.size();
    }

    public List<f> getTimePreferenceList() {
        return this.timePreference_;
    }

    public g getTimePreferenceOrBuilder(int i2) {
        return this.timePreference_.get(i2);
    }

    public List<? extends g> getTimePreferenceOrBuilderList() {
        return this.timePreference_;
    }

    public static h newBuilder(i iVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimePreference(f fVar) {
        Objects.requireNonNull(fVar);
        ensureTimePreferenceIsMutable();
        this.timePreference_.add(fVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
