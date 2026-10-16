package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2006a {
    public static D a(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 3387192) {
            if (str.equals("none")) {
                return D.f30343d;
            }
            return null;
        }
        if (iHashCode == 729267099) {
            if (str.equals("portrait")) {
                return D.f30341b;
            }
            return null;
        }
        if (iHashCode == 1430647483 && str.equals("landscape")) {
            return D.f30342c;
        }
        return null;
    }

    public static boolean b(t tVar) {
        O o7;
        t tVar2 = (t) AbstractC2012g.f30401a.get();
        if (tVar2 != null && !tVar2.equals(tVar)) {
            return false;
        }
        AbstractC2012g.f30401a = new WeakReference(null);
        ViewParent parent = (tVar2 == null || (o7 = tVar2.f30449c) == null) ? null : o7.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(tVar2.f30449c);
        }
        AbstractC2012g.f30403c = null;
        AbstractC2012g.f30406f = null;
        AbstractC2012g.f30407g = null;
        AbstractC2012g.k = null;
        Activity activity = (Activity) AbstractC2012g.f30402b.get();
        if (activity != null) {
            activity.finish();
        }
        AbstractC2012g.f30402b = new WeakReference(null);
        return true;
    }
}
