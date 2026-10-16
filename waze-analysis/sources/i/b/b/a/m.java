package i.b.b.a;

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
/* loaded from: classes7.dex */
public final class m extends du<m, l> implements fj {
    public static final int AUDIO_CHANNELS_FIELD_NUMBER = 3;
    private static final m DEFAULT_INSTANCE;
    public static final int ESTIMATED_LOCATION_FIELD_NUMBER = 1;
    public static final int MOTION_ACTIVITY_FIELD_NUMBER = 2;
    private static volatile fo<m> PARSER;
    private eo<b> audioChannels_ = emptyProtobufList();
    private int bitField0_;
    private e estimatedLocation_;
    private k motionActivity_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAudioChannels(Iterable<? extends b> iterable) {
        ensureAudioChannelsIsMutable();
        com.google.v.c.addAll(iterable, this.audioChannels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudioChannels(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureAudioChannelsIsMutable();
        this.audioChannels_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioChannels() {
        this.audioChannels_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEstimatedLocation() {
        this.estimatedLocation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMotionActivity() {
        this.motionActivity_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureAudioChannelsIsMutable() {
        eo<b> eoVar = this.audioChannels_;
        if (eoVar.c()) {
            return;
        }
        this.audioChannels_ = du.mutableCopy(eoVar);
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEstimatedLocation(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.estimatedLocation_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.estimatedLocation_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMotionActivity(k kVar) {
        Objects.requireNonNull(kVar);
        k kVar2 = this.motionActivity_;
        if (kVar2 != null && kVar2 != k.getDefaultInstance()) {
            g gVarNewBuilder = k.newBuilder(kVar2);
            gVarNewBuilder.mergeFrom((g) kVar);
            kVar = gVarNewBuilder.buildPartial();
        }
        this.motionActivity_ = kVar;
        this.bitField0_ |= 2;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAudioChannels(int i2) {
        ensureAudioChannelsIsMutable();
        this.audioChannels_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioChannels(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureAudioChannelsIsMutable();
        this.audioChannels_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEstimatedLocation(e eVar) {
        Objects.requireNonNull(eVar);
        this.estimatedLocation_ = eVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMotionActivity(k kVar) {
        Objects.requireNonNull(kVar);
        this.motionActivity_ = kVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"bitField0_", "estimatedLocation_", "motionActivity_", "audioChannels_", b.class});
        }
        if (iOrdinal == 3) {
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public b getAudioChannels(int i2) {
        return this.audioChannels_.get(i2);
    }

    public int getAudioChannelsCount() {
        return this.audioChannels_.size();
    }

    public List<b> getAudioChannelsList() {
        return this.audioChannels_;
    }

    public c getAudioChannelsOrBuilder(int i2) {
        return this.audioChannels_.get(i2);
    }

    public List<? extends c> getAudioChannelsOrBuilderList() {
        return this.audioChannels_;
    }

    public e getEstimatedLocation() {
        e eVar = this.estimatedLocation_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public k getMotionActivity() {
        k kVar = this.motionActivity_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public boolean hasEstimatedLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMotionActivity() {
        return (this.bitField0_ & 2) != 0;
    }

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAudioChannels(b bVar) {
        Objects.requireNonNull(bVar);
        ensureAudioChannelsIsMutable();
        this.audioChannels_.add(bVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
