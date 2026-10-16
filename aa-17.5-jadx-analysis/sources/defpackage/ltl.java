package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
final /* synthetic */ class ltl extends afey implements afeg {
    public static final ltl a = new ltl();

    public ltl() {
        super(2, omu.class, "hasValidProgress", "hasValidProgress(Lcom/google/android/apps/auto/components/media/compat/AaPlaybackState;Lcom/google/android/apps/auto/components/media/compat/AaMediaMetadata;)Z", 0);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(omu.i((AaPlaybackState) obj, (lmd) obj2));
    }
}
