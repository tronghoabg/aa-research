package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ecc extends WindowInsetsAnimation$Callback {
    private final ebx a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public ecc(ebx ebxVar) {
        super(ebxVar.f);
        this.d = new HashMap();
        this.a = ebxVar;
    }

    private final lds a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        lds ldsVar = (lds) map.get(windowInsetsAnimation);
        if (ldsVar != null) {
            return ldsVar;
        }
        lds ldsVar2 = new lds(windowInsetsAnimation);
        map.put(windowInsetsAnimation, ldsVar2);
        return ldsVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.d(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.a.b(ecy.q(windowInsets, null), this.b).e();
            }
            WindowInsetsAnimation windowInsetsAnimationM213m = bgl$$ExternalSyntheticApiModelOutline0.m213m(list.get(size));
            lds ldsVarA = a(windowInsetsAnimationM213m);
            ldsVarA.W(windowInsetsAnimationM213m.getFraction());
            this.c.add(ldsVarA);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        ebw ebwVarC = this.a.c(a(windowInsetsAnimation), new ebw(bounds));
        return new WindowInsetsAnimation.Bounds(ebwVarC.a.a(), ebwVarC.b.a());
    }
}
