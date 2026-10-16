package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class krl extends mo {
    public static final yph s = yph.c("GH.CfListItemVH");
    public final ImageView A;
    final ImageView B;
    public final View C;
    public final View D;
    public final View E;
    public final ImageView F;
    public final TextView G;
    public final List H;
    public final View I;
    View J;
    public View K;
    final View L;
    public final View M;
    public final View N;
    public final View O;
    public final View P;
    public final ImageView Q;
    public final View R;
    public final View S;
    final ImageView T;
    final ImageView U;
    final ImageView V;
    public ImageView W;
    public final FrameLayout X;
    public final FrameLayout Y;
    public final TextView Z;
    public final ImageView aa;
    public final View ab;
    public final ImageView ac;
    public final ProgressBar ad;
    public final View ae;
    public final View af;
    public final View ag;
    public final View ah;
    public final View ai;
    public final ConstraintLayout aj;
    public final Context ak;
    public final int al;
    public final TextView t;
    public final ConstraintLayout u;
    public final TextView v;
    public final FrameLayout w;
    public final ShapeableImageView x;
    public final FrameLayout y;
    public final ShapeableImageView z;

    public krl(View view) {
        super(view);
        Context context = view.getContext();
        this.ak = context;
        this.aj = (ConstraintLayout) view.findViewById(R.id.foreground_constraint);
        this.u = (ConstraintLayout) view.findViewById(R.id.title_container);
        this.w = (FrameLayout) view.findViewById(R.id.icon_container);
        this.x = (ShapeableImageView) view.findViewById(R.id.icon);
        this.y = (FrameLayout) view.findViewById(R.id.large_icon_container);
        this.z = (ShapeableImageView) view.findViewById(R.id.large_icon);
        this.A = (ImageView) view.findViewById(R.id.large_icon_badge);
        this.B = (ImageView) view.findViewById(R.id.right_icon);
        this.t = (TextView) view.findViewById(R.id.title);
        this.v = (TextView) view.findViewById(R.id.subtitle);
        this.C = view.findViewById(R.id.divider);
        view.findViewById(R.id.group_top_margin);
        this.D = view.findViewById(R.id.group_bottom_margin);
        ImageView imageView = (ImageView) view.findViewById(R.id.browse_icon_first);
        imageView.getClass();
        ImageView imageView2 = (ImageView) view.findViewById(R.id.browse_icon_second);
        imageView2.getClass();
        ImageView imageView3 = (ImageView) view.findViewById(R.id.browse_icon_third);
        imageView3.getClass();
        this.H = yfq.s(imageView, imageView2, imageView3);
        this.G = (TextView) view.findViewById(R.id.browse_icon_new_numbered);
        this.E = view.findViewById(R.id.browse_icon_new_container);
        this.F = (ImageView) view.findViewById(R.id.browse_icon_new_tri_state);
        this.I = view.findViewById(R.id.primary_action_tap_target);
        this.af = view.findViewById(R.id.secondary_tap_target_gap_left_half);
        this.L = view.findViewById(R.id.secondary_action_tap_target);
        this.N = view.findViewById(R.id.secondary_action_container);
        this.ag = view.findViewById(R.id.secondary_tap_target_gap_right_half);
        View viewFindViewById = view.findViewById(R.id.tertiary_action_tap_target);
        this.M = viewFindViewById;
        this.O = view.findViewById(R.id.tertiary_action_container);
        this.ah = view.findViewById(R.id.tertiary_tap_target_gap_right_half);
        this.ai = view.findViewById(R.id.tertiary_tap_target_gap_left_half);
        this.P = view.findViewById(R.id.tertiary_action_circle);
        this.Q = (ImageView) view.findViewById(R.id.tertiary_action_circle_icon);
        this.Y = (FrameLayout) view.findViewById(R.id.tertiary_action_divider);
        this.T = (ImageView) view.findViewById(R.id.secondary_action_icon);
        this.R = view.findViewById(R.id.secondary_action_pill);
        this.V = (ImageView) view.findViewById(R.id.secondary_action_pill_icon);
        this.X = (FrameLayout) view.findViewById(R.id.secondary_action_divider);
        this.Z = (TextView) view.findViewById(R.id.secondary_action_icon_text);
        this.S = view.findViewById(R.id.secondary_action_circle);
        this.U = (ImageView) view.findViewById(R.id.secondary_action_circle_icon);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.tertiary_action_icon);
        this.aa = imageView4;
        imageView4.setVisibility(0);
        this.K = viewFindViewById;
        viewFindViewById.setFocusable(true);
        viewFindViewById.setClickable(true);
        this.ac = (ImageView) view.findViewById(R.id.color_indicator);
        this.ab = view.findViewById(R.id.pre_text_icons);
        this.ad = (ProgressBar) view.findViewById(R.id.progress_bar);
        this.ae = view.findViewById(R.id.progress_bar_container);
        this.al = context.getColor(R.color.gearhead_sdk_body2_light);
        leh.a();
    }

    public final void E() {
        this.w.setVisibility(8);
    }

    public final void F() {
        this.B.setVisibility(8);
    }

    public final void G(ImageView imageView) {
        hrt.e(this.a).h(imageView);
        imageView.clearColorFilter();
        imageView.setVisibility(0);
    }

    public final void H(ImageView imageView, Drawable drawable, int i) {
        G(imageView);
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawable);
    }

    public final void I(int i) {
        this.I.setBackground(org.b(this.ak, i));
    }

    public final void J(Drawable drawable, int i, Bundle bundle, krm krmVar) {
        ImageView imageView = this.B;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        drn drnVar = (drn) imageView.getLayoutParams();
        drnVar.getClass();
        drnVar.width = i;
        drnVar.height = i;
        if (krmVar.a && bundle.containsKey("use_slim_margins_key")) {
            drnVar.rightMargin = this.ak.getResources().getDimensionPixelSize(R.dimen.list_item_right_icon_slim_margin_end);
        }
        imageView.setLayoutParams(drnVar);
    }

    public final void K(int i) {
        this.L.setBackground(org.b(this.ak, i));
    }

    public final void L(View.OnClickListener onClickListener) {
        this.J.setOnClickListener(onClickListener);
    }

    public final void M(int i) {
        this.M.setBackground(org.b(this.ak, i));
    }

    public final void N(View.OnClickListener onClickListener) {
        this.K.setOnClickListener(onClickListener);
    }

    public final void O(ImageView imageView, MenuItem menuItem) {
        if (menuItem.a == 2) {
            imageView.setImageResource(R.drawable.quantum_ic_navigate_next_vd_theme_24);
            imageView.setColorFilter(this.ak.getColor(R.color.boardwalk_gradient_white_40), PorterDuff.Mode.SRC_IN);
            return;
        }
        if (menuItem.k) {
            imageView.setColorFilter(menuItem.f, PorterDuff.Mode.SRC_IN);
        } else {
            imageView.clearColorFilter();
        }
        Bitmap bitmap = menuItem.g;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(menuItem.e);
        }
    }

    public final void P(krm krmVar) {
        int i = krmVar.b;
        if (i == 2) {
            this.T.setVisibility(8);
            this.S.setVisibility(8);
            View view = this.R;
            view.setVisibility(0);
            this.W = this.V;
            this.J = view;
            View view2 = this.L;
            view2.setFocusable(false);
            view2.setClickable(false);
            View view3 = this.N;
            view3.setFocusable(false);
            view3.setClickable(false);
            view.setFocusable(true);
            view.setClickable(true);
            return;
        }
        ImageView imageView = this.T;
        if (i != 1) {
            imageView.setVisibility(0);
            this.S.setVisibility(8);
            View view4 = this.R;
            view4.setVisibility(8);
            this.W = imageView;
            View view5 = this.L;
            this.J = view5;
            view5.setFocusable(true);
            view5.setClickable(true);
            view4.setFocusable(false);
            view4.setClickable(false);
            return;
        }
        imageView.setVisibility(8);
        this.R.setVisibility(8);
        View view6 = this.S;
        view6.setVisibility(0);
        this.W = this.U;
        View view7 = this.N;
        view7.setFocusable(false);
        view7.setClickable(false);
        this.J = view6;
        View view8 = this.L;
        view8.setFocusable(false);
        view8.setClickable(false);
        view6.setFocusable(true);
        view6.setClickable(true);
    }
}
