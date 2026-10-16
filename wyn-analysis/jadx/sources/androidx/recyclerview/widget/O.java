package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public int f18777a;

    /* renamed from: b, reason: collision with root package name */
    public int f18778b;

    public final void a(m0 m0Var) {
        View view = m0Var.itemView;
        this.f18777a = view.getLeft();
        this.f18778b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
