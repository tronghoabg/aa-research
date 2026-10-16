package android.support.v4.app;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ai extends ao {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ar arVar) {
        super(null);
        this.f115a = arVar;
    }

    @Override // android.support.v4.app.ao
    final void a() {
        ar arVar = this.f115a;
        arVar.mContextAwareHelper.dispatchOnContextAvailable(arVar.mHost.i());
    }
}
