package ad;

import android.content.Context;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Map;

/* loaded from: classes5.dex */
public final class J extends AbstractC1364i {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17506c;

    /* renamed from: d, reason: collision with root package name */
    public final J4.c f17507d;

    /* renamed from: e, reason: collision with root package name */
    public final C1372q f17508e;

    /* renamed from: f, reason: collision with root package name */
    public final C1367l f17509f;

    /* renamed from: g, reason: collision with root package name */
    public final M f17510g;

    /* renamed from: h, reason: collision with root package name */
    public final bd.b f17511h;

    /* renamed from: i, reason: collision with root package name */
    public TemplateView f17512i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f17513j;

    public J(Context context, int i5, G9.e eVar, String str, C1372q c1372q, J4.c cVar, Map map, M m10, bd.b bVar) {
        super(i5);
        this.f17513j = context;
        this.f17505b = eVar;
        this.f17506c = str;
        this.f17508e = c1372q;
        this.f17507d = cVar;
        this.f17510g = m10;
        this.f17511h = bVar;
    }

    @Override // ad.AbstractC1364i
    public final void a() {
        TemplateView templateView = this.f17512i;
        if (templateView != null) {
            templateView.f26252c.destroy();
            this.f17512i = null;
        }
    }

    @Override // ad.AbstractC1364i
    public final io.flutter.plugin.platform.e b() {
        TemplateView templateView = this.f17512i;
        if (templateView != null) {
            return new N(templateView, 0);
        }
        return null;
    }

    public J(Context context, int i5, G9.e eVar, String str, C1367l c1367l, J4.c cVar, Map map, M m10, bd.b bVar) {
        super(i5);
        this.f17513j = context;
        this.f17505b = eVar;
        this.f17506c = str;
        this.f17509f = c1367l;
        this.f17507d = cVar;
        this.f17510g = m10;
        this.f17511h = bVar;
    }
}
