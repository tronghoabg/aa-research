package android.support.v4.media.a;

import android.media.session.MediaController;
import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class n extends m {

    /* renamed from: a, reason: collision with root package name */
    protected final MediaController.TransportControls f407a;

    n(MediaController.TransportControls transportControls) {
        this.f407a = transportControls;
    }

    @Override // android.support.v4.media.a.m
    public final void a() {
        this.f407a.fastForward();
    }

    @Override // android.support.v4.media.a.m
    public final void b() {
        this.f407a.pause();
    }

    @Override // android.support.v4.media.a.m
    public final void c() {
        this.f407a.play();
    }

    @Override // android.support.v4.media.a.m
    public final void d(String str, Bundle bundle) {
        this.f407a.playFromMediaId(str, bundle);
    }

    @Override // android.support.v4.media.a.m
    public final void e() {
        this.f407a.rewind();
    }

    @Override // android.support.v4.media.a.m
    public final void f() {
        this.f407a.skipToNext();
    }

    @Override // android.support.v4.media.a.m
    public final void g() {
        this.f407a.skipToPrevious();
    }

    @Override // android.support.v4.media.a.m
    public final void h(String str) {
        int iHashCode;
        if (str == null || ((iHashCode = str.hashCode()) == -1348483723 ? !str.equals("android.support.v4.media.session.action.FOLLOW") : !(iHashCode == 503011406 && str.equals("android.support.v4.media.session.action.UNFOLLOW")))) {
            this.f407a.sendCustomAction(str, (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
    }
}
