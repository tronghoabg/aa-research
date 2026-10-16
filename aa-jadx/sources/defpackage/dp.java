package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dp extends defpackage.AbstractC0001do {
    protected final android.media.session.MediaController.TransportControls a;

    public dp(android.media.session.MediaController.TransportControls transportControls) {
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
    public final void c(java.lang.String str, android.os.Bundle bundle) {
        this.a.playFromMediaId(str, bundle);
    }

    @Override // defpackage.AbstractC0001do
    public final void d(java.lang.String str, android.os.Bundle bundle) {
        this.a.playFromSearch(str, bundle);
    }

    @Override // defpackage.AbstractC0001do
    public final void e(long j) {
        this.a.seekTo(j);
    }

    @Override // defpackage.AbstractC0001do
    public final void f(android.support.v4.media.session.PlaybackStateCompat.CustomAction customAction, android.os.Bundle bundle) {
        java.lang.String str = customAction.a;
        defpackage.dq.d(str, bundle);
        this.a.sendCustomAction(str, bundle);
    }

    @Override // defpackage.AbstractC0001do
    public final void g(java.lang.String str, android.os.Bundle bundle) {
        defpackage.dq.d(str, bundle);
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
