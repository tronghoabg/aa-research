package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes2.dex */
final class dp extends AbstractC0001do {
    protected final MediaController.TransportControls a;

    public dp(MediaController.TransportControls transportControls) {
        this.a = transportControls;
    }

    @Override // defpackage.AbstractC0001do
    public final void a() {
        this.a.pause();
    }

    @Override // defpackage.AbstractC0001do
    public final void b() {
        this.a.play();
    }

    @Override // defpackage.AbstractC0001do
    public final void c(String str, Bundle bundle) {
        this.a.playFromMediaId(str, bundle);
    }

    @Override // defpackage.AbstractC0001do
    public final void d(String str, Bundle bundle) {
        this.a.playFromSearch(str, bundle);
    }

    @Override // defpackage.AbstractC0001do
    public final void e(long j) {
        this.a.seekTo(j);
    }

    @Override // defpackage.AbstractC0001do
    public final void f(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
        String str = customAction.a;
        dq.d(str, bundle);
        this.a.sendCustomAction(str, bundle);
    }

    @Override // defpackage.AbstractC0001do
    public final void g(String str, Bundle bundle) {
        dq.d(str, bundle);
        this.a.sendCustomAction(str, bundle);
    }

    @Override // defpackage.AbstractC0001do
    public final void h() {
        this.a.skipToNext();
    }

    @Override // defpackage.AbstractC0001do
    public final void i() {
        this.a.skipToPrevious();
    }

    @Override // defpackage.AbstractC0001do
    public final void j(long j) {
        this.a.skipToQueueItem(j);
    }

    @Override // defpackage.AbstractC0001do
    public final void k() {
        this.a.stop();
    }
}
