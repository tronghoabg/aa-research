package com.waze.bs;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ab extends du<ab, n> implements fj {
    private static final ab DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 101;
    public static final int END_CONVERSATION_FIELD_NUMBER = 102;
    private static volatile fo<ab> PARSER = null;
    public static final int PLAY_SOUND_FIELD_NUMBER = 100;
    public static final int SEARCH_CONTEXT_ID_FIELD_NUMBER = 1;
    public static final int SHOW_LOCATION_PREVIEW_FIELD_NUMBER = 104;
    public static final int SHOW_SEARCH_RESULTS_FIELD_NUMBER = 103;
    public static final int SHOW_TRIP_OVERVIEW_FIELD_NUMBER = 105;
    private int bitField0_;
    private Object response_;
    private int responseCase_ = 0;
    private byte memoizedIsInitialized = 2;
    private String searchContextId_ = "";

    static {
        ab abVar = new ab();
        DEFAULT_INSTANCE = abVar;
        du.registerDefaultInstance(ab.class, abVar);
    }

    private ab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayText() {
        if (this.responseCase_ == 101) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndConversation() {
        if (this.responseCase_ == 102) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaySound() {
        if (this.responseCase_ == 100) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.responseCase_ = 0;
        this.response_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchContextId() {
        this.bitField0_ &= -2;
        this.searchContextId_ = getDefaultInstance().getSearchContextId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowLocationPreview() {
        if (this.responseCase_ == 104) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowSearchResults() {
        if (this.responseCase_ == 103) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTripOverview() {
        if (this.responseCase_ == 105) {
            this.responseCase_ = 0;
            this.response_ = null;
        }
    }

    public static ab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayText(com.waze.u.a.i iVar) {
        Objects.requireNonNull(iVar);
        if (this.responseCase_ == 101 && this.response_ != com.waze.u.a.i.getDefaultInstance()) {
            com.waze.u.a.h hVarNewBuilder = com.waze.u.a.i.newBuilder((com.waze.u.a.i) this.response_);
            hVarNewBuilder.mergeFrom((com.waze.u.a.h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.response_ = iVar;
        this.responseCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndConversation(com.waze.u.a.k kVar) {
        Objects.requireNonNull(kVar);
        if (this.responseCase_ == 102 && this.response_ != com.waze.u.a.k.getDefaultInstance()) {
            com.waze.u.a.j jVarNewBuilder = com.waze.u.a.k.newBuilder((com.waze.u.a.k) this.response_);
            jVarNewBuilder.mergeFrom((com.waze.u.a.j) kVar);
            kVar = jVarNewBuilder.buildPartial();
        }
        this.response_ = kVar;
        this.responseCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaySound(com.waze.u.a.m mVar) {
        Objects.requireNonNull(mVar);
        if (this.responseCase_ == 100 && this.response_ != com.waze.u.a.m.getDefaultInstance()) {
            com.waze.u.a.l lVarNewBuilder = com.waze.u.a.m.newBuilder((com.waze.u.a.m) this.response_);
            lVarNewBuilder.mergeFrom((com.waze.u.a.l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.response_ = mVar;
        this.responseCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowLocationPreview(q qVar) {
        Objects.requireNonNull(qVar);
        if (this.responseCase_ == 104 && this.response_ != q.getDefaultInstance()) {
            p pVarNewBuilder = q.newBuilder((q) this.response_);
            pVarNewBuilder.mergeFrom((p) qVar);
            qVar = pVarNewBuilder.buildPartial();
        }
        this.response_ = qVar;
        this.responseCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowSearchResults(s sVar) {
        Objects.requireNonNull(sVar);
        if (this.responseCase_ == 103 && this.response_ != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder((s) this.response_);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.response_ = sVar;
        this.responseCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowTripOverview(u uVar) {
        Objects.requireNonNull(uVar);
        if (this.responseCase_ == 105 && this.response_ != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder((u) this.response_);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.response_ = uVar;
        this.responseCase_ = 105;
    }

    public static n newBuilder() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    public static ab parseDelimitedFrom(InputStream inputStream) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(com.google.v.v vVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayText(com.waze.u.a.i iVar) {
        Objects.requireNonNull(iVar);
        this.response_ = iVar;
        this.responseCase_ = 101;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndConversation(com.waze.u.a.k kVar) {
        Objects.requireNonNull(kVar);
        this.response_ = kVar;
        this.responseCase_ = 102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaySound(com.waze.u.a.m mVar) {
        Objects.requireNonNull(mVar);
        this.response_ = mVar;
        this.responseCase_ = 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchContextId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.searchContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchContextIdBytes(com.google.v.v vVar) {
        this.searchContextId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowLocationPreview(q qVar) {
        Objects.requireNonNull(qVar);
        this.response_ = qVar;
        this.responseCase_ = 104;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowSearchResults(s sVar) {
        Objects.requireNonNull(sVar);
        this.response_ = sVar;
        this.responseCase_ = 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTripOverview(u uVar) {
        Objects.requireNonNull(uVar);
        this.response_ = uVar;
        this.responseCase_ = 105;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001i\u0007\u0000\u0000\u0003\u0001ဈ\u0000d<\u0000e<\u0000f<\u0000gм\u0000hм\u0000iм\u0000", new Object[]{"response_", "responseCase_", "bitField0_", "searchContextId_", com.waze.u.a.m.class, com.waze.u.a.i.class, com.waze.u.a.k.class, s.class, q.class, u.class});
            case 3:
                return new ab();
            case 4:
                return new n(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<ab> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ab.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public com.waze.u.a.i getDisplayText() {
        return this.responseCase_ == 101 ? (com.waze.u.a.i) this.response_ : com.waze.u.a.i.getDefaultInstance();
    }

    public com.waze.u.a.k getEndConversation() {
        return this.responseCase_ == 102 ? (com.waze.u.a.k) this.response_ : com.waze.u.a.k.getDefaultInstance();
    }

    public com.waze.u.a.m getPlaySound() {
        return this.responseCase_ == 100 ? (com.waze.u.a.m) this.response_ : com.waze.u.a.m.getDefaultInstance();
    }

    public o getResponseCase() {
        int i2 = this.responseCase_;
        if (i2 == 0) {
            return o.f17445g;
        }
        switch (i2) {
            case 100:
                return o.f17439a;
            case 101:
                return o.f17440b;
            case 102:
                return o.f17441c;
            case 103:
                return o.f17442d;
            case 104:
                return o.f17443e;
            case 105:
                return o.f17444f;
            default:
                return null;
        }
    }

    public String getSearchContextId() {
        return this.searchContextId_;
    }

    public com.google.v.v getSearchContextIdBytes() {
        return com.google.v.v.s(this.searchContextId_);
    }

    public q getShowLocationPreview() {
        return this.responseCase_ == 104 ? (q) this.response_ : q.getDefaultInstance();
    }

    public s getShowSearchResults() {
        return this.responseCase_ == 103 ? (s) this.response_ : s.getDefaultInstance();
    }

    public u getShowTripOverview() {
        return this.responseCase_ == 105 ? (u) this.response_ : u.getDefaultInstance();
    }

    public boolean hasDisplayText() {
        return this.responseCase_ == 101;
    }

    public boolean hasEndConversation() {
        return this.responseCase_ == 102;
    }

    public boolean hasPlaySound() {
        return this.responseCase_ == 100;
    }

    public boolean hasSearchContextId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasShowLocationPreview() {
        return this.responseCase_ == 104;
    }

    public boolean hasShowSearchResults() {
        return this.responseCase_ == 103;
    }

    public boolean hasShowTripOverview() {
        return this.responseCase_ == 105;
    }

    public static n newBuilder(ab abVar) {
        return (n) DEFAULT_INSTANCE.createBuilder(abVar);
    }

    public static ab parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(com.google.v.v vVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ab parseFrom(com.google.v.z zVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ab parseFrom(com.google.v.z zVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ab parseFrom(InputStream inputStream) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(InputStream inputStream, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(ByteBuffer byteBuffer) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ab parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ab parseFrom(byte[] bArr) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ab parseFrom(byte[] bArr, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
