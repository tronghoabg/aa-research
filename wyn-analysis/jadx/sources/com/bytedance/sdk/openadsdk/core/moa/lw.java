package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.moa.ivm;
import com.bytedance.sdk.openadsdk.core.model.orq;
import com.bytedance.sdk.openadsdk.utils.af;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class lw {
    private final ivm.uef bcc;
    private final ivm.oa ivm;

    /* renamed from: oa, reason: collision with root package name */
    private ivm f25642oa;
    private orq uef;
    private final View.OnAttachStateChangeListener xs;
    private List<uef> yo = new ArrayList();
    private final String moa = "BannerSwiperManager";
    private int lw = -1;

    public lw(orq orqVar, Context context, int i5, int i10) {
        ivm.oa oaVar = new ivm.oa() { // from class: com.bytedance.sdk.openadsdk.core.moa.lw.1
            @Override // com.bytedance.sdk.openadsdk.core.moa.ivm.oa
            public void uef(boolean z2) {
                try {
                    if (z2) {
                        lw.this.moa();
                    } else {
                        lw.this.yo();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.ivm = oaVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.lw.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) throws Resources.NotFoundException {
                lw.this.lw();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) throws Resources.NotFoundException {
                if (lw.this.yo != null && !lw.this.yo.isEmpty()) {
                    for (int i11 = 0; i11 < lw.this.yo.size(); i11++) {
                        ((uef) lw.this.yo.get(i11)).ivm();
                    }
                }
                lw.this.lw = -1;
                if (lw.this.f25642oa != null) {
                    lw.this.f25642oa.moa();
                }
            }
        };
        this.xs = onAttachStateChangeListener;
        ivm.uef uefVar = new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.core.moa.lw.3
            @Override // com.bytedance.sdk.openadsdk.core.moa.ivm.uef
            public void uef(boolean z2) {
                if (z2) {
                    lw.this.moa();
                } else {
                    lw.this.yo();
                }
            }
        };
        this.bcc = uefVar;
        this.uef = orqVar;
        ivm ivmVar = new ivm(context);
        this.f25642oa = ivmVar;
        ivmVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f25642oa.setSwiperWindowFocusChangedListener(oaVar);
        this.f25642oa.setSwiperVisibleChangeListener(uefVar);
        uef(context, i5, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw() throws Resources.NotFoundException {
        if (this.uef == null) {
            this.uef = new orq();
        }
        this.f25642oa.uef(TextUtils.equals(this.uef.uef(), "vertical") ? 1 : 0).uef("dot").yo(false).moa(this.uef.moa() == 1).uef(this.uef.oa() == 1).yo(this.uef.cz()).lw(this.uef.zjm() == 1).moa(this.uef.bcc()).oa(this.uef.yo() == 1).cz(this.uef.lw()).zjm(this.uef.ivm()).bcc(this.uef.xs());
        this.f25642oa.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.ivm.yo() { // from class: com.bytedance.sdk.openadsdk.core.moa.lw.4
            @Override // com.bytedance.adsdk.ugeno.ivm.yo
            public void uef(boolean z2, int i5, float f10, int i10) {
            }

            @Override // com.bytedance.adsdk.ugeno.ivm.yo
            public void uef(boolean z2, int i5, int i10, boolean z10, boolean z11) {
                lw.this.yo(i5);
                lw.this.lw = i5;
                lw.this.uef(i5);
                lw.this.oa(i5);
            }

            @Override // com.bytedance.adsdk.ugeno.ivm.yo
            public void uef(boolean z2, int i5) {
                if (i5 == 1 || i5 == 2) {
                    lw.this.oa(-1);
                } else if (i5 == 0) {
                    lw lwVar = lw.this;
                    lwVar.uef(lwVar.lw);
                }
            }
        });
        oa(this.yo);
        this.f25642oa.yo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa() {
        ivm ivmVar;
        orq orqVar = this.uef;
        if (orqVar != null && orqVar.oa() == 1 && (ivmVar = this.f25642oa) != null) {
            ivmVar.lw();
        }
        int i5 = this.lw;
        if (i5 >= 0) {
            uef(i5);
            oa(this.lw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        ivm ivmVar;
        orq orqVar = this.uef;
        if (orqVar != null && orqVar.oa() == 1 && (ivmVar = this.f25642oa) != null) {
            ivmVar.ivm();
        }
        if (this.lw >= 0) {
            oa(-1);
        }
    }

    public void oa(int i5) {
        uef uefVar;
        for (int i10 = 0; i10 < this.yo.size(); i10++) {
            try {
                if (i10 != i5 && (uefVar = this.yo.get(i10)) != null) {
                    uefVar.cz();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    public void uef(Context context, float f10, float f11) {
        int iOa = af.oa(context, f10);
        int iOa2 = af.oa(context, f11);
        ViewGroup.LayoutParams layoutParams = this.f25642oa.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iOa, iOa2);
        }
        layoutParams.width = iOa;
        layoutParams.height = iOa2;
        this.f25642oa.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(int i5) {
        uef uefVar;
        try {
            int i10 = this.lw;
            if (i10 != -1 && i10 != i5 && (uefVar = this.yo.get(i10)) != null) {
                uefVar.moa();
                uefVar.bcc();
            }
            uef uefVar2 = this.yo.get(i5);
            if (uefVar2 != null) {
                uefVar2.lw();
            }
        } catch (Throwable unused) {
        }
    }

    private void oa(List<uef> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f25642oa.uef((ivm) list.get(i5).uef());
        }
    }

    public View oa() {
        return this.f25642oa;
    }

    public void uef(List<uef> list) {
        this.yo = list;
    }

    public void uef(final int i5) {
        uef uefVar;
        try {
            final int size = this.yo.size();
            if (i5 < size && (uefVar = this.yo.get(i5)) != null) {
                uefVar.uef(new com.bytedance.sdk.openadsdk.uef.uef.oa() { // from class: com.bytedance.sdk.openadsdk.core.moa.lw.5
                    @Override // com.bytedance.sdk.openadsdk.uef.uef.oa
                    public void uef() {
                        int i10 = i5 + 1;
                        if (i10 >= size) {
                            return;
                        }
                        lw.this.uef(i10);
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void uef() {
        if (this.f25642oa != null) {
            try {
                List<uef> list = this.yo;
                if (list != null && !list.isEmpty()) {
                    for (int i5 = 0; i5 < this.yo.size(); i5++) {
                        this.yo.get(i5).xs();
                    }
                }
                this.lw = -1;
                this.f25642oa.moa();
                this.f25642oa.setSwiperWindowFocusChangedListener(null);
                this.f25642oa.setSwiperVisibleChangeListener(null);
                this.f25642oa.removeOnAttachStateChangeListener(this.xs);
                this.f25642oa = null;
            } catch (Throwable unused) {
            }
        }
    }
}
