package com.waze.main_screen;

import com.waze.bw.c.d.a.bp;
import com.waze.bw.c.d.bl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class v extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f27770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(Object obj, int i2) {
        super(1, obj, ab.class, "onOptionsMenuEvent", "onOptionsMenuEvent(Lcom/waze/startstate/mobile/ui/options/StartStateOptionsMenu$Event;)V", 0);
        this.f27770a = i2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f27770a;
        if (i2 == 0) {
            bp bpVar = (bp) obj;
            h.g.b.x.f(bpVar, "p0");
            ((ab) this.receiver).l(bpVar);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            com.waze.ui.o.t tVar = (com.waze.ui.o.t) obj;
            h.g.b.x.f(tVar, "p0");
            ((ax) this.receiver).p(tVar);
            return h.ab.f48028a;
        }
        bl blVar = (bl) obj;
        h.g.b.x.f(blVar, "p0");
        ((ab) this.receiver).m(blVar);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(Object obj, int i2, byte[] bArr) {
        super(1, obj, ab.class, "onSheetEvent", "onSheetEvent(Lcom/waze/startstate/mobile/ui/StartStateSheetContent$Event;)V", 0);
        this.f27770a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(Object obj, int i2, char[] cArr) {
        super(1, obj, ax.class, "handleEvent", "handleEvent(Lcom/waze/ui/main_menu/MainMenuEvent;)V", 0);
        this.f27770a = i2;
    }
}
