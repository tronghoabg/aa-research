package org.apache.tika.pipes.extractor;

import j$.util.Objects;
import java.io.Serializable;
import wg.b;

/* loaded from: classes5.dex */
public class EmbeddedDocumentBytesConfig implements Serializable {
    public static EmbeddedDocumentBytesConfig SKIP = new EmbeddedDocumentBytesConfig(false);
    private static final long serialVersionUID = -3861669115439125268L;
    private String embeddedIdPrefix;
    private String emitKeyBase;
    private String emitter;
    private boolean extractEmbeddedDocumentBytes;
    private boolean includeOriginal;
    private SUFFIX_STRATEGY suffixStrategy;
    private int zeroPadName;

    public enum SUFFIX_STRATEGY {
        NONE,
        EXISTING,
        DETECTED;

        public static SUFFIX_STRATEGY parse(String str) {
            if (str.equalsIgnoreCase("none")) {
                return NONE;
            }
            if (str.equalsIgnoreCase("existing")) {
                return EXISTING;
            }
            if (str.equalsIgnoreCase("detected")) {
                return DETECTED;
            }
            throw new IllegalArgumentException("can't parse ".concat(str));
        }
    }

    public EmbeddedDocumentBytesConfig() {
        this.zeroPadName = 0;
        this.suffixStrategy = SUFFIX_STRATEGY.NONE;
        this.embeddedIdPrefix = "-";
        this.includeOriginal = false;
        this.emitKeyBase = "";
        this.extractEmbeddedDocumentBytes = true;
    }

    public static EmbeddedDocumentBytesConfig getSKIP() {
        return SKIP;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig = (EmbeddedDocumentBytesConfig) obj;
            if (this.extractEmbeddedDocumentBytes == embeddedDocumentBytesConfig.extractEmbeddedDocumentBytes && this.zeroPadName == embeddedDocumentBytesConfig.zeroPadName && this.includeOriginal == embeddedDocumentBytesConfig.includeOriginal && this.suffixStrategy == embeddedDocumentBytesConfig.suffixStrategy && Objects.equals(this.embeddedIdPrefix, embeddedDocumentBytesConfig.embeddedIdPrefix) && Objects.equals(this.emitter, embeddedDocumentBytesConfig.emitter) && Objects.equals(this.emitKeyBase, embeddedDocumentBytesConfig.emitKeyBase)) {
                return true;
            }
        }
        return false;
    }

    public String getEmbeddedIdPrefix() {
        return this.embeddedIdPrefix;
    }

    public String getEmitKeyBase() {
        return this.emitKeyBase;
    }

    public String getEmitter() {
        return this.emitter;
    }

    public SUFFIX_STRATEGY getSuffixStrategy() {
        return this.suffixStrategy;
    }

    public int getZeroPadName() {
        return this.zeroPadName;
    }

    public int hashCode() {
        return Objects.hashCode(this.emitKeyBase) + ((((Objects.hashCode(this.emitter) + ((Objects.hashCode(this.embeddedIdPrefix) + ((Objects.hashCode(this.suffixStrategy) + ((((this.extractEmbeddedDocumentBytes ? 1231 : 1237) * 31) + this.zeroPadName) * 31)) * 31)) * 31)) * 31) + (this.includeOriginal ? 1231 : 1237)) * 31);
    }

    public boolean isExtractEmbeddedDocumentBytes() {
        return this.extractEmbeddedDocumentBytes;
    }

    public boolean isIncludeOriginal() {
        return this.includeOriginal;
    }

    public void setEmbeddedIdPrefix(String str) {
        this.embeddedIdPrefix = str;
    }

    public void setEmitKeyBase(String str) {
        this.emitKeyBase = str;
    }

    public void setEmitter(String str) {
        this.emitter = str;
    }

    public void setExtractEmbeddedDocumentBytes(boolean z2) {
        this.extractEmbeddedDocumentBytes = z2;
    }

    public void setIncludeOriginal(boolean z2) {
        this.includeOriginal = z2;
    }

    public void setSuffixStrategy(SUFFIX_STRATEGY suffix_strategy) {
        this.suffixStrategy = suffix_strategy;
    }

    public void setZeroPadName(int i5) {
        this.zeroPadName = i5;
    }

    public String toString() {
        boolean z2 = this.extractEmbeddedDocumentBytes;
        int i5 = this.zeroPadName;
        SUFFIX_STRATEGY suffix_strategy = this.suffixStrategy;
        String str = this.embeddedIdPrefix;
        String str2 = this.emitter;
        boolean z10 = this.includeOriginal;
        String str3 = this.emitKeyBase;
        StringBuilder sb2 = new StringBuilder("EmbeddedDocumentBytesConfig{extractEmbeddedDocumentBytes=");
        sb2.append(z2);
        sb2.append(", zeroPadName=");
        sb2.append(i5);
        sb2.append(", suffixStrategy=");
        sb2.append(suffix_strategy);
        sb2.append(", embeddedIdPrefix='");
        sb2.append(str);
        sb2.append("', emitter='");
        sb2.append(str2);
        sb2.append("', includeOriginal=");
        sb2.append(z10);
        sb2.append(", emitKeyBase='");
        return b.c(sb2, str3, "'}");
    }

    public void setSuffixStrategy(String str) {
        setSuffixStrategy(SUFFIX_STRATEGY.valueOf(str));
    }

    public EmbeddedDocumentBytesConfig(boolean z2) {
        this.zeroPadName = 0;
        this.suffixStrategy = SUFFIX_STRATEGY.NONE;
        this.embeddedIdPrefix = "-";
        this.includeOriginal = false;
        this.emitKeyBase = "";
        this.extractEmbeddedDocumentBytes = z2;
    }
}
