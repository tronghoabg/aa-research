package com.waze.profile;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.dr;
import com.waze.sharedui.web.ao;
import com.waze.sharedui.web.aq;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f33391a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f33392b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f33393c;

    public h(dr drVar, NativeManager nativeManager, com.waze.shared_infra.o.a aVar) {
        x.f(drVar, "config");
        x.f(nativeManager, "nativeManager");
        x.f(aVar, "stringProvider");
        this.f33391a = nativeManager;
        String strB = ConfigValues.CONFIG_VALUE_LOGIN_WEB_CHANGE_PASSWORD_PAGE_URL.b();
        x.e(strB, "getValue(...)");
        bn bnVarB = ck.b(new v(new aq(strB, new ao(aVar.c(R.string.PASSWORD, new Object[0]), true, true), false, 56), null));
        this.f33392b = bnVarB;
        this.f33393c = ai.U(bnVarB);
    }

    public final ch a() {
        return this.f33393c;
    }

    public final void b(u uVar) {
        Object objD;
        v vVar;
        Object objD2;
        v vVar2;
        Object objD3;
        v vVar3;
        Object objD4;
        Object objD5;
        x.f(uVar, NotificationCompat.CATEGORY_EVENT);
        if (x.n(uVar, s.f33412a)) {
            this.f33391a.LogOutAccount();
            bn bnVar = this.f33392b;
            do {
                objD5 = bnVar.d();
            } while (!bnVar.f(objD5, v.c((v) objD5, null, -1, 1)));
            return;
        }
        if (x.n(uVar, r.f33411a)) {
            bn bnVar2 = this.f33392b;
            do {
                objD4 = bnVar2.d();
            } while (!bnVar2.f(objD4, v.c((v) objD4, null, 0, 1)));
            return;
        }
        if (x.n(uVar, p.f33409a)) {
            bn bnVar3 = this.f33392b;
            do {
                objD3 = bnVar3.d();
                vVar3 = (v) objD3;
            } while (!bnVar3.f(objD3, v.c(vVar3, aq.e(vVar3.a(), true, false, 47), null, 2)));
            return;
        }
        if (x.n(uVar, q.f33410a)) {
            bn bnVar4 = this.f33392b;
            do {
                objD2 = bnVar4.d();
                vVar2 = (v) objD2;
            } while (!bnVar4.f(objD2, v.c(vVar2, aq.e(vVar2.a(), false, false, 47), null, 2)));
            return;
        }
        if (!x.n(uVar, t.f33413a)) {
            throw new h.i();
        }
        bn bnVar5 = this.f33392b;
        do {
            objD = bnVar5.d();
            vVar = (v) objD;
        } while (!bnVar5.f(objD, v.c(vVar, aq.e(vVar.a(), false, true, 31), null, 2)));
    }
}
