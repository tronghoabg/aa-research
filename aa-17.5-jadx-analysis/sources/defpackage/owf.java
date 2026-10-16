package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes2.dex */
public final class owf implements rly {
    private final /* synthetic */ int a;
    private final Object b;

    public owf(gkt gktVar, int i) {
        this.a = i;
        gktVar.getClass();
        this.b = gktVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gkt, java.lang.Object] */
    @Override // defpackage.rly
    public final void a(vw vwVar) {
        if (this.a != 0) {
            this.b.fs(new gms(vwVar, (byte[]) null));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gkt, java.lang.Object] */
    @Override // defpackage.rly, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i = this.a;
        ?? r3 = this.b;
        if (i != 0) {
            return r3.onCreateInputConnection(editorInfo);
        }
        owg owgVar = (owg) r3;
        return (InputConnection) owgVar.a(owgVar.k, editorInfo);
    }

    public owf(owg owgVar, int i) {
        this.a = i;
        this.b = owgVar;
    }
}
