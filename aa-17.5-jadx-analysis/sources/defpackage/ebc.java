package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ebc {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = ebo.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static boolean b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean c(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        return bundle == null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle2 == null ? bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    }

    public static final erq d(Map map) {
        Collection collectionValues = map.values();
        collectionValues.getClass();
        sx[] sxVarArr = (sx[]) collectionValues.toArray(new sx[0]);
        return new esd((sx[]) Arrays.copyOf(sxVarArr, sxVarArr.length));
    }

    public static final void e(afhe afheVar, afec afecVar, Map map) {
        afheVar.getClass();
        if (!map.containsKey(afheVar)) {
            map.put(afheVar, new sx(afheVar, afecVar));
            return;
        }
        throw new IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + afheVar.getQualifiedName() + ".");
    }
}
