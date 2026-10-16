package com.waze.authentication;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.waze.R;
import com.waze.design_components.cta_bar.CallToActionBar;
import com.waze.design_components.text_view.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class am implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15724a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15725b;

    public /* synthetic */ am(Object obj, int i2) {
        this.f15725b = i2;
        this.f15724a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v56, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v66, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v73, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v77, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f15725b) {
            case 0:
                return an.d((an) this.f15724a);
            case 1:
                return an.e((an) this.f15724a);
            case 2:
                return an.b((an) this.f15724a);
            case 3:
                return an.c((an) this.f15724a);
            case 4:
                return aw.k((aw) this.f15724a);
            case 5:
                View viewFindViewById = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.root);
                if (viewFindViewById != null) {
                    return (ConstraintLayout) viewFindViewById;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                View viewFindViewById2 = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.clDialogContainer);
                if (viewFindViewById2 != null) {
                    return (ConstraintLayout) viewFindViewById2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 7:
                View viewFindViewById3 = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.clImageContainer);
                if (viewFindViewById3 != null) {
                    return (ConstraintLayout) viewFindViewById3;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 8:
                View viewFindViewById4 = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.ivImage);
                if (viewFindViewById4 != null) {
                    return (ImageView) viewFindViewById4;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 9:
                View viewFindViewById5 = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.tvTitle);
                if (viewFindViewById5 != null) {
                    return (WazeTextView) viewFindViewById5;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 10:
                View viewFindViewById6 = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.id_0x7f0a0219);
                if (viewFindViewById6 != null) {
                    return (CheckBox) viewFindViewById6;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 11:
                View viewFindViewById7 = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.tvDescription);
                if (viewFindViewById7 != null) {
                    return (WazeTextView) viewFindViewById7;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 12:
                View viewFindViewById8 = ((android.support.v7.app.ap) this.f15724a).findViewById(R.id.ctaBar);
                if (viewFindViewById8 != null) {
                    return (CallToActionBar) viewFindViewById8;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 13:
                return a.a.k(this.f15724a);
            case 14:
                return Float.valueOf(((Number) ((State) this.f15724a).getValue()).floatValue());
            case 15:
                this.f15724a.invoke("");
                return h.ab.f48028a;
            case 16:
                ?? r2 = this.f15724a;
                if (r2 != 0) {
                    r2.invoke();
                }
                return h.ab.f48028a;
            case 17:
                return Boolean.valueOf(Float.isNaN(((com.waze.z.a.b.ab) this.f15724a).b()));
            case 18:
                this.f15724a.invoke(com.waze.z.a.d.h.f45962a);
                return h.ab.f48028a;
            case 19:
                this.f15724a.invoke(com.waze.z.a.d.o.f45969a);
                return h.ab.f48028a;
            default:
                this.f15724a.invoke(com.waze.z.a.d.p.f45970a);
                return h.ab.f48028a;
        }
    }
}
