package com.waze.sharedui;

import android.content.Context;
import com.waze.settings.q;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class h implements m {

    /* renamed from: a, reason: collision with root package name */
    private static h f39015a;

    protected h() {
    }

    public static h k() {
        if (f39015a == null) {
            f39015a = new a();
        }
        return f39015a;
    }

    public static void l(h hVar) {
        f39015a = hVar;
    }

    public static boolean m() {
        h hVar = f39015a;
        return (hVar == null || (hVar instanceof a)) ? false : true;
    }

    public abstract Context a();

    public com.waze.sharedui.web.j b() {
        return new d(this);
    }

    public abstract String c();

    @Override // com.waze.sharedui.m
    public abstract Locale d();

    public abstract void e(String str, int i2, int i3, g gVar);

    public abstract void f(f fVar);

    public abstract void g(boolean z);

    public abstract void h(f fVar);

    public abstract void i(Runnable runnable);

    public void j(q qVar) {
    }
}
