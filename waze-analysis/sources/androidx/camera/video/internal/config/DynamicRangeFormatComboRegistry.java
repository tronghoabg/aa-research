package androidx.camera.video.internal.config;

import android.os.Build;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.config.FormatComboRegistry;
import androidx.media3.common.MimeTypes;
import h.a.i;
import h.a.r;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.k;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRangeFormatComboRegistry {
    public static final DynamicRangeFormatComboRegistry INSTANCE;
    private static final String MIMETYPE_AUDIO_OPUS_GATED;
    private static final String MIMETYPE_VIDEO_APV_GATED;
    private static final String MIMETYPE_VIDEO_AV1_GATED;
    private static final String MIMETYPE_VIDEO_DOLBY_VISION_GATED;
    private static final String MIMETYPE_VIDEO_HEVC_GATED;
    private static final String MIMETYPE_VIDEO_VP9_GATED;
    private static final f registries$delegate;
    private static final f standardMp4Audios$delegate;
    private static final f standardWebmAudios$delegate;

    static {
        DynamicRangeFormatComboRegistry dynamicRangeFormatComboRegistry = new DynamicRangeFormatComboRegistry();
        INSTANCE = dynamicRangeFormatComboRegistry;
        MIMETYPE_VIDEO_HEVC_GATED = dynamicRangeFormatComboRegistry.takeIf(MimeTypes.VIDEO_H265, 24);
        MIMETYPE_VIDEO_VP9_GATED = dynamicRangeFormatComboRegistry.takeIf(MimeTypes.VIDEO_VP9, 24);
        MIMETYPE_AUDIO_OPUS_GATED = dynamicRangeFormatComboRegistry.takeIf(MimeTypes.AUDIO_OPUS, 29);
        MIMETYPE_VIDEO_DOLBY_VISION_GATED = dynamicRangeFormatComboRegistry.takeIf(MimeTypes.VIDEO_DOLBY_VISION, 33);
        MIMETYPE_VIDEO_AV1_GATED = dynamicRangeFormatComboRegistry.takeIf(MimeTypes.VIDEO_AV1, 34);
        MIMETYPE_VIDEO_APV_GATED = dynamicRangeFormatComboRegistry.takeIf(MimeTypes.VIDEO_APV, 36);
        registries$delegate = g.a(new a() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return DynamicRangeFormatComboRegistry.registries_delegate$lambda$0();
            }
        });
        standardMp4Audios$delegate = g.a(new a() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return i.k("audio/mp4a-latm", MimeTypes.AUDIO_AMR_NB, MimeTypes.AUDIO_AMR_WB);
            }
        });
        standardWebmAudios$delegate = g.a(new a() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return i.k(MimeTypes.AUDIO_VORBIS, DynamicRangeFormatComboRegistry.MIMETYPE_AUDIO_OPUS_GATED);
            }
        });
    }

    private DynamicRangeFormatComboRegistry() {
    }

    private final FormatComboRegistry buildDolbyVisionRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new l() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DynamicRangeFormatComboRegistry.buildDolbyVisionRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab buildDolbyVisionRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope containerScope) {
        x.f(containerScope, "$this$container");
        containerScope.support(i.j(MIMETYPE_VIDEO_DOLBY_VISION_GATED), INSTANCE.getStandardMp4Audios());
        return ab.f48028a;
    }

    private final FormatComboRegistry buildHdr10PlusRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new l() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DynamicRangeFormatComboRegistry.buildHdr10PlusRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab buildHdr10PlusRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope containerScope) {
        x.f(containerScope, "$this$container");
        containerScope.support(i.k(MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_AV1_GATED), INSTANCE.getStandardMp4Audios());
        return ab.f48028a;
    }

    private final FormatComboRegistry buildHdr10Registry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new l() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DynamicRangeFormatComboRegistry.buildHdr10Registry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        builder.container(1, new l() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda9
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DynamicRangeFormatComboRegistry.buildHdr10Registry$lambda$0$1((FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab buildHdr10Registry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope containerScope) {
        x.f(containerScope, "$this$container");
        containerScope.support(i.k(MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_AV1_GATED, MIMETYPE_VIDEO_APV_GATED), INSTANCE.getStandardMp4Audios());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab buildHdr10Registry$lambda$0$1(FormatComboRegistry.Builder.ContainerScope containerScope) {
        x.f(containerScope, "$this$container");
        containerScope.support(i.j(MIMETYPE_VIDEO_VP9_GATED), INSTANCE.getStandardWebmAudios());
        return ab.f48028a;
    }

    private final FormatComboRegistry buildHlgRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new l() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DynamicRangeFormatComboRegistry.buildHlgRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab buildHlgRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope containerScope) {
        x.f(containerScope, "$this$container");
        containerScope.support(i.k(MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_AV1_GATED, MIMETYPE_VIDEO_APV_GATED), INSTANCE.getStandardMp4Audios());
        return ab.f48028a;
    }

    private final FormatComboRegistry buildSdrRegistry() {
        FormatComboRegistry.Builder builder = new FormatComboRegistry.Builder();
        builder.container(0, new l() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DynamicRangeFormatComboRegistry.buildSdrRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        builder.container(1, new l() { // from class: androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DynamicRangeFormatComboRegistry.buildSdrRegistry$lambda$0$1((FormatComboRegistry.Builder.ContainerScope) obj);
            }
        });
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab buildSdrRegistry$lambda$0$0(FormatComboRegistry.Builder.ContainerScope containerScope) {
        x.f(containerScope, "$this$container");
        containerScope.support(i.k("video/avc", MimeTypes.VIDEO_MP4V, MimeTypes.VIDEO_H263, MIMETYPE_VIDEO_HEVC_GATED, MIMETYPE_VIDEO_AV1_GATED, MIMETYPE_VIDEO_APV_GATED), INSTANCE.getStandardMp4Audios());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab buildSdrRegistry$lambda$0$1(FormatComboRegistry.Builder.ContainerScope containerScope) {
        x.f(containerScope, "$this$container");
        containerScope.support(i.k(MimeTypes.VIDEO_VP8, MIMETYPE_VIDEO_VP9_GATED), INSTANCE.getStandardWebmAudios());
        return ab.f48028a;
    }

    private final Map<DynamicRange, FormatComboRegistry> getRegistries() {
        return (Map) registries$delegate.getValue();
    }

    private final List<String> getStandardMp4Audios() {
        return (List) standardMp4Audios$delegate.getValue();
    }

    private final List<String> getStandardWebmAudios() {
        return (List) standardWebmAudios$delegate.getValue();
    }

    static final Map registries_delegate$lambda$0() {
        DynamicRange dynamicRange = DynamicRange.SDR;
        DynamicRangeFormatComboRegistry dynamicRangeFormatComboRegistry = INSTANCE;
        return r.m(new k(dynamicRange, dynamicRangeFormatComboRegistry.buildSdrRegistry()), new k(DynamicRange.HLG_10_BIT, dynamicRangeFormatComboRegistry.buildHlgRegistry()), new k(DynamicRange.HDR10_10_BIT, dynamicRangeFormatComboRegistry.buildHdr10Registry()), new k(DynamicRange.HDR10_PLUS_10_BIT, dynamicRangeFormatComboRegistry.buildHdr10PlusRegistry()), new k(DynamicRange.DOLBY_VISION_8_BIT, dynamicRangeFormatComboRegistry.buildDolbyVisionRegistry()), new k(DynamicRange.DOLBY_VISION_10_BIT, dynamicRangeFormatComboRegistry.buildDolbyVisionRegistry()));
    }

    private final String takeIf(String str, int i2) {
        if (Build.VERSION.SDK_INT >= i2) {
            return str;
        }
        return null;
    }

    public final Set<DynamicRange> getDynamicRangesForVideoMime(String str) {
        x.f(str, "videoMime");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<DynamicRange, FormatComboRegistry> entry : getRegistries().entrySet()) {
            DynamicRange key = entry.getKey();
            if (!entry.getValue().getCombosForVideo(str).isEmpty()) {
                linkedHashSet.add(key);
            }
        }
        return linkedHashSet;
    }

    public final FormatComboRegistry getRegistry(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        return getRegistries().get(dynamicRange);
    }
}
