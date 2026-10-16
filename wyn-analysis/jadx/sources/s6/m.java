package s6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;

/* loaded from: classes3.dex */
public final class m extends androidx.recyclerview.widget.I {

    /* renamed from: i, reason: collision with root package name */
    public final String[] f45188i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f45189j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f45190l;

    public m(t tVar, String[] strArr, float[] fArr) {
        this.f45190l = tVar;
        this.f45188i = strArr;
        this.f45189j = fArr;
    }

    @Override // androidx.recyclerview.widget.I
    public final int getItemCount() {
        return this.f45188i.length;
    }

    @Override // androidx.recyclerview.widget.I
    public final void onBindViewHolder(m0 m0Var, final int i5) {
        q qVar = (q) m0Var;
        String[] strArr = this.f45188i;
        if (i5 < strArr.length) {
            qVar.f45198c.setText(strArr[i5]);
        }
        if (i5 == this.k) {
            qVar.itemView.setSelected(true);
            qVar.f45199d.setVisibility(0);
        } else {
            qVar.itemView.setSelected(false);
            qVar.f45199d.setVisibility(4);
        }
        qVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: s6.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m mVar = this.f45186a;
                int i10 = mVar.k;
                int i11 = i5;
                t tVar = mVar.f45190l;
                if (i11 != i10) {
                    tVar.setPlaybackSpeed(mVar.f45189j[i11]);
                }
                tVar.k.dismiss();
            }
        });
    }

    @Override // androidx.recyclerview.widget.I
    public final m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        return new q(LayoutInflater.from(this.f45190l.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
