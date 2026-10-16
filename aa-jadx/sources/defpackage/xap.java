package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xap extends android.widget.BaseAdapter {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.yqm e = defpackage.yqm.c("GH.FeedbackAdapter");
    private static final java.io.FilenameFilter f = new defpackage.toa(2);
    public final defpackage.xao a;
    public java.util.ArrayList b = new java.util.ArrayList();
    public final com.google.android.projection.gearhead.companion.feedback.FeedbackListActivity c;
    private final java.io.File g;

    public xap(java.lang.String str, com.google.android.projection.gearhead.companion.feedback.FeedbackListActivity feedbackListActivity) {
        this.g = new java.io.File(str);
        this.c = feedbackListActivity;
        this.a = new defpackage.xao(this, str);
    }

    public final void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] fileArrListFiles = this.g.listFiles(f);
        if (fileArrListFiles != null) {
            for (java.io.File file : fileArrListFiles) {
                try {
                    arrayList.add(defpackage.lbp.b(file));
                } catch (java.io.IOException e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) e.h()).p(e2)).ai((char) 10012)).y("Couldn't load bundle %s", file);
                }
            }
        }
        java.util.Collections.sort(arrayList, new defpackage.cjd(19));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.wla(this, arrayList, 4));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) throws java.lang.Throwable {
        android.graphics.Bitmap bitmapA;
        defpackage.lbp lbpVar = (defpackage.lbp) this.b.get(i);
        if (view == null) {
            view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.projection.gearhead.R.layout.feedback_list_item, viewGroup, false);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view;
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.google.android.projection.gearhead.R.id.feedback_text);
        java.lang.String str = lbpVar.f;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setText(viewGroup.getResources().getString(com.google.android.projection.gearhead.R.string.feedback_no_description_label, lbpVar.d));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup2.findViewById(com.google.android.projection.gearhead.R.id.screenshot);
        android.content.Context context = viewGroup.getContext();
        android.net.Uri uri = lbpVar.h;
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.feedback_thumbnail_width);
        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.feedback_thumbnail_height);
        if (uri != null) {
            defpackage.kfx kfxVar = new defpackage.kfx();
            defpackage.kfy kfyVar = new defpackage.kfy(context);
            kfyVar.a = uri;
            kfyVar.c(dimensionPixelSize);
            kfyVar.b(dimensionPixelSize2);
            bitmapA = kfxVar.a(kfyVar.a());
        } else {
            bitmapA = null;
        }
        if (bitmapA != null) {
            android.net.Uri uri2 = lbpVar.h;
            bitmapA.getAllocationByteCount();
            imageView.setImageBitmap(bitmapA);
        } else {
            imageView.setImageDrawable(null);
        }
        viewGroup2.setOnClickListener(new defpackage.xba(this, lbpVar, 1, null));
        return viewGroup2;
    }
}
