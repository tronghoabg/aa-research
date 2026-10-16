package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.sdk.KeyboardSearchLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class xes extends lt implements oxi {
    final /* synthetic */ KeyboardSearchLayout a;
    private int e = -1;
    private final List f = new ArrayList();

    public xes(KeyboardSearchLayout keyboardSearchLayout) {
        this.a = keyboardSearchLayout;
    }

    @Override // defpackage.lt
    public final int a() {
        int i = this.e;
        List list = this.f;
        return i < 0 ? list.size() : Math.min(list.size(), this.e);
    }

    @Override // defpackage.oxi
    public final void b(int i) {
        this.e = i;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return new xet(LayoutInflater.from(this.a.getContext()).inflate(R.layout.demand_space_search_suggestion, viewGroup, false));
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        xet xetVar = (xet) moVar;
        ((ype) KeyboardSearchLayout.a.l().ai((char) 10171)).y("#onBindViewHolder holder=%s", xetVar);
        xqi xqiVar = new xqi(new Bundle(((xqi) this.f.get(i)).a));
        if (xqiVar.a() == 0) {
            throw new IllegalStateException("Type must be set");
        }
        if (xqiVar.f() == null) {
            throw new IllegalStateException("Title must be set");
        }
        xetVar.t.setText(xqiVar.f());
        if (xqiVar.b() != null) {
            ImageView imageView = xetVar.s;
            imageView.setImageBitmap(xqiVar.b());
            imageView.setVisibility(0);
        } else {
            xetVar.s.setVisibility(8);
        }
        if (xqiVar.e() != null) {
            TextView textView = xetVar.u;
            textView.setText(xqiVar.e());
            textView.setVisibility(0);
        } else {
            xetVar.u.setVisibility(8);
        }
        if (xqiVar.c() != null) {
            TextView textView2 = xetVar.w;
            textView2.setText(xqiVar.c());
            textView2.setVisibility(0);
        } else {
            xetVar.w.setVisibility(8);
        }
        if (xqiVar.d() != null) {
            TextView textView3 = xetVar.x;
            textView3.setText(xqiVar.d());
            textView3.setVisibility(0);
        } else {
            xetVar.x.setVisibility(8);
        }
        if (xqiVar.c() == null && xqiVar.d() == null) {
            xetVar.v.setVisibility(8);
        } else {
            xetVar.v.setVisibility(0);
        }
        xetVar.a.setOnClickListener(new ntb(7));
    }
}
