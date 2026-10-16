package s6;

import E5.w0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.m0;
import com.applovin.impl.B1;
import com.wynauto.wyn.R;
import f6.Z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4022i extends androidx.recyclerview.widget.I {

    /* renamed from: i, reason: collision with root package name */
    public List f45182i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f45183j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f45184l;

    public C4022i(t tVar, int i5) {
        this.k = i5;
        this.f45184l = tVar;
        this.f45183j = tVar;
    }

    public boolean a(r6.f fVar) {
        for (int i5 = 0; i5 < this.f45182i.size(); i5++) {
            if (fVar.f44516y.containsKey(((r) this.f45182i.get(i5)).f45200a.f3130b)) {
                return true;
            }
        }
        return false;
    }

    public void b(List list) {
        boolean z2 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= list.size()) {
                break;
            }
            r rVar = (r) list.get(i5);
            if (rVar.f45200a.f3133e[rVar.f45201b]) {
                z2 = true;
                break;
            }
            i5++;
        }
        t tVar = this.f45184l;
        ImageView imageView = tVar.f45268w;
        if (imageView != null) {
            imageView.setImageDrawable(z2 ? tVar.f45225W : tVar.f45227a0);
            tVar.f45268w.setContentDescription(z2 ? tVar.f45229b0 : tVar.f45231c0);
        }
        this.f45182i = list;
    }

    public void c(q qVar, int i5) {
        switch (this.k) {
            case 1:
                d(qVar, i5);
                if (i5 > 0) {
                    r rVar = (r) this.f45182i.get(i5 - 1);
                    qVar.f45199d.setVisibility(rVar.f45200a.f3133e[rVar.f45201b] ? 0 : 4);
                    break;
                }
                break;
            default:
                d(qVar, i5);
                break;
        }
    }

    public final void d(q qVar, int i5) {
        w0 w0Var = this.f45183j.f45241h0;
        if (w0Var == null) {
        }
        if (i5 != 0) {
            r rVar = (r) this.f45182i.get(i5 - 1);
            Z z2 = rVar.f45200a.f3130b;
            boolean z10 = ((E5.I) w0Var).v0().f44516y.get(z2) != null && rVar.f45200a.f3133e[rVar.f45201b];
            qVar.f45198c.setText(rVar.f45202c);
            qVar.f45199d.setVisibility(z10 ? 0 : 4);
            qVar.itemView.setOnClickListener(new B1(this, w0Var, z2, rVar, 1));
            return;
        }
        switch (this.k) {
            case 0:
                qVar.f45198c.setText(R.string.exo_track_selection_auto);
                w0 w0Var2 = this.f45184l.f45241h0;
                w0Var2.getClass();
                qVar.f45199d.setVisibility(a(((E5.I) w0Var2).v0()) ? 4 : 0);
                qVar.itemView.setOnClickListener(new Lb.h(this, 11));
                break;
            default:
                qVar.f45198c.setText(R.string.exo_track_selection_none);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < this.f45182i.size()) {
                        r rVar2 = (r) this.f45182i.get(i11);
                        if (rVar2.f45200a.f3133e[rVar2.f45201b]) {
                            i10 = 4;
                        } else {
                            i11++;
                        }
                    }
                }
                qVar.f45199d.setVisibility(i10);
                qVar.itemView.setOnClickListener(new Lb.h(this, 13));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final int getItemCount() {
        if (this.f45182i.isEmpty()) {
            return 0;
        }
        return this.f45182i.size() + 1;
    }

    @Override // androidx.recyclerview.widget.I
    public /* bridge */ /* synthetic */ void onBindViewHolder(m0 m0Var, int i5) {
        switch (this.k) {
            case 1:
                c((q) m0Var, i5);
                break;
            default:
                c((q) m0Var, i5);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        return new q(LayoutInflater.from(this.f45183j.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    private final void e(String str) {
    }
}
