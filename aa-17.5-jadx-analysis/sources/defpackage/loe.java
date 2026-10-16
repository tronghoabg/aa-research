package defpackage;

import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final class loe {
    static final /* synthetic */ afia[] a = {new affn(loe.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/media/repository/ActiveMediaSessionsLiveDataProvider;", 0)};

    public static final boolean b(lmd lmdVar) {
        if (lmdVar != null) {
            return lmdVar.h().S() == null && lmdVar.h().R() == null && lmdVar.h().O() == null && lmdVar.h().P() == null && lmdVar.Q("com.google.android.apps.auto.radio.FREQUENCY") == null && lmdVar.Q("com.google.android.apps.auto.radio.STATION_NAME") == null && lmdVar.Q("android.media.metadata.TITLE") == null && lmdVar.Q("android.media.metadata.ARTIST") == null && lmdVar.Q("com.google.android.apps.auto.radio.MESSAGE") == null && lmdVar.Q("com.google.android.apps.auto.radio.PROGRAM_TYPE") == null && lmdVar.P("android.media.metadata.ALBUM_ART") == null && lmdVar.P("android.media.metadata.DISPLAY_ICON") == null && lmdVar.Q("android.media.metadata.ALBUM_ART_URI") == null && lmdVar.Q("android.media.metadata.DISPLAY_ICON_URI") == null && lmdVar.P("android.media.metadata.ALBUM_ART") == null;
        }
        return true;
    }

    public static final boolean c(loz lozVar, AaPlaybackState aaPlaybackState, lmd lmdVar) {
        boolean z = lozVar.b;
        boolean z2 = z && !affa.f(lozVar.a, mkn.F);
        if (z || aclu.h()) {
            return ((z2 && aaPlaybackState != null && aaPlaybackState.Q() == 1) || aaPlaybackState == null || aaPlaybackState.Q() == 0 || aaPlaybackState.Q() == 7 || b(lmdVar)) ? false : true;
        }
        return true;
    }

    public final lof a() {
        return (lof) lof.b.getValue(this, a[0]);
    }
}
