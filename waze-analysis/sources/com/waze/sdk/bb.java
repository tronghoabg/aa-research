package com.waze.sdk;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class bb {

    /* renamed from: a, reason: collision with root package name */
    final MediaBrowserCompat$MediaItem f35307a;

    /* renamed from: b, reason: collision with root package name */
    public List f35308b;

    public bb() {
        android.support.v4.media.n nVar = new android.support.v4.media.n();
        nVar.f(String.format("id_%s", ""));
        nVar.i("");
        this.f35307a = new MediaBrowserCompat$MediaItem(nVar.a(), 1);
    }

    public bb(MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        if (mediaBrowserCompat$MediaItem.getDescription().getTitle() != null) {
            mediaBrowserCompat$MediaItem.getDescription().getTitle().toString();
        }
        this.f35307a = mediaBrowserCompat$MediaItem;
    }
}
