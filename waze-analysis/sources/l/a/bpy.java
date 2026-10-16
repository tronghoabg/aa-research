package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpy extends com.google.v.dm<bqa, bpy> implements com.google.v.fj {
    /* synthetic */ bpy(byte[] bArr) {
        super(bqa.DEFAULT_INSTANCE);
    }

    public final void a(sj sjVar) {
        copyOnWrite();
        ((bqa) this.instance).setDictationScreenClicked(sjVar);
    }

    public final void b(sm smVar) {
        copyOnWrite();
        ((bqa) this.instance).setDictationScreenFinished(smVar);
    }

    public final void c(so soVar) {
        copyOnWrite();
        ((bqa) this.instance).setDictationScreenInitiated(soVar);
    }

    public final void d(aym aymVar) {
        copyOnWrite();
        ((bqa) this.instance).setSearchByVoiceListeningCancelled(aymVar);
    }

    public final void e(bqn bqnVar) {
        copyOnWrite();
        ((bqa) this.instance).setVoiceSearchFinished(bqnVar);
    }

    public final void f(bqp bqpVar) {
        copyOnWrite();
        ((bqa) this.instance).setVoiceSearchInitiated(bqpVar);
    }

    private bpy() {
        throw null;
    }
}
