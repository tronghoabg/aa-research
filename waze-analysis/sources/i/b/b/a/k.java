package i.b.b.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends du<k, g> implements fj {
    public static final int CONFIDENCE_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int MOTION_TYPES_FIELD_NUMBER = 2;
    private static volatile fo<k> PARSER;
    private static final el<j> motionTypes_converter_ = new f();
    private int bitField0_;
    private int confidence_;
    private ek motionTypes_ = emptyIntList();

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMotionTypes(Iterable<? extends j> iterable) {
        ensureMotionTypesIsMutable();
        Iterator<? extends j> it = iterable.iterator();
        while (it.hasNext()) {
            this.motionTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMotionTypes(j jVar) {
        Objects.requireNonNull(jVar);
        ensureMotionTypesIsMutable();
        this.motionTypes_.i(jVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidence() {
        this.bitField0_ &= -2;
        this.confidence_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMotionTypes() {
        this.motionTypes_ = emptyIntList();
    }

    private void ensureMotionTypesIsMutable() {
        ek ekVar = this.motionTypes_;
        if (ekVar.c()) {
            return;
        }
        this.motionTypes_ = du.mutableCopy(ekVar);
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidence(h hVar) {
        this.confidence_ = hVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMotionTypes(int i2, j jVar) {
        Objects.requireNonNull(jVar);
        ensureMotionTypesIsMutable();
        this.motionTypes_.e(i2, jVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002ࠞ", new Object[]{"bitField0_", "confidence_", i.f48378b, "motionTypes_", i.f48377a});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new g(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public h getConfidence() {
        h hVarA = h.a(this.confidence_);
        return hVarA == null ? h.CONFIDENCE_LEVEL_UNDEFINED : hVarA;
    }

    public j getMotionTypes(int i2) {
        j jVarA = j.a(this.motionTypes_.d(i2));
        return jVarA == null ? j.MOTION_TYPE_UNSPECIFIED : jVarA;
    }

    public int getMotionTypesCount() {
        return this.motionTypes_.size();
    }

    public List<j> getMotionTypesList() {
        return new em(this.motionTypes_, motionTypes_converter_);
    }

    public boolean hasConfidence() {
        return (this.bitField0_ & 1) != 0;
    }

    public static g newBuilder(k kVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
