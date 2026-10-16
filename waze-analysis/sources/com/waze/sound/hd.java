package com.waze.sound;

import android.content.Context;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.TeeAudioProcessor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hd extends DefaultRenderersFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hc f40130a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hd(Context context, hc hcVar) {
        super(context);
        this.f40130a = hcVar;
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    protected final AudioSink buildAudioSink(Context context, boolean z, boolean z2) {
        h.g.b.x.f(context, "context");
        DefaultAudioSink.Builder builder = new DefaultAudioSink.Builder(context);
        builder.setEnableAudioOutputPlaybackParameters(z2);
        builder.setAudioProcessors(new TeeAudioProcessor[]{new TeeAudioProcessor(this.f40130a)});
        DefaultAudioSink defaultAudioSinkBuild = builder.build();
        h.g.b.x.e(defaultAudioSinkBuild, "build(...)");
        return defaultAudioSinkBuild;
    }
}
