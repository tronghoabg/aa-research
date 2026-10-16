package android.support.v4.app;

import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class cv {

    /* renamed from: a, reason: collision with root package name */
    private boolean f296a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f297b;

    public void b(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
    }

    public void c(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
    }

    public void d(BackEventCompat backEventCompat, ViewGroup viewGroup) {
        h.g.b.x.f(backEventCompat, "backEvent");
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
    }

    public void e(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
    }

    public boolean f() {
        return false;
    }

    public final void m(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        if (!this.f297b) {
            b(viewGroup);
        }
        this.f297b = true;
    }

    public final void n(ViewGroup viewGroup) {
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        if (!this.f296a) {
            e(viewGroup);
        }
        this.f296a = true;
    }
}
