package i.b.a;

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
public final class c extends du<c, a> implements fj {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final c DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NAV_CONNECT_DATA_FIELD_NUMBER = 9;
    private static volatile fo<c> PARSER = null;
    public static final int SYSTEM_LOCALE_FIELD_NUMBER = 8;
    public static final int TEXT_FIELD_NUMBER = 3;
    public static final int TEXT_VERSION_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private int context_;
    private Object eventDetails_;
    private int name_;
    private l value_;
    private int eventDetailsCase_ = 0;
    private eo<e> text_ = emptyProtobufList();
    private String textVersion_ = "";
    private String locale_ = "";
    private String systemLocale_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        du.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllText(Iterable<? extends e> iterable) {
        ensureTextIsMutable();
        com.google.v.c.addAll(iterable, this.text_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addText(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureTextIsMutable();
        this.text_.add(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.bitField0_ &= -3;
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventDetails() {
        this.eventDetailsCase_ = 0;
        this.eventDetails_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -9;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavConnectData() {
        if (this.eventDetailsCase_ == 9) {
            this.eventDetailsCase_ = 0;
            this.eventDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemLocale() {
        this.bitField0_ &= -17;
        this.systemLocale_ = getDefaultInstance().getSystemLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTextVersion() {
        this.bitField0_ &= -5;
        this.textVersion_ = getDefaultInstance().getTextVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -33;
    }

    private void ensureTextIsMutable() {
        eo<e> eoVar = this.text_;
        if (eoVar.c()) {
            return;
        }
        this.text_ = du.mutableCopy(eoVar);
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavConnectData(h hVar) {
        Objects.requireNonNull(hVar);
        if (this.eventDetailsCase_ == 9 && this.eventDetails_ != h.getDefaultInstance()) {
            g gVarNewBuilder = h.newBuilder((h) this.eventDetails_);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.eventDetails_ = hVar;
        this.eventDetailsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(l lVar) {
        Objects.requireNonNull(lVar);
        l lVar2 = this.value_;
        if (lVar2 != null && lVar2 != l.getDefaultInstance()) {
            k kVarNewBuilder = l.newBuilder(lVar2);
            kVarNewBuilder.mergeFrom((k) lVar);
            lVar = kVarNewBuilder.buildPartial();
        }
        this.value_ = lVar;
        this.bitField0_ |= 32;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(v vVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<c> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeText(int i2) {
        ensureTextIsMutable();
        this.text_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(m mVar) {
        this.context_ = mVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(p pVar) {
        this.name_ = pVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavConnectData(h hVar) {
        Objects.requireNonNull(hVar);
        this.eventDetails_ = hVar;
        this.eventDetailsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.systemLocale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemLocaleBytes(v vVar) {
        this.systemLocale_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureTextIsMutable();
        this.text_.set(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.textVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextVersionBytes(v vVar) {
        this.textVersion_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(l lVar) {
        Objects.requireNonNull(lVar);
        this.value_ = lVar;
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004ဈ\u0002\u0006ဈ\u0003\u0007ဉ\u0005\bဈ\u0004\t<\u0000", new Object[]{"eventDetails_", "eventDetailsCase_", "bitField0_", "name_", n.f48347c, "context_", n.f48346b, "text_", e.class, "textVersion_", "locale_", "value_", "systemLocale_", h.class});
        }
        if (iOrdinal == 3) {
            return new c();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<c> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (c.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public m getContext() {
        m mVarA = m.a(this.context_);
        return mVarA == null ? m.UNKNOWN_CONTEXT : mVarA;
    }

    public b getEventDetailsCase() {
        int i2 = this.eventDetailsCase_;
        if (i2 == 0) {
            return b.f48331b;
        }
        if (i2 != 9) {
            return null;
        }
        return b.f48330a;
    }

    public String getLocale() {
        return this.locale_;
    }

    public v getLocaleBytes() {
        return v.s(this.locale_);
    }

    public p getName() {
        p pVarA = p.a(this.name_);
        return pVarA == null ? p.WAZE_EVENT_NAME_UNSPECIFIED : pVarA;
    }

    public h getNavConnectData() {
        return this.eventDetailsCase_ == 9 ? (h) this.eventDetails_ : h.getDefaultInstance();
    }

    public String getSystemLocale() {
        return this.systemLocale_;
    }

    public v getSystemLocaleBytes() {
        return v.s(this.systemLocale_);
    }

    public e getText(int i2) {
        return this.text_.get(i2);
    }

    public int getTextCount() {
        return this.text_.size();
    }

    public List<e> getTextList() {
        return this.text_;
    }

    public f getTextOrBuilder(int i2) {
        return this.text_.get(i2);
    }

    public List<? extends f> getTextOrBuilderList() {
        return this.text_;
    }

    public String getTextVersion() {
        return this.textVersion_;
    }

    public v getTextVersionBytes() {
        return v.s(this.textVersion_);
    }

    public l getValue() {
        l lVar = this.value_;
        return lVar == null ? l.getDefaultInstance() : lVar;
    }

    public boolean hasContext() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNavConnectData() {
        return this.eventDetailsCase_ == 9;
    }

    public boolean hasSystemLocale() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTextVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(c cVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (c) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(v vVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static c parseFrom(z zVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static c parseFrom(z zVar, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addText(e eVar) {
        Objects.requireNonNull(eVar);
        ensureTextIsMutable();
        this.text_.add(eVar);
    }

    public static c parseFrom(InputStream inputStream) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static c parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static c parseFrom(byte[] bArr) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, de deVar) {
        return (c) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
