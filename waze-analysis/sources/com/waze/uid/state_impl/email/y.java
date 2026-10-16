package com.waze.uid.state_impl.email;

import android.content.Context;
import com.waze.R;
import com.waze.uid.FlowType;
import com.waze.uid.UidModel;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y implements com.waze.shared_infra.f.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.uid.d.a f44664a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f44665b;

    public y(com.waze.uid.d.a aVar, com.waze.shared_infra.o.a aVar2) {
        h.g.b.x.f(aVar, "runOnMainActivity");
        h.g.b.x.f(aVar2, "stringProvider");
        this.f44664a = aVar;
        this.f44665b = aVar2;
    }

    public static final /* synthetic */ void b(y yVar, Context context) {
        com.waze.sharedui.g.p pVar = new com.waze.sharedui.g.p(context);
        com.waze.shared_infra.o.a aVar = yVar.f44665b;
        pVar.h(aVar.c(R.string.VERIFY_EMAIL_FAILURE_POPUP_TITLE, new Object[0]));
        pVar.e(aVar.c(R.string.VERIFY_EMAIL_FAILURE_POPUP_SUBTITLE, new Object[0]));
        pVar.c(aVar.c(R.string.VERIFY_EMAIL_FAILURE_POPUP_CLOSE, new Object[0]), new com.waze.inbox.e(20));
        pVar.j();
        pVar.b(R.drawable.email_dead);
        pVar.i();
    }

    @Override // com.waze.shared_infra.f.b
    public final boolean a(com.waze.shared_infra.f.a aVar) {
        h.g.b.x.f(aVar, "deeplink");
        if (!h.g.b.x.n(com.waze.sharedui.c.a.f38840a.a(), aVar.a())) {
            return false;
        }
        com.waze.uid.b.ab abVarA = com.waze.uid.b.ab.f44136a.a();
        if (((UidModel) abVarA.b()).getEmailParameters().getPinCodeToken().length() > 0) {
            FlowType flowType = ((UidModel) abVarA.b()).getFlowType();
            Objects.toString(flowType);
            com.waze.shared_infra.i.h.k("UidEventsController", "UidEventsController in persistence mode flow=".concat(String.valueOf(flowType)));
            String strB = aVar.b("uuid");
            if (strB != null) {
                abVarA.o(new e(strB));
                return true;
            }
        }
        if (abVarA.p()) {
            abVarA.w(new w(this));
            return true;
        }
        this.f44664a.p(new x(this));
        return true;
    }
}
