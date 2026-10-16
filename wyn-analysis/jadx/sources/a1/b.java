package A1;

import Va.C1038ka;
import Va.X7;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import y1.C4526g;
import z1.C4609b;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f237a;

    /* renamed from: b, reason: collision with root package name */
    public final C1038ka f238b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C1038ka c1038ka = new C1038ka(1);
        super(inputConnection, false);
        this.f237a = editText;
        this.f238b = c1038ka;
        if (C4526g.f47922j != null) {
            C4526g c4526gA = C4526g.a();
            if (c4526gA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            N8.b bVar = c4526gA.f47927e;
            bVar.getClass();
            Bundle bundle = editorInfo.extras;
            C4609b c4609b = (C4609b) ((X7) bVar.f8599c).f13841a;
            int iA = c4609b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) c4609b.f35893d).getInt(iA + c4609b.f35890a) : 0);
            Bundle bundle2 = editorInfo.extras;
            ((C4526g) bVar.f8597a).getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i10) {
        Editable editableText = this.f237a.getEditableText();
        this.f238b.getClass();
        return C1038ka.g(this, editableText, i5, i10, false) || super.deleteSurroundingText(i5, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i10) {
        Editable editableText = this.f237a.getEditableText();
        this.f238b.getClass();
        return C1038ka.g(this, editableText, i5, i10, true) || super.deleteSurroundingTextInCodePoints(i5, i10);
    }
}
