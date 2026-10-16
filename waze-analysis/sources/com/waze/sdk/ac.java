package com.waze.sdk;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v7.widget.fe;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.waze.R;
import com.waze.mg;
import com.waze.sharedui.views.WazeTextView;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends fe {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f35206a;

    /* renamed from: b, reason: collision with root package name */
    private final View f35207b;

    /* renamed from: c, reason: collision with root package name */
    private final WazeTextView f35208c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f35209d;

    /* renamed from: e, reason: collision with root package name */
    private MediaBrowserCompat$MediaItem f35210e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f35211f;

    /* renamed from: g, reason: collision with root package name */
    private String f35212g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ad adVar, View view) {
        super(view);
        Objects.requireNonNull(adVar);
        this.f35206a = adVar;
        this.f35207b = view;
        this.f35208c = (WazeTextView) view.findViewById(R.id.playlist_label);
        this.f35209d = (ImageView) view.findViewById(R.id.playlist_poster);
    }

    static /* bridge */ /* synthetic */ void e(final ac acVar, final MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        if (mediaBrowserCompat$MediaItem == null) {
            acVar.f35209d.setVisibility(4);
            acVar.f35208c.setVisibility(4);
            return;
        }
        acVar.f35210e = mediaBrowserCompat$MediaItem;
        ImageView imageView = acVar.f35209d;
        imageView.setVisibility(0);
        WazeTextView wazeTextView = acVar.f35208c;
        wazeTextView.setVisibility(0);
        wazeTextView.setText(mediaBrowserCompat$MediaItem.getDescription().getTitle());
        if (mediaBrowserCompat$MediaItem.getDescription().getIconBitmap() != null && !mediaBrowserCompat$MediaItem.getDescription().getIconBitmap().sameAs(acVar.f35211f)) {
            imageView.setImageResource(R.drawable.music_player_artwork_placeholder);
            com.bumptech.glide.ac acVarE = com.bumptech.glide.c.e(mg.a());
            Bitmap iconBitmap = mediaBrowserCompat$MediaItem.getDescription().getIconBitmap();
            int i2 = com.waze.utils.i.f44883a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            iconBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            acVarE.c().h(byteArrayOutputStream.toByteArray()).k(imageView);
            acVar.f35211f = mediaBrowserCompat$MediaItem.getDescription().getIconBitmap();
            acVar.f35212g = null;
        } else if (mediaBrowserCompat$MediaItem.getDescription().getIconUri() != null && !mediaBrowserCompat$MediaItem.getDescription().getIconUri().toString().equals(acVar.f35212g)) {
            imageView.setImageResource(R.drawable.music_player_artwork_placeholder);
            acVar.f35211f = null;
            acVar.f35212g = null;
            com.waze.utils.i.a().c(mediaBrowserCompat$MediaItem.getDescription().getIconUri().toString(), new ab(acVar, mediaBrowserCompat$MediaItem.getMediaId(), mediaBrowserCompat$MediaItem));
        }
        String mediaId = mediaBrowserCompat$MediaItem.getMediaId();
        ae aeVar = acVar.f35206a.f35214b;
        if (TextUtils.equals(mediaId, aeVar.N)) {
            imageView.setBackgroundColor(aeVar.f35219e.L());
            wazeTextView.setTextColor(aeVar.f35219e.L());
            wazeTextView.e(3);
        } else {
            imageView.setBackgroundColor(aeVar.getResources().getColor(android.R.color.transparent));
            wazeTextView.setTextColor(aeVar.getResources().getColor(R.color.always_dark_content_p2));
            wazeTextView.e(1);
        }
        acVar.f35207b.setOnClickListener(new View.OnClickListener() { // from class: com.waze.sdk.aa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = mediaBrowserCompat$MediaItem;
                String mediaId2 = mediaBrowserCompat$MediaItem2.getMediaId();
                Bundle extras = mediaBrowserCompat$MediaItem2.getDescription().getExtras();
                ae aeVar2 = this.f35201a.f35206a.f35214b;
                if (!TextUtils.equals(mediaId2, aeVar2.N) && aeVar2.f35220f != null) {
                    aeVar2.f35220f.d(mediaId2, extras);
                }
                aeVar2.ar(false);
            }
        });
    }
}
