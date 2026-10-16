package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lol {
    static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.lol.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/media/repository/ActiveMediaSessionsLiveDataProvider;", 0)};

    public static final boolean b(defpackage.lmk lmkVar) {
        if (lmkVar != null) {
            return lmkVar.h().S() == null && lmkVar.h().R() == null && lmkVar.h().O() == null && lmkVar.h().P() == null && lmkVar.Q("com.google.android.apps.auto.radio.FREQUENCY") == null && lmkVar.Q("com.google.android.apps.auto.radio.STATION_NAME") == null && lmkVar.Q("android.media.metadata.TITLE") == null && lmkVar.Q("android.media.metadata.ARTIST") == null && lmkVar.Q("com.google.android.apps.auto.radio.MESSAGE") == null && lmkVar.Q("com.google.android.apps.auto.radio.PROGRAM_TYPE") == null && lmkVar.P("android.media.metadata.ALBUM_ART") == null && lmkVar.P("android.media.metadata.DISPLAY_ICON") == null && lmkVar.Q("android.media.metadata.ALBUM_ART_URI") == null && lmkVar.Q("android.media.metadata.DISPLAY_ICON_URI") == null && lmkVar.P("android.media.metadata.ALBUM_ART") == null;
        }
        return true;
    }

    public static final boolean c(lph lphVar, com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, defpackage.lmk lmkVar) {
        boolean z = lphVar.b;
        boolean z2 = z && !defpackage.afga.f(lphVar.a, defpackage.mkt.F);
        if (z || defpackage.acmw.h()) {
            return ((z2 && aaPlaybackState != null && aaPlaybackState.Q() == 1) || aaPlaybackState == null || aaPlaybackState.Q() == 0 || aaPlaybackState.Q() == 7 || b(lmkVar)) ? false : true;
        }
        return true;
    }

    public final defpackage.lom a() {
        return (defpackage.lom) defpackage.lom.b.getValue(this, a[0]);
    }
}
