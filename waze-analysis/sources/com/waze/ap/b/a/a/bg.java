package com.waze.ap.b.a.a;

import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bg extends com.google.v.du<bg, bf> implements fj {
    public static final int ALERTS_CONFIGURATIONS_FIELD_NUMBER = 2;
    private static final bg DEFAULT_INSTANCE;
    private static volatile fo<bg> PARSER = null;
    public static final int PERMANENT_HAZARD_CONFIGURATIONS_FIELD_NUMBER = 1;
    public static final int QUESTIONS_CONFIGURATIONS_FIELD_NUMBER = 3;
    private eo<bz> permanentHazardConfigurations_ = emptyProtobufList();
    private eo<c> alertsConfigurations_ = emptyProtobufList();
    private eo<cd> questionsConfigurations_ = emptyProtobufList();

    static {
        bg bgVar = new bg();
        DEFAULT_INSTANCE = bgVar;
        com.google.v.du.registerDefaultInstance(bg.class, bgVar);
    }

    private bg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlertsConfigurations(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureAlertsConfigurationsIsMutable();
        this.alertsConfigurations_.add(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlertsConfigurations(Iterable<? extends c> iterable) {
        ensureAlertsConfigurationsIsMutable();
        com.google.v.c.addAll(iterable, this.alertsConfigurations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPermanentHazardConfigurations(Iterable<? extends bz> iterable) {
        ensurePermanentHazardConfigurationsIsMutable();
        com.google.v.c.addAll(iterable, this.permanentHazardConfigurations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQuestionsConfigurations(Iterable<? extends cd> iterable) {
        ensureQuestionsConfigurationsIsMutable();
        com.google.v.c.addAll(iterable, this.questionsConfigurations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermanentHazardConfigurations(int i2, bz bzVar) {
        Objects.requireNonNull(bzVar);
        ensurePermanentHazardConfigurationsIsMutable();
        this.permanentHazardConfigurations_.add(i2, bzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQuestionsConfigurations(int i2, cd cdVar) {
        Objects.requireNonNull(cdVar);
        ensureQuestionsConfigurationsIsMutable();
        this.questionsConfigurations_.add(i2, cdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertsConfigurations() {
        this.alertsConfigurations_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermanentHazardConfigurations() {
        this.permanentHazardConfigurations_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionsConfigurations() {
        this.questionsConfigurations_ = emptyProtobufList();
    }

    private void ensureAlertsConfigurationsIsMutable() {
        eo<c> eoVar = this.alertsConfigurations_;
        if (eoVar.c()) {
            return;
        }
        this.alertsConfigurations_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePermanentHazardConfigurationsIsMutable() {
        eo<bz> eoVar = this.permanentHazardConfigurations_;
        if (eoVar.c()) {
            return;
        }
        this.permanentHazardConfigurations_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureQuestionsConfigurationsIsMutable() {
        eo<cd> eoVar = this.questionsConfigurations_;
        if (eoVar.c()) {
            return;
        }
        this.questionsConfigurations_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bf newBuilder() {
        return (bf) DEFAULT_INSTANCE.createBuilder();
    }

    public static bg parseDelimitedFrom(InputStream inputStream) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(com.google.v.v vVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlertsConfigurations(int i2) {
        ensureAlertsConfigurationsIsMutable();
        this.alertsConfigurations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePermanentHazardConfigurations(int i2) {
        ensurePermanentHazardConfigurationsIsMutable();
        this.permanentHazardConfigurations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQuestionsConfigurations(int i2) {
        ensureQuestionsConfigurationsIsMutable();
        this.questionsConfigurations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertsConfigurations(int i2, c cVar) {
        Objects.requireNonNull(cVar);
        ensureAlertsConfigurationsIsMutable();
        this.alertsConfigurations_.set(i2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermanentHazardConfigurations(int i2, bz bzVar) {
        Objects.requireNonNull(bzVar);
        ensurePermanentHazardConfigurationsIsMutable();
        this.permanentHazardConfigurations_.set(i2, bzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionsConfigurations(int i2, cd cdVar) {
        Objects.requireNonNull(cdVar);
        ensureQuestionsConfigurationsIsMutable();
        this.questionsConfigurations_.set(i2, cdVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"permanentHazardConfigurations_", bz.class, "alertsConfigurations_", c.class, "questionsConfigurations_", cd.class});
        }
        if (iOrdinal == 3) {
            return new bg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public c getAlertsConfigurations(int i2) {
        return this.alertsConfigurations_.get(i2);
    }

    public int getAlertsConfigurationsCount() {
        return this.alertsConfigurations_.size();
    }

    public List<c> getAlertsConfigurationsList() {
        return this.alertsConfigurations_;
    }

    public d getAlertsConfigurationsOrBuilder(int i2) {
        return this.alertsConfigurations_.get(i2);
    }

    public List<? extends d> getAlertsConfigurationsOrBuilderList() {
        return this.alertsConfigurations_;
    }

    public bz getPermanentHazardConfigurations(int i2) {
        return this.permanentHazardConfigurations_.get(i2);
    }

    public int getPermanentHazardConfigurationsCount() {
        return this.permanentHazardConfigurations_.size();
    }

    public List<bz> getPermanentHazardConfigurationsList() {
        return this.permanentHazardConfigurations_;
    }

    public ca getPermanentHazardConfigurationsOrBuilder(int i2) {
        return this.permanentHazardConfigurations_.get(i2);
    }

    public List<? extends ca> getPermanentHazardConfigurationsOrBuilderList() {
        return this.permanentHazardConfigurations_;
    }

    public cd getQuestionsConfigurations(int i2) {
        return this.questionsConfigurations_.get(i2);
    }

    public int getQuestionsConfigurationsCount() {
        return this.questionsConfigurations_.size();
    }

    public List<cd> getQuestionsConfigurationsList() {
        return this.questionsConfigurations_;
    }

    public ce getQuestionsConfigurationsOrBuilder(int i2) {
        return this.questionsConfigurations_.get(i2);
    }

    public List<? extends ce> getQuestionsConfigurationsOrBuilderList() {
        return this.questionsConfigurations_;
    }

    public static bf newBuilder(bg bgVar) {
        return (bf) DEFAULT_INSTANCE.createBuilder(bgVar);
    }

    public static bg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bg parseFrom(com.google.v.z zVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlertsConfigurations(c cVar) {
        Objects.requireNonNull(cVar);
        ensureAlertsConfigurationsIsMutable();
        this.alertsConfigurations_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermanentHazardConfigurations(bz bzVar) {
        Objects.requireNonNull(bzVar);
        ensurePermanentHazardConfigurationsIsMutable();
        this.permanentHazardConfigurations_.add(bzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQuestionsConfigurations(cd cdVar) {
        Objects.requireNonNull(cdVar);
        ensureQuestionsConfigurationsIsMutable();
        this.questionsConfigurations_.add(cdVar);
    }

    public static bg parseFrom(InputStream inputStream) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(ByteBuffer byteBuffer) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bg parseFrom(byte[] bArr) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
