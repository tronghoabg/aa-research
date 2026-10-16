package com.waze.uid.c;

import android.content.Context;
import android.widget.BaseAdapter;
import androidx.core.content.ContextCompat;
import com.waze.R;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44419a;

    /* renamed from: b, reason: collision with root package name */
    private final List f44420b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44421c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44422d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44423e;

    /* renamed from: f, reason: collision with root package name */
    private final int f44424f;

    /* renamed from: g, reason: collision with root package name */
    private final int f44425g;

    /* renamed from: h, reason: collision with root package name */
    private final int f44426h;

    /* renamed from: i, reason: collision with root package name */
    private long f44427i;

    public u(Context context, List list) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(list, "viewItems");
        this.f44419a = context;
        this.f44420b = list;
        this.f44421c = com.waze.shared_infra.o.b.a();
        this.f44422d = R.layout.choose_account_profile_table;
        this.f44423e = ContextCompat.getColor(context, R.color.content_default);
        this.f44424f = ContextCompat.getColor(context, R.color.content_p2);
        this.f44425g = ContextCompat.getColor(context, R.color.on_primary);
        this.f44426h = ContextCompat.getColor(context, R.color.on_primary);
        this.f44427i = -1L;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s getItem(int i2) {
        return (s) this.f44420b.get(i2);
    }

    public final void b(long j2) {
        this.f44427i = j2;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f44420b.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i2) {
        return getItem(i2).a() == this.f44422d ? t.f44415a.a() : t.f44416b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.c.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return t.values().length;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
