package android.support.v4.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    public static final cy f303a;

    /* renamed from: b, reason: collision with root package name */
    public static final cy f304b;

    /* renamed from: c, reason: collision with root package name */
    public static final cy f305c;

    /* renamed from: d, reason: collision with root package name */
    public static final cy f306d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cy[] f307e;

    static {
        cy cyVar = new cy("REMOVED", 0);
        f303a = cyVar;
        cy cyVar2 = new cy("VISIBLE", 1);
        f304b = cyVar2;
        cy cyVar3 = new cy("GONE", 2);
        f305c = cyVar3;
        cy cyVar4 = new cy("INVISIBLE", 3);
        f306d = cyVar4;
        cy[] cyVarArr = {cyVar, cyVar2, cyVar3, cyVar4};
        f307e = cyVarArr;
        h.d.b.a(cyVarArr);
    }

    public static cy[] values() {
        return (cy[]) f307e.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        h.g.b.x.f(view, "view");
        h.g.b.x.f(viewGroup, TtmlNode.RUBY_CONTAINER);
        if (bv.aM(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (bv.aM(2)) {
                    Log.v("FragmentManager", k.f(viewGroup2, view, "SpecialEffectsController: Removing view ", " from container "));
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", k.e(view, "SpecialEffectsController: Setting view ", " to VISIBLE"));
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (bv.aM(2)) {
                    Log.v("FragmentManager", k.f(viewGroup, view, "SpecialEffectsController: Adding view ", " to Container "));
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (bv.aM(2)) {
                Log.v("FragmentManager", k.e(view, "SpecialEffectsController: Setting view ", " to GONE"));
            }
            view.setVisibility(8);
        } else {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            if (bv.aM(2)) {
                Log.v("FragmentManager", k.e(view, "SpecialEffectsController: Setting view ", " to INVISIBLE"));
            }
            view.setVisibility(4);
        }
    }
}
