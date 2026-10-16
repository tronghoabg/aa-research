package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes2.dex */
public final class ajte implements ajtd {
    private final ConcurrentHashMap a = new ConcurrentHashMap();
    private volatile int b = 2;

    @Override // defpackage.ajtd
    public final int a(ajtg ajtgVar) {
        ahgm.e(ajtgVar, "HTTP route");
        Integer num = (Integer) this.a.get(ajtgVar);
        return num != null ? num.intValue() : this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
