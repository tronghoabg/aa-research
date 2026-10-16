package com.google.android.apps.auto.components.system.dashboard.media.switcher;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.afck;
import defpackage.afeg;
import defpackage.afeu;
import defpackage.affa;
import defpackage.afpt;
import defpackage.ahnc;
import defpackage.ahni;
import defpackage.aitx;
import defpackage.aivh;
import defpackage.khy;
import defpackage.ksw;
import defpackage.mkm;
import defpackage.nas;
import defpackage.nbb;
import defpackage.nbn;
import defpackage.nbo;
import defpackage.nbu;
import defpackage.tdf;
import defpackage.ype;
import defpackage.yph;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018*\u0001G\u0018\u0000 n2\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006o"}, d2 = {"Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressListener", "Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$SwipeProgressListener;", "getProgressListener", "()Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$SwipeProgressListener;", "setProgressListener", "(Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$SwipeProgressListener;)V", "value", "currentIndex", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "currentView", "Landroid/view/View;", "getCurrentView", "()Landroid/view/View;", "", "swipeProgress", "setSwipeProgress", "(F)V", "currentIndexWithProgress", "getCurrentIndexWithProgress", "()F", "itemMargin", "Lcom/google/android/libraries/auto/dimens/Px;", "getItemMargin-tCxemTc", "setItemMargin-QmG2a4Y", "I", "interactionCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getInteractionCoroutineScope$java_com_google_android_apps_auto_components_system_dashboard_media_switcher_switcher$annotations", "()V", "getInteractionCoroutineScope$java_com_google_android_apps_auto_components_system_dashboard_media_switcher_switcher", "()Lkotlinx/coroutines/CoroutineScope;", "setInteractionCoroutineScope$java_com_google_android_apps_auto_components_system_dashboard_media_switcher_switcher", "(Lkotlinx/coroutines/CoroutineScope;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "touchSlop", "flingSlop", "swipeVelocityThreshold", "swipeDistanceThreshold", "Lcom/google/android/libraries/auto/dimens/PxF;", "getSwipeDistanceThreshold-gH89VWE", "currentInteraction", "Lkotlinx/coroutines/Job;", "launchInteraction", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "handleTouchEvent", "event", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "", "onTouchEvent", "touchHandler", "com/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$touchHandler$1", "Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$touchHandler$1;", "animateToFinalPosition", "swipeDirection", "Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$ScrollDirection;", "initialVelocityX", "(Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$ScrollDirection;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFinishInflate", "syncChildVisibility", "currentScroll", "setSwipeOffset", "offset", "direction", "setSwipeOffset-M7PHqHM", "(FLcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$ScrollDirection;)V", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "moveToIndex", "index", "moveToIndex$java_com_google_android_apps_auto_components_system_dashboard_media_switcher_switcher", "animateToNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPrevious", "animateDirection", "scrollDirection", "(Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$ScrollDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextIndex", "getNextIndex", "(Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$ScrollDirection;)I", "nextTarget", "getNextTarget", "(Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$ScrollDirection;)Landroid/view/View;", "nextTargetInitialOffset", "getNextTargetInitialOffset-viIuPEM", "SavedState", "ScrollDirection", "SwipeProgressListener", "Companion", "java.com.google.android.apps.auto.components.system.dashboard.media.switcher_switcher"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlidingViewSwitcher extends FrameLayout {
    public static final yph a = yph.c("GH.SlidingSwitcher");
    private static final int i = 8;
    public int b;
    public aitx c;
    public final int d;
    public final int e;
    public final float f;
    public final nbu g;
    public nas h;
    private int j;
    private aivh k;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u001b"}, d2 = {"Lcom/google/android/apps/auto/components/system/dashboard/media/switcher/SlidingViewSwitcher$SavedState;", "Landroid/os/Parcelable;", "superState", "index", "", "<init>", "(Landroid/os/Parcelable;I)V", "getSuperState", "()Landroid/os/Parcelable;", "getIndex", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.apps.auto.components.system.dashboard.media.switcher_switcher"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new khy(7);
        public final Parcelable a;
        public final int b;

        public SavedState(Parcelable parcelable, int i) {
            this.a = parcelable;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return affa.f(this.a, savedState.a) && this.b == savedState.b;
        }

        public final int hashCode() {
            Parcelable parcelable = this.a;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return "SavedState(superState=" + this.a + ", index=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingViewSwitcher(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nbn.a, 0, i2);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, tdf.a(i, context));
        typedArrayObtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f = context.getResources().getDisplayMetrics().density * 500.0f;
        this.g = new nbu(this);
    }

    private final int k(nbo nboVar) {
        return afpt.g(this.b + nboVar.d, 0, getChildCount() - 1);
    }

    private final int l(nbo nboVar) {
        return (getWidth() + this.j) * nboVar.d;
    }

    private final Object m(nbo nboVar, afck afckVar) {
        if (isAttachedToWindow()) {
            return n(new ksw(this, nboVar, (afck) null, 13)).n(afckVar);
        }
        throw new IllegalStateException("Check failed.");
    }

    private final aivh n(afeg afegVar) {
        aivh aivhVar = this.k;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        aivh aivhVarD = ahnc.d(f(), null, 0, afegVar, 3);
        this.k = aivhVarD;
        return aivhVarD;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aizk, java.lang.Object] */
    private final void o(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 0) {
            ((ype) a.h()).y("MotionEvent %s has no pointers, skipping", motionEvent);
            return;
        }
        if (motionEvent.getActionMasked() == 0) {
            n(new ksw(this, motionEvent, (afck) null, 14));
            return;
        }
        nbu nbuVar = this.g;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.getClass();
        if (nbuVar.c.c(motionEventObtain)) {
            return;
        }
        a.l().y("Could not emit event %s to touchHandler", motionEventObtain);
    }

    public final View a() {
        View childAt = getChildAt(this.b);
        childAt.getClass();
        return childAt;
    }

    public final View b(nbo nboVar) {
        int iK = k(nboVar);
        if (iK == this.b) {
            return null;
        }
        return getChildAt(iK);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.nbo r6, float r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.nbp
            if (r0 == 0) goto L13
            r0 = r8
            nbp r0 = (defpackage.nbp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            nbp r0 = new nbp
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            nbo r6 = r0.d
            defpackage.woy.dF(r8)
            goto L65
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.woy.dF(r8)
            android.view.View r8 = r5.a()
            nbq r2 = new nbq
            r2.<init>(r8, r5, r6)
            emp r8 = new emp
            r4 = 0
            r8.<init>(r4, r2)
            emq r2 = new emq
            r2.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.c(r4)
            r8.s = r2
            r8.i = r7
            int r7 = r5.l(r6)
            float r7 = (float) r7
            float r7 = -r7
            r8.k(r7)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = defpackage.thg.j(r8, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            int r6 = r5.k(r6)
            r5.g(r6)
            r6 = 0
            r5.i(r6)
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.c(nbo, float, afck):java.lang.Object");
    }

    public final Object d(afck afckVar) {
        if (this.b < getChildCount() - 1) {
            return m(nbo.c, afckVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final Object e(afck afckVar) {
        if (this.b > 0) {
            return m(nbo.b, afckVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final aitx f() {
        aitx aitxVar = this.c;
        if (aitxVar != null) {
            return aitxVar;
        }
        affa.d("interactionCoroutineScope");
        return null;
    }

    public final void g(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.b = i2;
            j(null);
            return;
        }
        throw new IllegalArgumentException(i2 + " is out of range. Number of children: " + getChildCount());
    }

    public final void h(float f, nbo nboVar) {
        Number numberValueOf;
        View viewA = a();
        View viewB = b(nboVar);
        j(nboVar);
        if (viewB != null) {
            viewA.setTranslationX(f);
            viewB.setTranslationX(l(nboVar) + f);
            i((-f) / Math.abs(l(nboVar)));
        } else {
            float width = f / getWidth();
            if (Math.abs(width) > 1.0f) {
                numberValueOf = Float.valueOf(width > BitmapDescriptorFactory.HUE_RED ? 0.25f : -0.25f);
            } else {
                numberValueOf = Double.valueOf(Math.sin((width * 3.141592653589793d) / 2.0d) * 0.25d);
            }
            viewA.setTranslationX(getWidth() * numberValueOf.floatValue());
        }
    }

    public final void i(float f) {
        nas nasVar = this.h;
        if (nasVar != null) {
            float f2 = this.b + f;
            ((PageIndicator) nasVar.a).b(f2);
            nbb nbbVar = (nbb) nasVar.b;
            nbbVar.d().c.m(Float.valueOf(f2));
            nbbVar.g().f(f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.nbo r8) {
        /*
            r7 = this;
            airp r0 = defpackage.ebf.b(r7)
            java.util.Iterator r0 = r0.a()
            r1 = 0
            r2 = r1
        La:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L1b
            defpackage.woy.bo()
        L1b:
            android.view.View r3 = (android.view.View) r3
            int r5 = r7.b
            if (r2 != r5) goto L23
        L21:
            r5 = r1
            goto L2e
        L23:
            r5 = 8
            if (r8 == 0) goto L2e
            int r6 = r7.k(r8)
            if (r2 != r6) goto L2e
            goto L21
        L2e:
            r3.setVisibility(r5)
            r2 = r4
            goto La
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.j(nbo):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = ahni.d(ahni.c(), mkm.a.e().i());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ahni.e(f(), null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        j(null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1) {
            if (actionMasked == 2) {
                o(motionEvent);
                return this.g.a;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        o(motionEvent);
        return false;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof SavedState)) {
            throw new IllegalStateException("Check failed.");
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        g(savedState.b);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.b);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 2 && actionMasked != 3) {
            return false;
        }
        o(motionEvent);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingViewSwitcher(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingViewSwitcher(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SlidingViewSwitcher(Context context, AttributeSet attributeSet, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
