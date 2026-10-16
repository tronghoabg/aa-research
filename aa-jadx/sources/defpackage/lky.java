package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lky {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public lky(android.view.ViewGroup viewGroup, defpackage.gfa gfaVar) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.e = gfaVar;
        android.view.View viewFindViewById = viewGroup.findViewById(com.google.android.projection.gearhead.R.id.responsive_card_content_container);
        viewFindViewById.getClass();
        this.d = (com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView) viewFindViewById;
        android.view.View viewFindViewById2 = viewGroup.findViewById(com.google.android.projection.gearhead.R.id.responsive_step_container);
        viewFindViewById2.getClass();
        com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTurnCardViewContainer responsiveTurnCardViewContainer = (com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTurnCardViewContainer) viewFindViewById2;
        this.b = responsiveTurnCardViewContainer;
        android.view.View viewFindViewById3 = viewGroup.findViewById(com.google.android.projection.gearhead.R.id.steps_container);
        viewFindViewById3.getClass();
        this.f = (android.view.ViewGroup) viewFindViewById3;
        android.view.View viewFindViewById4 = viewGroup.findViewById(com.google.android.projection.gearhead.R.id.progress_view);
        viewFindViewById4.getClass();
        this.c = (com.android.car.libraries.apphost.map.widgets.ProgressView) viewFindViewById4;
        defpackage.gnb.i("CarApp.H.Tem", "Screen size is %d", java.lang.Integer.valueOf(responsiveTurnCardViewContainer.i));
        defpackage.gso gsoVar = (defpackage.gso) gfaVar.l(defpackage.gso.class);
        gsoVar.getClass();
        responsiveTurnCardViewContainer.i = gsoVar.a();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(responsiveTurnCardViewContainer.getContext());
        if (defpackage.gsu.e(responsiveTurnCardViewContainer.i)) {
            layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.responsive_step_view_small, responsiveTurnCardViewContainer.a);
        } else {
            layoutInflaterFrom.inflate(com.google.android.projection.gearhead.R.layout.responsive_step_view_large, responsiveTurnCardViewContainer.a);
        }
        responsiveTurnCardViewContainer.b = responsiveTurnCardViewContainer.a.findViewById(com.google.android.projection.gearhead.R.id.responsive_step_view);
        responsiveTurnCardViewContainer.c = responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.responsive_message_view);
        responsiveTurnCardViewContainer.d = (android.widget.ImageView) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.turn_symbol);
        responsiveTurnCardViewContainer.e = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.distance_text);
        responsiveTurnCardViewContainer.f = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.description_text);
        responsiveTurnCardViewContainer.g = (android.widget.FrameLayout) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.lanes_image_container);
        responsiveTurnCardViewContainer.h = (android.widget.ImageView) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.lanes_image);
        responsiveTurnCardViewContainer.k = (android.widget.ImageView) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.message_image);
        responsiveTurnCardViewContainer.l = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.message_title);
        responsiveTurnCardViewContainer.m = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) responsiveTurnCardViewContainer.findViewById(com.google.android.projection.gearhead.R.id.message_text);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.google.android.projection.gearhead.R.id.distance_text);
        com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView carTextView = (com.google.android.apps.auto.components.apphost.view.widgets.common.CarTextView) viewGroup.findViewById(com.google.android.projection.gearhead.R.id.description_text);
        textView.setVisibility(8);
        carTextView.setVisibility(8);
    }

    public final void a(java.lang.Runnable runnable) {
        com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView bleedingCardView = (com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView) this.d;
        if (bleedingCardView.getVisibility() == 8) {
            return;
        }
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation((android.content.Context) this.e, com.google.android.projection.gearhead.R.anim.responsive_turn_card_hide_animation);
        animationLoadAnimation.setAnimationListener(new defpackage.kdc(this, runnable));
        bleedingCardView.setAnimation(animationLoadAnimation);
    }

    public final void b(java.lang.Runnable runnable) {
        com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView bleedingCardView = (com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView) this.d;
        if (bleedingCardView.getVisibility() == 0) {
            return;
        }
        bleedingCardView.setVisibility(0);
        android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation((android.content.Context) this.e, com.google.android.projection.gearhead.R.anim.responsive_turn_card_show_animation);
        animationLoadAnimation.setAnimationListener(new defpackage.kdd(runnable));
        bleedingCardView.setAnimation(animationLoadAnimation);
    }

    public lky(android.content.Context context, defpackage.mot motVar, int i, defpackage.afer aferVar) {
        this.a = context;
        this.b = aferVar;
        java.lang.String strC = motVar != null ? motVar.c() : null;
        this.c = strC;
        if (strC == null) {
            strC = context.getString(com.google.android.projection.gearhead.R.string.media_error);
            strC.getClass();
        }
        java.lang.String string = context.getString(com.google.android.projection.gearhead.R.string.cannot_connect_to_app, strC);
        string.getClass();
        this.d = string;
        this.e = androidx.core.graphics.drawable.IconCompat.m(context, com.google.android.projection.gearhead.R.drawable.gs_error_vd_theme_24);
        this.f = motVar != null ? androidx.core.graphics.drawable.IconCompat.k(defpackage.lfy.e(context).c(context, motVar.a, i)) : null;
    }
}
