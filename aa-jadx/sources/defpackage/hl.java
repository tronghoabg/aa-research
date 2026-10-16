package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hl extends android.widget.FrameLayout {
    public final android.view.CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public hl(android.view.View view) {
        super(view.getContext());
        this.a = (android.view.CollapsibleActionView) view;
        addView(view);
    }
}
