package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wmc {
    public static final int[] a = {android.R.attr.stateListAnimator};

    public static void a(android.view.View view, float f) {
        int integer = view.getResources().getInteger(com.google.android.projection.gearhead.R.integer.app_bar_elevation_anim_duration);
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, com.google.android.projection.gearhead.R.attr.state_liftable, -2130970438}, android.animation.ObjectAnimator.ofFloat(view, "elevation", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED).setDuration(j));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, android.animation.ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], android.animation.ObjectAnimator.ofFloat(view, "elevation", com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
