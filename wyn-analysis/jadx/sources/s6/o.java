package s6;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;

/* loaded from: classes3.dex */
public final class o extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f45191c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f45192d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f45193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f45194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, View view) {
        super(view);
        this.f45194f = tVar;
        if (u6.v.f46721a < 26) {
            view.setFocusable(true);
        }
        this.f45191c = (TextView) view.findViewById(R.id.exo_main_text);
        this.f45192d = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f45193e = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new Lb.h(this, 12));
    }
}
