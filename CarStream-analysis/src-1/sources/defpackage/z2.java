package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.carstream.tech.R;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class z2 implements s8 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public z2(String str, String str2, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = strArr2;
    }

    public static void i(CookieManager cookieManager, String str, String str2, String str3) {
        String strConcat = str2.concat("=; Max-Age=0; Expires=Thu, 01 Jan 1970 00:00:00 GMT; Path=/");
        if (str3 != null) {
            strConcat = strConcat + "; Domain=" + str3;
        }
        cookieManager.setCookie(str, strConcat);
    }

    @Override // defpackage.s8
    public View a(cd cdVar, r8 r8Var) {
        Context context = (Context) this.a;
        this.b = r8Var;
        int i = cdVar.b == 2 ? 1 : 0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(i);
        linearLayout.setGravity(17);
        int iG = k1.g(context, i != 0 ? 8.0f : 12.0f);
        int iG2 = k1.g(context, i == 0 ? 8.0f : 12.0f);
        linearLayout.setPadding(iG, iG2, iG, iG2);
        GradientDrawable gradientDrawableT = k1.t(k1.h ? -652602608 : -218764584, k1.g(context, 999.0f));
        gradientDrawableT.setStroke(k1.g(context, 1.0f), 704247021);
        linearLayout.setBackground(gradientDrawableT);
        linearLayout.setElevation(k1.g(context, 10.0f));
        this.c = null;
        this.d = null;
        h(linearLayout, cdVar.c);
        h(linearLayout, cdVar.d);
        return linearLayout;
    }

    @Override // defpackage.s8
    public FrameLayout.LayoutParams b(cd cdVar) {
        Context context = (Context) this.a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (cdVar.b == 2) {
            layoutParams.gravity = 8388629;
            layoutParams.setMarginEnd(k1.g(context, 16.0f));
            return layoutParams;
        }
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = k1.g(context, 16.0f);
        return layoutParams;
    }

    @Override // defpackage.s8
    public void c(boolean z) {
        ImageView imageView = (ImageView) this.c;
        if (imageView != null) {
            imageView.setImageResource(z ? R.drawable.ic_pause : R.drawable.ic_play);
        }
    }

    @Override // defpackage.s8
    public void d(boolean z) {
        ImageView imageView = (ImageView) this.d;
        if (imageView != null) {
            imageView.setImageResource(z ? R.drawable.ic_fullscreen_exit : R.drawable.ic_fullscreen);
        }
    }

    public void h(LinearLayout linearLayout, bd[] bdVarArr) {
        for (bd bdVar : bdVarArr) {
            int i = bdVar.a;
            boolean z = i == 3;
            boolean z2 = i == 4;
            Context context = (Context) this.a;
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(bdVar.b);
            imageView.setColorFilter(z ? d8.k() : d8.o());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            k1.B(imageView, z ? d8.a() : 0, true, 0);
            imageView.setOnClickListener(new u0(1, this, bdVar));
            int iG = k1.g(context, 56.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iG, iG);
            int iG2 = k1.g(context, 3.0f);
            layoutParams.leftMargin = iG2;
            layoutParams.rightMargin = iG2;
            imageView.setLayoutParams(layoutParams);
            if (z) {
                this.c = imageView;
            }
            if (z2) {
                this.d = imageView;
            }
            linearLayout.addView(imageView);
        }
    }

    public boolean j() {
        for (String str : (String[]) this.d) {
            String cookie = CookieManager.getInstance().getCookie(str);
            if (cookie != null) {
                for (String str2 : cookie.split(";")) {
                    int iIndexOf = str2.indexOf(61);
                    if (iIndexOf > 0) {
                        String strTrim = str2.substring(0, iIndexOf).trim();
                        if (str2.substring(iIndexOf + 1).trim().length() < 24) {
                            continue;
                        } else {
                            for (String str3 : (String[]) this.c) {
                                if (str3.equals(strTrim)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String k() {
        return null;
    }

    public void l(f fVar) {
        CookieManager cookieManager = CookieManager.getInstance();
        for (String str : (String[]) this.d) {
            String cookie = cookieManager.getCookie(str);
            if (cookie != null) {
                String strReplaceFirst = str.replaceFirst("^https?://", "");
                if (!strReplaceFirst.startsWith(".")) {
                    strReplaceFirst = ad.g(".", strReplaceFirst.replaceFirst("^www\\.", ""));
                }
                for (String strSubstring : cookie.split(";")) {
                    int iIndexOf = strSubstring.indexOf(61);
                    if (iIndexOf > 0) {
                        strSubstring = strSubstring.substring(0, iIndexOf);
                    }
                    String strTrim = strSubstring.trim();
                    if (!strTrim.isEmpty()) {
                        i(cookieManager, str, strTrim, null);
                        i(cookieManager, str, strTrim, strReplaceFirst);
                    }
                }
            }
        }
        cookieManager.flush();
        new Handler(Looper.getMainLooper()).post(new f(fVar, 17));
    }

    public z2(Context context) {
        this.a = context;
    }

    @Override // defpackage.s8
    public void e(String str) {
    }

    @Override // defpackage.s8
    public void f(String str) {
    }

    @Override // defpackage.s8
    public void g(long j, long j2) {
    }
}
