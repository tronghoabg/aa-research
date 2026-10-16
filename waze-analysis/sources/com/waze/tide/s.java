package com.waze.tide;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.airbnb.lottie.b.an;
import com.waze.R;
import com.waze.ui.f.aa;
import com.waze.ui.f.ab;
import com.waze.ui.f.ad;
import com.waze.ui.f.ae;
import com.waze.ui.f.af;
import com.waze.ui.f.ag;
import com.waze.ui.f.ah;
import com.waze.ui.f.ai;
import com.waze.ui.f.aj;
import com.waze.ui.f.al;
import com.waze.ui.f.am;
import com.waze.ui.f.z;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class s {
    public s(t tVar) {
        h.g.b.x.f(tVar, "permissionsHelper");
    }

    public static al d(ab abVar, Composer composer, int i2) {
        String strB;
        h.g.b.x.f(abVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1465424002, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.error (ConversationUiProviders.kt:152)");
        }
        com.waze.ui.f.r rVarA = abVar.a();
        h.g.b.x.f(rVarA, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1702557997, 0, -1, "com.waze.ui.conversation.errorMessage (ConversationUiProviders.kt:172)");
        }
        if (h.g.b.x.n(rVarA, com.waze.ui.f.m.f42306a)) {
            composer.startReplaceGroup(-224299736);
            strB = com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_ERROR_NO_PERMISSION, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(rVarA instanceof com.waze.ui.f.l) && !h.g.b.x.n(rVarA, com.waze.ui.f.p.f42309a) && !h.g.b.x.n(rVarA, com.waze.ui.f.j.f42304a) && !h.g.b.x.n(rVarA, com.waze.ui.f.o.f42308a) && !h.g.b.x.n(rVarA, com.waze.ui.f.n.f42307a) && !h.g.b.x.n(rVarA, com.waze.ui.f.k.f42305a) && !h.g.b.x.n(rVarA, com.waze.ui.f.q.f42310a)) {
                composer.startReplaceGroup(-224302180);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(-224288606);
            strB = com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_ERROR_GENERIC, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        al alVar = new al(strB, R.drawable.exclamation_mark_fill);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return alVar;
    }

    public static al e(ad adVar, Composer composer, int i2) {
        h.g.b.x.f(adVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-78629634, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.idle (ConversationUiProviders.kt:89)");
        }
        al alVar = new al(com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_IDLE, composer, 0), R.drawable.conversational_reporting_idle);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return alVar;
    }

    public static am f(ae aeVar, Composer composer, int i2) {
        h.g.b.x.f(aeVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1377477758, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.listening (ConversationUiProviders.kt:97)");
        }
        am amVar = new am(com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_LISTENING, composer, 0), a.a.G(an.d(com.airbnb.lottie.b.ab.b(R.raw.conversation_listening_loop), composer)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return amVar;
    }

    public static al g(af afVar, Composer composer, int i2) {
        h.g.b.x.f(afVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1377019976, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.muted (ConversationUiProviders.kt:124)");
        }
        al alVar = new al(com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_ERROR_MUTED, composer, 0), R.drawable.sound_off_fill);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return alVar;
    }

    public static al h(ag agVar, Composer composer, int i2) {
        String strB;
        h.g.b.x.f(agVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-281347010, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.paused (ConversationUiProviders.kt:162)");
        }
        z zVarA = agVar.a();
        h.g.b.x.f(zVarA, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1235380667, 0, -1, "com.waze.ui.conversation.pausedMessage (ConversationUiProviders.kt:189)");
        }
        if (h.g.b.x.n(zVarA, com.waze.ui.f.w.f42314a)) {
            composer.startReplaceGroup(1789851664);
            strB = com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_ERROR_GENERIC, composer, 0);
            composer.endReplaceGroup();
        } else if (h.g.b.x.n(zVarA, com.waze.ui.f.y.f42315a)) {
            composer.startReplaceGroup(1789854926);
            strB = com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_CANCEL_USER, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(zVarA instanceof com.waze.ui.f.x)) {
                composer.startReplaceGroup(1789849683);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(-348971485);
            composer.endReplaceGroup();
            strB = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        al alVar = new al(strB, R.drawable.conversational_reporting_idle);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return alVar;
    }

    public static am i(ah ahVar, Composer composer, int i2) {
        h.g.b.x.f(ahVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1686780220, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.processing (ConversationUiProviders.kt:107)");
        }
        am amVar = new am(com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_PROCESSING, composer, 0), a.a.G(an.d(com.airbnb.lottie.b.ab.b(R.raw.conversation_spark), composer)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return amVar;
    }

    public static aa j(h.g.a.q qVar, h.g.a.q qVar2, h.g.a.q qVar3, h.g.a.q qVar4, h.g.a.q qVar5, h.g.a.q qVar6, h.g.a.q qVar7, h.g.a.q qVar8, int i2, int i3) {
        if ((i3 & 1) != 0) {
            qVar = new com.waze.sharedui.web.h(2);
        }
        h.g.a.q qVar9 = qVar;
        if ((i3 & 2) != 0) {
            qVar2 = new com.waze.sharedui.web.h(3);
        }
        h.g.a.q qVar10 = qVar2;
        if ((i3 & 4) != 0) {
            qVar3 = new com.waze.sharedui.web.h(4);
        }
        h.g.a.q qVar11 = qVar3;
        h.g.a.q hVar = (i3 & 8) != 0 ? new com.waze.sharedui.web.h(5) : qVar4;
        com.waze.sharedui.web.h hVar2 = (i3 & 16) != 0 ? new com.waze.sharedui.web.h(6) : null;
        h.g.a.q hVar3 = (i3 & 32) != 0 ? new com.waze.sharedui.web.h(7) : qVar5;
        h.g.a.q hVar4 = (i3 & 64) != 0 ? new com.waze.sharedui.web.h(8) : qVar6;
        h.g.a.q hVar5 = (i3 & 128) != 0 ? new com.waze.sharedui.web.h(9) : qVar7;
        h.g.a.q hVar6 = (i3 & 256) != 0 ? new com.waze.sharedui.web.h(10) : qVar8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(591479068, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.providers (ConversationUiProviders.kt:74)");
        }
        aa aaVar = new aa(qVar9, qVar10, qVar11, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aaVar;
    }

    public static am k(ai aiVar, Composer composer, int i2) {
        h.g.b.x.f(aiVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1811594212, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.speaking (ConversationUiProviders.kt:117)");
        }
        am amVar = new am(aiVar.a(), a.a.G(an.d(com.airbnb.lottie.b.ab.b(R.raw.conversation_speaking_loop), composer)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return amVar;
    }

    public static am l(aj ajVar, Composer composer, int i2) {
        h.g.b.x.f(ajVar, "state");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-585608658, i2, -1, "com.waze.ui.conversation.ConversationUiDefaults.success (ConversationUiProviders.kt:139)");
        }
        am amVar = new am(String.valueOf(ajVar.a()), a.a.G(an.d(com.airbnb.lottie.b.ab.b(R.raw.conversation_checkmark), composer)), 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return amVar;
    }

    private s() {
        throw null;
    }

    public /* synthetic */ s(byte[] bArr) {
    }
}
