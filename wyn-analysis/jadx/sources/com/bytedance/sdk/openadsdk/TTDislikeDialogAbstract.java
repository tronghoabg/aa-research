package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.yo.zjm;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements zjm.oa {
    private View moa;

    /* renamed from: oa, reason: collision with root package name */
    protected List<FilterWord> f25135oa;
    protected String uef;
    protected final zjm yo;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        zjm zjmVar = new zjm();
        this.yo = zjmVar;
        zjmVar.uef(this);
    }

    public void destroy() {
        zjm zjmVar = this.yo;
        if (zjmVar != null) {
            zjmVar.uef();
        }
    }

    public zjm getDislikeManager() {
        return this.yo;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.moa = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.moa;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        zjm zjmVar = this.yo;
        if (zjmVar != null) {
            zjmVar.yo(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.uef = str;
        this.f25135oa = list;
        this.yo.uef(str);
        this.yo.uef(this.f25135oa);
    }

    public TTDislikeDialogAbstract(Context context, int i5) {
        super(context, i5);
        zjm zjmVar = new zjm();
        this.yo = zjmVar;
        zjmVar.uef(this);
    }
}
