package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
final /* synthetic */ class mze extends afey implements afeg {
    public static final mze a = new mze();

    public mze() {
        super(2, omu.class, "isSessionStateValid", "isSessionStateValid(Lcom/google/android/apps/auto/components/media/compat/AaPlaybackState;Lcom/google/android/apps/auto/components/media/compat/AaMediaMetadata;)Z", 0);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(omu.k((AaPlaybackState) obj, (lmd) obj2));
    }
}
