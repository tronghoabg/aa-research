package com.google.e.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aq extends RuntimeException {
    public aq(String str, Throwable th) {
        super(str, th);
    }

    public static Object a(ap apVar) {
        try {
            return apVar.a();
        } catch (Exception e2) {
            throw new aq(e2);
        }
    }

    public aq(Throwable th) {
        super(th);
    }
}
