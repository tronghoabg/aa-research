package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eym extends defpackage.mr {
    public final android.graphics.drawable.Drawable s;
    public android.content.res.ColorStateList t;
    public boolean u;
    public boolean v;
    private final android.util.SparseArray w;

    public eym(android.view.View view) {
        super(view);
        android.util.SparseArray sparseArray = new android.util.SparseArray(4);
        this.w = sparseArray;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(com.google.android.projection.gearhead.R.id.icon_frame, view.findViewById(com.google.android.projection.gearhead.R.id.icon_frame));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
        this.s = view.getBackground();
        if (textView != null) {
            this.t = textView.getTextColors();
        }
    }

    public final android.view.View E(int i) {
        android.util.SparseArray sparseArray = this.w;
        android.view.View view = (android.view.View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        android.view.View viewFindViewById = this.a.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}
