package u3;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import x.C4412e;

/* renamed from: u3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4248j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f46597a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f46598b;

    /* renamed from: c, reason: collision with root package name */
    public float f46599c;

    /* renamed from: d, reason: collision with root package name */
    public float f46600d;

    /* renamed from: e, reason: collision with root package name */
    public float f46601e;

    /* renamed from: f, reason: collision with root package name */
    public float f46602f;

    /* renamed from: g, reason: collision with root package name */
    public float f46603g;

    /* renamed from: h, reason: collision with root package name */
    public float f46604h;

    /* renamed from: i, reason: collision with root package name */
    public float f46605i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f46606j;
    public String k;

    public C4248j() {
        this.f46597a = new Matrix();
        this.f46598b = new ArrayList();
        this.f46599c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46600d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46601e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46602f = 1.0f;
        this.f46603g = 1.0f;
        this.f46604h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46605i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46606j = new Matrix();
        this.k = null;
    }

    @Override // u3.k
    public final boolean a() {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f46598b;
            if (i5 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i5)).a()) {
                return true;
            }
            i5++;
        }
    }

    @Override // u3.k
    public final boolean b(int[] iArr) {
        int i5 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f46598b;
            if (i5 >= arrayList.size()) {
                return zB;
            }
            zB |= ((k) arrayList.get(i5)).b(iArr);
            i5++;
        }
    }

    public final void c() {
        Matrix matrix = this.f46606j;
        matrix.reset();
        matrix.postTranslate(-this.f46600d, -this.f46601e);
        matrix.postScale(this.f46602f, this.f46603g);
        matrix.postRotate(this.f46599c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        matrix.postTranslate(this.f46604h + this.f46600d, this.f46605i + this.f46601e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.f46606j;
    }

    public float getPivotX() {
        return this.f46600d;
    }

    public float getPivotY() {
        return this.f46601e;
    }

    public float getRotation() {
        return this.f46599c;
    }

    public float getScaleX() {
        return this.f46602f;
    }

    public float getScaleY() {
        return this.f46603g;
    }

    public float getTranslateX() {
        return this.f46604h;
    }

    public float getTranslateY() {
        return this.f46605i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f46600d) {
            this.f46600d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f46601e) {
            this.f46601e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f46599c) {
            this.f46599c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f46602f) {
            this.f46602f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f46603g) {
            this.f46603g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f46604h) {
            this.f46604h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f46605i) {
            this.f46605i = f10;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4248j(C4248j c4248j, C4412e c4412e) {
        C4246h c4246h;
        this.f46597a = new Matrix();
        this.f46598b = new ArrayList();
        this.f46599c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46600d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46601e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46602f = 1.0f;
        this.f46603g = 1.0f;
        this.f46604h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f46605i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Matrix matrix = new Matrix();
        this.f46606j = matrix;
        this.k = null;
        this.f46599c = c4248j.f46599c;
        this.f46600d = c4248j.f46600d;
        this.f46601e = c4248j.f46601e;
        this.f46602f = c4248j.f46602f;
        this.f46603g = c4248j.f46603g;
        this.f46604h = c4248j.f46604h;
        this.f46605i = c4248j.f46605i;
        String str = c4248j.k;
        this.k = str;
        if (str != null) {
            c4412e.put(str, this);
        }
        matrix.set(c4248j.f46606j);
        ArrayList arrayList = c4248j.f46598b;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Object obj = arrayList.get(i5);
            if (obj instanceof C4248j) {
                this.f46598b.add(new C4248j((C4248j) obj, c4412e));
            } else {
                if (obj instanceof C4247i) {
                    C4247i c4247i = (C4247i) obj;
                    C4247i c4247i2 = new C4247i(c4247i);
                    c4247i2.f46588e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    c4247i2.f46590g = 1.0f;
                    c4247i2.f46591h = 1.0f;
                    c4247i2.f46592i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    c4247i2.f46593j = 1.0f;
                    c4247i2.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    c4247i2.f46594l = Paint.Cap.BUTT;
                    c4247i2.f46595m = Paint.Join.MITER;
                    c4247i2.f46596n = 4.0f;
                    c4247i2.f46587d = c4247i.f46587d;
                    c4247i2.f46588e = c4247i.f46588e;
                    c4247i2.f46590g = c4247i.f46590g;
                    c4247i2.f46589f = c4247i.f46589f;
                    c4247i2.f46609c = c4247i.f46609c;
                    c4247i2.f46591h = c4247i.f46591h;
                    c4247i2.f46592i = c4247i.f46592i;
                    c4247i2.f46593j = c4247i.f46593j;
                    c4247i2.k = c4247i.k;
                    c4247i2.f46594l = c4247i.f46594l;
                    c4247i2.f46595m = c4247i.f46595m;
                    c4247i2.f46596n = c4247i.f46596n;
                    c4246h = c4247i2;
                } else if (obj instanceof C4246h) {
                    c4246h = new C4246h((C4246h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f46598b.add(c4246h);
                Object obj2 = c4246h.f46608b;
                if (obj2 != null) {
                    c4412e.put(obj2, c4246h);
                }
            }
        }
    }
}
