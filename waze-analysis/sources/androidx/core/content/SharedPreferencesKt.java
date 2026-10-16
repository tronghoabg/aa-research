package androidx.core.content;

import android.content.SharedPreferences;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SharedPreferencesKt {
    public static final void edit(SharedPreferences sharedPreferences, boolean z, l<? super SharedPreferences.Editor, ab> lVar) {
        x.f(sharedPreferences, "<this>");
        x.f(lVar, "action");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        x.c(editorEdit);
        lVar.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, l lVar, int i2, Object obj) {
        x.f(sharedPreferences, "<this>");
        x.f(lVar, "action");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        x.c(editorEdit);
        lVar.invoke(editorEdit);
        if (((z ? 1 : 0) & ((i2 & 1) ^ 1)) != 0) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
