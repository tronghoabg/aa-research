package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.wynauto.wyn.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import x.AbstractC4416i;
import x.C4415h;
import x.C4429v;
import x.C4430w;
import y.AbstractC4517a;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: i, reason: collision with root package name */
    public static O0 f43686i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f43688a;

    /* renamed from: b, reason: collision with root package name */
    public C4429v f43689b;

    /* renamed from: c, reason: collision with root package name */
    public C4430w f43690c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f43691d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f43692e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43693f;

    /* renamed from: g, reason: collision with root package name */
    public C6.l f43694g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f43685h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final M0 f43687j = new M0(6);

    public static synchronized O0 d() {
        try {
            if (f43686i == null) {
                O0 o02 = new O0();
                f43686i = o02;
                j(o02);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f43686i;
    }

    public static synchronized PorterDuffColorFilter h(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        M0 m02 = f43687j;
        m02.getClass();
        int i10 = (31 + i5) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) m02.get(Integer.valueOf(mode.hashCode() + i10));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i5, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(O0 o02) {
        if (Build.VERSION.SDK_INT < 24) {
            o02.a("vector", new N0(3));
            o02.a("animated-vector", new N0(2));
            o02.a("animated-selector", new N0(1));
            o02.a("drawable", new N0(0));
        }
    }

    public final void a(String str, N0 n02) {
        if (this.f43689b == null) {
            this.f43689b = new C4429v(0);
        }
        this.f43689b.put(str, n02);
    }

    public final synchronized void b(Context context, long j8, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C4415h c4415h = (C4415h) this.f43691d.get(context);
                if (c4415h == null) {
                    c4415h = new C4415h();
                    this.f43691d.put(context, c4415h);
                }
                c4415h.g(j8, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i5) throws Resources.NotFoundException {
        if (this.f43692e == null) {
            this.f43692e = new TypedValue();
        }
        TypedValue typedValue = this.f43692e;
        context.getResources().getValue(i5, typedValue, true);
        long j8 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j8);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableS = null;
        if (this.f43694g != null) {
            if (i5 == R.drawable.abc_cab_background_top_material) {
                layerDrawableS = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131230787)});
            } else if (i5 == R.drawable.abc_ratingbar_material) {
                layerDrawableS = C6.l.s(this, context, R.dimen.abc_star_big);
            } else if (i5 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableS = C6.l.s(this, context, R.dimen.abc_star_medium);
            } else if (i5 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableS = C6.l.s(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableS != null) {
            layerDrawableS.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j8, layerDrawableS);
        }
        return layerDrawableS;
    }

    public final synchronized Drawable e(Context context, long j8) {
        C4415h c4415h = (C4415h) this.f43691d.get(context);
        if (c4415h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c4415h.d(j8);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = AbstractC4517a.b(c4415h.f47509b, c4415h.f47511d, j8);
            if (iB >= 0) {
                Object[] objArr = c4415h.f47510c;
                Object obj = objArr[iB];
                Object obj2 = AbstractC4416i.f47512a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    c4415h.f47508a = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i5) {
        return g(context, i5, false);
    }

    public final synchronized Drawable g(Context context, int i5, boolean z2) {
        Drawable drawableK;
        try {
            if (!this.f43693f) {
                this.f43693f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof u3.p) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f43693f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i5);
            if (drawableK == null) {
                drawableK = c(context, i5);
            }
            if (drawableK == null) {
                drawableK = Y0.e.getDrawable(context, i5);
            }
            if (drawableK != null) {
                drawableK = n(context, i5, z2, drawableK);
            }
            if (drawableK != null) {
                AbstractC3827n0.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i5) {
        ColorStateList colorStateList;
        C4430w c4430w;
        WeakHashMap weakHashMap = this.f43688a;
        ColorStateList colorStateListT = null;
        colorStateList = (weakHashMap == null || (c4430w = (C4430w) weakHashMap.get(context)) == null) ? null : (ColorStateList) c4430w.c(i5);
        if (colorStateList == null) {
            C6.l lVar = this.f43694g;
            if (lVar != null) {
                colorStateListT = lVar.t(context, i5);
            }
            if (colorStateListT != null) {
                if (this.f43688a == null) {
                    this.f43688a = new WeakHashMap();
                }
                C4430w c4430w2 = (C4430w) this.f43688a.get(context);
                if (c4430w2 == null) {
                    c4430w2 = new C4430w();
                    this.f43688a.put(context, c4430w2);
                }
                c4430w2.a(i5, colorStateListT);
            }
            colorStateList = colorStateListT;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i5) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        C4429v c4429v = this.f43689b;
        if (c4429v == null || c4429v.isEmpty()) {
            return null;
        }
        C4430w c4430w = this.f43690c;
        if (c4430w != null) {
            String str = (String) c4430w.c(i5);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f43689b.get(str) == null) {
                return null;
            }
        } else {
            this.f43690c = new C4430w();
        }
        if (this.f43692e == null) {
            this.f43692e = new TypedValue();
        }
        TypedValue typedValue = this.f43692e;
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        long j8 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable drawableE = e(context, j8);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i5);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f43690c.a(i5, name);
                N0 n02 = (N0) this.f43689b.get(name);
                if (n02 != null) {
                    drawableE = n02.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j8, drawableE);
                }
            } catch (Exception e7) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e7);
            }
        }
        if (drawableE == null) {
            this.f43690c.a(i5, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        C4415h c4415h = (C4415h) this.f43691d.get(context);
        if (c4415h != null) {
            c4415h.b();
        }
    }

    public final synchronized void m(C6.l lVar) {
        this.f43694g = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.O0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
