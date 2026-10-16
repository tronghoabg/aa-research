package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class lgi {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.GhIconKt");

    public static final long a(Drawable drawable) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (acxa.aG()) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= BitmapDescriptorFactory.HUE_RED || intrinsicHeight <= BitmapDescriptorFactory.HUE_RED) {
                return 9205357640488583168L;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(intrinsicWidth);
            iFloatToRawIntBits = Float.floatToRawIntBits(intrinsicHeight);
        } else {
            float intrinsicWidth2 = drawable.getIntrinsicWidth();
            float intrinsicHeight2 = drawable.getIntrinsicHeight();
            jFloatToRawIntBits = Float.floatToRawIntBits(intrinsicWidth2);
            iFloatToRawIntBits = Float.floatToRawIntBits(intrinsicHeight2);
        }
        return (4294967295L & iFloatToRawIntBits) | (jFloatToRawIntBits << 32);
    }

    public static final Resources b(Context context, String str) throws PackageManager.NameNotFoundException {
        if (afyh.v(str)) {
            return context.getResources();
        }
        if (affa.f(str, context.getPackageName())) {
            return context.getResources();
        }
        if (affa.f("android", str)) {
            return Resources.getSystem();
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
                applicationInfo.getClass();
                return context.getPackageManager().getResourcesForApplication(applicationInfo, context.getResources().getConfiguration());
            }
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            resourcesForApplication.updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
            return resourcesForApplication;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = String.format("Unable to find pkg=%s", Arrays.copyOf(new Object[]{str}, 1));
            str2.getClass();
            Log.e("GH.GhIcon", str2, e);
            return null;
        }
    }

    public static final cmw c(GhIcon ghIcon, boolean z, float f, cmw cmwVar, cmw cmwVar2, bux buxVar, int i) throws PackageManager.NameNotFoundException, FileNotFoundException {
        int i2 = i >> 3;
        int i3 = (i & 14) | (i2 & 112);
        boolean z2 = true;
        if (z) {
            buxVar.v(569878288);
            int i4 = i3 | sk.AUDIO_CONTENT_BUFFER_SIZE | (i2 & 896) | 4096;
            Context context = (Context) buxVar.f(daa.b);
            int i5 = (i2 & 7168) | i4;
            boolean zE = ((((i5 & 112) ^ 48) > 32 && buxVar.z(f)) || (i5 & 48) == 32) | buxVar.E(context) | ((((i5 & 14) ^ 6) > 4 && buxVar.C(ghIcon)) || (i5 & 6) == 4);
            if (!buxVar.E(cmwVar2) && (i5 & 3072) != 2048) {
                z2 = false;
            }
            boolean z3 = zE | z2;
            bvv bvvVar = (bvv) buxVar;
            Object objS = bvvVar.S();
            if (z3 || objS == buw.a) {
                lgg lggVar = new lgg(f, context, ghIcon, cmwVar2, null);
                bvvVar.ad(lggVar);
                objS = lggVar;
            }
            cmw cmwVar3 = (cmw) byx.g(cmwVar, ghIcon, (afeg) objS, buxVar).a();
            bvvVar.Y(false);
            return cmwVar3;
        }
        buxVar.v(569952037);
        Context context2 = (Context) buxVar.f(daa.b);
        int i6 = i3 | sk.AUDIO_CONTENT_BUFFER_SIZE | ((i >> 6) & 896);
        boolean z4 = (((i6 & 14) ^ 6) > 4 && buxVar.C(ghIcon)) || (i6 & 6) == 4;
        if ((((i6 & 112) ^ 48) <= 32 || !buxVar.z(f)) && (i6 & 48) != 32) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        bvv bvvVar2 = (bvv) buxVar;
        Object objS2 = bvvVar2.S();
        if (z5 || objS2 == buw.a) {
            Drawable drawableF = ghIcon.f(context2, Float.isNaN(f) ? -1 : afgi.k(dlf.w(context2).eA(f)));
            cmw lgeVar = drawableF == null ? cmwVar2 : new lge(drawableF);
            bvvVar2.ad(lgeVar);
            objS2 = lgeVar;
        }
        cmw cmwVar4 = (cmw) objS2;
        bvvVar2.Y(false);
        return cmwVar4;
    }

    public static final void d(ImageView imageView, GhIcon ghIcon, boolean z, boolean z2, boolean z3) {
        imageView.getClass();
        imageView.setTag(R.id.tag_gh_icon, ghIcon);
        if (ghIcon.b == 2 && affa.f(ghIcon.s(), imageView.getContext().getPackageName()) && !z3) {
            imageView.setImageResource(ghIcon.a());
            if (z2 && ghIcon.t()) {
                imageView.setImageTintList(ghIcon.d(imageView.getContext()));
                imageView.setImageTintMode(ghIcon.e);
                return;
            }
            return;
        }
        if (imageView.isLaidOut()) {
            e(imageView, ghIcon, imageView.getWidth(), z3);
        } else if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
            imageView.addOnLayoutChangeListener(new lgh(imageView, z3));
        } else {
            Object tag = imageView.getTag(R.id.tag_gh_icon);
            e(imageView, tag instanceof GhIcon ? (GhIcon) tag : null, imageView.getWidth(), z3);
        }
    }

    public static final void e(ImageView imageView, GhIcon ghIcon, int i, boolean z) {
        BitmapDrawable bitmapDrawable = null;
        Drawable drawableF = ghIcon != null ? ghIcon.f(imageView.getContext(), i) : null;
        if (drawableF == null) {
            imageView.setImageDrawable(null);
            return;
        }
        if (z && ghIcon.b == 1) {
            Context context = imageView.getContext();
            context.getClass();
            Bitmap bitmapE = i != -1 ? dti.e(drawableF, i, i, 4) : dti.e(drawableF, 0, 0, 7);
            Bitmap bitmapE2 = kfl.e(bitmapE, lfr.a.a().a(bitmapE.getWidth()), bitmapE.getWidth());
            if (bitmapE2 != null) {
                Resources resources = context.getResources();
                resources.getClass();
                bitmapDrawable = new BitmapDrawable(resources, bitmapE2);
            }
            drawableF = bitmapDrawable;
        }
        imageView.setImageDrawable(drawableF);
    }

    public static final cmw f(GhIcon ghIcon, float f, bux buxVar, int i) {
        ghIcon.getClass();
        cmw cmwVarG = null;
        cmv cmvVar = (i & 1) != 0 ? new cmv(0L) : null;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        Context context = (Context) buxVar.f(daa.b);
        int i2 = ghIcon.b;
        if (i2 == 1) {
            buxVar.v(1332709630);
            buxVar.o();
            Bitmap bitmapE = ghIcon.e();
            bitmapE.getClass();
            return new cmu(new cjj(bitmapE));
        }
        if (i2 != 2) {
            if (i2 == 8) {
                buxVar.v(1332707864);
                buxVar.o();
                return new cmv(0L);
            }
            buxVar.v(1332716105);
            cmw cmwVarH = h(ghIcon, f, context, cmvVar, buxVar);
            buxVar.o();
            return cmwVarH;
        }
        buxVar.v(-1635603376);
        Resources resourcesB = b(context, ghIcon.s());
        if (resourcesB == null) {
            buxVar.v(-1635561961);
        } else {
            buxVar.v(-1635561960);
            Resources.Theme theme = context.getTheme();
            theme.getClass();
            cmwVarG = g(theme, resourcesB, ghIcon.a(), buxVar);
        }
        buxVar.o();
        if (cmwVarG == null) {
            buxVar.v(1332715177);
            cmwVarG = h(ghIcon, f, context, cmvVar, buxVar);
        } else {
            buxVar.v(1332711922);
        }
        buxVar.o();
        buxVar.o();
        return cmwVarG;
    }

    public static final cmw g(Resources.Theme theme, Resources resources, int i, bux buxVar) throws Exception {
        Object objE;
        cmw cmwVarD;
        buxVar.v(1894731347);
        Object objG = buxVar.g();
        if (objG == buw.a) {
            objG = new TypedValue();
            buxVar.x(objG);
        }
        TypedValue typedValue = (TypedValue) objG;
        try {
            resources.getValue(i, typedValue, true);
            boolean zC = buxVar.C(resources) | buxVar.A(i);
            Object objG2 = buxVar.g();
            if (zC || objG2 == buw.a) {
                Drawable drawable = resources.getDrawable(i, null);
                ColorDrawable colorDrawable = drawable instanceof ColorDrawable ? (ColorDrawable) drawable : null;
                objG2 = colorDrawable != null ? new cmv(cjn.i(colorDrawable.getColor())) : null;
                buxVar.x(objG2);
            }
            cmv cmvVar = (cmv) objG2;
            if (cmvVar != null) {
                buxVar.o();
                return cmvVar;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !afyh.C(charSequence, ".xml")) {
                buxVar.v(1482630345);
                boolean zC2 = buxVar.C(theme) | buxVar.C(charSequence) | buxVar.A(i);
                Object objG3 = buxVar.g();
                if (zC2 || objG3 == buw.a) {
                    if (acxa.am()) {
                        try {
                            objE = vh.e(resources, i);
                        } catch (ClassCastException e) {
                            ((ype) b.h()).y("Exception while loading bitmap resource %s", e.toString());
                            objG3 = null;
                        }
                    } else {
                        objE = vh.e(resources, i);
                    }
                    objG3 = objE;
                    buxVar.x(objG3);
                }
                cjj cjjVar = (cjj) objG3;
                cmu cmuVar = cjjVar != null ? new cmu(cjjVar) : null;
                buxVar.o();
                cmwVarD = cmuVar;
            } else {
                buxVar.v(1481993295);
                try {
                    cmwVarD = czz.D(dap.g(theme, resources, i), buxVar);
                    buxVar.o();
                } catch (Exception e2) {
                    if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof UnsupportedOperationException) && !(e2 instanceof XmlPullParserException)) {
                        throw e2;
                    }
                    ((ype) ((ype) b.g()).l(1, TimeUnit.MINUTES)).y("Exception while loading vector resource %s", e2.toString());
                    buxVar.o();
                    buxVar.o();
                    return null;
                }
            }
            buxVar.o();
            return cmwVarD;
        } catch (Resources.NotFoundException e3) {
            String str = String.format("Unable to load resource 0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            str.getClass();
            Log.e("GH.GhIcon", str, e3);
        }
    }

    private static final cmw h(GhIcon ghIcon, float f, Context context, cmw cmwVar, bux buxVar) throws PackageManager.NameNotFoundException, FileNotFoundException {
        boolean zC = buxVar.C(ghIcon) | buxVar.z(f);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            Drawable drawableF = ghIcon.f(context, Float.isNaN(f) ? -1 : afgi.k(dlf.w(context).eA(f)));
            if (drawableF != null) {
                cmwVar = new lgd(drawableF);
            }
            buxVar.x(cmwVar);
            objG = cmwVar;
        }
        return (cmw) objG;
    }
}
