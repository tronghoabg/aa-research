package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class eea implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public eea(ViewGroup viewGroup, View view, int i) {
        this.c = i;
        this.a = viewGroup;
        this.b = view;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [afec, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        if (i == 0) {
            ((ViewGroup) this.a).addView((View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i != 1) {
            view.getClass();
            ((View) this.b).removeOnAttachStateChangeListener(this);
            this.a.invoke(view);
        } else {
            by byVar = (by) this.a;
            byVar.e();
            ca.c((ViewGroup) byVar.a.mView.getParent(), ((bh) this.b).a).f();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                view.getClass();
            }
        } else {
            ((ViewGroup) this.a).addView((View) this.b, 0);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public eea(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
