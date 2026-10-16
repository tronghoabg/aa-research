package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment;
import com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment;
import com.google.android.material.button.MaterialButton;
import j$.time.Duration;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final /* synthetic */ class mzg implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mzg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) throws PackageManager.NameNotFoundException, FileNotFoundException {
        int i;
        InsetDrawable insetDrawable;
        int i2 = 3;
        switch (this.b) {
            case 0:
                Duration duration = (Duration) obj;
                int i3 = MediaPlayerFragment.b;
                duration.getClass();
                ((ProgressBar) this.a).setProgress((int) duration.toMillis());
                return afak.a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i4 = MediaPlayerFragment.b;
                ((ProgressBar) this.a).setIndeterminate(zBooleanValue);
                return afak.a;
            case 2:
                CharSequence charSequence = (CharSequence) obj;
                int i5 = MediaPlayerFragment.b;
                charSequence.getClass();
                ((TextView) this.a).setText(charSequence);
                return afak.a;
            case 3:
                CharSequence charSequence2 = (CharSequence) obj;
                int i6 = MediaPlayerFragment.b;
                charSequence2.getClass();
                Object obj2 = this.a;
                ((TextView) obj2).setText(charSequence2);
                ((View) obj2).setVisibility(true != afyh.v(charSequence2) ? 0 : 8);
                return afak.a;
            case 4:
                i = true != ((Boolean) obj).booleanValue() ? 0 : 4;
                int i7 = MediaPlayerFragment.b;
                ((View) this.a).setVisibility(i);
                return afak.a;
            case 5:
                GhIcon ghIcon = (GhIcon) obj;
                int i8 = MediaPlayerFragment.b;
                if (ghIcon != null) {
                    lgi.d((ImageView) this.a, ghIcon, true, true, false);
                }
                return afak.a;
            case 6:
                ltg ltgVar = (ltg) obj;
                int i9 = MediaPlayerFragment.b;
                Object obj3 = this.a;
                if (ltgVar == null) {
                    ((MaterialButton) obj3).setVisibility(4);
                } else {
                    ((View) obj3).setVisibility(0);
                    MaterialButton materialButton = (MaterialButton) obj3;
                    materialButton.setEnabled(ltgVar.b);
                    int i10 = lgi.a;
                    GhIcon ghIcon2 = ltgVar.a;
                    if (ghIcon2.b == 2 && affa.f(ghIcon2.s(), materialButton.getContext().getPackageName())) {
                        materialButton.j(ghIcon2.a());
                        if (ghIcon2.t()) {
                            materialButton.k(ghIcon2.d(materialButton.getContext()));
                            PorterDuff.Mode mode = ghIcon2.e;
                            if (materialButton.f != mode) {
                                materialButton.f = mode;
                                materialButton.n(false);
                            }
                        }
                    } else {
                        Context context = materialButton.getContext();
                        int i11 = materialButton.h;
                        if (i11 == 0) {
                            i11 = -1;
                        }
                        Drawable drawableF = ghIcon2.f(context, i11);
                        if (drawableF != null && drawableF.getIntrinsicWidth() != 0 && drawableF.getIntrinsicHeight() != 0 && drawableF.getIntrinsicHeight() != drawableF.getIntrinsicWidth()) {
                            if (drawableF.getIntrinsicHeight() > drawableF.getIntrinsicWidth()) {
                                int intrinsicHeight = (drawableF.getIntrinsicHeight() - drawableF.getIntrinsicWidth()) / 2;
                                insetDrawable = new InsetDrawable(drawableF, intrinsicHeight, 0, intrinsicHeight, 0);
                            } else {
                                int intrinsicWidth = (drawableF.getIntrinsicWidth() - drawableF.getIntrinsicHeight()) / 2;
                                insetDrawable = new InsetDrawable(drawableF, 0, intrinsicWidth, 0, intrinsicWidth);
                            }
                            drawableF = insetDrawable;
                        }
                        materialButton.i(drawableF);
                    }
                    materialButton.setOnClickListener(new mli(ltgVar, 12));
                }
                return afak.a;
            case 7:
                abzy abzyVar = (abzy) obj;
                int i12 = MediaPlayerFragment.b;
                Object obj4 = this.a;
                if (abzyVar == null) {
                    ((ImageView) obj4).setImageTintList(null);
                } else {
                    ImageView imageView = (ImageView) obj4;
                    if (imageView.getImageTintList() == null) {
                        imageView.setImageTintList(thg.h(mcd.l(abzyVar)));
                    }
                }
                return afak.a;
            case 8:
                int i13 = true == ((Boolean) obj).booleanValue() ? 0 : 8;
                int i14 = MediaPlayerFragment.b;
                ((ProgressBar) this.a).setVisibility(i13);
                return afak.a;
            case 9:
                Integer num = (Integer) obj;
                int i15 = mzs.b;
                num.getClass();
                ((TextView) this.a).setText(num.intValue());
                return afak.a;
            case 10:
                int i16 = mzs.b;
                ((TextView) this.a).setText((String) obj);
                return afak.a;
            case 11:
                Drawable drawable = (Drawable) obj;
                int i17 = mzs.b;
                if (drawable != null) {
                    ((ImageView) this.a).setImageDrawable(drawable);
                }
                return afak.a;
            case 12:
                i = true != ((Boolean) obj).booleanValue() ? 0 : 4;
                int i18 = mzs.b;
                ((View) this.a).setVisibility(i);
                return afak.a;
            case 13:
                Drawable drawable2 = (Drawable) obj;
                int i19 = mzu.b;
                if (drawable2 != null) {
                    ((ImageView) this.a).setImageDrawable(drawable2);
                }
                return afak.a;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i20 = mzu.b;
                Object obj5 = this.a;
                obj5.getClass();
                ((View) obj5).setVisibility(true != zBooleanValue2 ? 0 : 4);
                return afak.a;
            case 15:
                ComponentName componentName = (ComponentName) obj;
                componentName.getClass();
                boolean zF = affa.f(componentName, mkn.G);
                Object obj6 = this.a;
                return zF ? new nbg((eqj) obj6) : new myw((eqj) obj6);
            case 16:
                aezu aezuVar = (aezu) obj;
                aezuVar.getClass();
                Bitmap bitmap = (Bitmap) aezuVar.a;
                if (bitmap != null) {
                    return dtx.p((1 & 1) != 0 ? afcp.a : null, (1 & 2) != 0 ? 5000L : 0L, new dxb((mzy) this.a, bitmap, (afck) null, 3));
                }
                afco afcoVar = tby.a;
                return new eqm(null);
            case 17:
                ((byd) this.a).h(((Integer) obj).intValue());
                return afak.a;
            case 18:
                ((byd) this.a).h(((Integer) obj).intValue());
                return afak.a;
            case 19:
                nap napVar = (nap) obj;
                yph yphVar = MediaSuggestionFragment.a;
                ((ViewAnimator) this.a).setDisplayedChild(napVar.ordinal());
                if (napVar == nap.b) {
                    mwc.a(yzy.Hn, null);
                } else if (napVar == nap.c) {
                    mwc.a(yzy.Ho, null);
                }
                return afak.a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    return tby.v(((nao) this.a).a, new nag(i2));
                }
                afbe afbeVar = afbe.a;
                afco afcoVar2 = tby.a;
                return new eqm(afbeVar);
        }
    }
}
