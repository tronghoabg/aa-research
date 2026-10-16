package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class nf extends com.google.v.dm<nh, nf> implements com.google.v.fj {
    /* synthetic */ nf(byte[] bArr) {
        super(nh.DEFAULT_INSTANCE);
    }

    public final void a(ly lyVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationAgentResponsePlayingEnded(lyVar);
    }

    public final void b(ma maVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationAgentResponsePlayingStarted(maVar);
    }

    public final void c(mc mcVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationAgentResponseStreamCompleted(mcVar);
    }

    public final void d(mf mfVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationEnded(mfVar);
    }

    public final void e(mi miVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationError(miVar);
    }

    public final void f(mk mkVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationFunctionHandlingCompleted(mkVar);
    }

    public final void g(mm mmVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationFunctionHandlingStarted(mmVar);
    }

    public final void h(ms msVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationInterrupted(msVar);
    }

    public final void i(mv mvVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationMessageSent(mvVar);
    }

    public final void j(my myVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationReaction(myVar);
    }

    public final void k(nb nbVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationResponseChunkReceived(nbVar);
    }

    public final void l(ne neVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationStarted(neVar);
    }

    public final void m(nj njVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationUserFeedbackShown(njVar);
    }

    public final void n(nl nlVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationUserRecordingEnded(nlVar);
    }

    public final void o(nn nnVar) {
        copyOnWrite();
        ((nh) this.instance).setConversationUserRecordingStarted(nnVar);
    }

    private nf() {
        throw null;
    }
}
