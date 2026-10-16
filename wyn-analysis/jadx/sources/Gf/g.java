package Gf;

import Ef.InterfaceC0498l;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final m f4804a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4805b = Jf.b.l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f4806c = Jf.b.l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final H6.g f4807d = new H6.g("BUFFERED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final H6.g f4808e = new H6.g("SHOULD_BUFFER", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final H6.g f4809f = new H6.g("S_RESUMING_BY_RCV", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final H6.g f4810g = new H6.g("RESUMING_BY_EB", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final H6.g f4811h = new H6.g("POISONED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final H6.g f4812i = new H6.g("DONE_RCV", 1);

    /* renamed from: j, reason: collision with root package name */
    public static final H6.g f4813j = new H6.g("INTERRUPTED_SEND", 1);
    public static final H6.g k = new H6.g("INTERRUPTED_RCV", 1);

    /* renamed from: l, reason: collision with root package name */
    public static final H6.g f4814l = new H6.g("CHANNEL_CLOSED", 1);

    /* renamed from: m, reason: collision with root package name */
    public static final H6.g f4815m = new H6.g("SUSPEND", 1);

    /* renamed from: n, reason: collision with root package name */
    public static final H6.g f4816n = new H6.g("SUSPEND_NO_WAITER", 1);

    /* renamed from: o, reason: collision with root package name */
    public static final H6.g f4817o = new H6.g("FAILED", 1);

    /* renamed from: p, reason: collision with root package name */
    public static final H6.g f4818p = new H6.g("NO_RECEIVE_RESULT", 1);

    /* renamed from: q, reason: collision with root package name */
    public static final H6.g f4819q = new H6.g("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r, reason: collision with root package name */
    public static final H6.g f4820r = new H6.g("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s, reason: collision with root package name */
    public static final H6.g f4821s = new H6.g("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0498l interfaceC0498l, Object obj, tf.q qVar) {
        H6.g gVarM = interfaceC0498l.m(obj, qVar);
        if (gVarM == null) {
            return false;
        }
        interfaceC0498l.o(gVarM);
        return true;
    }
}
