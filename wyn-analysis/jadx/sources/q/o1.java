package q;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class o1 implements InterfaceC3819j0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f43850a;

    /* renamed from: b, reason: collision with root package name */
    public int f43851b;

    /* renamed from: c, reason: collision with root package name */
    public View f43852c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f43853d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f43854e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f43855f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43856g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f43857h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f43858i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f43859j;
    public Window.Callback k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f43860l;

    /* renamed from: m, reason: collision with root package name */
    public C3816i f43861m;

    /* renamed from: n, reason: collision with root package name */
    public int f43862n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f43863o;

    public final void a(int i5) {
        View view;
        int i10 = this.f43851b ^ i5;
        this.f43851b = i5;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i5 & 4) != 0) {
                    b();
                }
                int i11 = this.f43851b & 4;
                Toolbar toolbar = this.f43850a;
                if (i11 != 0) {
                    Drawable drawable = this.f43855f;
                    if (drawable == null) {
                        drawable = this.f43863o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            int i12 = i10 & 8;
            Toolbar toolbar2 = this.f43850a;
            if (i12 != 0) {
                if ((i5 & 8) != 0) {
                    toolbar2.setTitle(this.f43857h);
                    toolbar2.setSubtitle(this.f43858i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f43852c) == null) {
                return;
            }
            if ((i5 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f43851b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f43859j);
            Toolbar toolbar = this.f43850a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f43862n);
            } else {
                toolbar.setNavigationContentDescription(this.f43859j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i5 = this.f43851b;
        if ((i5 & 2) == 0) {
            drawable = null;
        } else if ((i5 & 1) == 0 || (drawable = this.f43854e) == null) {
            drawable = this.f43853d;
        }
        this.f43850a.setLogo(drawable);
    }
}
