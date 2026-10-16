package com.waze.sdk.a;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import com.waze.sdk.bb;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends bb {

    /* renamed from: c, reason: collision with root package name */
    final String f35183c;

    /* renamed from: d, reason: collision with root package name */
    boolean f35184d;

    /* renamed from: e, reason: collision with root package name */
    final android.support.v4.media.k f35185e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f35186f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        super(mediaBrowserCompat$MediaItem);
        Objects.requireNonNull(iVar);
        this.f35186f = iVar;
        f fVar = new f(this);
        this.f35185e = fVar;
        String mediaId = mediaBrowserCompat$MediaItem.getMediaId();
        this.f35183c = mediaId;
        if (iVar.f35190d == null || mediaId == null) {
            return;
        }
        iVar.f35190d.e(mediaId, fVar);
    }

    h(i iVar) {
        Objects.requireNonNull(iVar);
        this.f35186f = iVar;
        this.f35185e = new f(this);
        this.f35183c = "WazeAudioSdk.defaultGroup";
    }
}
