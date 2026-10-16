package defpackage;

import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes3.dex */
public final /* synthetic */ class wwx implements wpv {
    public final /* synthetic */ LinearLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ wwx(LinearLayout linearLayout, int i) {
        this.b = i;
        this.a = linearLayout;
    }

    @Override // defpackage.wpv
    public final void a() {
        int i = this.b;
        if (i == 0) {
            wxa wxaVar = (wxa) this.a;
            wpq.o(wxaVar.d, wxaVar.d());
            return;
        }
        LinearLayout linearLayout = this.a;
        if (i == 1) {
            CheckableImageButton checkableImageButton = ((wxa) linearLayout).b;
            wpq.o(checkableImageButton, checkableImageButton.getContentDescription());
        } else {
            wxi wxiVar = (wxi) linearLayout;
            wpq.o(wxiVar.c, wxiVar.b());
        }
    }
}
