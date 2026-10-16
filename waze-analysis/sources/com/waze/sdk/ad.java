package com.waze.sdk;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad extends eb {

    /* renamed from: a, reason: collision with root package name */
    final List f35213a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f35214b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35215c;

    /* synthetic */ ad(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.f35214b = aeVar;
        this.f35215c = aeVar.getResources().getDimensionPixelOffset(R.dimen.audio_panel_playlist_group_title_margin);
        this.f35213a = new ArrayList();
    }

    final boolean a(int i2) {
        return ((MediaBrowserCompat$MediaItem) this.f35213a.get(i2)).isBrowsable();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f35213a.size();
    }

    @Override // android.support.v7.widget.eb
    public final long getItemId(int i2) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) this.f35213a.get(i2);
        if (mediaBrowserCompat$MediaItem == null || mediaBrowserCompat$MediaItem.getMediaId() == null) {
            return 0L;
        }
        return TextUtils.equals(mediaBrowserCompat$MediaItem.getMediaId(), this.f35214b.N) ? -mediaBrowserCompat$MediaItem.getMediaId().hashCode() : mediaBrowserCompat$MediaItem.getMediaId().hashCode();
    }

    @Override // android.support.v7.widget.eb
    public final int getItemViewType(int i2) {
        return a(i2) ? 1 : 2;
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(fe feVar, int i2) {
        if (feVar instanceof z) {
            ((z) feVar).f35438a.setText(((MediaBrowserCompat$MediaItem) this.f35213a.get(i2)).getDescription().getTitle());
        } else {
            ac.e((ac) feVar, (MediaBrowserCompat$MediaItem) this.f35213a.get(i2));
        }
    }

    @Override // android.support.v7.widget.eb
    public final fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 != 1) {
            return new ac(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.audio_panel_playlist_item, viewGroup, false));
        }
        ae aeVar = this.f35214b;
        WazeTextView wazeTextView = new WazeTextView(aeVar.getContext(), null);
        int i3 = this.f35215c;
        wazeTextView.setPadding(0, i3, 0, i3);
        wazeTextView.setTextAppearance(aeVar.getContext(), R.style.AudioPanelListGroupTitle);
        return new z(this, wazeTextView);
    }
}
