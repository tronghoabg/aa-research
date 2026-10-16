package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.car.app.model.Alert;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class xeh extends lt implements oxi {
    public List a;
    final /* synthetic */ xei e;
    private int f = Alert.DURATION_SHOW_INDEFINITELY;

    public xeh(xei xeiVar) {
        this.e = xeiVar;
    }

    @Override // defpackage.lt
    public final int a() {
        int i = this.f;
        List list = this.a;
        return i >= 0 ? Math.min(i, list.size()) : list.size();
    }

    @Override // defpackage.oxi
    public final void b(int i) {
        this.f = i;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        return new xeg(this.e.A().inflate(R.layout.gearhead_sdk_list_item_2_card, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        xeg xegVar = (xeg) moVar;
        xegVar.s.setText((CharSequence) ((adkf) this.a.get(i)).c);
        xegVar.t.setText(((adkf) this.a.get(i)).a);
        ((ImageView) xegVar.u).setImageDrawable((Drawable) ((adkf) this.a.get(i)).d);
        xegVar.a.setOnClickListener(new xae(this, xegVar, 6, null));
    }
}
