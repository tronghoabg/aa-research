package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.map.widgets.ProgressView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTurnCardViewContainer;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lks {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public lks(ViewGroup viewGroup, geu geuVar) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.e = geuVar;
        View viewFindViewById = viewGroup.findViewById(R.id.responsive_card_content_container);
        viewFindViewById.getClass();
        this.d = (BleedingCardView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.responsive_step_container);
        viewFindViewById2.getClass();
        ResponsiveTurnCardViewContainer responsiveTurnCardViewContainer = (ResponsiveTurnCardViewContainer) viewFindViewById2;
        this.b = responsiveTurnCardViewContainer;
        View viewFindViewById3 = viewGroup.findViewById(R.id.steps_container);
        viewFindViewById3.getClass();
        this.f = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.progress_view);
        viewFindViewById4.getClass();
        this.c = (ProgressView) viewFindViewById4;
        gks.i("CarApp.H.Tem", "Screen size is %d", Integer.valueOf(responsiveTurnCardViewContainer.i));
        gsf gsfVar = (gsf) geuVar.l(gsf.class);
        gsfVar.getClass();
        responsiveTurnCardViewContainer.i = gsfVar.a();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(responsiveTurnCardViewContainer.getContext());
        if (grx.d(responsiveTurnCardViewContainer.i)) {
            layoutInflaterFrom.inflate(R.layout.responsive_step_view_small, responsiveTurnCardViewContainer.a);
        } else {
            layoutInflaterFrom.inflate(R.layout.responsive_step_view_large, responsiveTurnCardViewContainer.a);
        }
        responsiveTurnCardViewContainer.b = responsiveTurnCardViewContainer.a.findViewById(R.id.responsive_step_view);
        responsiveTurnCardViewContainer.c = responsiveTurnCardViewContainer.findViewById(R.id.responsive_message_view);
        responsiveTurnCardViewContainer.d = (ImageView) responsiveTurnCardViewContainer.findViewById(R.id.turn_symbol);
        responsiveTurnCardViewContainer.e = (CarTextView) responsiveTurnCardViewContainer.findViewById(R.id.distance_text);
        responsiveTurnCardViewContainer.f = (CarTextView) responsiveTurnCardViewContainer.findViewById(R.id.description_text);
        responsiveTurnCardViewContainer.g = (FrameLayout) responsiveTurnCardViewContainer.findViewById(R.id.lanes_image_container);
        responsiveTurnCardViewContainer.h = (ImageView) responsiveTurnCardViewContainer.findViewById(R.id.lanes_image);
        responsiveTurnCardViewContainer.k = (ImageView) responsiveTurnCardViewContainer.findViewById(R.id.message_image);
        responsiveTurnCardViewContainer.l = (CarTextView) responsiveTurnCardViewContainer.findViewById(R.id.message_title);
        responsiveTurnCardViewContainer.m = (CarTextView) responsiveTurnCardViewContainer.findViewById(R.id.message_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.distance_text);
        CarTextView carTextView = (CarTextView) viewGroup.findViewById(R.id.description_text);
        textView.setVisibility(8);
        carTextView.setVisibility(8);
    }

    public final void a(Runnable runnable) throws Resources.NotFoundException {
        BleedingCardView bleedingCardView = (BleedingCardView) this.d;
        if (bleedingCardView.getVisibility() == 8) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation((Context) this.e, R.anim.responsive_turn_card_hide_animation);
        animationLoadAnimation.setAnimationListener(new kcy(this, runnable));
        bleedingCardView.setAnimation(animationLoadAnimation);
    }

    public final void b(Runnable runnable) throws Resources.NotFoundException {
        BleedingCardView bleedingCardView = (BleedingCardView) this.d;
        if (bleedingCardView.getVisibility() == 0) {
            return;
        }
        bleedingCardView.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation((Context) this.e, R.anim.responsive_turn_card_show_animation);
        animationLoadAnimation.setAnimationListener(new kcz(runnable));
        bleedingCardView.setAnimation(animationLoadAnimation);
    }

    public lks(Context context, mon monVar, int i, afdr afdrVar) {
        this.a = context;
        this.b = afdrVar;
        String strC = monVar != null ? monVar.c() : null;
        this.c = strC;
        if (strC == null) {
            strC = context.getString(R.string.media_error);
            strC.getClass();
        }
        String string = context.getString(R.string.cannot_connect_to_app, strC);
        string.getClass();
        this.d = string;
        this.e = IconCompat.m(context, R.drawable.gs_error_vd_theme_24);
        this.f = monVar != null ? IconCompat.k(lfs.e(context).c(context, monVar.a, i)) : null;
    }
}
