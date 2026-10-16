package defpackage;

import com.google.android.libraries.geo.mapcore.geoxp.jni.logging.NativeCountersLoggingTransport;

/* loaded from: classes3.dex */
public final class tsh implements ackr {
    private final acku a;
    private final acku b;

    public tsh(acku ackuVar, acku ackuVar2) {
        this.a = ackuVar;
        this.b = ackuVar2;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NativeCountersLoggingTransport a() {
        return new NativeCountersLoggingTransport(((urk) this.a).a(), ((uxv) this.b).b());
    }
}
