package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import x.AbstractC4416i;
import x.C4415h;
import x.C4430w;
import y.AbstractC4517a;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39782A;

    /* renamed from: B, reason: collision with root package name */
    public ColorFilter f39783B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39784C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f39785D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f39786E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f39787F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f39788G;

    /* renamed from: H, reason: collision with root package name */
    public int[][] f39789H;

    /* renamed from: I, reason: collision with root package name */
    public C4415h f39790I;

    /* renamed from: J, reason: collision with root package name */
    public C4430w f39791J;

    /* renamed from: a, reason: collision with root package name */
    public final e f39792a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f39793b;

    /* renamed from: c, reason: collision with root package name */
    public int f39794c;

    /* renamed from: d, reason: collision with root package name */
    public int f39795d;

    /* renamed from: e, reason: collision with root package name */
    public int f39796e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f39797f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f39798g;

    /* renamed from: h, reason: collision with root package name */
    public int f39799h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39800i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39801j;
    public Rect k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39802l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39803m;

    /* renamed from: n, reason: collision with root package name */
    public int f39804n;

    /* renamed from: o, reason: collision with root package name */
    public int f39805o;

    /* renamed from: p, reason: collision with root package name */
    public int f39806p;

    /* renamed from: q, reason: collision with root package name */
    public int f39807q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f39808r;

    /* renamed from: s, reason: collision with root package name */
    public int f39809s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f39810t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39811u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39812v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39813w;

    /* renamed from: x, reason: collision with root package name */
    public int f39814x;

    /* renamed from: y, reason: collision with root package name */
    public int f39815y;

    /* renamed from: z, reason: collision with root package name */
    public int f39816z;

    public b(b bVar, e eVar, Resources resources) {
        this.f39800i = false;
        this.f39802l = false;
        this.f39813w = true;
        this.f39815y = 0;
        this.f39816z = 0;
        this.f39792a = eVar;
        this.f39793b = resources != null ? resources : bVar != null ? bVar.f39793b : null;
        int i5 = bVar != null ? bVar.f39794c : 0;
        int i10 = e.f39821t;
        i5 = resources != null ? resources.getDisplayMetrics().densityDpi : i5;
        i5 = i5 == 0 ? 160 : i5;
        this.f39794c = i5;
        if (bVar != null) {
            this.f39795d = bVar.f39795d;
            this.f39796e = bVar.f39796e;
            this.f39811u = true;
            this.f39812v = true;
            this.f39800i = bVar.f39800i;
            this.f39802l = bVar.f39802l;
            this.f39813w = bVar.f39813w;
            this.f39814x = bVar.f39814x;
            this.f39815y = bVar.f39815y;
            this.f39816z = bVar.f39816z;
            this.f39782A = bVar.f39782A;
            this.f39783B = bVar.f39783B;
            this.f39784C = bVar.f39784C;
            this.f39785D = bVar.f39785D;
            this.f39786E = bVar.f39786E;
            this.f39787F = bVar.f39787F;
            this.f39788G = bVar.f39788G;
            if (bVar.f39794c == i5) {
                if (bVar.f39801j) {
                    this.k = bVar.k != null ? new Rect(bVar.k) : null;
                    this.f39801j = true;
                }
                if (bVar.f39803m) {
                    this.f39804n = bVar.f39804n;
                    this.f39805o = bVar.f39805o;
                    this.f39806p = bVar.f39806p;
                    this.f39807q = bVar.f39807q;
                    this.f39803m = true;
                }
            }
            if (bVar.f39808r) {
                this.f39809s = bVar.f39809s;
                this.f39808r = true;
            }
            if (bVar.f39810t) {
                this.f39810t = true;
            }
            Drawable[] drawableArr = bVar.f39798g;
            this.f39798g = new Drawable[drawableArr.length];
            this.f39799h = bVar.f39799h;
            SparseArray sparseArray = bVar.f39797f;
            if (sparseArray != null) {
                this.f39797f = sparseArray.clone();
            } else {
                this.f39797f = new SparseArray(this.f39799h);
            }
            int i11 = this.f39799h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f39797f.put(i12, constantState);
                    } else {
                        this.f39798g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f39798g = new Drawable[10];
            this.f39799h = 0;
        }
        if (bVar != null) {
            this.f39789H = bVar.f39789H;
        } else {
            this.f39789H = new int[this.f39798g.length][];
        }
        if (bVar != null) {
            this.f39790I = bVar.f39790I;
            this.f39791J = bVar.f39791J;
        } else {
            this.f39790I = new C4415h();
            this.f39791J = new C4430w();
        }
    }

    public final int a(Drawable drawable) {
        int i5 = this.f39799h;
        if (i5 >= this.f39798g.length) {
            int i10 = i5 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f39798g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i5);
            }
            this.f39798g = drawableArr;
            int[][] iArr = new int[i10][];
            System.arraycopy(this.f39789H, 0, iArr, 0, i5);
            this.f39789H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f39792a);
        this.f39798g[i5] = drawable;
        this.f39799h++;
        this.f39796e = drawable.getChangingConfigurations() | this.f39796e;
        this.f39808r = false;
        this.f39810t = false;
        this.k = null;
        this.f39801j = false;
        this.f39803m = false;
        this.f39811u = false;
        return i5;
    }

    public final void b() {
        this.f39803m = true;
        c();
        int i5 = this.f39799h;
        Drawable[] drawableArr = this.f39798g;
        this.f39805o = -1;
        this.f39804n = -1;
        this.f39807q = 0;
        this.f39806p = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f39804n) {
                this.f39804n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f39805o) {
                this.f39805o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f39806p) {
                this.f39806p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f39807q) {
                this.f39807q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f39797f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = this.f39797f.keyAt(i5);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f39797f.valueAt(i5);
                Drawable[] drawableArr = this.f39798g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f39793b);
                drawableNewDrawable.setLayoutDirection(this.f39814x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f39792a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f39797f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i5 = this.f39799h;
        Drawable[] drawableArr = this.f39798g;
        for (int i10 = 0; i10 < i5; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f39797f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i5) {
        int iIndexOfKey;
        Drawable drawable = this.f39798g[i5];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f39797f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i5)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f39797f.valueAt(iIndexOfKey)).newDrawable(this.f39793b);
        drawableNewDrawable.setLayoutDirection(this.f39814x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f39792a);
        this.f39798g[i5] = drawableMutate;
        this.f39797f.removeAt(iIndexOfKey);
        if (this.f39797f.size() == 0) {
            this.f39797f = null;
        }
        return drawableMutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i5) {
        ?? r52;
        if (i5 < 0) {
            return 0;
        }
        C4430w c4430w = this.f39791J;
        int i10 = 0;
        int iA = AbstractC4517a.a(c4430w.f47566c, i5, c4430w.f47564a);
        if (iA >= 0 && (r52 = c4430w.f47565b[iA]) != AbstractC4416i.f47513b) {
            i10 = r52;
        }
        return i10.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f39789H;
        int i5 = this.f39799h;
        for (int i10 = 0; i10 < i5; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f39795d | this.f39796e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
