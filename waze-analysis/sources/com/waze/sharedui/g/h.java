package com.waze.sharedui.g;

import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f38954a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38955b;

    /* renamed from: c, reason: collision with root package name */
    private final b f38956c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38957d;

    h(i iVar, b bVar, int i2, List list) {
        Objects.requireNonNull(iVar);
        this.f38954a = iVar;
        this.f38956c = bVar;
        this.f38957d = i2;
        this.f38955b = list;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        int iB = this.f38956c.b();
        int i2 = this.f38957d;
        return (((iB + i2) - 1) / i2) * i2;
    }

    @Override // android.support.v7.widget.eb
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.support.v7.widget.eb
    public final void onBindViewHolder(fe feVar, int i2) {
        View view = feVar.itemView;
        List list = this.f38955b;
        if (i2 >= list.size() || i2 < 0) {
            if (this.f38957d != 1) {
                i.p(view, null);
                i.o(view, R.id.bottomSheetItemLabel, null);
                view.setEnabled(false);
                return;
            }
            return;
        }
        e eVar = (e) list.get(i2);
        b bVar = this.f38956c;
        if (bVar instanceof c) {
            c cVar = (c) bVar;
            if (cVar.d()) {
                cVar.e();
                return;
            }
        }
        eVar.g(feVar.itemView, bVar, i2);
        if (eVar.e()) {
            view.setEnabled(true);
        }
    }

    @Override // android.support.v7.widget.eb
    public final fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        i iVar = this.f38954a;
        return new g(this, iVar.f38959b.inflate(iVar.f38965h, viewGroup, false));
    }
}
