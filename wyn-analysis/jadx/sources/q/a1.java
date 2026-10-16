package q;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f43735a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f43736b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f43737c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f43738d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f43739e;

    public a1(View view) {
        this.f43735a = (TextView) view.findViewById(R.id.text1);
        this.f43736b = (TextView) view.findViewById(R.id.text2);
        this.f43737c = (ImageView) view.findViewById(R.id.icon1);
        this.f43738d = (ImageView) view.findViewById(R.id.icon2);
        this.f43739e = (ImageView) view.findViewById(com.wynauto.wyn.R.id.edit_query);
    }
}
