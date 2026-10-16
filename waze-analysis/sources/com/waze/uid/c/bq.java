package com.waze.uid.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bq extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bt f44298a;

    bq(bt btVar) {
        Objects.requireNonNull(btVar);
        this.f44298a = btVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return bt.f44303b.size() + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.auth_welcome_card, viewGroup, false);
        bs bsVar = (bs) bt.f44303b.get(i2 % bt.f44303b.size());
        ((TextView) viewInflate.findViewById(R.id.cardText)).setText(this.f44298a.q.c(bsVar.f44300a, new Object[0]));
        ((ImageView) viewInflate.findViewById(R.id.cardImage)).setImageResource(bsVar.f44301b);
        viewGroup.addView(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.waze.uid.c.bp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bt btVar = this.f44297a.f44298a;
                bt.K(6);
                btVar.H();
                btVar.F();
            }
        });
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
