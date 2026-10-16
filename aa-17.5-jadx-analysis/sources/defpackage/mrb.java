package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class mrb extends mrl {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.AShortcutAction");
    private final String g;

    public mrb(mrg mrgVar, String str, String str2, GhIcon ghIcon) {
        mqc mqcVar = new mqc(new ComponentName("AssistantShortcut", mrgVar.f));
        eqj eqjVarG = kfl.h().g();
        int i = R.drawable.ic_assistant_badge;
        if (eqjVarG != null && Objects.equals(kfl.h().g().e(), true)) {
            i = 2131233029;
        }
        super(mqcVar, mrgVar, ghIcon, str, i, null);
        this.g = str2;
    }

    @Override // defpackage.mqz
    public final void c() {
        String str = this.g;
        ((ype) b.l().ai((char) 5209)).w("onItemSelected %d", str.hashCode());
        kfl.h().C(str);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uV).l());
    }

    @Override // defpackage.mqz
    public final Drawable g(Context context, int i) {
        mrk mrkVar = new mrk(context.getResources());
        mrkVar.a = this.e;
        return new BitmapDrawable(context.getResources(), mrkVar.a(i));
    }

    @Override // defpackage.mqz
    public final CarIcon h(Context context, int i, boolean z) {
        mrk mrkVar = new mrk(context.getResources());
        mrkVar.a = this.e;
        return new CarIcon(new tj(IconCompat.k(mrkVar.a(i))));
    }
}
