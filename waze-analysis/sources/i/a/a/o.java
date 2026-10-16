package i.a.a;

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
public final class o extends du<o, n> implements fj {
    public static final int CLIENT_LANE_FIELD_NUMBER = 1;
    private static final o DEFAULT_INSTANCE;
    public static final int ENABLE_VOICE_FOR_INSTRUCTION_FIELD_NUMBER = 2;
    private static volatile fo<o> PARSER;
    private int bitField0_;
    private eo<l> clientLane_ = emptyProtobufList();
    private boolean enableVoiceForInstruction_;

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        du.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClientLane(Iterable<? extends l> iterable) {
        ensureClientLaneIsMutable();
        com.google.v.c.addAll(iterable, this.clientLane_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientLane(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureClientLaneIsMutable();
        this.clientLane_.add(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientLane() {
        this.clientLane_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableVoiceForInstruction() {
        this.bitField0_ &= -2;
        this.enableVoiceForInstruction_ = false;
    }

    private void ensureClientLaneIsMutable() {
        eo<l> eoVar = this.clientLane_;
        if (eoVar.c()) {
            return;
        }
        this.clientLane_ = du.mutableCopy(eoVar);
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

    public static o parseFrom(com.google.v.v vVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<o> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeClientLane(int i2) {
        ensureClientLaneIsMutable();
        this.clientLane_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientLane(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureClientLaneIsMutable();
        this.clientLane_.set(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableVoiceForInstruction(boolean z) {
        this.bitField0_ |= 1;
        this.enableVoiceForInstruction_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"bitField0_", "clientLane_", l.class, "enableVoiceForInstruction_"});
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

    public l getClientLane(int i2) {
        return this.clientLane_.get(i2);
    }

    public int getClientLaneCount() {
        return this.clientLane_.size();
    }

    public List<l> getClientLaneList() {
        return this.clientLane_;
    }

    public m getClientLaneOrBuilder(int i2) {
        return this.clientLane_.get(i2);
    }

    public List<? extends m> getClientLaneOrBuilderList() {
        return this.clientLane_;
    }

    public boolean getEnableVoiceForInstruction() {
        return this.enableVoiceForInstruction_;
    }

    public boolean hasEnableVoiceForInstruction() {
        return (this.bitField0_ & 1) != 0;
    }

    public static n newBuilder(o oVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (o) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static o parseFrom(com.google.v.v vVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static o parseFrom(z zVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static o parseFrom(z zVar, de deVar) {
        return (o) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClientLane(l lVar) {
        Objects.requireNonNull(lVar);
        ensureClientLaneIsMutable();
        this.clientLane_.add(lVar);
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
