package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class qgr extends mo {
    final ImageView t;
    final TextView u;
    final TextView v;
    final ImageView w;
    public final View x;
    public final LinearLayout y;

    public qgr(View view) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.icon);
        this.u = (TextView) view.findViewById(R.id.title);
        this.v = (TextView) view.findViewById(R.id.subtitle);
        this.w = (ImageView) view.findViewById(R.id.right_icon);
        this.x = view.findViewById(R.id.end_bouncer);
        this.y = (LinearLayout) view.findViewById(R.id.row_container);
    }

    protected static final void G(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence.toString());
            textView.setVisibility(0);
        }
    }

    public void E(MenuItem menuItem, Context context, Context context2) {
        G(this.u, menuItem.c);
        G(this.v, menuItem.d);
        ImageView imageView = this.t;
        imageView.clearColorFilter();
        Bitmap bitmap = menuItem.g;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        } else {
            int i = menuItem.e;
            if (i != 0) {
                Drawable drawableA = qff.a(context, i);
                if (menuItem.k) {
                    drawableA.setColorFilter(menuItem.f, PorterDuff.Mode.SRC_IN);
                }
                imageView.setImageDrawable(drawableA);
                imageView.setVisibility(0);
            } else {
                Uri uri = menuItem.h;
                if (uri != null) {
                    Bundle bundle = menuItem.b;
                    if (mlq.K(uri) && bundle != null && bundle.getBoolean("ignore_resource_uri_tint")) {
                        imageView.setColorFilter(menuItem.k ? menuItem.f : imageView.getResources().getColor(R.color.gearhead_sdk_tint));
                        imageView.setImageURI(menuItem.h);
                    } else {
                        hsq hsqVarE = hrt.c(context).e(menuItem.h);
                        if (bundle != null && bundle.getBoolean("circle_crop_icon")) {
                            if (iek.v == null) {
                                iek.v = (iek) ((iek) new iek().u()).t();
                            }
                            hsqVarE.n(iek.v);
                        }
                        hsqVarE.p(imageView);
                    }
                    imageView.setVisibility(0);
                } else {
                    imageView.setImageDrawable(null);
                    imageView.setVisibility(8);
                }
            }
        }
        if (menuItem.a == 0) {
            ImageView imageView2 = this.w;
            int i2 = menuItem.i;
            if (i2 != 0) {
                Drawable drawableA2 = qff.a(context, i2);
                if (menuItem.l) {
                    drawableA2.setColorFilter(menuItem.j, PorterDuff.Mode.SRC_IN);
                }
                imageView2.setImageDrawable(drawableA2);
                imageView2.setVisibility(0);
            } else {
                imageView2.setImageDrawable(null);
                imageView2.setVisibility(8);
            }
        }
        Resources resources = context2.getResources();
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!TextUtils.isEmpty(menuItem.d) || menuItem.a == 3) {
            layoutParams.height = resources.getDimensionPixelSize(R.dimen.gearhead_sdk_list_item_height);
            view.setLayoutParams(layoutParams);
        } else {
            layoutParams.height = resources.getDimensionPixelSize(R.dimen.gearhead_sdk_list_item_height_small);
            view.setLayoutParams(layoutParams);
        }
    }

    public void F(MenuItem menuItem, qgq qgqVar) {
        this.a.setOnClickListener(new jmq(qgqVar, menuItem, 20));
    }
}
