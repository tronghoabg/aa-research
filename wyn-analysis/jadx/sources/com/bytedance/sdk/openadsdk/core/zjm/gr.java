package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wrv;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class gr extends GestureDetector {

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.yo.ivm f25856oa;
    private final uef uef;

    public static class uef extends GestureDetector.SimpleOnGestureListener {
        boolean uef = false;

        public boolean oa() {
            return this.uef;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.uef = true;
            return super.onSingleTapUp(motionEvent);
        }

        public void uef() {
            this.uef = false;
        }
    }

    public gr(Context context) {
        this(context, new uef());
    }

    public boolean oa() {
        return this.uef.oa();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f25856oa.uef(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void uef() {
        this.uef.uef();
    }

    public gr(Context context, uef uefVar) {
        super(context, uefVar);
        this.uef = uefVar;
        this.f25856oa = new com.bytedance.sdk.openadsdk.core.yo.ivm();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.wrv uef(Context context, View view) {
        if (this.f25856oa == null) {
            return new wrv.uef().uef();
        }
        return new wrv.uef().ivm(this.f25856oa.uef).lw(this.f25856oa.f25830oa).moa(this.f25856oa.yo).yo(this.f25856oa.moa).oa(this.f25856oa.lw).uef(this.f25856oa.ivm).uef(af.uef(view)).oa(af.yo(view)).moa(this.f25856oa.xs).lw(this.f25856oa.bcc).ivm(this.f25856oa.cz).uef(this.f25856oa.wrv).oa(com.bytedance.sdk.openadsdk.core.zjm.oa().uef() ? 1 : 2).uef("vessel").uef(af.bcc(context)).yo(af.zjm(context)).oa(af.cz(context)).uef();
    }
}
