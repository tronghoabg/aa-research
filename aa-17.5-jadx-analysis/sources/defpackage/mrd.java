package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mrd extends mrl {
    public static final /* synthetic */ int g = 0;
    public boolean b;
    private final String j;
    private final String k;
    private static final yph i = yph.c("GH.CallShortcutAction");
    static final String[] a = {"display_name", "data1", "data2", "data3", "photo_thumb_uri"};

    public mrd(mrg mrgVar, String str, String str2, GhIcon ghIcon, String str3) {
        super(new mqc(new ComponentName("CALL", mrgVar.f)), mrgVar, ghIcon, str, R.drawable.ic_logo_dialer_round, GhIcon.j(mkn.b));
        this.j = str2;
        this.k = str3;
    }

    private final gnb b(Context context, int i2) {
        gnb gnbVar = new gnb(context.getResources());
        String str = this.e;
        gnbVar.b(str, str);
        gnbVar.a = lfr.b().a(i2);
        return gnbVar;
    }

    @Override // defpackage.mqz
    public final void c() {
        yph yphVar = i;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(5214);
        mrg mrgVar = this.h;
        ypeVar.y("Calling contact: %s", (mrgVar.c == 3 ? (mre) mrgVar.d : mre.a).c);
        if (ebf.A().i().isEmpty()) {
            ebf.A().p(this.j);
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uW).l());
            obs.a().g(mki.a.c, mkn.s, mki.a.c.getString(R.string.call_shortcut_action, this.e), 1);
        } else {
            ((ype) ((ype) yphVar.g()).ai((char) 5215)).u("there is already an active call, ignoring");
            obs.a().f(mki.a.c, mkn.s, R.string.new_call_blocked_by_ongoing, 1);
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.va).l());
        }
    }

    @Override // defpackage.mqz
    public final Drawable g(Context context, int i2) {
        GhIcon ghIcon = this.d;
        Drawable drawableF = ghIcon.b != 8 ? ghIcon.f(context, i2) : null;
        if (drawableF != null) {
            Bitmap bitmap = ((BitmapDrawable) drawableF).getBitmap();
            int width = bitmap.getWidth();
            Bitmap bitmapE = kfl.e(bitmap, lfr.b().a(width), width);
            if (bitmapE != null) {
                return new BitmapDrawable(context.getResources(), bitmapE);
            }
        }
        return new BitmapDrawable(context.getResources(), b(context, i2).a(i2));
    }

    @Override // defpackage.mqz
    public final CarIcon h(Context context, int i2, boolean z) {
        BitmapDrawable bitmapDrawable;
        GhIcon ghIcon = this.d;
        if (ghIcon.b != 8 && (bitmapDrawable = (BitmapDrawable) ghIcon.f(context, i2)) != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int width = bitmap.getWidth();
            Bitmap bitmapE = kfl.e(bitmap, lfr.b().a(width), width);
            if (bitmapE != null) {
                return new CarIcon(new tj(IconCompat.k(bitmapE)));
            }
        }
        return new CarIcon(new tj(IconCompat.k(b(context, i2).a(i2))));
    }

    @Override // defpackage.mqz
    public final String i() {
        if (this.b) {
            String str = this.k;
            if (!TextUtils.isEmpty(str)) {
                return this.e + " (" + str + ")";
            }
        }
        return this.e;
    }
}
