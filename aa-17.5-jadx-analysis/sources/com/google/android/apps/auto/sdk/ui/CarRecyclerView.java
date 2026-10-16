package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.lz;
import defpackage.owu;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class CarRecyclerView extends owu {
    private Constructor ae;
    private boolean af;

    public CarRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusableInTouchMode(false);
        setFocusable(false);
    }

    private final CarLayoutManager aB() {
        lz lzVarG = g();
        lzVarG.getClass();
        return (CarLayoutManager) lzVarG;
    }

    private final void aC(View view, float f) {
        if (!(view instanceof ViewGroup)) {
            view.setAlpha(f);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aC(viewGroup.getChildAt(i), f);
        }
    }

    public final void a() {
        int i = aB().e;
        if (i == -1) {
            return;
        }
        ad(i);
    }

    public final void aA() {
        int i = aB().d;
        if (i == -1) {
            return;
        }
        ad(i);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean ak(int i, int i2) {
        this.af = true;
        return aB().aa(this, i2);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        int bottom;
        int height;
        if (this.ad) {
            if (view.getTop() < getBottom() && view.getBottom() > getBottom()) {
                bottom = getBottom() - view.getTop();
                height = view.getHeight();
            } else if (view.getTop() >= getTop() || view.getBottom() <= getTop()) {
                f = 1.0f;
                float f2 = 1.0f - f;
                aC(view, 1.0f - (f2 * f2));
            } else {
                bottom = view.getBottom() - getTop();
                height = view.getHeight();
            }
            f = bottom / height;
            float f22 = 1.0f - f;
            aC(view, 1.0f - (f22 * f22));
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) throws SecurityException {
        Class<?> cls;
        if (parcelable.getClass().getClassLoader() == getClass().getClassLoader()) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        if (this.ae == null) {
            Class<?>[] declaredClasses = RecyclerView.class.getDeclaredClasses();
            int length = declaredClasses.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cls = null;
                    break;
                }
                cls = declaredClasses[i];
                if ("android.support.v7.widget.RecyclerView.SavedState".equals(cls.getCanonicalName())) {
                    break;
                } else {
                    i++;
                }
            }
            if (cls == null) {
                throw new IllegalStateException("RecyclerView$SavedState not found!");
            }
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length2 = declaredConstructors.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                Constructor<?> constructor = declaredConstructors[i2];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && "android.os.Parcel".equals(parameterTypes[0].getCanonicalName())) {
                    this.ae = constructor;
                    constructor.setAccessible(true);
                    break;
                }
                i2++;
            }
            if (this.ae == null) {
                throw new IllegalStateException("RecyclerView$SavedState constructor not found!");
            }
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        try {
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
            e = e;
        }
        try {
            super.onRestoreInstanceState((Parcelable) this.ae.newInstance(parcelObtain));
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            if (!this.af) {
                aB().aa(this, 0);
            }
            this.af = false;
        }
        return zOnTouchEvent;
    }

    public CarRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarRecyclerView(Context context) {
        this(context, null);
    }
}
