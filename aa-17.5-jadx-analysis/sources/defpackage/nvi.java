package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nvi implements nuv {
    private static final yph b = yph.c("GH.PnProcessor");
    private static final int c = R.drawable.gs_call_fill1_vd_theme_24;
    private static final int d = R.drawable.gs_call_end_fill1_vd_theme_24;

    @Override // defpackage.nuv
    public final nur a(nur nurVar) {
        nul nulVar;
        nul nulVar2;
        nurVar.getClass();
        nuq nuqVar = nurVar.D;
        if (!(nuqVar instanceof nvq)) {
            return nurVar;
        }
        num numVarA = num.a(nurVar);
        Context context = mki.a.c;
        context.getClass();
        nuqVar.getClass();
        nvq nvqVar = (nvq) nuqVar;
        int i = nvqVar.b;
        nul nulVar3 = null;
        if (i == 1) {
            aaew aaewVar = new aaew(null);
            int i2 = c;
            aaewVar.e = GhIcon.p(context, i2);
            aaewVar.d = context.getString(R.string.answer_call);
            PendingIntent pendingIntent = nvqVar.c;
            aaewVar.b = pendingIntent;
            aaewVar.a = 2;
            nul nulVar4 = new nul(aaewVar);
            aaew aaewVar2 = new aaew(null);
            int i3 = d;
            aaewVar2.e = GhIcon.p(context, i3);
            aaewVar2.d = context.getString(R.string.decline_call);
            PendingIntent pendingIntent2 = nvqVar.d;
            aaewVar2.b = pendingIntent2;
            aaewVar2.a = 3;
            nul nulVar5 = new nul(aaewVar2);
            aaew aaewVar3 = new aaew(null);
            aaewVar3.e = GhIcon.p(context, i2);
            aaewVar3.b = pendingIntent;
            aaewVar3.a = 2;
            nul nulVar6 = new nul(aaewVar3);
            aaew aaewVar4 = new aaew(null);
            aaewVar4.e = GhIcon.p(context, i3);
            aaewVar4.b = pendingIntent2;
            aaewVar4.a = 3;
            nul nulVar7 = new nul(aaewVar4);
            nul nulVar8 = nurVar.p;
            ((ype) b.f()).y("Processing incoming call notification from %s", nurVar.B);
            numVarA.p = nulVar4;
            numVarA.q = nulVar5;
            numVarA.r = nulVar8;
            long j = nurVar.i;
            ntz ntzVarA = nub.a();
            ntzVarA.b(j);
            ntzVarA.f = nulVar6;
            ntzVarA.h = nulVar7;
            numVarA.u = ntzVarA.a();
        } else if (i != 2) {
            aaew aaewVar5 = new aaew(null);
            int i4 = c;
            aaewVar5.e = GhIcon.p(context, i4);
            aaewVar5.d = context.getString(R.string.answer_call);
            PendingIntent pendingIntent3 = nvqVar.c;
            aaewVar5.b = pendingIntent3;
            aaewVar5.a = 2;
            nul nulVar9 = new nul(aaewVar5);
            aaew aaewVar6 = new aaew(null);
            int i5 = d;
            aaewVar6.e = GhIcon.p(context, i5);
            aaewVar6.d = context.getString(R.string.end_call);
            PendingIntent pendingIntent4 = nvqVar.e;
            aaewVar6.b = pendingIntent4;
            aaewVar6.a = 3;
            nul nulVar10 = new nul(aaewVar6);
            aaew aaewVar7 = new aaew(null);
            aaewVar7.e = GhIcon.p(context, i4);
            aaewVar7.b = pendingIntent3;
            aaewVar7.a = 2;
            nul nulVar11 = new nul(aaewVar7);
            aaew aaewVar8 = new aaew(null);
            aaewVar8.e = GhIcon.p(context, i5);
            aaewVar8.b = pendingIntent4;
            aaewVar8.a = 3;
            nul nulVar12 = new nul(aaewVar8);
            nul nulVar13 = nurVar.p;
            ((ype) b.f()).y("Processing screening call notification from %s", nurVar.B);
            numVarA.p = nulVar9;
            numVarA.q = nulVar10;
            numVarA.r = nulVar13;
            long j2 = nurVar.i;
            ntz ntzVarA2 = nub.a();
            ntzVarA2.b(j2);
            ntzVarA2.f = nulVar11;
            ntzVarA2.h = nulVar12;
            numVarA.u = ntzVarA2.a();
        } else {
            aaew aaewVar9 = new aaew(null);
            int i6 = d;
            aaewVar9.e = GhIcon.p(context, i6);
            aaewVar9.d = context.getString(R.string.end_call);
            PendingIntent pendingIntent5 = nvqVar.e;
            aaewVar9.b = pendingIntent5;
            aaewVar9.a = 3;
            nul nulVar14 = new nul(aaewVar9);
            aaew aaewVar10 = new aaew(null);
            aaewVar10.e = GhIcon.p(context, i6);
            aaewVar10.b = pendingIntent5;
            aaewVar10.a = 3;
            nul nulVar15 = new nul(aaewVar10);
            nul nulVar16 = nurVar.p;
            if ((nulVar16 != null ? nulVar16.a : null) != null) {
                nulVar2 = nurVar.q;
                aaew aaewVar11 = new aaew(null);
                aaewVar11.e = nulVar16.a;
                aaewVar11.a = nulVar16.e;
                aaewVar11.b = nulVar16.c;
                nulVar3 = nulVar14;
                nulVar14 = nulVar16;
                nulVar = nulVar15;
                nulVar15 = new nul(aaewVar11);
            } else {
                nulVar = null;
                nulVar2 = null;
            }
            ((ype) b.f()).y("Processing ongoing call notification from %s", nurVar.B);
            boolean z = nurVar.j && nurVar.i > 0 && nurVar.a.compareTo(nup.HIGH) < 0;
            numVarA.p = nulVar14;
            numVarA.q = nulVar3;
            numVarA.r = nulVar2;
            ntz ntzVarA3 = nub.a();
            ntzVarA3.f = nulVar15;
            ntzVarA3.h = nulVar;
            ntzVarA3.b(nurVar.i);
            ntzVarA3.g = z ? nua.c : nua.a;
            ntzVarA3.e = nurVar.n.toString();
            numVarA.u = ntzVarA3.a();
        }
        ComponentName componentName = nurVar.B;
        if (componentName == null) {
            componentName = new ComponentName(nurVar.f, "");
        }
        nuc nucVar = new nuc();
        nucVar.b = GhIcon.j(componentName);
        numVarA.t = new nud(nucVar);
        return numVarA.b();
    }
}
