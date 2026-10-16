package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class whz extends dzp {
    final /* synthetic */ EditText a;
    final /* synthetic */ TextView b;

    public whz(EditText editText, TextView textView) {
        this.a = editText;
        this.b = textView;
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        EditText editText = this.a;
        String string = editText.getText() != null ? editText.getText().toString() : "";
        TextView textView = this.b;
        CharSequence charSequenceBJ = a.bJ(textView.getText() != null ? textView.getText().toString() : "", editText.getHint() != null ? editText.getHint().toString() : "", " ");
        edgVar.C(charSequenceBJ);
        edgVar.N(string.isEmpty());
        if (string.isEmpty()) {
            edgVar.Q(charSequenceBJ);
        } else {
            edgVar.Q(string);
        }
    }
}
