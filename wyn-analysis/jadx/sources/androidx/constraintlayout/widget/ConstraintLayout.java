package androidx.constraintlayout.widget;

import Q0.e;
import Q0.h;
import S3.c;
import T0.b;
import T0.d;
import T0.m;
import T0.n;
import T0.o;
import T0.q;
import T0.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static r f18021r;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f18022a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18023b;

    /* renamed from: c, reason: collision with root package name */
    public final e f18024c;

    /* renamed from: d, reason: collision with root package name */
    public int f18025d;

    /* renamed from: e, reason: collision with root package name */
    public int f18026e;

    /* renamed from: f, reason: collision with root package name */
    public int f18027f;

    /* renamed from: g, reason: collision with root package name */
    public int f18028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18029h;

    /* renamed from: i, reason: collision with root package name */
    public int f18030i;

    /* renamed from: j, reason: collision with root package name */
    public m f18031j;
    public c k;

    /* renamed from: l, reason: collision with root package name */
    public int f18032l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f18033m;

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f18034n;

    /* renamed from: o, reason: collision with root package name */
    public final T0.e f18035o;

    /* renamed from: p, reason: collision with root package name */
    public int f18036p;

    /* renamed from: q, reason: collision with root package name */
    public int f18037q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f18022a = new SparseArray();
        this.f18023b = new ArrayList(4);
        this.f18024c = new e();
        this.f18025d = 0;
        this.f18026e = 0;
        this.f18027f = f.API_PRIORITY_OTHER;
        this.f18028g = f.API_PRIORITY_OTHER;
        this.f18029h = true;
        this.f18030i = 257;
        this.f18031j = null;
        this.k = null;
        this.f18032l = -1;
        this.f18033m = new HashMap();
        this.f18034n = new SparseArray();
        this.f18035o = new T0.e(this, this);
        this.f18036p = 0;
        this.f18037q = 0;
        i(attributeSet, 0);
    }

    public static d g() {
        d dVar = new d(-2, -2);
        dVar.f11173a = -1;
        dVar.f11175b = -1;
        dVar.f11177c = -1.0f;
        dVar.f11179d = true;
        dVar.f11181e = -1;
        dVar.f11183f = -1;
        dVar.f11185g = -1;
        dVar.f11187h = -1;
        dVar.f11189i = -1;
        dVar.f11191j = -1;
        dVar.k = -1;
        dVar.f11194l = -1;
        dVar.f11196m = -1;
        dVar.f11198n = -1;
        dVar.f11200o = -1;
        dVar.f11202p = -1;
        dVar.f11204q = 0;
        dVar.f11205r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f11206s = -1;
        dVar.f11207t = -1;
        dVar.f11208u = -1;
        dVar.f11209v = -1;
        dVar.f11210w = Integer.MIN_VALUE;
        dVar.f11211x = Integer.MIN_VALUE;
        dVar.f11212y = Integer.MIN_VALUE;
        dVar.f11213z = Integer.MIN_VALUE;
        dVar.f11148A = Integer.MIN_VALUE;
        dVar.f11149B = Integer.MIN_VALUE;
        dVar.f11150C = Integer.MIN_VALUE;
        dVar.f11151D = 0;
        dVar.f11152E = 0.5f;
        dVar.f11153F = 0.5f;
        dVar.f11154G = null;
        dVar.f11155H = -1.0f;
        dVar.f11156I = -1.0f;
        dVar.f11157J = 0;
        dVar.f11158K = 0;
        dVar.L = 0;
        dVar.f11159M = 0;
        dVar.f11160N = 0;
        dVar.f11161O = 0;
        dVar.f11162P = 0;
        dVar.f11163Q = 0;
        dVar.f11164R = 1.0f;
        dVar.f11165S = 1.0f;
        dVar.f11166T = -1;
        dVar.f11167U = -1;
        dVar.f11168V = -1;
        dVar.f11169W = false;
        dVar.f11170X = false;
        dVar.f11171Y = null;
        dVar.f11172Z = 0;
        dVar.f11174a0 = true;
        dVar.f11176b0 = true;
        dVar.f11178c0 = false;
        dVar.f11180d0 = false;
        dVar.f11182e0 = false;
        dVar.f11184f0 = -1;
        dVar.f11186g0 = -1;
        dVar.f11188h0 = -1;
        dVar.f11190i0 = -1;
        dVar.f11192j0 = Integer.MIN_VALUE;
        dVar.f11193k0 = Integer.MIN_VALUE;
        dVar.f11195l0 = 0.5f;
        dVar.f11203p0 = new Q0.d();
        return dVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static r getSharedValues() {
        if (f18021r == null) {
            r rVar = new r();
            new SparseIntArray();
            new HashMap();
            f18021r = rVar;
        }
        return f18021r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f18023b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                ((b) arrayList.get(i5)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i14;
                        float f11 = i15;
                        float f12 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i15 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f18029h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f11173a = -1;
        dVar.f11175b = -1;
        dVar.f11177c = -1.0f;
        dVar.f11179d = true;
        dVar.f11181e = -1;
        dVar.f11183f = -1;
        dVar.f11185g = -1;
        dVar.f11187h = -1;
        dVar.f11189i = -1;
        dVar.f11191j = -1;
        dVar.k = -1;
        dVar.f11194l = -1;
        dVar.f11196m = -1;
        dVar.f11198n = -1;
        dVar.f11200o = -1;
        dVar.f11202p = -1;
        dVar.f11204q = 0;
        dVar.f11205r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f11206s = -1;
        dVar.f11207t = -1;
        dVar.f11208u = -1;
        dVar.f11209v = -1;
        dVar.f11210w = Integer.MIN_VALUE;
        dVar.f11211x = Integer.MIN_VALUE;
        dVar.f11212y = Integer.MIN_VALUE;
        dVar.f11213z = Integer.MIN_VALUE;
        dVar.f11148A = Integer.MIN_VALUE;
        dVar.f11149B = Integer.MIN_VALUE;
        dVar.f11150C = Integer.MIN_VALUE;
        dVar.f11151D = 0;
        dVar.f11152E = 0.5f;
        dVar.f11153F = 0.5f;
        dVar.f11154G = null;
        dVar.f11155H = -1.0f;
        dVar.f11156I = -1.0f;
        dVar.f11157J = 0;
        dVar.f11158K = 0;
        dVar.L = 0;
        dVar.f11159M = 0;
        dVar.f11160N = 0;
        dVar.f11161O = 0;
        dVar.f11162P = 0;
        dVar.f11163Q = 0;
        dVar.f11164R = 1.0f;
        dVar.f11165S = 1.0f;
        dVar.f11166T = -1;
        dVar.f11167U = -1;
        dVar.f11168V = -1;
        dVar.f11169W = false;
        dVar.f11170X = false;
        dVar.f11171Y = null;
        dVar.f11172Z = 0;
        dVar.f11174a0 = true;
        dVar.f11176b0 = true;
        dVar.f11178c0 = false;
        dVar.f11180d0 = false;
        dVar.f11182e0 = false;
        dVar.f11184f0 = -1;
        dVar.f11186g0 = -1;
        dVar.f11188h0 = -1;
        dVar.f11190i0 = -1;
        dVar.f11192j0 = Integer.MIN_VALUE;
        dVar.f11193k0 = Integer.MIN_VALUE;
        dVar.f11195l0 = 0.5f;
        dVar.f11203p0 = new Q0.d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f11345b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            int i10 = T0.c.f11147a.get(index);
            switch (i10) {
                case 1:
                    dVar.f11168V = typedArrayObtainStyledAttributes.getInt(index, dVar.f11168V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11202p);
                    dVar.f11202p = resourceId;
                    if (resourceId == -1) {
                        dVar.f11202p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    dVar.f11204q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11204q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, dVar.f11205r) % 360.0f;
                    dVar.f11205r = f10;
                    if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        dVar.f11205r = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    dVar.f11173a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f11173a);
                    break;
                case 6:
                    dVar.f11175b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f11175b);
                    break;
                case 7:
                    dVar.f11177c = typedArrayObtainStyledAttributes.getFloat(index, dVar.f11177c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11181e);
                    dVar.f11181e = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f11181e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11183f);
                    dVar.f11183f = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f11183f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11185g);
                    dVar.f11185g = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f11185g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11187h);
                    dVar.f11187h = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f11187h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11189i);
                    dVar.f11189i = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.f11189i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11191j);
                    dVar.f11191j = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.f11191j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.k);
                    dVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11194l);
                    dVar.f11194l = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f11194l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11196m);
                    dVar.f11196m = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f11196m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11206s);
                    dVar.f11206s = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f11206s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11207t);
                    dVar.f11207t = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f11207t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11208u);
                    dVar.f11208u = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f11208u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11209v);
                    dVar.f11209v = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f11209v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    dVar.f11210w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11210w);
                    break;
                case 22:
                    dVar.f11211x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11211x);
                    break;
                case 23:
                    dVar.f11212y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11212y);
                    break;
                case 24:
                    dVar.f11213z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11213z);
                    break;
                case 25:
                    dVar.f11148A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11148A);
                    break;
                case 26:
                    dVar.f11149B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11149B);
                    break;
                case 27:
                    dVar.f11169W = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f11169W);
                    break;
                case 28:
                    dVar.f11170X = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f11170X);
                    break;
                case 29:
                    dVar.f11152E = typedArrayObtainStyledAttributes.getFloat(index, dVar.f11152E);
                    break;
                case 30:
                    dVar.f11153F = typedArrayObtainStyledAttributes.getFloat(index, dVar.f11153F);
                    break;
                case 31:
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    dVar.f11159M = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        dVar.f11160N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11160N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f11160N) == -2) {
                            dVar.f11160N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        dVar.f11162P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11162P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f11162P) == -2) {
                            dVar.f11162P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    dVar.f11164R = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArrayObtainStyledAttributes.getFloat(index, dVar.f11164R));
                    dVar.L = 2;
                    break;
                case 36:
                    try {
                        dVar.f11161O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11161O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f11161O) == -2) {
                            dVar.f11161O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        dVar.f11163Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11163Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, dVar.f11163Q) == -2) {
                            dVar.f11163Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    dVar.f11165S = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, typedArrayObtainStyledAttributes.getFloat(index, dVar.f11165S));
                    dVar.f11159M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            m.h(dVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            dVar.f11155H = typedArrayObtainStyledAttributes.getFloat(index, dVar.f11155H);
                            break;
                        case 46:
                            dVar.f11156I = typedArrayObtainStyledAttributes.getFloat(index, dVar.f11156I);
                            break;
                        case 47:
                            dVar.f11157J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.f11158K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dVar.f11166T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f11166T);
                            break;
                        case 50:
                            dVar.f11167U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, dVar.f11167U);
                            break;
                        case 51:
                            dVar.f11171Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11198n);
                            dVar.f11198n = resourceId15;
                            if (resourceId15 == -1) {
                                dVar.f11198n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, dVar.f11200o);
                            dVar.f11200o = resourceId16;
                            if (resourceId16 == -1) {
                                dVar.f11200o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            dVar.f11151D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11151D);
                            break;
                        case 55:
                            dVar.f11150C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dVar.f11150C);
                            break;
                        default:
                            switch (i10) {
                                case 64:
                                    m.g(dVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    m.g(dVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    dVar.f11172Z = typedArrayObtainStyledAttributes.getInt(index, dVar.f11172Z);
                                    break;
                                case 67:
                                    dVar.f11179d = typedArrayObtainStyledAttributes.getBoolean(index, dVar.f11179d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.f18028g;
    }

    public int getMaxWidth() {
        return this.f18027f;
    }

    public int getMinHeight() {
        return this.f18026e;
    }

    public int getMinWidth() {
        return this.f18025d;
    }

    public int getOptimizationLevel() {
        return this.f18024c.f9583D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.f18024c;
        if (eVar.f9558j == null) {
            int id3 = getId();
            if (id3 != -1) {
                eVar.f9558j = getContext().getResources().getResourceEntryName(id3);
            } else {
                eVar.f9558j = "parent";
            }
        }
        if (eVar.f9555h0 == null) {
            eVar.f9555h0 = eVar.f9558j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f9555h0);
        }
        Iterator it = eVar.f9592q0.iterator();
        while (it.hasNext()) {
            Q0.d dVar = (Q0.d) it.next();
            View view = dVar.f9551f0;
            if (view != null) {
                if (dVar.f9558j == null && (id2 = view.getId()) != -1) {
                    dVar.f9558j = getContext().getResources().getResourceEntryName(id2);
                }
                if (dVar.f9555h0 == null) {
                    dVar.f9555h0 = dVar.f9558j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f9555h0);
                }
            }
        }
        eVar.n(sb2);
        return sb2.toString();
    }

    public final Q0.d h(View view) {
        if (view == this) {
            return this.f18024c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f11203p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof d) {
            return ((d) view.getLayoutParams()).f11203p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i5) throws XmlPullParserException, IOException, NumberFormatException {
        e eVar = this.f18024c;
        eVar.f9551f0 = this;
        T0.e eVar2 = this.f18035o;
        eVar.f9596u0 = eVar2;
        eVar.f9594s0.f10056h = eVar2;
        this.f18022a.put(getId(), this);
        this.f18031j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f11345b, i5, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f18025d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f18025d);
                } else if (index == 17) {
                    this.f18026e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f18026e);
                } else if (index == 14) {
                    this.f18027f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f18027f);
                } else if (index == 15) {
                    this.f18028g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f18028g);
                } else if (index == 113) {
                    this.f18030i = typedArrayObtainStyledAttributes.getInt(index, this.f18030i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        m mVar = new m();
                        this.f18031j = mVar;
                        mVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f18031j = null;
                    }
                    this.f18032l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.f9583D0 = this.f18030i;
        O0.c.f8764p = eVar.W(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r9 = this;
            S3.c r0 = new S3.c
            android.content.Context r1 = r9.getContext()
            r2 = 22
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f10936b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f10937c = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3 = 0
        L27:
            r4 = 1
            if (r2 == r4) goto Lae
            if (r2 == 0) goto L9f
            r5 = 2
            if (r2 == r5) goto L31
            goto La2
        L31:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6b;
                case 80204913: goto L61;
                case 1382829617: goto L58;
                case 1657696882: goto L4e;
                case 1901439077: goto L3f;
                default: goto L3e;
            }     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        L3e:
            goto L75
        L3f:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r8
            goto L76
        L49:
            r10 = move-exception
            goto La7
        L4b:
            r10 = move-exception
            goto Lab
        L4e:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = 0
            goto L76
        L58:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            goto L76
        L61:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r5
            goto L76
        L6b:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r7
            goto L76
        L75:
            r4 = -1
        L76:
            if (r4 == r5) goto L90
            if (r4 == r8) goto L81
            if (r4 == r7) goto L7d
            goto La2
        L7d:
            r0.q(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L81:
            T0.f r2 = new T0.f     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r3 == 0) goto La2
            java.lang.Object r4 = r3.f7308d     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r4.add(r2)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L90:
            M2.e r3 = new M2.e     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            java.lang.Object r2 = r0.f10936b     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r4 = r3.f7306b     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.put(r4, r3)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L9f:
            r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        La2:
            int r2 = r10.next()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L27
        La7:
            r10.printStackTrace()
            goto Lae
        Lab:
            r10.printStackTrace()
        Lae:
            r9.k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(Q0.e r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(Q0.e, int, int, int):void");
    }

    public final void l(Q0.d dVar, d dVar2, SparseArray sparseArray, int i5, int i10) {
        View view = (View) this.f18022a.get(i5);
        Q0.d dVar3 = (Q0.d) sparseArray.get(i5);
        if (dVar3 == null || view == null || !(view.getLayoutParams() instanceof d)) {
            return;
        }
        dVar2.f11178c0 = true;
        if (i10 == 6) {
            d dVar4 = (d) view.getLayoutParams();
            dVar4.f11178c0 = true;
            dVar4.f11203p0.f9519E = true;
        }
        dVar.i(6).b(dVar3.i(i10), dVar2.f11151D, dVar2.f11150C, true);
        dVar.f9519E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            d dVar = (d) childAt.getLayoutParams();
            Q0.d dVar2 = dVar.f11203p0;
            if (childAt.getVisibility() != 8 || dVar.f11180d0 || dVar.f11182e0 || zIsInEditMode) {
                int iR = dVar2.r();
                int iS = dVar2.s();
                childAt.layout(iR, iS, dVar2.q() + iR, dVar2.k() + iS);
            }
        }
        ArrayList arrayList = this.f18023b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((b) arrayList.get(i14)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0551  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        Q0.d dVarH = h(view);
        if ((view instanceof o) && !(dVarH instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.f11203p0 = hVar;
            dVar.f11180d0 = true;
            hVar.S(dVar.f11168V);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.i();
            ((d) view.getLayoutParams()).f11182e0 = true;
            ArrayList arrayList = this.f18023b;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f18022a.put(view.getId(), view);
        this.f18029h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f18022a.remove(view.getId());
        Q0.d dVarH = h(view);
        this.f18024c.f9592q0.remove(dVarH);
        dVarH.C();
        this.f18023b.remove(view);
        this.f18029h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f18029h = true;
        super.requestLayout();
    }

    public void setConstraintSet(m mVar) {
        this.f18031j = mVar;
    }

    @Override // android.view.View
    public void setId(int i5) {
        int id2 = getId();
        SparseArray sparseArray = this.f18022a;
        sparseArray.remove(id2);
        super.setId(i5);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i5) {
        if (i5 == this.f18028g) {
            return;
        }
        this.f18028g = i5;
        requestLayout();
    }

    public void setMaxWidth(int i5) {
        if (i5 == this.f18027f) {
            return;
        }
        this.f18027f = i5;
        requestLayout();
    }

    public void setMinHeight(int i5) {
        if (i5 == this.f18026e) {
            return;
        }
        this.f18026e = i5;
        requestLayout();
    }

    public void setMinWidth(int i5) {
        if (i5 == this.f18025d) {
            return;
        }
        this.f18025d = i5;
        requestLayout();
    }

    public void setOnConstraintsChanged(n nVar) {
        c cVar = this.k;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i5) {
        this.f18030i = i5;
        e eVar = this.f18024c;
        eVar.f9583D0 = i5;
        O0.c.f8764p = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i5) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i5);
        this.f18022a = new SparseArray();
        this.f18023b = new ArrayList(4);
        this.f18024c = new e();
        this.f18025d = 0;
        this.f18026e = 0;
        this.f18027f = f.API_PRIORITY_OTHER;
        this.f18028g = f.API_PRIORITY_OTHER;
        this.f18029h = true;
        this.f18030i = 257;
        this.f18031j = null;
        this.k = null;
        this.f18032l = -1;
        this.f18033m = new HashMap();
        this.f18034n = new SparseArray();
        this.f18035o = new T0.e(this, this);
        this.f18036p = 0;
        this.f18037q = 0;
        i(attributeSet, i5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f11173a = -1;
        dVar.f11175b = -1;
        dVar.f11177c = -1.0f;
        dVar.f11179d = true;
        dVar.f11181e = -1;
        dVar.f11183f = -1;
        dVar.f11185g = -1;
        dVar.f11187h = -1;
        dVar.f11189i = -1;
        dVar.f11191j = -1;
        dVar.k = -1;
        dVar.f11194l = -1;
        dVar.f11196m = -1;
        dVar.f11198n = -1;
        dVar.f11200o = -1;
        dVar.f11202p = -1;
        dVar.f11204q = 0;
        dVar.f11205r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        dVar.f11206s = -1;
        dVar.f11207t = -1;
        dVar.f11208u = -1;
        dVar.f11209v = -1;
        dVar.f11210w = Integer.MIN_VALUE;
        dVar.f11211x = Integer.MIN_VALUE;
        dVar.f11212y = Integer.MIN_VALUE;
        dVar.f11213z = Integer.MIN_VALUE;
        dVar.f11148A = Integer.MIN_VALUE;
        dVar.f11149B = Integer.MIN_VALUE;
        dVar.f11150C = Integer.MIN_VALUE;
        dVar.f11151D = 0;
        dVar.f11152E = 0.5f;
        dVar.f11153F = 0.5f;
        dVar.f11154G = null;
        dVar.f11155H = -1.0f;
        dVar.f11156I = -1.0f;
        dVar.f11157J = 0;
        dVar.f11158K = 0;
        dVar.L = 0;
        dVar.f11159M = 0;
        dVar.f11160N = 0;
        dVar.f11161O = 0;
        dVar.f11162P = 0;
        dVar.f11163Q = 0;
        dVar.f11164R = 1.0f;
        dVar.f11165S = 1.0f;
        dVar.f11166T = -1;
        dVar.f11167U = -1;
        dVar.f11168V = -1;
        dVar.f11169W = false;
        dVar.f11170X = false;
        dVar.f11171Y = null;
        dVar.f11172Z = 0;
        dVar.f11174a0 = true;
        dVar.f11176b0 = true;
        dVar.f11178c0 = false;
        dVar.f11180d0 = false;
        dVar.f11182e0 = false;
        dVar.f11184f0 = -1;
        dVar.f11186g0 = -1;
        dVar.f11188h0 = -1;
        dVar.f11190i0 = -1;
        dVar.f11192j0 = Integer.MIN_VALUE;
        dVar.f11193k0 = Integer.MIN_VALUE;
        dVar.f11195l0 = 0.5f;
        dVar.f11203p0 = new Q0.d();
        return dVar;
    }
}
