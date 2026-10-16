package defpackage;

import android.content.ComponentName;
import android.media.session.MediaController;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class lpa implements lkc {
    public static final yph a = yph.c("GH.MediaTransportCtrls");
    public final lmb b;
    public final llu c;
    private final ComponentName d;
    private final yzz e;

    public lpa(lmb lmbVar, ComponentName componentName, yzz yzzVar) {
        this.c = lmbVar.V();
        this.b = lmbVar;
        this.d = componentName;
        this.e = yzzVar;
    }

    @Override // defpackage.lkc
    public final void a(final KeyEvent keyEvent) {
        ((ype) a.l().ai(4130)).S("dispatchMediaKey: component=%s context=%s action=%d keyCode=%d", j(), k(), Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getKeyCode()));
        final lmb lmbVar = this.b;
        ((Boolean) lmbVar.Q(new Supplier() { // from class: llw
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(((MediaController) ((dq) lmbVar.b).c.e).dispatchMediaButtonEvent(keyEvent));
            }
        }, false, "dispatch media button event")).booleanValue();
        if (keyEvent.getAction() == 1) {
            l(yzy.fg, null);
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79) {
                l(yzy.fl, null);
                return;
            }
            if (keyCode == 130) {
                l(yzy.fq, null);
                return;
            }
            if (keyCode == 126) {
                l(yzy.fh, null);
                return;
            }
            if (keyCode == 127) {
                l(yzy.fi, null);
                return;
            }
            switch (keyCode) {
                case 85:
                    l(yzy.fj, null);
                    break;
                case 86:
                    l(yzy.fm, null);
                    break;
                case 87:
                    l(yzy.fn, null);
                    break;
                case 88:
                    l(yzy.fo, null);
                    break;
                case 89:
                    l(yzy.fp, null);
                    break;
                case 90:
                    l(yzy.fr, null);
                    break;
                case 91:
                    l(yzy.fk, null);
                    break;
            }
        }
    }

    @Override // defpackage.lkc
    public final void b() {
        ((ype) a.l().ai((char) 4131)).M("pause: component=%s context=%s", j(), k());
        this.c.y();
        l(yzy.eX, null);
    }

    @Override // defpackage.lkc
    public final void c() {
        ((ype) a.l().ai((char) 4132)).M("play: component=%s context=%s", j(), k());
        lmb.S(new kyl(this.c, 11), "play");
        l(yzy.eW, null);
    }

    @Override // defpackage.lkc
    public final void d(String str, Bundle bundle) {
        ((ype) a.l().ai(4133)).S("playFromMediaId: component=%s context=%s mediaId=%s extras=%s", j(), k(), str, bundle);
        lmb.S(new jda((Object) this.c, (Object) str, (Object) bundle, 16, (short[]) null), "playFromMediaId");
        l(yzy.fa, null);
    }

    @Override // defpackage.lkc
    public final void e(long j) {
        ((ype) a.l().ai(4135)).R("seekTo: component=%s context=%s pos=%d", j(), k(), Long.valueOf(j));
        lmb.S(new lma(this.c, j, 2), "seekTo");
        l(yzy.ff, null);
    }

    @Override // defpackage.lkc
    public final void f(AaPlaybackState.AaCustomAction aaCustomAction, Bundle bundle) {
        ((ype) a.l().ai(4136)).S("sendCustomAction: component=%s context=%s customAction=%s extras=%s", j(), k(), aaCustomAction, bundle);
        lmb.S(new jda((Object) this.c, (Object) aaCustomAction, (Object) bundle, 15, (short[]) null), "sendCustomAction");
        l(yzy.fd, String.valueOf(aaCustomAction.P()));
    }

    @Override // defpackage.lkc
    public final void g() {
        ((ype) a.l().ai((char) 4138)).M("skipToNext: component=%s context=%s", j(), k());
        lmb.S(new kyl(this.c, 14), "skipToNext");
        l(yzy.eY, null);
    }

    @Override // defpackage.lkc
    public final void h() {
        ((ype) a.l().ai((char) 4139)).M("skipToPrevious: component=%s context=%s", j(), k());
        lmb.S(new kyl(this.c, 12), "skipToPrevious");
        l(yzy.eZ, null);
    }

    @Override // defpackage.lkc
    public final void i() {
        ((ype) a.l().ai((char) 4141)).M("stop: component=%s context=%s", j(), k());
        this.c.A();
        l(yzy.fe, null);
    }

    public final String j() {
        return this.d.flattenToShortString();
    }

    public final String k() {
        return this.e.name();
    }

    public final void l(yzy yzyVar, String str) {
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, this.e, yzyVar);
        ComponentName componentName = this.d;
        rrbVarH.p(componentName);
        rrbVarH.g(componentName.getPackageName());
        if (str != null) {
            rrbVarH.h = xxh.h(str);
        }
        ebf.j().F(rrbVarH.l());
    }
}
