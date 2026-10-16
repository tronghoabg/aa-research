package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class edy extends View {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ eeb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edy(eeb eebVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = eebVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        eeb eebVar = this.b;
        if (eebVar.e == color) {
            return;
        }
        eebVar.e = color;
        ArrayList arrayList = eebVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((edx) arrayList.get(size)).c();
            }
        }
    }
}
