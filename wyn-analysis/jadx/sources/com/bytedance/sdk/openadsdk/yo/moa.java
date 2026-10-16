package com.bytedance.sdk.openadsdk.yo;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.af;
import java.util.List;

/* loaded from: classes3.dex */
public class moa extends TTDislikeDialogAbstract {
    private uef moa;

    public interface uef {
        void oa();

        void uef();

        void uef(int i5, FilterWord filterWord);
    }

    public moa(Context context, String str, List<FilterWord> list) {
        super(context, orq.ivm(context, "tt_dislikeDialog"));
        this.uef = str;
        this.f25135oa = list;
    }

    private void oa() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.yo.moa.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (moa.this.moa != null) {
                    uef unused = moa.this.moa;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.yo.moa.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (moa.this.moa != null) {
                    moa.this.moa.oa();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(af.yo(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new cz(getContext(), this.yo, this.f25135oa);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            uef();
            oa();
            setMaterialMeta(this.uef, this.f25135oa);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void uef(uef uefVar) {
        this.moa = uefVar;
    }

    @Override // com.bytedance.sdk.openadsdk.yo.zjm.oa
    public void uef(int i5) {
        FilterWord filterWordOa;
        if (zjm.yo == i5) {
            dismiss();
            return;
        }
        if (zjm.lw == i5) {
            uef uefVar = this.moa;
            if (uefVar != null) {
                uefVar.uef();
                return;
            }
            return;
        }
        if (zjm.f26205oa != i5 || (filterWordOa = this.yo.oa()) == null || zjm.uef.equals(filterWordOa)) {
            return;
        }
        uef uefVar2 = this.moa;
        if (uefVar2 != null) {
            try {
                uefVar2.uef(0, filterWordOa);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void uef() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
