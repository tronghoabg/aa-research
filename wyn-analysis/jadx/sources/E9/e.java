package E9;

import D9.k;
import N9.h;
import N9.l;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import com.wynauto.wyn.R;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class e extends c {

    /* renamed from: d, reason: collision with root package name */
    public FiamCardView f3606d;

    /* renamed from: e, reason: collision with root package name */
    public H9.a f3607e;

    /* renamed from: f, reason: collision with root package name */
    public ScrollView f3608f;

    /* renamed from: g, reason: collision with root package name */
    public Button f3609g;

    /* renamed from: h, reason: collision with root package name */
    public Button f3610h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f3611i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f3612j;
    public TextView k;

    /* renamed from: l, reason: collision with root package name */
    public N9.e f3613l;

    /* renamed from: m, reason: collision with root package name */
    public B9.a f3614m;

    /* renamed from: n, reason: collision with root package name */
    public d f3615n;

    @Override // E9.c
    public final k f() {
        return (k) this.f3602b;
    }

    @Override // E9.c
    public final View g() {
        return this.f3607e;
    }

    @Override // E9.c
    public final View.OnClickListener h() {
        return this.f3614m;
    }

    @Override // E9.c
    public final ImageView i() {
        return this.f3611i;
    }

    @Override // E9.c
    public final ViewGroup j() {
        return this.f3606d;
    }

    @Override // E9.c
    public final ViewTreeObserver.OnGlobalLayoutListener k(HashMap map, B9.a aVar) {
        N9.d dVar;
        String str;
        View viewInflate = ((LayoutInflater) this.f3603c).inflate(R.layout.card, (ViewGroup) null);
        this.f3608f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f3609g = (Button) viewInflate.findViewById(R.id.primary_button);
        this.f3610h = (Button) viewInflate.findViewById(R.id.secondary_button);
        this.f3611i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f3612j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f3606d = (FiamCardView) viewInflate.findViewById(R.id.card_root);
        this.f3607e = (H9.a) viewInflate.findViewById(R.id.card_content_root);
        h hVar = (h) this.f3601a;
        if (hVar.f8622a.equals(MessageType.CARD)) {
            N9.e eVar = (N9.e) hVar;
            this.f3613l = eVar;
            TextView textView = this.k;
            l lVar = eVar.f8612c;
            textView.setText(lVar.f8630a);
            this.k.setTextColor(Color.parseColor(lVar.f8631b));
            l lVar2 = eVar.f8613d;
            if (lVar2 == null || (str = lVar2.f8630a) == null) {
                this.f3608f.setVisibility(8);
                this.f3612j.setVisibility(8);
            } else {
                this.f3608f.setVisibility(0);
                this.f3612j.setVisibility(0);
                this.f3612j.setText(str);
                this.f3612j.setTextColor(Color.parseColor(lVar2.f8631b));
            }
            N9.e eVar2 = this.f3613l;
            if (eVar2.f8617h == null && eVar2.f8618i == null) {
                this.f3611i.setVisibility(8);
            } else {
                this.f3611i.setVisibility(0);
            }
            N9.e eVar3 = this.f3613l;
            N9.a aVar2 = eVar3.f8615f;
            c.t(this.f3609g, aVar2.f8602b);
            Button button = this.f3609g;
            View.OnClickListener onClickListener = (View.OnClickListener) map.get(aVar2);
            if (button != null) {
                button.setOnClickListener(onClickListener);
            }
            this.f3609g.setVisibility(0);
            N9.a aVar3 = eVar3.f8616g;
            if (aVar3 == null || (dVar = aVar3.f8602b) == null) {
                this.f3610h.setVisibility(8);
            } else {
                c.t(this.f3610h, dVar);
                Button button2 = this.f3610h;
                View.OnClickListener onClickListener2 = (View.OnClickListener) map.get(aVar3);
                if (button2 != null) {
                    button2.setOnClickListener(onClickListener2);
                }
                this.f3610h.setVisibility(0);
            }
            ImageView imageView = this.f3611i;
            k kVar = (k) this.f3602b;
            imageView.setMaxHeight(kVar.a());
            this.f3611i.setMaxWidth(kVar.b());
            this.f3614m = aVar;
            this.f3606d.setDismissListener(aVar);
            c.s(this.f3607e, this.f3613l.f8614e);
        }
        return this.f3615n;
    }
}
