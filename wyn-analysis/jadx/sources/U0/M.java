package u0;

import K.C0678c;
import N.C0718d;
import N.C0725g0;
import N.C0729i0;
import N.C0740o;
import kotlin.jvm.internal.AbstractC3340k;
import t0.InterfaceC4044I;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final N.L0 f46139a = new N.L0(C4199w.f46394q);

    /* renamed from: b, reason: collision with root package name */
    public static final N.L0 f46140b = new N.L0(C4199w.f46395r);

    /* renamed from: c, reason: collision with root package name */
    public static final N.L0 f46141c = new N.L0(C4199w.f46396s);

    /* renamed from: d, reason: collision with root package name */
    public static final N.L0 f46142d = new N.L0(C4199w.f46397t);

    /* renamed from: e, reason: collision with root package name */
    public static final N.L0 f46143e = new N.L0(C4199w.f46398u);

    /* renamed from: f, reason: collision with root package name */
    public static final N.L0 f46144f = new N.L0(C4199w.f46399v);

    /* renamed from: g, reason: collision with root package name */
    public static final N.L0 f46145g = new N.L0(C4199w.f46401x);

    /* renamed from: h, reason: collision with root package name */
    public static final N.L0 f46146h = new N.L0(C4199w.f46400w);

    /* renamed from: i, reason: collision with root package name */
    public static final N.L0 f46147i = new N.L0(C4199w.f46402y);

    /* renamed from: j, reason: collision with root package name */
    public static final N.L0 f46148j = new N.L0(C4199w.f46403z);
    public static final N.L0 k = new N.L0(C4199w.f46380A);

    /* renamed from: l, reason: collision with root package name */
    public static final N.L0 f46149l = new N.L0(C4199w.f46382C);

    /* renamed from: m, reason: collision with root package name */
    public static final N.L0 f46150m = new N.L0(C4199w.f46383D);

    /* renamed from: n, reason: collision with root package name */
    public static final N.L0 f46151n = new N.L0(C4199w.f46384E);

    /* renamed from: o, reason: collision with root package name */
    public static final N.L0 f46152o = new N.L0(C4199w.f46385F);

    /* renamed from: p, reason: collision with root package name */
    public static final N.L0 f46153p = new N.L0(C4199w.f46386G);

    /* renamed from: q, reason: collision with root package name */
    public static final N.L0 f46154q = new N.L0(C4199w.f46381B);

    public static final void a(InterfaceC4044I interfaceC4044I, D uriHandler, V.d content, C0740o c0740o, int i5) {
        int i10;
        AbstractC3340k.e(uriHandler, "uriHandler");
        AbstractC3340k.e(content, "content");
        c0740o.N(874662829);
        if ((i5 & 14) == 0) {
            i10 = (c0740o.e(interfaceC4044I) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 112) == 0) {
            i10 |= c0740o.e(uriHandler) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i10 |= c0740o.e(content) ? 256 : 128;
        }
        if ((i10 & 731) == 146 && c0740o.x()) {
            c0740o.I();
        } else {
            C4188n c4188n = (C4188n) interfaceC4044I;
            C0725g0 c0725g0A = f46139a.a(c4188n.getAccessibilityManager());
            C0725g0 c0725g0A2 = f46140b.a(c4188n.getAutofill());
            C0725g0 c0725g0A3 = f46141c.a(c4188n.getAutofillTree());
            C0725g0 c0725g0A4 = f46142d.a(c4188n.getClipboardManager());
            C0725g0 c0725g0A5 = f46143e.a(c4188n.getDensity());
            C0725g0 c0725g0A6 = f46144f.a(c4188n.getFocusManager());
            C0725g0 c0725g0A7 = f46145g.a(c4188n.getFontLoader());
            c0725g0A7.f7778f = false;
            C0725g0 c0725g0A8 = f46146h.a(c4188n.getFontFamilyResolver());
            c0725g0A8.f7778f = false;
            C0718d.a(new C0725g0[]{c0725g0A, c0725g0A2, c0725g0A3, c0725g0A4, c0725g0A5, c0725g0A6, c0725g0A7, c0725g0A8, f46147i.a(c4188n.getHapticFeedBack()), f46148j.a(c4188n.getInputModeManager()), k.a(c4188n.getLayoutDirection()), f46149l.a(c4188n.getTextInputService()), f46150m.a(c4188n.getTextToolbar()), f46151n.a(uriHandler), f46152o.a(c4188n.getViewConfiguration()), f46153p.a(c4188n.getWindowInfo()), f46154q.a(c4188n.getPointerIconService())}, content, c0740o, ((i10 >> 3) & 112) | 8);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0678c(i5, 4, interfaceC4044I, uriHandler, content);
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
