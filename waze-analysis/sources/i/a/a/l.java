package i.a.a;

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
public final class l extends du<l, k> implements m {
    public static final int ANGLE_OBJECT_FIELD_NUMBER = 2;
    private static final l DEFAULT_INSTANCE;
    public static final int LANE_INDEX_FIELD_NUMBER = 1;
    private static volatile fo<l> PARSER;
    private eo<i> angleObject_ = emptyProtobufList();
    private int bitField0_;
    private int laneIndex_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAngleObject(Iterable<? extends i> iterable) {
        ensureAngleObjectIsMutable();
        com.google.v.c.addAll(iterable, this.angleObject_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAngleObject(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureAngleObjectIsMutable();
        this.angleObject_.add(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAngleObject() {
        this.angleObject_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneIndex() {
        this.bitField0_ &= -2;
        this.laneIndex_ = 0;
    }

    private void ensureAngleObjectIsMutable() {
        eo<i> eoVar = this.angleObject_;
        if (eoVar.c()) {
            return;
        }
        this.angleObject_ = du.mutableCopy(eoVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAngleObject(int i2) {
        ensureAngleObjectIsMutable();
        this.angleObject_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleObject(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureAngleObjectIsMutable();
        this.angleObject_.set(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneIndex(int i2) {
        this.bitField0_ |= 1;
        this.laneIndex_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"bitField0_", "laneIndex_", "angleObject_", i.class});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i getAngleObject(int i2) {
        return this.angleObject_.get(i2);
    }

    public int getAngleObjectCount() {
        return this.angleObject_.size();
    }

    public List<i> getAngleObjectList() {
        return this.angleObject_;
    }

    public j getAngleObjectOrBuilder(int i2) {
        return this.angleObject_.get(i2);
    }

    public List<? extends j> getAngleObjectOrBuilderList() {
        return this.angleObject_;
    }

    public int getLaneIndex() {
        return this.laneIndex_;
    }

    public boolean hasLaneIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static k newBuilder(l lVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAngleObject(i iVar) {
        Objects.requireNonNull(iVar);
        ensureAngleObjectIsMutable();
        this.angleObject_.add(iVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
