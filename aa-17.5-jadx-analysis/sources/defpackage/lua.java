package defpackage;

/* loaded from: classes2.dex */
public enum lua {
    ASSISTANT_READ_REPLY(yzz.MESSAGING_FLOW_ASSISTANT_READ_REPLY, yzy.nG),
    ASSISTANT_DIRECT_REPLY(yzz.MESSAGING_FLOW_ASSISTANT_DIRECT_REPLY, yzy.nH),
    ASSISTANT_COMPOSE(yzz.MESSAGING_FLOW_ASSISTANT_COMPOSE, null),
    ASSISTANT_VOICE_INVOCATION(yzz.MESSAGING_FLOW_ASSISTANT_VOICE_INVOCATION, null),
    ASSISTANT_AUTO_READ(yzz.MESSAGING_FLOW_ASSISTANT_AUTO_READ, null),
    ASSISTANT_SUMMARIZE(yzz.MESSAGING_FLOW_ASSISTANT_SUMMARIZE, null);

    public final yzz g;
    public final yzy h;

    lua(yzz yzzVar, yzy yzyVar) {
        this.g = yzzVar;
        this.h = yzyVar;
    }
}
