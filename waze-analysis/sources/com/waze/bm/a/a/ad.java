package com.waze.bm.a.a;

import android.view.View;
import android.widget.LinearLayout;
import com.waze.R;
import e.a.cn;
import e.a.cp;
import e.a.cq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ad {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f17114a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cq f17115b;

    private ad() {
    }

    public static ac a(e.a.i iVar) {
        return (ac) ac.newStub(new ab(), iVar);
    }

    public static cq b() {
        cq cqVarA;
        cq cqVar = f17115b;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (ad.class) {
            cqVarA = f17115b;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46546c);
                cnVarA.b(cq.e("com.waze.reporting.agent.proto.ReportingAgentService", "Chat"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(ai.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(al.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f17115b = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq c() {
        cq cqVarA;
        cq cqVar = f17114a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (ad.class) {
            cqVarA = f17114a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46546c);
                cnVarA.b(cq.e("com.waze.reporting.agent.proto.ReportingAgentService", "StartChat"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(an.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(ap.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f17114a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static View d(LinearLayout linearLayout) {
        h.g.b.x.f(linearLayout, "<this>");
        View view = new View(linearLayout.getContext());
        view.setBackgroundResource(R.color.separator_default);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, com.waze.shared_infra.i.h.r(1));
        int iR = com.waze.shared_infra.i.h.r(8);
        layoutParams.setMargins(iR, 0, iR, 0);
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        return view;
    }

    public static /* synthetic */ com.waze.bg.a.b.e e(com.waze.reports_v2.b.ac acVar) {
        com.waze.reports_v2.b.ac acVar2 = com.waze.reports_v2.b.ac.f34014a;
        int iOrdinal = acVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.bg.a.b.e.GENDER_MALE;
        }
        if (iOrdinal == 1) {
            return com.waze.bg.a.b.e.GENDER_FEMALE;
        }
        throw new h.i();
    }

    public static /* synthetic */ com.waze.bg.a.b.h f(String str) {
        com.waze.bg.a.b.f fVarNewBuilder = com.waze.bg.a.b.h.newBuilder();
        fVarNewBuilder.a(com.waze.bg.a.b.t.USER);
        fVarNewBuilder.b(str);
        com.waze.bg.a.b.h hVarBuild = fVarNewBuilder.build();
        h.g.b.x.e(hVarBuild, "build(...)");
        return hVarBuild;
    }

    public /* synthetic */ ad(byte[] bArr, byte[] bArr2) {
    }
}
