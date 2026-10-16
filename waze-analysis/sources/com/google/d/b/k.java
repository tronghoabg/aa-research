package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    static final p f7239a = new k();

    private k() {
        super("CharMatcher.javaIsoControl()");
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        if (c2 > 31) {
            return c2 >= 127 && c2 <= 159;
        }
        return true;
    }
}
