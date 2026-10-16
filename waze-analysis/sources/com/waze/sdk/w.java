package com.waze.sdk;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
enum w {
    SAVE("waze.save", 1, R.drawable.audio_save_icon, "waze.state.isSaved"),
    BOOKMARK("waze.bookmark", 1, R.drawable.audio_bookmark_icon, "waze.state.isBookmarked"),
    FAVORITE("waze.favorite", 1, R.drawable.audio_love_icon, "waze.state.isFavorite"),
    THUMB_UP("waze.thumbUp", 1, R.drawable.audio_thumbup_icon, "waze.state.isThumbUp"),
    THUMB_DOWN("waze.thumbDown", 2, R.drawable.audio_thumbdown_icon, "waze.state.isThumbDown"),
    START_RADIO("waze.startRadio", 1, R.drawable.audio_start_radio_icon, null),
    SHUFFLE("waze.shuffle", 2, R.drawable.audio_shuffle_icon, "waze.state.isShuffleMode"),
    REPEAT("waze.repeat", 2, R.drawable.audio_repeat_icon, "waze.state.isRepeatMode"),
    REPEAT_ONE("waze.repeatOne", 2, R.drawable.audio_repeat_one_icon, "waze.state.isRepeatOneMode");


    /* renamed from: j, reason: collision with root package name */
    final String f35427j;

    /* renamed from: k, reason: collision with root package name */
    final int f35428k;

    /* renamed from: l, reason: collision with root package name */
    final String f35429l;
    final int m;

    w(String str, int i2, int i3, String str2) {
        this.f35427j = str;
        this.m = i2;
        this.f35428k = i3;
        this.f35429l = str2;
    }
}
