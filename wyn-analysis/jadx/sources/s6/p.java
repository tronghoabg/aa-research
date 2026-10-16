package s6;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;

/* loaded from: classes3.dex */
public final class p extends androidx.recyclerview.widget.I {

    /* renamed from: i, reason: collision with root package name */
    public final String[] f45195i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f45196j;
    public final Drawable[] k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f45197l;

    public p(t tVar, String[] strArr, Drawable[] drawableArr) {
        this.f45197l = tVar;
        this.f45195i = strArr;
        this.f45196j = new String[strArr.length];
        this.k = drawableArr;
    }

    @Override // androidx.recyclerview.widget.I
    public final int getItemCount() {
        return this.f45195i.length;
    }

    @Override // androidx.recyclerview.widget.I
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // androidx.recyclerview.widget.I
    public final void onBindViewHolder(m0 m0Var, int i5) {
        o oVar = (o) m0Var;
        oVar.f45191c.setText(this.f45195i[i5]);
        String str = this.f45196j[i5];
        TextView textView = oVar.f45192d;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.k[i5];
        ImageView imageView = oVar.f45193e;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final m0 onCreateViewHolder(ViewGroup viewGroup, int i5) {
        t tVar = this.f45197l;
        return new o(tVar, LayoutInflater.from(tVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }
}
