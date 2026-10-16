package com.bytedance.sdk.component.adexpress.dynamic.animation.uef;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class yo {
    private static volatile yo uef;

    private yo() {
    }

    public static yo uef() {
        if (uef == null) {
            synchronized (yo.class) {
                try {
                    if (uef == null) {
                        uef = new yo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public moa uef(View view, com.bytedance.sdk.component.adexpress.dynamic.moa.uef uefVar) {
        if (uefVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(uefVar.cz())) {
            return new dj(view, uefVar);
        }
        if ("translate".equals(uefVar.cz())) {
            return new wk(view, uefVar);
        }
        if ("ripple".equals(uefVar.cz())) {
            return new bcc(view, uefVar);
        }
        if ("marquee".equals(uefVar.cz())) {
            return new xs(view, uefVar);
        }
        if ("waggle".equals(uefVar.cz())) {
            return new ab(view, uefVar);
        }
        if ("shine".equals(uefVar.cz())) {
            return new wrv(view, uefVar);
        }
        if ("swing".equals(uefVar.cz())) {
            return new dz(view, uefVar);
        }
        if ("fade".equals(uefVar.cz())) {
            return new uef(view, uefVar);
        }
        if ("rubIn".equals(uefVar.cz())) {
            return new zjm(view, uefVar);
        }
        if ("rotate".equals(uefVar.cz())) {
            return new cz(view, uefVar);
        }
        if ("cutIn".equals(uefVar.cz())) {
            return new ivm(view, uefVar);
        }
        if ("stretch".equals(uefVar.cz())) {
            return new cq(view, uefVar);
        }
        if ("bounce".equals(uefVar.cz())) {
            return new lw(view, uefVar);
        }
        return null;
    }
}
