package defpackage;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class gpx extends fud {
    public static final yob c = yob.c("com/android/car/libraries/apphost/media/MediaPlaybackManager");
    private final gpw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpx(geu geuVar) {
        super(geuVar, "MediaPlaybackManager");
        geuVar.getClass();
        this.d = new gpw(this);
    }

    @Override // defpackage.fuh
    public final /* synthetic */ IBinder q() {
        return this.d;
    }
}
