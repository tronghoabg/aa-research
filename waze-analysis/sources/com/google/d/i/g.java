package com.google.d.i;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends du<g, d> implements fj {
    public static final int ASSISTIVE_TOUCH_RUNNING_FIELD_NUMBER = 1;
    public static final int BOLD_TEXT_ENABLED_FIELD_NUMBER = 6;
    public static final int CLOSED_CAPTIONING_ENABLED_FIELD_NUMBER = 5;
    public static final int CONTENT_SIZE_CATEGORY_FIELD_NUMBER = 19;
    public static final int DARKER_SYSTEM_COLORS_ENABLED_FIELD_NUMBER = 7;
    private static final g DEFAULT_INSTANCE;
    public static final int DIFFERENTIATE_WITHOUT_COLOR_ENABLED_FIELD_NUMBER = 18;
    public static final int GRAYSCALE_ENABLED_FIELD_NUMBER = 8;
    public static final int GUIDED_ACCESS_ENABLED_FIELD_NUMBER = 9;
    public static final int INVERT_COLORS_ENABLED_FIELD_NUMBER = 10;
    public static final int MONO_AUDIO_ENABLED_FIELD_NUMBER = 11;
    public static final int ON_OFF_SWITCH_LABELS_ENABLED_FIELD_NUMBER = 16;
    private static volatile fo<g> PARSER = null;
    public static final int REDUCE_MOTION_ENABLED_FIELD_NUMBER = 12;
    public static final int REDUCE_TRANSPARENCY_ENABLED_FIELD_NUMBER = 13;
    public static final int SHAKE_TO_UNDO_ENABLED_FIELD_NUMBER = 4;
    public static final int SPEAK_SCREEN_ENABLED_FIELD_NUMBER = 14;
    public static final int SPEAK_SELECTION_ENABLED_FIELD_NUMBER = 15;
    public static final int SWITCH_CONTROL_RUNNING_FIELD_NUMBER = 3;
    public static final int VIDEO_AUTOPLAY_ENABLED_FIELD_NUMBER = 17;
    public static final int VOICE_OVER_RUNNING_FIELD_NUMBER = 2;
    private boolean assistiveTouchRunning_;
    private int bitField0_;
    private boolean boldTextEnabled_;
    private boolean closedCaptioningEnabled_;
    private int contentSizeCategory_;
    private boolean darkerSystemColorsEnabled_;
    private boolean differentiateWithoutColorEnabled_;
    private boolean grayscaleEnabled_;
    private boolean guidedAccessEnabled_;
    private boolean invertColorsEnabled_;
    private boolean monoAudioEnabled_;
    private boolean onOffSwitchLabelsEnabled_;
    private boolean reduceMotionEnabled_;
    private boolean reduceTransparencyEnabled_;
    private boolean shakeToUndoEnabled_;
    private boolean speakScreenEnabled_;
    private boolean speakSelectionEnabled_;
    private boolean switchControlRunning_;
    private boolean videoAutoplayEnabled_;
    private boolean voiceOverRunning_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistiveTouchRunning() {
        this.bitField0_ &= -2;
        this.assistiveTouchRunning_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoldTextEnabled() {
        this.bitField0_ &= -33;
        this.boldTextEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClosedCaptioningEnabled() {
        this.bitField0_ &= -17;
        this.closedCaptioningEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentSizeCategory() {
        this.bitField0_ &= -262145;
        this.contentSizeCategory_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDarkerSystemColorsEnabled() {
        this.bitField0_ &= -65;
        this.darkerSystemColorsEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDifferentiateWithoutColorEnabled() {
        this.bitField0_ &= -131073;
        this.differentiateWithoutColorEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGrayscaleEnabled() {
        this.bitField0_ &= -129;
        this.grayscaleEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidedAccessEnabled() {
        this.bitField0_ &= -257;
        this.guidedAccessEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInvertColorsEnabled() {
        this.bitField0_ &= -513;
        this.invertColorsEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonoAudioEnabled() {
        this.bitField0_ &= -1025;
        this.monoAudioEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnOffSwitchLabelsEnabled() {
        this.bitField0_ &= -32769;
        this.onOffSwitchLabelsEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReduceMotionEnabled() {
        this.bitField0_ &= -2049;
        this.reduceMotionEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReduceTransparencyEnabled() {
        this.bitField0_ &= -4097;
        this.reduceTransparencyEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShakeToUndoEnabled() {
        this.bitField0_ &= -9;
        this.shakeToUndoEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakScreenEnabled() {
        this.bitField0_ &= -8193;
        this.speakScreenEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakSelectionEnabled() {
        this.bitField0_ &= -16385;
        this.speakSelectionEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchControlRunning() {
        this.bitField0_ &= -5;
        this.switchControlRunning_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoAutoplayEnabled() {
        this.bitField0_ &= -65537;
        this.videoAutoplayEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceOverRunning() {
        this.bitField0_ &= -3;
        this.voiceOverRunning_ = false;
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistiveTouchRunning(boolean z) {
        this.bitField0_ |= 1;
        this.assistiveTouchRunning_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoldTextEnabled(boolean z) {
        this.bitField0_ |= 32;
        this.boldTextEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosedCaptioningEnabled(boolean z) {
        this.bitField0_ |= 16;
        this.closedCaptioningEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentSizeCategory(f fVar) {
        this.contentSizeCategory_ = fVar.getNumber();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkerSystemColorsEnabled(boolean z) {
        this.bitField0_ |= 64;
        this.darkerSystemColorsEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDifferentiateWithoutColorEnabled(boolean z) {
        this.bitField0_ |= 131072;
        this.differentiateWithoutColorEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrayscaleEnabled(boolean z) {
        this.bitField0_ |= 128;
        this.grayscaleEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidedAccessEnabled(boolean z) {
        this.bitField0_ |= 256;
        this.guidedAccessEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvertColorsEnabled(boolean z) {
        this.bitField0_ |= 512;
        this.invertColorsEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonoAudioEnabled(boolean z) {
        this.bitField0_ |= 1024;
        this.monoAudioEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnOffSwitchLabelsEnabled(boolean z) {
        this.bitField0_ |= 32768;
        this.onOffSwitchLabelsEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReduceMotionEnabled(boolean z) {
        this.bitField0_ |= 2048;
        this.reduceMotionEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReduceTransparencyEnabled(boolean z) {
        this.bitField0_ |= 4096;
        this.reduceTransparencyEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShakeToUndoEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.shakeToUndoEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakScreenEnabled(boolean z) {
        this.bitField0_ |= 8192;
        this.speakScreenEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakSelectionEnabled(boolean z) {
        this.bitField0_ |= 16384;
        this.speakSelectionEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchControlRunning(boolean z) {
        this.bitField0_ |= 4;
        this.switchControlRunning_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoAutoplayEnabled(boolean z) {
        this.bitField0_ |= 65536;
        this.videoAutoplayEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceOverRunning(boolean z) {
        this.bitField0_ |= 2;
        this.voiceOverRunning_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဇ\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0013᠌\u0012", new Object[]{"bitField0_", "assistiveTouchRunning_", "voiceOverRunning_", "switchControlRunning_", "shakeToUndoEnabled_", "closedCaptioningEnabled_", "boldTextEnabled_", "darkerSystemColorsEnabled_", "grayscaleEnabled_", "guidedAccessEnabled_", "invertColorsEnabled_", "monoAudioEnabled_", "reduceMotionEnabled_", "reduceTransparencyEnabled_", "speakScreenEnabled_", "speakSelectionEnabled_", "onOffSwitchLabelsEnabled_", "videoAutoplayEnabled_", "differentiateWithoutColorEnabled_", "contentSizeCategory_", e.f7920a});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAssistiveTouchRunning() {
        return this.assistiveTouchRunning_;
    }

    public boolean getBoldTextEnabled() {
        return this.boldTextEnabled_;
    }

    public boolean getClosedCaptioningEnabled() {
        return this.closedCaptioningEnabled_;
    }

    public f getContentSizeCategory() {
        f fVarA = f.a(this.contentSizeCategory_);
        return fVarA == null ? f.UNSPECIFIED : fVarA;
    }

    public boolean getDarkerSystemColorsEnabled() {
        return this.darkerSystemColorsEnabled_;
    }

    public boolean getDifferentiateWithoutColorEnabled() {
        return this.differentiateWithoutColorEnabled_;
    }

    public boolean getGrayscaleEnabled() {
        return this.grayscaleEnabled_;
    }

    public boolean getGuidedAccessEnabled() {
        return this.guidedAccessEnabled_;
    }

    public boolean getInvertColorsEnabled() {
        return this.invertColorsEnabled_;
    }

    public boolean getMonoAudioEnabled() {
        return this.monoAudioEnabled_;
    }

    public boolean getOnOffSwitchLabelsEnabled() {
        return this.onOffSwitchLabelsEnabled_;
    }

    public boolean getReduceMotionEnabled() {
        return this.reduceMotionEnabled_;
    }

    public boolean getReduceTransparencyEnabled() {
        return this.reduceTransparencyEnabled_;
    }

    public boolean getShakeToUndoEnabled() {
        return this.shakeToUndoEnabled_;
    }

    public boolean getSpeakScreenEnabled() {
        return this.speakScreenEnabled_;
    }

    public boolean getSpeakSelectionEnabled() {
        return this.speakSelectionEnabled_;
    }

    public boolean getSwitchControlRunning() {
        return this.switchControlRunning_;
    }

    public boolean getVideoAutoplayEnabled() {
        return this.videoAutoplayEnabled_;
    }

    public boolean getVoiceOverRunning() {
        return this.voiceOverRunning_;
    }

    public boolean hasAssistiveTouchRunning() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBoldTextEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClosedCaptioningEnabled() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasContentSizeCategory() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasDarkerSystemColorsEnabled() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDifferentiateWithoutColorEnabled() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasGrayscaleEnabled() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasGuidedAccessEnabled() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasInvertColorsEnabled() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasMonoAudioEnabled() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasOnOffSwitchLabelsEnabled() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasReduceMotionEnabled() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasReduceTransparencyEnabled() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasShakeToUndoEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSpeakScreenEnabled() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasSpeakSelectionEnabled() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasSwitchControlRunning() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVideoAutoplayEnabled() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasVoiceOverRunning() {
        return (this.bitField0_ & 2) != 0;
    }

    public static d newBuilder(g gVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(z zVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
