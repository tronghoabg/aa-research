package s6;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.m0;
import com.wynauto.wyn.R;

/* loaded from: classes3.dex */
public final class q extends m0 {

    /* renamed from: c, reason: collision with root package name */
    public final TextView f45198c;

    /* renamed from: d, reason: collision with root package name */
    public final View f45199d;

    public q(View view) {
        super(view);
        if (u6.v.f46721a < 26) {
            view.setFocusable(true);
        }
        this.f45198c = (TextView) view.findViewById(R.id.exo_text);
        this.f45199d = view.findViewById(R.id.exo_check);
    }
}
