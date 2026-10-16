package defpackage;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
final class jkn extends Presentation {
    public View a;
    final /* synthetic */ jko b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkn(jko jkoVar, Context context, Display display) {
        super(context, display);
        this.b = jkoVar;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Context context = getContext();
        context.getClass();
        jkm jkmVar = new jkm(this, context);
        this.a = jkmVar;
        jkmVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setContentView(this.a);
    }
}
