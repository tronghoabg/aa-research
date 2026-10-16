package i.c.a.a;

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
public final class l extends du<l, e> implements fj {
    private static final l DEFAULT_INSTANCE;
    public static final int GPS_INFO_FIELD_NUMBER = 2;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int IN_STARTUP_CONFUSION_FIELD_NUMBER = 3;
    private static volatile fo<l> PARSER;
    private int bitField0_;
    private k gpsInfo_;
    private eo<h> heading_ = emptyProtobufList();
    private boolean inStartupConfusion_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHeading(Iterable<? extends h> iterable) {
        ensureHeadingIsMutable();
        com.google.v.c.addAll(iterable, this.heading_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHeading(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureHeadingIsMutable();
        this.heading_.add(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsInfo() {
        this.gpsInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeading() {
        this.heading_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInStartupConfusion() {
        this.bitField0_ &= -3;
        this.inStartupConfusion_ = false;
    }

    private void ensureHeadingIsMutable() {
        eo<h> eoVar = this.heading_;
        if (eoVar.c()) {
            return;
        }
        this.heading_ = du.mutableCopy(eoVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpsInfo(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.gpsInfo_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            j jVarNewBuilder = k.newBuilder(kVar2);
            jVarNewBuilder.mergeFrom((j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.gpsInfo_ = kVar;
        this.bitField0_ |= 1;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHeading(int i2) {
        ensureHeadingIsMutable();
        this.heading_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsInfo(k kVar) {
        Objects.requireNonNull(kVar);
        this.gpsInfo_ = kVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeading(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureHeadingIsMutable();
        this.heading_.set(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInStartupConfusion(boolean z) {
        this.bitField0_ |= 2;
        this.inStartupConfusion_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"bitField0_", "heading_", h.class, "gpsInfo_", "inStartupConfusion_"});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
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

    public k getGpsInfo() {
        k kVar = this.gpsInfo_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public h getHeading(int i2) {
        return this.heading_.get(i2);
    }

    public int getHeadingCount() {
        return this.heading_.size();
    }

    public List<h> getHeadingList() {
        return this.heading_;
    }

    public i getHeadingOrBuilder(int i2) {
        return this.heading_.get(i2);
    }

    public List<? extends i> getHeadingOrBuilderList() {
        return this.heading_;
    }

    public boolean getInStartupConfusion() {
        return this.inStartupConfusion_;
    }

    public boolean hasGpsInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInStartupConfusion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static e newBuilder(l lVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHeading(h hVar) {
        Objects.requireNonNull(hVar);
        ensureHeadingIsMutable();
        this.heading_.add(hVar);
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
