package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class lct extends ao {
    private static final yph g = yph.c("GH.LegacyCsatDlg");
    private boolean h;
    private TextView i;
    private lbt j;
    private lcs k;

    static final void h(lct lctVar, int i) {
        g.l().u("Csat item has been clicked");
        lcs lcsVar = lctVar.k;
        lbt lbtVar = null;
        if (lcsVar == null) {
            affa.d("adapter");
            lcsVar = null;
        }
        lcc lccVar = (lcc) lcsVar.getItem(i);
        yzy yzyVar = lccVar != null ? lccVar.a : null;
        if (yzyVar == null) {
            throw new IllegalStateException(a.bp(i, "Unexpected item index "));
        }
        if (!lctVar.i(new ldc(yzyVar))) {
            super.g(false, false);
            return;
        }
        lbt lbtVar2 = lctVar.j;
        if (lbtVar2 == null) {
            affa.d("survey");
            lbtVar2 = null;
        }
        lbt lbtVar3 = (lbt) lbtVar2.u.invoke(yzyVar);
        if (lbtVar3 == null) {
            lcq.a.a().b(lctVar.requireContext());
            super.g(false, false);
            return;
        }
        lctVar.h = false;
        lctVar.j = lbtVar3;
        lctVar.requireArguments().putInt("context", lbtVar3.ordinal());
        lcs lcsVar2 = lctVar.k;
        if (lcsVar2 == null) {
            affa.d("adapter");
            lcsVar2 = null;
        }
        lcsVar2.clear();
        boolean booleanExtra = lctVar.requireActivity().getIntent().getBooleanExtra("RANDOMIZE_RESPONSES", true);
        lcs lcsVar3 = lctVar.k;
        if (lcsVar3 == null) {
            affa.d("adapter");
            lcsVar3 = null;
        }
        lbt lbtVar4 = lctVar.j;
        if (lbtVar4 == null) {
            affa.d("survey");
            lbtVar4 = null;
        }
        lcsVar3.addAll(lbt.f(lbtVar4, booleanExtra));
        lcs lcsVar4 = lctVar.k;
        if (lcsVar4 == null) {
            affa.d("adapter");
            lcsVar4 = null;
        }
        lcsVar4.notifyDataSetChanged();
        TextView textView = lctVar.i;
        if (textView == null) {
            affa.d("dialogQuestion");
            textView = null;
        }
        lbt lbtVar5 = lctVar.j;
        if (lbtVar5 == null) {
            affa.d("survey");
        } else {
            lbtVar = lbtVar5;
        }
        textView.setText(lbtVar.d(lctVar.requireContext()));
    }

    private final boolean i(ldf ldfVar) {
        if (this.h) {
            return false;
        }
        ype ypeVar = (ype) g.f();
        lbt lbtVar = this.j;
        lbt lbtVar2 = null;
        if (lbtVar == null) {
            affa.d("survey");
            lbtVar = null;
        }
        ypeVar.M("Response for survey %s: %s", lbtVar.name(), ldfVar.a().sn);
        lda ldaVarA = lda.a.a();
        lbt lbtVar3 = this.j;
        if (lbtVar3 == null) {
            affa.d("survey");
        } else {
            lbtVar2 = lbtVar3;
        }
        ldaVarA.c(lbtVar2, ldfVar);
        this.h = true;
        return true;
    }

    @Override // defpackage.ao
    public final Dialog gn(Bundle bundle) {
        g.l().u("Creating Csat survey dialog");
        wou wouVar = new wou(requireActivity(), R.style.CsatPostdriveDialog);
        lbt lbtVar = null;
        View viewInflate = LayoutInflater.from(wouVar.a()).inflate(R.layout.csat_dual_title, (ViewGroup) null);
        int i = requireArguments().getInt("context");
        if (i < 0 || i >= lbt.values().length) {
            throw new IllegalStateException(a.bp(i, "Unknown survey ID "));
        }
        this.j = lbt.values()[i];
        View viewFindViewById = viewInflate.findViewById(R.id.csat_dialog_question);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.i = textView;
        if (textView == null) {
            affa.d("dialogQuestion");
            textView = null;
        }
        lbt lbtVar2 = this.j;
        if (lbtVar2 == null) {
            affa.d("survey");
            lbtVar2 = null;
        }
        textView.setText(lbtVar2.d(requireContext()));
        boolean booleanExtra = requireActivity().getIntent().getBooleanExtra("RANDOMIZE_RESPONSES", true);
        Context contextRequireContext = requireContext();
        lbt lbtVar3 = this.j;
        if (lbtVar3 == null) {
            affa.d("survey");
        } else {
            lbtVar = lbtVar3;
        }
        lcs lcsVar = new lcs(contextRequireContext, lbt.f(lbtVar, booleanExtra));
        this.k = lcsVar;
        wouVar.q(lcsVar);
        wouVar.r(viewInflate);
        en enVarB = wouVar.b();
        enVarB.b().setOnItemClickListener(new lcl((ao) this, 2));
        return enVarB;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        bc bcVarRequireActivity = requireActivity();
        if (bcVarRequireActivity.isChangingConfigurations()) {
            return;
        }
        i(ldb.a);
        ConcurrentHashMap concurrentHashMap = lbt.a;
        lnm.Q();
        bcVarRequireActivity.finish();
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        bc bcVarRequireActivity = requireActivity();
        if (bcVarRequireActivity.isChangingConfigurations()) {
            return;
        }
        bcVarRequireActivity.finish();
    }
}
