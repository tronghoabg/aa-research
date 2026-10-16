package com.google.d.f;

import com.google.d.d.fo;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final w f7847a = new w();

    @Deprecated
    public static i l(String str) {
        fo.l(true, "injected class name is empty");
        return new i(com.google.d.f.b.ae.d(str.replace('/', '.')));
    }

    @Override // com.google.d.f.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final h a(Level level) {
        boolean zJ = j(level);
        com.google.d.f.b.ae.n(h(), level, zJ);
        return !zJ ? f7847a : new g(this, level);
    }
}
