package i.b.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ay extends du<ay, aw> implements az {
    private static final ay DEFAULT_INSTANCE;
    public static final int FIXED_BOOLEAN_RULE_FIELD_NUMBER = 4;
    private static volatile fo<ay> PARSER = null;
    public static final int POINTS_RULE_FIELD_NUMBER = 2;
    public static final int PROPERTY_RULE_FIELD_NUMBER = 6;
    public static final int TARGET_RULE_FIELD_NUMBER = 1;
    public static final int TIME_FRAME_RULE_FIELD_NUMBER = 5;
    private int ruleCase_ = 0;
    private Object rule_;

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        du.registerDefaultInstance(ay.class, ayVar);
    }

    private ay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFixedBooleanRule() {
        if (this.ruleCase_ == 4) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointsRule() {
        if (this.ruleCase_ == 2) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPropertyRule() {
        if (this.ruleCase_ == 6) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRule() {
        this.ruleCase_ = 0;
        this.rule_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetRule() {
        if (this.ruleCase_ == 1) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeFrameRule() {
        if (this.ruleCase_ == 5) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    public static ay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFixedBooleanRule(aa aaVar) {
        Objects.requireNonNull(aaVar);
        if (this.ruleCase_ == 4 && this.rule_ != aa.getDefaultInstance()) {
            z zVarNewBuilder = aa.newBuilder((aa) this.rule_);
            zVarNewBuilder.mergeFrom((z) aaVar);
            aaVar = zVarNewBuilder.buildPartial();
        }
        this.rule_ = aaVar;
        this.ruleCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointsRule(aq aqVar) {
        Objects.requireNonNull(aqVar);
        if (this.ruleCase_ == 2 && this.rule_ != aq.getDefaultInstance()) {
            ap apVarNewBuilder = aq.newBuilder((aq) this.rule_);
            apVarNewBuilder.mergeFrom((ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.rule_ = aqVar;
        this.ruleCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePropertyRule(av avVar) {
        Objects.requireNonNull(avVar);
        if (this.ruleCase_ == 6 && this.rule_ != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder((av) this.rule_);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.rule_ = avVar;
        this.ruleCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTargetRule(bg bgVar) {
        Objects.requireNonNull(bgVar);
        if (this.ruleCase_ == 1 && this.rule_ != bg.getDefaultInstance()) {
            bf bfVarNewBuilder = bg.newBuilder((bg) this.rule_);
            bfVarNewBuilder.mergeFrom((bf) bgVar);
            bgVar = bfVarNewBuilder.buildPartial();
        }
        this.rule_ = bgVar;
        this.ruleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeFrameRule(bk bkVar) {
        Objects.requireNonNull(bkVar);
        if (this.ruleCase_ == 5 && this.rule_ != bk.getDefaultInstance()) {
            bj bjVarNewBuilder = bk.newBuilder((bk) this.rule_);
            bjVarNewBuilder.mergeFrom((bj) bkVar);
            bkVar = bjVarNewBuilder.buildPartial();
        }
        this.rule_ = bkVar;
        this.ruleCase_ = 5;
    }

    public static aw newBuilder() {
        return (aw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ay parseDelimitedFrom(InputStream inputStream) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(com.google.v.v vVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFixedBooleanRule(aa aaVar) {
        Objects.requireNonNull(aaVar);
        this.rule_ = aaVar;
        this.ruleCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsRule(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.rule_ = aqVar;
        this.ruleCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPropertyRule(av avVar) {
        Objects.requireNonNull(avVar);
        this.rule_ = avVar;
        this.ruleCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetRule(bg bgVar) {
        Objects.requireNonNull(bgVar);
        this.rule_ = bgVar;
        this.ruleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeFrameRule(bk bkVar) {
        Objects.requireNonNull(bkVar);
        this.rule_ = bkVar;
        this.ruleCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"rule_", "ruleCase_", bg.class, aq.class, aa.class, bk.class, av.class});
        }
        if (iOrdinal == 3) {
            return new ay();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ay> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ay.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aa getFixedBooleanRule() {
        return this.ruleCase_ == 4 ? (aa) this.rule_ : aa.getDefaultInstance();
    }

    public aq getPointsRule() {
        return this.ruleCase_ == 2 ? (aq) this.rule_ : aq.getDefaultInstance();
    }

    public av getPropertyRule() {
        return this.ruleCase_ == 6 ? (av) this.rule_ : av.getDefaultInstance();
    }

    public ax getRuleCase() {
        int i2 = this.ruleCase_;
        if (i2 == 0) {
            return ax.f48428f;
        }
        if (i2 == 1) {
            return ax.f48423a;
        }
        if (i2 == 2) {
            return ax.f48424b;
        }
        if (i2 == 4) {
            return ax.f48425c;
        }
        if (i2 == 5) {
            return ax.f48426d;
        }
        if (i2 != 6) {
            return null;
        }
        return ax.f48427e;
    }

    public bg getTargetRule() {
        return this.ruleCase_ == 1 ? (bg) this.rule_ : bg.getDefaultInstance();
    }

    public bk getTimeFrameRule() {
        return this.ruleCase_ == 5 ? (bk) this.rule_ : bk.getDefaultInstance();
    }

    public boolean hasFixedBooleanRule() {
        return this.ruleCase_ == 4;
    }

    public boolean hasPointsRule() {
        return this.ruleCase_ == 2;
    }

    public boolean hasPropertyRule() {
        return this.ruleCase_ == 6;
    }

    public boolean hasTargetRule() {
        return this.ruleCase_ == 1;
    }

    public boolean hasTimeFrameRule() {
        return this.ruleCase_ == 5;
    }

    public static aw newBuilder(ay ayVar) {
        return (aw) DEFAULT_INSTANCE.createBuilder(ayVar);
    }

    public static ay parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(com.google.v.v vVar, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ay parseFrom(com.google.v.z zVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ay parseFrom(com.google.v.z zVar, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ay parseFrom(InputStream inputStream) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(InputStream inputStream, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(ByteBuffer byteBuffer) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ay parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ay parseFrom(byte[] bArr) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ay parseFrom(byte[] bArr, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
