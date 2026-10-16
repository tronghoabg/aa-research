package i.b.w;

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
public final class h extends du<h, g> implements fj {
    private static final h DEFAULT_INSTANCE;
    private static volatile fo<h> PARSER = null;
    public static final int VOICE_PROMPT_FIELD_NUMBER = 1;
    private eo<l> voicePrompt_ = emptyProtobufList();

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        du.registerDefaultInstance(h.class, hVar);
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVoicePrompt(Iterable<? extends l> iterable) {
        ensureVoicePromptIsMutable();
        com.google.v.c.addAll(iterable, this.voicePrompt_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoicePrompt(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureVoicePromptIsMutable();
        this.voicePrompt_.add(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicePrompt() {
        this.voicePrompt_ = emptyProtobufList();
    }

    private void ensureVoicePromptIsMutable() {
        eo<l> eoVar = this.voicePrompt_;
        if (eoVar.c()) {
            return;
        }
        this.voicePrompt_ = du.mutableCopy(eoVar);
    }

    public static h getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static h parseDelimitedFrom(InputStream inputStream) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(v vVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<h> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVoicePrompt(int i2) {
        ensureVoicePromptIsMutable();
        this.voicePrompt_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePrompt(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureVoicePromptIsMutable();
        this.voicePrompt_.set(i2, lVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"voicePrompt_", l.class});
        }
        if (iOrdinal == 3) {
            return new h();
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
        fo<h> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (h.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public l getVoicePrompt(int i2) {
        return this.voicePrompt_.get(i2);
    }

    public int getVoicePromptCount() {
        return this.voicePrompt_.size();
    }

    public List<l> getVoicePromptList() {
        return this.voicePrompt_;
    }

    public m getVoicePromptOrBuilder(int i2) {
        return this.voicePrompt_.get(i2);
    }

    public List<? extends m> getVoicePromptOrBuilderList() {
        return this.voicePrompt_;
    }

    public static g newBuilder(h hVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(hVar);
    }

    public static h parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (h) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(v vVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static h parseFrom(z zVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static h parseFrom(z zVar, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoicePrompt(l lVar) {
        Objects.requireNonNull(lVar);
        ensureVoicePromptIsMutable();
        this.voicePrompt_.add(lVar);
    }

    public static h parseFrom(InputStream inputStream) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h parseFrom(InputStream inputStream, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static h parseFrom(ByteBuffer byteBuffer) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static h parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static h parseFrom(byte[] bArr) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h parseFrom(byte[] bArr, de deVar) {
        return (h) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
