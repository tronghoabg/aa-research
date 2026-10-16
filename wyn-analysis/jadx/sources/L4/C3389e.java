package l4;

import A7.AbstractC0279p0;
import a2.v;
import a9.C1342b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.ads.nativead.l;
import com.wynauto.wyn.R;
import hc.C2815a;
import java.text.NumberFormat;
import n4.AbstractC3593a;
import vf.AbstractC4345a;

/* renamed from: l4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3389e {

    /* renamed from: A, reason: collision with root package name */
    public int f39956A;

    /* renamed from: B, reason: collision with root package name */
    public int f39957B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f39958C;

    /* renamed from: D, reason: collision with root package name */
    public C2815a f39959D;

    /* renamed from: E, reason: collision with root package name */
    public int f39960E;

    /* renamed from: a, reason: collision with root package name */
    public final Context f39961a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f39962b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3388d f39963c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC3388d f39964d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC3388d f39965e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC3388d f39966f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC3388d f39967g;

    /* renamed from: h, reason: collision with root package name */
    public final int f39968h;

    /* renamed from: i, reason: collision with root package name */
    public int f39969i;

    /* renamed from: j, reason: collision with root package name */
    public int f39970j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public String f39971l;

    /* renamed from: m, reason: collision with root package name */
    public View f39972m;

    /* renamed from: n, reason: collision with root package name */
    public int f39973n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f39974o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f39975p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f39976q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorStateList f39977r;

    /* renamed from: s, reason: collision with root package name */
    public v f39978s;

    /* renamed from: t, reason: collision with root package name */
    public l f39979t;

    /* renamed from: u, reason: collision with root package name */
    public int f39980u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f39981v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f39982w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f39983x;

    /* renamed from: y, reason: collision with root package name */
    public C3386b f39984y;

    /* renamed from: z, reason: collision with root package name */
    public LinearLayoutManager f39985z;

    public C3389e(Context context) {
        EnumC3388d enumC3388d = EnumC3388d.f39952a;
        this.f39963c = enumC3388d;
        this.f39964d = enumC3388d;
        EnumC3388d enumC3388d2 = EnumC3388d.f39954c;
        this.f39965e = enumC3388d2;
        this.f39966f = enumC3388d;
        this.f39967g = enumC3388d;
        this.f39968h = 0;
        this.f39969i = -1;
        this.f39970j = -1;
        this.f39960E = 1;
        this.f39980u = -1;
        this.f39961a = context;
        int iD = AbstractC4345a.D(context, R.attr.colorAccent, Y0.e.getColor(context, R.color.md_material_blue_600));
        this.f39973n = iD;
        int iD2 = AbstractC4345a.D(context, android.R.attr.colorAccent, iD);
        this.f39973n = iD2;
        this.f39974o = AbstractC4345a.t(context, iD2);
        this.f39975p = AbstractC4345a.t(context, this.f39973n);
        this.f39976q = AbstractC4345a.t(context, this.f39973n);
        this.f39977r = AbstractC4345a.t(context, AbstractC4345a.D(context, R.attr.md_link_color, this.f39973n));
        this.f39968h = AbstractC4345a.D(context, R.attr.md_btn_ripple_color, AbstractC4345a.D(context, R.attr.colorControlHighlight, AbstractC4345a.D(context, android.R.attr.colorControlHighlight, 0)));
        NumberFormat.getPercentInstance();
        this.f39960E = AbstractC4345a.y(AbstractC4345a.D(context, android.R.attr.textColorPrimary, 0)) ? 1 : 2;
        if (C1342b.i(false) != null) {
            C1342b.i(true).getClass();
            this.f39963c = enumC3388d;
            this.f39964d = enumC3388d;
            this.f39965e = enumC3388d2;
            this.f39966f = enumC3388d;
            this.f39967g = enumC3388d;
        }
        this.f39963c = AbstractC4345a.F(context, R.attr.md_title_gravity, this.f39963c);
        this.f39964d = AbstractC4345a.F(context, R.attr.md_content_gravity, this.f39964d);
        this.f39965e = AbstractC4345a.F(context, R.attr.md_btnstacked_gravity, this.f39965e);
        this.f39966f = AbstractC4345a.F(context, R.attr.md_items_gravity, this.f39966f);
        this.f39967g = AbstractC4345a.F(context, R.attr.md_buttons_gravity, this.f39967g);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.md_medium_font, typedValue, true);
        String str = (String) typedValue.string;
        TypedValue typedValue2 = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.md_regular_font, typedValue2, true);
        try {
            a(str, (String) typedValue2.string);
        } catch (Throwable unused) {
        }
        if (this.f39982w == null) {
            try {
                this.f39982w = Typeface.create("sans-serif-medium", 0);
            } catch (Throwable unused2) {
                this.f39982w = Typeface.DEFAULT_BOLD;
            }
        }
        if (this.f39981v == null) {
            try {
                this.f39981v = Typeface.create("sans-serif", 0);
            } catch (Throwable unused3) {
                Typeface typeface = Typeface.SANS_SERIF;
                this.f39981v = typeface;
                if (typeface == null) {
                    this.f39981v = Typeface.DEFAULT;
                }
            }
        }
    }

    public final void a(String str, String str2) {
        Context context = this.f39961a;
        if (str != null && !str.trim().isEmpty()) {
            Typeface typefaceA = AbstractC3593a.a(context, str);
            this.f39982w = typefaceA;
            if (typefaceA == null) {
                throw new IllegalArgumentException(AbstractC0279p0.l("No font asset found for \"", str, "\""));
            }
        }
        if (str2 == null || str2.trim().isEmpty()) {
            return;
        }
        Typeface typefaceA2 = AbstractC3593a.a(context, str2);
        this.f39981v = typefaceA2;
        if (typefaceA2 == null) {
            throw new IllegalArgumentException(AbstractC0279p0.l("No font asset found for \"", str2, "\""));
        }
    }
}
