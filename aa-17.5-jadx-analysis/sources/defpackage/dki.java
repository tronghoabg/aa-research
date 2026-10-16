package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class dki extends ClickableSpan {
    private final dez a;

    public dki(dez dezVar) {
        this.a = dezVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        dez dezVar = this.a;
        glf glfVarB = dezVar.b();
        if (glfVarB != null) {
            glfVarB.b(dezVar);
        }
    }
}
