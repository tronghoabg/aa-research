package com.waze.share;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends eb {

    /* renamed from: a, reason: collision with root package name */
    final List f37734a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f37735b;

    u(v vVar, List list) {
        Objects.requireNonNull(vVar);
        this.f37735b = vVar;
        this.f37734a = list;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f37734a.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        t tVar = (t) feVar;
        ResolveInfo resolveInfo = (ResolveInfo) this.f37734a.get(i2);
        int i3 = t.f37730d;
        ImageView imageView = tVar.f37731a;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        v vVar = tVar.f37733c.f37735b;
        imageView.setImageDrawable(activityInfo.loadIcon(vVar.f37741f));
        TextView textView = tVar.f37732b;
        textView.setText(resolveInfo.activityInfo.loadLabel(vVar.f37741f));
        textView.setTextColor(ContextCompat.getColor(vVar.getContext(), R.color.content_p2));
        tVar.itemView.setOnClickListener(new s(tVar, resolveInfo));
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new t(this, View.inflate(this.f37735b.getContext(), R.layout.share_selector_app_item, null));
    }
}
