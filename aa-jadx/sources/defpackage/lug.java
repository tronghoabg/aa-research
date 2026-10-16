package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum lug {
    ASSISTANT_READ_REPLY(defpackage.zbe.MESSAGING_FLOW_ASSISTANT_READ_REPLY, defpackage.zbd.nG),
    ASSISTANT_DIRECT_REPLY(defpackage.zbe.MESSAGING_FLOW_ASSISTANT_DIRECT_REPLY, defpackage.zbd.nH),
    ASSISTANT_COMPOSE(defpackage.zbe.MESSAGING_FLOW_ASSISTANT_COMPOSE, null),
    ASSISTANT_VOICE_INVOCATION(defpackage.zbe.MESSAGING_FLOW_ASSISTANT_VOICE_INVOCATION, null),
    ASSISTANT_AUTO_READ(defpackage.zbe.MESSAGING_FLOW_ASSISTANT_AUTO_READ, null),
    ASSISTANT_SUMMARIZE(defpackage.zbe.MESSAGING_FLOW_ASSISTANT_SUMMARIZE, null);

    public final defpackage.zbe g;
    public final defpackage.zbd h;

    lug(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        this.g = zbeVar;
        this.h = zbdVar;
    }
}
