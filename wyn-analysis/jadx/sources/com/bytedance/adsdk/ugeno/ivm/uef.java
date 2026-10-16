package com.bytedance.adsdk.ugeno.ivm;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.applovin.shadow.okio.Segment;
import com.bytedance.adsdk.ugeno.bcc.yo;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class uef<T> extends FrameLayout implements yo.moa {
    private static final Interpolator cp = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.ivm.uef.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };

    /* renamed from: ab, reason: collision with root package name */
    private boolean f24720ab;
    private int bcc;
    private boolean bs;
    private boolean cq;
    private int cz;
    private int dhk;
    private String dj;
    private boolean dz;
    private final Runnable fz;
    private com.bytedance.adsdk.ugeno.ivm.yo gr;
    private com.bytedance.adsdk.ugeno.ivm.uef.uef gsd;
    private FrameLayout gzw;
    private int ivm;
    private final Runnable ku;
    private int lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.bcc.yo f24721oa;
    private int oib;
    private int orq;
    private boolean pz;
    private C0041uef rt;
    private boolean sy;
    private int tpx;

    /* renamed from: ue, reason: collision with root package name */
    private Scroller f24722ue;
    protected List<T> uef;
    private boolean wk;
    private float wrv;
    private int xs;
    protected Context yo;
    private int zjm;

    public class oa extends Scroller {
        public oa(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i5, int i10, int i11, int i12, int i13) {
            super.startScroll(i5, i10, i11, i12, uef.this.xs);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i5, int i10, int i11, int i12) {
            super.startScroll(i5, i10, i11, i12, uef.this.xs);
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.ivm.uef$uef, reason: collision with other inner class name */
    public class C0041uef extends com.bytedance.adsdk.ugeno.bcc.oa {
        public C0041uef() {
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.oa
        public int uef(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.oa
        public boolean uef(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.oa
        public int uef() {
            return uef.this.wk ? Segment.SHARE_MINIMUM : uef.this.uef.size();
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.oa
        public Object uef(ViewGroup viewGroup, int i5) {
            View viewUef = uef.this.uef(i5, moa.uef(uef.this.wk, i5, uef.this.uef.size()));
            viewGroup.addView(viewUef);
            return viewUef;
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.oa
        public void uef(ViewGroup viewGroup, int i5, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.oa
        public float uef(int i5) {
            if (uef.this.wrv <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 1.0f;
            }
            return 1.0f / uef.this.wrv;
        }
    }

    public class yo extends com.bytedance.adsdk.ugeno.bcc.yo {
        public yo(Context context) {
            super(context);
        }

        private MotionEvent uef(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.yo, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
            if (!uef.this.f24720ab) {
                return false;
            }
            try {
                if (uef.this.orq != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(uef(motionEvent));
                uef(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.bcc.yo, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!uef.this.f24720ab) {
                return false;
            }
            try {
                return uef.this.orq == 1 ? super.onTouchEvent(uef(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public uef(Context context) {
        super(context);
        this.uef = new CopyOnWriteArrayList();
        this.moa = -1;
        this.lw = 2000;
        this.ivm = 500;
        this.xs = 500;
        this.bcc = 0;
        this.cz = -1;
        this.zjm = -1;
        this.dj = "normal";
        this.wrv = 1.0f;
        this.cq = true;
        this.dz = true;
        this.wk = true;
        this.f24720ab = true;
        this.oib = 0;
        this.dhk = 0;
        this.tpx = 0;
        this.orq = 0;
        this.pz = true;
        this.ku = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ivm.uef.2
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                int currentItem = uef.this.f24721oa.getCurrentItem() + 1;
                if (uef.this.wk) {
                    if (currentItem >= 1024) {
                        uef.this.f24721oa.uef(512, false);
                        return;
                    } else {
                        uef.this.f24721oa.uef(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.bcc.oa adapter = uef.this.f24721oa.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.uef()) {
                        uef.this.f24721oa.uef(0, false);
                    } else {
                        uef.this.f24721oa.uef(currentItem, true);
                    }
                }
            }
        };
        this.fz = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ivm.uef.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (uef.this.dz) {
                    uef.this.pz = false;
                    int currentItem = uef.this.f24721oa.getCurrentItem() + 1;
                    if (uef.this.wk) {
                        if (currentItem >= 1024) {
                            uef.this.f24721oa.uef(512, false);
                        } else {
                            uef.this.f24721oa.uef(currentItem, true);
                        }
                        uef uefVar = uef.this;
                        uefVar.postDelayed(uefVar.fz, uef.this.lw);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.bcc.oa adapter = uef.this.f24721oa.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.uef()) {
                            uef.this.f24721oa.uef(0, false);
                            uef uefVar2 = uef.this;
                            uefVar2.postDelayed(uefVar2.fz, uef.this.lw);
                        } else {
                            uef.this.f24721oa.uef(currentItem, true);
                            uef uefVar3 = uef.this;
                            uefVar3.postDelayed(uefVar3.fz, uef.this.lw);
                        }
                    }
                }
            }
        };
        this.yo = context;
        this.gzw = new FrameLayout(context);
        this.f24721oa = uef();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.gzw.addView(this.f24721oa, layoutParams);
        addView(this.gzw);
    }

    @Override // com.bytedance.adsdk.ugeno.bcc.yo.moa
    public void cq(int i5) {
        if (i5 == 1 && this.bs) {
            ivm();
        }
        com.bytedance.adsdk.ugeno.ivm.yo yoVar = this.gr;
        if (yoVar != null) {
            yoVar.uef(this.wk, i5);
        }
    }

    public uef<T> cz(int i5) throws Resources.NotFoundException {
        this.cz = i5;
        uef(this.dj, this.bcc, i5, this.zjm, true);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.dz) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.bs) {
                    lw();
                }
            } else if (action == 0) {
                ivm();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract View dj(int i5);

    public void dz(int i5) throws Resources.NotFoundException {
        uef(this.dj, this.bcc, this.cz, this.zjm, true);
        if (this.rt == null) {
            this.rt = new C0041uef();
            this.f24721oa.uef((yo.moa) this);
            this.f24721oa.setAdapter(this.rt);
        }
        if (this.wk) {
            if (i5 >= 1024) {
                this.f24721oa.uef(512, false);
                return;
            } else {
                this.f24721oa.uef(i5, true);
                return;
            }
        }
        if (i5 < 0 || i5 >= this.uef.size()) {
            return;
        }
        this.f24721oa.uef(i5, true);
    }

    public com.bytedance.adsdk.ugeno.bcc.oa getAdapter() {
        return this.f24721oa.getAdapter();
    }

    public int getCurrentItem() {
        return this.f24721oa.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.bcc.yo getViewPager() {
        return this.f24721oa;
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.ivm.yo yoVar) {
        this.gr = yoVar;
    }

    public void setTwoItems(boolean z2) {
        this.sy = z2;
    }

    @Override // com.bytedance.adsdk.ugeno.bcc.yo.moa
    public void wrv(int i5) {
        int i10;
        if (this.gr != null) {
            int iUef = moa.uef(this.wk, i5, this.uef.size());
            i10 = i5;
            this.gr.uef(this.wk, iUef, i10, iUef == 0, iUef == this.uef.size() - 1);
        } else {
            i10 = i5;
        }
        if (this.cq) {
            this.gsd.uef(i10);
        }
    }

    public uef zjm(int i5) throws Resources.NotFoundException {
        this.zjm = i5;
        uef(this.dj, this.bcc, this.cz, i5, true);
        return this;
    }

    public uef bcc(int i5) throws Resources.NotFoundException {
        this.bcc = i5;
        uef(this.dj, i5, this.cz, this.zjm, true);
        return this;
    }

    public uef ivm(int i5) {
        this.gsd.setSelectedColor(i5);
        return this;
    }

    public uef lw(int i5) {
        if (i5 < 0) {
            i5 = this.lw;
        }
        this.moa = i5;
        lw();
        return this;
    }

    public uef moa(float f10) {
        this.gsd.setIndicatorY(f10);
        return this;
    }

    public uef oa(float f10) {
        this.gsd.setIndicatorHeight((int) f10);
        return this;
    }

    public uef xs(int i5) {
        this.gsd.setUnSelectedColor(i5);
        return this;
    }

    public uef yo(float f10) {
        this.gsd.setIndicatorX(f10);
        return this;
    }

    private boolean xs() {
        return this.uef.size() <= 2 && this.wk;
    }

    public void ivm() {
        removeCallbacks(this.fz);
    }

    public uef moa(int i5) {
        this.lw = i5;
        lw();
        return this;
    }

    public uef oa() {
        this.gsd.uef();
        return this;
    }

    public com.bytedance.adsdk.ugeno.bcc.yo uef() {
        return new yo(getContext());
    }

    public uef yo(int i5) {
        this.xs = i5;
        if (this.f24722ue == null) {
            this.f24722ue = new oa(this.yo, cp);
        }
        this.f24721oa.setScroller(this.f24722ue);
        return this;
    }

    public uef oa(String str) {
        this.gsd.setIndicatorDirection(str);
        return this;
    }

    public uef uef(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.gsd = new com.bytedance.adsdk.ugeno.ivm.uef.yo(this.yo);
        } else {
            this.gsd = new com.bytedance.adsdk.ugeno.ivm.uef.oa(this.yo);
        }
        addView(this.gsd, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public uef lw(float f10) {
        this.wrv = f10;
        return this;
    }

    public uef moa(boolean z2) throws Resources.NotFoundException {
        this.gsd.setLoop(z2);
        if (this.wk != z2) {
            int iUef = moa.uef(z2, this.f24721oa.getCurrentItem(), this.uef.size());
            this.wk = z2;
            C0041uef c0041uef = this.rt;
            if (c0041uef != null) {
                c0041uef.yo();
                this.f24721oa.setCurrentItem(iUef);
            }
        }
        return this;
    }

    public uef oa(int i5) {
        this.ivm = i5;
        return this;
    }

    public uef lw(boolean z2) {
        this.bs = z2;
        return this;
    }

    public uef oa(boolean z2) {
        this.f24720ab = z2;
        return this;
    }

    public void lw() {
        int i5;
        removeCallbacks(this.fz);
        int i10 = this.lw;
        if (this.pz && (i5 = this.moa) > 0) {
            i10 = i5;
        }
        postDelayed(this.fz, i10);
    }

    public uef yo(boolean z2) {
        this.cq = z2;
        return this;
    }

    public uef uef(float f10) {
        this.gsd.setIndicatorWidth((int) f10);
        return this;
    }

    public uef yo(String str) throws Resources.NotFoundException {
        this.dj = str;
        uef(str, this.bcc, this.cz, this.zjm, true);
        return this;
    }

    public uef uef(int i5) {
        this.orq = i5;
        return this;
    }

    public uef uef(boolean z2) {
        this.dz = z2;
        lw();
        return this;
    }

    public void yo() throws Resources.NotFoundException {
        int i5;
        uef(this.dj, this.bcc, this.cz, this.zjm, true);
        if (this.rt == null) {
            this.rt = new C0041uef();
            this.f24721oa.uef((yo.moa) this);
            this.f24721oa.setAdapter(this.rt);
        }
        int i10 = this.oib;
        if (i10 < 0 || i10 >= this.uef.size()) {
            this.oib = 0;
        }
        if (this.wk) {
            i5 = this.oib + 512;
        } else {
            i5 = this.oib;
        }
        this.f24721oa.uef(i5, true);
        if (!this.wk) {
            wrv(i5);
        }
        if (this.dz) {
            lw();
        }
    }

    public void moa() throws Resources.NotFoundException {
        ivm();
        if (this.rt != null) {
            this.f24721oa.oa((yo.moa) this);
            this.f24721oa.setAdapter(null);
            this.rt = null;
            this.f24721oa.removeAllViews();
            this.uef.clear();
            this.gsd.yo();
        }
    }

    public void uef(String str, int i5, int i10, int i11, boolean z2) throws Resources.NotFoundException {
        C0041uef c0041uef = this.rt;
        if (c0041uef != null) {
            c0041uef.yo();
        }
        this.f24721oa.setPageMargin(i5);
        if (i10 > 0 || i11 > 0) {
            if (this.orq == 1) {
                this.f24721oa.setPadding(0, i10 + i5, 0, i11 + i5);
            } else {
                this.f24721oa.setPadding(i10 + i5, 0, i11 + i5, 0);
            }
            this.gzw.setClipChildren(false);
            this.f24721oa.setClipChildren(false);
            this.f24721oa.setClipToPadding(false);
        }
        if (this.orq == 1) {
            com.bytedance.adsdk.ugeno.ivm.oa.moa moaVar = new com.bytedance.adsdk.ugeno.ivm.oa.moa();
            moaVar.uef(str);
            this.f24721oa.uef(true, (yo.lw) moaVar);
            this.f24721oa.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.f24721oa.uef(false, (yo.lw) new com.bytedance.adsdk.ugeno.ivm.oa.yo());
        } else if (TextUtils.equals(str, "cube")) {
            this.f24721oa.uef(false, (yo.lw) new com.bytedance.adsdk.ugeno.ivm.oa.uef());
        } else if (TextUtils.equals(str, "fade")) {
            this.f24721oa.uef(false, (yo.lw) new com.bytedance.adsdk.ugeno.ivm.oa.oa());
        } else {
            this.f24721oa.uef(false, (yo.lw) null);
        }
        this.f24721oa.setOffscreenPageLimit((int) this.wrv);
    }

    public View uef(int i5, int i10) {
        if (this.uef.size() == 0) {
            return new View(getContext());
        }
        View viewDj = dj(i10);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewDj instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (xs()) {
            viewDj.setTag("two_items_tag");
        }
        if (viewDj.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewDj.getParent()).removeView(viewDj);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewDj, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (xs()) {
            frameLayout.setTag(Integer.valueOf(i5));
        }
        return frameLayout;
    }

    public uef<T> uef(T t10) {
        if (t10 != null) {
            this.uef.add(t10);
            if (this.cq) {
                this.gsd.oa();
            }
        }
        C0041uef c0041uef = this.rt;
        if (c0041uef != null) {
            c0041uef.yo();
            this.gsd.uef(this.oib, this.f24721oa.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.bcc.yo.moa
    public void uef(int i5, float f10, int i10) {
        com.bytedance.adsdk.ugeno.ivm.yo yoVar = this.gr;
        if (yoVar != null) {
            boolean z2 = this.wk;
            yoVar.uef(z2, moa.uef(z2, i5, this.uef.size()), f10, i10);
        }
        if (xs()) {
            uef(i5, findViewWithTag(Integer.valueOf(i5)));
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i11 = i5 + 1;
                uef(i11, findViewWithTag(Integer.valueOf(i11)));
            }
        }
    }

    private void uef(int i5, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t10 = this.uef.get(moa.uef(true, i5, this.uef.size()));
            if (t10 == null) {
                return;
            }
            if (t10 instanceof com.bytedance.adsdk.ugeno.oa.yo) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.oa.yo) t10).dj();
            } else if (t10 instanceof View) {
                viewFindViewWithTag = (View) t10;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
