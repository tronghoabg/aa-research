package E9;

import D9.k;
import N9.h;
import N9.l;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.wynauto.wyn.R;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f3591d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f3592e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f3593f;

    /* renamed from: g, reason: collision with root package name */
    public ResizableImageView f3594g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f3595h;

    /* renamed from: i, reason: collision with root package name */
    public B9.a f3596i;

    @Override // E9.c
    public final k f() {
        return (k) this.f3602b;
    }

    @Override // E9.c
    public final View g() {
        return this.f3592e;
    }

    @Override // E9.c
    public final View.OnClickListener h() {
        return this.f3596i;
    }

    @Override // E9.c
    public final ImageView i() {
        return this.f3594g;
    }

    @Override // E9.c
    public final ViewGroup j() {
        return this.f3591d;
    }

    @Override // E9.c
    public final ViewTreeObserver.OnGlobalLayoutListener k(HashMap map, B9.a aVar) {
        View viewInflate = ((LayoutInflater) this.f3603c).inflate(R.layout.banner, (ViewGroup) null);
        this.f3591d = (FiamFrameLayout) viewInflate.findViewById(R.id.banner_root);
        this.f3592e = (ViewGroup) viewInflate.findViewById(R.id.banner_content_root);
        this.f3593f = (TextView) viewInflate.findViewById(R.id.banner_body);
        this.f3594g = (ResizableImageView) viewInflate.findViewById(R.id.banner_image);
        this.f3595h = (TextView) viewInflate.findViewById(R.id.banner_title);
        h hVar = (h) this.f3601a;
        if (hVar.f8622a.equals(MessageType.BANNER)) {
            N9.c cVar = (N9.c) hVar;
            String str = cVar.f8609g;
            if (!TextUtils.isEmpty(str)) {
                c.s(this.f3592e, str);
            }
            ResizableImageView resizableImageView = this.f3594g;
            N9.f fVar = cVar.f8607e;
            resizableImageView.setVisibility((fVar == null || TextUtils.isEmpty(fVar.f8619a)) ? 8 : 0);
            l lVar = cVar.f8605c;
            if (lVar != null) {
                String str2 = lVar.f8630a;
                if (!TextUtils.isEmpty(str2)) {
                    this.f3595h.setText(str2);
                }
                String str3 = lVar.f8631b;
                if (!TextUtils.isEmpty(str3)) {
                    this.f3595h.setTextColor(Color.parseColor(str3));
                }
            }
            l lVar2 = cVar.f8606d;
            if (lVar2 != null) {
                String str4 = lVar2.f8630a;
                if (!TextUtils.isEmpty(str4)) {
                    this.f3593f.setText(str4);
                }
                String str5 = lVar2.f8631b;
                if (!TextUtils.isEmpty(str5)) {
                    this.f3593f.setTextColor(Color.parseColor(str5));
                }
            }
            k kVar = (k) this.f3602b;
            int iMin = Math.min(kVar.f2583d.intValue(), kVar.f2582c.intValue());
            ViewGroup.LayoutParams layoutParams = this.f3591d.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = iMin;
            this.f3591d.setLayoutParams(layoutParams);
            this.f3594g.setMaxHeight(kVar.a());
            this.f3594g.setMaxWidth(kVar.b());
            this.f3596i = aVar;
            this.f3591d.setDismissListener(aVar);
            this.f3592e.setOnClickListener((View.OnClickListener) map.get(cVar.f8608f));
        }
        return null;
    }
}
