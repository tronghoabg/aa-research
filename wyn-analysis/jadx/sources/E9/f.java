package E9;

import D9.k;
import N9.h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.wynauto.wyn.R;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class f extends c {

    /* renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f3616d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f3617e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f3618f;

    /* renamed from: g, reason: collision with root package name */
    public Button f3619g;

    @Override // E9.c
    public final View g() {
        return this.f3617e;
    }

    @Override // E9.c
    public final ImageView i() {
        return this.f3618f;
    }

    @Override // E9.c
    public final ViewGroup j() {
        return this.f3616d;
    }

    @Override // E9.c
    public final ViewTreeObserver.OnGlobalLayoutListener k(HashMap map, B9.a aVar) {
        View viewInflate = ((LayoutInflater) this.f3603c).inflate(R.layout.image, (ViewGroup) null);
        this.f3616d = (FiamFrameLayout) viewInflate.findViewById(R.id.image_root);
        this.f3617e = (ViewGroup) viewInflate.findViewById(R.id.image_content_root);
        this.f3618f = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f3619g = (Button) viewInflate.findViewById(R.id.collapse_button);
        ImageView imageView = this.f3618f;
        k kVar = (k) this.f3602b;
        imageView.setMaxHeight(kVar.a());
        this.f3618f.setMaxWidth(kVar.b());
        h hVar = (h) this.f3601a;
        if (hVar.f8622a.equals(MessageType.IMAGE_ONLY)) {
            N9.g gVar = (N9.g) hVar;
            ImageView imageView2 = this.f3618f;
            N9.f fVar = gVar.f8620c;
            imageView2.setVisibility((fVar == null || TextUtils.isEmpty(fVar.f8619a)) ? 8 : 0);
            this.f3618f.setOnClickListener((View.OnClickListener) map.get(gVar.f8621d));
        }
        this.f3616d.setDismissListener(aVar);
        this.f3619g.setOnClickListener(aVar);
        return null;
    }
}
