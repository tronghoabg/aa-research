package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qhm extends defpackage.mr {
    final android.widget.ImageView t;
    final android.widget.TextView u;
    final android.widget.TextView v;
    final android.widget.ImageView w;
    public final android.view.View x;
    public final android.widget.LinearLayout y;

    public qhm(android.view.View view) {
        super(view);
        this.t = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.icon);
        this.u = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.title);
        this.v = (android.widget.TextView) view.findViewById(com.google.android.projection.gearhead.R.id.subtitle);
        this.w = (android.widget.ImageView) view.findViewById(com.google.android.projection.gearhead.R.id.right_icon);
        this.x = view.findViewById(com.google.android.projection.gearhead.R.id.end_bouncer);
        this.y = (android.widget.LinearLayout) view.findViewById(com.google.android.projection.gearhead.R.id.row_container);
    }

    protected static final void G(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence.toString());
            textView.setVisibility(0);
        }
    }

    public void E(com.google.android.apps.auto.sdk.MenuItem menuItem, android.content.Context context, android.content.Context context2) {
        G(this.u, menuItem.c);
        G(this.v, menuItem.d);
        android.widget.ImageView imageView = this.t;
        imageView.clearColorFilter();
        android.graphics.Bitmap bitmap = menuItem.g;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        } else {
            int i = menuItem.e;
            if (i != 0) {
                android.graphics.drawable.Drawable drawableA = defpackage.qga.a(context, i);
                if (menuItem.k) {
                    drawableA.setColorFilter(menuItem.f, android.graphics.PorterDuff.Mode.SRC_IN);
                }
                imageView.setImageDrawable(drawableA);
                imageView.setVisibility(0);
            } else {
                android.net.Uri uri = menuItem.h;
                if (uri != null) {
                    android.os.Bundle bundle = menuItem.b;
                    if (defpackage.mlv.s(uri) && bundle != null && bundle.getBoolean("ignore_resource_uri_tint")) {
                        imageView.setColorFilter(menuItem.k ? menuItem.f : imageView.getResources().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_tint));
                        imageView.setImageURI(menuItem.h);
                    } else {
                        defpackage.hsz hszVarE = defpackage.hsc.c(context).e(menuItem.h);
                        if (bundle != null && bundle.getBoolean("circle_crop_icon")) {
                            if (defpackage.ies.v == null) {
                                defpackage.ies.v = (defpackage.ies) ((defpackage.ies) new defpackage.ies().u()).t();
                            }
                            hszVarE.n(defpackage.ies.v);
                        }
                        hszVarE.p(imageView);
                    }
                    imageView.setVisibility(0);
                } else {
                    imageView.setImageDrawable(null);
                    imageView.setVisibility(8);
                }
            }
        }
        if (menuItem.a == 0) {
            android.widget.ImageView imageView2 = this.w;
            int i2 = menuItem.i;
            if (i2 != 0) {
                android.graphics.drawable.Drawable drawableA2 = defpackage.qga.a(context, i2);
                if (menuItem.l) {
                    drawableA2.setColorFilter(menuItem.j, android.graphics.PorterDuff.Mode.SRC_IN);
                }
                imageView2.setImageDrawable(drawableA2);
                imageView2.setVisibility(0);
            } else {
                imageView2.setImageDrawable(null);
                imageView2.setVisibility(8);
            }
        }
        android.content.res.Resources resources = context2.getResources();
        android.view.View view = this.a;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!android.text.TextUtils.isEmpty(menuItem.d) || menuItem.a == 3) {
            layoutParams.height = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_sdk_list_item_height);
            view.setLayoutParams(layoutParams);
        } else {
            layoutParams.height = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_sdk_list_item_height_small);
            view.setLayoutParams(layoutParams);
        }
    }

    public void F(com.google.android.apps.auto.sdk.MenuItem menuItem, defpackage.qhl qhlVar) {
        this.a.setOnClickListener(new defpackage.jmx(qhlVar, menuItem, 20));
    }
}
