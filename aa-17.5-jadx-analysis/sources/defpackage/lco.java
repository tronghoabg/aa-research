package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class lco extends ao {
    private static final yph g = yph.c("GH.CsatPostdriveDlg");
    private boolean h;
    private TextView i;
    private lbt j;
    private lcn k;

    static final void h(lco lcoVar, int i) {
        g.l().u("Csat item has been clicked");
        lcn lcnVar = lcoVar.k;
        lbt lbtVar = null;
        if (lcnVar == null) {
            affa.d("adapter");
            lcnVar = null;
        }
        lcc lccVar = (lcc) lcnVar.getItem(i);
        yzy yzyVar = lccVar != null ? lccVar.a : null;
        if (yzyVar == null) {
            throw new IllegalStateException(a.bp(i, "Unexpected item index "));
        }
        if (!lcoVar.i(new ldc(yzyVar))) {
            super.g(false, false);
            return;
        }
        lbt lbtVar2 = lcoVar.j;
        if (lbtVar2 == null) {
            affa.d("survey");
            lbtVar2 = null;
        }
        lbt lbtVar3 = (lbt) lbtVar2.u.invoke(yzyVar);
        if (lbtVar3 == null) {
            lcq.a.a().b(lcoVar.requireContext());
            super.g(false, false);
            return;
        }
        lcoVar.h = false;
        lcoVar.j = lbtVar3;
        lcoVar.requireArguments().putInt("context", lbtVar3.ordinal());
        lcn lcnVar2 = lcoVar.k;
        if (lcnVar2 == null) {
            affa.d("adapter");
            lcnVar2 = null;
        }
        lcnVar2.clear();
        boolean booleanExtra = lcoVar.requireActivity().getIntent().getBooleanExtra("RANDOMIZE_RESPONSES", true);
        lcn lcnVar3 = lcoVar.k;
        if (lcnVar3 == null) {
            affa.d("adapter");
            lcnVar3 = null;
        }
        lbt lbtVar4 = lcoVar.j;
        if (lbtVar4 == null) {
            affa.d("survey");
            lbtVar4 = null;
        }
        lcnVar3.addAll(lbt.f(lbtVar4, booleanExtra));
        lcn lcnVar4 = lcoVar.k;
        if (lcnVar4 == null) {
            affa.d("adapter");
            lcnVar4 = null;
        }
        lcnVar4.notifyDataSetChanged();
        TextView textView = lcoVar.i;
        if (textView == null) {
            affa.d("dialogQuestion");
            textView = null;
        }
        lbt lbtVar5 = lcoVar.j;
        if (lbtVar5 == null) {
            affa.d("survey");
        } else {
            lbtVar = lbtVar5;
        }
        textView.setText(lbtVar.d(lcoVar.requireContext()));
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
    public final Dialog gn(Bundle bundle) throws Resources.NotFoundException {
        g.l().u("Creating Csat survey dialog");
        wou wouVar = new wou(requireActivity(), R.style.CsatPostdriveDialog);
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
        lbt lbtVar = this.j;
        if (lbtVar == null) {
            affa.d("survey");
            lbtVar = null;
        }
        textView.setText(lbtVar.d(requireContext()));
        boolean booleanExtra = requireActivity().getIntent().getBooleanExtra("RANDOMIZE_RESPONSES", true);
        Context contextRequireContext = requireContext();
        lbt lbtVar2 = this.j;
        if (lbtVar2 == null) {
            affa.d("survey");
            lbtVar2 = null;
        }
        lcn lcnVar = new lcn(contextRequireContext, lbt.f(lbtVar2, booleanExtra));
        this.k = lcnVar;
        wouVar.q(lcnVar);
        wouVar.r(viewInflate);
        en enVarB = wouVar.b();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.padding_p1);
        ListView listViewB = enVarB.b();
        listViewB.setDivider(null);
        listViewB.setDividerHeight(dimensionPixelSize);
        listViewB.setPadding(dimensionPixelSize, listViewB.getPaddingTop(), dimensionPixelSize, listViewB.getPaddingBottom());
        listViewB.setClipToPadding(false);
        enVarB.b().setOnItemClickListener(new lcl((ao) this, 0));
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
