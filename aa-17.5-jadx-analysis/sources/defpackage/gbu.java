package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class gbu extends jd implements gkt {
    public afec a;
    public afec b;

    public gbu(Context context) {
        super(context, null);
        setVisibility(4);
        setFocusable(false);
        setInputType(524288);
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        afec afecVar = this.b;
        if (afecVar != null) {
            afecVar.invoke(getText().toString());
        }
        super.onEditorAction(i);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        afec afecVar = this.a;
        if (afecVar != null) {
            afecVar.invoke(charSequence.toString());
        }
    }

    @Override // defpackage.gkt
    public final void fs(gms gmsVar) {
    }
}
