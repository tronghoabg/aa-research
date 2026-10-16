package J9;

import android.app.Application;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final s8.g f5908a;

    public Y(s8.g gVar) {
        this.f5908a = gVar;
    }

    public final void a(String str, boolean z2) {
        s8.g gVar = this.f5908a;
        gVar.a();
        SharedPreferences.Editor editorEdit = ((Application) gVar.f45328a).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.putBoolean(str, z2);
        editorEdit.apply();
    }
}
