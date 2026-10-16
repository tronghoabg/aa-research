package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.InsetDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public final class omu {
    private static final yph a = yph.c("GH.MediaPlaybackHelper");
    private static final ygr b = ygr.t(0, 1, 2, 6, 7, 8, 9, 10, 11);

    public omu() {
        leh.a();
    }

    public static int a(AaPlaybackState aaPlaybackState) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - aaPlaybackState.T();
        float fO = aaPlaybackState.O();
        if (true == b.contains(Integer.valueOf(aaPlaybackState.Q()))) {
            fO = BitmapDescriptorFactory.HUE_RED;
        }
        if (acrz.s() && aaPlaybackState.U() == -1) {
            return 0;
        }
        return Math.max(0, (int) (((long) (jElapsedRealtime * fO)) + aaPlaybackState.U()));
    }

    public static Bitmap b(Bitmap bitmap) {
        return (bitmap.getWidth() <= 128 || bitmap.getHeight() <= 128) ? bitmap : Bitmap.createScaledBitmap(bitmap, 128, 128, false);
    }

    public static omw c(AaPlaybackState aaPlaybackState, lmd lmdVar) {
        int iQ = aaPlaybackState == null ? 0 : aaPlaybackState.Q();
        if (iQ == 7) {
            return omw.c;
        }
        if (iQ != 0) {
            loe loeVar = lof.a;
            if (!loe.b(lmdVar)) {
                return omw.b;
            }
        }
        return omw.a;
    }

    public static String d(long j) {
        woy.O(j >= 0, "Cannot pass in a negative number");
        long j2 = j / 1000;
        long j3 = j2 / 60;
        long j4 = j3 / 60;
        String string = Long.toString(j4);
        String string2 = Long.toString(j3 % 60);
        String string3 = Long.toString(j2 % 60);
        if (j4 > 0 && string2.length() == 1) {
            string2 = CloudRecognizerProtocolStrings.DBG_VALUE.concat(String.valueOf(string2));
        }
        if (string3.length() == 1) {
            string3 = CloudRecognizerProtocolStrings.DBG_VALUE.concat(String.valueOf(string3));
        }
        StringBuilder sb = new StringBuilder();
        if (j4 > 0) {
            sb.append(string);
            sb.append(":");
        }
        sb.append(string2);
        sb.append(":");
        sb.append(string3);
        return sb.toString();
    }

    public static boolean i(AaPlaybackState aaPlaybackState, lmd lmdVar) {
        if (aaPlaybackState == null || lmdVar == null) {
            return true;
        }
        return lmdVar.O("android.media.metadata.DURATION") >= 0 && aaPlaybackState.U() != -1;
    }

    public static boolean k(AaPlaybackState aaPlaybackState, lmd lmdVar) {
        return c(aaPlaybackState, lmdVar) == omw.b;
    }

    public static boolean l(ljv ljvVar, String str, String str2) {
        boolean zI = ljvVar.i(str);
        boolean zI2 = ljvVar.i(str2);
        if (zI2) {
            ljvVar.a();
        }
        return zI || zI2;
    }

    @ResultIgnorabilityUnspecified
    static final void n(ImageButton imageButton, String str, int i, Resources resources, AaPlaybackState.AaCustomAction aaCustomAction) {
        if (resources == null) {
            ((ype) ((ype) a.g()).ai((char) 6019)).u("Resources is null. Icons will not show up.");
            imageButton.setImageDrawable(null);
            return;
        }
        omh omhVar = (omh) imageButton.getTag();
        imageButton.setTag(new omh(str, i, aaCustomAction));
        if (omhVar != null && Objects.equals(omhVar.b, str) && omhVar.a == i) {
            return;
        }
        Resources resources2 = imageButton.getResources();
        resources.updateConfiguration(resources2.getConfiguration(), resources2.getDisplayMetrics());
        try {
            imageButton.setImageDrawable(new InsetDrawable(resources.getDrawable(i, null), resources2.getDimensionPixelSize(R.dimen.music_action_icon_inset)));
        } catch (Resources.NotFoundException unused) {
            ((ype) ((ype) a.h()).ai((char) 6018)).w("Resource not found: %d", i);
            imageButton.setImageDrawable(null);
        }
    }

    public final void e(ljv ljvVar, yzz yzzVar, AaPlaybackState.AaCustomAction aaCustomAction) {
        if (j(ljvVar)) {
            ljvVar.j().d(yzzVar).f(aaCustomAction, aaCustomAction.n());
        }
    }

    public final void f(ljv ljvVar, yzz yzzVar) {
        if (j(ljvVar)) {
            ljvVar.j().d(yzzVar).g();
        }
    }

    public final void g(ljv ljvVar, yzz yzzVar) {
        if (j(ljvVar)) {
            ljvVar.j().d(yzzVar).h();
        }
    }

    public final void h(ljv ljvVar, yzz yzzVar) {
        AaPlaybackState aaPlaybackStateC = ljvVar.c();
        if (j(ljvVar)) {
            lkc lkcVarD = ljvVar.j().d(yzzVar);
            long jR = aaPlaybackStateC.R();
            if (aaPlaybackStateC.Q() != 3 && aaPlaybackStateC.Q() != 6) {
                lkcVarD.c();
                return;
            }
            if ((2 & jR) != 0 || (512 & jR) != 0) {
                lkcVarD.b();
            } else if ((jR & 1) != 0) {
                lkcVarD.i();
            }
        }
    }

    public final boolean j(ljv ljvVar) {
        return (ljvVar == null || !ljvVar.h() || ljvVar.j() == null || ljvVar.c() == null) ? false : true;
    }

    public final void m(ImageButton imageButton, int i, boolean z, boolean z2, List list, ljv ljvVar, View.OnClickListener onClickListener) {
        if (z2 || z) {
            n(imageButton, "com.google.android.projection.gearhead", i, imageButton.getResources(), null);
            imageButton.setVisibility(true == z2 ? 0 : 4);
        } else {
            if (list.isEmpty()) {
                imageButton.setVisibility(4);
                return;
            }
            AaPlaybackState.AaCustomAction aaCustomAction = (AaPlaybackState.AaCustomAction) list.remove(0);
            imageButton.setOnClickListener(onClickListener);
            n(imageButton, ljvVar.a().b, aaCustomAction.O(), ljvVar.a().g, aaCustomAction);
            imageButton.setVisibility(0);
        }
    }
}
