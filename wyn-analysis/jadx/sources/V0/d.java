package V0;

import R8.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f12869a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12871c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12872d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12873e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12874f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12875g;

    /* renamed from: h, reason: collision with root package name */
    public int f12876h;

    /* renamed from: i, reason: collision with root package name */
    public int f12877i;

    /* renamed from: j, reason: collision with root package name */
    public int f12878j;
    public View k;

    /* renamed from: l, reason: collision with root package name */
    public View f12879l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12880m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12881n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f12882o;

    public d() {
        super(-2, -2);
        this.f12870b = false;
        this.f12871c = 0;
        this.f12872d = 0;
        this.f12873e = -1;
        this.f12874f = -1;
        this.f12875g = 0;
        this.f12876h = 0;
        this.f12882o = new Rect();
    }

    public final boolean a(int i5) {
        if (i5 == 0) {
            return this.f12880m;
        }
        if (i5 != 1) {
            return false;
        }
        return this.f12881n;
    }

    public d(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        a aVar;
        super(context, attributeSet);
        this.f12870b = false;
        this.f12871c = 0;
        this.f12872d = 0;
        this.f12873e = -1;
        this.f12874f = -1;
        this.f12875g = 0;
        this.f12876h = 0;
        this.f12882o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U0.a.f11900b);
        this.f12871c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f12874f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f12872d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f12873e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f12875g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f12876h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f12870b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f18038t;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f18038t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f18040v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f18039u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e7) {
                    throw new RuntimeException(v.f("Could not inflate Behavior subclass ", string), e7);
                }
            }
            this.f12869a = aVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        a aVar2 = this.f12869a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f12870b = false;
        this.f12871c = 0;
        this.f12872d = 0;
        this.f12873e = -1;
        this.f12874f = -1;
        this.f12875g = 0;
        this.f12876h = 0;
        this.f12882o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f12870b = false;
        this.f12871c = 0;
        this.f12872d = 0;
        this.f12873e = -1;
        this.f12874f = -1;
        this.f12875g = 0;
        this.f12876h = 0;
        this.f12882o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f12870b = false;
        this.f12871c = 0;
        this.f12872d = 0;
        this.f12873e = -1;
        this.f12874f = -1;
        this.f12875g = 0;
        this.f12876h = 0;
        this.f12882o = new Rect();
    }
}
