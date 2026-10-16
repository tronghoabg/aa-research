package com.bumptech.glide.e.a;

import android.view.View;
import com.bumptech.glide.g.p;
import com.waze.R;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public abstract class j extends a {

    /* renamed from: a, reason: collision with root package name */
    protected final View f2833a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2834b;

    public j(View view) {
        p.f(view);
        this.f2833a = view;
        this.f2834b = new i(view);
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final com.bumptech.glide.e.d bm() {
        Object tag = this.f2833a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof com.bumptech.glide.e.d) {
            return (com.bumptech.glide.e.d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public void c() {
        this.f2834b.b();
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final void d(f fVar) {
        this.f2834b.c(fVar);
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final void e(f fVar) {
        this.f2834b.d(fVar);
    }

    @Override // com.bumptech.glide.e.a.a, com.bumptech.glide.e.a.g
    public final void f(com.bumptech.glide.e.d dVar) {
        this.f2833a.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.f2833a.toString());
    }
}
